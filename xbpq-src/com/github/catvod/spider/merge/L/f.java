/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.L;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f {
    @SerializedName(value="items")
    private List<f> a;
    @SerializedName(value="next_marker")
    private String b;
    @SerializedName(value="file_id")
    private String c;
    @SerializedName(value="share_id")
    private String d;
    @SerializedName(value="name")
    private String e;
    @SerializedName(value="type")
    private String f;
    @SerializedName(value="file_extension")
    private String g;
    @SerializedName(value="category")
    private String h;
    @SerializedName(value="size")
    private double i;
    @SerializedName(value="parent")
    private String j;
    @SerializedName(value="parent_file_id")
    private String k;
    @SerializedName(alternate={"thumbnail"}, value="thumb")
    private String l;

    public f(String string) {
        this.c = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.h) ? "" : this.h;
        return string;
    }

    public final String b() {
        CharSequence charSequence;
        String string = m.x(this.f());
        if (this.i == 0.0) {
            charSequence = "";
        } else {
            charSequence = com.github.catvod.spider.merge.C.a.c("[");
            ((StringBuilder)charSequence).append(m.o(this.i));
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return TextUtils.join((CharSequence)" ", Arrays.asList(string, charSequence, this.h(), this.f())).trim();
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.g) ? "" : this.g;
        return string;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final List<f> e() {
        List<f> list;
        List<f> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String f() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : m.A(this.e);
        return string;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.j) ? "" : r.c(com.github.catvod.spider.merge.C.a.c("["), this.j, "]");
        return string;
    }

    public final String i() {
        return this.k;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return TextUtils.join((CharSequence)" ", Arrays.asList(this.h(), m.x(this.f()))).trim();
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final f n(String string) {
        this.j = string;
        return this;
    }
}

