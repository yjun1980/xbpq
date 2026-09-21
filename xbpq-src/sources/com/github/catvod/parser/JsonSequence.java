package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.C0164g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonSequence {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        JSONObject e;
        String d = cYh.d("12222D");
        try {
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    try {
                        HashMap<String, String> reqHeader = JsonBasic.getReqHeader(linkedHashMap.get(str2));
                        String str3 = reqHeader.get(d);
                        reqHeader.remove(d);
                        SpiderDebug.log(str3 + str);
                        e = m.e(str, C0164g.g(str3 + str, reqHeader));
                    } catch (Throwable th) {
                        SpiderDebug.log(th);
                    }
                    if (e != null) {
                        e.put(cYh.d("0D2807233837"), str2);
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
