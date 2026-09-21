/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.U.b;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class a {
    @SerializedName(value="result")
    private a a;
    @SerializedName(value="items")
    private List<b> b;

    public final List<b> a() {
        List<b> list;
        List<b> list2 = list = this.b;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final a b() {
        a a2;
        a a3 = a2 = this.a;
        if (a2 == null) {
            a3 = new a();
        }
        return a3;
    }
}

