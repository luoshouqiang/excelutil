package com.bbd.gyem.base.excel.mapper.mainIndication;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 经济运行检测
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class EconomyRuntimeCheck implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private String countryName;
	
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
		return "EconomyRuntimeCheck [reportDate=" + reportDate
				+ ", countryName=" + countryName + ", economyTotal="
				+ economyTotal + ", empolyeeIncrement=" + empolyeeIncrement
				+ ", salary=" + salary + ", activeCompany=" + activeCompany
				+ ", capitalSupply=" + capitalSupply + ", creativeTotal="
				+ creativeTotal + ", creativeConvert=" + creativeConvert + "]";
	}
	
	
	
}
