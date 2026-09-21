/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.O0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class N0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        block2: {
            O0 o02;
            block4: {
                block1: {
                    block3: {
                        o02 = i1.a0;
                        if (a2.H()) {
                            s2.g();
                            s2.v(o02);
                            return;
                        }
                        char c2 = a2.f();
                        if (c2 == '\u0000') break block1;
                        if (c2 == ' ') break block2;
                        if (c2 == '\uffff') break block3;
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block2;
                        s2.g();
                        s2.m.d.append(c2);
                        break block4;
                    }
                    s2.q(this);
                    s2.g();
                    s2.m.h = true;
                    s2.o();
                    s2.v(i1.a);
                    break block2;
                }
                s2.r(this);
                s2.g();
                s2.m.d.append('\ufffd');
            }
            s2.v(o02);
        }
    }
}

