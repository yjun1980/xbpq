/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 *  com.thegrizzlylabs.sardineandroid.DavResource
 *  com.thegrizzlylabs.sardineandroid.Sardine
 *  com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine
 */
package com.github.catvod.spider.merge.V;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.V.a;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.lang.reflect.Type;
import java.util.List;

public final class b {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="server")
    private String b;
    @SerializedName(value="user")
    private String c;
    @SerializedName(value="pass")
    private String d;
    @SerializedName(value="path")
    private String e;
    private OkHttpSardine f;

    public b(String string) {
        this.a = string;
    }

    public static List<b> a(String string) {
        Type type = new a().getType();
        return (List)new Gson().fromJson(string, type);
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string.replace(this.d(), "");
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final Sardine e() {
        if (this.f == null) {
            OkHttpSardine okHttpSardine;
            this.f = okHttpSardine = new OkHttpSardine();
            boolean bl = TextUtils.isEmpty((CharSequence)this.c);
            String string = "";
            String string2 = bl ? "" : this.c;
            String string3 = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
            okHttpSardine.setCredentials(string2, string3);
            string2 = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
            string2 = Uri.parse((String)string2).getPath();
            if (TextUtils.isEmpty((CharSequence)string2)) {
                string2 = string;
            }
            this.e = string2;
        }
        return this.f;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.c().equals(((b)object).c());
    }

    public final h f(DavResource davResource, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c());
        stringBuilder.append(davResource.getPath());
        return new h(stringBuilder.toString(), davResource.getName(), string, m.o(davResource.getContentLength().longValue()), davResource.isDirectory());
    }
}

