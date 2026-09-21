/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.G0;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class I0
extends h1 {
    @Override
    final void g(Q q2, a object) {
        block6: {
            G0 g02;
            block5: {
                Object object2;
                block0: {
                    block1: {
                        block2: {
                            block3: {
                                block4: {
                                    object2 = h1.c;
                                    g02 = h1.W;
                                    char c2 = ((a)object).e();
                                    object = cYh.d("4A7D");
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '!') break block1;
                                    if (c2 == '-') break block2;
                                    if (c2 == '>') break block3;
                                    if (c2 == '\uffff') break block4;
                                    q2.q(this);
                                    object2 = q2.n;
                                    ((I)object2).j((String)object);
                                    ((I)object2).i(c2);
                                    break block5;
                                }
                                q2.p(this);
                            }
                            q2.m();
                            q2.u((h1)((Object)object2));
                            break block6;
                        }
                        q2.q(this);
                        q2.n.i('-');
                        break block6;
                    }
                    q2.q(this);
                    q2.u(h1.Z);
                    break block6;
                }
                q2.q(this);
                object2 = q2.n;
                ((I)object2).j((String)object);
                ((I)object2).i('\ufffd');
            }
            q2.u(g02);
        }
    }
}

