/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.JsonElement
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import android.text.TextUtils;
import com.github.catvod.spider.merge.O.a;
import com.github.catvod.spider.merge.O.d;
import com.github.catvod.spider.merge.O.e;
import com.github.catvod.spider.merge.O.j;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class b {
    @SerializedName(value="result")
    private JsonElement a;
    @SerializedName(value="list")
    private JsonElement b;
    @SerializedName(value="isLogin")
    private Boolean c;
    @SerializedName(value="vipStatus")
    private Integer d;
    @SerializedName(value="qrcode_key")
    private String e;
    @SerializedName(value="url")
    private String f;
    @SerializedName(value="aid")
    private String g;
    @SerializedName(value="cid")
    private String h;
    @SerializedName(value="title")
    private String i;
    @SerializedName(value="tname")
    private String j;
    @SerializedName(value="pic")
    private String k;
    @SerializedName(value="duration")
    private Long l;
    @SerializedName(value="desc")
    private String m;
    @SerializedName(value="accept_description")
    private List<String> n;
    @SerializedName(value="accept_quality")
    private List<Integer> o;
    @SerializedName(value="pages")
    private List<e> p;
    @SerializedName(value="dash")
    private a q;
    @SerializedName(value="owner")
    private d r;
    @SerializedName(value="wbi_img")
    private j s;

    public final a a() {
        a a2;
        a a3 = a2 = this.q;
        if (a2 == null) {
            a3 = new a();
        }
        return a3;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.m) ? "" : this.m;
        return string;
    }

    public final Long c() {
        Long l2 = this.l;
        long l3 = l2 == null ? 0L : l2;
        return l3;
    }

    public final JsonElement d() {
        return this.b;
    }

    public final d e() {
        d d2;
        d d3 = d2 = this.r;
        if (d2 == null) {
            d3 = new d();
        }
        return d3;
    }

    public final List<e> f() {
        List<e> list;
        List<e> list2 = list = this.p;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.k) ? "" : this.k;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final String i() {
        String string = TextUtils.isEmpty((CharSequence)this.i) ? "" : this.i;
        return string;
    }

    public final String j() {
        String string = TextUtils.isEmpty((CharSequence)this.j) ? "" : this.j;
        return string;
    }

    public final String k() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final j l() {
        j j2;
        j j3 = j2 = this.s;
        if (j2 == null) {
            j3 = new j();
        }
        return j3;
    }

    public final boolean m() {
        Boolean bl = this.c;
        boolean bl2 = bl != null && bl != false;
        return bl2;
    }

    public final boolean n() {
        Integer n2 = this.d;
        boolean bl = n2 != null && n2 != 0;
        return bl;
    }
}

