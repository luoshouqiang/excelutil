package com.bbd.gyem.base.excel.mapper.vipindustry;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 服务业结构,对应g4-5
 * 
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class ServiceStructure implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	//批发和零售
	@ExcelCell(index = 2)
	private Integer wholesale;
	
	@ExcelCell(index = 3)
	private Integer traffic;
	
	@ExcelCell(index = 4)
	private Integer restaurant;
	
	@ExcelCell(index = 5)
	private Integer finance;
	
	//房地产行业
	@ExcelCell(index = 6)
	private Integer estate;

	

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
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
