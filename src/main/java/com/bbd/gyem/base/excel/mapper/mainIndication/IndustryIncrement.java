package com.bbd.gyem.base.excel.mapper.mainIndication;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 工业增加值，对应g1-5
 * 
 * @author luoshouqiang
 *
 *         2016年9月12日
 */
public class IndustryIncrement implements ExcelMapper {

	@ExcelCell(index = 1)
	private Date reportDate;
	@ExcelCell(index = 2)
	private Double increment;
	@ExcelCell(index = 3)
	private Double incrementRation;
	@ExcelCell(index = 4)
	private Double nationIncrement;
	@ExcelCell(index = 5)
	private Double nationIncrementRation;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Double getIncrement() {
		return increment;
	}

	public void setIncrement(Double increment) {
		this.increment = increment;
	}

	public Double getIncrementRation() {
		return incrementRation;
	}

	public void setIncrementRation(Double incrementRation) {
		this.incrementRation = incrementRation;
	}

	public Double getNationIncrement() {
		return nationIncrement;
	}

	public void setNationIncrement(Double nationIncrement) {
		this.nationIncrement = nationIncrement;
	}

	public Double getNationIncrementRation() {
		return nationIncrementRation;
	}

	public void setNationIncrementRation(Double nationIncrementRation) {
		this.nationIncrementRation = nationIncrementRation;
	}



}
