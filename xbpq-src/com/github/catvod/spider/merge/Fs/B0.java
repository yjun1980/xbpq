/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

final class B0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        block2: {
            c0 c02;
            block3: {
                block0: {
                    block1: {
                        c02 = h1.c;
                        char c2 = a2.e();
                        if (c2 == '>') break block0;
                        if (c2 == '\uffff') break block1;
                        a2.G();
                        q2.q(this);
                        q2.u(h1.J);
                        break block2;
                    }
                    q2.p(this);
                    break block3;
                }
                q2.i.i = true;
                q2.o();
            }
            q2.u(c02);
        }
    }
}

