/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.fb;

import com.github.catvod.spider.merge.fb.a;
import com.github.catvod.spider.merge.fb.c;
import com.github.catvod.spider.merge.fb.e;
import com.github.catvod.spider.merge.fb.g;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d {
    @SerializedName(value="class")
    private List<a> a;
    @SerializedName(value="list")
    private List<g> b;
    @SerializedName(value="filters")
    private LinkedHashMap<String, List<c>> c;
    @SerializedName(value="header")
    private String d;
    @SerializedName(value="format")
    private String e;
    @SerializedName(value="url")
    private String f;
    @SerializedName(value="subs")
    private List<e> g;
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

    public static String e(g g2) {
        d d2 = new d();
        d2.b = Arrays.asList(g2);
        return d2.toString();
    }

    public static String f(List<g> list) {
        d d2 = new d();
        d2.b = list;
        return d2.toString();
    }

    public static String g(List<a> list, LinkedHashMap<String, List<c>> linkedHashMap) {
        d d2 = new d();
        d2.a = list;
        d2.c = linkedHashMap;
        return d2.toString();
    }

    public final d a(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.d = new Gson().toJson(map);
        return this;
    }

    public final d b() {
        this.i = 1;
        return this;
    }

    public final d c() {
        this.j = 1;
        this.l = Integer.MAX_VALUE;
        this.m = 1;
        this.k = 1;
        return this;
    }

    public final d d() {
        this.h = 1;
        return this;
    }

    public final d h(List<e> list) {
        this.g = list;
        return this;
    }

    public final d i(String string) {
        this.f = string;
        return this;
    }

    public final d j(List<g> list) {
        this.b = list;
        return this;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

