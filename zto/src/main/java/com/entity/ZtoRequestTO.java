package com.entity;

import java.io.Serializable;

/**
 * 中通接口请求类
 * @author xiaoMa
 * @date 2018-6-12 17:37:36
 */
public class ZtoRequestTO implements Serializable {
    private static final long serialVersionUID = -7217762705582883283L;

    private ZtoRequestData data;

    private String data_digest;

    private String msg_type;

    private String company_id;

    public ZtoRequestTO() {
    }

    public ZtoRequestData getData() {
        return data;
    }

    public void setData(ZtoRequestData data) {
        this.data = data;
    }

    public String getData_digest() {
        return data_digest;
    }

    public void setData_digest(String data_digest) {
        this.data_digest = data_digest;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
