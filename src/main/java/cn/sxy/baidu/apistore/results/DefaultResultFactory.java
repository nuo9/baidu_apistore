package cn.sxy.baidu.apistore.results;

import cn.sxy.baidu.apistore.ApiResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

/**
 * 处理默认结果格式
 * Created by shangxy on 2016/9/11.
 */
public class DefaultResultFactory implements IResultFactory {

    private String KEY_ERRNUM = "errNum";
    private String KEY_ERRMSG = "errMsg";
    private String KEY_RETDATA = "retData";

    public DefaultResultFactory() {
    }

    public DefaultResultFactory(String errNum, String errMsg, String retData) {
        KEY_ERRNUM = errNum;
        KEY_ERRMSG = errMsg;
        KEY_RETDATA = retData;
    }

    @Override
    public ApiResult parse(String jsonStr) throws IllegalAccessException {
        final JSONObject json = JSON.parseObject(jsonStr);

        Integer errNum = json.getInteger(KEY_ERRNUM);
        String errMsg = json.getString(KEY_ERRMSG);
        Boolean success = errNum == 0;
        JSONObject retData = success ? json.getJSONObject(KEY_RETDATA) : new JSONObject(2) {{
            put("msg", json.get(KEY_RETDATA).toString());
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
