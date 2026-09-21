/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  okhttp3.FormBody$Builder
 *  okhttp3.Headers
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.A.c;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class v {
    private static final OkHttpClient a = new OkHttpClient();

    public static String a() {
        Request request = new Request.Builder().url("http://api.extscreen.com/timestamp").build();
        request = a.newCall(request).execute();
        return ((JsonObject)new Gson().fromJson(request.body().string(), JsonObject.class)).getAsJsonObject("data").get("timestamp").getAsString();
    }

    public static JsonObject b(String string, String object, String string2, String string3) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("akv", "2.8.1496");
        treeMap.put("apv", "1.3.8");
        treeMap.put("b", "samsung");
        treeMap.put("d", string2);
        treeMap.put("m", "SM-S908E");
        treeMap.put("mac", "");
        treeMap.put("n", "SM-S908E");
        treeMap.put("t", (String)object);
        treeMap.put("wifiMac", string3);
        string = new FormBody.Builder().add("code", string);
        string = new Request.Builder().url("http://api.extscreen.com/aliyundrive/v3/token").post((RequestBody)string.build());
        object = c.b("token", "6733b42e28cdba32", "User-Agent", "Mozilla/5.0 (Linux; U; Android 9; zh-cn; SM-S908E Build/TP1A.220624.014) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        ((HashMap)object).put("Host", "api.extscreen.com");
        ((HashMap)object).putAll(treeMap);
        string = string.headers(Headers.of((Map)object)).build();
        string = a.newCall((Request)string).execute();
        return (JsonObject)new Gson().fromJson(string.body().string(), JsonObject.class);
    }
}

