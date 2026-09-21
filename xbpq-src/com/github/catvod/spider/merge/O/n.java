/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.O.e;
import com.github.catvod.spider.merge.O.i;
import com.github.catvod.spider.merge.O.l;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("0B31322504390F3525243B3F030420223C"));
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("17222E3522390222083F333F1F"));
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("043F2F2222370222083F333F1F"));
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("053C2E323C3309371530243114192F13223C013533"));
    private final AtomicReferenceArray<i> a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    private final i b(i i2) {
        int n2 = i2.d.a();
        int n3 = 1;
        if (n2 != 1) {
            n3 = 0;
        }
        if (n3 != 0) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return i2;
        }
        n3 = this.producerIndex & 0x7F;
        while (this.a.get(n3) != null) {
            Thread.yield();
        }
        this.a.lazySet(n3, i2);
        c.incrementAndGet(this);
        return null;
    }

    private final i f() {
        i i2;
        int n2;
        do {
            if ((n2 = this.consumerIndex) - this.producerIndex != 0) continue;
            return null;
        } while (!d.compareAndSet(this, n2, n2 + 1) || (i2 = (i)this.a.getAndSet(n2 & 0x7F, null)) == null);
        int n3 = i2.d.a();
        n2 = 1;
        if (n3 != 1) {
            n2 = 0;
        }
        if (n2 != 0) {
            e.decrementAndGet(this);
        }
        return i2;
    }

    private final long i(n n2, boolean bl) {
        i i2;
        while ((i2 = (i)n2.lastScheduledTask) != null) {
            boolean bl2;
            block4: {
                boolean bl3 = true;
                if (bl && !(bl2 = i2.d.a() == 1)) {
                    return -2L;
                }
                l.e.getClass();
                long l2 = System.nanoTime() - i2.c;
                long l3 = l.a;
                if (l2 < l3) {
                    return l3 - l2;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                do {
                    if (!atomicReferenceFieldUpdater.compareAndSet(n2, i2, null)) continue;
                    bl2 = bl3;
                    break block4;
                } while (atomicReferenceFieldUpdater.get(n2) == i2);
                bl2 = false;
            }
            if (!bl2) continue;
            this.a(i2, false);
            return -1L;
        }
        return -2L;
    }

    public final i a(i i2, boolean bl) {
        if (bl) {
            return this.b(i2);
        }
        if ((i2 = b.getAndSet(this, i2)) != null) {
            return this.b(i2);
        }
        return null;
    }

    public final int c() {
        int n2 = this.lastScheduledTask != null ? this.producerIndex - this.consumerIndex + 1 : this.producerIndex - this.consumerIndex;
        return n2;
    }

    public final void d(e e2) {
        boolean bl;
        i i2 = b.getAndSet(this, null);
        if (i2 != null) {
            e2.a(i2);
        }
        do {
            if ((i2 = this.f()) != null) {
                e2.a(i2);
                bl = true;
                continue;
            }
            bl = false;
        } while (bl);
    }

    public final i e() {
        i i2 = b.getAndSet(this, null);
        if (i2 == null) {
            i2 = this.f();
        }
        return i2;
    }

    public final long g(n n2) {
        int n3 = n2.consumerIndex;
        int n4 = n2.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = n2.a;
        while (true) {
            boolean bl = true;
            if (n3 == n4) break;
            int n5 = n3 & 0x7F;
            if (n2.blockingTasksInBuffer == 0) break;
            i i2 = atomicReferenceArray.get(n5);
            if (i2 != null) {
                if (i2.d.a() != 1) {
                    bl = false;
                }
                if (bl && atomicReferenceArray.compareAndSet(n5, i2, null)) {
                    e.decrementAndGet(n2);
                    this.a(i2, false);
                    return -1L;
                }
            }
            ++n3;
        }
        return this.i(n2, true);
    }

    public final long h(n n2) {
        i i2 = n2.f();
        if (i2 != null) {
            this.a(i2, false);
            return -1L;
        }
        return this.i(n2, false);
    }
}

