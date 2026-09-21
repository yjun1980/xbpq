/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.t0;

final class B0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        block5: {
            t0 t02;
            block0: {
                block1: {
                    d0 d02;
                    block4: {
                        block2: {
                            block3: {
                                d02 = i1.a;
                                t02 = i1.H;
                                char c2 = a2.f();
                                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                                if (c2 == '/') break block1;
                                if (c2 == '>') break block2;
                                if (c2 == '\uffff') break block3;
                                a2.P();
                                s2.r(this);
                                break block0;
                            }
                            s2.q(this);
                            break block4;
                        }
                        s2.p();
                    }
                    s2.v(d02);
                    break block5;
                }
                s2.v(i1.P);
                break block5;
            }
            s2.v(t02);
        }
    }
}

