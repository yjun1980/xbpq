/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.Q;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName(value="source_name")
    private String a;
    @SerializedName(value="url")
    private String b;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b.replaceAll("ftp", "tvbox-xg:ftp");
        return string;
    }
}

