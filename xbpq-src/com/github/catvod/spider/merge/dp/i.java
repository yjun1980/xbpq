/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.dp;

import com.github.catvod.spider.merge.dp.p;

public final class i
implements Runnable {
    public final int c;
    public final p d;

    public /* synthetic */ i(p p2, int n2) {
        this.c = n2;
        this.d = p2;
    }

    @Override
    public final void run() {
        switch (this.c) {
            default: {
                break;
            }
            case 0: {
                p.d(this.d);
                return;
            }
        }
        p.a(this.d);
    }
}

