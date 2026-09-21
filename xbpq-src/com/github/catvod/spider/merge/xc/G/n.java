/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import android.text.TextUtils;
import com.github.catvod.spider.merge.xc.G.g;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public class n {
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
    @SerializedName(value="file_infos")
    private List<g> p;
    public long q;

    public final boolean a(String string) {
        String string2 = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        boolean bl = string2.equals(string) && System.currentTimeMillis() <= this.q;
        return bl;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.k) ? "" : this.k;
        return string;
    }

    public final List c() {
        List<g> list;
        List<g> list2 = list = this.p;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.l) ? "" : this.l;
        return string;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final void f(String string) {
        this.a = string;
    }
}

