package com.bbd.gyem.base.excel.mapper.econmycheck;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 经济运行检测
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class EconomyRuntimeExCheck implements ExcelMapper{
	
	@ExcelCell(index = 1)
	private Date reportQuarter;
	
	@ExcelCell(index = 2)
	private String countryName;
	
	@ExcelCell(index = 3)
	private Double fixedAssetsInvestment;
	
	@ExcelCell(index = 4)
	private Double fixedAssetsInvestmentRation;
	
	@ExcelCell(index = 5)
	private Integer societyConsume;
	
	@ExcelCell(index = 6)
	private Double societyConsumeRation;
	
	@ExcelCell(index = 7)
	private Integer publicBugetIncome;
	
	@ExcelCell(index = 8)
	private Double publicBugetIncomeRation;
	
	@ExcelCell(index = 9)
	private Integer residentIncome;
	
	@ExcelCell(index = 10)
	private Double residentIncomeRation;

	public Date getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(Date reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Double getFixedAssetsInvestment() {
		return fixedAssetsInvestment;
	}

	public void setFixedAssetsInvestment(Double fixedAssetsInvestment) {
		this.fixedAssetsInvestment = fixedAssetsInvestment;
	}

	public Double getFixedAssetsInvestmentRation() {
		return fixedAssetsInvestmentRation;
	}

	public void setFixedAssetsInvestmentRation(Double fixedAssetsInvestmentRation) {
		this.fixedAssetsInvestmentRation = fixedAssetsInvestmentRation;
	}

	public Integer getSocietyConsume() {
		return societyConsume;
	}

	public void setSocietyConsume(Integer societyConsume) {
		this.societyConsume = societyConsume;
	}

	public Double getSocietyConsumeRation() {
		return societyConsumeRation;
	}

	public void setSocietyConsumeRation(Double societyConsumeRation) {
		this.societyConsumeRation = societyConsumeRation;
	}

	public Integer getPublicBugetIncome() {
		return publicBugetIncome;
	}

	public void setPublicBugetIncome(Integer publicBugetIncome) {
		this.publicBugetIncome = publicBugetIncome;
	}

	public Double getPublicBugetIncomeRation() {
		return publicBugetIncomeRation;
	}

	public void setPublicBugetIncomeRation(Double publicBugetIncomeRation) {
		this.publicBugetIncomeRation = publicBugetIncomeRation;
	}

	public Integer getResidentIncome() {
		return residentIncome;
	}

	public void setResidentIncome(Integer residentIncome) {
		this.residentIncome = residentIncome;
	}

	public Double getResidentIncomeRation() {
		return residentIncomeRation;
	}

	public void setResidentIncomeRation(Double residentIncomeRation) {
		this.residentIncomeRation = residentIncomeRation;
	}

	@Override
	public String toString() {
		return "EconomyRuntimeExCheck [reportQuarter=" + reportQuarter
				+ ", countryName=" + countryName + ", fixedAssetsInvestment="
				+ fixedAssetsInvestment + ", fixedAssetsInvestmentRation="
				+ fixedAssetsInvestmentRation + ", societyConsume="
				+ societyConsume + ", societyConsumeRation="
				+ societyConsumeRation + ", publicBugetIncome="
				+ publicBugetIncome + ", publicBugetIncomeRation="
				+ publicBugetIncomeRation + ", residentIncome="
				+ residentIncome + ", residentIncomeRation="
				+ residentIncomeRation + "]";
	}
	

}
