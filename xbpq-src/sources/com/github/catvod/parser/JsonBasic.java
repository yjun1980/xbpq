package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.C0164g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonBasic {
    public static String getBase64(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0));
        } catch (Exception unused) {
            return null;
        }
    }

    public static HashMap<String, String> getReqHeader(String str) {
        String d = cYh.d("0F3520353228");
        HashMap<String, String> hashMap = new HashMap<>();
        String d2 = cYh.d("12222D");
        hashMap.put(d2, str);
        if (str.contains(cYh.d("0431350E322213"))) {
            try {
                int indexOf = str.indexOf(cYh.d("0431350E3222136D"));
                int indexOf2 = str.indexOf(cYh.d("41"), indexOf);
                String str2 = new String(Base64.decode(str.substring(indexOf + 8, indexOf2), 10));
                String str3 = str.substring(0, indexOf) + str.substring(indexOf2 + 1);
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has(d)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(d);
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, optJSONObject.optString(next, ""));
                    }
                }
                hashMap.put(d2, str3);
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        JSONObject e;
        String d = cYh.d("12222D");
        try {
            SpiderDebug.log(cYh.d("2B3F20357710143F2F71073B15232471153B1439227F7974"));
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    HashMap<String, String> reqHeader = getReqHeader(linkedHashMap.get(str2));
                    try {
                        String str3 = reqHeader.get(d);
                        reqHeader.remove(d);
                        SpiderDebug.log(str3 + str);
                        e = m.e(str, C0164g.g(str3 + str, reqHeader));
                    } catch (Throwable th) {
                        SpiderDebug.log(th);
                    }
                    if (e != null) {
                        e.put(cYh.d("0D2807233837"), str2);
                        SpiderDebug.log(e.toString());
                        return e;
                    }
                }
            }
        } catch (Throwable th2) {
            SpiderDebug.log(th2);
        }
        return new JSONObject();
    }
}
