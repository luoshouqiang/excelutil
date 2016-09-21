package com.bbd.gyem.base.excel.mapper.other;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 工程信息,对应g7-4
 * 
 * @author luoshouqiang
 *
 *         2016年9月13日
 */
public class ProjectInfo implements ExcelMapper {

	@ExcelCell(index = 1)
	private Date reportDate;

	@ExcelCell(index = 2)
	private String province;

	@ExcelCell(index = 3)
	private String projectType;

	@ExcelCell(index = 4)
	private String projectName;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "ProjectVO [reportDate=" + reportDate + ", province=" + province
				+ ", projectType=" + projectType + ", projectName="
				+ projectName + "]";
	}

}
