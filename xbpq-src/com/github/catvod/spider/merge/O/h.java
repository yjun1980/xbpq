/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.O.b;
import com.google.gson.annotations.SerializedName;

public final class h {
    @SerializedName(value="code")
    private Integer a;
    @SerializedName(value="message")
    private String b;
    @SerializedName(value="data")
    private b c;

    public static h b(String string) {
        return (h)d.a(string, h.class);
    }

    public final b a() {
        b b2;
        b b3 = b2 = this.c;
        if (b2 == null) {
            b3 = new b();
        }
        return b3;
    }
}

