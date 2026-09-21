/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.w;
import com.github.catvod.spider.merge.xc.t0.o;

public final class n
implements Runnable {
    public Runnable a;
    public final o b;

    public n(o o2, Runnable runnable) {
        this.b = o2;
        this.a = runnable;
    }

    @Override
    public final void run() {
        Object object;
        o o2;
        int n2 = 0;
        while (true) {
            int n3;
            try {
                this.a.run();
            }
            catch (Throwable throwable) {
                E.d(j.a, throwable);
            }
            o2 = this.b;
            object = o2.h();
            if (object == null) {
                return;
            }
            this.a = object;
            n2 = n3 = n2 + 1;
            if (n3 < 16) continue;
            object = o2.c;
            n2 = n3;
            if (((w)object).g()) break;
        }
        ((w)object).d(o2, this);
    }
}

