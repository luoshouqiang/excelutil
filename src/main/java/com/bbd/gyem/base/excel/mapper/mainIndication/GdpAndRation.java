package com.bbd.gyem.base.excel.mapper.mainIndication;


import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.ExcelCell.Valid;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * gdp对应vo,excel1-1
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class GdpAndRation implements ExcelMapper {
	
	@ExcelCell(index = 1,valid=@Valid(regex="[2]\\d{3}[Q][1-4]"))
	private String reportDate;
	
	@ExcelCell(index = 2)
	private Integer gdp;
	
	@ExcelCell(index = 3)
	private Double ration;

	@ExcelCell(index = 4)
	private Integer nationGdp;

	@ExcelCell(index = 5)
	private Double nationRation;
	
	

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getGdp() {
		return gdp;
	}

	public void setGdp(Integer gdp) {
		this.gdp = gdp;
	}

	public Integer getNationGdp() {
		return nationGdp;
	}

	public void setNationGdp(Integer nationGdp) {
		this.nationGdp = nationGdp;
	}

	public Double getRation() {
		return ration;
	}

	public void setRation(Double ration) {
		this.ration = ration;
	}

	public Double getNationRation() {
		return nationRation;
	}

	public void setNationRation(Double nationRation) {
		this.nationRation = nationRation;
	}

	@Override
	public String toString() {
		return "GdpMapper [reportDate=" + reportDate + ", gdp=" + gdp
				+ ", ration=" + ration + ", nationGdp=" + nationGdp
				+ ", nationRation=" + nationRation + "]";
	}

}
