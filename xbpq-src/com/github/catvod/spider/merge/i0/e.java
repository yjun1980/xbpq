/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.a;
import java.util.AbstractCollection;
import java.util.HashSet;

public final class e
implements a {
    @Override
    public final String a() {
        return cYh.d("03353232323403312F257A35157D32343B3C");
    }

    @Override
    public final com.github.catvod.spider.merge.h0.e b(g object) {
        HashSet<l> hashSet = new HashSet<l>();
        g g2 = new g();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            hashSet.addAll(((l)object.next()).V());
        }
        ((AbstractCollection)g2).addAll(hashSet);
        return new com.github.catvod.spider.merge.h0.e(g2);
    }
}

