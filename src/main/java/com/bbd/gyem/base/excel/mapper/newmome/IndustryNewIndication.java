package com.bbd.gyem.base.excel.mapper.newmome;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 行业新动能指数，对应g3-5
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class IndustryNewIndication implements ExcelMapper {
		@ExcelCell(index=1)
		private Date reportDate;
		
		@ExcelCell(index=2)
		private String countryName;
		
		@ExcelCell(index=3)
		private Integer total;
		
		@ExcelCell(index=4)
		private Integer bigData;
		
		@ExcelCell(index = 5)
		private Integer tour;
		
		@ExcelCell(index = 6)
		private Integer medicine;
		
		@ExcelCell(index = 7)
		private Integer finance;

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

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getBigData() {
			return bigData;
		}

		public void setBigData(Integer bigData) {
			this.bigData = bigData;
		}

		public Integer getTour() {
			return tour;
		}

		public void setTour(Integer tour) {
			this.tour = tour;
		}

		public Integer getMedicine() {
			return medicine;
		}

		public void setMedicine(Integer medicine) {
			this.medicine = medicine;
		}

		public Integer getFinance() {
			return finance;
		}

		public void setFinance(Integer finance) {
			this.finance = finance;
		}

		@Override
		public String toString() {
			return "IndustryNewIndication [reportDate=" + reportDate
					+ ", countryName=" + countryName + ", total=" + total
					+ ", bigData=" + bigData + ", tour=" + tour + ", medicine="
					+ medicine + ", finance=" + finance + "]";
		}
		
}
