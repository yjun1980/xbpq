/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.X.b;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c {
    @SerializedName(value="list")
    private List<b> a;

    public final List<h> a(String string) {
        Object object;
        ArrayList<h> arrayList = new ArrayList<h>();
        Object object2 = object = this.a;
        if (object == null) {
            object2 = Collections.emptyList();
        }
        this.a = object2;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object = (b)object2.next();
            if (!((b)object).a().contains(string)) continue;
            arrayList.add(((b)object).b());
        }
        return arrayList;
    }
}

