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

final class K0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            G0 g02;
            block4: {
                block0: {
                    block1: {
                        c0 c02;
                        block2: {
                            block3: {
                                c02 = h1.c;
                                g02 = h1.W;
                                char c2 = ((a)object).e();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == '>') break block2;
                                if (c2 == '\uffff') break block3;
                                object = q2.n;
                                ((I)object).j("--!");
                                ((I)object).i(c2);
                                break block4;
                            }
                            q2.p(this);
                        }
                        q2.m();
                        q2.u(c02);
                        break block5;
                    }
                    q2.n.j("--!");
                    q2.u(h1.X);
                    break block5;
                }
                q2.q(this);
                object = q2.n;
                ((I)object).j("--!");
                ((I)object).i('\ufffd');
            }
            q2.u(g02);
        }
    }
}

