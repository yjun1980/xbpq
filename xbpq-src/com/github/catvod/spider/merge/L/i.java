/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.h;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class i {
    @SerializedName(value="responses")
    private List<i> a;
    @SerializedName(value="body")
    private h b;
    @SerializedName(value="id")
    private String c;
    @SerializedName(value="status")
    private int d;

    public final h a() {
        h h2;
        h h3 = h2 = this.b;
        if (h2 == null) {
            h3 = new h();
        }
        return h3;
    }

    public final i b() {
        List<i> list = this.a;
        Object object = list;
        if (list == null) {
            object = Collections.emptyList();
        }
        if (object.isEmpty()) {
            object = new i();
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

