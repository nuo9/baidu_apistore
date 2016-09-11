package cn.sxy.baidu.apistore.applications.search_news;

import cn.sxy.baidu.apistore.applications.AbstractApp;
import cn.sxy.baidu.apistore.results.DefaultResultFactory;
import cn.sxy.baidu.apistore.results.IResultFactory;

/**
 * 频道新闻API_易源
 * http://apistore.baidu.com/apiworks/servicedetail/688.html
 * Created by shangxy on 2016/9/11.
 */
public class SearchNewsChannel extends AbstractApp {

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/showapi_open_bus/channel_news/channel_news";
    }

    @Override
    public IResultFactory getResultFactory() {
        return new DefaultResultFactory("showapi_res_code", "showapi_res_error", "showapi_res_body");
    }
}
