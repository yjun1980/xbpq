package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class L<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable c = new RunnableC0201K();
    private static final Runnable d = new RunnableC0201K();

    private void g(Thread thread) {
        Runnable runnable = get();
        RunnableC0200J runnableC0200J = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC0200J;
            if (!z2 && runnable != d) {
                break;
            }
            if (z2) {
                runnableC0200J = (RunnableC0200J) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = d;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(runnableC0200J);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th);

    abstract void b(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            RunnableC0200J runnableC0200J = new RunnableC0200J(this, null);
            RunnableC0200J.a(runnableC0200J, Thread.currentThread());
            if (compareAndSet(runnable, runnableC0200J)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(c) == d) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract T e();

    abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !d();
            if (z) {
                try {
                    t = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, c)) {
                        g(currentThread);
                    }
                    if (z) {
                        a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, c)) {
                g(currentThread);
            }
            if (z) {
                b(t);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String d2;
        Runnable runnable = get();
        if (runnable == c) {
            d2 = cYh.d("15252F3F3E34006D1A151814220D");
        } else if (runnable instanceof RunnableC0200J) {
            d2 = cYh.d("15252F3F3E34006D1A18190E22021304070E22141C");
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append(cYh.d("15252F3F3E34006D1A03021429190F1677152970"));
            sb.append(name);
            sb.append(cYh.d("3A"));
            d2 = sb.toString();
        } else {
            d2 = cYh.d("15252F3F3E34006D1A1F180E47031510050E22146108120E3A");
        }
        String f = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(f).length() + String.valueOf(d2).length() + 2);
        sb2.append(d2);
        sb2.append(cYh.d("4B70"));
        sb2.append(f);
        return sb2.toString();
    }
}
