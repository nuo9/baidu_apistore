package cn.sxy.baidu.apistore.applications.tcrand;

/**
 * 宅言API-动漫台词接口
 * http://apistore.baidu.com/apiworks/servicedetail/446.html
 * Created by shangxy on 2016/9/11.
 */
public class JpTcrand extends Tcrand {

    @Override
    public String getBaseUrl() {
        return "http://apis.baidu.com/acman/zhaiyanapi/jptcrand";
    }

}
