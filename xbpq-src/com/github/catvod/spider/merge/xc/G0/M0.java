/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class M0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        block5: {
            block1: {
                block2: {
                    block3: {
                        block4: {
                            if (((a)object).u()) {
                                object = ((a)object).h();
                                p2.m.b.append((String)object);
                                return;
                            }
                            char c2 = ((a)object).e();
                            if (c2 == '\u0000') break block1;
                            if (c2 == ' ') break block2;
                            object = g1.a;
                            if (c2 == '>') break block3;
                            if (c2 == '\uffff') break block4;
                            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block2;
                            p2.m.b.append(c2);
                            break block5;
                        }
                        p2.l(this);
                        p2.m.f = true;
                        p2.j();
                        p2.o((g1)((Object)object));
                        break block5;
                    }
                    p2.j();
                    p2.o((g1)((Object)object));
                    break block5;
                }
                p2.o(g1.b0);
                break block5;
            }
            p2.m(this);
            p2.m.b.append('\ufffd');
        }
    }
}

