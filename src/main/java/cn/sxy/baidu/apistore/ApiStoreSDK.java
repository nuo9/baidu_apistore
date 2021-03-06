package cn.sxy.baidu.apistore;

import cn.sxy.baidu.apistore.applications.IApp;
import cn.sxy.baidu.apistore.kit.MapKit;
import com.github.kevinsawicki.http.HttpRequest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * 如果奇迹有颜色
 * 那一定是橙色
 * Created by shangxy on 2016/9/11.
 */
public class ApiStoreSDK {

    public static final String GET = HttpRequest.METHOD_GET;
    public static final String POST = HttpRequest.METHOD_POST;

    private static String APIKEY;

    public static void init(String apikey) {
        APIKEY = apikey;
    }

    public static String getApikey() {
        return APIKEY;
    }

    public static ApiResult call(IApp app) throws MalformedURLException, IllegalAccessException {
        String result = callString(app);
        return app.getResultFactory().parse(result);
    }

    // 请求
    private static String callString(IApp app) throws MalformedURLException {
        Map param = MapKit.removeNull(app.getParam());
        String url = HttpRequest.append(app.getBaseUrl(), param);
        HttpRequest request = new HttpRequest(new URL(url), app.getMethod()).headers(app.getHeader());
        return request.body();
    }

}
