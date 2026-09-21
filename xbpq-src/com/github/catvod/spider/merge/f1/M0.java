/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.N0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class M0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        block3: {
            N0 n02;
            block0: {
                block1: {
                    block2: {
                        n02 = i1.Z;
                        char c2 = a2.f();
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                        if (c2 == '>') break block1;
                        if (c2 == '\uffff') break block2;
                        s2.r(this);
                        break block0;
                    }
                    s2.q(this);
                }
                s2.r(this);
                s2.g();
                s2.m.h = true;
                s2.o();
                s2.v(i1.a);
                break block3;
            }
            s2.v(n02);
        }
    }
}

