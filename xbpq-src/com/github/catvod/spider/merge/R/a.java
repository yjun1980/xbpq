/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.R;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a
implements Comparable<a> {
    @SerializedName(value="InfoList")
    private List<a> a;
    @SerializedName(value="shareKey")
    private String b;
    @SerializedName(value="FileId")
    private Long c;
    @SerializedName(value="FileName")
    private String d;
    @SerializedName(value="pdir_fid")
    private String e;
    @SerializedName(value="Type")
    private int f;
    @SerializedName(value="S3KeyFlag")
    private String g;
    @SerializedName(value="Category")
    private String h;
    @SerializedName(value="Size")
    private String i;
    @SerializedName(value="Etag")
    private String j;
    @SerializedName(alternate={"big_thumbnail"}, value="thumb")
    private String k;

    public final String b() {
        CharSequence charSequence;
        String string = m.x(this.j());
        long l2 = Long.parseLong(this.i);
        String string2 = "";
        if (l2 == 0L) {
            charSequence = "";
        } else {
            charSequence = com.github.catvod.spider.merge.C.a.c("[");
            ((StringBuilder)charSequence).append(m.o(Double.parseDouble(this.i)));
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            string2 = r.c(com.github.catvod.spider.merge.C.a.c("["), this.e, "]");
        }
        return TextUtils.join((CharSequence)" ", Arrays.asList(string, charSequence, string2, this.j())).trim();
    }

    @Override
    public final int compareTo(Object object) {
        object = (a)object;
        return this.m().compareTo(((a)object).m());
    }

    public final String e() {
        return this.j;
    }

    public final Long h() {
        return this.c;
    }

    public final List<a> i() {
        List<a> list;
        List<a> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String j() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : m.A(this.d);
        return string;
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return String.valueOf(this.i);
    }

    public final String m() {
        return m.x(this.j());
    }

    public final String n() {
        if (this.f == 1) {
            return "folder";
        }
        return "file";
    }
}

