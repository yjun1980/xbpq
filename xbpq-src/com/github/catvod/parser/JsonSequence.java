/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.JsonBasic;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsonSequence {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject parse(LinkedHashMap<String, String> var0, String var1_2) {
        var3_3 = cYh.d("12222D");
        if (var0.size() <= 0) return new JSONObject();
lbl4:
        // 3 sources

        for (String var4_5 : var0.keySet()) {
            var5_7 = var0.get(var4_5);
            ** GOTO lbl11
        }
        return new JSONObject();
        {
            catch (Throwable var0_1) {
                SpiderDebug.log((Throwable)var0_1);
                return new JSONObject();
            }
lbl11:
            // 1 sources

            try {
                var5_7 = JsonBasic.getReqHeader((String)var5_7);
                var6_8 = (String)var5_7.get(var3_3);
                var5_7.remove(var3_3);
                var7_9 = new StringBuilder();
                var7_9.append(var6_8);
                var7_9.append(var1_2);
                SpiderDebug.log((String)var7_9.toString());
                var7_9 = new StringBuilder();
                var7_9.append(var6_8);
                var7_9.append(var1_2);
                var5_7 = m.e(var1_2, g.g(var7_9.toString(), (Map<String, String>)var5_7));
                if (var5_7 == null) ** GOTO lbl4
                var5_7.put(cYh.d("0D2807233837"), (Object)var4_5);
                return var5_7;
            }
            catch (Throwable var4_6) {}
            {
                SpiderDebug.log((Throwable)var4_6);
                ** GOTO lbl4
            }
        }
    }
}

