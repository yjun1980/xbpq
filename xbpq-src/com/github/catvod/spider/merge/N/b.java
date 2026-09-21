/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.google.gson.annotations.SerializedName;

public final class b {
    @SerializedName(value="fs_id")
    private long a;
    @SerializedName(value="isdir")
    private int b;
    @SerializedName(value="server_filename")
    private String c;
    @SerializedName(value="size")
    private long d;
    @SerializedName(value="path")
    private String e;

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final long e() {
        return this.d;
    }
}

