/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.annotations.SerializedName
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.d;
import com.github.catvod.spider.merge.K.e;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class f {
    @SerializedName(value="class")
    private List<a> a;
    @SerializedName(value="list")
    private List<h> b;
    @SerializedName(value="filters")
    private LinkedHashMap<String, List<c>> c;
    @SerializedName(value="header")
    private String d;
    @SerializedName(value="format")
    private String e;
    @SerializedName(value="url")
    private Object f;
    @SerializedName(value="subs")
    private List<g> g;
    @SerializedName(value="parse")
    private int h;
    @SerializedName(value="jx")
    private int i;
    @SerializedName(value="page")
    private Integer j;
    @SerializedName(value="pagecount")
    private Integer k;
    @SerializedName(value="limit")
    private Integer l;
    @SerializedName(value="total")
    private Integer m;
    @SerializedName(value="danmaku")
    private String n;
    @SerializedName(value="msg")
    private String o;

    public static String d(String string) {
        f f2 = new f();
        f2.b = Collections.emptyList();
        f2.o = string;
        return f2.toString();
    }

    public static f i(String string) {
        return (f)com.github.catvod.spider.merge.G1.d.a(string, f.class);
    }

    public static String n(h h2) {
        f f2 = new f();
        f2.b = Arrays.asList(h2);
        return f2.toString();
    }

    public static String o(List<h> list) {
        f f2 = new f();
        f2.b = list;
        return f2.toString();
    }

    public static String p(List<a> object, JsonElement jsonElement) {
        f f2 = new f();
        f2.a = object;
        if (jsonElement != null) {
            object = new d().getType();
            f2.c = (LinkedHashMap)new Gson().fromJson(jsonElement.toString(), (Type)object);
        }
        return f2.toString();
    }

    public static String q(List<a> list, LinkedHashMap<String, List<c>> linkedHashMap) {
        f f2 = new f();
        f2.a = list;
        f2.c = linkedHashMap;
        return f2.toString();
    }

    public static String r(List<a> list, List<h> list2) {
        f f2 = new f();
        f2.a = list;
        f2.b = list2;
        return f2.toString();
    }

    public static String s(List<a> list, List<h> list2, LinkedHashMap<String, List<c>> linkedHashMap) {
        f f2 = new f();
        f2.a = list;
        f2.b = list2;
        f2.c = linkedHashMap;
        return f2.toString();
    }

    public static String t(List<a> list, List<h> list2, JSONObject jSONObject) {
        f f2 = new f();
        f2.a = list;
        f2.b = list2;
        f2.e(jSONObject);
        return f2.toString();
    }

    public static String u(List<a> list, JSONObject jSONObject) {
        f f2 = new f();
        f2.a = list;
        f2.e(jSONObject);
        return f2.toString();
    }

    public final f a(List<a> list) {
        this.a = list;
        return this;
    }

    public final f b(String string) {
        this.n = string;
        return this;
    }

    public final f c() {
        this.e = "application/dash+xml";
        return this;
    }

    public final f e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        Type type = new e().getType();
        this.c = (LinkedHashMap)new Gson().fromJson(jSONObject.toString(), type);
        return this;
    }

    public final List<h> f() {
        List<h> list;
        List<h> list2 = list = this.b;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final f g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final f h() {
        this.i = 1;
        return this;
    }

    public final f j() {
        Object object = this.f;
        object = object != null && String.valueOf(object).toLowerCase().contains(".iso") ? "video/x-iso" : "application/octet-stream";
        this.e = object;
        return this;
    }

    public final f k(int n2, int n3, int n4, int n5) {
        if (n2 <= 0) {
            n2 = Integer.MAX_VALUE;
        }
        this.j = n2;
        if (n4 <= 0) {
            n4 = Integer.MAX_VALUE;
        }
        this.l = n4;
        if (n5 <= 0) {
            n5 = Integer.MAX_VALUE;
        }
        this.m = n5;
        if (n3 <= 0) {
            n3 = Integer.MAX_VALUE;
        }
        this.k = n3;
        return this;
    }

    public final f l() {
        this.h = 1;
        return this;
    }

    public final f m(int n2) {
        this.h = n2;
        return this;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }

    public final f v(List<g> list) {
        this.g = list;
        return this;
    }

    public final f w(String string) {
        this.f = string;
        return this;
    }

    public final f x(List<String> list) {
        this.f = list;
        return this;
    }

    public final f y(List<h> list) {
        this.b = list;
        return this;
    }
}

