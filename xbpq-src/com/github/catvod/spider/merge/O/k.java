/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.O.i;
import com.github.catvod.spider.merge.O.j;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;

public final class k
extends i {
    public final Runnable e;

    public k(Runnable runnable, long l2, j j2) {
        super(l2, j2);
        this.e = runnable;
    }

    @Override
    public final void run() {
        try {
            this.e.run();
            return;
        }
        finally {
            this.d.b();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("3331323A0C"));
        stringBuilder.append(h.c(this.e));
        stringBuilder.append('@');
        stringBuilder.append(h.d(this.e));
        String string = cYh.d("4B70");
        stringBuilder.append(string);
        stringBuilder.append(this.c);
        stringBuilder.append(string);
        stringBuilder.append(this.d);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

