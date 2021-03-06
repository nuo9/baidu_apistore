import cn.sxy.baidu.apistore.ApiResult;
import cn.sxy.baidu.apistore.ApiStoreSDK;
import cn.sxy.baidu.apistore.applications.iplookup.Iplookup;
import cn.sxy.baidu.apistore.applications.search_news.SearchNews;
import cn.sxy.baidu.apistore.applications.search_news.SearchNewsChannel;
import cn.sxy.baidu.apistore.applications.tcrand.JpTcrand;
import cn.sxy.baidu.apistore.applications.tcrand.Tcrand;
import cn.sxy.baidu.apistore.applications.tcrand.TcrandOld;

import java.io.IOException;

/**
 * 使用方法
 * Created by shangxy on 2016/9/11.
 */
public class TestUseage {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        String appkey = Appkey.getAppkey();
        ApiStoreSDK.init(appkey);

        ApiResult r0 = ApiStoreSDK.call(new Iplookup().setIp("12.65.85.15"));
        ApiResult r1 = ApiStoreSDK.call(new Tcrand());
        ApiResult r2 = ApiStoreSDK.call(new JpTcrand());
        ApiResult r3 = ApiStoreSDK.call(new TcrandOld().setId("21"));
        ApiResult r4 = ApiStoreSDK.call(new SearchNews().setTitle("发射"));
        ApiResult r5 = ApiStoreSDK.call(new SearchNewsChannel());
        System.out.println(r2);

    }

}
