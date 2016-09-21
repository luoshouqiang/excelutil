package com.bbd.gyem.base.excel.mapper.other;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 交通信息，对应g7-5
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class TrafficInfo implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	
	private Integer flightPeopleIn;
	
	@ExcelCell(index = 3)
	private Integer railwayPeopleIn;
	
	@ExcelCell(index = 4)
	private Integer roadPeopleIn;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getFlightPeopleIn() {
		return flightPeopleIn;
	}

	public void setFlightPeopleIn(Integer flightPeopleIn) {
		this.flightPeopleIn = flightPeopleIn;
	}

	public Integer getRailwayPeopleIn() {
		return railwayPeopleIn;
	}

	public void setRailwayPeopleIn(Integer railwayPeopleIn) {
		this.railwayPeopleIn = railwayPeopleIn;
	}

	public Integer getRoadPeopleIn() {
		return roadPeopleIn;
	}

	public void setRoadPeopleIn(Integer roadPeopleIn) {
		this.roadPeopleIn = roadPeopleIn;
	}

	@Override
	public String toString() {
		return "TrafficVO [reportDate=" + reportDate + ", flightPeopleIn="
				+ flightPeopleIn + ", railwayPeopleIn=" + railwayPeopleIn
				+ ", roadPeopleIn=" + roadPeopleIn + "]";
	}
	
}
