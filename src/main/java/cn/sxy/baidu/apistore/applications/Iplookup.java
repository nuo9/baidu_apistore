package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.ApiStoreSDK;
import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * http://apistore.baidu.com/apiworks/servicedetail/114.html
 * Created by shangxy on 2016/9/11.
 */
public class Iplookup extends AbstractApp {

    @NotNull private String ip;

    public Iplookup setIp(String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/apistore/iplookupservice/iplookup";
    }

    @Override
    public String getMethod() {
        return ApiStoreSDK.GET;
    }

    @Override
    public String[] getReturnKeys() {
        return new String[]{"errNum", "errMsg", "retData"};
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>(2) {{
            put("ip", ip);
        }};
    }

}
