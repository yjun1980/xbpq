/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class W0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            block7: {
                block0: {
                    block1: {
                        block2: {
                            c0 c02;
                            block6: {
                                block3: {
                                    block4: {
                                        c02 = h1.c;
                                        char c2 = object.e();
                                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                                        if (c2 == '\"') break block1;
                                        if (c2 == '\'') break block2;
                                        if (c2 == '>') break block3;
                                        if (c2 == '\uffff') break block4;
                                        q2.q(this);
                                        q2.m.f = true;
                                        q2.n();
                                        break block5;
                                    }
                                    q2.p(this);
                                    break block6;
                                }
                                q2.q(this);
                            }
                            q2.m.f = true;
                            q2.n();
                            q2.u(c02);
                            break block5;
                        }
                        q2.q(this);
                        object = h1.n0;
                        break block7;
                    }
                    q2.q(this);
                    object = h1.m0;
                    break block7;
                }
                object = h1.l0;
            }
            q2.u((h1)((Object)object));
        }
    }
}

