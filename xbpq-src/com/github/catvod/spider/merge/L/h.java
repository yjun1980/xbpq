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

public final class h {
    @SerializedName(value="domain_id")
    private String a;
    @SerializedName(value="drive_id")
    private String b;
    @SerializedName(value="file_id")
    private String c;
    @SerializedName(value="code")
    private String d;
    @SerializedName(value="message")
    private String e;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }
}

