/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class y0
extends g1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block9: {
            block7: {
                block8: {
                    var4_3 = var2_2.k(g1.q0);
                    if (var4_3.length() > 0) {
                        var1_1.k.i(var4_3);
                    }
                    if ((var3_4 = var2_2.e()) == '\u0000') break block7;
                    if (var3_4 == ' ') break block8;
                    if (var3_4 == '\"' || var3_4 == '`') ** GOTO lbl-1000
                    var2_2 = g1.a;
                    if (var3_4 == '\uffff') ** GOTO lbl27
                    if (var3_4 == '\t' || var3_4 == '\n' || var3_4 == '\f' || var3_4 == '\r') break block8;
                    if (var3_4 == '&') ** GOTO lbl-1000
                    if (var3_4 != '\'') {
                        switch (var3_4) {
                            default: {
                                var1_1.k.h(var3_4);
                                break;
                            }
                            case '>': {
                                var1_1.k();
                                var1_1.o((g1)var2_2);
                                break;
                            }
                        }
                    }
                    ** GOTO lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var2_2 = (Object)var1_1.b(Character.valueOf('>'), true);
                        if (var2_2 != null) {
                            var1_1.k.j((int[])var2_2);
                            break;
                        }
                        var1_1.k.h('&');
                        break;
lbl27:
                        // 1 sources

                        var1_1.l(this);
                        var1_1.o((g1)var2_2);
                        break;
                        case '<': 
                        case '=': lbl-1000:
                        // 3 sources

                        {
                            var1_1.m(this);
                            var1_1.k.h(var3_4);
                            break;
                        }
                    }
                    break block9;
                }
                var1_1.o(g1.H);
                break block9;
            }
            var1_1.m(this);
            var1_1.k.h('\ufffd');
        }
    }
}

