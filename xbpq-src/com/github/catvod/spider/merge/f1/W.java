/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.C0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.t0;

final class W
extends i1 {
    private void m(S s2, a a2) {
        s2.l("</");
        s2.m(s2.h);
        a2.P();
        s2.v(i1.c);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void l(S s2, a object) {
        block6: {
            void var2_7;
            block7: {
                block4: {
                    block5: {
                        if (((a)object).H()) {
                            String string = ((a)object).k();
                            s2.k.q(string);
                            s2.h.append(string);
                            return;
                        }
                        char c2 = ((a)object).f();
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block4;
                        if (c2 == '/') break block5;
                        if (c2 != '>' || !s2.t()) break block6;
                        s2.p();
                        d0 d02 = i1.a;
                        break block7;
                    }
                    if (!s2.t()) break block6;
                    C0 c02 = i1.P;
                    break block7;
                }
                if (!s2.t()) break block6;
                t0 t02 = i1.H;
            }
            s2.v((i1)var2_7);
            return;
        }
        this.m(s2, (a)object);
    }
}

