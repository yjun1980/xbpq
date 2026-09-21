/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.L;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.UY.Q;
import com.github.catvod.spider.merge.UY.S;

public final class G
implements Runnable {
    public final int a;

    public /* synthetic */ G(int n2) {
        this.a = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        block2: {
            if (this.a != 0) ** GOTO lbl11
            try {
                var1_1 = M.r;
                var1_1 = L.a.q;
                var1_1.g();
                var2_4 = new Q((S)var1_1, 3);
                InitOrigin.run((Runnable)var2_4);
                var2_4 = new Q((S)var1_1, 4);
                InitOrigin.execute((Runnable)var2_4);
                break block2;
lbl11:
                // 1 sources

                var1_2 = M.r;
                var1_2 = L.a.q;
                var1_2.g();
                var2_5 = new Q((S)var1_2, 1);
                InitOrigin.run((Runnable)var2_5);
                var2_5 = new Q((S)var1_2, 2);
                InitOrigin.execute((Runnable)var2_5);
            }
            catch (Exception var1_3) {
                A.m("UC \u667a\u80fd\u753b\u8d28\u6388\u6743\u5931\u8d25");
            }
        }
    }
}

