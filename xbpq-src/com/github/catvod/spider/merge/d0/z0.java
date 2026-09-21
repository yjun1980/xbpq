/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class z0
extends h1 {
    /*
     * Unable to fully structure code
     */
    @Override
    final void g(Q var1_1, a var2_2) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        var5_3 = h1.c;
                        var4_4 = var2_2.q(h1.s0);
                        if (var4_4.length() > 0) {
                            var1_1.i.l(var4_4);
                        }
                        if ((var3_5 = var2_2.e()) == '\u0000') break block7;
                        if (var3_5 == ' ') break block8;
                        if (var3_5 == '\"' || var3_5 == 96) ** GOTO lbl-1000
                        if (var3_5 == 65535) ** GOTO lbl25
                        if (var3_5 == 9 || var3_5 == 10 || var3_5 == 12 || var3_5 == 13) break block8;
                        if (var3_5 == 38) ** GOTO lbl18
                        if (var3_5 == 39) ** GOTO lbl-1000
                        switch (var3_5) {
                            default: {
                                break;
                            }
                            case '>': {
                                var1_1.o();
                                ** GOTO lbl26
                            }
lbl18:
                            // 1 sources

                            var2_2 = var1_1.d(Character.valueOf('>'), true);
                            var1_1 = var1_1.i;
                            if (var2_2 != null) {
                                var1_1.m((int[])var2_2);
                            } else {
                                var1_1.k('&');
                            }
                            break block9;
lbl25:
                            // 1 sources

                            var1_1.p(this);
lbl26:
                            // 2 sources

                            var1_1.u(var5_3);
                            break block9;
                            case '<': 
                            case '=': lbl-1000:
                            // 3 sources

                            {
                                var1_1.q(this);
                            }
                        }
                        var1_1 = var1_1.i;
                        break block10;
                    }
                    var1_1.u(h1.J);
                    break block9;
                }
                var1_1.q(this);
                var1_1 = var1_1.i;
                var3_5 = '\ufffd';
            }
            var1_1.k(var3_5);
        }
    }
}

