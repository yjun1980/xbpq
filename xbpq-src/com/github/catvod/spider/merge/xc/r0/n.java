/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.j;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.o0.d;
import com.github.catvod.spider.merge.xc.r0.e;
import com.github.catvod.spider.merge.xc.r0.m;
import java.util.List;
import java.util.NoSuchElementException;

public final class n
extends j
implements p {
    public final int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ n(Object object, boolean bl, int n2) {
        this.a = n2;
        this.c = object;
        this.b = bl;
        super(2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object invoke(Object var1_1, Object var2_2) {
        switch (this.a) {
            default: {
                var9_3 = (CharSequence)var1_1;
                var4_4 = ((Number)var2_2).intValue();
                i.e(var9_3, "$this$$receiver");
                var2_2 = null;
                var10_5 = (List)this.c;
                var7_6 = this.b;
                if (var7_6 || var10_5.size() != 1) ** GOTO lbl20
                var3_7 = var10_5.size();
                if (var3_7 == 0) ** GOTO lbl19
                if (var3_7 != 1) ** GOTO lbl18
                var1_1 = (String)var10_5.get(0);
                var3_7 = e.R(var9_3, (String)var1_1, var4_4, false, 4);
                if (var3_7 < 0) ** GOTO lbl65
                var1_1 = new b(var3_7, var1_1);
                ** GOTO lbl66
lbl18:
                // 1 sources

                throw new IllegalArgumentException("List has more than one element.");
lbl19:
                // 1 sources

                throw new NoSuchElementException("List is empty.");
lbl20:
                // 1 sources

                var3_7 = var4_4;
                if (var4_4 < 0) {
                    var3_7 = 0;
                }
                var1_1 = new d(var3_7, var9_3.length());
                var8_9 = var9_3 instanceof String;
                var6_10 = var1_1.c;
                var5_11 = var1_1.b;
                if (!var8_9) ** GOTO lbl47
                if (var6_10 <= 0) ** GOTO lbl31
                var4_4 = var3_7;
                if (var3_7 <= var5_11) ** GOTO lbl33
lbl31:
                // 2 sources

                if (var6_10 >= 0 || var5_11 > var3_7) ** GOTO lbl65
                var4_4 = var3_7;
lbl33:
                // 2 sources

                while (true) {
                    for (Object var1_1 : var10_5) {
                        var11_12 = (String)var1_1;
                        if (!m.J(var11_12, (String)var9_3, var4_4, var11_12.length(), var7_6)) continue;
                        ** GOTO lbl39
                    }
                    var1_1 = null;
lbl39:
                    // 2 sources

                    var1_1 = (String)var1_1;
                    if (var1_1 == null) ** GOTO lbl43
                    var1_1 = new b(var4_4, var1_1);
                    ** GOTO lbl66
lbl43:
                    // 1 sources

                    if (var4_4 != var5_11) {
                        var4_4 += var6_10;
                        continue;
                    }
                    ** GOTO lbl65
                    break;
                }
lbl47:
                // 1 sources

                if (var6_10 <= 0) ** GOTO lbl50
                var4_4 = var3_7;
                if (var3_7 <= var5_11) ** GOTO lbl52
lbl50:
                // 2 sources

                if (var6_10 >= 0 || var5_11 > var3_7) ** GOTO lbl65
                var4_4 = var3_7;
lbl52:
                // 2 sources

                while (true) {
                    for (Object var1_1 : var10_5) {
                        var12_15 = (String)var1_1;
                        if (!e.V(var12_15, var9_3, var4_4, var12_15.length(), var7_6)) continue;
                        ** GOTO lbl58
                    }
                    var1_1 = null;
lbl58:
                    // 2 sources

                    var1_1 = (String)var1_1;
                    if (var1_1 == null) ** GOTO lbl62
                    var1_1 = new b(var4_4, var1_1);
                    ** GOTO lbl66
lbl62:
                    // 1 sources

                    if (var4_4 == var5_11) break;
                    var4_4 += var6_10;
                }
lbl65:
                // 5 sources

                var1_1 = null;
lbl66:
                // 4 sources

                if (var1_1 != null) {
                    var3_7 = ((String)var1_1.b).length();
                    var2_2 = new b(var1_1.a, var3_7);
                }
                return var2_2;
            }
            case 0: 
        }
        var1_1 = (CharSequence)var1_1;
        var3_8 = ((Number)var2_2).intValue();
        i.e(var1_1, "$this$$receiver");
        var3_8 = e.S((CharSequence)var1_1, (char[])this.c, var3_8, this.b);
        var1_1 = var3_8 < 0 ? null : new b(var3_8, 1);
        return var1_1;
    }
}

