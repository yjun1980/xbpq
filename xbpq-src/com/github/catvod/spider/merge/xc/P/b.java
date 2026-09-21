/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.P;

import com.google.gson.annotations.SerializedName;

public class b {
    @SerializedName(value="access_token")
    private String a = "";
    @SerializedName(value="refresh_token")
    private String b = "";
    @SerializedName(value="user_id")
    private String c = "";
    @SerializedName(value="username")
    private String d = "";
    @SerializedName(value="device_id")
    private String e = "";

    public final String a() {
        String string = this.a;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final String b() {
        String string = this.e;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final String c() {
        String string = this.b;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final String d() {
        String string = this.c;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final String e() {
        String string = this.d;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final void f(String string) {
        this.a = string;
    }

    public final void g(String string) {
        this.e = string;
    }

    public final void h(String string) {
        this.b = string;
    }

    public final void i(String string) {
        this.c = string;
    }

    public final void j(String string) {
        this.d = string;
    }
}

