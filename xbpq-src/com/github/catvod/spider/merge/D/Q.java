/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import java.lang.reflect.Type;
import java.util.List;

public final class Q
implements X {
    public static final Q a = new Q();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void d(L var1_1, Object var2_2, Object var3_4, Type var4_5, int var5_6) {
        block26: {
            var12_7 = var1_1.j;
            var11_8 /* !! */  = i0.o;
            var6_9 = !var12_7.g(var11_8 /* !! */ ) && (var6_9 = (var5_6 & var11_8 /* !! */ .a) != 0 ? 1 : 0) == 0 ? 0 : 1;
            var12_7 = var1_1.j;
            var11_8 /* !! */  = null;
            if (var6_9 != 0) {
                var11_8 /* !! */  = A.L((Type)var4_5);
            }
            if (var2_2 == null) {
                var12_7.u(i0.h);
                return;
            }
            var13_10 = (List)var2_2;
            if (var13_10.size() == 0) {
                var12_7.b("[]");
                return;
            }
            var4_5 = var1_1.p;
            var1_1.s((c0)var4_5, var2_2, var3_4);
            if (!var12_7.g(i0.n)) break block26;
            var12_7.write(91);
            var1_1.o();
            var15_11 = var13_10.iterator();
            var6_9 = 0;
            while (true) {
                block29: {
                    if (!var15_11.hasNext()) break;
                    var16_15 = var15_11.next();
                    if (var6_9 == 0) ** GOTO lbl31
                    var12_7.write(44);
lbl31:
                    // 2 sources

                    var1_1.r();
                    if (var16_15 == null) ** GOTO lbl41
                    if (var1_1.i(var16_15)) {
                        var1_1.x(var16_15);
                    } else {
                        var14_13 = var1_1.n(var16_15.getClass());
                        var1_1.p = var13_10 = new c0((c0)var4_5, var2_2, var3_4, 0);
                        var14_13.d(var1_1, var16_15, var6_9, (Type)var11_8 /* !! */ , var5_6);
                    }
                    break block29;
lbl41:
                    // 1 sources

                    var1_1.j.s();
                }
                ++var6_9;
                continue;
                break;
            }
            var1_1.j();
            var1_1.r();
            var12_7.write(93);
            return;
        }
        var12_7.write(91);
        var7_16 = var13_10.size();
        for (var8_17 = 0; var8_17 < var7_16; ++var8_17) {
            block28: {
                block27: {
                    var14_14 = var13_10.get(var8_17);
                    if (var8_17 == 0) break block27;
                    var12_7.write(44);
                }
                if (var14_14 != null) ** GOTO lbl66
                var12_7.b("null");
                continue;
lbl66:
                // 1 sources

                var15_12 = var14_14.getClass();
                if (var15_12 != Integer.class) break block28;
                var12_7.q((Integer)var14_14);
                continue;
            }
            if (var15_12 != Long.class) ** GOTO lbl82
            var9_18 = (Long)var14_14;
            if (var6_9 == 0) ** GOTO lbl80
            var12_7.r(var9_18);
            var12_7.write(76);
            continue;
lbl80:
            // 1 sources

            var12_7.r(var9_18);
            continue;
lbl82:
            // 1 sources

            if ((i0.p.a & var5_6) != 0) {
                var1_1.n(var14_14.getClass()).d(var1_1, var14_14, var8_17, (Type)var11_8 /* !! */ , var5_6);
                continue;
            }
            if (!var12_7.h) {
                var1_1.p = var15_12 = new c0((c0)var4_5, var2_2, var3_4, 0);
            }
            if (var1_1.i(var14_14)) {
                var1_1.x(var14_14);
                continue;
            }
            var15_12 = var1_1.n(var14_14.getClass());
            if ((i0.o.a & var5_6) != 0 && var15_12 instanceof M) {
                ((M)var15_12).v(var1_1, var14_14, var8_17, (Type)var11_8 /* !! */ , var5_6);
                continue;
            }
            var15_12.d(var1_1, var14_14, var8_17, (Type)var11_8 /* !! */ , var5_6);
        }
        try {
            var12_7.write(93);
            var1_1.p = var4_5;
            return;
        }
        catch (Throwable var2_3) {
            throw var2_3;
        }
        finally {
            var1_1.p = var4_5;
        }
    }
}

