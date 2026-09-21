/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.e0;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.t0.a;

public final class l
extends e0 {
    public final j e;

    public l(j j2) {
        this.e = j2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(Throwable var1_1) {
        var2_2 = this.k();
        var1_1 = this.e;
        var2_2 = var1_1.j((m0)var2_2);
        if (!var1_1.m()) ** GOTO lbl-1000
        var3_3 = var1_1.d;
        i.c(var3_3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        var6_4 = (com.github.catvod.spider.merge.xc.t0.i)var3_3;
        block0: while (true) {
            block6: {
                if (i.a(var3_3 = (var4_5 = com.github.catvod.spider.merge.xc.t0.i.h).get(var6_4), var5_6 = com.github.catvod.spider.merge.xc.t0.a.c)) {
                    while (!var4_5.compareAndSet(var6_4, var5_6, var2_2)) {
                        if (var4_5.get(var6_4) == var5_6) continue;
                        continue block0;
                    }
                } else if (!(var3_3 instanceof Throwable)) {
                    while (true) {
                        if (!var4_5.compareAndSet(var6_4, var3_3, null)) continue;
                        break;
                    }
                }
                break block6;
lbl-1000:
                // 2 sources

                {
                    var1_1.h((Throwable)var2_2);
                    if (var1_1.m() || (var3_3 = (M)(var2_2 = j.h).get(var1_1)) == null) break;
                    var3_3.b();
                    var2_2.set(var1_1, o0.a);
                }
            }
            return;
            if (var4_5.get(var6_4) == var3_3) ** continue;
        }
    }
}

