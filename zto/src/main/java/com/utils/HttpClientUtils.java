package com.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientUtils {
    private static HttpClientBuilder httpClientBuilder;
    private static HttpClient httpClient;
    public static final String encode = "UTF-8";

    public HttpClientUtils() {
    }

    public static String get(String url) throws IOException {
        HttpGet method = new HttpGet(url);

        String var5;
        try {
            HttpResponse httpResponse = httpClient.execute(method);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode >= 300) {
                throw new IOException("http get[" + url + "] failed,statuCode [" + statusCode + "].");
            }

            HttpEntity entity = httpResponse.getEntity();
            var5 = EntityUtils.toString(entity, "UTF-8");
        } finally {
            method.releaseConnection();
        }

        return var5;
    }
}
