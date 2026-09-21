/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class S0
extends h1 {
    @Override
    final void g(Q object, a a2) {
        block6: {
            char c2;
            block4: {
                block0: {
                    block1: {
                        c0 c02;
                        block5: {
                            block2: {
                                block3: {
                                    c02 = h1.c;
                                    c2 = a2.e();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '\'') break block1;
                                    if (c2 == '>') break block2;
                                    if (c2 == '\uffff') break block3;
                                    object = ((Q)object).m.d;
                                    break block4;
                                }
                                ((Q)object).p(this);
                                break block5;
                            }
                            ((Q)object).q(this);
                        }
                        ((Q)object).m.f = true;
                        ((Q)object).n();
                        ((Q)object).u(c02);
                        break block6;
                    }
                    ((Q)object).u(h1.i0);
                    break block6;
                }
                ((Q)object).q(this);
                object = ((Q)object).m.d;
                c2 = '\ufffd';
            }
            ((StringBuilder)object).append(c2);
        }
    }
}

