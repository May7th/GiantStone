package com.oyun.giantstone.common;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class JsonData {

    private boolean result;

    private String msg;

    private Object data;


    public JsonData(boolean result){
        this.result = result;
    }

    public static JsonData success(Object data,String msg){
        JsonData jsonData = new JsonData(true);
        jsonData.setMsg(msg);
        jsonData.setData(data);
        return jsonData;
    }

    public static JsonData success(String msg){
        JsonData jsonData = new JsonData(true);
        jsonData.setMsg(msg);
        return jsonData;
    }

    public static JsonData success(Object data){
        JsonData jsonData = new JsonData(true);
        jsonData.setData(data);
        return jsonData;
    }

    public static JsonData success(){
        JsonData jsonData = new JsonData(true);
        return jsonData;
    }

    public static JsonData fail(String msg){
        JsonData jsonData = new JsonData(false);
        jsonData.setMsg(msg);
        return jsonData;
    }

    public Map<String, Object> toMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("result",result);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }
}
