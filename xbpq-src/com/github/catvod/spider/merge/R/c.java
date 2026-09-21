/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.R;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.H;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class c {
    @SerializedName(value="expire")
    private String a;
    @SerializedName(value="login_type")
    private String b;
    @SerializedName(value="thread_num")
    public Integer c;
    @SerializedName(value="refresh_token_expire_time")
    private String d;
    @SerializedName(value="token")
    private String e;
    @SerializedName(value="cookie")
    private String f;
    @SerializedName(value="user_name")
    private String g;
    @SerializedName(value="user_password")
    private String h;

    public final c a() {
        this.a = "";
        this.b = "";
        this.e = "";
        this.g = "";
        this.h = "";
        m.y("p123\u672c\u5730\u6388\u6743\u4fe1\u606f\u5df2\u6e05\u7a7a\uff01\u5c06\u4f18\u5148\u8bfb\u53d6\u5728\u7ebf\u914d\u7f6e");
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.h;
    }

    public final c f() {
        Init.execute(new H(this, 2));
        return this;
    }

    public final void g(String string) {
        this.a = string;
    }

    public final void h(String string) {
        this.e = string;
    }

    public final void i(String string) {
        this.g = string;
    }

    public final void j(String string) {
        this.h = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

