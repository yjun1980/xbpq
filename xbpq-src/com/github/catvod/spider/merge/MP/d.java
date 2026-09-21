/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.MP;

import com.github.catvod.spider.merge.MP.c;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class d {
    @SerializedName(value="key")
    private String a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="init")
    private String c;
    @SerializedName(value="value")
    private List<c> d;

    public d(String string, String string2, List list) {
        this.a = string;
        this.b = string2;
        this.d = list;
    }
}

