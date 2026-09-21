/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.a;
import java.util.concurrent.locks.LockSupport;

public final class f
extends a {
    public final Thread d;
    public final S e;

    public f(i i2, Thread thread, S s2) {
        super(i2, true);
        this.d = thread;
        this.e = s2;
    }

    @Override
    public final void i() {
        Thread thread;
        Thread thread2 = Thread.currentThread();
        if (!com.github.catvod.spider.merge.mI.i.a(thread2, thread = this.d)) {
            LockSupport.unpark(thread);
        }
    }
}

