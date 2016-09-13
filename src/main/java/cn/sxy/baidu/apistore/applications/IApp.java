package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.results.IResultFactory;

import java.util.Map;

/**
 * 应用接口
 * Created by shangxy on 2016/9/11.
 */
public interface IApp {
    // 请求头
    Map<String, String> getHeader();
    // 请求参数
    Map<String, String> getParam();
    // 接口 url
    String getBaseUrl();
    // http 请求方法
    String getMethod();
    // 结果处理工厂
    IResultFactory getResultFactory();
}
