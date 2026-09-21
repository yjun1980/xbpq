/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.S;

import android.text.TextUtils;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.r;
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
    @SerializedName(value="file_name")
    private String d;
    private String e;
    @SerializedName(value="pdir_fid")
    private String f;
    @SerializedName(value="file_type")
    private int g;
    @SerializedName(value="format_type")
    private String h;
    @SerializedName(value="obj_category")
    private String i;
    @SerializedName(value="size")
    private double j;
    @SerializedName(value="share_fid_token")
    private String k;
    @SerializedName(alternate={"big_thumbnail"}, value="thumb")
    private String l;

    public a(String string) {
        this.c = string;
    }

    public static a q(String string) {
        return (a)com.github.catvod.spider.merge.G1.d.a(string, a.class);
    }

    public final String b() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.c);
        String string = "";
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append("_");
            if (!TextUtils.isEmpty((CharSequence)this.k)) {
                string = this.k;
            }
            stringBuilder.append(string);
            string = stringBuilder.toString();
        }
        return string;
    }

    @Override
    public final int compareTo(Object object) {
        object = (a)object;
        return this.n().compareTo(((a)object).n());
    }

    public final String e() {
        CharSequence charSequence;
        String string = m.x(this.k());
        double d2 = this.j;
        String string2 = "";
        if (d2 == 0.0) {
            charSequence = "";
        } else {
            charSequence = com.github.catvod.spider.merge.C.a.c("[");
            ((StringBuilder)charSequence).append(m.o(this.j));
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            string2 = r.c(com.github.catvod.spider.merge.C.a.c("["), this.e, "]");
        }
        return TextUtils.join((CharSequence)" ", Arrays.asList(string, charSequence, string2, this.k())).trim();
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
        return this.f;
    }

    public final String m() {
        return this.k;
    }

    public final String n() {
        return m.x(this.k());
    }

    public final String o() {
        return this.l;
    }

    public final String p() {
        if (this.g == 0) {
            return "folder";
        }
        return "file";
    }

    public final a r(String string) {
        this.e = string;
        return this;
    }
}

