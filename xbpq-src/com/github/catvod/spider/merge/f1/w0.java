/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class w0
extends i1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    final void l(S var1_1, a var2_2) {
        block5: {
            block12: {
                block4: {
                    block11: {
                        block6: {
                            block7: {
                                block10: {
                                    block8: {
                                        block9: {
                                            var4_3 = i1.a;
                                            var5_4 = i1.N;
                                            var3_5 = var2_2.f();
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
                                                    var1_1.r(this);
                                                    break block10;
                                                }
lbl18:
                                                // 1 sources

                                                var2_2 = i1.M;
                                                break block11;
                                            }
                                        }
                                        var2_2.P();
                                        break block12;
                                    }
                                    var1_1.q(this);
                                }
                                var1_1.p();
                                var1_1.v(var4_3);
                                break block5;
                                {
                                    ** case 60:
                                    ** case 61:
                                }
                            }
                            var1_1.r(this);
                            var1_1.k.m(var3_5);
                            break block12;
                        }
                        var2_2 = i1.L;
                    }
                    var1_1.v((i1)var2_2);
                    break block5;
                }
                var1_1.r(this);
                var1_1.k.m('\ufffd');
            }
            var1_1.v(var5_4);
        }
    }
}

