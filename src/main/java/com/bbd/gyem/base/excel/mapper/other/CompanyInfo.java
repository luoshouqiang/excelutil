package com.bbd.gyem.base.excel.mapper.other;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 公司注册信息,对应 g7-2
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class CompanyInfo implements ExcelMapper{
	

	@ExcelCell(index = 1)
	private String companyName;
	
	@ExcelCell(index = 2)
	private Date reportDate;
	
	@ExcelCell(index = 3)
	private String position;
	
	@ExcelCell(index = 4)
	private String status;
	
	@ExcelCell(index = 5)
	private Integer registerMoney;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getRegisterMoney() {
		return registerMoney;
	}

	public void setRegisterMoney(Integer registerMoney) {
		this.registerMoney = registerMoney;
	}

	@Override
	public String toString() {
		return "CompanyVO [companyName=" + companyName + ", reportDate="
				+ reportDate + ", position=" + position + ", status=" + status
				+ ", registerMoney=" + registerMoney + "]";
	}
	
	
}
