/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class g {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="surl")
    private String b;
    @SerializedName(value="pwd")
    private String c;

    public g(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

