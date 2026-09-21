/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.n0;

final class p0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block5: {
            char c2;
            n0 n02;
            block3: {
                block0: {
                    block4: {
                        block1: {
                            block2: {
                                n02 = i1.C;
                                c2 = object.f();
                                if (c2 == '\u0000') break block0;
                                if (c2 == '-') break block1;
                                if (c2 == 60) break block2;
                                if (c2 != '\uffff') break block3;
                                s2.q(this);
                                object = i1.a;
                                break block4;
                            }
                            s2.j(c2);
                            object = i1.F;
                            break block4;
                        }
                        s2.j(c2);
                        object = i1.E;
                    }
                    s2.v((i1)((Object)object));
                    break block5;
                }
                s2.r(this);
                c2 = '\ufffd';
            }
            s2.j(c2);
            s2.v(n02);
        }
    }
}

