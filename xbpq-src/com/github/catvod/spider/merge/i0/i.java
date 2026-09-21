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
import java.util.Iterator;
import java.util.LinkedList;

public final class i
implements a {
    @Override
    public final String a() {
        return cYh.d("013F2D3D382D0E3E267C2433053C283F30");
    }

    @Override
    public final e b(g g2) {
        LinkedList<com.github.catvod.spider.merge.c0.l> linkedList = new LinkedList<com.github.catvod.spider.merge.c0.l>();
        Iterator iterator = ((AbstractCollection)g2).iterator();
        while (iterator.hasNext()) {
            g2 = l.b((com.github.catvod.spider.merge.c0.l)iterator.next());
            if (g2 == null) continue;
            linkedList.addAll(g2);
        }
        g2 = new g();
        ((AbstractCollection)g2).addAll(linkedList);
        return new e(g2);
    }
}

