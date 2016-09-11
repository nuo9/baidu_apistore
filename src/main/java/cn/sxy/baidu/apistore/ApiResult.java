package cn.sxy.baidu.apistore;

import com.alibaba.fastjson.JSONObject;

/**
 * api 返回结果
 * Created by shangxy on 2016/9/11.
 */
public class ApiResult {

    private Boolean success;
    private Integer errNum;
    private String errMsg;
    private JSONObject retData;

    public Boolean isSuccess() {
        return success;
    }

    public Integer getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public JSONObject getRetData() {
        return retData;
    }

}
