/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class v0
extends i1 {
    /*
     * Unable to fully structure code
     */
    @Override
    final void l(S var1_1, a var2_2) {
        block6: {
            block9: {
                block5: {
                    block7: {
                        block10: {
                            block8: {
                                var4_3 = i1.a;
                                var5_4 = i1.I;
                                var3_5 = var2_2.f();
                                if (var3_5 == '\u0000') break block5;
                                if (var3_5 == ' ') break block6;
                                if (var3_5 == '\"' || var3_5 == '\'') break block7;
                                if (var3_5 == '/') break block8;
                                if (var3_5 == '\uffff') ** GOTO lbl21
                                if (var3_5 == '\t' || var3_5 == '\n' || var3_5 == '\f' || var3_5 == '\r') break block6;
                                switch (var3_5) {
                                    default: {
                                        var1_1.k.x();
                                        var2_2.P();
                                        break block9;
                                    }
                                    case '>': {
                                        var1_1.p();
                                        break;
                                    }
                                    case '=': {
                                        var2_2 = i1.K;
                                        break block10;
                                    }
lbl21:
                                    // 1 sources

                                    var1_1.q(this);
                                }
                                var1_1.v(var4_3);
                                break block6;
                            }
                            var2_2 = i1.P;
                        }
                        var1_1.v((i1)var2_2);
                        break block6;
                        {
                            ** case 60:
                        }
                    }
                    var1_1.r(this);
                    var1_1.k.x();
                    var1_1.k.k(var3_5);
                    break block9;
                }
                var1_1.r(this);
                var1_1.k.k('\ufffd');
            }
            var1_1.v(var5_4);
        }
    }
}

