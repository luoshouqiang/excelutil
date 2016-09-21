/**
 * @author SargerasWang
 */
package com.bbd.gyem.util.ExcelUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;

import com.bbd.gyem.base.excel.ExcelLog;
import com.bbd.gyem.base.excel.ExcelLogs;
import com.bbd.gyem.base.excel.ExcelUtil;
import com.bbd.gyem.base.excel.mapper.mainIndication.GdpAndRation;

/**
 * The <code>TestImportMap</code>	
 * 
 * @author SargerasWang
 * Created at 2014年9月21日 下午5:06:17
 */
public class TestImportMap {
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) throws FileNotFoundException {
  
	 File f=new File("c:/G-1-gdp.xls");
    ExcelLogs logs =new ExcelLogs();
    Collection<GdpAndRation> importExcel = ExcelUtil.importExcel(GdpAndRation.class, f,  logs , 0);
    for(GdpAndRation m : importExcel){
      System.out.println(m);
    }
    for(ExcelLog l:logs.getErrorLogList()){
    	System.out.println(l.getLog());
    }
  }
  
	/*  Model m=new Model(1, 2, 3);
//	 ExcelCell excelCell=  Model.class.getAnnotation(ExcelCell.class);
	  ExcelCell excelCell;
	try {
		Field field = Model.class.getField("c");
		field.setAccessible(true);
		 excelCell=field.getAnnotation(ExcelCell.class);
		 Valid valid= excelCell.valid();
		 if(valid!=null){
			 Double value=valid.gt();
			 System.out.println(excelCell.index());
			 System.out.println(value);
		 }
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }*/
}
