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

public class j {
    @SerializedName(value="template_id")
    private String a;
    @SerializedName(value="language")
    private String b;
    @SerializedName(value="status")
    private String c;
    @SerializedName(value="url")
    private String d;

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }
}

