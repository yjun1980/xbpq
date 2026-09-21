/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.m;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.n;

public final class f0
extends m0 {
    public final boolean c;

    /*
     * Unable to fully structure code
     */
    public f0(c0 var1_1) {
        var2_2 = true;
        super(true);
        this.u((c0)var1_1);
        var3_3 = m0.b;
        var1_1 = (m)var3_3.get(this);
        var1_1 = var1_1 instanceof n != false ? (n)var1_1 : null;
        if (var1_1 == null) ** GOTO lbl13
        var1_1 = var1_1.k();
        while (!var1_1.q()) {
            if ((var1_1 = (var1_1 = (m)var3_3.get(var1_1)) instanceof n != false ? (n)var1_1 : null) != null) {
                var1_1 = var1_1.k();
                continue;
            }
lbl13:
            // 3 sources

            var2_2 = false;
            break;
        }
        this.c = var2_2;
    }

    @Override
    public final boolean q() {
        return this.c;
    }
}

