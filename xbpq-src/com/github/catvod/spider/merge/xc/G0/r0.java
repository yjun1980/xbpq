/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class r0
extends g1 {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block6: {
            var3_3 = var2_2.e();
            var4_4 = g1.I;
            if (var3_3 == '\u0000') break block6;
            if (var3_3 == ' ') return;
            if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
            if (var3_3 == '/') ** GOTO lbl26
            var5_5 = g1.a;
            if (var3_3 == '\uffff') ** GOTO lbl23
            if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
            switch (var3_3) {
                default: {
                    var1_1.k.o();
                    var2_2.z();
                    var1_1.o(var4_4);
                    return;
                }
                case '<': {
                    var2_2.z();
                    var1_1.m(this);
                }
                case '>': {
                    var1_1.k();
                    var1_1.o((g1)var5_5);
                    return;
                }
lbl23:
                // 1 sources

                var1_1.l(this);
                var1_1.o((g1)var5_5);
                return;
lbl26:
                // 1 sources

                var1_1.o(g1.P);
                return;
                case '=': lbl-1000:
                // 2 sources

                {
                    var1_1.m(this);
                    var1_1.k.o();
                    var6_6 = var1_1.k;
                    var6_6.f = true;
                    var2_2 = var6_6.e;
                    var5_5 = var6_6.d;
                    if (var2_2 != null) {
                        var5_5.append((String)var2_2);
                        var6_6.e = null;
                    }
                    var5_5.append(var3_3);
                    var1_1.o(var4_4);
                    return;
                }
            }
        }
        var2_2.z();
        var1_1.m(this);
        var1_1.k.o();
        var1_1.o(var4_4);
    }
}

