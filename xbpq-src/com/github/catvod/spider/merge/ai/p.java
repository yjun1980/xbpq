/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.ai;

import android.text.TextUtils;
import com.github.catvod.spider.merge.ai.l;
import com.github.catvod.spider.merge.ai.m;
import com.google.gson.annotations.SerializedName;

public final class p {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="url")
    private String b;
    @SerializedName(value="icon")
    private String c;
    @SerializedName(value="copy")
    private String d;
    @SerializedName(value="version")
    private String e;

    public p(String string) {
        this.b = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final m c() {
        String string = this.b();
        String string2 = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        String string3 = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        String string4 = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return new m(string, string2, string3, string4, new l(Float.valueOf(1.0f)));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        object = (p)object;
        return this.b().equals(((p)object).b());
    }
}

