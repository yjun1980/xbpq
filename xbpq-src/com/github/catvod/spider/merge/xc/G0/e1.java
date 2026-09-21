/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class e1
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.l();
        if (c2 != '!') {
            if (c2 != '/') {
                if (c2 != '?') {
                    if (a2.t()) {
                        p2.c(true);
                        p2.o(g1.j);
                    } else {
                        p2.m(this);
                        p2.e('<');
                        p2.o(g1.a);
                    }
                } else {
                    p2.n.f();
                    p2.o(g1.Q);
                }
            } else {
                p2.o(g1.i);
                p2.a.a();
            }
        } else {
            p2.o(g1.R);
            p2.a.a();
        }
    }
}

