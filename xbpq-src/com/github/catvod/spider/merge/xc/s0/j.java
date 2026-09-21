/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.d0.f;
import com.github.catvod.spider.merge.xc.f0.a;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.K;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.b;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.h;
import com.github.catvod.spider.merge.xc.s0.i;
import com.github.catvod.spider.merge.xc.s0.k;
import com.github.catvod.spider.merge.xc.s0.l;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.s0.p;
import com.github.catvod.spider.merge.xc.s0.p0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.r0;
import com.github.catvod.spider.merge.xc.s0.w;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.t0.A;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j
extends K
implements i,
d {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final com.github.catvod.spider.merge.xc.e0.d d;
    public final com.github.catvod.spider.merge.xc.e0.i e;

    public j(com.github.catvod.spider.merge.xc.e0.d d2) {
        super(1);
        this.d = d2;
        boolean bl = D.a;
        this.e = d2.getContext();
        this._decisionAndIndex$volatile = 0x1FFFFFFF;
        this._state$volatile = com.github.catvod.spider.merge.xc.s0.b.a;
    }

    public static void n(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        stringBuilder.append(object);
        stringBuilder.append(", already has ");
        stringBuilder.append(object2);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static Object q(p0 p02, Object object, int n2, com.github.catvod.spider.merge.by.l l2) {
        if (object instanceof q) {
            boolean bl = D.a;
        } else if (E.g(n2) && (l2 != null || p02 instanceof h)) {
            p02 = p02 instanceof h ? (h)p02 : null;
            object = new p(object, (h)p02, l2, null, 16);
        }
        return object;
    }

    @Override
    public final void a(Object object, CancellationException serializable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object object2;
        while (!((object2 = (atomicReferenceFieldUpdater = g).get(this)) instanceof p0)) {
            if (object2 instanceof q) {
                return;
            }
            if (object2 instanceof p) {
                object = (p)object2;
                boolean bl = ((p)object).e != null;
                if (bl ^ true) {
                    p p2 = p.a((p)object, null, (CancellationException)serializable, 15);
                    do {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, object2, p2)) continue;
                        object2 = ((p)object).b;
                        if (object2 != null) {
                            this.g((h)object2, (Throwable)serializable);
                        }
                        if ((object = ((p)object).c) != null) {
                            try {
                                object.invoke(serializable);
                            }
                            catch (Throwable throwable) {
                                serializable = new StringBuilder("Exception in resume onCancellation handler for ");
                                ((StringBuilder)serializable).append(this);
                                com.github.catvod.spider.merge.xc.C0.a a2 = new com.github.catvod.spider.merge.xc.C0.a(((StringBuilder)serializable).toString(), throwable);
                                E.d(this.e, a2);
                            }
                        }
                        return;
                    } while (atomicReferenceFieldUpdater.get(this) == object2);
                    continue;
                }
                throw new IllegalStateException("Must be called at most once".toString());
            }
            object = new p(object2, null, null, (CancellationException)serializable, 14);
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, object2, object)) continue;
                return;
            } while (atomicReferenceFieldUpdater.get(this) == object2);
        }
        object = new IllegalStateException("Not completed".toString());
        throw object;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.d b() {
        return this.d;
    }

    @Override
    public final Throwable c(Object object) {
        Throwable throwable = super.c(object);
        if (throwable != null) {
            object = throwable;
            if (D.b) {
                object = this.d;
                object = !(object instanceof d) ? throwable : A.a(throwable, (d)object);
            }
        } else {
            object = null;
        }
        return object;
    }

    @Override
    public final Object d(Object object) {
        Object object2 = object;
        if (object instanceof p) {
            object2 = ((p)object).a;
        }
        return object2;
    }

    @Override
    public final Object f() {
        return g.get(this);
    }

    public final void g(h object, Throwable throwable) {
        try {
            object.a();
        }
        catch (Throwable throwable2) {
            object = new StringBuilder("Exception in invokeOnCancellation handler for ");
            ((StringBuilder)object).append(this);
            object = new com.github.catvod.spider.merge.xc.C0.a(((StringBuilder)object).toString(), throwable2);
            E.d(this.e, (Throwable)object);
        }
    }

    @Override
    public final d getCallerFrame() {
        Object object = this.d;
        object = object instanceof d ? (d)object : null;
        return object;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i getContext() {
        return this.e;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(Throwable object) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object v2;
        while ((v2 = (atomicReferenceFieldUpdater = g).get(this)) instanceof p0) {
            Object object2 = new k(this, (Throwable)object, v2 instanceof h);
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, v2, object2)) continue;
                if ((p0)v2 instanceof h) {
                    this.g((h)v2, (Throwable)object);
                }
                if (!this.m() && (object2 = (M)((AtomicReferenceFieldUpdater)(object = h)).get(this)) != null) {
                    object2.b();
                    ((AtomicReferenceFieldUpdater)object).set(this, o0.a);
                }
                this.i(this.c);
                return;
            } while (atomicReferenceFieldUpdater.get(this) == v2);
        }
        return;
    }

    public final void i(int n2) {
        int n3;
        Object object;
        do {
            int n4;
            if ((n4 = (n3 = ((AtomicIntegerFieldUpdater)(object = f)).get(this)) >> 29) == 0) continue;
            if (n4 == 1) {
                boolean bl = D.a;
                bl = n2 == 4;
                object = this.d;
                if (!bl && object instanceof com.github.catvod.spider.merge.xc.t0.i && E.g(n2) == E.g(this.c)) {
                    Object object2 = ((com.github.catvod.spider.merge.xc.t0.i)object).d;
                    com.github.catvod.spider.merge.xc.e0.i i2 = ((com.github.catvod.spider.merge.xc.t0.i)object).e.getContext();
                    if (((w)object2).g()) {
                        ((w)object2).d(i2, this);
                    } else {
                        i2 = r0.a();
                        if (((S)i2).c >= 0x100000000L) {
                            object = object2 = ((S)i2).e;
                            if (object2 == null) {
                                ((S)i2).e = object = new f();
                            }
                            ((f)object).addLast(this);
                        } else {
                            ((S)i2).j(true);
                            try {
                                E.i(this, (com.github.catvod.spider.merge.xc.e0.d)object, true);
                                while (bl = ((S)i2).l()) {
                                }
                            }
                            catch (Throwable throwable) {
                                try {
                                    this.e(throwable, null);
                                }
                                finally {
                                    ((S)i2).h(true);
                                }
                            }
                        }
                    }
                } else {
                    E.i(this, (com.github.catvod.spider.merge.xc.e0.d)object, bl);
                }
                return;
            }
            throw new IllegalStateException("Already resumed".toString());
        } while (!((AtomicIntegerFieldUpdater)object).compareAndSet(this, n3, 0x40000000 + (0x1FFFFFFF & n3)));
    }

    public Throwable j(m0 m02) {
        return m02.p();
    }

    public final Object k() {
        int n2;
        Object object;
        boolean bl = this.m();
        do {
            int n3;
            if ((n3 = (n2 = ((AtomicIntegerFieldUpdater)(object = f)).get(this)) >> 29) == 0) continue;
            if (n3 == 2) {
                if (bl) {
                    this.p();
                }
                if ((object = g.get(this)) instanceof q) {
                    Throwable throwable = ((q)object).a;
                    object = throwable;
                    if (D.b) {
                        object = A.a(throwable, this);
                    }
                    throw object;
                }
                if (E.g(this.c)) {
                    Object object2 = x.b;
                    if ((object2 = (c0)this.e.b((com.github.catvod.spider.merge.xc.e0.h)object2)) != null && !object2.a()) {
                        object2 = ((m0)object2).p();
                        this.a(object, (CancellationException)object2);
                        object = object2;
                        if (D.b) {
                            object = A.a((Throwable)object2, this);
                        }
                        throw object;
                    }
                }
                return this.d(object);
            }
            throw new IllegalStateException("Already suspended".toString());
        } while (!((AtomicIntegerFieldUpdater)object).compareAndSet(this, n2, 0x20000000 + (0x1FFFFFFF & n2)));
        if ((M)h.get(this) == null) {
            this.l();
        }
        if (bl) {
            this.p();
        }
        return com.github.catvod.spider.merge.xc.f0.a.a;
    }

    public final M l() {
        Object object = x.b;
        if ((object = (c0)this.e.b((com.github.catvod.spider.merge.xc.e0.h)object)) == null) {
            return null;
        }
        M m2 = E.f((c0)object, true, new l(this), 2);
        while (!((AtomicReferenceFieldUpdater)(object = h)).compareAndSet(this, null, m2) && ((AtomicReferenceFieldUpdater)object).get(this) == null) {
        }
        return m2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean m() {
        if (this.c != 2) return false;
        com.github.catvod.spider.merge.xc.e0.d d2 = this.d;
        com.github.catvod.spider.merge.mI.i.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        d2 = (com.github.catvod.spider.merge.xc.t0.i)d2;
        if (com.github.catvod.spider.merge.xc.t0.i.h.get(d2) == null) return false;
        return true;
    }

    public String o() {
        return "CancellableContinuation";
    }

    /*
     * Unable to fully structure code
     */
    public final void p() {
        block6: {
            block7: {
                var2_1 = this.d;
                var1_2 = var2_1 instanceof com.github.catvod.spider.merge.xc.t0.i;
                var3_3 = null;
                var2_1 = var1_2 != false ? (com.github.catvod.spider.merge.xc.t0.i)var2_1 : null;
                if (var2_1 == null) break block6;
                while ((var4_4 = (var5_5 = com.github.catvod.spider.merge.xc.t0.i.h).get(var2_1)) == (var6_6 = com.github.catvod.spider.merge.xc.t0.a.c)) {
                    do {
                        if (!var5_5.compareAndSet(var2_1, var6_6, this)) continue;
                        var2_1 = var3_3;
                        ** GOTO lbl17
                    } while (var5_5.get(var2_1) == var6_6);
                }
                if (!(var4_4 instanceof Throwable)) break block7;
                do {
                    if (!var5_5.compareAndSet(var2_1, var4_4, null)) continue;
                    var2_1 = (Throwable)var4_4;
lbl17:
                    // 2 sources

                    if (var2_1 != null) {
                        var4_4 = j.h;
                        var3_3 = (M)var4_4.get((j)this);
                        if (var3_3 != null) {
                            var3_3.b();
                            var4_4.set(this, o0.a);
                        }
                        this.h((Throwable)var2_1);
                        return;
                    }
                    break block6;
                } while (var5_5.get(var2_1) == var4_4);
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            var2_1 = new StringBuilder("Inconsistent state ");
            var2_1.append(var4_4);
            throw new IllegalStateException(var2_1.toString().toString());
        }
    }

    @Override
    public final void resumeWith(Object object) {
        Object object2;
        block9: {
            block8: {
                Object v2;
                object2 = com.github.catvod.spider.merge.xc.c0.d.a(object);
                if (object2 != null) {
                    object = object2;
                    if (D.b) {
                        object = A.a((Throwable)object2, this);
                    }
                    object = new q((Throwable)object, false);
                }
                int n2 = this.c;
                while ((v2 = ((AtomicReferenceFieldUpdater)(object2 = g)).get(this)) instanceof p0) {
                    Object object3 = j.q((p0)v2, object, n2, null);
                    do {
                        if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(this, v2, object3)) continue;
                        if (!this.m() && (object2 = (M)((AtomicReferenceFieldUpdater)(object = h)).get(this)) != null) {
                            object2.b();
                            ((AtomicReferenceFieldUpdater)object).set(this, o0.a);
                        }
                        this.i(n2);
                        break block8;
                    } while (((AtomicReferenceFieldUpdater)object2).get(this) == v2);
                }
                if (!(v2 instanceof k)) break block9;
                object2 = (k)v2;
                object2.getClass();
                if (!k.c.compareAndSet(object2, 0, 1)) break block9;
            }
            return;
        }
        object2 = new StringBuilder("Already resumed, but proposed with update ");
        ((StringBuilder)object2).append(object);
        object = new IllegalStateException(((StringBuilder)object2).toString().toString());
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o());
        stringBuilder.append('(');
        stringBuilder.append(E.j(this.d));
        stringBuilder.append("){");
        Object object = g.get(this);
        object = object instanceof p0 ? "Active" : (object instanceof k ? "Cancelled" : "Completed");
        stringBuilder.append((String)object);
        stringBuilder.append("}@");
        stringBuilder.append(E.c(this));
        return stringBuilder.toString();
    }
}

