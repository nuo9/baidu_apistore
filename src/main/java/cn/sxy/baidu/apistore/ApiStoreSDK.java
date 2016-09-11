package cn.sxy.baidu.apistore;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * 如果奇迹有颜色
 * 那一定是橙色
 * Created by shangxy on 2016/9/11.
 */
public class ApiStoreSDK {

    public static String GET = HttpRequest.METHOD_GET;
    public static String POST = HttpRequest.METHOD_POST;

    private static String APIKEY;

    public static void init(String apikey) {
        APIKEY = apikey;
    }

}
