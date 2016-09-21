package com.bbd.gyem.base.excel.validtor;

import java.lang.reflect.Field;

import org.apache.poi.ss.usermodel.Cell;

import com.bbd.gyem.base.excel.ExcelLogs;

/**
 * 用于验证单元格的数据
 * @see {@link com.bbd.gyem.util.ExcelUtil.validtor.DefaultValidtor}
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public interface Validator {
	
	public boolean valid(Cell cell, Field field, int cellNum,int rowNum,ExcelLogs logs) ;
}
