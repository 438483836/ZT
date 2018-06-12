package entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vincent on 2018-06-12.
 */
@Entity
public class Employee implements Serializable{

    private static final long serialVersionUID = -6193225494959983106L;

    public Employee(){

    }

    private String sortPortCode;

    private String packageCode;

    private Date bindingTime;

    private String employeeName;

    private String siteName;

    private Date uploadTime;

    private String lineCode;

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

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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

    private String pdaCode;

}
