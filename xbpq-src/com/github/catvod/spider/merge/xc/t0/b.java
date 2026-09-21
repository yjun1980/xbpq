/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b
extends x {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = com.github.catvod.spider.merge.xc.t0.a.a;

    @Override
    public final Object a(Object object) {
        Object v2;
        block3: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object object2 = atomicReferenceFieldUpdater.get(this);
            A a2 = com.github.catvod.spider.merge.xc.t0.a.a;
            v2 = object2;
            if (object2 == a2) {
                object2 = this.c(object);
                boolean bl = D.a;
                v2 = atomicReferenceFieldUpdater.get(this);
                if (v2 == a2) {
                    do {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, a2, object2)) continue;
                        v2 = object2;
                        break block3;
                    } while (atomicReferenceFieldUpdater.get(this) == a2);
                    v2 = atomicReferenceFieldUpdater.get(this);
                }
            }
        }
        this.b(object, v2);
        return v2;
    }

    public abstract void b(Object var1, Object var2);

    public abstract A c(Object var1);
}

