/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.ai.j;
import com.github.catvod.spider.merge.ai.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public final class k {
    @SerializedName(value="class")
    private List<j> a;
    @SerializedName(value="list")
    private List<m> b;
    @SerializedName(value="filters")
    private LinkedHashMap<String, List<Object>> c;
    @SerializedName(value="header")
    private String d;
    @SerializedName(value="format")
    private String e;
    @SerializedName(value="danmaku")
    private String f;
    @SerializedName(value="url")
    private Object g;
    @SerializedName(value="subs")
    private List<Object> h;
    @SerializedName(value="parse")
    private int i;
    @SerializedName(value="jx")
    private int j;
    @SerializedName(value="page")
    private Integer k;
    @SerializedName(value="pagecount")
    private Integer l;
    @SerializedName(value="limit")
    private Integer m;
    @SerializedName(value="total")
    private Integer n;

    public static String b(m m2) {
        k k2 = new k();
        k2.b = Arrays.asList(m2);
        return k2.toString();
    }

    public static String c(List<j> list, List<m> list2) {
        k k2 = new k();
        k2.a = list;
        k2.b = list2;
        return k2.toString();
    }

    public final k a() {
        this.k = 1;
        this.m = Integer.MAX_VALUE;
        this.n = 1;
        this.l = 1;
        return this;
    }

    public final k d(List<m> list) {
        this.b = list;
        return this;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson((Object)this);
    }
}

