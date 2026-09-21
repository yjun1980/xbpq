/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.L;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.G1.d;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class g {
    @SerializedName(value="token_type")
    private String a;
    @SerializedName(value="access_token")
    private String b;
    @SerializedName(value="refresh_token")
    private String c;

    public static g d(String object) {
        g g2 = (g)d.a((String)object, g.class);
        object = g2;
        if (g2 == null) {
            object = new g();
        }
        return object;
    }

    public final g a() {
        this.c = "";
        this.b = "";
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = TextUtils.isEmpty((CharSequence)this.a);
        String string = "";
        String string2 = bl ? "" : this.a;
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        string2 = TextUtils.isEmpty((CharSequence)this.b) ? string : this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final g e() {
        Init.execute(new com.github.catvod.spider.merge.I.d(this, 2));
        return this;
    }

    public final void f(String string) {
        this.b = string;
    }

    public final void g() {
        this.a = "Bearer";
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

