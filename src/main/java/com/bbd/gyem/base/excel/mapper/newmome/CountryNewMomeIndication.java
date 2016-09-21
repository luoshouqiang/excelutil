package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 新动能指标
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class CountryNewMomeIndication implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private String countryName;
	
	@ExcelCell(index = 3)
	private Double indication;	

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Double getIndication() {
		return indication;
	}

	public void setIndication(Double indication) {
		this.indication = indication;
	}
	
}
