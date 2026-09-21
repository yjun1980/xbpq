/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.f0;
import com.github.catvod.spider.merge.Fs.h1;

final class h0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block6: {
            f0 f02;
            block4: {
                block1: {
                    char c2;
                    block2: {
                        block5: {
                            block3: {
                                f02 = h1.x;
                                if (object.t()) {
                                    q2.p(this);
                                    q2.u(h1.c);
                                    return;
                                }
                                c2 = object.e();
                                if (c2 == '\u0000') break block1;
                                if (c2 == '-') break block2;
                                if (c2 == '<') break block3;
                                q2.i(c2);
                                if (c2 != '>') break block4;
                                object = h1.h;
                                break block5;
                            }
                            object = h1.A;
                        }
                        q2.u((h1)((Object)object));
                        break block6;
                    }
                    q2.i(c2);
                    break block6;
                }
                q2.q(this);
                q2.i('\ufffd');
            }
            q2.u(f02);
        }
    }
}

