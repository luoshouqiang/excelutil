package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 职业变化,g3-8
 * @author luoshouqiang
 *
 * 2016年9月12日
 */
public class NewJob implements ExcelMapper{
	
	@ExcelCell(index = 1)
	private Date reportQuarter;
	
	@ExcelCell(index = 2)
	private String  jobName;
	
	@ExcelCell(index = 3)
	private Integer requirement;

	public Date getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(Date reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Integer getRequirement() {
		return requirement;
	}

	public void setRequirement(Integer requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "NewJob [reportQuarter=" + reportQuarter + ", jobName="
				+ jobName + ", requirement=" + requirement + "]";
	}
	
	
}
