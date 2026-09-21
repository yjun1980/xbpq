/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.i0.h;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class c {
    @SerializedName(value="key")
    private String a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="value")
    private List<b> c;

    public c(String string, String string2, List<b> list) {
        this.a = string;
        int n2 = h.a;
        this.b = string2;
        this.c = list;
    }
}

