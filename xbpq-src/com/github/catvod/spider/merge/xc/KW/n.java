/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.i;
import com.github.catvod.spider.merge.xc.s0.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a(i i2) {
        AtomicReferenceArray atomicReferenceArray;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return i2;
        }
        if (i2.b.a == 1) {
            e.incrementAndGet(this);
        }
        int n2 = atomicIntegerFieldUpdater.get(this) & 0x7F;
        while ((atomicReferenceArray = this.a).get(n2) != null) {
            Thread.yield();
        }
        atomicReferenceArray.lazySet(n2, i2);
        atomicIntegerFieldUpdater.incrementAndGet(this);
        return null;
    }

    public final i b() {
        int n2;
        Object object;
        do {
            if ((n2 = ((AtomicIntegerFieldUpdater)(object = d)).get(this)) - c.get(this) != 0) continue;
            return null;
        } while (!((AtomicIntegerFieldUpdater)object).compareAndSet(this, n2, n2 + 1) || (object = (i)this.a.getAndSet(n2 & 0x7F, null)) == null);
        if (((i)object).b.a == 1) {
            e.decrementAndGet(this);
            boolean bl = D.a;
        }
        return object;
    }

    public final i c(int n2, boolean bl) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        int n3 = n2 & 0x7F;
        i i2 = (i)atomicReferenceArray.get(n3);
        if (i2 != null) {
            n2 = i2.b.a;
            boolean bl2 = true;
            if (n2 != 1) {
                bl2 = false;
            }
            if (bl2 == bl) {
                do {
                    if (!atomicReferenceArray.compareAndSet(n3, i2, null)) continue;
                    if (bl) {
                        e.decrementAndGet(this);
                    }
                    return i2;
                } while (atomicReferenceArray.get(n3) == i2);
            }
        }
        return null;
    }
}

