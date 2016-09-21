package com.bbd.gyem.base.excel;

import java.util.HashMap;
import java.util.Map;

import com.bbd.gyem.base.excel.mapper.ExcelMapper;
import com.bbd.gyem.base.excel.mapper.econmycheck.EconomyRuntimeExCheck;
import com.bbd.gyem.base.excel.mapper.fixedassets.CountryFixedAssets;
import com.bbd.gyem.base.excel.mapper.fixedassets.EstateSupply;
import com.bbd.gyem.base.excel.mapper.fixedassets.EstateSupplyIndication;
import com.bbd.gyem.base.excel.mapper.fixedassets.FixedAssetsIndication;
import com.bbd.gyem.base.excel.mapper.mainIndication.CountryIndustry;
import com.bbd.gyem.base.excel.mapper.mainIndication.EconomyRuntimeCheck;
import com.bbd.gyem.base.excel.mapper.mainIndication.GdpAndRation;
import com.bbd.gyem.base.excel.mapper.mainIndication.IndustryIncrement;
import com.bbd.gyem.base.excel.mapper.mainIndication.MainEconmyIndication;
import com.bbd.gyem.base.excel.mapper.newmome.CountryNewMomeIndication;
import com.bbd.gyem.base.excel.mapper.newmome.Education;
import com.bbd.gyem.base.excel.mapper.newmome.LabourRequirement;
import com.bbd.gyem.base.excel.mapper.newmome.NewJob;
import com.bbd.gyem.base.excel.mapper.newmome.NewMomeFluctuation;
import com.bbd.gyem.base.excel.mapper.newmome.NewMomeIndication;
import com.bbd.gyem.base.excel.mapper.newmome.NewMomeInput;
import com.bbd.gyem.base.excel.mapper.other.CompanyInfo;
import com.bbd.gyem.base.excel.mapper.other.PatenInfo;
import com.bbd.gyem.base.excel.mapper.other.ProjectInfo;
import com.bbd.gyem.base.excel.mapper.other.RecruitInfo;
import com.bbd.gyem.base.excel.mapper.other.TrafficInfo;
import com.bbd.gyem.base.excel.mapper.vipindustry.BigDataDriven;
import com.bbd.gyem.base.excel.mapper.vipindustry.CountryVIPIndustry;
import com.bbd.gyem.base.excel.mapper.vipindustry.KeyElement;
import com.bbd.gyem.base.excel.mapper.vipindustry.ServiceStructure;
import com.bbd.gyem.base.excel.mapper.vipindustry.VIPIndustryProduction;

public class ExcelFileHolder {
	
			static Map<String,ClassSortMapper> allExcelFileMap=new HashMap<>();	
			private static Integer sortIndex=1;
			static{				
//				allExcelFileMap.put("G-2-监控指标", new VOMapper());				
				allExcelFileMap.put("G-1-gdp", getNewMappper(GdpAndRation.class));
				allExcelFileMap.put("G-1-工业增加值",getNewMappper(IndustryIncrement.class));
				allExcelFileMap.put("G-1-经济运行监测",getNewMappper(EconomyRuntimeCheck.class));
				allExcelFileMap.put("G-1-区县工业增加值和新动能", getNewMappper(CountryIndustry.class));
				allExcelFileMap.put("G-1-主要经济指标", getNewMappper(MainEconmyIndication.class));
				
				allExcelFileMap.put("G-2-经济运行异常监测", getNewMappper(EconomyRuntimeExCheck.class));
				
				allExcelFileMap.put("G-3-工资变化", getNewMappper(Education.class));
				allExcelFileMap.put("G-3-行业新动能指数",getNewMappper(NewMomeIndication.class));
				allExcelFileMap.put("G-3-劳动力需求变化", getNewMappper(LabourRequirement.class));
				allExcelFileMap.put("G-3-区县新动能指数", getNewMappper(CountryNewMomeIndication.class));
				allExcelFileMap.put("G-3-新动能投入比重", getNewMappper(NewMomeInput.class));
				
				allExcelFileMap.put("G-3-新动能指数", getNewMappper(NewMomeIndication.class));
				allExcelFileMap.put("G-3-新动能指数波动", getNewMappper(NewMomeFluctuation.class));
				allExcelFileMap.put("G-3-职业增加名单", getNewMappper(NewJob.class));
				
				allExcelFileMap.put("G-4-大数据经济带动", getNewMappper(BigDataDriven.class));
				allExcelFileMap.put("G-4-服务结构", getNewMappper(ServiceStructure.class));
				allExcelFileMap.put("G-4-生产要素占比", getNewMappper(KeyElement.class));
				allExcelFileMap.put("G-4-重点行业产能", getNewMappper(VIPIndustryProduction.class));
				allExcelFileMap.put("G-4-重点行业区域分布", getNewMappper(CountryVIPIndustry.class));
				
				allExcelFileMap.put("G-5-房地产供给消化", getNewMappper(EstateSupply.class));
				allExcelFileMap.put("G-5-房地产供给指标详情",getNewMappper(EstateSupplyIndication.class));
				allExcelFileMap.put("G-5-固定投资指数", getNewMappper(FixedAssetsIndication.class));
				allExcelFileMap.put("G-5-区县固定投资", getNewMappper(CountryFixedAssets.class));
				
				allExcelFileMap.put("G-7-工程信息", getNewMappper(ProjectInfo.class));
				allExcelFileMap.put("G-7-公司信息", getNewMappper(CompanyInfo.class));
				allExcelFileMap.put("G-7-交通信息", getNewMappper(TrafficInfo.class));
				allExcelFileMap.put("G-7-企业专利", getNewMappper(PatenInfo.class));
				allExcelFileMap.put("G-7-招聘信息", getNewMappper(RecruitInfo.class));
				
			}
			
			public static ClassSortMapper getSortIndex(String fileName){
				return allExcelFileMap.get(fileName);
			}
			
			private static ClassSortMapper getNewMappper(Class<? extends ExcelMapper> clazz){
				return new ClassSortMapper(clazz,sortIndex++);
			}
}
