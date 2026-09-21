/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class U
extends g1 {
    public static void e(P p2, a a2) {
        p2.g("</");
        p2.h(p2.h);
        a2.z();
        p2.o(g1.c);
    }

    @Override
    public final void d(P p2, a object) {
        if (((a)object).t()) {
            object = ((a)object).h();
            p2.k.k((String)object);
            p2.h.append((String)object);
            return;
        }
        char c2 = ((a)object).e();
        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
            if (c2 != '/') {
                if (c2 != '>') {
                    com.github.catvod.spider.merge.xc.G0.U.e(p2, (a)object);
                } else if (p2.n()) {
                    p2.k();
                    p2.o(g1.a);
                } else {
                    com.github.catvod.spider.merge.xc.G0.U.e(p2, (a)object);
                }
            } else if (p2.n()) {
                p2.o(g1.P);
            } else {
                com.github.catvod.spider.merge.xc.G0.U.e(p2, (a)object);
            }
        } else if (p2.n()) {
            p2.o(g1.H);
        } else {
            com.github.catvod.spider.merge.xc.G0.U.e(p2, (a)object);
        }
    }
}

