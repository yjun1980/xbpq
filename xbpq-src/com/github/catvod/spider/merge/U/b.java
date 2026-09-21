/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.U;

import android.text.TextUtils;
import com.github.catvod.spider.merge.K.h;
import com.google.gson.annotations.SerializedName;

public final class b {
    @SerializedName(value="title")
    private String a;
    @SerializedName(value="page_url")
    private String b;
    @SerializedName(value="insert_time")
    private String c;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String b() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.a);
        String string = "";
        if (!bl) {
            string = this.a.replaceAll("<em>", "").replaceAll("</em>", "");
        }
        return string;
    }

    public final h c() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.b);
        String string = "";
        String string2 = bl ? "" : this.b;
        String string3 = this.b();
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            string = this.c;
        }
        return new h(string2, string3, "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", string);
    }

    public final b d(String string) {
        this.b = string;
        return this;
    }
}

