/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.KW.j;
import com.github.catvod.spider.merge.xc.KW.l;
import com.github.catvod.spider.merge.xc.c0.f;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.k0.a;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.t0.A;
import java.util.concurrent.CancellationException;

public abstract class K
extends com.github.catvod.spider.merge.xc.KW.i {
    public int c;

    public K(int n2) {
        super(0L, l.g);
        this.c = n2;
    }

    public abstract void a(Object var1, CancellationException var2);

    public abstract com.github.catvod.spider.merge.xc.e0.d b();

    public Throwable c(Object object) {
        boolean bl = object instanceof q;
        Throwable throwable = null;
        object = bl ? (q)object : null;
        if (object != null) {
            throwable = ((q)object).a;
        }
        return throwable;
    }

    public Object d(Object object) {
        return object;
    }

    public final void e(Throwable object, Throwable throwable) {
        if (object == null && throwable == null) {
            return;
        }
        if (object != null && throwable != null) {
            com.github.catvod.spider.merge.xc.D0.b.c((Throwable)object, throwable);
        }
        Throwable throwable2 = object;
        if (object == null) {
            throwable2 = throwable;
        }
        object = new StringBuilder("Fatal exception in coroutines machinery for ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        object = ((StringBuilder)object).toString();
        i.b(throwable2);
        object = new a((String)object, throwable2);
        E.d(this.b().getContext(), (Throwable)object);
    }

    public abstract Object f();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable4;
        Throwable throwable22;
        Object object;
        com.github.catvod.spider.merge.xc.e0.i i2;
        j j2;
        Object object2;
        block16: {
            Throwable throwable3;
            Object object3;
            com.github.catvod.spider.merge.xc.e0.d d2;
            Object object4;
            block15: {
                object2 = f.a;
                boolean bl = D.a;
                j2 = this.b;
                try {
                    object4 = this.b();
                    i.c(object4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                    object4 = (com.github.catvod.spider.merge.xc.t0.i)object4;
                    d2 = ((com.github.catvod.spider.merge.xc.t0.i)object4).e;
                    object4 = ((com.github.catvod.spider.merge.xc.t0.i)object4).g;
                    i2 = d2.getContext();
                    object = com.github.catvod.spider.merge.xc.t0.a.k(i2, object4);
                    if (object == com.github.catvod.spider.merge.xc.t0.a.e) break block15;
                    E.l(d2, i2);
                }
                catch (Throwable throwable22) {}
            }
            try {
                object4 = d2.getContext();
                object3 = this.f();
                throwable3 = this.c(object3);
                object4 = throwable3 == null && E.g(this.c) ? (c0)object4.b(x.b) : null;
            }
            catch (Throwable throwable4) {
                break block16;
            }
            if (object4 != null && !object4.a()) {
                throwable3 = ((m0)object4).p();
                this.a(object3, (CancellationException)throwable3);
                object4 = throwable3;
                if (D.b) {
                    object4 = !(d2 instanceof d) ? throwable3 : A.a(throwable3, (d)((Object)d2));
                }
                d2.resumeWith(com.github.catvod.spider.merge.xc.a.a.h((Throwable)object4));
            } else if (throwable3 != null) {
                d2.resumeWith(com.github.catvod.spider.merge.xc.a.a.h(throwable3));
            } else {
                d2.resumeWith(this.d(object3));
            }
            com.github.catvod.spider.merge.xc.t0.a.f(i2, object);
            try {
                j2.getClass();
            }
            catch (Throwable throwable5) {
                object2 = com.github.catvod.spider.merge.xc.a.a.h(throwable5);
            }
            this.e(null, com.github.catvod.spider.merge.xc.c0.d.a(object2));
            return;
        }
        com.github.catvod.spider.merge.xc.t0.a.f(i2, object);
        throw throwable4;
        try {
            j2.getClass();
        }
        catch (Throwable throwable6) {
            object2 = com.github.catvod.spider.merge.xc.a.a.h(throwable6);
        }
        this.e(throwable22, com.github.catvod.spider.merge.xc.c0.d.a(object2));
    }
}

