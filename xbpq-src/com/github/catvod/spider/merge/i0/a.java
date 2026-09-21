/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.i0;

import java.util.Calendar;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    private static JSONObject a(String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", (Object)string);
        jSONObject.put("v", (Object)string2);
        return jSONObject;
    }

    private static boolean b(String string) {
        if (string != null && string.length() == 4) {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (Character.isDigit(string.charAt(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static JSONObject c(JSONObject jSONObject) {
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            JSONArray jSONArray = jSONObject.optJSONArray((String)iterator.next());
            if (jSONArray == null) continue;
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                int n2;
                int n3;
                int n4;
                String string;
                JSONObject jSONObject2 = jSONArray.optJSONObject(i2);
                if (jSONObject2 == null) continue;
                int n5 = !"\u5e74\u4ee3".equals(jSONObject2.optString("key")) && !"\u5e74\u4ee3".equals(jSONObject2.optString("name")) ? 0 : 1;
                if (n5 == 0) continue;
                JSONArray jSONArray2 = jSONObject2.optJSONArray("value");
                JSONArray jSONArray3 = new JSONArray();
                String string2 = string = "\u5168\u90e8";
                if (jSONArray2 != null) {
                    if (jSONArray2.length() == 0) {
                        string2 = string;
                    } else {
                        JSONObject jSONObject3 = jSONArray2.optJSONObject(0);
                        string2 = string;
                        if (jSONObject3 != null) {
                            string2 = !jSONObject3.optString("v").isEmpty() ? string : jSONObject3.optString("n", "\u5168\u90e8");
                        }
                    }
                }
                jSONArray3.put((Object)a.a(string2, ""));
                n5 = n4 = Calendar.getInstance().get(1);
                if (jSONArray2 == null) {
                    n3 = n4;
                    n2 = n5;
                } else {
                    int n6 = 0;
                    while (true) {
                        n3 = n4;
                        n2 = n5;
                        if (n6 >= jSONArray2.length()) break;
                        string2 = jSONArray2.optJSONObject(n6);
                        if (string2 != null && a.b(string2 = string2.optString("v"))) {
                            n5 = Math.min(n5, Integer.parseInt(string2));
                        }
                        ++n6;
                    }
                }
                while (n3 >= n2) {
                    string2 = String.valueOf(n3);
                    jSONArray3.put((Object)a.a(string2, string2));
                    --n3;
                }
                if (jSONArray2 != null) {
                    for (n5 = 0; n5 < jSONArray2.length(); ++n5) {
                        string2 = jSONArray2.optJSONObject(n5);
                        if (string2 == null || (string = string2.optString("v")).isEmpty() || a.b(string)) continue;
                        jSONArray3.put((Object)a.a(string2.optString("n", string), string));
                    }
                }
                jSONObject2.put("value", (Object)jSONArray3);
            }
        }
        return jSONObject;
    }
}

