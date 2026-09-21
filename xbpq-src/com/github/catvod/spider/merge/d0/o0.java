/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;
import com.github.catvod.spider.merge.d0.m0;

final class o0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            char c2;
            m0 m02;
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                m02 = h1.E;
                                c2 = object.e();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == 60) break block2;
                                if (c2 != '\uffff') break block3;
                                q2.p(this);
                                object = h1.c;
                                break block4;
                            }
                            q2.i(c2);
                            object = h1.H;
                            break block4;
                        }
                        q2.i(c2);
                        object = h1.G;
                    }
                    q2.u((h1)((Object)object));
                    break block5;
                }
                q2.q(this);
                c2 = '\ufffd';
            }
            q2.i(c2);
            q2.u(m02);
        }
    }
}

