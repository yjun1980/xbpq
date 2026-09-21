/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.L0;

public final class F0
implements Runnable {
    public final int a;
    public final L0 b;

    public /* synthetic */ F0(L0 l02, int n2) {
        this.a = n2;
        this.b = l02;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                L0.h(this.b);
                return;
            }
        }
        L0.c(this.b);
    }
}

