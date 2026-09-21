/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.F0;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class E0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        char c2 = object.e();
        F0 f02 = g1.U;
        if (c2 != '\u0000') {
            if (c2 != '-') {
                object = g1.a;
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        p2.n.h(c2);
                        p2.o(f02);
                    } else {
                        p2.l(this);
                        p2.i();
                        p2.o((g1)((Object)object));
                    }
                } else {
                    p2.m(this);
                    p2.i();
                    p2.o((g1)((Object)object));
                }
            } else {
                p2.o(g1.W);
            }
        } else {
            p2.m(this);
            p2.n.h('\ufffd');
            p2.o(f02);
        }
    }
}

