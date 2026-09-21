package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class i extends n implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static final long i;
    public static final i j;

    static {
        Long l;
        i iVar = new i();
        j = iVar;
        k.e(iVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong(cYh.d("0C3F353D3E341F7E223E25351224283F322949142437362F0B240429323912242E237931023531103B331135"), 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        i = timeUnit.toNanos(l.longValue());
    }

    private i() {
    }

    private final synchronized void o() {
        if (p()) {
            debugStatus = 3;
            n();
            notifyAll();
        }
    }

    private final boolean p() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.L.o
    public final Thread h() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, cYh.d("0C3F353D3E341F7E223E25351224283F322949142437362F0B240429323912242E23"));
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean l;
        u uVar = u.b;
        u.a(this);
        try {
            synchronized (this) {
                if (p()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                if (l) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m = m();
                if (m == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = i + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        o();
                        if (l()) {
                            return;
                        }
                        h();
                        return;
                    }
                    if (m > j3) {
                        m = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (m > 0) {
                    if (p()) {
                        _thread = null;
                        o();
                        if (l()) {
                            return;
                        }
                        h();
                        return;
                    }
                    LockSupport.parkNanos(this, m);
                }
            }
        } finally {
            _thread = null;
            o();
            if (!l()) {
                h();
            }
        }
    }
}
