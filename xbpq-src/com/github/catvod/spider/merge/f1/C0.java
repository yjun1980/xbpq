/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class C0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        block2: {
            d0 d02;
            block3: {
                block0: {
                    block1: {
                        d02 = i1.a;
                        char c2 = a2.f();
                        if (c2 == '>') break block0;
                        if (c2 == '\uffff') break block1;
                        a2.P();
                        s2.r(this);
                        s2.v(i1.H);
                        break block2;
                    }
                    s2.q(this);
                    break block3;
                }
                s2.k.m = true;
                s2.p();
            }
            s2.v(d02);
        }
    }
}

