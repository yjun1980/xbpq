/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.W;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.U;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName(value="user_name")
    private String a;
    @SerializedName(value="user_password")
    private String b;
    @SerializedName(value="auth")
    private String c;
    @SerializedName(value="code")
    private String d;
    @SerializedName(value="app_auth")
    private String e;
    @SerializedName(value="refresh_token")
    private String f;
    @SerializedName(value="user_id")
    private String g;

    public final a a() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.e = "";
        this.f = "";
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.g) ? "" : this.g;
        return string;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String f() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final a g() {
        Init.execute(new U(this, 2));
        return this;
    }

    public final void h(String string) {
        this.c = string;
    }

    public final void i(String string) {
        this.d = string;
    }

    public final void j(String string) {
        this.f = string;
    }

    public final void k(String string) {
        this.g = string;
    }

    public final void l(String string) {
        this.a = string;
    }

    public final void m(String string) {
        this.b = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

