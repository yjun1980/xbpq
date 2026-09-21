/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class f0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        if (object.n()) {
            p2.l(this);
            p2.o(g1.a);
            return;
        }
        char c2 = object.e();
        object = g1.v;
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '<') {
                    p2.e(c2);
                    p2.o((g1)((Object)object));
                } else {
                    p2.o(g1.y);
                }
            } else {
                p2.e(c2);
                p2.o(g1.x);
            }
        } else {
            p2.m(this);
            p2.e('\ufffd');
            p2.o((g1)((Object)object));
        }
    }
}

