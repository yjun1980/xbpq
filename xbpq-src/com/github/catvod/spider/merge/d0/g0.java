/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.f0;
import com.github.catvod.spider.merge.d0.h1;

final class g0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            char c2;
            f0 f02;
            block3: {
                block1: {
                    block4: {
                        block2: {
                            f02 = h1.x;
                            if (object.t()) {
                                q2.p(this);
                                q2.u(h1.c);
                                return;
                            }
                            c2 = object.e();
                            if (c2 == '\u0000') break block1;
                            if (c2 == '-') break block2;
                            if (c2 != '<') break block3;
                            object = h1.A;
                            break block4;
                        }
                        q2.i(c2);
                        object = h1.z;
                    }
                    q2.u((h1)((Object)object));
                    break block5;
                }
                q2.q(this);
                c2 = '\ufffd';
            }
            q2.i(c2);
            q2.u(f02);
        }
    }
}

