/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public final class d {
    @SerializedName(value="username")
    private String a;
    @SerializedName(value="password")
    private String b;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

