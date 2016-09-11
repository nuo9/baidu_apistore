package cn.sxy.baidu.apistore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * api 返回结果
 * Created by shangxy on 2016/9/11.
 */
public class ApiResult {

    private boolean success;
    private int errCode;
    private String errMsg;
    private JSONObject body;

    public ApiResult(String jsonStr, String[] returnKeys) {
        JSONObject json = JSONObject.parseObject(jsonStr);
        errCode = json.getIntValue(returnKeys[0]);
        errMsg = json.getString(returnKeys[1]);
        if (errCode == 0 || errCode == 1) {
            body = json.getJSONObject(returnKeys[2]);
            success = true;
        } else {
            body = new JSONObject();
            success = false;
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getMsg() {
        return errMsg;
    }

    public JSONObject getBody() {
        return body;
    }

}
