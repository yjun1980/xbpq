/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;
import java.util.Locale;

public final class S
extends g1 {
    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(P var1_1, a var2_2) {
        block12: {
            block11: {
                if (!var2_2.r('/')) break block11;
                var1_1.d();
                var1_1.o(g1.l);
                var1_1.a.a();
                break block12;
            }
            if (!var2_2.t() || var1_1.o == null) ** GOTO lbl-1000
            if (var1_1.p == null) {
                var8_3 = new StringBuilder("</");
                var8_3.append(var1_1.o);
                var1_1.p = var8_3.toString();
            }
            var8_3 = var1_1.p;
            var7_4 = var8_3.equals(var2_2.l);
            var5_5 = 1;
            var3_6 = 1;
            var4_7 = -1;
            if (!var7_4) ** GOTO lbl-1000
            var6_8 = var2_2.m;
            if (var6_8 == -1) {
                var3_6 = 0;
            } else if (var6_8 >= var2_2.e) {
                var3_6 = var5_5;
            } else lbl-1000:
            // 2 sources

            {
                var2_2.l = var8_3;
                var9_9 = Locale.ENGLISH;
                var6_8 = var2_2.v(var8_3.toLowerCase(var9_9));
                if (var6_8 > -1) {
                    var2_2.m = var2_2.e + var6_8;
                    var3_6 = var5_5;
                } else {
                    var5_5 = var2_2.v(var8_3.toUpperCase(var9_9));
                    if (var5_5 <= -1) {
                        var3_6 = 0;
                    }
                    if (var3_6 != 0) {
                        var4_7 = var2_2.e + var5_5;
                    }
                    var2_2.m = var4_7;
                }
            }
            if (var3_6 == 0) {
                var2_2 = var1_1.c(false);
                var2_2.n(var1_1.o);
                var1_1.k = var2_2;
                var1_1.k();
                var1_1.o(g1.h);
            } else lbl-1000:
            // 2 sources

            {
                var1_1.g("<");
                var1_1.o(g1.c);
            }
        }
    }
}

