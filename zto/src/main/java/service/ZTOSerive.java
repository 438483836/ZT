package service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import org.apache.commons.codec.digest.DigestUtils;
import utils.JSONUtils;

import java.util.Map;

public class ZTOSerive {



    /**
     * 获取签名
     * @param dataMap 初始参数集合
     * @param key zt提供key
     * @return
     */
    private String getSignData(Map<String,Object> dataMap, String key){
        String dataJson = JSONUtils.toString(dataMap);
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
