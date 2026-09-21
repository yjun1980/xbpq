/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.l;
import com.github.catvod.spider.merge.xc.KW.m;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.s0.T;
import com.github.catvod.spider.merge.xc.s0.w;
import com.github.catvod.spider.merge.xc.t0.B;
import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.o;
import java.util.concurrent.Executor;

public final class d
extends T
implements Executor {
    public static final d c;
    public static final w d;

    static {
        int n2;
        block4: {
            block6: {
                w w2;
                block5: {
                    c = new d();
                    w2 = m.c;
                    n2 = B.a;
                    if (64 >= n2) {
                        n2 = 64;
                    }
                    n2 = com.github.catvod.spider.merge.xc.t0.a.i("kotlinx.coroutines.io.parallelism", n2, 0, 0, 12);
                    w2.getClass();
                    if (n2 < 1) break block4;
                    if (n2 >= l.d) break block5;
                    if (n2 < 1) break block6;
                    w2 = new o(w2, n2);
                }
                d = w2;
                return;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.Bk.m.c(n2, "Expected positive parallelism level, but got ").toString());
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.Bk.m.c(n2, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override
    public final void d(i i2, Runnable runnable) {
        d.d(i2, runnable);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.d(j.a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}

