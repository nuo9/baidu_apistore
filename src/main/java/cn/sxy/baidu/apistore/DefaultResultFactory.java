package cn.sxy.baidu.apistore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

/**
 * 处理默认结果格式
 * Created by shangxy on 2016/9/11.
 */
public class DefaultResultFactory implements IResultFactory {

    @Override
    public ApiResult parse(String jsonStr) throws IllegalAccessException {
        final JSONObject json = JSON.parseObject(jsonStr);

        Integer errNum = json.getInteger("errNum");
        String errMsg = json.getString("errMsg");
        Boolean success = errNum == 0;
        JSONObject retData = success ? json.getJSONObject("retData") : new JSONObject(2) {{
            put("msg", json.get("retData").toString());
        }};

        ApiResult result = new ApiResult();
        for (Field f : ApiResult.class.getDeclaredFields()) {
            f.setAccessible(true);
            switch (f.getName()) {
                case "errNum":
                    f.set(result, errNum);
                    break;
                case "errMsg":
                    f.set(result, errMsg);
                    break;
                case "retData":
                    f.set(result, retData);
                    break;
                case "success":
                    f.set(result, success);
                    break;
            }
        }

        return result;
    }
}
