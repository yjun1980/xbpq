/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.G0;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class F0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        block6: {
            G0 g02;
            block4: {
                block0: {
                    block1: {
                        c0 c02;
                        block5: {
                            block2: {
                                block3: {
                                    c02 = h1.c;
                                    g02 = h1.W;
                                    char c2 = a2.e();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '-') break block1;
                                    if (c2 == '>') break block2;
                                    if (c2 == '\uffff') break block3;
                                    q2.n.i(c2);
                                    break block4;
                                }
                                q2.p(this);
                                break block5;
                            }
                            q2.q(this);
                        }
                        q2.m();
                        q2.u(c02);
                        break block6;
                    }
                    q2.u(h1.V);
                    break block6;
                }
                q2.q(this);
                q2.n.i('\ufffd');
            }
            q2.u(g02);
        }
    }
}

