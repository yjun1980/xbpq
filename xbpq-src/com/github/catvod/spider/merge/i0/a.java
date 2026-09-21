/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
implements com.github.catvod.spider.merge.h0.a {
    @Override
    public final String a() {
        return cYh.d("063E2234242E08226C3E257714352D37");
    }

    @Override
    public final e b(g cloneable) {
        LinkedList<l> linkedList = new LinkedList<l>();
        Iterator iterator = ((AbstractCollection)((Object)cloneable)).iterator();
        while (iterator.hasNext()) {
            cloneable = (l)iterator.next();
            linkedList.addAll(((l)cloneable).g0());
            linkedList.add((l)cloneable);
        }
        return new e(new g((List<l>)linkedList));
    }
}

