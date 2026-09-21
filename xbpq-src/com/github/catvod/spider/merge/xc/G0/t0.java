/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class t0
extends g1 {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block7: {
            var3_3 = var2_2.e();
            var4_4 = g1.I;
            if (var3_3 == '\u0000') break block7;
            if (var3_3 == ' ') return;
            if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
            if (var3_3 == '/') ** GOTO lbl26
            var5_5 /* !! */  = g1.a;
            if (var3_3 == '\uffff') ** GOTO lbl23
            if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
            switch (var3_3) {
                default: {
                    var1_1.k.o();
                    var2_2.z();
                    var1_1.o(var4_4);
                    return;
                }
                case '>': {
                    var1_1.k();
                    var1_1.o(var5_5 /* !! */ );
                    return;
                }
                case '=': {
                    var1_1.o(g1.K);
                    return;
                }
lbl23:
                // 1 sources

                var1_1.l(this);
                var1_1.o(var5_5 /* !! */ );
                return;
lbl26:
                // 1 sources

                var1_1.o(g1.P);
                return;
                case '<': lbl-1000:
                // 2 sources

                {
                    var1_1.m(this);
                    var1_1.k.o();
                    var5_5 /* !! */  = var1_1.k;
                    var5_5 /* !! */ .f = true;
                    var2_2 = var5_5 /* !! */ .e;
                    var6_7 = var5_5 /* !! */ .d;
                    if (var2_2 != null) {
                        var6_7.append((String)var2_2);
                        var5_5 /* !! */ .e = null;
                    }
                    var6_7.append(var3_3);
                    var1_1.o(var4_4);
                    return;
                }
            }
        }
        var1_1.m(this);
        var2_2 = var1_1.k;
        var2_2.f = true;
        var6_8 = var2_2.e;
        var5_6 = var2_2.d;
        if (var6_8 != null) {
            var5_6.append(var6_8);
            var2_2.e = null;
        }
        var5_6.append('\ufffd');
        var1_1.o(var4_4);
    }
}

