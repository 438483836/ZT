package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 中通接口请求data类
 * @author xiaoMa
 * @date 2018-6-12 17:15:54
 */
@Entity
@Table(name = "person")
public class ZtoRequestData implements Serializable {
    private static final long serialVersionUID = 2206295714373012374L;

    /**
     * 分拣端口编码
     */
    private String sortPortCode;
    /**
     * 集包编码
     */
    private String packageCode;
    /**
     * 端口集包绑定时间
     */
    private Date bindingTime;
    /**
     * 操作员工编号
     */
    private String employeeCode;
    /**
     * 操作员工姓名
     */
    private String employeeName;
    /**
     * 站点名
     */
    private String siteName;
    /**
     * 数据上传时间
     */
    private Date uploadTime;
    /**
     * 数据上传时间
     */
    private String lineCode;
    /**
     * pda编码
     */
    private String pdaCode;

    public ZtoRequestData() {
    }

    public String getSortPortCode() {
        return sortPortCode;
    }

    public void setSortPortCode(String sortPortCode) {
        this.sortPortCode = sortPortCode;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public Date getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getPdaCode() {
        return pdaCode;
    }

    public void setPdaCode(String pdaCode) {
        this.pdaCode = pdaCode;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}
