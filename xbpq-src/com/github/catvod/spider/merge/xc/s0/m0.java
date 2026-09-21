/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.C0.a;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.O;
import com.github.catvod.spider.merge.xc.s0.V;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.X;
import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.a0;
import com.github.catvod.spider.merge.xc.s0.b0;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.d0;
import com.github.catvod.spider.merge.xc.s0.e0;
import com.github.catvod.spider.merge.xc.s0.f;
import com.github.catvod.spider.merge.xc.s0.f0;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.s0.j0;
import com.github.catvod.spider.merge.xc.s0.k0;
import com.github.catvod.spider.merge.xc.s0.l0;
import com.github.catvod.spider.merge.xc.s0.m;
import com.github.catvod.spider.merge.xc.s0.n;
import com.github.catvod.spider.merge.xc.s0.n0;
import com.github.catvod.spider.merge.xc.s0.o;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.q0;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.t0.A;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class m0
implements c0,
o,
q0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public m0(boolean bl) {
        O o2 = bl ? E.i : E.h;
        this._state$volatile = o2;
    }

    public static String D(Object object) {
        boolean bl = object instanceof k0;
        String string = "Active";
        if (bl) {
            k0 k02 = (k0)object;
            if (k02.d()) {
                object = "Cancelling";
            } else {
                object = string;
                if (k02.f()) {
                    object = "Completing";
                }
            }
        } else {
            object = object instanceof W ? (((W)object).a() ? string : "New") : (object instanceof q ? "Cancelled" : "Completed");
        }
        return object;
    }

    public static void h(Throwable throwable, ArrayList serializable2) {
        if (serializable2.size() <= 1) {
            return;
        }
        Set set = Collections.newSetFromMap(new IdentityHashMap(serializable2.size()));
        Throwable throwable2 = !D.b ? throwable : A.b(throwable);
        for (Serializable serializable2 : serializable2) {
            if (D.b) {
                serializable2 = A.b((Throwable)serializable2);
            }
            if (serializable2 == throwable || serializable2 == throwable2 || serializable2 instanceof CancellationException || !set.add(serializable2)) continue;
            com.github.catvod.spider.merge.xc.D0.b.c(throwable, (Throwable)serializable2);
        }
    }

    public static n x(com.github.catvod.spider.merge.xc.t0.q q2) {
        Object object;
        block0: while (true) {
            object = q2;
            if (!q2.j()) break;
            object = q2.f();
            if (object == null) {
                object = com.github.catvod.spider.merge.xc.t0.q.b;
                q2 = (com.github.catvod.spider.merge.xc.t0.q)((AtomicReferenceFieldUpdater)object).get(q2);
                while (true) {
                    if (!q2.j()) continue block0;
                    q2 = (com.github.catvod.spider.merge.xc.t0.q)((AtomicReferenceFieldUpdater)object).get(q2);
                }
            }
            q2 = object;
        }
        while (true) {
            q2 = ((com.github.catvod.spider.merge.xc.t0.q)object).i();
            object = q2;
            if (q2.j()) continue;
            if (q2 instanceof n) {
                return (n)q2;
            }
            object = q2;
            if (q2 instanceof n0) break;
        }
        return null;
    }

    public void A() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void B(h0 h02) {
        Object object = new n0();
        h02.getClass();
        com.github.catvod.spider.merge.xc.t0.q.b.set(object, h02);
        Object object2 = com.github.catvod.spider.merge.xc.t0.q.a;
        ((AtomicReferenceFieldUpdater)object2).set(object, h02);
        block0: while (true) {
            if (h02.h() != h02) break;
            do {
                if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(h02, h02, object)) continue;
                ((com.github.catvod.spider.merge.xc.t0.q)object).g(h02);
                break block0;
            } while (((AtomicReferenceFieldUpdater)object2).get(h02) == h02);
        }
        object2 = h02.i();
        do {
            if (!((AtomicReferenceFieldUpdater)(object = a)).compareAndSet(this, h02, object2)) continue;
            return;
        } while (((AtomicReferenceFieldUpdater)object).get(this) == h02);
    }

    public final int C(Object object) {
        boolean bl = object instanceof O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (bl) {
            if (((O)object).a) {
                return 0;
            }
            O o2 = E.i;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, object, o2)) continue;
                return 1;
            } while (atomicReferenceFieldUpdater.get(this) == object);
            return -1;
        }
        if (object instanceof V) {
            n0 n02 = ((V)object).a;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, object, n02)) continue;
                return 1;
            } while (atomicReferenceFieldUpdater.get(this) == object);
            return -1;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object E(Object object, Object object2) {
        Object object3;
        h0 h02;
        boolean bl;
        n0 n02;
        W w2;
        block20: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            W w3;
            if (!(object instanceof W)) {
                return E.c;
            }
            if ((object instanceof O || object instanceof h0) && !(object instanceof n) && !(object2 instanceof q)) {
                w3 = (W)object;
                boolean bl2 = D.a;
                object = object2 instanceof W ? new X((W)object2) : object2;
            } else {
                w2 = (W)object;
                n02 = this.r(w2);
                if (n02 == null) {
                    return E.e;
                }
                bl = w2 instanceof k0;
                h02 = null;
                object = bl ? (k0)w2 : null;
                object3 = object;
                if (object == null) {
                    object3 = new k0(n02, null);
                }
                // MONITORENTER : object3
                if (((k0)object3).f()) {
                    object = E.c;
                    // MONITOREXIT : object3
                    return object;
                }
                k0.b.set(object3, 1);
                if (object3 != w2) {
                    object = a;
                }
                break block20;
            }
            do {
                if (!(atomicReferenceFieldUpdater = a).compareAndSet(this, w3, object)) continue;
                this.z(object2);
                this.m(w3, object2);
                return object2;
            } while (atomicReferenceFieldUpdater.get(this) == w3);
            return E.e;
            while (!((AtomicReferenceFieldUpdater)object).compareAndSet(this, w2, object3)) {
                if (((AtomicReferenceFieldUpdater)object).get(this) == w2) continue;
                object = E.e;
                // MONITOREXIT : object3
                return object;
            }
        }
        bl = D.a;
        bl = ((k0)object3).d();
        object = object2 instanceof q ? (q)object2 : null;
        if (object != null) {
            ((k0)object3).b(((q)object).a);
        }
        object = ((k0)object3).c();
        if (!(bl ^ true)) {
            object = null;
        }
        // MONITOREXIT : object3
        if (object != null) {
            this.y(n02, (Throwable)object);
        }
        if ((object = w2 instanceof n ? (n)w2 : null) == null) {
            w2 = w2.e();
            object = h02;
            if (w2 != null) {
                object = m0.x((com.github.catvod.spider.merge.xc.t0.q)((Object)w2));
            }
        }
        if (object == null) return this.o((k0)object3, object2);
        do {
            if (E.f(((n)object).e, false, h02 = new j0(this, (k0)object3, (n)object, object2), 1) != o0.a) {
                return E.d;
            }
            h02 = m0.x((com.github.catvod.spider.merge.xc.t0.q)object);
            object = h02;
        } while (h02 != null);
        return this.o((k0)object3, object2);
    }

    @Override
    public boolean a() {
        Object object = this.s();
        boolean bl = object instanceof W && ((W)object).a();
        return bl;
    }

    @Override
    public final g b(h h2) {
        return com.github.catvod.spider.merge.xc.D0.b.m(this, h2);
    }

    @Override
    public final Object c(Object object, p p2) {
        return p2.invoke(object, this);
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i e(h h2) {
        return com.github.catvod.spider.merge.xc.D0.b.w(this, h2);
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i f(com.github.catvod.spider.merge.xc.e0.i i2) {
        return com.github.catvod.spider.merge.xc.D0.b.F(this, i2);
    }

    public final boolean g(W object, n0 n02, h0 h02) {
        boolean bl;
        block6: {
            l0 l02 = new l0(h02, this, (W)object);
            while (true) {
                int n2;
                block5: {
                    Object object2;
                    object = object2 = n02.f();
                    if (object2 == null) {
                        object2 = com.github.catvod.spider.merge.xc.t0.q.b;
                        object = (com.github.catvod.spider.merge.xc.t0.q)((AtomicReferenceFieldUpdater)object2).get(n02);
                        while (((com.github.catvod.spider.merge.xc.t0.q)object).j()) {
                            object = (com.github.catvod.spider.merge.xc.t0.q)((AtomicReferenceFieldUpdater)object2).get(object);
                        }
                    }
                    com.github.catvod.spider.merge.xc.t0.q.b.set(h02, object);
                    object2 = com.github.catvod.spider.merge.xc.t0.q.a;
                    ((AtomicReferenceFieldUpdater)object2).set(h02, n02);
                    l02.c = n02;
                    do {
                        boolean bl2 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(object, n02, l02);
                        bl = false;
                        if (!bl2) continue;
                        n2 = l02.a(object) == null ? 1 : 2;
                        break block5;
                    } while (((AtomicReferenceFieldUpdater)object2).get(object) == n02);
                    n2 = 0;
                }
                if (n2 == 1) break;
                if (n2 != 2) {
                    continue;
                }
                break block6;
                break;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public final h getKey() {
        return x.b;
    }

    public void i() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(Object var1_1) {
        var4_3 = E.c;
        var3_4 = this instanceof f0;
        var2_5 = false;
        if (var3_4) {
            block17: {
                while (!(!((var4_3 = this.s()) instanceof W) || var4_3 instanceof k0 && ((k0)var4_3).f())) {
                    var5_6 = this.E(var4_3, new q(this.n(var1_1), false));
                    if (var5_6 == E.e) continue;
                    break block17;
                }
                var5_6 = E.c;
            }
            var4_3 = var5_6;
            if (var5_6 == E.d) {
                return true;
            }
        }
        var5_6 = var4_3;
        if (var4_3 != E.c) ** GOTO lbl75
        var6_7 = null;
        var4_3 = null;
        while (true) {
            block24: {
                block18: {
                    block22: {
                        block23: {
                            block21: {
                                if (!((var8_9 = this.s()) instanceof k0)) break block21;
                                synchronized (var8_9) {
                                    block19: {
                                        try {
                                            var5_6 = (k0)var8_9;
                                            var5_6.getClass();
                                            if (k0.d.get(var5_6) == E.g) {
                                                var1_1 = E.f;
                                                break block18;
                                            }
                                            var3_4 = ((k0)var8_9).d();
                                            var5_6 = var4_3;
                                            if (var4_3 != null) break block19;
                                            var5_6 = this.n(var1_1);
                                        }
                                        catch (Throwable var1_2) {
                                            ** break block20
                                        }
                                    }
                                    ((k0)var8_9).b((Throwable)var5_6);
                                    var4_3 = ((k0)var8_9).c();
                                    var1_1 = var6_7;
                                    if (var3_4 ^ true) {
                                        var1_1 = var4_3;
                                    }
                                    ** if (var1_1 == null) goto lbl43
                                }
lbl-1000:
                                // 1 sources

                                {
                                    this.y(((k0)var8_9).a, (Throwable)var1_1);
                                }
lbl43:
                                // 2 sources

                                var1_1 = E.c;
                                break block18;
lbl-1000:
                                // 1 sources

                                {
                                    throw var1_2;
                                }
                            }
                            if (!(var8_9 instanceof W)) break block22;
                            var5_6 = var4_3;
                            if (var4_3 == null) {
                                var5_6 = this.n(var1_1);
                            }
                            if (!(var4_3 = (W)var8_9).a()) break block23;
                            var3_4 = D.a;
                            var9_10 = this.r((W)var4_3);
                            if (var9_10 == null) {
                                var4_3 = var5_6;
                                continue;
                            }
                            break block24;
                        }
                        var7_8 = this.E(var8_9, new q((Throwable)var5_6, false));
                        if (var7_8 == E.c) {
                            var1_1 = new StringBuilder("Cannot happen in ");
                            var1_1.append(var8_9);
                            throw new IllegalStateException(var1_1.toString().toString());
                        }
                        var4_3 = var5_6;
                        if (var7_8 == E.e) continue;
                        var5_6 = var7_8;
                        ** GOTO lbl75
                    }
                    var1_1 = E.f;
                }
lbl73:
                // 2 sources

                while (true) {
                    var5_6 = var1_1;
lbl75:
                    // 3 sources

                    if (var5_6 == E.c) return true;
                    if (var5_6 != E.d) {
                        if (var5_6 == E.f) {
                            return var2_5;
                        }
                        this.i();
                    }
                    return true;
                }
            }
            var8_9 = new k0(var9_10, (Throwable)var5_6);
            do {
                if (!(var7_8 = m0.a).compareAndSet(this, var4_3, var8_9)) continue;
                this.y(var9_10, (Throwable)var5_6);
                var1_1 = E.c;
                ** continue;
            } while (var7_8.get(this) == var4_3);
            var4_3 = var5_6;
        }
    }

    public final boolean k(Throwable throwable) {
        boolean bl = this instanceof f;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        boolean bl3 = throwable instanceof CancellationException;
        m m2 = (m)b.get(this);
        if (m2 != null && m2 != o0.a) {
            bl = bl2;
            if (!m2.c(throwable)) {
                bl = bl3 ? bl2 : false;
            }
            return bl;
        }
        return bl3;
    }

    public String l() {
        return "Job was cancelled";
    }

    public final void m(W object, Object object2) {
        Object object3 = b;
        Object object4 = (m)((AtomicReferenceFieldUpdater)object3).get(this);
        if (object4 != null) {
            object4.b();
            ((AtomicReferenceFieldUpdater)object3).set(this, o0.a);
        }
        boolean bl = object2 instanceof q;
        object3 = null;
        object2 = bl ? (q)object2 : null;
        object2 = object2 != null ? ((q)object2).a : null;
        if (object instanceof h0) {
            try {
                ((h0)object).d((Throwable)object2);
            }
            catch (Throwable throwable) {
                object3 = new StringBuilder("Exception in completion handler ");
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(" for ");
                ((StringBuilder)object3).append(this);
                this.t(new a(((StringBuilder)object3).toString(), throwable));
            }
        } else {
            n0 n02 = object.e();
            if (n02 != null) {
                object = n02.h();
                i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                object = (com.github.catvod.spider.merge.xc.t0.q)object;
                while (!object.equals(n02)) {
                    object4 = object3;
                    if (object instanceof h0) {
                        h0 h02 = (h0)object;
                        try {
                            h02.d((Throwable)object2);
                            object4 = object3;
                        }
                        catch (Throwable throwable) {
                            if (object3 != null) {
                                com.github.catvod.spider.merge.xc.D0.b.c((Throwable)object3, throwable);
                                object4 = object3;
                            }
                            object3 = new StringBuilder("Exception in completion handler ");
                            ((StringBuilder)object3).append(h02);
                            ((StringBuilder)object3).append(" for ");
                            ((StringBuilder)object3).append(this);
                            object4 = new a(((StringBuilder)object3).toString(), throwable);
                        }
                    }
                    object = ((com.github.catvod.spider.merge.xc.t0.q)object).i();
                    object3 = object4;
                }
                if (object3 != null) {
                    this.t((a)object3);
                }
            }
        }
    }

    public final Throwable n(Object object) {
        Object object2;
        block10: {
            Throwable throwable;
            block6: {
                CancellationException cancellationException;
                m0 m02;
                block8: {
                    block9: {
                        block7: {
                            block5: {
                                if (!(object instanceof Throwable)) break block5;
                                throwable = (Throwable)object;
                                break block6;
                            }
                            m02 = (m0)((q0)object);
                            object2 = m02.s();
                            boolean bl = object2 instanceof k0;
                            cancellationException = null;
                            if (!bl) break block7;
                            object = ((k0)object2).c();
                            break block8;
                        }
                        if (!(object2 instanceof q)) break block9;
                        object = ((q)object2).a;
                        break block8;
                    }
                    if (object2 instanceof W) break block10;
                    object = null;
                }
                if (object instanceof CancellationException) {
                    cancellationException = (CancellationException)object;
                }
                throwable = cancellationException;
                if (cancellationException == null) {
                    throwable = new d0("Parent job is ".concat(m0.D(object2)), (Throwable)object, m02);
                }
            }
            return throwable;
        }
        object = new StringBuilder("Cannot be cancelling child in this state: ");
        ((StringBuilder)object).append(object2);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object o(k0 k02, Object object) {
        Object object2;
        Object object3;
        boolean bl;
        block12: {
            block11: {
                bl = D.a;
                bl = object instanceof q;
                Iterator iterator = null;
                Object var6_6 = null;
                object3 = bl ? (q)object : null;
                object2 = object3 != null ? ((q)object3).a : null;
                synchronized (k02) {
                    k02.d();
                    ArrayList arrayList = k02.g((Throwable)object2);
                    if (arrayList.isEmpty()) {
                        object3 = iterator;
                        if (k02.d()) {
                            object3 = new d0(this.l(), null, this);
                        }
                    } else {
                        iterator = arrayList.iterator();
                        do {
                            object3 = var6_6;
                        } while (iterator.hasNext() && !((Throwable)(object3 = iterator.next()) instanceof CancellationException ^ true));
                        if ((object3 = (Throwable)object3) == null) {
                            object3 = (Throwable)arrayList.get(0);
                        }
                    }
                    if (object3 != null) {
                        m0.h((Throwable)object3, arrayList);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 1] lbl26 : MonitorExitStatement: MONITOREXIT : var1_1
                    if (object3 != null && object3 != object2) {
                        object = new q((Throwable)object3, false);
                    }
                    if (object3 != null && this.k((Throwable)object3)) break block11;
                    break block12;
                }
            }
            i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            object3 = (q)object;
            q.b.compareAndSet(object3, 0, 1);
        }
        this.z(object);
        object2 = a;
        object3 = object instanceof W ? new X((W)object) : object;
        while (!((AtomicReferenceFieldUpdater)object2).compareAndSet(this, k02, object3) && ((AtomicReferenceFieldUpdater)object2).get(this) == k02) {
        }
        bl = D.a;
        this.m(k02, object);
        return object;
    }

    public final CancellationException p() {
        Object object;
        block13: {
            block12: {
                Serializable serializable;
                Object object2;
                block10: {
                    block11: {
                        object2 = this.s();
                        boolean bl = object2 instanceof k0;
                        object = null;
                        serializable = null;
                        if (!bl) break block10;
                        Throwable throwable = ((k0)object2).c();
                        if (throwable == null) break block11;
                        object2 = this.getClass().getSimpleName().concat(" is cancelling");
                        if (throwable instanceof CancellationException) {
                            serializable = (CancellationException)throwable;
                        }
                        object = serializable;
                        if (serializable == null) {
                            object = object2;
                            if (object2 == null) {
                                object = this.l();
                            }
                            object = new d0((String)object, throwable, this);
                        }
                        break block12;
                    }
                    object = new StringBuilder("Job is still new or active: ");
                    ((StringBuilder)object).append(this);
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
                if (object2 instanceof W) break block13;
                if (object2 instanceof q) {
                    object2 = ((q)object2).a;
                    serializable = object;
                    if (object2 instanceof CancellationException) {
                        serializable = (CancellationException)object2;
                    }
                    object = serializable;
                    if (serializable == null) {
                        object = new d0(this.l(), (Throwable)object2, this);
                    }
                } else {
                    object = new d0(this.getClass().getSimpleName().concat(" has completed normally"), null, this);
                }
            }
            return object;
        }
        object = new StringBuilder("Job is still new or active: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public boolean q() {
        return true;
    }

    public final n0 r(W w2) {
        n0 n02 = w2.e();
        Object object = n02;
        if (n02 == null) {
            if (w2 instanceof O) {
                object = new n0();
            } else if (w2 instanceof h0) {
                this.B((h0)w2);
                object = null;
            } else {
                object = new StringBuilder("State should have list: ");
                ((StringBuilder)object).append(w2);
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
        }
        return object;
    }

    public final Object s() {
        Object v2;
        while ((v2 = a.get(this)) instanceof com.github.catvod.spider.merge.xc.t0.x) {
            ((com.github.catvod.spider.merge.xc.t0.x)v2).a(this);
        }
        return v2;
    }

    public void t(a a2) {
        throw a2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.w());
        stringBuilder2.append('{');
        stringBuilder2.append(m0.D(this.s()));
        stringBuilder2.append('}');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        return stringBuilder.toString();
    }

    public final void u(c0 object) {
        int n2;
        boolean bl = D.a;
        o0 o02 = o0.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (object == null) {
            atomicReferenceFieldUpdater.set(this, o02);
            return;
        }
        object = (m0)object;
        while ((n2 = ((m0)object).C(((m0)object).s())) != 0 && n2 != 1) {
        }
        object = (m)E.f((c0)object, true, new n(this), 2);
        atomicReferenceFieldUpdater.set(this, object);
        if (this.s() instanceof W ^ true) {
            object.b();
            atomicReferenceFieldUpdater.set(this, o02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final M v(boolean bl, boolean bl2, Z z2) {
        boolean bl3;
        Object object;
        Object object2;
        Object var8_5 = null;
        if (bl) {
            object2 = z2 instanceof e0 ? (e0)z2 : null;
            object = object2;
            if (object2 == null) {
                object = new a0(z2);
            }
        } else {
            object = z2 instanceof h0 ? (h0)z2 : null;
            if (object != null) {
                bl3 = D.a;
            } else {
                object = new b0(0, z2);
            }
        }
        ((h0)object).d = this;
        while (true) {
            Object object3;
            Object object4;
            block23: {
                Object object5;
                block22: {
                    block21: {
                        if (!((object5 = this.s()) instanceof O)) break block21;
                        object4 = (O)object5;
                        if (((O)object4).a) break block22;
                        object2 = new n0();
                        if (((O)object4).a) break block23;
                        object2 = new V((n0)object2);
                        break block23;
                    }
                    if (object5 instanceof W) {
                        n0 n02 = ((W)object5).e();
                        if (n02 == null) {
                            i.c(object5, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                            this.B((h0)object5);
                            continue;
                        }
                        object4 = o0.a;
                        if (bl && object5 instanceof k0) {
                            block20: {
                                block19: {
                                    // MONITORENTER : object5
                                    object3 = ((k0)object5).c();
                                    if (object3 == null) break block19;
                                    object2 = object4;
                                    if (!(z2 instanceof n)) break block20;
                                    object2 = object4;
                                    if (((k0)object5).f()) break block20;
                                }
                                if (!(bl3 = this.g((W)object5, n02, (h0)object))) {
                                    // MONITOREXIT : object5
                                    continue;
                                }
                                if (object3 == null) {
                                    // MONITOREXIT : object5
                                    return object;
                                }
                                object2 = object;
                            }
                            // MONITOREXIT : object5
                            object4 = object2;
                            object2 = object3;
                        } else {
                            object2 = null;
                        }
                        if (object2 != null) {
                            if (!bl2) return object4;
                            z2.d((Throwable)object2);
                            return object4;
                        }
                        if (!this.g((W)object5, n02, (h0)object)) continue;
                        return object;
                    }
                    if (!bl2) return o0.a;
                    object = object5 instanceof q ? (q)object5 : null;
                    object2 = var8_5;
                    if (object != null) {
                        object2 = ((q)object).a;
                    }
                    z2.d((Throwable)object2);
                    return o0.a;
                }
                object2 = a;
                do {
                    if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(this, object5, object)) continue;
                    return object;
                } while (((AtomicReferenceFieldUpdater)object2).get(this) == object5);
                continue;
            }
            while (!((AtomicReferenceFieldUpdater)(object3 = a)).compareAndSet(this, object4, object2) && ((AtomicReferenceFieldUpdater)object3).get(this) == object4) {
            }
        }
    }

    public String w() {
        return this.getClass().getSimpleName();
    }

    public final void y(n0 n02, Throwable throwable) {
        Object object = n02.h();
        i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (com.github.catvod.spider.merge.xc.t0.q)object;
        StringBuilder stringBuilder = null;
        while (!object.equals(n02)) {
            Serializable serializable = stringBuilder;
            if (object instanceof e0) {
                h0 h02 = (h0)object;
                try {
                    h02.d(throwable);
                    serializable = stringBuilder;
                }
                catch (Throwable throwable2) {
                    if (stringBuilder != null) {
                        com.github.catvod.spider.merge.xc.D0.b.c(stringBuilder, throwable2);
                        serializable = stringBuilder;
                    }
                    stringBuilder = new StringBuilder("Exception in completion handler ");
                    stringBuilder.append(h02);
                    stringBuilder.append(" for ");
                    stringBuilder.append(this);
                    serializable = new a(stringBuilder.toString(), throwable2);
                }
            }
            object = ((com.github.catvod.spider.merge.xc.t0.q)object).i();
            stringBuilder = serializable;
        }
        if (stringBuilder != null) {
            this.t((a)((Object)stringBuilder));
        }
        this.k(throwable);
    }

    public void z(Object object) {
    }
}

