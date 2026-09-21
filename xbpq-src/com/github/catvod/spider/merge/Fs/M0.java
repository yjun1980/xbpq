/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.N0;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class M0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        block2: {
            N0 n02;
            block4: {
                block1: {
                    block3: {
                        n02 = h1.c0;
                        if (a2.C()) {
                            q2.f();
                            q2.u(n02);
                            return;
                        }
                        char c2 = a2.e();
                        if (c2 == '\u0000') break block1;
                        if (c2 == ' ') break block2;
                        if (c2 == '\uffff') break block3;
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block2;
                        q2.f();
                        q2.m.b.append(c2);
                        break block4;
                    }
                    q2.p(this);
                    q2.f();
                    q2.m.f = true;
                    q2.n();
                    q2.u(h1.c);
                    break block2;
                }
                q2.q(this);
                q2.f();
                q2.m.b.append('\ufffd');
            }
            q2.u(n02);
        }
    }
}

