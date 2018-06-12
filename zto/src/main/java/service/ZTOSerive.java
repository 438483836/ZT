package service;

import com.alibaba.fastjson.JSONObject;
import entity.ZtoRequestData;
import entity.ZtoRequestTO;
import entity.ZtoResponseTO;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.HttpClientUtils;
import utils.JSONUtils;

public class ZTOSerive {
    private static final Logger logger = LoggerFactory.getLogger(ZTOSerive.class);


    /**
     * 3.1.	集包关联信息上传(把枪调用)
     * @param request
     * @return
     */
    public ZtoResponseTO sortingBagBind(ZtoRequestData request) {
        try {
            //请于此处检验参数


            //拼装请求体
            ZtoRequestTO ztoRequestTO = new ZtoRequestTO();
            ztoRequestTO.setData(request);
            ztoRequestTO.setData_digest(getSignData(request, ""));
            ztoRequestTO.setMsg_type("SORTING_BAG_BIND");
            ztoRequestTO.setCompany_id("zto");

            String requestJson = JSONUtils.toString(ztoRequestTO);
            //此处拼装链接地址
            String url = "japi.zto.cn/zto/api_utf8/SortService?"+requestJson;
            String result = HttpClientUtils.get(url);
            logger.info("sortingBagBind result:{}", result);
            ZtoResponseTO responseTO = JSONUtils.parse(result, ZtoResponseTO.class);
            return responseTO;
        } catch (Exception e) {
            logger.error("sortingBagBind error:{}", e);
            return null;
        }

    }

    /**
     * 获取签名
     * @param request 初始参数集合
     * @param key zt提供key
     * @return
     */
    private String getSignData(ZtoRequestData request, String key){
        String dataJson = JSONUtils.toString(request);
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
