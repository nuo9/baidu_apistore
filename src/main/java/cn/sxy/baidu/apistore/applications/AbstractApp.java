package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.ApiStoreSDK;

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
    public Map<String, String> getParam() {
        return new HashMap<String, String>(2);
    }

}
