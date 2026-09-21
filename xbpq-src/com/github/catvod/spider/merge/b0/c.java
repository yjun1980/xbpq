/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.b0;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.S;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class c {
    @SerializedName(value="cookie")
    private String a;
    public String b = "";

    public final c a() {
        this.a = "";
        m.y("115 cookie\u5df2\u6e05\u7a7a\uff01");
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final c c() {
        Init.execute(new S(this, 4));
        return this;
    }

    public final void d(String string) {
        this.a = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

