/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.G0;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class H0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            G0 g02;
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                g02 = h1.W;
                                char c2 = ((a)object).e();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == '\uffff') break block2;
                                object = q2.n;
                                ((I)object).i('-');
                                ((I)object).i(c2);
                                break block3;
                            }
                            q2.p(this);
                            q2.m();
                            object = h1.c;
                            break block4;
                        }
                        object = h1.Y;
                    }
                    q2.u((h1)((Object)object));
                    break block5;
                }
                q2.q(this);
                object = q2.n;
                ((I)object).i('-');
                ((I)object).i('\ufffd');
            }
            q2.u(g02);
        }
    }
}

