/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class JsonBasic {
    public static String getBase64(String string) {
        if (string == null) {
            return null;
        }
        try {
            string = new String(Base64.decode((String)string, (int)0));
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap<String, String> getReqHeader(String string) {
        String string2 = cYh.d("0F3520353228");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string3 = cYh.d("12222D");
        hashMap.put(string3, string);
        if (!string.contains(cYh.d("0431350E322213"))) return hashMap;
        try {
            int n2 = string.indexOf(cYh.d("0431350E3222136D"));
            int n3 = string.indexOf(cYh.d("41"), n2);
            Object object = string.substring(n2 + 8, n3);
            String string4 = new String(Base64.decode((String)object, (int)10));
            object = new StringBuilder();
            ((StringBuilder)object).append(string.substring(0, n2));
            ((StringBuilder)object).append(string.substring(n3 + 1));
            string = ((StringBuilder)object).toString();
            object = new JSONObject(string4);
            if (object.has(string2)) {
                string2 = object.optJSONObject(string2);
                object = string2.keys();
                while (object.hasNext()) {
                    string4 = (String)object.next();
                    hashMap.put(string4, string2.optString(string4, ""));
                }
            }
            hashMap.put(string3, string);
        }
        finally {
            return hashMap;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject parse(LinkedHashMap<String, String> var0, String var1_2) {
        var3_3 = cYh.d("12222D");
        SpiderDebug.log((String)cYh.d("2B3F20357710143F2F71073B15232471153B1439227F7974"));
        if (var0.size() <= 0) return new JSONObject();
lbl5:
        // 3 sources

        for (String var4_5 : var0.keySet()) {
            var6_8 = JsonBasic.getReqHeader(var0.get(var4_5));
            ** GOTO lbl12
        }
        return new JSONObject();
        {
            catch (Throwable var0_1) {
                SpiderDebug.log((Throwable)var0_1);
                return new JSONObject();
            }
lbl12:
            // 1 sources

            try {
                var5_7 = var6_8.get(var3_3);
                var6_8.remove(var3_3);
                var7_9 = new StringBuilder();
                var7_9.append(var5_7);
                var7_9.append(var1_2);
                SpiderDebug.log((String)var7_9.toString());
                var7_9 = new StringBuilder();
                var7_9.append(var5_7);
                var7_9.append(var1_2);
                var5_7 = m.e(var1_2, g.g(var7_9.toString(), var6_8));
                if (var5_7 == null) ** GOTO lbl5
                var5_7.put(cYh.d("0D2807233837"), (Object)var4_5);
                SpiderDebug.log((String)var5_7.toString());
                return var5_7;
            }
            catch (Throwable var4_6) {}
            {
                SpiderDebug.log((Throwable)var4_6);
                ** GOTO lbl5
            }
        }
    }
}

