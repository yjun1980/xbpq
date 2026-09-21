/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.b0;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class A0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.e();
        b0 b02 = g1.a;
        if (c2 != '>') {
            if (c2 != '\uffff') {
                a2.z();
                p2.m(this);
                p2.o(g1.H);
            } else {
                p2.l(this);
                p2.o(b02);
            }
        } else {
            p2.k.k = true;
            p2.k();
            p2.o(b02);
        }
    }
}

