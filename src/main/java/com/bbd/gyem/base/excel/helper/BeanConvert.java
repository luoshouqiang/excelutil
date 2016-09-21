package com.bbd.gyem.base.excel.helper;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;


public class BeanConvert {
 /**			
	@Resource
	EconomicIndicationMapper econmicMapper;
	
	@Resource
	RegionMapper regionMapper;
	
	public  EconomicIndication getIndication(String name,int type){
		EconomicIndicationExample example=new EconomicIndicationExample();
		example.createCriteria().andNameEqualTo(name).andTypeEqualTo(type);
		List<EconomicIndication> resultList=econmicMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(resultList)){
			return null;
		}
		else
			return resultList.get(0);		
	}
	
	public Region getRegion(String name){
		return regionMapper.findByName(name);		
	}
	
	**/
}
