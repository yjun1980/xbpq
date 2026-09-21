/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.Q0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.X0;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class P0
extends i1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void l(S s2, a object) {
        void var2_5;
        d0 d02 = i1.a;
        if (((a)object).w()) {
            s2.q(this);
            s2.m.h = true;
            s2.o();
            s2.v(d02);
            return;
        }
        if (((a)object).F('\t', '\n', '\r', '\f', ' ')) {
            ((a)object).a();
            return;
        }
        if (((a)object).E('>')) {
            s2.o();
            s2.a(d02);
            return;
        }
        if (((a)object).D("PUBLIC")) {
            s2.m.e = "PUBLIC";
            Q0 q02 = i1.c0;
        } else {
            if (!((a)object).D("SYSTEM")) {
                s2.r(this);
                s2.m.h = true;
                s2.a(i1.n0);
                return;
            }
            s2.m.e = "SYSTEM";
            X0 x02 = i1.i0;
        }
        s2.v((i1)var2_5);
    }
}

