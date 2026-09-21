/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.c.b;
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
        this.b = string2;
        this.c = list;
    }
}

