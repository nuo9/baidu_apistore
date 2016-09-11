package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.results.IResultFactory;

import java.util.Map;

/**
 * 应用接口
 * Created by shangxy on 2016/9/11.
 */
public interface IApp {

    Map<String, String> getHeader();

    Map<String, String> getParam();

    String getBaseUrl();

    String getMethod();

    IResultFactory getResultFactory();
}
