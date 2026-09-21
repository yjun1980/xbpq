/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class g {
    @SerializedName(value="default_drive_id")
    private String a;
    @SerializedName(value="user_id")
    private String b;
    @SerializedName(value="token_type")
    private String c;
    @SerializedName(value="access_token")
    private String d;
    @SerializedName(value="refresh_token")
    private String e;

    public static g f(String object) {
        g g2 = (g)new Gson().fromJson((String)object, g.class);
        object = g2;
        if (g2 == null) {
            object = new g();
        }
        return object;
    }

    public final g a() {
        this.e = "";
        this.d = "";
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }

    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = TextUtils.isEmpty((CharSequence)this.c);
        String string = "";
        String string2 = bl ? "" : this.c;
        stringBuilder.append(string2);
        stringBuilder.append(cYh.d("47"));
        string2 = TextUtils.isEmpty((CharSequence)this.d) ? string : this.d;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final g g() {
        l.g(p.o().x(), this.toString());
        return this;
    }

    public final void h(String string) {
        this.e = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

