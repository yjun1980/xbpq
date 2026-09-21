/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.n.J;
import com.github.catvod.spider.merge.n.K;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class L<T>
extends AtomicReference<Runnable>
implements Runnable {
    private static final Runnable c = new K();
    private static final Runnable d = new K();

    L() {
    }

    private void g(Thread thread) {
        Runnable runnable = (Runnable)this.get();
        J j2 = null;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            block8: {
                block6: {
                    block7: {
                        boolean bl;
                        if (!(bl = runnable instanceof J) && runnable != d) {
                            if (n2 != 0) {
                                thread.interrupt();
                            }
                            return;
                        }
                        if (bl) {
                            j2 = (J)runnable;
                        }
                        if ((n4 = n3 + 1) <= 1000) break block6;
                        Runnable runnable2 = d;
                        if (runnable == runnable2) break block7;
                        n3 = n2;
                        if (!this.compareAndSet(runnable, runnable2)) break block8;
                    }
                    n2 = !Thread.interrupted() && n2 == 0 ? 0 : 1;
                    LockSupport.park(j2);
                    n3 = n2;
                    break block8;
                }
                Thread.yield();
                n3 = n2;
            }
            runnable = (Runnable)this.get();
            n2 = n3;
            n3 = n4;
        }
    }

    abstract void a(Throwable var1);

    abstract void b(T var1);

    final void c() {
        Runnable runnable = (Runnable)this.get();
        if (runnable instanceof Thread) {
            J j2 = new J(this, null);
            J.a(j2, Thread.currentThread());
            if (this.compareAndSet(runnable, j2)) {
                try {
                    ((Thread)runnable).interrupt();
                }
                finally {
                    if (this.getAndSet(c) == d) {
                        LockSupport.unpark((Thread)runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract T e();

    abstract String f();

    @Override
    public final void run() {
        block8: {
            Thread thread = Thread.currentThread();
            T t2 = null;
            if (!this.compareAndSet(null, thread)) {
                return;
            }
            boolean bl = this.d() ^ true;
            if (bl) {
                try {
                    t2 = this.e();
                }
                catch (Throwable throwable) {
                    if (!this.compareAndSet(thread, c)) {
                        this.g(thread);
                    }
                    if (bl) {
                        this.a(throwable);
                    }
                    break block8;
                }
            }
            if (!this.compareAndSet(thread, c)) {
                this.g(thread);
            }
            if (bl) {
                this.b(t2);
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder;
        Object object = (Runnable)this.get();
        if (object == c) {
            object = cYh.d("15252F3F3E34006D1A151814220D");
        } else if (object instanceof J) {
            object = cYh.d("15252F3F3E34006D1A18190E22021304070E22141C");
        } else if (object instanceof Thread) {
            object = ((Thread)object).getName();
            stringBuilder = new StringBuilder(String.valueOf(object).length() + 21);
            stringBuilder.append(cYh.d("15252F3F3E34006D1A03021429190F1677152970"));
            stringBuilder.append((String)object);
            stringBuilder.append(cYh.d("3A"));
            object = stringBuilder.toString();
        } else {
            object = cYh.d("15252F3F3E34006D1A1F180E47031510050E22146108120E3A");
        }
        String string = this.f();
        int n2 = String.valueOf(object).length();
        stringBuilder = new StringBuilder(String.valueOf(string).length() + (n2 + 2));
        stringBuilder.append((String)object);
        stringBuilder.append(cYh.d("4B70"));
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

