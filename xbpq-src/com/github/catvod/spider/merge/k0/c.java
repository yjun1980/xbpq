/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.h0.d;
import com.github.catvod.spider.merge.h0.e;
import java.util.AbstractCollection;

public final class c
implements com.github.catvod.spider.merge.h0.c {
    @Override
    public final String a() {
        return cYh.d("093F2534");
    }

    @Override
    public final e b(d object) {
        g g2 = new g();
        for (l l2 : ((d)object).a()) {
            ((AbstractCollection)g2).addAll(l2.R());
            String string = l2.e0();
            if (!h.d(string)) continue;
            l2 = new l("");
            l2.O(string);
            ((AbstractCollection)g2).add(l2);
        }
        return new e(g2);
    }
}

