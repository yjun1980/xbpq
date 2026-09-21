/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class R0
extends i1 {
    @Override
    final void l(S s2, a object) {
        block0: {
            block5: {
                block1: {
                    block2: {
                        d0 d02;
                        block6: {
                            block3: {
                                block4: {
                                    d02 = i1.a;
                                    char c2 = object.f();
                                    if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block0;
                                    if (c2 == '\"') break block1;
                                    if (c2 == '\'') break block2;
                                    if (c2 == '>') break block3;
                                    if (c2 == '\uffff') break block4;
                                    s2.r(this);
                                    s2.m.h = true;
                                    object = i1.n0;
                                    break block5;
                                }
                                s2.q(this);
                                break block6;
                            }
                            s2.r(this);
                        }
                        s2.m.h = true;
                        s2.o();
                        s2.v(d02);
                        break block0;
                    }
                    object = i1.f0;
                    break block5;
                }
                object = i1.e0;
            }
            s2.v((i1)((Object)object));
        }
    }
}

