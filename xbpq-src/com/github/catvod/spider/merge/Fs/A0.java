/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.Fs.s0;

final class A0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        block5: {
            s0 s02;
            block0: {
                block1: {
                    c0 c02;
                    block4: {
                        block2: {
                            block3: {
                                c02 = h1.c;
                                s02 = h1.J;
                                char c2 = a2.e();
                                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                                if (c2 == '/') break block1;
                                if (c2 == '>') break block2;
                                if (c2 == '\uffff') break block3;
                                a2.G();
                                q2.q(this);
                                break block0;
                            }
                            q2.p(this);
                            break block4;
                        }
                        q2.o();
                    }
                    q2.u(c02);
                    break block5;
                }
                q2.u(h1.R);
                break block5;
            }
            q2.u(s02);
        }
    }
}

