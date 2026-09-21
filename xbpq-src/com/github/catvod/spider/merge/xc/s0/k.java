/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.s0.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class k
extends q {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(k.class, "_resumed$volatile");
    private volatile int _resumed$volatile;

    public k(d d2, Throwable serializable, boolean bl) {
        Throwable throwable = serializable;
        if (serializable == null) {
            serializable = new StringBuilder("Continuation ");
            ((StringBuilder)serializable).append(d2);
            ((StringBuilder)serializable).append(" was cancelled normally");
            throwable = new CancellationException(((StringBuilder)serializable).toString());
        }
        super(throwable, bl);
        this._resumed$volatile = 0;
    }
}

