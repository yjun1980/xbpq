/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.A;
import com.github.catvod.spider.merge.C.D;
import com.github.catvod.spider.merge.D.y;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.Callable;

final class l
implements Callable<Void> {
    final o a;

    l(o o2) {
        this.a = o2;
    }

    @Override
    public final Object call() {
        o.a(this.a).c(Timestamp.class, A.c);
        o.a(this.a).c(java.sql.Date.class, A.b);
        o.a(this.a).c(Time.class, D.a);
        o.a(this.a).c(Date.class, y.a);
        return null;
    }
}

