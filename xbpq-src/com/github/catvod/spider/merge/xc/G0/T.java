/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class T
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        if (a2.t()) {
            p2.c(false);
            M m2 = p2.k;
            char c2 = a2.l();
            m2.getClass();
            m2.k(String.valueOf(c2));
            p2.h.append(a2.l());
            p2.o(g1.m);
            p2.a.a();
        } else {
            p2.g("</");
            p2.o(g1.c);
        }
    }
}

