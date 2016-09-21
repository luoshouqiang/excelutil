package com.bbd.gyem.base.excel.mapper.other;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 专利信息，对应g7-3
 * 
 * @author luoshouqiang
 *
 *         2016年9月13日
 */
public class PatenInfo implements ExcelMapper {

	@ExcelCell(index = 1)
	private String companyName;

	@ExcelCell(index = 2)
	private String patentNumber;
	
	@ExcelCell(index = 3)
	private String address;
	
	@ExcelCell(index = 4)
	private String note;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPatentNumber() {
		return patentNumber;
	}

	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "PatenVO [companyName=" + companyName + ", patentNumber="
				+ patentNumber + ", address=" + address + ", note=" + note
				+ "]";
	}

	
}
