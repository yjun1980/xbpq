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
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.L.f;
import com.github.catvod.spider.merge.L.j;
import com.github.catvod.spider.merge.i0.h;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class k {
    @SerializedName(value="share_id")
    private String a;
    @SerializedName(value="share_token")
    private String b;
    @SerializedName(value="expire_time")
    private String c;
    @SerializedName(value="expires_in")
    private int d;
    @SerializedName(value="creator_id")
    private String e;
    @SerializedName(value="creator_name")
    private String f;
    @SerializedName(value="creator_phone")
    private String g;
    @SerializedName(value="expiration")
    private String h;
    @SerializedName(value="updated_at")
    private String i;
    @SerializedName(value="vip")
    private String j;
    @SerializedName(value="avatar")
    private String k;
    @SerializedName(value="share_name")
    private String l;
    @SerializedName(value="display_name")
    private String m;
    @SerializedName(value="share_title")
    private String n;
    @SerializedName(value="has_pwd")
    private boolean o;
    @SerializedName(value="share_pwd")
    private String p = "";
    @SerializedName(value="share_type")
    private String q = "";
    @SerializedName(value="search")
    private boolean r = true;
    @SerializedName(value="file_infos")
    private List<f> s;
    @SerializedName(value="share_index")
    private String t = "";
    private long u;

    public static List<k> b(String object) {
        Object object2 = new j().getType();
        object2 = (List)new Gson().fromJson((String)object, (Type)object2);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = (k)iterator.next();
            String string = ((k)object).l;
            int n2 = com.github.catvod.spider.merge.i0.h.a;
            ((k)object).l = string;
            ((k)object).a = ((k)object).a;
        }
        return object2;
    }

    public static k n(String string) {
        return (k)com.github.catvod.spider.merge.G1.d.a(string, k.class);
    }

    public final boolean a(String string) {
        boolean bl = this.g().equals(string) && System.currentTimeMillis() <= this.u;
        return bl;
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.k) ? "" : this.k;
        return string;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final List<f> e() {
        List<f> list;
        List<f> list2 = list = this.s;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final boolean f() {
        return this.r;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String h() {
        return this.t;
    }

    public final String i() {
        String string = TextUtils.isEmpty((CharSequence)this.l) ? "" : this.l;
        return string;
    }

    public final String j() {
        return this.p;
    }

    public final String k() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String l() {
        return this.q;
    }

    public final boolean m() {
        return this.o;
    }

    public final k o(String string) {
        this.a = string;
        return this;
    }

    public final void p(String string) {
        this.b = string;
    }

    public final k q() {
        this.u = System.currentTimeMillis() + 3600000L;
        return this;
    }
}

