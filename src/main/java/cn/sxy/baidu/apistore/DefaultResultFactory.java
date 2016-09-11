package cn.sxy.baidu.apistore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

/**
 * 默认结果格式
 * Created by shangxy on 2016/9/11.
 */
public class DefaultResultFactory implements IResultFactory {

    @Override
    public ApiResult parse(String jsonStr) throws IllegalAccessException {
        ApiResult result = JSON.parseObject(jsonStr, ApiResult.class);

        for (Field f : getClass().getDeclaredFields()) {
            if (f.getName().equalsIgnoreCase("success")){
                f.setAccessible(true);
                if (result.getErrNum() == 0)
                    f.setBoolean(result, true);
                else
                    f.setBoolean(result, false);
            }
        }

        return result;
    }
}
