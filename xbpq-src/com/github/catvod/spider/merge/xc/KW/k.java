/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.i;
import com.github.catvod.spider.merge.xc.KW.j;
import com.github.catvod.spider.merge.xc.s0.E;

public final class k
extends i {
    public final Runnable c;

    public k(Runnable runnable, long l2, j j2) {
        super(l2, j2);
        this.c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.c.run();
            return;
        }
        finally {
            this.b.getClass();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Task[");
        Runnable runnable = this.c;
        stringBuilder.append(runnable.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(E.c(runnable));
        stringBuilder.append(", ");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

