package cn.sxy.baidu.apistore.results;

import cn.sxy.baidu.apistore.ApiResult;

/**
 * 格式化结果
 * Created by shangxy on 2016/9/11.
 */
public interface IResultFactory {

    ApiResult parse(String jsonStr) throws IllegalAccessException;

}
