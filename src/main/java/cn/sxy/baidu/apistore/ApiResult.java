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

    public ApiResult setErrNum(Integer errNum) {
        this.errNum = errNum;
        return this;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public ApiResult setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public JSONObject getRetData() {
        return retData;
    }

    public ApiResult setRetData(JSONObject retData) {
        this.retData = retData;
        return this;
    }

}
