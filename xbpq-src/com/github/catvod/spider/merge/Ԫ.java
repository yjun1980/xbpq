/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u037f;
import com.github.catvod.spider.merge.\u0528;
import com.github.catvod.spider.merge.\u052c;
import com.github.catvod.spider.merge.\u052e;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class \u052a {
    @SerializedName(value="class")
    private List<\u037f> \u037f;
    @SerializedName(value="list")
    private List<\u052e> \u0528;
    @SerializedName(value="filters")
    private LinkedHashMap<String, List<\u0528>> \u0529;
    @SerializedName(value="url")
    private Object \u052a;
    @SerializedName(value="subs")
    private List<\u052c> \u052b;
    @SerializedName(value="page")
    private Integer \u052c;
    @SerializedName(value="pagecount")
    private Integer \u052d;
    @SerializedName(value="limit")
    private Integer \u052e;
    @SerializedName(value="total")
    private Integer \u052f;

    public static \u052a \u0529() {
        return new \u052a();
    }

    public static String \u052d(\u052e \u052f) {
        return com.github.catvod.spider.merge.\u052a.\u0529().\u0780(\u052f).\u052c();
    }

    public static String \u052e(List<\u052e> list) {
        return com.github.catvod.spider.merge.\u052a.\u0529().\u0781(list).\u052c();
    }

    public static String \u052f(List<\u037f> list, LinkedHashMap<String, List<\u0528>> linkedHashMap) {
        return com.github.catvod.spider.merge.\u052a.\u0529().\u037f(list).\u0528(linkedHashMap).\u052c();
    }

    public String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson((Object)this);
    }

    public \u052a \u037f(List<\u037f> list) {
        this.\u037f = list;
        return this;
    }

    public \u052a \u0528(LinkedHashMap<String, List<\u0528>> linkedHashMap) {
        this.\u0529 = linkedHashMap;
        return this;
    }

    public \u052a \u052a() {
        return this.\u052b(1, 1, 0, 1);
    }

    public \u052a \u052b(int n2, int n3, int n4, int n5) {
        if (n2 <= 0) {
            n2 = Integer.MAX_VALUE;
        }
        this.\u052c = n2;
        if (n4 <= 0) {
            n4 = Integer.MAX_VALUE;
        }
        this.\u052e = n4;
        if (n5 <= 0) {
            n5 = Integer.MAX_VALUE;
        }
        this.\u052f = n5;
        if (n3 <= 0) {
            n3 = Integer.MAX_VALUE;
        }
        this.\u052d = n3;
        return this;
    }

    public String \u052c() {
        return this.toString();
    }

    public \u052a \u058f(List<\u052c> list) {
        this.\u052b = list;
        return this;
    }

    public \u052a \u0620(String string) {
        this.\u052a = string;
        return this;
    }

    public \u052a \u0780(\u052e \u052f) {
        this.\u0528 = Arrays.asList(\u052f);
        return this;
    }

    public \u052a \u0781(List<\u052e> list) {
        this.\u0528 = list;
        return this;
    }
}

