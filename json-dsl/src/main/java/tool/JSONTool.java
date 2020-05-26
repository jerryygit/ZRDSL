package tool;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONTool {
    public static JSONObject parseObj(String str) {
        return JSONObject.parseObject(str);
    }

    public static JSONArray parseArray(String str) {
        return JSONArray.parseArray(str);
    }
}
