/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.K;

import com.google.gson.annotations.SerializedName;

public class c {
    @SerializedName(value="expire")
    private long a;
    @SerializedName(value="cookie")
    private String b;
    @SerializedName(value="userName")
    private String c;
    @SerializedName(value="password")
    private String d;

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final void e(String string) {
        this.b = string;
    }

    public final void f(long l2) {
        this.a = l2;
    }

    public final void g(String string) {
        this.d = string;
    }

    public final void h(String string) {
        this.c = string;
    }
}

