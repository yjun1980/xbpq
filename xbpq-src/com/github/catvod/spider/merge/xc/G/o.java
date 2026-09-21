/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public class o {
    @SerializedName(value="token_type")
    private String a;
    @SerializedName(value="access_token")
    private String b;
    @SerializedName(value="refresh_token")
    private String c;
    @SerializedName(value="domain_id")
    private String d;
    @SerializedName(value="default_drive_id")
    private String e;

    public final void a() {
        this.a = "";
        this.c = "";
        this.b = "";
        this.d = "";
        this.e = "";
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final boolean f() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        boolean bl = string.length() > 0 && this.b().length() > 0;
        return bl;
    }

    public final void g(String string) {
        this.c = string;
    }
}

