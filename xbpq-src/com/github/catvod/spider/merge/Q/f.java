/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.d;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class f {
    @SerializedName(value="data")
    private List<d> a;

    public static f b(String string) {
        return (f)com.github.catvod.spider.merge.G1.d.a(string, f.class);
    }

    public final List<d> a() {
        List<d> list;
        List<d> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }
}

