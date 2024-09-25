package OrderDataToJson.ResultUtils;

import OrderDataToJson.ResponseData;
import cn.hutool.json.JSONUtil;

import java.lang.reflect.Method;

public class ResultUtils {
    public static <T> String result(Enum anEnum, T data){
        try{
            ResponseData<T> responseData = new ResponseData<>();
            responseData.setData(data);
            Method getCodeMethod = anEnum.getClass().getMethod("getCode");
            Method getMsgMethod = anEnum.getClass().getMethod("getMsg");
            if(getCodeMethod != null){
                responseData.setCode((Integer) getCodeMethod.invoke(anEnum));
            }
            if(getMsgMethod != null){
                responseData.setMsg((String) getMsgMethod.invoke(anEnum));
            }
            return JSONUtil.toJsonPrettyStr(responseData);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
