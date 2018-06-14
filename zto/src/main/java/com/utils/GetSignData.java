package com.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Vincent on 2018-06-13.
 */
public class GetSignData {

    public GetSignData(){

    }

    /**
     * 获取签名
     * @param obj 初始参数集合
     * @param key zt提供key
     * @return
     */
    public static String getSignData(Object obj, String key){
        String dataJson = JSONUtils.toString(obj);
        return md5Encrypt(dataJson+key);
    }

    /**
     * md5加密
     *
     * @param content
     * @return
     */
    public static String md5Encrypt(String content) {
        try {
            return DigestUtils.md5Hex(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
