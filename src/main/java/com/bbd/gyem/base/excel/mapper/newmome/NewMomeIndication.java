package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 新动能指数,g3-1
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class NewMomeIndication implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Double indication;
	
	@ExcelCell(index = 3)
	private Integer economyTotal;
	
	@ExcelCell(index = 4)
	private Integer empolyeeIncrement;
	
	@ExcelCell(index = 5)
	private Double salary;
	
	@ExcelCell(index = 6)
	private Integer activeCompany;
	
	@ExcelCell(index = 7)
	private Integer capitalSupply;
	
	@ExcelCell(index = 8)
	private Integer creativeTotal;
	
	@ExcelCell(index = 9)
	private Integer creativeConvert;

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

	public Integer getEconomyTotal() {
		return economyTotal;
	}

	public void setEconomyTotal(Integer economyTotal) {
		this.economyTotal = economyTotal;
	}

	public Integer getEmpolyeeIncrement() {
		return empolyeeIncrement;
	}

	public void setEmpolyeeIncrement(Integer empolyeeIncrement) {
		this.empolyeeIncrement = empolyeeIncrement;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getActiveCompany() {
		return activeCompany;
	}

	public void setActiveCompany(Integer activeCompany) {
		this.activeCompany = activeCompany;
	}

	public Integer getCapitalSupply() {
		return capitalSupply;
	}

	public void setCapitalSupply(Integer capitalSupply) {
		this.capitalSupply = capitalSupply;
	}

	public Integer getCreativeTotal() {
		return creativeTotal;
	}

	public void setCreativeTotal(Integer creativeTotal) {
		this.creativeTotal = creativeTotal;
	}

	public Integer getCreativeConvert() {
		return creativeConvert;
	}

	public void setCreativeConvert(Integer creativeConvert) {
		this.creativeConvert = creativeConvert;
	}

	@Override
	public String toString() {
		return "NewMomeIndication [reportDate=" + reportDate + ", indication="
				+ indication + ", economyTotal=" + economyTotal
				+ ", empolyeeIncrement=" + empolyeeIncrement + ", salary="
				+ salary + ", activeCompany=" + activeCompany
				+ ", capitalSupply=" + capitalSupply + ", creativeTotal="
				+ creativeTotal + ", creativeConvert=" + creativeConvert + "]";
	}


	
	
}
