package com.bbd.gyem.base.excel.mapper.vipindustry;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 生产要素占比
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class KeyElement implements ExcelMapper{
		
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Integer agricultureInput;
	
	@ExcelCell(index = 3)
	private Integer industryInput;
	
	@ExcelCell(index = 4)
	private Integer buildingInput;
	
	//批发和零售投入
	@ExcelCell(index = 5)
	private Integer wholesaleInput;
	
	@ExcelCell(index = 6)
	private Integer trafficInput;
	
	@ExcelCell(index = 7)
	private Integer restaurantInput;	
	
	@ExcelCell(index = 8)
	private Integer financeInput;
	
	@ExcelCell(index = 9)
	private Integer estateInput;
	
	
	@ExcelCell(index = 10)
	private Integer agricultureOutput;
	
	@ExcelCell(index = 11)
	private Integer industryOutput;
	
	@ExcelCell(index = 12)
	private Integer buildingOutput;
	
	//批发和零售投入
	@ExcelCell(index = 13)
	private Integer wholesaleOutput;
	
	@ExcelCell(index = 14)
	private Integer trafficOutput;
	
	@ExcelCell(index = 15)
	private Integer restaurantOutput;	
	
	@ExcelCell(index = 16)
	private Integer financeOutput;
	
	@ExcelCell(index = 17)
	private Integer estateOutput;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getAgricultureInput() {
		return agricultureInput;
	}

	public void setAgricultureInput(Integer agricultureInput) {
		this.agricultureInput = agricultureInput;
	}

	public Integer getIndustryInput() {
		return industryInput;
	}

	public void setIndustryInput(Integer industryInput) {
		this.industryInput = industryInput;
	}

	public Integer getBuildingInput() {
		return buildingInput;
	}

	public void setBuildingInput(Integer buildingInput) {
		this.buildingInput = buildingInput;
	}

	public Integer getWholesaleInput() {
		return wholesaleInput;
	}

	public void setWholesaleInput(Integer wholesaleInput) {
		this.wholesaleInput = wholesaleInput;
	}

	public Integer getTrafficInput() {
		return trafficInput;
	}

	public void setTrafficInput(Integer trafficInput) {
		this.trafficInput = trafficInput;
	}

	public Integer getRestaurantInput() {
		return restaurantInput;
	}

	public void setRestaurantInput(Integer restaurantInput) {
		this.restaurantInput = restaurantInput;
	}

	public Integer getFinanceInput() {
		return financeInput;
	}

	public void setFinanceInput(Integer financeInput) {
		this.financeInput = financeInput;
	}

	public Integer getEstateInput() {
		return estateInput;
	}

	public void setEstateInput(Integer estateInput) {
		this.estateInput = estateInput;
	}

	public Integer getAgricultureOutput() {
		return agricultureOutput;
	}

	public void setAgricultureOutput(Integer agricultureOutput) {
		this.agricultureOutput = agricultureOutput;
	}

	public Integer getIndustryOutput() {
		return industryOutput;
	}

	public void setIndustryOutput(Integer industryOutput) {
		this.industryOutput = industryOutput;
	}

	public Integer getBuildingOutput() {
		return buildingOutput;
	}

	public void setBuildingOutput(Integer buildingOutput) {
		this.buildingOutput = buildingOutput;
	}

	public Integer getWholesaleOutput() {
		return wholesaleOutput;
	}

	public void setWholesaleOutput(Integer wholesaleOutput) {
		this.wholesaleOutput = wholesaleOutput;
	}

	public Integer getTrafficOutput() {
		return trafficOutput;
	}

	public void setTrafficOutput(Integer trafficOutput) {
		this.trafficOutput = trafficOutput;
	}

	public Integer getRestaurantOutput() {
		return restaurantOutput;
	}

	public void setRestaurantOutput(Integer restaurantOutput) {
		this.restaurantOutput = restaurantOutput;
	}

	public Integer getFinanceOutput() {
		return financeOutput;
	}

	public void setFinanceOutput(Integer financeOutput) {
		this.financeOutput = financeOutput;
	}

	public Integer getEstateOutput() {
		return estateOutput;
	}

	public void setEstateOutput(Integer estateOutput) {
		this.estateOutput = estateOutput;
	}
	
	
	
	
}
