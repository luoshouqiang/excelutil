package com.bbd.gyem.base.excel.mapper.vipindustry;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 重点行业产能，对应g4-4
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class VIPIndustryProduction implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Integer agriculture;
	
	@ExcelCell(index = 3)
	private Integer industry;
	
	@ExcelCell(index = 4)
	private Integer building;
	
	//批发和零售投入
	@ExcelCell(index = 5)
	private Integer wholesale;
	
	@ExcelCell(index = 6)
	private Integer traffic;
	
	@ExcelCell(index = 7)
	private Integer restaurant;	
	
	@ExcelCell(index = 8)
	private Integer finance;
	//房地产
	@ExcelCell(index = 9)
	private Integer estate;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getAgriculture() {
		return agriculture;
	}

	public void setAgriculture(Integer agriculture) {
		this.agriculture = agriculture;
	}

	public Integer getIndustry() {
		return industry;
	}

	public void setIndustry(Integer industry) {
		this.industry = industry;
	}

	public Integer getBuilding() {
		return building;
	}

	public void setBuilding(Integer building) {
		this.building = building;
	}

	public Integer getWholesale() {
		return wholesale;
	}

	public void setWholesale(Integer wholesale) {
		this.wholesale = wholesale;
	}

	public Integer getTraffic() {
		return traffic;
	}

	public void setTraffic(Integer traffic) {
		this.traffic = traffic;
	}

	public Integer getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Integer restaurant) {
		this.restaurant = restaurant;
	}

	public Integer getFinance() {
		return finance;
	}

	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	public Integer getEstate() {
		return estate;
	}

	public void setEstate(Integer estate) {
		this.estate = estate;
	}
	
	
}
