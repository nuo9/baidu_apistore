package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.results.IResultFactory;
import cn.sxy.baidu.apistore.results.NakedResultFactory;

/**
 * 宅言API-动漫台词接口
 * http://apistore.baidu.com/apiworks/servicedetail/446.html
 * Created by shangxy on 2016/9/11.
 */
public class Tcrand extends AbstractApp {

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/acman/zhaiyanapi/tcrand";
    }

    @Override
    public IResultFactory getResultFactory() {
        return new NakedResultFactory();
    }
}
