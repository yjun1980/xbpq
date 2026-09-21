/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.O;

import com.google.gson.annotations.SerializedName;

public class c {
    @SerializedName(value="cookie")
    private String a = "";
    @SerializedName(value="refresh_token")
    private String b;
    @SerializedName(value="device_id")
    private String c;
    @SerializedName(value="vip")
    private boolean d;
    @SerializedName(value="svip")
    private boolean e;

    public final String a() {
        String string;
        String string2 = string = this.a;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final boolean b() {
        return this.e;
    }

    public final void c(String string) {
        this.a = string;
    }

    public final void d(boolean bl) {
        this.e = bl;
    }

    public final void e(boolean bl) {
        this.d = bl;
    }
}

