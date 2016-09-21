package com.bbd.gyem.base.excel;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import com.bbd.gyem.base.excel.helper.BeanConvert;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;
import com.bbd.gyem.base.excel.mapper.mainIndication.GdpAndRation;

public class ExcelService {
	@Resource
	BeanConvert beanConvert;
	
	public void batchFile(Set<File> excelFileList) {
		Map<String,ExcelLogs> errorFileMap=new HashMap<>();
		List<ExcelFileMapper> sortedFileList = checkAndSort(excelFileList);
		for (ExcelFileMapper sortFile : sortedFileList) {
			Class<? extends ExcelMapper> clazz = sortFile.getVoMapper()
					.getVoClass();
			ExcelLogs errorLogs = new ExcelLogs();
			Collection<? extends ExcelMapper> modelList = ExcelUtil
					.importExcel(clazz, sortFile.getFile(), errorLogs);
			if (errorLogs.getHasError()) {
				errorFileMap.put(sortFile.getFile().getName(), errorLogs);
			}else{
				
			}
		}
	}
	
	public void insertGdpAndRation(Collection<GdpAndRation> modelList){
		if(CollectionUtils.isEmpty(modelList)){
			return;
		}
		for(GdpAndRation gdpAndRation:modelList){
			
		}
	}

	public List<ExcelFileMapper> checkAndSort(Set<File> excelFileList) {
		if (excelFileList.isEmpty()) {
			throw new IllegalArgumentException("没有上传有文件");
		}
		List<ExcelFileMapper> sortFileList = new ArrayList<>();
		for (File file : excelFileList) {
			ClassSortMapper vomapper = ExcelFileHolder.getSortIndex(file.getName());
			if (vomapper == null) {
				throw new IllegalArgumentException(file.getName() + "不被支持的文件名");
			} else {
				sortFileList.add(new ExcelFileMapper(file, vomapper));
			}
		}

		sortFileList.sort(new Comparator<ExcelFileMapper>() {

			@Override
			public int compare(ExcelFileMapper o1, ExcelFileMapper o2) {
				int index1 = o1.getVoMapper().getSortIndex();
				int index2 = o2.getVoMapper().getSortIndex();
				if (index1 > index2) {
					return 1;
				} else if (index1 < index2) {
					return -1;
				}
				return 0;
			}
		});
		return sortFileList;
	}

}
