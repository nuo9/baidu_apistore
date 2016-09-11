package cn.sxy.baidu.apistore.applications;

import java.util.HashMap;
import java.util.Map;

/**
 * http://apis.baidu.com/acman/zhaiyanapi/tcrand
 * Created by shangxy on 2016/9/11.
 */
public class Tcrand extends AbstractApp {

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/acman/zhaiyanapi/tcrand";
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>();
    }

}
