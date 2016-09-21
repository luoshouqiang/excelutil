package com.bbd.gyem.base.excel.mapper.mainIndication;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 区县工业增加值和新动能,g1-6
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class CountryIndustry implements ExcelMapper {
	
		@ExcelCell(index=1)
		private Date reportDate;
		
		@ExcelCell(index=2)
		private String countryName;
		
		@ExcelCell(index=3)
		private Integer industryIncrement;
		
		@ExcelCell(index=4)
		private Double ration;
		
		@ExcelCell(index=5)
		private Double newMomeIndication;
		
		@ExcelCell(index=6)
		private Integer newMomeIncrement;

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

		public Integer getIndustryIncrement() {
			return industryIncrement;
		}

		public void setIndustryIncrement(Integer industryIncrement) {
			this.industryIncrement = industryIncrement;
		}

		public Double getRation() {
			return ration;
		}

		public void setRation(Double ration) {
			this.ration = ration;
		}

		public Double getNewMomeIndication() {
			return newMomeIndication;
		}

		public void setNewMomeIndication(Double newMomeIndication) {
			this.newMomeIndication = newMomeIndication;
		}

		public Integer getNewMomeIncrement() {
			return newMomeIncrement;
		}

		public void setNewMomeIncrement(Integer newMomeIncrement) {
			this.newMomeIncrement = newMomeIncrement;
		}

		@Override
		public String toString() {
			return "CountryIndustry [reportDate=" + reportDate
					+ ", countryName=" + countryName + ", industryIncrement="
					+ industryIncrement + ", ration=" + ration
					+ ", newMomeIndication=" + newMomeIndication
					+ ", newMomeIncrement=" + newMomeIncrement + "]";
		}

		
}
