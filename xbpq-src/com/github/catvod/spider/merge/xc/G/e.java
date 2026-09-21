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

public class e {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="file_id")
    private String b;
    @SerializedName(value="expiration")
    private String c;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

