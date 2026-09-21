/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.O.c;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class a {
    @SerializedName(value="duration")
    private String a;
    @SerializedName(value="minBufferTime")
    private String b;
    @SerializedName(value="video")
    private List<c> c;
    @SerializedName(value="audio")
    private List<c> d;

    public final List<c> a() {
        List<c> list;
        List<c> list2 = list = this.d;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String b() {
        String string;
        String string2 = string = this.a;
        if (string == null) {
            string2 = "0";
        }
        return string2;
    }

    public final String c() {
        String string;
        String string2 = string = this.b;
        if (string == null) {
            string2 = "0";
        }
        return string2;
    }

    public final List<c> d() {
        List<c> list;
        List<c> list2 = list = this.c;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }
}

