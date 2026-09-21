/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.O.d;
import com.github.catvod.spider.merge.O.j;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class f
extends s
implements j,
Executor {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(f.class, cYh.d("0E3E073D3E3D0F241530243114"));
    private final ConcurrentLinkedQueue<Runnable> d;
    private final d e;
    private final int f;
    private final String g;
    private final int h;
    private volatile int inFlightTasks;

    public f(d d2, int n2) {
        this.e = d2;
        this.f = n2;
        this.g = cYh.d("23393221362E0438242324742E1F");
        this.h = 1;
        this.d = new ConcurrentLinkedQueue();
        this.inFlightTasks = 0;
    }

    private final void c(Runnable runnable, boolean bl) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            if ((atomicIntegerFieldUpdater = i).incrementAndGet(this) <= this.f) {
                this.e.c(runnable, this, bl);
                return;
            }
            this.d.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.f) continue;
            return;
        } while ((runnable = this.d.poll()) != null);
    }

    @Override
    public final int a() {
        return this.h;
    }

    @Override
    public final void b() {
        Runnable runnable = this.d.poll();
        if (runnable != null) {
            this.e.c(runnable, this, true);
            return;
        }
        i.decrementAndGet(this);
        runnable = this.d.poll();
        if (runnable != null) {
            this.c(runnable, true);
        }
    }

    @Override
    public final void close() {
        throw new IllegalStateException(cYh.d("243C2E22327A04312F3F382E473224713E34113F2A34337A083E611D3E370E24283F30180B3F223A3E3400142822273B1333293425").toString());
    }

    @Override
    public final void execute(Runnable runnable) {
        this.c(runnable, false);
    }

    @Override
    public final String toString() {
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(super.toString());
            ((StringBuilder)charSequence).append(cYh.d("3C342822273B13332934257A5A70"));
            ((StringBuilder)charSequence).append(this.e);
            ((StringBuilder)charSequence).append(']');
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

