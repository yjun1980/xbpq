/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.V;
import java.util.concurrent.Callable;

final class U
extends L<Object> {
    private final Callable<Object> e;
    final V f;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    U(V v2, Callable callable) {
        this.f = v2;
        callable.getClass();
        this.e = callable;
    }

    @Override
    final void a(Throwable throwable) {
        this.f.u(throwable);
    }

    @Override
    final void b(Object object) {
        this.f.t(object);
    }

    @Override
    final boolean d() {
        return this.f.isDone();
    }

    @Override
    final Object e() {
        return this.e.call();
    }

    @Override
    final String f() {
        return this.e.toString();
    }
}

