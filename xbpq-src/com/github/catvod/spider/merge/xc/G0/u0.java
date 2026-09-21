/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class u0
extends g1 {
    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block5: {
            block4: {
                block6: {
                    var3_3 = var2_2.e();
                    var5_4 = g1.N;
                    if (var3_3 == '\u0000') break block4;
                    if (var3_3 == ' ') break block5;
                    if (var3_3 == '\"') break block6;
                    if (var3_3 == '`') ** GOTO lbl-1000
                    var4_5 = g1.a;
                    if (var3_3 == '\uffff') ** GOTO lbl27
                    if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') break block5;
                    if (var3_3 == '&') ** GOTO lbl24
                    if (var3_3 == '\'') ** GOTO lbl22
                    switch (var3_3) {
                        default: {
                            var2_2.z();
                            var1_1.o(var5_4);
                            break;
                        }
                        case '>': {
                            var1_1.m(this);
                            var1_1.k();
                            var1_1.o(var4_5);
                            break;
                        }
lbl22:
                        // 1 sources

                        var1_1.o(g1.M);
                        break;
lbl24:
                        // 1 sources

                        var2_2.z();
                        var1_1.o(var5_4);
                        break;
lbl27:
                        // 1 sources

                        var1_1.l(this);
                        var1_1.k();
                        var1_1.o(var4_5);
                        break;
                        case '<': 
                        case '=': lbl-1000:
                        // 2 sources

                        {
                            var1_1.m(this);
                            var1_1.k.h(var3_3);
                            var1_1.o(var5_4);
                            break;
                        }
                    }
                    break block5;
                }
                var1_1.o(g1.L);
                break block5;
            }
            var1_1.m(this);
            var1_1.k.h('\ufffd');
            var1_1.o(var5_4);
        }
    }
}

