/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class f0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block4: {
            block1: {
                block5: {
                    block2: {
                        block3: {
                            if (object.t()) {
                                q2.p(this);
                                q2.u(h1.c);
                                return;
                            }
                            char c2 = object.s();
                            if (c2 == '\u0000') break block1;
                            if (c2 == '-') break block2;
                            if (c2 == '<') break block3;
                            q2.k(object.p('-', '<', '\u0000'));
                            break block4;
                        }
                        object = h1.A;
                        break block5;
                    }
                    q2.i('-');
                    object = h1.y;
                }
                q2.a((h1)((Object)object));
                break block4;
            }
            q2.q(this);
            object.a();
            q2.i('\ufffd');
        }
    }
}

