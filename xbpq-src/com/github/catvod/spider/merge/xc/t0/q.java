/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.t0.p;
import com.github.catvod.spider.merge.xc.t0.x;
import com.github.catvod.spider.merge.xc.t0.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class q {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final q f() {
        block0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            q q2 = (q)atomicReferenceFieldUpdater.get(this);
            Object object = q2;
            block1: while (true) {
                q q3 = null;
                while (true) {
                    Object object2;
                    Object object3;
                    if ((object3 = ((AtomicReferenceFieldUpdater)(object2 = a)).get(object)) == this) {
                        if (q2 == object) {
                            return object;
                        }
                        do {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, q2, object)) continue;
                            return object;
                        } while (atomicReferenceFieldUpdater.get(this) == q2);
                        continue block0;
                    }
                    if (this.j()) {
                        return null;
                    }
                    if (object3 == null) {
                        return object;
                    }
                    if (object3 instanceof x) {
                        ((x)object3).a(object);
                        continue block0;
                    }
                    if (object3 instanceof y) {
                        if (q3 != null) {
                            object3 = ((y)object3).a;
                            do {
                                if (!((AtomicReferenceFieldUpdater)object2).compareAndSet(q3, object, object3)) continue;
                                object = q3;
                                continue block1;
                            } while (((AtomicReferenceFieldUpdater)object2).get(q3) == object);
                            continue block0;
                        }
                        object = (q)atomicReferenceFieldUpdater.get(object);
                        continue;
                    }
                    i.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    object2 = (q)object3;
                    q3 = object;
                    object = object2;
                }
                break;
            }
            break;
        }
    }

    public final void g(q q2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            q q3 = (q)atomicReferenceFieldUpdater.get(q2);
            if (this.h() != q2) {
                return;
            }
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(q2, q3, this)) continue;
                if (this.j()) {
                    q2.f();
                }
                return;
            } while (atomicReferenceFieldUpdater.get(q2) == q3);
        }
    }

    public final Object h() {
        Object v2;
        while ((v2 = a.get(this)) instanceof x) {
            ((x)v2).a(this);
        }
        return v2;
    }

    public final q i() {
        Object object;
        block3: {
            Object object2;
            block2: {
                object2 = this.h();
                object = object2 instanceof y ? (y)object2 : null;
                if (object == null) break block2;
                q q2 = ((y)object).a;
                object = q2;
                if (q2 != null) break block3;
            }
            i.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            object = (q)object2;
        }
        return object;
    }

    public boolean j() {
        return this.h() instanceof y;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new p(this));
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        return stringBuilder.toString();
    }
}

