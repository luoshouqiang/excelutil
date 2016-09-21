package com.bbd.gyem.util.ExcelUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import com.bbd.gyem.base.excel.ExcelUtil;
import com.bbd.gyem.base.excel.mapper.fixedassets.CountryFixedAssets;
import com.bbd.gyem.base.excel.mapper.mainIndication.GdpAndRation;

public class TestExportBean {
    public static void main(String[] args) throws IOException {
      
        String[] headers = {"时间","gdp","增长率","全国gdp","全国gdp增长率"};
        Collection<Object> dataset=new ArrayList<Object>();
        GdpAndRation gdpMapper = new GdpAndRation();
        gdpMapper.setGdp(100);
        gdpMapper.setNationGdp(500);
        gdpMapper.setNationRation(7.8d);
        gdpMapper.setRation(6.7d);
        gdpMapper.setReportDate("2013Q4");
        dataset.add(gdpMapper);
        gdpMapper = new GdpAndRation();
        gdpMapper.setGdp(200);
        gdpMapper.setNationGdp(5040);
        gdpMapper.setNationRation(7.6d);
        gdpMapper.setRation(6.8d);
        gdpMapper.setReportDate("2013Q1");
        dataset.add(gdpMapper);
        File f=new File("c:/G-1-gdp.xls");
        OutputStream out =new FileOutputStream(f);
        
        ExcelUtil.exportExcel(headers, dataset, out,"yyyy/MM");
        out.close();
        
        /** 
    	Calendar canlder = Calendar.getInstance();
		canlder.set(2014, 02, 02);
		Date reportDate=canlder.getTime();
        CountryFixedAssets country=new CountryFixedAssets();
        country.setCountryName("南明区");
        country.setFixedAssets(201);
        country.setReportDate(reportDate);
        String[]  otherHeaders = {"时间","区县","固定投资额"};
        Collection<Object>    dataset=new ArrayList<Object>();
        dataset.add(country);
        
        File file=new File("c:/G-5-区县固定投资.xls");
        OutputStream out2 =new FileOutputStream(file);
        
        ExcelUtil.exportExcel(otherHeaders, dataset, out2,"yyyy/MM");
        out2.close();
        **/
    }
}
