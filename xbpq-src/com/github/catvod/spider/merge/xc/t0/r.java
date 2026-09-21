/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.t0.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class r {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new t(8, false);

    public final boolean a(Object object) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t t2;
        int n2;
        while ((n2 = (t2 = (t)(atomicReferenceFieldUpdater = a).get(this)).a(object)) != 0) {
            if (n2 != 1) {
                if (n2 != 2) continue;
                return false;
            }
            t t3 = t2.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, t2, t3) && atomicReferenceFieldUpdater.get(this) == t2) {
            }
        }
        return true;
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t t2;
        while (!(t2 = (t)(atomicReferenceFieldUpdater = a).get(this)).b()) {
            t t3 = t2.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, t2, t3) && atomicReferenceFieldUpdater.get(this) == t2) {
            }
        }
        return;
    }

    public final int c() {
        t t2 = (t)a.get(this);
        t2.getClass();
        long l2 = t.f.get(t2);
        int n2 = (int)(0x3FFFFFFFL & l2);
        return 0x3FFFFFFF & (int)((l2 & 0xFFFFFFFC0000000L) >> 30) - n2;
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t t2;
        Object object;
        while ((object = (t2 = (t)(atomicReferenceFieldUpdater = a).get(this)).d()) == t.g) {
            object = t2.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, t2, object) && atomicReferenceFieldUpdater.get(this) == t2) {
            }
        }
        return object;
    }
}

