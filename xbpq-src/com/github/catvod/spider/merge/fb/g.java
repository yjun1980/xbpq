/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.fb;

import com.github.catvod.spider.merge.fb.f;
import com.google.gson.annotations.SerializedName;

public final class g {
    @SerializedName(value="type_name")
    private String a;
    @SerializedName(value="vod_id")
    private String b;
    @SerializedName(value="vod_name")
    private String c;
    @SerializedName(value="vod_pic")
    private String d;
    @SerializedName(value="vod_remarks")
    private String e;
    @SerializedName(value="vod_year")
    private String f;
    @SerializedName(value="vod_area")
    private String g;
    @SerializedName(value="vod_actor")
    private String h;
    @SerializedName(value="vod_director")
    private String i;
    @SerializedName(value="vod_content")
    private String j;
    @SerializedName(value="vod_play_from")
    private String k;
    @SerializedName(value="vod_play_url")
    private String l;
    @SerializedName(value="vod_tag")
    private String m;
    @SerializedName(value="style")
    private f n;

    public g() {
    }

    public g(String string, String string2, String string3, String string4, boolean bl) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        string = bl ? "folder" : "file";
        this.m = string;
    }

    public final void a(String string) {
        this.a = string;
    }

    public final void b(String string) {
        this.h = string;
    }

    public final void c(String string) {
        this.g = string;
    }

    public final void d(String string) {
        this.j = string;
    }

    public final void e(String string) {
        this.i = string;
    }

    public final void f(String string) {
        this.b = string;
    }

    public final void g(String string) {
        this.c = string;
    }

    public final void h(String string) {
        this.d = string;
    }

    public final void i(String string) {
        this.k = string;
    }

    public final void j(String string) {
        this.l = string;
    }

    public final void k(String string) {
        this.e = string;
    }

    public final void l(String string) {
        this.f = string;
    }
}

