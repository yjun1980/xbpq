/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public class \u0781 {
    @SerializedName(value="path")
    private String \u037f;
    @SerializedName(value="pass")
    private String \u0528;

    public String \u037f() {
        String string = TextUtils.isEmpty((CharSequence)this.\u0528) ? "" : this.\u0528;
        return string;
    }

    public String \u0528() {
        String string = TextUtils.isEmpty((CharSequence)this.\u037f) ? "" : this.\u037f;
        return string;
    }
}

