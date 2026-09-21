/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.en.NetPan;
import com.google.gson.annotations.SerializedName;

public final class h {
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
    @SerializedName(value="action")
    private String k;
    @SerializedName(value="vod_play_from")
    private String l;
    @SerializedName(value="vod_play_url")
    private String m;
    @SerializedName(value="vod_tag")
    private String n;

    public h() {
    }

    public h(String string, String string2, String string3) {
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public h(String string, String string2, String string3, String string4) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public h(String string, String string2, String string3, String string4, String string5) {
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.k = string;
    }

    public h(String string, String string2, String string3, String string4, boolean bl) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        string = bl ? "folder" : "file";
        this.n = string;
    }

    public final String a() {
        return NetPan.getNetPanType(this.b);
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.m;
    }

    public final void g(String string) {
        this.a = string;
    }

    public final void h(String string) {
        this.h = string;
    }

    public final void i(String string) {
        this.g = string;
    }

    public final void j(String string) {
        this.j = string;
    }

    public final void k(String string) {
        this.i = string;
    }

    public final void l(String string) {
        this.b = string;
    }

    public final void m(String string) {
        this.c = string;
    }

    public final void n(String string) {
        this.d = string;
    }

    public final void o(String string) {
        this.l = string;
    }

    public final void p(String string) {
        this.m = string;
    }

    public final void q(String string) {
        this.e = string;
    }

    public final void r(String string) {
        this.n = string;
    }

    public final void s(String string) {
        this.f = string;
    }
}

