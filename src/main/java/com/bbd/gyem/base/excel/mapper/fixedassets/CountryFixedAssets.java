package com.bbd.gyem.base.excel.mapper.fixedassets;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 区县固定投资比例，对应g5-2
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class CountryFixedAssets implements ExcelMapper{
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private String countryName;
	
	//固定投资分析
	@ExcelCell(index = 2)
	private Integer fixedAssets;

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

	public Integer getFixedAssets() {
		return fixedAssets;
	}

	public void setFixedAssets(Integer fixedAssets) {
		this.fixedAssets = fixedAssets;
	}
	
}
