/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.n0;

final class q0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block6: {
            char c2;
            n0 n02;
            block4: {
                block0: {
                    block1: {
                        block5: {
                            block2: {
                                block3: {
                                    n02 = i1.C;
                                    c2 = object.f();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '-') break block1;
                                    if (c2 == 60) break block2;
                                    if (c2 == 62) break block3;
                                    if (c2 != '\uffff') break block4;
                                    s2.q(this);
                                    object = i1.a;
                                    break block5;
                                }
                                s2.j(c2);
                                object = i1.f;
                                break block5;
                            }
                            s2.j(c2);
                            object = i1.F;
                        }
                        s2.v((i1)((Object)object));
                        break block6;
                    }
                    s2.j(c2);
                    break block6;
                }
                s2.r(this);
                c2 = '\ufffd';
            }
            s2.j(c2);
            s2.v(n02);
        }
    }
}

