/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s0;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class b
implements Future<Object> {
    final Object a;

    b(Object object) {
        this.a = object;
    }

    @Override
    public final boolean cancel(boolean bl) {
        return false;
    }

    @Override
    public final Object get() {
        return this.a;
    }

    @Override
    public final Object get(long l2, TimeUnit timeUnit) {
        return this.a;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }
}

