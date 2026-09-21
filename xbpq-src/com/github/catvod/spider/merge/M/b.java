/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.M;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.M.a;
import com.github.catvod.spider.merge.M.e;
import com.github.catvod.spider.merge.M.f;
import com.github.catvod.spider.merge.f0.d;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b {
    @SerializedName(value="params")
    private List<f> a;
    @SerializedName(value="login")
    private e b;
    @SerializedName(value="name")
    private String c;
    @SerializedName(value="server")
    private String d;
    @SerializedName(value="version")
    private int e;
    @SerializedName(value="path")
    private String f;
    @SerializedName(value="token")
    private String g;
    @SerializedName(value="search")
    private Boolean h;
    @SerializedName(value="hidden")
    private Boolean i;

    public b(String string) {
        this.c = string;
    }

    public static List<b> a(String string) {
        Type type = new a().getType();
        return (List)new Gson().fromJson(string, type);
    }

    public final b b() {
        CharSequence charSequence;
        if (this.f == null) {
            boolean bl = TextUtils.isEmpty((CharSequence)this.d);
            String string = "";
            charSequence = bl ? "" : this.d;
            if (TextUtils.isEmpty((CharSequence)(charSequence = Uri.parse((String)charSequence).getPath()))) {
                charSequence = string;
            }
            this.f = charSequence;
        }
        if (this.e == 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e());
            ((StringBuilder)charSequence).append("/api/public/settings");
            int n2 = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)charSequence).toString()).contains("v2.") ? 2 : 3;
            this.e = n2;
        }
        return this;
    }

    public final String c(String string) {
        Object object;
        Object object2 = object = this.a;
        if (object == null) {
            object2 = new ArrayList<f>();
        }
        object = object2.iterator();
        while (object.hasNext()) {
            object2 = (f)object.next();
            if (!string.startsWith(((f)object2).b())) continue;
            return ((f)object2).a();
        }
        return "";
    }

    public final HashMap<String, String> d() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        String string = TextUtils.isEmpty((CharSequence)this.g) ? "" : this.g;
        if (!string.isEmpty()) {
            hashMap.put("Authorization", this.g);
        }
        return hashMap;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string.replace(this.h(), "");
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.g().equals(((b)object).g());
    }

    public final e f() {
        return this.b;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string;
    }

    public final Boolean i() {
        Boolean bl = this.i;
        boolean bl2 = bl != null && bl != false;
        return bl2;
    }

    public final boolean j() {
        boolean bl = this.e == 3;
        return bl;
    }

    public final String k(String string) {
        HashMap hashMap;
        if (this.j()) {
            hashMap = r.e("keywords", string);
            hashMap.put("page", 1);
            hashMap.put("parent", "/");
            hashMap.put("per_page", 100);
            string = new Gson();
        } else {
            hashMap = com.github.catvod.spider.merge.A.c.b("keyword", string, "path", "/");
            string = new Gson();
        }
        return string.toJson((Object)hashMap);
    }

    public final Boolean l() {
        Boolean bl = this.h;
        boolean bl2 = bl == null || bl.booleanValue();
        return bl2;
    }

    public final void m(String string) {
        this.g = string;
    }
}

