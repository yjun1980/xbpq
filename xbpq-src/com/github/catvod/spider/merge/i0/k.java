/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.j.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedList;

public final class k
implements a {
    @Override
    public final String a() {
        return cYh.d("17222432323E0E3E26");
    }

    @Override
    public final e b(g object) {
        g g2 = new g();
        LinkedList<com.github.catvod.spider.merge.c0.l> linkedList = new LinkedList<com.github.catvod.spider.merge.c0.l>();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            com.github.catvod.spider.merge.c0.l l2 = (com.github.catvod.spider.merge.c0.l)object.next();
            Object object2 = ((AbstractCollection)l2.g0()).iterator();
            while (object2.hasNext()) {
                g g3 = l.d((com.github.catvod.spider.merge.c0.l)object2.next());
                if (g3 == null) continue;
                linkedList.addAll(g3);
            }
            object2 = l.d(l2);
            if (object2 == null) continue;
            linkedList.addAll((Collection<com.github.catvod.spider.merge.c0.l>)object2);
        }
        ((AbstractCollection)g2).addAll(linkedList);
        return new e(g2);
    }
}

