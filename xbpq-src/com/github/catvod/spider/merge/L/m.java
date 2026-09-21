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
import com.github.catvod.spider.merge.I.S;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class m {
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
    @SerializedName(value="signature")
    private String f;
    @SerializedName(value="device_id")
    private String g;

    public static m j(String object) {
        m m2 = (m)com.github.catvod.spider.merge.G1.d.a((String)object, m.class);
        object = m2;
        if (m2 == null) {
            object = new m();
        }
        return object;
    }

    public final m a() {
        this.e = "";
        this.d = "";
        com.github.catvod.spider.merge.i0.m.y("\u963f\u91cc token\u5df2\u6e05\u7a7a\uff01");
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }

    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String f() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final boolean i() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        boolean bl = string.length() > 0 && this.b().length() > 0;
        return bl;
    }

    public final m k() {
        Init.execute(new S(this, 2));
        return this;
    }

    public final void l(String string) {
        this.e = string;
    }

    public final void m(String string) {
        this.f = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

