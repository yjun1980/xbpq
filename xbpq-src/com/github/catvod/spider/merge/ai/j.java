/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.ai;

import com.google.gson.annotations.SerializedName;

public final class j {
    @SerializedName(value="type_id")
    private String a;
    @SerializedName(value="type_name")
    private String b;
    @SerializedName(value="type_flag")
    private String c;

    public j(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        object = (j)object;
        return this.a.equals(((j)object).a);
    }
}

