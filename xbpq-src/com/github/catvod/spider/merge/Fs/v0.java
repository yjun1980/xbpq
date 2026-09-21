/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class v0
extends h1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    final void g(Q var1_1, a var2_2) {
        block5: {
            block12: {
                block4: {
                    block11: {
                        block6: {
                            block7: {
                                block10: {
                                    block8: {
                                        block9: {
                                            var4_3 = h1.c;
                                            var5_4 = h1.P;
                                            var3_5 = var2_2.e();
                                            if (var3_5 == '\u0000') break block4;
                                            if (var3_5 == ' ') break block5;
                                            if (var3_5 == '\"') break block6;
                                            if (var3_5 == '`') break block7;
                                            if (var3_5 == '\uffff') break block8;
                                            if (var3_5 == '\t' || var3_5 == '\n' || var3_5 == '\f' || var3_5 == '\r') break block5;
                                            if (var3_5 == '&') break block9;
                                            if (var3_5 == '\'') ** GOTO lbl18
                                            switch (var3_5) {
                                                default: {
                                                    break;
                                                }
                                                case '>': {
                                                    var1_1.q(this);
                                                    break block10;
                                                }
lbl18:
                                                // 1 sources

                                                var2_2 = h1.O;
                                                break block11;
                                            }
                                        }
                                        var2_2.G();
                                        break block12;
                                    }
                                    var1_1.p(this);
                                }
                                var1_1.o();
                                var1_1.u(var4_3);
                                break block5;
                                {
                                    ** case 60:
                                    ** case 61:
                                }
                            }
                            var1_1.q(this);
                            var1_1.i.k(var3_5);
                            break block12;
                        }
                        var2_2 = h1.N;
                    }
                    var1_1.u((h1)var2_2);
                    break block5;
                }
                var1_1.q(this);
                var1_1.i.k('\ufffd');
            }
            var1_1.u(var5_4);
        }
    }
}

