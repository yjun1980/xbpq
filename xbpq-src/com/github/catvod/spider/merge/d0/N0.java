/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class N0
extends h1 {
    @Override
    final void g(Q object, a object2) {
        block6: {
            char c2;
            block5: {
                block1: {
                    block2: {
                        c0 c02;
                        block3: {
                            block4: {
                                c02 = h1.c;
                                if (((a)object2).C()) {
                                    object2 = ((a)object2).j();
                                    ((Q)object).m.b.append((String)object2);
                                    return;
                                }
                                c2 = ((a)object2).e();
                                if (c2 == '\u0000') break block1;
                                if (c2 == ' ') break block2;
                                if (c2 == '>') break block3;
                                if (c2 == '\uffff') break block4;
                                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13) break block2;
                                object = ((Q)object).m.b;
                                break block5;
                            }
                            ((Q)object).p(this);
                            ((Q)object).m.f = true;
                        }
                        ((Q)object).n();
                        ((Q)object).u(c02);
                        break block6;
                    }
                    ((Q)object).u(h1.d0);
                    break block6;
                }
                ((Q)object).q(this);
                object = ((Q)object).m.b;
                c2 = '\ufffd';
            }
            ((StringBuilder)object).append(c2);
        }
    }
}

