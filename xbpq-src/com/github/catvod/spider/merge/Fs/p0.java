/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.Fs.m0;

final class p0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block6: {
            char c2;
            m0 m02;
            block4: {
                block0: {
                    block1: {
                        block5: {
                            block2: {
                                block3: {
                                    m02 = h1.E;
                                    c2 = object.e();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '-') break block1;
                                    if (c2 == 60) break block2;
                                    if (c2 == 62) break block3;
                                    if (c2 != '\uffff') break block4;
                                    q2.p(this);
                                    object = h1.c;
                                    break block5;
                                }
                                q2.i(c2);
                                object = h1.h;
                                break block5;
                            }
                            q2.i(c2);
                            object = h1.H;
                        }
                        q2.u((h1)((Object)object));
                        break block6;
                    }
                    q2.i(c2);
                    break block6;
                }
                q2.q(this);
                c2 = '\ufffd';
            }
            q2.i(c2);
            q2.u(m02);
        }
    }
}

