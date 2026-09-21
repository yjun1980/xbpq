/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public final class d {
    @SerializedName(value="mid")
    private String a;
    @SerializedName(value="name")
    private String b;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

