package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 新动能投入，对应excel为g3-2
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class NewMomeInput implements ExcelMapper{
	
	@ExcelCell(index = 1)
	private Date reportQuarter;
	
	@ExcelCell(index = 2)
	private Integer bigData;
	
	@ExcelCell(index = 3)
	private Integer tour;
	
	@ExcelCell(index = 4)
	private Integer medicine;
	
	@ExcelCell(index = 5)
	private Integer finance;

	public Date getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(Date reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public Integer getBigData() {
		return bigData;
	}

	public void setBigData(Integer bigData) {
		this.bigData = bigData;
	}

	public Integer getTour() {
		return tour;
	}

	public void setTour(Integer tour) {
		this.tour = tour;
	}

	public Integer getMedicine() {
		return medicine;
	}

	public void setMedicine(Integer medicine) {
		this.medicine = medicine;
	}

	public Integer getFinance() {
		return finance;
	}

	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	@Override
	public String toString() {
		return "NewMomeInput [reportQuarter=" + reportQuarter + ", bigData="
				+ bigData + ", tour=" + tour + ", medicine=" + medicine
				+ ", finance=" + finance + "]";
	}
	
	
}
