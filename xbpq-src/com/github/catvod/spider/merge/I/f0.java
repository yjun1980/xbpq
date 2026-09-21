/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Response
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.b0;
import com.github.catvod.spider.merge.I.c0;
import com.github.catvod.spider.merge.I.d0;
import com.github.catvod.spider.merge.I.e0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Response;
import org.json.JSONObject;

public final class f0 {
    private final Map<String, c0> a = new ConcurrentHashMap<String, c0>();

    public static f0 c() {
        return d0.a;
    }

    private String f(String object, String object2, String object3, String object4, String object52) {
        block11: {
            String string = UUID.randomUUID().toString();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("activityId", (String)object);
            hashMap.put("appVersion", "imgotv-pch5-1.2.3");
            hashMap.put("auth_mode", "1");
            hashMap.put("cameraId", (String)object2);
            hashMap.put("clientKey", "pcweb");
            hashMap.put("definition", (String)object3);
            hashMap.put("deviceId", string);
            hashMap.put("did", string);
            hashMap.put("init_definition", (String)object3);
            hashMap.put("platform", "4");
            hashMap.put("supportFlv", "1");
            hashMap.put("lls", "0");
            hashMap.put("_t", String.valueOf(System.currentTimeMillis()));
            if (e.d((CharSequence)object4)) {
                hashMap.put("uid", (String)object4);
            }
            if (e.d((CharSequence)object52)) {
                hashMap.put("token", (String)object52);
            }
            hashMap.put("sign", this.a(hashMap));
            hashMap.put("_support", "10000000");
            object3 = new StringBuilder();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (((StringBuilder)object3).length() > 0) {
                    ((StringBuilder)object3).append("&");
                }
                ((StringBuilder)object3).append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                ((StringBuilder)object3).append("=");
                ((StringBuilder)object3).append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("https://pwlp.bz.mgtv.com/v1/live/source?");
            ((StringBuilder)object4).append(((StringBuilder)object3).toString());
            object4 = ((StringBuilder)object4).toString();
            object3 = new HashMap();
            ((HashMap)object3).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://www.mgtv.com/z/");
            stringBuilder.append((String)object);
            stringBuilder.append("/");
            stringBuilder.append((String)object2);
            stringBuilder.append(".html");
            ((HashMap)object3).put("Referer", stringBuilder.toString());
            object = d.e((String)object4, object3);
            if (!object.isSuccessful() || object.body() == null) break block11;
            object2 = object.body().string();
            object = new JSONObject((String)object2);
            if (!object.has("data") || !(object = object.getJSONObject("data")).has("sources")) break block11;
            object2 = object.getJSONArray("sources");
            object = new ArrayList();
            int n2 = 0;
            while (true) {
                if (n2 >= object2.length()) break;
                object4 = object2.getJSONObject(n2);
                object3 = object4.optString("url");
                if (e.d((CharSequence)object3)) {
                    int n3 = object4.optInt("definition", 0);
                    String string2 = object4.optString("name");
                    object4 = new e0(n3, string2, (String)object3);
                    ((ArrayList)object).add(object4);
                }
                ++n2;
                continue;
                break;
            }
            try {
                if (!((ArrayList)object).isEmpty()) {
                    object2 = new b0();
                    Collections.sort(object, object2);
                    object2 = (e0)((ArrayList)object).get(0);
                    object = new StringBuilder();
                    ((StringBuilder)object).append("[MgtvLive] Selected highest resolution: ");
                    ((StringBuilder)object).append(((e0)object2).b);
                    ((StringBuilder)object).append(" (def=");
                    ((StringBuilder)object).append(((e0)object2).a);
                    ((StringBuilder)object).append(")");
                    SpiderDebug.log((String)((StringBuilder)object).toString());
                    object = ((e0)object2).c;
                    return object;
                }
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
        return null;
    }

    public final String a(Map<String, String> object) {
        Object object2 = new TreeMap<String, String>((Map<String, String>)object);
        object = com.github.catvod.spider.merge.C.a.c("LMFwh1k1m@pvt#Pt");
        for (Map.Entry<String, String> entry : ((TreeMap)object2).entrySet()) {
            object2 = entry.getValue();
            if (object2 == null || ((String)object2).isEmpty()) continue;
            ((StringBuilder)object).append(entry.getKey());
            ((StringBuilder)object).append((String)object2);
        }
        ((StringBuilder)object).append("LMFwh1k1m@pvt#Pt");
        return m.b(((StringBuilder)object).toString()).toUpperCase();
    }

    public final String b(String object, String string, String string2, String string3, String string4, boolean bl) {
        String string5;
        String string6;
        block8: {
            block7: {
                string6 = string2;
                if (e.b(string2) || "0".equals(string6) || "auto".equalsIgnoreCase(string6)) break block7;
                string2 = string6;
                if (!"max".equalsIgnoreCase(string6)) break block8;
            }
            string2 = e.d(string4) ? "5" : "3";
        }
        String string7 = r.b((String)object, "_", string, "_", string2);
        long l2 = System.currentTimeMillis();
        c0 c02 = (c0)((ConcurrentHashMap)this.a).get(string7);
        if (!bl && c02 != null && l2 - c02.b < 120000L) {
            return c02.a;
        }
        string6 = string5 = this.f((String)object, string, string2, string3, string4);
        if (e.b(string5)) {
            string6 = string5;
            if (!"2".equals(string2)) {
                string6 = this.f((String)object, string, "2", string3, string4);
            }
        }
        if (e.d(string6)) {
            object = this.a;
            Integer.parseInt(string2);
            ((ConcurrentHashMap)object).put(string7, new c0(string6, l2));
            object = new StringBuilder();
            ((StringBuilder)object).append("[MgtvLive] Refreshed stream URL for ");
            ((StringBuilder)object).append(string7);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(string6);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return string6;
        }
        object = c02 != null ? c02.a : null;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d(String string, String string2, String string3, String object, String string4) {
        String string5 = this.b(string, string2, string3, (String)object, string4, false);
        if (e.b(string5)) {
            return null;
        }
        try {
            Object object2;
            Object object3;
            Serializable serializable;
            block17: {
                block16: {
                    serializable = new HashMap();
                    ((HashMap)serializable).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
                    object3 = d.e(string5, serializable);
                    if (!object3.isSuccessful()) break block16;
                    object2 = object3;
                    if (object3.body() != null) break block17;
                }
                if (e.b(string5 = this.b(string, string2, string3, (String)object, string4, true))) {
                    return null;
                }
                object = d.e(string5, serializable);
                if (!object.isSuccessful()) return null;
                object2 = object;
                if (object.body() == null) {
                    return null;
                }
            }
            object = new InputStreamReader(object2.body().byteStream());
            object3 = new BufferedReader((Reader)object);
            object2 = new StringBuilder();
            string5 = string5.substring(0, string5.lastIndexOf("/"));
            while (true) {
                if ((object = ((BufferedReader)object3).readLine()) == null) {
                    ((BufferedReader)object3).close();
                    return ((StringBuilder)object2).toString();
                }
                string4 = ((String)object).trim();
                boolean bl = string4.startsWith("#EXT-X-MEDIA");
                if (bl && string4.contains("URI=\"")) {
                    int n2;
                    int n3 = string4.indexOf("URI=\"") + 5;
                    object = string4.substring(n3, n2 = string4.indexOf("\"", n3));
                    if (!((String)object).startsWith("http")) {
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append(string5);
                        ((StringBuilder)serializable).append("/");
                        ((StringBuilder)serializable).append((String)object);
                        object = ((StringBuilder)serializable).toString();
                    }
                    object = Server.A(string, string2, string3, (String)object);
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append(string4.substring(0, n3));
                    ((StringBuilder)serializable).append((String)object);
                    ((StringBuilder)serializable).append(string4.substring(n2));
                    object = ((StringBuilder)serializable).toString();
                } else {
                    object = string4;
                    if (!string4.startsWith("#")) {
                        object = string4;
                        if (!string4.isEmpty()) {
                            if (!string4.startsWith("http")) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(string5);
                                ((StringBuilder)object).append("/");
                                ((StringBuilder)object).append(string4);
                                string4 = ((StringBuilder)object).toString();
                            }
                            object = Server.A(string, string2, string3, string4);
                        }
                    }
                }
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("\n");
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }

    public final Response e(String string, String charSequence, String string2, String string3, String string4, String string5) {
        Response response;
        HashMap<String, String> hashMap;
        block4: {
            hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            try {
                response = d.e(string3, hashMap);
                if (!response.isSuccessful()) break block4;
                return response;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return null;
            }
        }
        string = this.b(string, (String)charSequence, string2, string4, string5, true);
        if (e.d(string)) {
            string = string.substring(0, string.lastIndexOf("/"));
            string2 = string3.substring(string3.lastIndexOf("/") + 1);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(string2);
            string = d.e(((StringBuilder)charSequence).toString(), hashMap);
            return string;
        }
        return response;
    }
}

