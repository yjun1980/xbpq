package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public final class k extends i {
    public final Runnable e;

    public k(Runnable runnable, long j, j jVar) {
        super(j, jVar);
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.run();
        } finally {
            this.d.b();
        }
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("3331323A0C"));
        b.append(com.github.catvod.spider.merge.L.h.c(this.e));
        b.append('@');
        b.append(com.github.catvod.spider.merge.L.h.d(this.e));
        String d = cYh.d("4B70");
        b.append(d);
        b.append(this.c);
        b.append(d);
        b.append(this.d);
        b.append(']');
        return b.toString();
    }
}
