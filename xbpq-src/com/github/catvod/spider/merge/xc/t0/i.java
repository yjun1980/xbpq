/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.d0.f;
import com.github.catvod.spider.merge.xc.g0.c;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.K;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.r;
import com.github.catvod.spider.merge.xc.s0.r0;
import com.github.catvod.spider.merge.xc.s0.w;
import com.github.catvod.spider.merge.xc.t0.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class i
extends K
implements d,
com.github.catvod.spider.merge.xc.e0.d {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final w d;
    public final com.github.catvod.spider.merge.xc.e0.d e;
    public Object f;
    public final Object g;

    public i(w i2, c c2) {
        super(-1);
        this.d = i2;
        this.e = c2;
        this.f = com.github.catvod.spider.merge.xc.t0.a.b;
        i2 = c2.a;
        com.github.catvod.spider.merge.mI.i.b(i2);
        this.g = com.github.catvod.spider.merge.xc.t0.a.j(i2);
    }

    @Override
    public final void a(Object object, CancellationException cancellationException) {
        if (object instanceof r) {
            ((r)object).b.invoke(cancellationException);
        }
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.d b() {
        return this;
    }

    @Override
    public final Object f() {
        Object object = this.f;
        boolean bl = D.a;
        this.f = com.github.catvod.spider.merge.xc.t0.a.b;
        return object;
    }

    @Override
    public final d getCallerFrame() {
        Object object = this.e;
        object = object instanceof d ? (d)object : null;
        return object;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i getContext() {
        return this.e.getContext();
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void resumeWith(Object object) {
        Throwable throwable222222;
        com.github.catvod.spider.merge.xc.e0.d d2 = this.e;
        com.github.catvod.spider.merge.xc.e0.i i2 = d2.getContext();
        Object object2 = com.github.catvod.spider.merge.xc.c0.d.a(object);
        object2 = object2 == null ? object : new q((Throwable)object2, false);
        Object object3 = this.d;
        if (((w)object3).g()) {
            this.f = object2;
            this.c = 0;
            ((w)object3).d(i2, this);
            return;
        }
        boolean bl = D.a;
        i2 = r0.a();
        if (((S)i2).c >= 0x100000000L) {
            this.f = object2;
            this.c = 0;
            object = object2 = ((S)i2).e;
            if (object2 == null) {
                ((S)i2).e = object = new f();
            }
            ((f)object).addLast(this);
            return;
        }
        ((S)i2).j(true);
        object2 = d2.getContext();
        object3 = com.github.catvod.spider.merge.xc.t0.a.k((com.github.catvod.spider.merge.xc.e0.i)object2, this.g);
        d2.resumeWith(object);
        com.github.catvod.spider.merge.xc.t0.a.f((com.github.catvod.spider.merge.xc.e0.i)object2, object3);
        while (bl = ((S)i2).l()) {
        }
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            com.github.catvod.spider.merge.xc.t0.a.f((com.github.catvod.spider.merge.xc.e0.i)object2, object3);
            throw throwable3;
        }
        try {
            this.e(throwable222222, null);
            return;
        }
        finally {
            ((S)i2).h(true);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DispatchedContinuation[");
        stringBuilder.append(this.d);
        stringBuilder.append(", ");
        stringBuilder.append(E.j(this.e));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

