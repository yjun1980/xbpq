/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
implements a {
    @Override
    public final String a() {
        return cYh.d("17222432323E0E3E267C2433053C283F3077083E24");
    }

    @Override
    public final e b(g cloneable) {
        LinkedList<Cloneable> linkedList = new LinkedList<Cloneable>();
        Iterator iterator = ((AbstractCollection)((Object)cloneable)).iterator();
        while (iterator.hasNext()) {
            cloneable = (com.github.catvod.spider.merge.c0.l)iterator.next();
            if (((com.github.catvod.spider.merge.c0.l)cloneable).i0() == null) continue;
            linkedList.add(cloneable);
        }
        cloneable = new g();
        ((AbstractCollection)((Object)cloneable)).addAll(linkedList);
        return new e(cloneable);
    }
}

