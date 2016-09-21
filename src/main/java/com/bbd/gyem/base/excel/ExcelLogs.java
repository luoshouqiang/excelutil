package com.bbd.gyem.base.excel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * The <code>ExcelLogs</code>
 * 
 * @author sargeras.wang
 * @version 1.0, Created at 2013年9月17日
 */
public class ExcelLogs {
    private List<ExcelLog> logList=new ArrayList<>();

    /**
     * 
     */
    public ExcelLogs() {
        super();
    }

    /**
     * @return the hasError
     */
    public Boolean getHasError() {
        return logList.size()>0;
    }


    /**
     * @return the logList
     */
    public List<ExcelLog> getLogList() {
        return logList;
    }
    
    public void addLog(ExcelLog log){
    	this.logList.add(log);
    }

    public List<ExcelLog> getErrorLogList() {
        List<ExcelLog> errList = new ArrayList<ExcelLog>();
        for (ExcelLog log : this.logList) {
            if (log != null && StringUtils.isNotBlank(log.getLog())) {
                errList.add(log);
            }
        }
        return errList;
    }

    /**
     * @param logList
     *            the logList to set
     */
    public void setLogList(List<ExcelLog> logList) {
        this.logList = logList;
    }

}
