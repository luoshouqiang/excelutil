package com.bbd.gyem.base.excel.mapper.mainIndication;


import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 主要经济指标
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class MainEconmyIndication implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private String reportQuarter;
	
	@ExcelCell(index = 2)
	private Integer gdp;
	
	@ExcelCell(index = 3)
	private Integer gdpRation;
	
	@ExcelCell(index = 4)
	private Integer industryIncrement;
	
	@ExcelCell(index = 5)
	private Double industryIncrementRation;
	
	@ExcelCell(index = 6)
	private Double fixedAssetsInvestment;
	
	@ExcelCell(index = 7)
	private Double fixedAssetsInvestmentRation;
	
	@ExcelCell(index = 8)
	private Integer societyConsume;
	
	@ExcelCell(index = 9)
	private Double societyConsumeRation;
	
	@ExcelCell(index = 10)
	private Integer publicBugetIncome;
	
	@ExcelCell(index = 11)
	private Double publicBugetIncomeRation;
	
	@ExcelCell(index = 12)
	private Integer residentIncome;
	
	@ExcelCell(index = 13)
	private Double residentIncomeRation;

	public String getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(String reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public Integer getGdp() {
		return gdp;
	}

	public void setGdp(Integer gdp) {
		this.gdp = gdp;
	}

	public Integer getGdpRation() {
		return gdpRation;
	}

	public void setGdpRation(Integer gdpRation) {
		this.gdpRation = gdpRation;
	}

	public Integer getIndustryIncrement() {
		return industryIncrement;
	}

	public void setIndustryIncrement(Integer industryIncrement) {
		this.industryIncrement = industryIncrement;
	}

	public Double getIndustryIncrementRation() {
		return industryIncrementRation;
	}

	public void setIndustryIncrementRation(Double industryIncrementRation) {
		this.industryIncrementRation = industryIncrementRation;
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
		return "MainEconmyIndication [reportQuarter=" + reportQuarter
				+ ", gdp=" + gdp + ", gdpRation=" + gdpRation
				+ ", industryIncrement=" + industryIncrement
				+ ", industryIncrementRation=" + industryIncrementRation
				+ ", fixedAssetsInvestment=" + fixedAssetsInvestment
				+ ", fixedAssetsInvestmentRation="
				+ fixedAssetsInvestmentRation + ", societyConsume="
				+ societyConsume + ", societyConsumeRation="
				+ societyConsumeRation + ", publicBugetIncome="
				+ publicBugetIncome + ", publicBugetIncomeRation="
				+ publicBugetIncomeRation + ", residentIncome="
				+ residentIncome + ", residentIncomeRation="
				+ residentIncomeRation + "]";
	}
	
	
}
