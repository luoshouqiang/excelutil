package com.bbd.gyem.base.excel.mapper.fixedassets;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 固定投资指数，对应g5-1
 * 
 * @author luoshouqiang
 *
 *         2016年9月13日
 */
public class FixedAssetsIndication implements ExcelMapper {
	@ExcelCell(index = 1)
	private Date reportDate;
	@ExcelCell(index = 2)
	private Double indication;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Double getIndication() {
		return indication;
	}

	public void setIndication(Double indication) {
		this.indication = indication;
	}

}
