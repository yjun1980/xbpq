/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.j.l;
import java.util.AbstractCollection;
import java.util.LinkedList;
import java.util.List;

public final class g
implements a {
    @Override
    public final String a() {
        return cYh.d("013F2D3D382D0E3E26");
    }

    @Override
    public final e b(com.github.catvod.spider.merge.e0.g object) {
        LinkedList<com.github.catvod.spider.merge.c0.l> linkedList = new LinkedList<com.github.catvod.spider.merge.c0.l>();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            com.github.catvod.spider.merge.c0.l l2 = (com.github.catvod.spider.merge.c0.l)object.next();
            Object object2 = ((AbstractCollection)l2.g0()).iterator();
            while (object2.hasNext()) {
                Object object3 = l.b((com.github.catvod.spider.merge.c0.l)object2.next());
                if (object3 == null) continue;
                object3 = ((AbstractCollection)object3).iterator();
                while (object3.hasNext()) {
                    linkedList.addAll(((com.github.catvod.spider.merge.c0.l)object3.next()).V());
                }
            }
            object2 = l.b(l2);
            if (object2 == null) continue;
            object2 = ((AbstractCollection)object2).iterator();
            while (object2.hasNext()) {
                linkedList.addAll(((com.github.catvod.spider.merge.c0.l)object2.next()).V());
            }
        }
        return new e(new com.github.catvod.spider.merge.e0.g((List<com.github.catvod.spider.merge.c0.l>)linkedList));
    }
}

