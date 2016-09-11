import cn.sxy.baidu.apistore.ApiStoreSDK;
import cn.sxy.baidu.apistore.applications.Iplookup;

import java.net.MalformedURLException;

/**
 * 使用方法
 * Created by shangxy on 2016/9/11.
 */
public class TestUseage {

    public static void main(String[] args) throws MalformedURLException {
        ApiStoreSDK.init("eb9adbade360417e04449d9c746b28b3");

        ApiStoreSDK.call(new Iplookup().setIp("25.35.6.15"));

    }

}
