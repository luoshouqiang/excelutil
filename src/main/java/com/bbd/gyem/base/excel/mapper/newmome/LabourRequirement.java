package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 劳动力需求变化
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class LabourRequirement implements ExcelMapper{
	
	@ExcelCell(index = 1)
	private Date reportQuarter;
	
	@ExcelCell(index = 2)
	private Integer highNumber;
	
	@ExcelCell(index = 3)
	private Integer nationNumber;
	
	@ExcelCell(index = 4)
	private Integer middNumber;
	
	@ExcelCell(index = 5)
	private Integer nationMiddNumber;
	
	@ExcelCell(index = 6)
	private Integer lowNumber;
	
	@ExcelCell(index = 7)
	private Integer nationLowNumber;

	public Date getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(Date reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public Integer getHighNumber() {
		return highNumber;
	}

	public void setHighNumber(Integer highNumber) {
		this.highNumber = highNumber;
	}

	public Integer getNationNumber() {
		return nationNumber;
	}

	public void setNationNumber(Integer nationNumber) {
		this.nationNumber = nationNumber;
	}

	public Integer getMiddNumber() {
		return middNumber;
	}

	public void setMiddNumber(Integer middNumber) {
		this.middNumber = middNumber;
	}

	public Integer getNationMiddNumber() {
		return nationMiddNumber;
	}

	public void setNationMiddNumber(Integer nationMiddNumber) {
		this.nationMiddNumber = nationMiddNumber;
	}

	public Integer getLowNumber() {
		return lowNumber;
	}

	public void setLowNumber(Integer lowNumber) {
		this.lowNumber = lowNumber;
	}

	public Integer getNationLowNumber() {
		return nationLowNumber;
	}

	public void setNationLowNumber(Integer nationLowNumber) {
		this.nationLowNumber = nationLowNumber;
	}

	@Override
	public String toString() {
		return "LabourRequirement [reportQuarter=" + reportQuarter
				+ ", highNumber=" + highNumber + ", nationNumber="
				+ nationNumber + ", middNumber=" + middNumber
				+ ", nationMiddNumber=" + nationMiddNumber + ", lowNumber="
				+ lowNumber + ", nationLowNumber=" + nationLowNumber + "]";
	}
	
}
