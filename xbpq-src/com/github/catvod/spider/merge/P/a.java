/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.P;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName(value="access_token")
    private String a;
    @SerializedName(value="refresh_token")
    private String b;

    public final a a() {
        X.n().e.a = "";
        X.n().e.b = "";
        X.n().e.d();
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final a d() {
        Init.execute(new c(this, 2));
        return this;
    }

    public final void e(String string) {
        this.a = string;
    }

    public final void f(String string) {
        this.b = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

