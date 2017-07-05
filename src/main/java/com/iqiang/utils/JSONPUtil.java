package com.iqiang.utils;

import com.google.gson.Gson;

/**
 * Created by zhuzhiqiang on 17/7/5.
 */
public class JSONPUtil {
    public static String toJson(Object result, String jsonp) {
        if (null == jsonp) {
            return new Gson().toJson(result);
        } else {
            return jsonp + "(" + new Gson().toJson(result) + ")";
        }
    }
}
