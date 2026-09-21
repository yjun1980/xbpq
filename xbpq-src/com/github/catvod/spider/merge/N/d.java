/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.N.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class d {
    @SerializedName(value="uk")
    private String a;
    @SerializedName(value="share_id")
    private String b;
    @SerializedName(value="title")
    private String c;
    @SerializedName(value="list")
    private List<b> d;

    public final List<b> a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }
}

