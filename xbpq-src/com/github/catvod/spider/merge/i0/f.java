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
import java.util.HashSet;

public final class f
implements a {
    @Override
    public final String a() {
        return cYh.d("03353232323403312F25");
    }

    @Override
    public final e b(g g2) {
        HashSet<l> hashSet = new HashSet<l>();
        g g3 = new g();
        for (l l2 : g2) {
            g2 = l2.V();
            ((AbstractCollection)g2).remove(l2);
            hashSet.addAll(g2);
        }
        ((AbstractCollection)g3).addAll(hashSet);
        return new e(g3);
    }
}

