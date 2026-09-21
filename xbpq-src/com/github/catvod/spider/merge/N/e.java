/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.N.d;
import com.google.gson.annotations.SerializedName;

public final class e {
    @SerializedName(value="errno")
    private int a;
    @SerializedName(value="data")
    private d b;
    @SerializedName(value="error")
    private String c;

    public final d a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final void c(d d2) {
        this.b = d2;
    }

    public final void d() {
        this.a = 0;
    }
}

