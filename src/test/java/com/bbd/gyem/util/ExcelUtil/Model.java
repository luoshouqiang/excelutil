/**
 * @author SargerasWang
 */
package com.bbd.gyem.util.ExcelUtil;

import com.bbd.gyem.base.excel.ExcelCell;
import com.bbd.gyem.base.excel.ExcelCell.Valid;

/**
 * The <code>Model</code>
 * 
 * @author SargerasWang Created at 2014年8月7日 下午5:09:29
 */
public class Model {
	
    @ExcelCell(index = 0)
    private Double a;
    @ExcelCell(index = 1)
    private Double b;
    
    
    @ExcelCell(index = 2)    
    public Double c;

    public  Model(){
    	
    }
    
    public Model(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}

   
}
