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

public final class h
implements a {
    @Override
    public final String a() {
        return cYh.d("013F2D3D382D0E3E267C2433053C283F3077083E24");
    }

    @Override
    public final e b(g object) {
        LinkedList<l> linkedList = new LinkedList<l>();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            l l2 = (l)object.next();
            if (l2.b0() == null) continue;
            linkedList.add(l2.b0());
        }
        object = new g();
        ((AbstractCollection)object).addAll(linkedList);
        return new e(object);
    }
}

