package cn.sxy.baidu.apistore.applications;

import cn.sxy.baidu.apistore.results.IResultFactory;
import cn.sxy.baidu.apistore.results.TcrandResultFactory;

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
    public IResultFactory getResultFactory() {
        return new TcrandResultFactory();
    }
}
