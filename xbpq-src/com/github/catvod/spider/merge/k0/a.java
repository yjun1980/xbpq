/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.c;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.LinkedList;

public final class a
implements c {
    @Override
    public final String a() {
        return cYh.d("063C2D05322213");
    }

    @Override
    public final e b(d object) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        for (l l2 : ((d)object).a()) {
            object = l2.t();
            object = cYh.d("14333338272E").equals(object) ? l2.T() : l2.p0();
            linkedList.add(object);
        }
        return new e(linkedList);
    }
}

