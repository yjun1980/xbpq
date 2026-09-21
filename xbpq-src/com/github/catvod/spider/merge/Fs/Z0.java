/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

final class Z0
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
                                    object = ((Q)object).m.e;
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
                    ((Q)object).u(h1.o0);
                    break block6;
                }
                ((Q)object).q(this);
                object = ((Q)object).m.e;
                c2 = '\ufffd';
            }
            ((StringBuilder)object).append(c2);
        }
    }
}

