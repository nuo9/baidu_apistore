package cn.sxy.baidu.apistore.applications.tcrand;

import java.util.HashMap;
import java.util.Map;

/**
 * 宅言API-动漫台词接口
 * http://apistore.baidu.com/apiworks/servicedetail/446.html
 * Created by shangxy on 2016/9/11.
 */
public class TcrandOld extends Tcrand {

    private String id;

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/acman/zhaiyanapi/zhaiyanapi";
    }

    @Override
    public Tcrand setFangfa(String fangfa) {
        return this;
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>(2) {{
            put("id", id);
        }};
    }

    public TcrandOld setId(String id) {
        this.id = id;
        return this;
    }

}
