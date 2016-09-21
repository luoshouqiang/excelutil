package com.bbd.gyem.base.excel.mapper.fixedassets;

import java.util.Date;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.mapper.ExcelMapper;

/**
 * 房地产供给指标,对应g5-4
 * 
 * @author luoshouqiang
 *
 * 2016年9月13日
 */
public class EstateSupplyIndication implements ExcelMapper {
		
	@ExcelCell(index = 1)
	private Date reportDate;
	
	@ExcelCell(index = 2)
	private String indication;	
	
	@ExcelCell(index = 3)
	private String residenceInvest;
	
	@ExcelCell(index = 4)
	private String officeInvest;
	
	@ExcelCell(index = 5)
	private String residenceArea;		

	@ExcelCell(index = 6)
	private String officeArea;	

	@ExcelCell(index = 7)
	private String businessArea;
	
	@ExcelCell(index = 8)
	private String newResidenceArea;		

	@ExcelCell(index = 9)
	private String newOfficeArea;	

	@ExcelCell(index = 10)
	private String newBusinessArea;
	
	@ExcelCell(index = 11)
	private String finishResidenceArea;		

	@ExcelCell(index = 12)
	private String finishOfficeArea;	

	@ExcelCell(index = 13)
	private String finishBusinessArea;
	
	@ExcelCell(index = 11)
	private String saleResidence;		

	@ExcelCell(index = 12)
	private String  saleOffice;	

	@ExcelCell(index = 13)
	private String saleBusiness;
	
	
	@ExcelCell(index = 11)
	private String saleResidenceArea;		

	@ExcelCell(index = 12)
	private String  saleOfficeArea;	

	@ExcelCell(index = 13)
	private String saleBusinessArea;
	
	
}
