package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("0B31322504390F3525243B3F030420223C"));
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("17222E3522390222083F333F1F"));
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("043F2F2222370222083F333F1F"));
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, cYh.d("053C2E323C3309371530243114192F13223C013533"));
    private final AtomicReferenceArray<i> a = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    private final i b(i iVar) {
        if (iVar.d.a() == 1) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, iVar);
        c.incrementAndGet(this);
        return null;
    }

    private final i f() {
        i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.d.a() == 1) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    private final long i(n nVar, boolean z) {
        i iVar;
        boolean z2;
        do {
            iVar = (i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            z2 = true;
            if (z) {
                if (!(iVar.d.a() == 1)) {
                    return -2L;
                }
            }
            l.e.getClass();
            long nanoTime = System.nanoTime() - iVar.c;
            long j = l.a;
            if (nanoTime >= j) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(nVar, iVar, null)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(nVar) != iVar) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                return j - nanoTime;
            }
        } while (!z2);
        a(iVar, false);
        return -1L;
    }

    public final i a(i iVar, boolean z) {
        if (z) {
            return b(iVar);
        }
        i iVar2 = (i) b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return b(iVar2);
        }
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final void d(e eVar) {
        boolean z;
        i iVar = (i) b.getAndSet(this, null);
        if (iVar != null) {
            eVar.a(iVar);
        }
        do {
            i f = f();
            if (f != null) {
                eVar.a(f);
                z = true;
            } else {
                z = false;
            }
        } while (z);
    }

    public final i e() {
        i iVar = (i) b.getAndSet(this, null);
        return iVar != null ? iVar : f();
    }

    public final long g(n nVar) {
        int i = nVar.consumerIndex;
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = nVar.a;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if ((iVar.d.a() == 1) && atomicReferenceArray.compareAndSet(i3, iVar, null)) {
                    e.decrementAndGet(nVar);
                    a(iVar, false);
                    return -1L;
                }
            }
            i++;
        }
        return i(nVar, true);
    }

    public final long h(n nVar) {
        i f = nVar.f();
        if (f != null) {
            a(f, false);
            return -1L;
        }
        return i(nVar, false);
    }
}
