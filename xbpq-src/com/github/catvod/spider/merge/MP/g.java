/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.annotations.SerializedName
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.MP;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.MP.b;
import com.github.catvod.spider.merge.MP.d;
import com.github.catvod.spider.merge.MP.e;
import com.github.catvod.spider.merge.MP.f;
import com.github.catvod.spider.merge.MP.h;
import com.github.catvod.spider.merge.MP.k;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public class g {
    @SerializedName(value="class")
    private List<b> a;
    @SerializedName(value="list")
    private List<k> b;
    @SerializedName(value="filters")
    private LinkedHashMap<String, List<d>> c;
    @SerializedName(value="header")
    private String d;
    @SerializedName(value="format")
    private String e;
    @SerializedName(value="danmaku")
    private String f;
    @SerializedName(value="click")
    private String g;
    @SerializedName(value="msg")
    private String h;
    @SerializedName(value="url")
    private Object i;
    @SerializedName(value="subs")
    private List<h> j;
    @SerializedName(value="parse")
    private int k;
    @SerializedName(value="jx")
    private int l;
    @SerializedName(value="page")
    private Integer m;
    @SerializedName(value="pagecount")
    private Integer n;
    @SerializedName(value="limit")
    private Integer o;
    @SerializedName(value="total")
    private Integer p;

    public static String c(String string) {
        g g2 = new g();
        g2.b = Collections.emptyList();
        g2.h = string;
        return g2.toString();
    }

    public static String i(String string) {
        g g2 = new g();
        g2.h = string;
        return g2.toString();
    }

    public static String n(k k2) {
        C.Q(k2);
        g g2 = new g();
        C.Q(k2);
        g2.b = Arrays.asList(k2);
        return g2.toString();
    }

    public static String o(Integer n2, Integer n3, Integer n4, Integer n5, ArrayList arrayList) {
        g g2 = new g();
        g2.k(n2, n3, n4, n5);
        g2.b = arrayList;
        return g2.toString();
    }

    public static String p(ArrayList object, ArrayList arrayList, JsonObject jsonObject) {
        g g2 = new g();
        g2.a = object;
        g2.b = arrayList;
        if (jsonObject != null) {
            object = new f().getType();
            g2.c = (LinkedHashMap)new Gson().fromJson(jsonObject.toString(), (Type)object);
        }
        return g2.toString();
    }

    public static String q(ArrayList arrayList, ArrayList arrayList2, JSONObject jSONObject) {
        g g2 = new g();
        g2.a = arrayList;
        g2.b = arrayList2;
        g2.e(jSONObject);
        return g2.toString();
    }

    public static String r(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        g g2 = new g();
        g2.a = arrayList;
        g2.c = linkedHashMap;
        return g2.toString();
    }

    public static String s(ArrayList arrayList, List list, LinkedHashMap linkedHashMap) {
        g g2 = new g();
        g2.a = arrayList;
        g2.b = list;
        g2.c = linkedHashMap;
        return g2.toString();
    }

    public static String t(List list) {
        g g2 = new g();
        g2.b = list;
        return g2.toString();
    }

    public static String u(List list, List list2) {
        g g2 = new g();
        g2.a = list;
        g2.b = list2;
        return g2.toString();
    }

    public final void a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void b(String string) {
        this.f = string;
    }

    public final void d(LinkedHashMap linkedHashMap) {
        this.c = linkedHashMap;
    }

    public final void e(JSONObject jSONObject) {
        Type type = new e().getType();
        this.c = (LinkedHashMap)new Gson().fromJson(jSONObject.toString(), type);
    }

    public final void f(String string) {
        this.e = string;
    }

    public final void g(HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return;
        }
        this.d = new Gson().toJson((Object)hashMap);
    }

    public final void h() {
        this.e = "application/x-mpegURL";
    }

    public final void j() {
        this.e = "application/octet-stream";
    }

    public final void k(int n2, int n3, int n4, int n5) {
        if (n2 <= 0) {
            n2 = Integer.MAX_VALUE;
        }
        this.m = n2;
        if (n4 <= 0) {
            n4 = Integer.MAX_VALUE;
        }
        this.o = n4;
        if (n5 <= 0) {
            n5 = Integer.MAX_VALUE;
        }
        this.p = n5;
        if (n3 <= 0) {
            n3 = Integer.MAX_VALUE;
        }
        this.n = n3;
    }

    public final void l() {
        this.k = 1;
    }

    public final void m(int n2) {
        this.k = n2;
    }

    public final String toString() {
        Object object = this.f;
        if ((object == null || ((String)object).trim().isEmpty()) && (object = this.i) != null) {
            object = object instanceof String ? (String)object : (object instanceof List ? (!(object = (List)object).isEmpty() && object.get(0) != null ? String.valueOf(object.get(0)) : "") : String.valueOf(object));
            object = C.M("", (String)object);
            if (object != null && !((String)object).trim().isEmpty()) {
                this.f = object;
            }
        }
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson((Object)this);
    }

    public final void v(ArrayList arrayList) {
        this.j = arrayList;
    }

    public final void w(String string) {
        this.i = string;
    }

    public final void x(ArrayList arrayList) {
        this.i = arrayList;
    }

    public final void y(List list) {
        this.b = list;
    }
}

