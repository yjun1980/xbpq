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

public final class b {
    @SerializedName(value="redirectUri")
    private String a;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string.split("code=")[1];
    }
}

