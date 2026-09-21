/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;

public class \u037f {
    @SerializedName(value="type_id")
    private String \u037f;
    @SerializedName(value="type_name")
    private String \u0528;
    @SerializedName(value="type_flag")
    private String \u0529;

    public \u037f(String string, String string2, String string3) {
        this.\u037f = string;
        this.\u0528 = string2;
        this.\u0529 = string3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u037f)) {
            return false;
        }
        object = (\u037f)object;
        return this.\u037f().equals(((\u037f)object).\u037f());
    }

    public String \u037f() {
        return this.\u037f;
    }
}

