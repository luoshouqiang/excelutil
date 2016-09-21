package com.bbd.gyem.util.ExcelUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.ExcelCell.Valid;

public class MatherModel {
	
	public MatherModel(){
		
	}
	public MatherModel(String name){
		this.name=name;
	}
	@ExcelCell(index=1,valid=@Valid(regex="[2]\\d{3}[Q][1-4]"))
	private  String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		String pattern="[2]\\d{3}[Q][1-4]";
		 Pattern r = Pattern.compile(pattern);
		 Matcher m=r.matcher("2016Q5");
		 System.out.println(m.matches());
	}
}
