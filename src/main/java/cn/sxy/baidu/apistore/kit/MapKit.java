package cn.sxy.baidu.apistore.kit;

import java.util.HashMap;
import java.util.Map;

/**
 * 工具类
 * Created by shangxy on 2016/9/11.
 */
public class MapKit {

    @SuppressWarnings("unchecked")
    public static Map removeNull(Map map) {
        Map newMap = new HashMap((int) (map.size() / .75) + 1);
        map.forEach((k, v) -> {
            if (v != null) {
                newMap.put(k, v);
            }
        });
        return newMap;
    }

}
