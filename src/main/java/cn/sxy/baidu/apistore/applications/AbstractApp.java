package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.ApiStoreSDK;
import cn.sxy.baidu.apistore.results.DefaultResultFactory;
import cn.sxy.baidu.apistore.results.IResultFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * App 抽象类，表示默认的值
 * Created by shangxy on 2016/9/11.
 */
public abstract class AbstractApp implements IApp {
    // 默认头： apikey
    @Override
    public Map<String, String> getHeader() {
        return new HashMap<String, String>(2) {{
            put("apikey", ApiStoreSDK.getApikey());
        }};
    }
    // 默认GET方法
    @Override
    public String getMethod() {
        return ApiStoreSDK.GET;
    }
    // 默认无参数
    @Override
    public Map<String, String> getParam() {
        return new HashMap<>(2);
    }
    // 默认结果处理工厂
    @Override
    public IResultFactory getResultFactory() {
        return new DefaultResultFactory();
    }
}
