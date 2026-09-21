/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.b0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a
implements Comparable<a> {
    @SerializedName(value="list")
    private List<a> a;
    @SerializedName(value="is_owner")
    private int b;
    @SerializedName(value="fid")
    private String c;
    @SerializedName(value="n")
    private String d;
    @SerializedName(value="cid")
    private String e;
    @SerializedName(value="fc")
    private int f;
    @SerializedName(value="format_type")
    private String g;
    @SerializedName(value="ico")
    private String h;
    @SerializedName(value="s")
    private double i;
    @SerializedName(value="sha")
    private String j;
    @SerializedName(alternate={"big_thumbnail"}, value="thumb")
    private String k;

    public a(String string) {
        this.c = string;
        this.e = string;
    }

    public final String b() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.c);
        String string = "";
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append("_");
            if (!TextUtils.isEmpty((CharSequence)this.j)) {
                string = this.j;
            }
            stringBuilder.append(string);
            string = stringBuilder.toString();
        }
        return string;
    }

    @Override
    public final int compareTo(Object object) {
        object = (a)object;
        return this.p().compareTo(((a)object).p());
    }

    public final String e() {
        return TextUtils.join((CharSequence)" ", Arrays.asList(m.x(this.k()), this.o(), this.l(), this.k())).trim();
    }

    public final String h() {
        String string;
        if (this.d.contains(".")) {
            string = this.d;
            string = string.substring(string.lastIndexOf(".") + 1).toLowerCase();
        } else {
            string = "";
        }
        return string;
    }

    public final String i() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final List<a> j() {
        List<a> list;
        List<a> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String k() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : m.A(this.d);
        return string;
    }

    public final String l() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final String m() {
        return this.j;
    }

    public final double n() {
        return this.i;
    }

    public final String o() {
        CharSequence charSequence;
        if (this.i == 0.0) {
            charSequence = "";
        } else {
            charSequence = com.github.catvod.spider.merge.C.a.c("[");
            ((StringBuilder)charSequence).append(m.o(this.i));
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    public final String p() {
        return m.x(this.k());
    }

    public final String q() {
        return this.k;
    }

    public final String r() {
        if (this.f == 0) {
            return "folder";
        }
        return "file";
    }

    public final a s(String string) {
        this.e = string;
        return this;
    }
}

