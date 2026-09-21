/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.M;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

public final class f {
    @SerializedName(value="path")
    private String a;
    @SerializedName(value="pass")
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

