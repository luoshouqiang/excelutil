package com.bbd.gyem.base.excel.mapper.other;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 招聘信息,对应g7-1
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class RecruitInfo implements ExcelMapper {
	
		@ExcelCell(index=1)
		private String companyName;
		
		@ExcelCell(index=2)
		private String postition;
		
		@ExcelCell(index=3)
		private Integer recruitNumber;
		
		@ExcelCell(index=4)
		private String countryName;
		
		@ExcelCell(index=5)
		private Date reportDate;
		
		@ExcelCell(index=6)
		private Double salary;

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getPostition() {
			return postition;
		}

		public void setPostition(String postition) {
			this.postition = postition;
		}

		public Integer getRecruitNumber() {
			return recruitNumber;
		}

		public void setRecruitNumber(Integer recruitNumber) {
			this.recruitNumber = recruitNumber;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public Date getReportDate() {
			return reportDate;
		}

		public void setReportDate(Date reportDate) {
			this.reportDate = reportDate;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "RecruitVO [companyName=" + companyName + ", postition="
					+ postition + ", recruitNumber=" + recruitNumber
					+ ", countryName=" + countryName + ", reportDate="
					+ reportDate + ", salary=" + salary + "]";
		}
		
}
