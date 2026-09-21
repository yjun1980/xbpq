/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.u;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.l;
import com.github.catvod.spider.merge.xc.s0.B;
import com.github.catvod.spider.merge.xc.s0.C;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.H;
import com.github.catvod.spider.merge.xc.s0.I;
import com.github.catvod.spider.merge.xc.s0.K;
import com.github.catvod.spider.merge.xc.s0.L;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.O;
import com.github.catvod.spider.merge.xc.s0.X;
import com.github.catvod.spider.merge.xc.s0.Y;
import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.a;
import com.github.catvod.spider.merge.xc.s0.b;
import com.github.catvod.spider.merge.xc.s0.c;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.d;
import com.github.catvod.spider.merge.xc.s0.e;
import com.github.catvod.spider.merge.xc.s0.g0;
import com.github.catvod.spider.merge.xc.s0.h;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.k;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.s0.p;
import com.github.catvod.spider.merge.xc.s0.p0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.t;
import com.github.catvod.spider.merge.xc.s0.t0;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.s0.z;
import com.github.catvod.spider.merge.xc.t0.f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class E {
    public static final A a = new A(5, "RESUME_TOKEN");
    public static final A b = new A(5, "CLOSED_EMPTY");
    public static final A c = new A(5, "COMPLETING_ALREADY");
    public static final A d = new A(5, "COMPLETING_WAITING_CHILDREN");
    public static final A e = new A(5, "COMPLETING_RETRY");
    public static final A f = new A(5, "TOO_LATE_TO_CANCEL");
    public static final A g = new A(5, "SEALED");
    public static final O h = new O(false);
    public static final O i = new O(true);

    public static I a(f b2, com.github.catvod.spider.merge.by.p p2) {
        com.github.catvod.spider.merge.xc.e0.j j2 = com.github.catvod.spider.merge.xc.e0.j.a;
        C c2 = C.a;
        b2 = new I(E.h(b2, j2), true);
        ((a)b2).F(c2, (a)b2, p2);
        return b2;
    }

    public static final Object b(ArrayList object, u cArray) {
        int n2;
        if (((ArrayList)object).isEmpty()) {
            return com.github.catvod.spider.merge.xc.d0.q.a;
        }
        int n3 = 0;
        Object object2 = ((ArrayList)object).toArray(new H[0]);
        Object object3 = new e((H[])object2);
        object = new j(com.github.catvod.spider.merge.xc.a.a.m((com.github.catvod.spider.merge.xc.e0.d)cArray));
        if ((cArray = ((j)object).l()) != null && j.g.get(object) instanceof p0 ^ true) {
            cArray.b();
            cArray = o0.a;
            j.h.set(object, cArray);
        }
        int n4 = ((H[])object2).length;
        cArray = new c[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            int n5;
            H h2 = object2[n2];
            Object object4 = (m0)((Object)h2);
            while ((n5 = ((m0)object4).C(((m0)object4).s())) != 0 && n5 != 1) {
            }
            object4 = new c((e)object3, (j)object);
            ((c)object4).f = E.f(h2, false, (h0)object4, 3);
            cArray[n2] = object4;
        }
        object2 = new d(cArray);
        for (n2 = n3; n2 < n4; ++n2) {
            object3 = cArray[n2];
            object3.getClass();
            com.github.catvod.spider.merge.xc.s0.c.h.set(object3, object2);
        }
        if (j.g.get(object) instanceof p0 ^ true) {
            ((d)object2).b();
        } else {
            E.e((j)object, (h)object2);
        }
        return ((j)object).k();
    }

    public static final String c(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
    }

    public static final void d(com.github.catvod.spider.merge.xc.e0.i i2, Throwable throwable) {
        try {
            m.l(i2.b(x.a));
        }
        catch (Throwable throwable2) {
            if (throwable != throwable2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
                com.github.catvod.spider.merge.xc.D0.b.c(runtimeException, throwable);
                throwable = runtimeException;
            }
            com.github.catvod.spider.merge.xc.t0.a.b(i2, throwable);
            return;
        }
        com.github.catvod.spider.merge.xc.t0.a.b(i2, throwable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void e(j j2, h h2) {
        boolean bl = D.a;
        while (true) {
            Object object;
            Object object2;
            Object v2;
            block12: {
                block13: {
                    block11: {
                        if ((v2 = ((AtomicReferenceFieldUpdater)(object2 = j.g)).get(j2)) instanceof b) break block11;
                        bl = v2 instanceof h;
                        object = null;
                        if (bl) {
                            j.n(h2, v2);
                            throw null;
                        }
                        if (v2 instanceof q) {
                            object2 = (q)v2;
                            object2.getClass();
                            if (!q.b.compareAndSet(object2, 0, 1)) {
                                j.n(h2, v2);
                                throw null;
                            }
                            if (!(v2 instanceof k)) return;
                            if (!(v2 instanceof q)) {
                                object2 = null;
                            }
                            if (object2 != null) {
                                object = ((q)object2).a;
                            }
                            j2.g(h2, (Throwable)object);
                            return;
                        }
                        if (!(v2 instanceof p)) break block12;
                        object = (p)v2;
                        if (((p)object).b != null) {
                            j.n(h2, v2);
                            throw null;
                        }
                        Throwable throwable = ((p)object).e;
                        if (throwable != null) {
                            j2.g(h2, throwable);
                            return;
                        }
                        break block13;
                    }
                    do {
                        if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(j2, v2, h2)) continue;
                        return;
                    } while (((AtomicReferenceFieldUpdater)object2).get(j2) == v2);
                    continue;
                }
                object = p.a((p)object, h2, null, 29);
                do {
                    if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(j2, v2, object)) continue;
                    return;
                } while (((AtomicReferenceFieldUpdater)object2).get(j2) == v2);
                continue;
            }
            object = new p(v2, h2, null, null, 28);
            do {
                if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(j2, v2, object)) continue;
                return;
            } while (((AtomicReferenceFieldUpdater)object2).get(j2) == v2);
        }
    }

    public static M f(c0 object, boolean bl, h0 object2, int n2) {
        boolean bl2 = false;
        if ((n2 & 1) != 0) {
            bl = false;
        }
        if ((n2 & 2) != 0) {
            bl2 = true;
        }
        if (object instanceof m0) {
            object = ((m0)object).v(bl, bl2, (Z)object2);
        } else {
            object2 = new g0((h0)object2);
            object = (m0)object;
            object.getClass();
            object = ((m0)object).v(bl, bl2, new Y((g0)object2));
        }
        return object;
    }

    public static final boolean g(int n2) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n2 != 1) {
            bl2 = n2 == 2 ? bl : false;
        }
        return bl2;
    }

    public static final com.github.catvod.spider.merge.xc.e0.i h(B object, com.github.catvod.spider.merge.xc.e0.i object2) {
        object = object.d();
        Object object3 = Boolean.FALSE;
        Object object4 = t.c;
        boolean bl = (Boolean)object.c(object3, (com.github.catvod.spider.merge.by.p)object4);
        boolean bl2 = (Boolean)object2.c(object3, (com.github.catvod.spider.merge.by.p)object4);
        if (!bl && !bl2) {
            object = object.f((com.github.catvod.spider.merge.xc.e0.i)object2);
        } else {
            object4 = new l();
            ((l)object4).a = object2;
            object2 = com.github.catvod.spider.merge.xc.e0.j.a;
            object = (com.github.catvod.spider.merge.xc.e0.i)object.c(object2, new t((l)object4));
            if (bl2) {
                ((l)object4).a = ((com.github.catvod.spider.merge.xc.e0.i)((l)object4).a).c(object2, t.b);
            }
            object = object.f((com.github.catvod.spider.merge.xc.e0.i)((l)object4).a);
        }
        object2 = D.a ? object.f(new z(D.c.incrementAndGet())) : object;
        object3 = L.a;
        object4 = object2;
        if (object != object3) {
            object4 = object2;
            if (object.b(com.github.catvod.spider.merge.xc.e0.e.a) == null) {
                object4 = object2.f((com.github.catvod.spider.merge.xc.e0.i)object3);
            }
        }
        return object4;
    }

    public static final void i(K object, com.github.catvod.spider.merge.xc.e0.d object2, boolean bl) {
        Object object3 = ((K)object).f();
        Object object4 = ((K)object).c(object3);
        object = object4 != null ? com.github.catvod.spider.merge.xc.a.a.h((Throwable)object4) : ((K)object).d(object3);
        if (bl) {
            com.github.catvod.spider.merge.mI.i.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            object4 = (com.github.catvod.spider.merge.xc.t0.i)object2;
            object3 = ((com.github.catvod.spider.merge.xc.t0.i)object4).e;
            object2 = object3.getContext();
            object4 = com.github.catvod.spider.merge.xc.t0.a.k((com.github.catvod.spider.merge.xc.e0.i)object2, ((com.github.catvod.spider.merge.xc.t0.i)object4).g);
            if (object4 != com.github.catvod.spider.merge.xc.t0.a.e) {
                E.l((com.github.catvod.spider.merge.xc.e0.d)object3, (com.github.catvod.spider.merge.xc.e0.i)object2);
            }
            try {
                object3.resumeWith(object);
            }
            finally {
                com.github.catvod.spider.merge.xc.t0.a.f((com.github.catvod.spider.merge.xc.e0.i)object2, object4);
            }
        } else {
            object2.resumeWith(object);
        }
    }

    public static final String j(com.github.catvod.spider.merge.xc.e0.d object) {
        if (object instanceof com.github.catvod.spider.merge.xc.t0.i) {
            object = object.toString();
        } else {
            Object object2;
            try {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append('@');
                ((StringBuilder)object2).append(E.c(object));
                object2 = ((StringBuilder)object2).toString();
            }
            catch (Throwable throwable) {
                object2 = com.github.catvod.spider.merge.xc.a.a.h(throwable);
            }
            if (com.github.catvod.spider.merge.xc.c0.d.a(object2) != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object.getClass().getName());
                ((StringBuilder)object2).append('@');
                ((StringBuilder)object2).append(E.c(object));
                object2 = ((StringBuilder)object2).toString();
            }
            object = (String)object2;
        }
        return object;
    }

    public static final Object k(Object object) {
        Object object2;
        block0: {
            X x2 = object instanceof X ? (X)object : null;
            object2 = object;
            if (x2 == null || (object2 = x2.a) != null) break block0;
            object2 = object;
        }
        return object2;
    }

    public static final void l(com.github.catvod.spider.merge.xc.e0.d object, com.github.catvod.spider.merge.xc.e0.i object2) {
        if (!(object instanceof com.github.catvod.spider.merge.xc.g0.d)) {
            return;
        }
        if (object2.b(t0.a) != null) {
            object = (com.github.catvod.spider.merge.xc.g0.d)object;
            do {
                object = object2 = object.getCallerFrame();
            } while (object2 != null);
        }
    }
}

