package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 工资变化,g3-7
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class Education implements ExcelMapper {
	
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private Integer undergraduate;
	
	@ExcelCell(index = 3)
	private Integer bachelor;
	
	@ExcelCell(index = 4)
	private Integer master;
	
	@ExcelCell(index = 5)
	private Integer no_qualifications;
	
	@ExcelCell(index = 6)
	private Double K;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getUndergraduate() {
		return undergraduate;
	}

	public void setUndergraduate(Integer undergraduate) {
		this.undergraduate = undergraduate;
	}

	public Integer getBachelor() {
		return bachelor;
	}

	public void setBachelor(Integer bachelor) {
		this.bachelor = bachelor;
	}

	public Integer getMaster() {
		return master;
	}

	public void setMaster(Integer master) {
		this.master = master;
	}

	public Integer getNo_qualifications() {
		return no_qualifications;
	}

	public void setNo_qualifications(Integer no_qualifications) {
		this.no_qualifications = no_qualifications;
	}

	public Double getK() {
		return K;
	}

	public void setK(Double k) {
		K = k;
	}

	@Override
	public String toString() {
		return "Education [reportDate=" + reportDate + ", undergraduate="
				+ undergraduate + ", bachelor=" + bachelor + ", master="
				+ master + ", no_qualifications=" + no_qualifications + ", K="
				+ K + "]";
	}

	
	
}

