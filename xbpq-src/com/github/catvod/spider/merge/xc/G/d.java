/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

public class d {
    @SerializedName(value="data")
    private d a;
    @SerializedName(value="content")
    private d b;
    @SerializedName(value="t")
    private String c;
    @SerializedName(value="ck")
    private String d;
    @SerializedName(value="codeContent")
    private String e;
    @SerializedName(value="qrCodeStatus")
    private String f;
    @SerializedName(value="bizExt")
    private String g;

    public static d g(String object) {
        block3: {
            try {
                Object object2 = new Gson();
                object2 = (d)object2.fromJson((String)object, d.class);
                object = object2;
                if (object2 != null) break block3;
            }
            catch (Exception exception) {
                return new d();
            }
            object = new d();
        }
        return object;
    }

    public final String a() {
        String string;
        String string2 = string = this.g;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final String b() {
        String string;
        String string2 = string = this.e;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final d c() {
        d d2;
        d d3 = d2 = this.b;
        if (d2 == null) {
            d3 = new d();
        }
        return d3;
    }

    public final d d() {
        d d2;
        d d3 = d2 = this.a;
        if (d2 == null) {
            d3 = new d();
        }
        return d3;
    }

    public final HashMap e() {
        String string;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = string = this.c;
        if (string == null) {
            string2 = "";
        }
        hashMap.put("t", string2);
        string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        hashMap.put("ck", string2);
        hashMap.put("appName", "aliyun_drive");
        hashMap.put("appEntrance", "web");
        hashMap.put("isMobile", "false");
        hashMap.put("lang", "zh_CN");
        hashMap.put("returnUrl", "");
        hashMap.put("fromSite", "52");
        hashMap.put("bizParams", "");
        hashMap.put("navlanguage", "zh-CN");
        hashMap.put("navPlatform", "MacIntel");
        return hashMap;
    }

    public final boolean f() {
        String string;
        String string2 = string = this.f;
        if (string == null) {
            string2 = "";
        }
        boolean bl = string2.equals("CONFIRMED") && this.a().length() > 0;
        return bl;
    }
}

