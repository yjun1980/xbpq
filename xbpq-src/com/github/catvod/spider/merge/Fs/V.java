/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.B0;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.Fs.s0;

final class V
extends h1 {
    private void h(Q q2, a a2) {
        q2.k("</");
        q2.l(q2.h);
        a2.G();
        q2.u(h1.e);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void g(Q q2, a object) {
        block6: {
            void var2_7;
            block7: {
                block4: {
                    block5: {
                        if (((a)object).C()) {
                            String string = ((a)object).j();
                            q2.i.o(string);
                            q2.h.append(string);
                            return;
                        }
                        char c2 = ((a)object).e();
                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') break block4;
                        if (c2 == '/') break block5;
                        if (c2 != '>' || !q2.s()) break block6;
                        q2.o();
                        c0 c02 = h1.c;
                        break block7;
                    }
                    if (!q2.s()) break block6;
                    B0 b02 = h1.R;
                    break block7;
                }
                if (!q2.s()) break block6;
                s0 s02 = h1.J;
            }
            q2.u((h1)var2_7);
            return;
        }
        this.h(q2, (a)object);
    }
}

