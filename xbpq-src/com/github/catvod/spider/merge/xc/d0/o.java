/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.n;
import java.util.Collection;

public abstract class o
extends n {
    public static void I(Collection collection, Iterable object) {
        i.e(collection, "<this>");
        i.e(object, "elements");
        if (object instanceof Collection) {
            collection.addAll((Collection)object);
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            collection.add(object.next());
        }
    }
}

