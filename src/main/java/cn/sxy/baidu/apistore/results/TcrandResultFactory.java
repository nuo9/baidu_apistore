package cn.sxy.baidu.apistore.results;

import cn.sxy.baidu.apistore.ApiResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

/**
 * Tcrand 结果
 * Created by shangxy on 2016/9/11.
 */
public class TcrandResultFactory implements IResultFactory {

    @Override
    public ApiResult parse(String jsonStr) throws IllegalAccessException {
        JSONObject json = JSON.parseObject(jsonStr);

        ApiResult result = new ApiResult();
        for (Field f : ApiResult.class.getDeclaredFields()) {
            f.setAccessible(true);
            switch (f.getName()) {
                case "errNum":
                    f.set(result, 0);
                    break;
                case "errMsg":
                    f.set(result, "success");
                    break;
                case "retData":
                    f.set(result, json);
                    break;
                case "success":
                    f.set(result, true);
                    break;
            }
        }

        return result;
    }

}
