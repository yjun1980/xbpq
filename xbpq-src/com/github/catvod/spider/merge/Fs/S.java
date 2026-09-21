/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

final class S
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block6: {
            block0: {
                block8: {
                    block1: {
                        block2: {
                            c0 c02;
                            block7: {
                                block4: {
                                    block3: {
                                        block5: {
                                            c02 = h1.c;
                                            String string = ((a)object).m();
                                            q2.i.o(string);
                                            char c2 = ((a)object).e();
                                            if (c2 == '\u0000') break block0;
                                            if (c2 == ' ') break block1;
                                            if (c2 == '/') break block2;
                                            if (c2 == '<') break block3;
                                            if (c2 == '>') break block4;
                                            if (c2 == '\uffff') break block5;
                                            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block1;
                                            q2.i.n(c2);
                                            break block6;
                                        }
                                        q2.p(this);
                                        break block7;
                                    }
                                    ((a)object).G();
                                    q2.q(this);
                                }
                                q2.o();
                            }
                            q2.u(c02);
                            break block6;
                        }
                        object = h1.R;
                        break block8;
                    }
                    object = h1.J;
                }
                q2.u((h1)((Object)object));
                break block6;
            }
            q2.i.o(h1.c());
        }
    }
}

