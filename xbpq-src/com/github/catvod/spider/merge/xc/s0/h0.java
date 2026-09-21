/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.n0;
import com.github.catvod.spider.merge.xc.t0.q;
import com.github.catvod.spider.merge.xc.t0.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class h0
extends q
implements Z,
M,
W {
    public m0 d;

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void b() {
        block9: {
            Object object;
            Object object2;
            Object object3;
            Object object4 = this.k();
            block0: while ((object3 = ((m0)object4).s()) instanceof h0) {
                if (object3 == this) {
                    object2 = E.i;
                    while (!((AtomicReferenceFieldUpdater)(object = m0.a)).compareAndSet(object4, object3, object2)) {
                        if (((AtomicReferenceFieldUpdater)object).get(object4) == object3) continue;
                        continue block0;
                    }
                }
                break block9;
            }
            if (object3 instanceof W && ((W)object3).e() != null) {
                block2: while (true) {
                    if ((object = this.h()) instanceof y) {
                        object4 = ((y)object).a;
                        break;
                    }
                    if (object == this) {
                        object4 = (q)object;
                        break;
                    }
                    i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    object3 = (q)object;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q.c;
                    object4 = object2 = (y)atomicReferenceFieldUpdater.get(object3);
                    if (object2 == null) {
                        object4 = new y((q)object3);
                        atomicReferenceFieldUpdater.set(object3, object4);
                    }
                    do {
                        if (!((AtomicReferenceFieldUpdater)(object2 = q.a)).compareAndSet(this, object, object4)) continue;
                        ((q)object3).f();
                        break block2;
                    } while (((AtomicReferenceFieldUpdater)object2).get(this) == object);
                }
            }
        }
    }

    @Override
    public final n0 e() {
        return null;
    }

    public final m0 k() {
        m0 m02 = this.d;
        if (m02 != null) {
            return m02;
        }
        i.g("job");
        throw null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        stringBuilder.append("[job@");
        stringBuilder.append(E.c(this.k()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

