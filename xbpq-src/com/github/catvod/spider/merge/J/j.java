/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.g1.O;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Random;

public final class j {
    public static String a(Map object2) {
        if (object2 != null && !object2.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry entry : object2.entrySet()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("; ");
                }
                stringBuilder.append((String)entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append((String)entry.getValue());
            }
            return stringBuilder.toString();
        }
        return "";
    }

    public static String b(int n2, Random random) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(random.nextInt(64)));
        }
        return stringBuilder.toString();
    }

    public static String c(String object) {
        try {
            Object object2 = MessageDigest.getInstance("MD5").digest(((String)object).getBytes("UTF-8"));
            object = new BigInteger(1, (byte[])object2);
            object2 = new StringBuilder;
            ((StringBuilder)object2)(((BigInteger)object).toString(16));
            while (((StringBuilder)object2).length() < 32) {
                ((StringBuilder)object2).insert(0, "0");
            }
            object = ((StringBuilder)object2).toString().toLowerCase();
        }
        catch (Exception exception) {
            object = "";
        }
        return object;
    }

    public static JsonElement d(String string) {
        try {
            JsonElement jsonElement = JsonParser.parseString((String)string);
            return jsonElement;
        }
        catch (Throwable throwable) {
            return new JsonParser().parse(string);
        }
    }

    public static JsonObject e(String string) {
        block3: {
            try {
                JsonObject jsonObject = j.d(string).getAsJsonObject();
                string = jsonObject;
                if (jsonObject != null) break block3;
            }
            catch (Throwable throwable) {
                return new JsonObject();
            }
            string = new JsonObject();
        }
        return string;
    }

    public static void f(O o2, s s2) {
        d.j(s2);
        s s3 = s2;
        int n2 = 0;
        while (s3 != null) {
            s s4 = s3.z();
            int n3 = s4 != null ? s4.g() : 0;
            s s5 = s3.r();
            o2.a(s3, n2);
            s s6 = s3;
            if (s4 != null) {
                s6 = s3;
                if (!s3.p()) {
                    if (n3 == s4.g()) {
                        s6 = s4.f(s3.G());
                    } else {
                        if (s5 == null) {
                            --n2;
                            s3 = s4;
                            continue;
                        }
                        s3 = s5;
                        continue;
                    }
                }
            }
            s3 = s6;
            if (s6.g() > 0) {
                s3 = s6.f(0);
                continue;
            }
            for (n3 = n2++; s3.r() == null && n3 > 0; --n3) {
                o2.b(s3, n3);
                s3 = s3.z();
            }
            o2.b(s3, n3);
            if (s3 == s2) break;
            s3 = s3.r();
            n2 = n3;
        }
    }

    public static String g(String string) {
        try {
            String string2 = URLEncoder.encode(string, "UTF-8");
            return string2;
        }
        catch (Exception exception) {
            return URLEncoder.encode(string);
        }
    }
}

