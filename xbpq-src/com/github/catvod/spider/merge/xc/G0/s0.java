/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class s0
extends g1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block11: {
            block10: {
                var5_3 = var2_2.k(g1.p0);
                var4_4 = var1_1.k;
                var4_4.getClass();
                var5_3 = var5_3.replace('\u0000', '\ufffd');
                var4_4.f = true;
                var6_5 = var4_4.e;
                var7_6 = var4_4.d;
                if (var6_5 != null) {
                    var7_6.append(var6_5);
                    var4_4.e = null;
                }
                if (var7_6.length() == 0) {
                    var4_4.e = var5_3;
                } else {
                    var7_6.append(var5_3);
                }
                var3_7 = var2_2.e();
                if (var3_7 == '\t' || var3_7 == '\n' || var3_7 == '\f' || var3_7 == '\r' || var3_7 == ' ') break block10;
                if (var3_7 == '\"' || var3_7 == '\'') ** GOTO lbl-1000
                if (var3_7 == '/') ** GOTO lbl47
                var2_2 = g1.a;
                if (var3_7 == '\uffff') ** GOTO lbl44
                switch (var3_7) {
                    default: {
                        var1_1 = var1_1.k;
                        var1_1.f = true;
                        var2_2 = var1_1.e;
                        var4_4 = var1_1.d;
                        if (var2_2 != null) {
                            var4_4.append((String)var2_2);
                            var1_1.e = null;
                        }
                        var4_4.append(var3_7);
                        break;
                    }
                    case '>': {
                        var1_1.k();
                        var1_1.o((g1)var2_2);
                        break;
                    }
                    case '=': {
                        var1_1.o(g1.K);
                        break;
                    }
lbl44:
                    // 1 sources

                    var1_1.l(this);
                    var1_1.o((g1)var2_2);
                    break;
lbl47:
                    // 1 sources

                    var1_1.o(g1.P);
                    break;
                    case '<': lbl-1000:
                    // 2 sources

                    {
                        var1_1.m(this);
                        var4_4 = var1_1.k;
                        var4_4.f = true;
                        var2_2 = var4_4.e;
                        var1_1 = var4_4.d;
                        if (var2_2 != null) {
                            var1_1.append((String)var2_2);
                            var4_4.e = null;
                        }
                        var1_1.append(var3_7);
                        break;
                    }
                }
                break block11;
            }
            var1_1.o(g1.J);
        }
    }
}

