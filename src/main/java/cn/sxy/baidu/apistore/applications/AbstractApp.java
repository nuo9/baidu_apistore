package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.ApiStoreSDK;
import cn.sxy.baidu.apistore.DefaultResultFactory;
import cn.sxy.baidu.apistore.IResultFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * App 抽象类
 * Created by shangxy on 2016/9/11.
 */
abstract class AbstractApp implements IApp {

    @Override
    public Map<String, String> getHeader() {
        return new HashMap<String, String>(2) {{
            put("apikey", ApiStoreSDK.getApikey());
        }};
    }

    @Override
    public String getMethod() {
        return ApiStoreSDK.GET;
    }

    @Override
    public IResultFactory getResultFactory() {
        return new DefaultResultFactory();
    }
}
