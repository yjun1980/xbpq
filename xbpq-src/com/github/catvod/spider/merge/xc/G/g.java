/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import android.text.TextUtils;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.H;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g
implements Comparable<g> {
    @SerializedName(value="items")
    private List<g> a;
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

    public g(String string) {
        this.c = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.h) ? "" : this.h;
        return string;
    }

    public final String b() {
        CharSequence charSequence;
        if (this.i == 0.0) {
            charSequence = "";
        } else {
            charSequence = new StringBuilder("[");
            ((StringBuilder)charSequence).append(H.i(this.i));
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return TextUtils.join((CharSequence)" ", Arrays.asList(charSequence, this.h(), this.f())).trim();
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.g) ? "" : this.g;
        return string;
    }

    @Override
    public final int compareTo(Object object) {
        object = (g)object;
        return TextUtils.join((CharSequence)" ", Arrays.asList(this.h(), H.g(this.f()))).trim().compareTo(TextUtils.join((CharSequence)" ", Arrays.asList(((g)object).h(), H.g(((g)object).f()))).trim());
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final List e() {
        List<g> list;
        List<g> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String f() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.j) ? "" : m.h(new StringBuilder("["), this.j, "]");
        return string;
    }

    public final String i() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final void j(String string) {
        this.j = string;
    }
}

