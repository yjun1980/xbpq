/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.Q;

import android.text.TextUtils;
import com.github.catvod.spider.merge.Q.a;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class b {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="source_list")
    private List<a> b;

    public final List<a> a() {
        List<a> list;
        List<a> list2 = list = this.b;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

