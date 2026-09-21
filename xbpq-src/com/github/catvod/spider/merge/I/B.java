/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.D;
import com.google.gson.JsonObject;
import java.util.Comparator;

public final class B
implements Comparator {
    public final D a;

    public /* synthetic */ B(D d2) {
        this.a = d2;
    }

    public final int compare(Object object, Object object2) {
        return D.a(this.a, (JsonObject)object, (JsonObject)object2);
    }
}

