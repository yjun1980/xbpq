/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.UY.e;
import java.util.concurrent.ScheduledExecutorService;

public final class a
implements Runnable {
    public final int a;
    public final e b;

    public /* synthetic */ a(e e2, int n2) {
        this.a = n2;
        this.b = e2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ScheduledExecutorService scheduledExecutorService = this.b.e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                return;
            }
            case 1: {
                this.b.d();
                return;
            }
            case 0: 
        }
        this.b.d();
    }
}

