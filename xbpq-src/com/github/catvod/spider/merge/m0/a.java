/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.m0;

import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    public static String a() {
        return a.b(16);
    }

    private static String b(int n2) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(secureRandom.nextInt(64)));
        }
        return stringBuilder.toString();
    }

    public static String c() {
        return a.b(12);
    }

    public static JSONObject d(String string, String string2, String string3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cpn", (Object)string);
        jSONObject.put("contentCheckOk", true);
        jSONObject.put("racyCheckOk", true);
        jSONObject.put("videoId", (Object)string3);
        jSONObject.put("disablePlayerResponse", false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        string = new JSONObject();
        jSONObject3.put("internalExperimentFlags", (Object)new JSONArray());
        jSONObject4.put("androidSdkVersion", 35);
        jSONObject4.put("utcOffsetMinutes", 0);
        jSONObject4.put("osVersion", (Object)"15");
        jSONObject4.put("hl", (Object)"en-GB");
        jSONObject4.put("clientName", (Object)"ANDROID");
        jSONObject4.put("gl", (Object)"GB");
        jSONObject4.put("clientScreen", (Object)"WATCH");
        jSONObject4.put("clientVersion", (Object)"19.28.35");
        jSONObject4.put("osName", (Object)"Android");
        jSONObject4.put("platform", (Object)"MOBILE");
        jSONObject4.put("visitorData", (Object)string2);
        jSONObject5.put("lockedSafetyMode", false);
        jSONObject2.put("request", (Object)jSONObject3);
        jSONObject2.put("client", (Object)jSONObject4);
        jSONObject2.put("user", (Object)jSONObject5);
        string.put("videoId", (Object)string3);
        jSONObject.put("context", (Object)jSONObject2);
        jSONObject.put("playerRequest", (Object)string);
        return jSONObject;
    }
}

