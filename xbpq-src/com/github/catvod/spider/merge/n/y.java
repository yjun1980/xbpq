/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.A;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.o;
import com.github.catvod.spider.merge.n.z;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class y
extends L<Object> {
    private final Executor e;
    final z f;
    private final Callable<Object> g;
    final z h;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    y(z z2, Callable callable) {
        A a2 = A.c;
        this.h = z2;
        this.f = z2;
        this.e = a2;
        this.g = callable;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    final void a(Throwable object) {
        Object object2;
        z.L(this.f);
        if (object instanceof ExecutionException) {
            z z2 = this.f;
            object2 = ((ExecutionException)object).getCause();
            object = z2;
        } else {
            if (object instanceof CancellationException) {
                this.f.cancel(false);
                return;
            }
            z z3 = this.f;
            object2 = object;
            object = z3;
        }
        ((o)object).u((Throwable)object2);
    }

    @Override
    final void b(Object object) {
        z.L(this.f);
        this.h.t(object);
    }

    @Override
    final boolean d() {
        return this.f.isDone();
    }

    @Override
    final Object e() {
        return this.g.call();
    }

    @Override
    final String f() {
        return this.g.toString();
    }

    final void h() {
        try {
            this.e.execute(this);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.f.u(rejectedExecutionException);
        }
    }
}

