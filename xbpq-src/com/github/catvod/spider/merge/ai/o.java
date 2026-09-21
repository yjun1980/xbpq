/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.ai;

import android.text.TextUtils;
import com.github.catvod.spider.merge.ai.m;
import com.github.catvod.spider.merge.ai.n;
import com.github.catvod.spider.merge.ai.p;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class o {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="list")
    private List<p> b;

    public static List<o> a(String string) {
        Type type = new n().getType();
        return (List)new Gson().fromJson(string, type);
    }

    public final List<p> b() {
        List<p> list;
        List<p> list2 = list = this.b;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final List<m> d() {
        ArrayList<m> arrayList = new ArrayList<m>();
        Iterator<p> iterator = this.b().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().c());
        }
        return arrayList;
    }
}

