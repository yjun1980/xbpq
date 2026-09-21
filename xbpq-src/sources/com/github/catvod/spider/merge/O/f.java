package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class f extends s implements j, Executor {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(f.class, cYh.d("0E3E073D3E3D0F241530243114"));
    private final d e;
    private final int f;
    private final String g = cYh.d("23393221362E0438242324742E1F");
    private final int h = 1;
    private final ConcurrentLinkedQueue<Runnable> d = new ConcurrentLinkedQueue<>();
    private volatile int inFlightTasks = 0;

    public f(d dVar, int i2) {
        this.e = dVar;
        this.f = i2;
    }

    private final void c(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f) {
                this.e.c(runnable, this, z);
                return;
            }
            this.d.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f) {
                return;
            } else {
                runnable = this.d.poll();
            }
        } while (runnable != null);
    }

    @Override // com.github.catvod.spider.merge.O.j
    public final int a() {
        return this.h;
    }

    @Override // com.github.catvod.spider.merge.O.j
    public final void b() {
        Runnable poll = this.d.poll();
        if (poll != null) {
            this.e.c(poll, this, true);
            return;
        }
        i.decrementAndGet(this);
        Runnable poll2 = this.d.poll();
        if (poll2 != null) {
            c(poll2, true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException(cYh.d("243C2E22327A04312F3F382E473224713E34113F2A34337A083E611D3E370E24283F30180B3F223A3E3400142822273B1333293425").toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, false);
    }

    @Override // com.github.catvod.spider.merge.L.e
    public final String toString() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        return super.toString() + cYh.d("3C342822273B13332934257A5A70") + this.e + ']';
    }
}
