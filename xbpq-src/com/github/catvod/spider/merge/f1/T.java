/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class T
extends i1 {
    @Override
    final void l(S s2, a object) {
        block6: {
            block0: {
                block8: {
                    block1: {
                        block2: {
                            d0 d02;
                            block7: {
                                block4: {
                                    block3: {
                                        block5: {
                                            d02 = i1.a;
                                            String string = ((a)object).n();
                                            s2.k.q(string);
                                            char c2 = ((a)object).f();
                                            if (c2 == '\u0000') break block0;
                                            if (c2 == ' ') break block1;
                                            if (c2 == '/') break block2;
                                            if (c2 == '<') break block3;
                                            if (c2 == '>') break block4;
                                            if (c2 == '\uffff') break block5;
                                            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block1;
                                            s2.k.p(c2);
                                            break block6;
                                        }
                                        s2.q(this);
                                        break block7;
                                    }
                                    ((a)object).P();
                                    s2.r(this);
                                }
                                s2.p();
                            }
                            s2.v(d02);
                            break block6;
                        }
                        object = i1.P;
                        break block8;
                    }
                    object = i1.H;
                }
                s2.v((i1)((Object)object));
                break block6;
            }
            s2.k.q(i1.h());
        }
    }
}

