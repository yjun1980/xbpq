/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class t0
extends h1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    final void g(Q var1_1, a var2_2) {
        block11: {
            block12: {
                block5: {
                    block10: {
                        block6: {
                            block9: {
                                block7: {
                                    block8: {
                                        var4_3 = h1.c;
                                        var5_4 = var2_2.q(h1.r0);
                                        var1_1.i.j(var5_4);
                                        var3_5 = var2_2.e();
                                        if (var3_5 == '\u0000') break block5;
                                        if (var3_5 == ' ') break block6;
                                        if (var3_5 == '\"' || var3_5 == 39) break block7;
                                        if (var3_5 == 47) break block8;
                                        if (var3_5 == 65535) ** GOTO lbl20
                                        if (var3_5 == 9 || var3_5 == 10 || var3_5 == 12 || var3_5 == 13) break block6;
                                        switch (var3_5) {
                                            default: {
                                                break block9;
                                            }
                                            case '>': {
                                                var1_1.o();
                                                break;
                                            }
                                            case '=': {
                                                var2_2 = h1.M;
                                                break block10;
                                            }
lbl20:
                                            // 1 sources

                                            var1_1.p(this);
                                        }
                                        var1_1.u(var4_3);
                                        break block11;
                                    }
                                    var2_2 = h1.R;
                                    break block10;
                                    {
                                        ** case 60:
                                    }
                                }
                                var1_1.q(this);
                            }
                            var1_1 = var1_1.i;
                            break block12;
                        }
                        var2_2 = h1.L;
                    }
                    var1_1.u((h1)var2_2);
                    break block11;
                }
                var1_1.q(this);
                var1_1 = var1_1.i;
                var3_5 = '\ufffd';
            }
            var1_1.i(var3_5);
        }
    }
}

