/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class s0
extends h1 {
    /*
     * Unable to fully structure code
     */
    @Override
    final void g(Q var1_1, a var2_2) {
        block6: {
            block7: {
                block5: {
                    var5_3 = h1.c;
                    var4_4 = h1.K;
                    var3_5 = var2_2.e();
                    if (var3_5 == '\u0000') break block5;
                    if (var3_5 == ' ') break block6;
                    if (var3_5 == '\"' || var3_5 == '\'') ** GOTO lbl-1000
                    if (var3_5 == '/') ** GOTO lbl24
                    if (var3_5 == '\uffff') ** GOTO lbl21
                    if (var3_5 == '\t' || var3_5 == '\n' || var3_5 == '\f' || var3_5 == '\r') break block6;
                    switch (var3_5) {
                        default: {
                            var1_1.i.u();
                            var2_2.G();
                            break;
                        }
                        case '<': {
                            var2_2.G();
                            var1_1.q(this);
                        }
                        case '>': {
                            var1_1.o();
                            ** GOTO lbl22
                        }
lbl21:
                        // 1 sources

                        var1_1.p(this);
lbl22:
                        // 2 sources

                        var1_1.u(var5_3);
                        break block6;
lbl24:
                        // 1 sources

                        var1_1.u(h1.R);
                        break block6;
                        case '=': lbl-1000:
                        // 2 sources

                        {
                            var1_1.q(this);
                            var1_1.i.u();
                            var1_1.i.i(var3_5);
                            break;
                        }
                    }
                    break block7;
                }
                var2_2.G();
                var1_1.q(this);
                var1_1.i.u();
            }
            var1_1.u(var4_4);
        }
    }
}

