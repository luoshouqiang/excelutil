package com.bbd.gyem.util.ExcelUtil;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;

public class Test {
 public static void main(String[] args) {
//	List<String> lists= HSSFDataFormat.getBuiltinFormats();
//	for(String s:lists){
//		System.out.println(s);
//	}
	System.out.println(HSSFDataFormat.getBuiltinFormat((short)1));
}
}
