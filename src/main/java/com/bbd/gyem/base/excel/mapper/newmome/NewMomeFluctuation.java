package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 新动能波动，g3-4
 * 
 * @author luoshouqiang
 *
 *         2016年9月12日
 */
public class NewMomeFluctuation implements ExcelMapper {

	@ExcelCell(index = 1)
	private Date reportQuarter;
	@ExcelCell(index = 2)
	private String coutryName;
	@ExcelCell(index = 3)
	private Integer employee;
	@ExcelCell(index = 4)
	private Integer investment;
	@ExcelCell(index = 5)
	private Integer creative;
	@ExcelCell(index = 6)
	private Integer total;

	public Date getReportQuarter() {
		return reportQuarter;
	}

	public void setReportQuarter(Date reportQuarter) {
		this.reportQuarter = reportQuarter;
	}

	public String getCoutryName() {
		return coutryName;
	}

	public void setCoutryName(String coutryName) {
		this.coutryName = coutryName;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	public Integer getInvestment() {
		return investment;
	}

	public void setInvestment(Integer investment) {
		this.investment = investment;
	}

	public Integer getCreative() {
		return creative;
	}

	public void setCreative(Integer creative) {
		this.creative = creative;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "NewMomeFluctuation [reportQuarter=" + reportQuarter
				+ ", coutryName=" + coutryName + ", employee=" + employee
				+ ", investment=" + investment + ", creative=" + creative
				+ ", total=" + total + "]";
	}

}
