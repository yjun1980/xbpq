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

public final class d
implements a {
    @Override
    public final String a() {
        return cYh.d("0438283D33");
    }

    @Override
    public final e b(g object) {
        g g2 = new g();
        object = ((AbstractCollection)object).iterator();
        while (object.hasNext()) {
            ((AbstractCollection)g2).addAll(((l)object.next()).R());
        }
        return new e(g2);
    }
}

