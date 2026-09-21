/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.L;

import com.google.gson.annotations.SerializedName;

public class c {
    @SerializedName(value="cookie")
    private String a = "";
    @SerializedName(value="isVip")
    private boolean b = false;
    @SerializedName(value="isSvip")
    private boolean c;

    public final String a() {
        String string = this.a;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(String string) {
        this.a = string;
    }

    public final void e(boolean bl) {
        this.c = bl;
    }

    public final void f(boolean bl) {
        this.b = bl;
    }
}

