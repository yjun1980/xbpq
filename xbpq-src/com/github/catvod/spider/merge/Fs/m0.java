/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class m0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block5: {
            block2: {
                block6: {
                    char c2;
                    block3: {
                        block4: {
                            c2 = object.s();
                            if (c2 == '\u0000') break block2;
                            if (c2 == '-') break block3;
                            if (c2 == '<') break block4;
                            if (c2 != '\uffff') {
                                q2.k(object.p('-', '<', '\u0000'));
                            } else {
                                q2.p(this);
                                q2.u(h1.c);
                            }
                            break block5;
                        }
                        q2.i(c2);
                        object = h1.H;
                        break block6;
                    }
                    q2.i(c2);
                    object = h1.F;
                }
                q2.a((h1)((Object)object));
                break block5;
            }
            q2.q(this);
            object.a();
            q2.i('\ufffd');
        }
    }
}

