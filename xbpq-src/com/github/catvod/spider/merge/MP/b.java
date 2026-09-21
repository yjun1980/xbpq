/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.MP;

import com.google.gson.annotations.SerializedName;

public class b {
    @SerializedName(value="type_id")
    private String a;
    @SerializedName(value="type_name")
    private String b;
    @SerializedName(value="type_flag")
    private String c;

    public b(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = null;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.a.equals(((b)object).a);
    }
}

