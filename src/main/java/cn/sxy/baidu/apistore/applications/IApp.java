package cn.sxy.baidu.apistore.applications;

import java.util.Map;

/**
 * 应用接口
 * Created by shangxy on 2016/9/11.
 */
public interface IApp {

    public Map<String, String> getHeader();
    public Map<String, String> getParam();

    public String getBaseUrl();
    public String getMethod();

    public String[] getReturnKeys();
}
