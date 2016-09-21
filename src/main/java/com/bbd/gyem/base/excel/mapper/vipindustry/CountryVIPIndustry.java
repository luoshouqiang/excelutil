package com.bbd.gyem.base.excel.mapper.vipindustry;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 重点行业区域分布,对应g4-3
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class CountryVIPIndustry implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private String countryName;
	
	@ExcelCell(index = 3)
	private Integer agriculture;
	
	@ExcelCell(index = 4)
	private Integer industry;
	
	@ExcelCell(index = 5)
	private Integer building;
	
	//批发和零售投入
	@ExcelCell(index = 6)
	private Integer wholesale;
	
	@ExcelCell(index = 7)
	private Integer traffic;
	
	@ExcelCell(index = 8)
	private Integer restaurant;	
	
	@ExcelCell(index = 9)
	private Integer finance;
	//房地产
	@ExcelCell(index = 10)
	private Integer estate;
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
	@Override
	public String toString() {
		return "CountryVIPIndustry [reportDate=" + reportDate
				+ ", countryName=" + countryName + ", agriculture="
				+ agriculture + ", industry=" + industry + ", building="
				+ building + ", wholesale=" + wholesale + ", traffic="
				+ traffic + ", restaurant=" + restaurant + ", finance="
				+ finance + ", estate=" + estate + "]";
	} 
	
	
}
