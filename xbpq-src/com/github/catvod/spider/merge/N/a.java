/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName(value="surl")
    private String a;
    @SerializedName(value="randsk")
    private String b;
    @SerializedName(value="uk")
    private String c;
    @SerializedName(value="shareid")
    private String d;
    @SerializedName(value="dir")
    private String e;
    @SerializedName(value="page")
    private int f;
    @SerializedName(value="isRoot")
    private boolean g;

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    public final void h(String string) {
        this.e = string;
    }

    public final void i(int n2) {
        this.f = n2;
    }

    public final void j(String string) {
        this.b = string;
    }

    public final void k(boolean bl) {
        this.g = bl;
    }

    public final void l(String string) {
        this.d = string;
    }

    public final void m(String string) {
        this.a = string;
    }

    public final void n(String string) {
        this.c = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

