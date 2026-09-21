/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.github.catvod.spider.merge.xc.G.l;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public class m {
    @SerializedName(value="responses")
    private List<m> a;
    @SerializedName(value="body")
    private l b;
    @SerializedName(value="id")
    private String c;
    @SerializedName(value="status")
    private int d;

    public final l a() {
        l l2;
        l l3 = l2 = this.b;
        if (l2 == null) {
            l3 = new l();
        }
        return l3;
    }

    public final m b() {
        List<m> list = this.a;
        Object object = list;
        if (list == null) {
            object = Collections.emptyList();
        }
        if (object.isEmpty()) {
            object = new m();
        } else {
            list = this.a;
            object = list;
            if (list == null) {
                object = Collections.emptyList();
            }
            object = object.get(0);
        }
        return object;
    }

    public final int c() {
        return this.d;
    }
}

