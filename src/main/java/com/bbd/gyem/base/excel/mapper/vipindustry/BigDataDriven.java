package com.bbd.gyem.base.excel.mapper.vipindustry;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 大数据经济带动,G4-1
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class BigDataDriven implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Integer employee;
	
	@ExcelCell(index = 3)
	private Integer investment;
	
	@ExcelCell(index = 4)
	private Integer creative;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	public Integer getInvestment() {
		return investment;
	}

	public void setInvestment(Integer investment) {
		this.investment = investment;
	}

	public Integer getCreative() {
		return creative;
	}

	public void setCreative(Integer creative) {
		this.creative = creative;
	}

	@Override
	public String toString() {
		return "BigDataDriven [reportDate=" + reportDate + ", employee="
				+ employee + ", investment=" + investment + ", creative="
				+ creative + ", getReportDate()=" + getReportDate()
				+ ", getEmployee()=" + getEmployee() + ", getInvestment()="
				+ getInvestment() + ", getCreative()=" + getCreative()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
