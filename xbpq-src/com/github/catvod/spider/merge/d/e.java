/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.j.o;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e {
    @SerializedName(value="items")
    private List<e> a;
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

    public e(String string) {
        this.c = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.h) ? "" : this.h;
        return string;
    }

    public final String b() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.j);
        CharSequence charSequence = "";
        String string = cYh.d("3A");
        String string2 = cYh.d("3C");
        Object object = bl ? "" : n.b(com.github.catvod.spider.merge.d.d.b(string2), this.j, string);
        String string3 = this.f();
        if (this.i != 0.0) {
            charSequence = com.github.catvod.spider.merge.d.d.b(string2);
            ((StringBuilder)charSequence).append(o.c(this.i));
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object = Arrays.asList(object, string3, charSequence);
        return TextUtils.join((CharSequence)cYh.d("47"), (Iterable)object).trim();
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.g) ? "" : this.g;
        return string;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final List<e> e() {
        List<e> list;
        List<e> list2 = list = this.a;
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
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final e i(String string) {
        this.j = string;
        return this;
    }
}

