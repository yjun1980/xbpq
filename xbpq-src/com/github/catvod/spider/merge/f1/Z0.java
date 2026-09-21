/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class Z0
extends i1 {
    @Override
    final void l(S object, a a2) {
        block6: {
            char c2;
            block4: {
                block0: {
                    block1: {
                        d0 d02;
                        block5: {
                            block2: {
                                block3: {
                                    d02 = i1.a;
                                    c2 = a2.f();
                                    if (c2 == '\u0000') break block0;
                                    if (c2 == '\"') break block1;
                                    if (c2 == '>') break block2;
                                    if (c2 == '\uffff') break block3;
                                    object = ((S)object).m.g;
                                    break block4;
                                }
                                ((S)object).q(this);
                                break block5;
                            }
                            ((S)object).r(this);
                        }
                        ((S)object).m.h = true;
                        ((S)object).o();
                        ((S)object).v(d02);
                        break block6;
                    }
                    ((S)object).v(i1.m0);
                    break block6;
                }
                ((S)object).r(this);
                object = ((S)object).m.g;
                c2 = '\ufffd';
            }
            ((StringBuilder)object).append(c2);
        }
    }
}

