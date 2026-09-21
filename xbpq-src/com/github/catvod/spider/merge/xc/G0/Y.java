/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class Y
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.e();
        if (c2 != '!') {
            if (c2 != '/') {
                if (c2 != '\uffff') {
                    p2.g("<");
                    a2.z();
                    p2.o(g1.f);
                } else {
                    p2.g("<");
                    p2.l(this);
                    p2.o(g1.a);
                }
            } else {
                p2.d();
                p2.o(g1.r);
            }
        } else {
            p2.g("<!");
            p2.o(g1.t);
        }
    }
}

