package com.moozhy.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author 陆逊
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
