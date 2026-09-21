/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;
import java.util.LinkedList;

public final class j
implements a {
    @Override
    public final String a() {
        return cYh.d("17313334392E");
    }

    @Override
    public final e b(g object) {
        LinkedList<l> linkedList = new LinkedList<l>();
        g g2 = new g();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            linkedList.add(((l)object.next()).f0());
        }
        ((AbstractCollection)g2).addAll(linkedList);
        return new e(g2);
    }
}

