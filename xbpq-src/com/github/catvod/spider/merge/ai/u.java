/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.Notice;
import com.github.catvod.spider.merge.bk.e;

public final class u
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ u(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                Notice.b((Notice)((Object)this.b));
                return;
            }
        }
        e.a((String)this.b);
    }
}

