/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.cYh;
import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName(value="type_id")
    private String a;
    @SerializedName(value="type_name")
    private String b;
    @SerializedName(value="type_flag")
    private String c;

    public a(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = cYh.d("56");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a.equals(((a)object).a);
    }
}

