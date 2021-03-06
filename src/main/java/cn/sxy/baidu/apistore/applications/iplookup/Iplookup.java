package cn.sxy.baidu.apistore.applications.iplookup;

import cn.sxy.baidu.apistore.applications.AbstractApp;

import java.util.HashMap;
import java.util.Map;

/**
 * IP地址查询
 * http://apistore.baidu.com/apiworks/servicedetail/114.html
 * Created by shangxy on 2016/9/11.
 */
public class Iplookup extends AbstractApp {

    private String ip;

    public Iplookup setIp(String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/apistore/iplookupservice/iplookup";
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>(2) {{
            put("ip", ip);
        }};
    }

}
