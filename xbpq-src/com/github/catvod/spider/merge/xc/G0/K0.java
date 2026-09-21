/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.L0;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class K0
extends g1 {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void d(P p2, a object) {
        char c2 = ((a)object).e();
        L0 l02 = g1.Z;
        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
            if (c2 != '>') {
                if (c2 != '\uffff') {
                    p2.m(this);
                    p2.o(l02);
                    return;
                }
                p2.l(this);
            }
            p2.m(this);
            p2.m.f();
            p2.m.f = true;
            p2.j();
            p2.o(g1.a);
            return;
        }
        p2.o(l02);
    }
}

