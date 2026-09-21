/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.M0;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class L0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        block3: {
            M0 m02;
            block0: {
                block1: {
                    block2: {
                        m02 = h1.b0;
                        char c2 = a2.e();
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                        if (c2 == '>') break block1;
                        if (c2 == '\uffff') break block2;
                        q2.q(this);
                        break block0;
                    }
                    q2.p(this);
                }
                q2.q(this);
                q2.f();
                q2.m.f = true;
                q2.n();
                q2.u(h1.c);
                break block3;
            }
            q2.u(m02);
        }
    }
}

