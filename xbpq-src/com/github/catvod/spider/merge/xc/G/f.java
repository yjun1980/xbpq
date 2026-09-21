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

public class f {
    @SerializedName(value="default_drive_id")
    private String a;
    @SerializedName(value="resource_drive_id")
    private String b;

    public final String a() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.b);
        String string = "";
        String string2 = bl ? "" : this.b;
        string2 = string2.isEmpty() ? (TextUtils.isEmpty((CharSequence)this.a) ? string : this.a) : (TextUtils.isEmpty((CharSequence)this.b) ? string : this.b);
        return string2;
    }
}

