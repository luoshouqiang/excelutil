package com.bbd.gyem.base.excel.mapper.fixedassets;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 房地产供给,对应g5-3
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class EstateSupply implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Double supply;
	
	@ExcelCell(index = 3)
	private Double consume;
	
	@ExcelCell(index = 4)
	private Double profit;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Double getSupply() {
		return supply;
	}

	public void setSupply(Double supply) {
		this.supply = supply;
	}

	public Double getConsume() {
		return consume;
	}

	public void setConsume(Double consume) {
		this.consume = consume;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}
	
	
}
