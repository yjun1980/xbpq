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

public class h {
    @SerializedName(value="token_type")
    private String a;
    @SerializedName(value="access_token")
    private String b;
    @SerializedName(value="refresh_token")
    private String c;

    public final void a() {
        this.a = "";
        this.c = "";
        this.b = "";
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
}

