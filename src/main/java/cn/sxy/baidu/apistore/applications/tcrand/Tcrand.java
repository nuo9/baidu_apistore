package cn.sxy.baidu.apistore.applications.tcrand;

import cn.sxy.baidu.apistore.applications.AbstractApp;
import cn.sxy.baidu.apistore.results.IResultFactory;
import cn.sxy.baidu.apistore.results.NakedResultFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 宅言API-动漫台词接口
 * http://apistore.baidu.com/apiworks/servicedetail/446.html
 * Created by shangxy on 2016/9/11.
 */
public class Tcrand extends AbstractApp {

    private String fangfa;

    public Tcrand setFangfa(String fangfa) {
        this.fangfa = fangfa;
        return this;
    }

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/acman/zhaiyanapi/tcrand";
    }

    @Override
    public IResultFactory getResultFactory() {
        return new NakedResultFactory();
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>(2) {{
            put("fangfa", fangfa);
        }};
    }
}
