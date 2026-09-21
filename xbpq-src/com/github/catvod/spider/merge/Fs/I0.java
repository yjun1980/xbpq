/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.G0;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

final class I0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block6: {
            G0 g02;
            block5: {
                block0: {
                    block1: {
                        block2: {
                            c0 c02;
                            block3: {
                                block4: {
                                    c02 = h1.c;
                                    g02 = h1.W;
                                    char c2 = ((a)object).e();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '!') break block1;
                                    if (c2 == '-') break block2;
                                    if (c2 == '>') break block3;
                                    if (c2 == '\uffff') break block4;
                                    q2.q(this);
                                    object = q2.n;
                                    ((I)object).j("--");
                                    ((I)object).i(c2);
                                    break block5;
                                }
                                q2.p(this);
                            }
                            q2.m();
                            q2.u(c02);
                            break block6;
                        }
                        q2.q(this);
                        q2.n.i('-');
                        break block6;
                    }
                    q2.q(this);
                    q2.u(h1.Z);
                    break block6;
                }
                q2.q(this);
                object = q2.n;
                ((I)object).j("--");
                ((I)object).i('\ufffd');
            }
            q2.u(g02);
        }
    }
}

