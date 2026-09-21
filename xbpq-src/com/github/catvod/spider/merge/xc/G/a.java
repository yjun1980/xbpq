/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.google.gson.annotations.SerializedName;

public class a {
    @SerializedName(value="refreshToken")
    private String a;
    @SerializedName(value="refresh_token")
    private String b;

    public final String a() {
        String string;
        String string2 = this.a;
        if (string2 != null && !string2.isEmpty()) {
            return this.a;
        }
        string2 = string = this.b;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }
}

