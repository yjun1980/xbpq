/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.Q;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.r0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class F
extends Q
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final F j;
    public static final long k;

    static {
        Object object = new F();
        j = object;
        ((S)object).j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            object = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (SecurityException securityException) {
            object = 1000L;
        }
        k = timeUnit.toNanos((Long)object);
    }

    @Override
    public final Thread i() {
        Thread thread;
        block7: {
            Thread thread2;
            thread = thread2 = _thread;
            if (thread2 == null) {
                synchronized (this) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                thread = thread2 = _thread;
                                if (thread2 != null) break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            _thread = thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                            thread.setContextClassLoader(F.class.getClassLoader());
                            thread.setDaemon(true);
                            thread.start();
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        return thread;
    }

    @Override
    public final void m() {
        debugStatus = 4;
        super.m();
    }

    @Override
    public final void n(Runnable runnable) {
        if (debugStatus != 4) {
            super.n(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void q() {
        synchronized (this) {
            block4: {
                int n2 = debugStatus;
                if (n2 == 2 || n2 == 3) break block4;
                return;
            }
            debugStatus = 3;
            Q.g.set(this, null);
            Q.h.set(this, null);
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        Throwable throwable3;
        block18: {
            long l2;
            int n2;
            block14: {
                Throwable throwable22;
                block15: {
                    block13: {
                        r0.a.set(this);
                        try {
                            n2 = debugStatus;
                            if (n2 == 2 || n2 == 3) break block13;
                            debugStatus = 1;
                            this.notifyAll();
                            // MONITOREXIT : this
                            l2 = Long.MAX_VALUE;
                            break block14;
                        }
                        catch (Throwable throwable22) {
                            break block15;
                        }
                    }
                    _thread = null;
                    this.q();
                    if (this.p()) return;
                    this.i();
                    return;
                }
                // MONITOREXIT : this
                throw throwable22;
            }
            while (true) {
                long l3;
                long l4;
                block19: {
                    long l5;
                    block16: {
                        long l6;
                        block17: {
                            try {
                                Thread.interrupted();
                                l5 = this.k();
                                if (l5 != Long.MAX_VALUE) break block16;
                                l4 = System.nanoTime();
                                l6 = l2;
                                if (l2 != Long.MAX_VALUE) break block17;
                                l6 = k;
                                l6 += l4;
                            }
                            catch (Throwable throwable3) {}
                        }
                        if ((l2 = l6 - l4) <= 0L) {
                            _thread = null;
                            this.q();
                            if (this.p()) return;
                            this.i();
                            return;
                        }
                        l4 = l6;
                        l3 = l5;
                        if (l5 > l2) {
                            l3 = l2;
                            l4 = l6;
                        }
                        break block19;
                    }
                    l4 = Long.MAX_VALUE;
                    l3 = l5;
                }
                l2 = l4;
                if (l3 <= 0L) continue;
                n2 = debugStatus;
                if (n2 == 2 || n2 == 3) {
                    break;
                }
                break block18;
                LockSupport.parkNanos(this, l3);
                l2 = l4;
            }
            _thread = null;
            this.q();
            if (this.p()) return;
            this.i();
            return;
        }
        _thread = null;
        this.q();
        if (this.p()) throw throwable3;
        this.i();
        throw throwable3;
    }
}

