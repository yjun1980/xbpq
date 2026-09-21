/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class u0
extends i1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    final void l(S var1_1, a var2_2) {
        block10: {
            block9: {
                block5: {
                    block8: {
                        block6: {
                            block7: {
                                var5_3 = i1.a;
                                var4_4 = var2_2.r(i1.p0);
                                var1_1.k.l(var4_4);
                                var3_5 = var2_2.f();
                                if (var3_5 == '\t' || var3_5 == '\n' || var3_5 == '\f' || var3_5 == '\r' || var3_5 == ' ') break block5;
                                if (var3_5 == '\"' || var3_5 == '\'') break block6;
                                if (var3_5 == '/') break block7;
                                if (var3_5 == '\uffff') ** GOTO lbl18
                                switch (var3_5) {
                                    default: {
                                        break block8;
                                    }
                                    case '>': {
                                        var1_1.p();
                                        break;
                                    }
                                    case '=': {
                                        var2_2 = i1.K;
                                        break block9;
                                    }
lbl18:
                                    // 1 sources

                                    var1_1.q(this);
                                }
                                var1_1.v(var5_3);
                                break block10;
                            }
                            var2_2 = i1.P;
                            break block9;
                            {
                                ** case 60:
                            }
                        }
                        var1_1.r(this);
                    }
                    var1_1.k.k(var3_5);
                    break block10;
                }
                var2_2 = i1.J;
            }
            var1_1.v((i1)var2_2);
        }
    }
}

