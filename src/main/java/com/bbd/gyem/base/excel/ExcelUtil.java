package com.bbd.gyem.base.excel;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.comparators.ComparableComparator;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbd.gyem.base.excel.exception.ValidException;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;
import com.bbd.gyem.base.excel.validtor.DefaultValidtor;
import com.bbd.gyem.base.excel.validtor.Validator;

/**
 * The <code>ExcelUtil</code> 与 {@link ExcelCell}搭配使用
 * 
 * @author luoshouqiang
 *
 *         2016年9月12日
 */
public class ExcelUtil {

	private static Logger LG = LoggerFactory.getLogger(ExcelUtil.class);

	private static Validator validtor = new DefaultValidtor();

	private static String datePattern = "yyyy/MM/dd";

	/**
	 * 获取单元格值
	 *
	 * @param cell
	 * @return
	 */
	private static Object getCellValue(Cell cell) {
		if (cell == null
				|| (cell.getCellType() == Cell.CELL_TYPE_STRING && StringUtils
						.isBlank(cell.getStringCellValue()))) {
			return null;
		}
		int cellType = cell.getCellType();
		switch (cellType) {
		case Cell.CELL_TYPE_BLANK:
			return null;
		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();
		case Cell.CELL_TYPE_ERROR:
			return cell.getErrorCellValue();
		case Cell.CELL_TYPE_FORMULA:
			return cell.getNumericCellValue();
		case Cell.CELL_TYPE_NUMERIC:
			return cell.getNumericCellValue();
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();
		default:
			return null;
		}
	}

	/**
	 * 利用JAVA的反射机制，将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上<br>
	 * 用于单个sheet
	 *
	 * @param <T>
	 * @param headers
	 *            表格属性列名数组
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象。此方法支持的
	 *            javabean属性的数据类型有基本数据类型及String,Date,String[],Double[]
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 */
	public static <T> void exportExcel(String[] headers, Collection<T> dataset,
			OutputStream out) {
		exportExcel(headers, dataset, out, null);
	}

	/**
	 * 利用JAVA的反射机制，将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上<br>
	 * 用于单个sheet
	 *
	 * @param <T>
	 * @param headers
	 *            表格属性列名数组
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象。此方法支持的
	 *            javabean属性的数据类型有基本数据类型及String,Date,String[],Double[]
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyy-MM-dd"
	 */
	public static <T> void exportExcel(String[] headers, Collection<T> dataset,
			OutputStream out, String pattern) {
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet();

		write2Sheet(sheet, headers, dataset, pattern);
		try {
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
			LG.error(e.toString(), e);
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void exportExcel(String[][] datalist, OutputStream out) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		try {
			// 声明一个工作薄
			// 生成一个表格
			HSSFSheet sheet = workbook.createSheet();

			for (int i = 0; i < datalist.length; i++) {
				String[] r = datalist[i];
				HSSFRow row = sheet.createRow(i);
				for (int j = 0; j < r.length; j++) {
					HSSFCell cell = row.createCell(j);
					// cell max length 32767
					if (r[j].length() > 32767) {
						r[j] = "--此字段过长(超过32767),已被截断--" + r[j];
						r[j] = r[j].substring(0, 32766);
					}
					cell.setCellValue(r[j]);
				}
			}
			// 自动列宽
			if (datalist.length > 0) {
				int colcount = datalist[0].length;
				for (int i = 0; i < colcount; i++) {
					sheet.autoSizeColumn(i);
				}
			}
			workbook.write(out);
		} catch (IOException e) {
			LG.error(e.toString(), e);
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 利用JAVA的反射机制，将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上<br>
	 * 用于多个sheet
	 *
	 * @param <T>
	 * @param sheets
	 *            {@link ExcelSheet}的集合
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 */
	public static <T> void exportExcel(List<ExcelSheet<T>> sheets,
			OutputStream out) {
		exportExcel(sheets, out, datePattern);
	}

	/**
	 * 利用JAVA的反射机制，将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出到指定IO设备上<br>
	 * 用于多个sheet
	 *
	 * @param <T>
	 * @param sheets
	 *            {@link ExcelSheet}的集合
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyy-MM-dd"
	 */
	public static <T> void exportExcel(List<ExcelSheet<T>> sheets,
			OutputStream out, String pattern) {
		if (CollectionUtils.isEmpty(sheets)) {
			return;
		}
		// 声明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		for (ExcelSheet<T> sheet : sheets) {
			// 生成一个表格
			HSSFSheet hssfSheet = workbook.createSheet(sheet.getSheetName());
			write2Sheet(hssfSheet, sheet.getHeaders(), sheet.getDataset(),
					pattern);
		}
		try {
			workbook.write(out);
		} catch (IOException e) {
			LG.error(e.toString(), e);
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 每个sheet的写入
	 *
	 * @param sheet
	 *            页签
	 * @param headers
	 *            表头
	 * @param dataset
	 *            数据集合
	 * @param pattern
	 *            日期格式
	 */
	private static <T> void write2Sheet(HSSFSheet sheet, String[] headers,
			Collection<T> dataset, String pattern) {
		// 产生表格标题行
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text);
		}

		// 遍历集合数据，产生数据行
		Iterator<T> it = dataset.iterator();
		int index = 0;
		while (it.hasNext()) {
			index++;
			row = sheet.createRow(index);
			T t = (T) it.next();
			try {
				if (t instanceof Map) {
					@SuppressWarnings("unchecked")
					Map<String, Object> map = (Map<String, Object>) t;
					int cellNum = 0;
					for (String k : headers) {
						if (map.containsKey(k) == false) {
							LG.error("Map 中 不存在 key [" + k + "]");
							continue;
						}
						Object value = map.get(k);
						HSSFCell cell = row.createCell(cellNum);
						cell.setCellValue(String.valueOf(value));
						cellNum++;
					}
				} else {
					List<FieldForSortting> fields = sortFieldByAnno(t
							.getClass());
					int cellNum = 0;
					HSSFCellStyle cellStyle = sheet.getWorkbook()
							.createCellStyle();
					HSSFDataFormat format = sheet.getWorkbook()
							.createDataFormat();
					for (int i = 0; i < fields.size(); i++) {
						HSSFCell cell = row.createCell(cellNum);
						Field field = fields.get(i).getField();
						field.setAccessible(true);
						Object value = field.get(t);
						String textValue = null;						
						if (value instanceof Integer) {
							cellStyle = sheet.getWorkbook()
									.createCellStyle();
							cellStyle.setDataFormat((short)1);
							int intValue = (Integer) value;
							cell.setCellValue(intValue);
							cell.setCellStyle(cellStyle);
						} else if (value instanceof Float) {
							float fValue = (Float) value;
							cell.setCellValue(fValue);
						} else if (value instanceof Double) {
							cellStyle = sheet.getWorkbook()
									.createCellStyle();
							cellStyle.setDataFormat((short)2);
							double dValue = (Double) value;
							cell.setCellValue(dValue);
							cell.setCellStyle(cellStyle);
						} else if (value instanceof Long) {
							long longValue = (Long) value;
							cell.setCellValue(longValue);
						} else if (value instanceof Boolean) {
							boolean bValue = (Boolean) value;
							cell.setCellValue(bValue);
						} else if (value instanceof Date) {
							cellStyle = sheet.getWorkbook()
									.createCellStyle();
							cellStyle.setDataFormat(format
									.getFormat(pattern));
							cell.setCellValue((Date)value);
							cell.setCellStyle(cellStyle);
						} else if (value instanceof String[]) {
							String[] strArr = (String[]) value;
							for (int j = 0; j < strArr.length; j++) {
								String str = strArr[j];
								cell.setCellValue(str);
								if (j != strArr.length - 1) {
									cellNum++;
									cell = row.createCell(cellNum);
								}
							}
						} else if (value instanceof Double[]) {
							Double[] douArr = (Double[]) value;
							for (int j = 0; j < douArr.length; j++) {
								Double val = douArr[j];
								// 资料不为空则set Value
								if (val != null) {
									cell.setCellValue(val);
								}

								if (j != douArr.length - 1) {
									cellNum++;
									cell = row.createCell(cellNum);
								}
							}
						} else {
							// 其它数据类型都当作字符串简单处理
							String empty = StringUtils.EMPTY;
							ExcelCell anno = field
									.getAnnotation(ExcelCell.class);
							if (anno != null) {
								empty = anno.defaultValue();
							}
							textValue = value == null ? empty : value
									.toString();
						}
						if (textValue != null) {
							HSSFRichTextString richString = new HSSFRichTextString(
									textValue);
							cell.setCellValue(richString);
						}

						cellNum++;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				LG.error(e.toString(), e);
			}
		}
		// 设定自动宽度
		for (int i = 0; i < headers.length; i++) {
			sheet.autoSizeColumn(i);
		}
	}

	/**
	 * 把Excel的数据封装成voList
	 *
	 * @param clazz
	 *            vo的Class
	 * @param inputStream
	 *            excel输入流
	 * @param pattern
	 *            如果有时间数据，设定输入格式。默认为"yyy-MM-dd"
	 * @param logs
	 *            错误log集合
	 * @param arrayCount
	 *            如果vo中有数组类型,那就按照index顺序,把数组应该有几个值写上.
	 * @return voList
	 * @throws RuntimeException
	 */
	@SuppressWarnings("unchecked")
	public static <T> Collection<T> importExcel(Class<T> clazz, File inputFile,
			ExcelLogs logs, Integer... arrayCount) {
		if (!ExcelMapper.class.isAssignableFrom(clazz)) {
			throw new RuntimeException("解析的类必须要实现ExcelMapper接口");
		}
		Workbook workBook = null;
		try {
			workBook = WorkbookFactory.create(inputFile);
		} catch (IOException | EncryptedDocumentException
				| InvalidFormatException e) {
			e.printStackTrace();
			LG.error(e.toString(), e);
		}
		List<T> list = new ArrayList<T>();
		Sheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.rowIterator();
		try {
//			List<ExcelLog> logList = new ArrayList<ExcelLog>();
			// Map<title,index>
			Map<String, Integer> titleMap = new HashMap<>();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// 解析表头
				if (row.getRowNum() == 0) {
					if (clazz == Map.class) {
						// 解析map用的key,就是excel标题行
						Iterator<Cell> cellIterator = row.cellIterator();
						Integer index = 0;
						while (cellIterator.hasNext()) {
							String value = cellIterator.next()
									.getStringCellValue();
							titleMap.put(value, index);
							index++;
						}
					}
					continue;
				}
				// 整行都空，就跳过
				boolean allRowIsNull = true;
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Object cellValue = getCellValue(cellIterator.next());
					if (cellValue != null) {
						allRowIsNull = false;
						break;
					}
				}
				if (allRowIsNull) {
					LG.warn("Excel row " + row.getRowNum()
							+ " all row value is null!");
					continue;
				}
				T t = null;
				StringBuilder log = new StringBuilder();
				if (clazz == Map.class) {
					Map<String, Object> map = new HashMap<String, Object>();
					for (String k : titleMap.keySet()) {
						Integer index = titleMap.get(k);
						String value = row.getCell(index).getStringCellValue();
						map.put(k, value);
					}
					list.add((T) map);

				} else {
					t = clazz.newInstance();
					int arrayIndex = 0;// 标识当前第几个数组了
					int cellIndex = 0;// 标识当前读到这一行的第几个cell了
					List<FieldForSortting> fields = sortFieldByAnno(clazz);
					for (FieldForSortting ffs : fields) {
						Field field = ffs.getField();
						field.setAccessible(true);
						// 处理field为数组的情况
						if (field.getType().isArray()) {
							parseArrayCell(logs, row, t, log, arrayIndex,
									cellIndex, field, arrayCount);
						} else {
							Cell cell = row.getCell(cellIndex);
							Object value = getCellValue(cell);
							if (validateCell(cell, field, cellIndex+1,
									row.getRowNum()+1, logs)) {
								setValue(field, value, t, cell);
							}

							cellIndex++;
						}
					}
					list.add(t);
//					logList.add(new ExcelLog(t, log.toString(),
//							row.getRowNum() + 1));
				}
			}
//			logs.setLogList(logList);
		} catch (InstantiationException e) {
			throw new RuntimeException(MessageFormat.format(
					"can not instance class:{0}", clazz.getSimpleName()), e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(MessageFormat.format(
					"can not instance class:{0}", clazz.getSimpleName()), e);
		}
		return list;
	}

	private static <T> void setValue(Field field, Object value, T t, Cell cell)
			throws IllegalArgumentException, IllegalAccessException {
		if (value == null) {
			return;
		}
		Class<?> clazz = field.getType();
		if (clazz == Integer.class || clazz == int.class) {
			double doubleValue = (Double) value;
			field.set(t, (int) doubleValue);
		} else if (clazz == Double.class || clazz == double.class) {
			field.set(t, (Double) value);
		} else if (clazz == Long.class || clazz == long.class) {
			double doubleValue = (Double) value;
			field.set(t, (long) doubleValue);
		} else if (clazz == Date.class) {
			if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
					&& DateUtil.isCellDateFormatted(cell)) {
				Date dateValue = DateUtil.getJavaDate((Double) value);
				field.set(t, dateValue);
			}
		} else {
			field.set(t, value);
		}

	}

	/**
	 * 解析数组单元
	 * 
	 * @param logs
	 * @param row
	 * @param t
	 * @param log
	 * @param arrayIndex
	 * @param cellIndex
	 * @param field
	 * @param arrayCount
	 * @throws IllegalAccessException
	 */
	private static <T> void parseArrayCell(ExcelLogs logs, Row row, T t,
			StringBuilder log, int arrayIndex, int cellIndex, Field field,
			Integer... arrayCount) throws IllegalAccessException {
		Integer count = arrayCount[arrayIndex];
		Object[] value = null;
		if (field.getType().equals(String[].class)) {
			value = new String[count];
		} else {
			// 目前只支持String[]和Double[]
			value = new Double[count];
		}
		for (int i = 0; i < count; i++) {
			Cell cell = row.getCell(cellIndex);
			if (validateCell(cell, field, cellIndex+1, row.getRowNum()+1, logs)) {
				field.set(t, value);
			}

			cellIndex++;
		}

		arrayIndex++;
	}

	/**
	 * 驗證Cell類型是否正確
	 *
	 * @param cell
	 *            cell單元格
	 * @param field
	 *            欄位
	 * @param cellNum
	 *            第幾個欄位,用於errMsg
	 * @return
	 * @throws ValidException
	 */
	private static boolean validateCell(Cell cell, Field field, int cellNum,
			int rowNum, ExcelLogs logs) {

		return validtor.valid(cell, field, cellNum, rowNum, logs);
	}

	/**
	 * 根据annotation的seq排序后的栏位
	 *
	 * @param clazz
	 * @return
	 */
	private static List<FieldForSortting> sortFieldByAnno(Class<?> clazz) {
		Field[] fieldsArr = clazz.getDeclaredFields();
		List<FieldForSortting> fields = new ArrayList<FieldForSortting>();
		List<FieldForSortting> annoNullFields = new ArrayList<FieldForSortting>();
		for (Field field : fieldsArr) {
			ExcelCell ec = field.getAnnotation(ExcelCell.class);
			if (ec == null) {
				// 没有ExcelCell Annotation 视为不汇入
				continue;
			}
			int id = ec.index();
			fields.add(new FieldForSortting(field, id));
		}
		fields.addAll(annoNullFields);
		sortByProperties(fields, true, false, "index");
		return fields;
	}

	@SuppressWarnings("unchecked")
	private static void sortByProperties(List<? extends Object> list,
			boolean isNullHigh, boolean isReversed, String... props) {
		if (CollectionUtils.isNotEmpty(list)) {
			Comparator<?> typeComp = ComparableComparator.getInstance();
			if (isNullHigh == true) {
				typeComp = ComparatorUtils.nullHighComparator(typeComp);
			} else {
				typeComp = ComparatorUtils.nullLowComparator(typeComp);
			}
			if (isReversed) {
				typeComp = ComparatorUtils.reversedComparator(typeComp);
			}

			List<Object> sortCols = new ArrayList<Object>();

			if (props != null) {
				for (String prop : props) {
					sortCols.add(new BeanComparator(prop, typeComp));
				}
			}
			if (sortCols.size() > 0) {
				Comparator<Object> sortChain = new ComparatorChain(sortCols);
				Collections.sort(list, sortChain);
			}
		}
	}

}
