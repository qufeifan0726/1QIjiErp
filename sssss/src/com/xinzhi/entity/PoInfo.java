package com.xinzhi.entity;

import java.util.Date;

/**
 * 采购订单封装类
 * @author Administrator
 *
 */
public class PoInfo {
    private int pagenum; //当前页码
    private int pagesize; //每页显示条数
    private String PO_Buyer; //采购员
    private String PO_Name; //采购单名称
    private String PO_Serial; //订单编号
    private Date PO_BuildDate; //建表日期
    private Date PO_SubmitDate; //提交日期
    private Date PO_Time; //预计采购时间
    private int PO_Audit; //审核
    private String PO_Notes; //备注

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getPO_Buyer() {
        return PO_Buyer;
    }

    public void setPO_Buyer(String PO_Buyer) {
        this.PO_Buyer = PO_Buyer;
    }

    public String getPO_Name() {
        return PO_Name;
    }

    public void setPO_Name(String PO_Name) {
        this.PO_Name = PO_Name;
    }

    public String getPO_Serial() {
        return PO_Serial;
    }

    public void setPO_Serial(String PO_Serial) {
        this.PO_Serial = PO_Serial;
    }

    public Date getPO_BuildDate() {
        return PO_BuildDate;
    }

    public void setPO_BuildDate(Date PO_BuildDate) {
        this.PO_BuildDate = PO_BuildDate;
    }

    public Date getPO_SubmitDate() {
        return PO_SubmitDate;
    }

    public void setPO_SubmitDate(Date PO_SubmitDate) {
        this.PO_SubmitDate = PO_SubmitDate;
    }

    public Date getPO_Time() {
        return PO_Time;
    }

    public void setPO_Time(Date PO_Time) {
        this.PO_Time = PO_Time;
    }

    public int getPO_Audit() {
        return PO_Audit;
    }

    public void setPO_Audit(int PO_Audit) {
        this.PO_Audit = PO_Audit;
    }

    public String getPO_Notes() {
        return PO_Notes;
    }

    public void setPO_Notes(String PO_Notes) {
        this.PO_Notes = PO_Notes;
    }
}
