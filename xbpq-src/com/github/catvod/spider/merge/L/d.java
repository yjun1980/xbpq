/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.L;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public final class d {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="cdn_url")
    private String b;
    @SerializedName(value="file_id")
    private String c;
    @SerializedName(value="expiration")
    private String d;

    public static d c(String string) {
        return (d)com.github.catvod.spider.merge.G1.d.a(string, d.class);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

