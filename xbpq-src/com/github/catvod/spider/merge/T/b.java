/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.T;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.n0;
import com.github.catvod.spider.merge.T.a;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class b {
    @SerializedName(value="pdir_fid")
    private String a;
    @SerializedName(value="cookie")
    private String b;
    @SerializedName(value="thread_num")
    public Integer c;
    private long d;
    @SerializedName(value="member_type")
    private String e;
    @SerializedName(value="token")
    private String f;
    @SerializedName(value="ut")
    private String g;
    @SerializedName(value="access_token")
    public String h;

    public static b i(String object) {
        b b2 = (b)com.github.catvod.spider.merge.G1.d.a((String)object, b.class);
        object = b2;
        if (b2 == null) {
            object = new b();
            ((b)object).d = 0L;
        }
        return object;
    }

    public final b a() {
        this.a = "";
        this.b = "";
        this.f = "";
        this.g = "";
        this.d = 0L;
        m.y("UC\u672c\u5730\u6388\u6743\u4fe1\u606f\u5df2\u6e05\u7a7a\uff01\u5c06\u4f18\u5148\u8bfb\u53d6\u5728\u7ebf\u914d\u7f6e");
        return this;
    }

    public final Integer b() {
        Integer n2 = this.c;
        boolean bl = n2 == null;
        if (bl) {
            n2 = com.github.catvod.spider.merge.T.a.e(this.e);
        }
        return n2;
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final b j() {
        Init.execute(new n0(this, 2));
        return this;
    }

    public final void k(String string) {
        this.b = string;
    }

    public final void l(String string) {
        this.a = string;
    }

    public final void m(long l2) {
        this.d = l2;
    }

    public final void n(String string) {
        this.e = string;
    }

    public final void o(String string) {
        this.f = string;
    }

    public final void p(String string) {
        this.g = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

