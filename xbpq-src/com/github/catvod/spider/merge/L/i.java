/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.merge.L.n;
import com.github.catvod.spider.merge.L.u;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class i
extends n
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static final long i;
    public static final i j;

    static {
        Object object = new i();
        j = object;
        k.e((k)object, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            object = Long.getLong(cYh.d("0C3F353D3E341F7E223E25351224283F322949142437362F0B240429323912242E237931023531103B331135"), 1000L);
        }
        catch (SecurityException securityException) {
            object = 1000L;
        }
        i = timeUnit.toNanos((Long)object);
    }

    private i() {
    }

    private final void o() {
        synchronized (this) {
            block4: {
                boolean bl = this.p();
                if (bl) break block4;
                return;
            }
            debugStatus = 3;
            this.n();
            this.notifyAll();
            return;
        }
    }

    private final boolean p() {
        int n2 = debugStatus;
        boolean bl = n2 == 2 || n2 == 3;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final Thread h() {
        Thread thread = _thread;
        if (thread != null) return thread;
        synchronized (this) {
            block4: {
                thread = _thread;
                if (thread != null) break block4;
                _thread = thread = new Thread((Runnable)this, cYh.d("0C3F353D3E341F7E223E25351224283F322949142437362F0B240429323912242E23"));
                thread.setDaemon(true);
                thread.start();
            }
            return thread;
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
        long l2;
        long l3;
        long l4;
        boolean bl;
        block14: {
            boolean bl2;
            u u2 = u.b;
            u.a(this);
            bl = this.p();
            if (bl) {
                bl2 = false;
            } else {
                bl2 = true;
                debugStatus = 1;
                this.notifyAll();
            }
            try {
                // MONITOREXIT : this
                if (bl2) break block14;
                _thread = null;
                this.o();
                if (this.l()) return;
                this.h();
            }
            catch (Throwable throwable) {
                _thread = null;
                this.o();
                if (this.l()) throw throwable;
                this.h();
                throw throwable;
            }
            return;
        }
        long l5 = Long.MAX_VALUE;
        while (true) {
            Thread.interrupted();
            l4 = this.m();
            if (l4 != Long.MAX_VALUE) break block15;
            l3 = System.nanoTime();
            l2 = l5;
            if (l5 == Long.MAX_VALUE) {
                l2 = i;
                l2 += l3;
            }
            if ((l5 = l2 - l3) > 0L) break block16;
            _thread = null;
            this.o();
            if (this.l()) return;
            this.h();
            break;
        }
        {
            long l6;
            block17: {
                block18: {
                    block15: {
                        block16: {
                            return;
                        }
                        l3 = l2;
                        l6 = l4;
                        if (l4 > l5) {
                            l6 = l5;
                            l3 = l2;
                        }
                        break block18;
                    }
                    l3 = Long.MAX_VALUE;
                    l6 = l4;
                }
                l5 = l3;
                if (l6 <= 0L) continue;
                bl = this.p();
                if (!bl) break block17;
                _thread = null;
                this.o();
                if (this.l()) return;
                this.h();
                return;
            }
            LockSupport.parkNanos(this, l6);
            l5 = l3;
            continue;
        }
    }
}

