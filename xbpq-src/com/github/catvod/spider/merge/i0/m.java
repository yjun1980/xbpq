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

public final class m
implements a {
    @Override
    public final String a() {
        return cYh.d("17222432323E0E3E267C2433053C283F30");
    }

    @Override
    public final e b(g object) {
        LinkedList<l> linkedList = new LinkedList<l>();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            g g2 = com.github.catvod.spider.merge.j.l.d((l)object.next());
            if (g2 == null) continue;
            linkedList.addAll(g2);
        }
        object = new g();
        ((AbstractCollection)object).addAll(linkedList);
        return new e(object);
    }
}

