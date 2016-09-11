package cn.sxy.baidu.apistore.applications.search_news;

import cn.sxy.baidu.apistore.applications.AbstractApp;
import cn.sxy.baidu.apistore.results.DefaultResultFactory;
import cn.sxy.baidu.apistore.results.IResultFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 频道新闻API_易源
 * http://apistore.baidu.com/apiworks/servicedetail/688.html
 * Created by shangxy on 2016/9/11.
 */
public class SearchNews extends AbstractApp {

    private String channelId;
    private String channelName;
    private String title;
    private String page;
    private String needContent;
    private String needHtml;

    public SearchNews setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public SearchNews setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public SearchNews setTitle(String title) {
        this.title = title;
        return this;
    }

    public SearchNews setPage(String page) {
        this.page = page;
        return this;
    }

    public SearchNews setNeedContent(String needContent) {
        this.needContent = needContent;
        return this;
    }

    public SearchNews setNeedHtml(String needHtml) {
        this.needHtml = needHtml;
        return this;
    }

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/showapi_open_bus/channel_news/search_news";
    }

    @Override
    public IResultFactory getResultFactory() {
        return new DefaultResultFactory("showapi_res_code", "showapi_res_error", "showapi_res_body");
    }

    @Override
    public Map<String, String> getParam() {
        return new HashMap<String, String>() {{
            put("channelId", channelId);
            put("channelName", channelName);
            put("title", title);
            put("page", page);
            put("needContent", needContent);
            put("needHtml", needHtml);
        }};
    }
}
