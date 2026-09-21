/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.b0;
import com.github.catvod.spider.merge.xc.G0.g1;
import com.github.catvod.spider.merge.xc.G0.r0;

public final class z0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.e();
        r0 r02 = g1.H;
        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
            if (c2 != '/') {
                b0 b02 = g1.a;
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        a2.z();
                        p2.m(this);
                        p2.o(r02);
                    } else {
                        p2.l(this);
                        p2.o(b02);
                    }
                } else {
                    p2.k();
                    p2.o(b02);
                }
            } else {
                p2.o(g1.P);
            }
        } else {
            p2.o(r02);
        }
    }
}

