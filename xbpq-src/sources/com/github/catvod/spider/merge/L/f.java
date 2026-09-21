package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class f {
    private static final List<CoroutineExceptionHandler> a = com.github.catvod.spider.merge.J.c.b(com.github.catvod.spider.merge.J.c.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void a(com.github.catvod.spider.merge.z.k kVar, Throwable th) {
        Throwable runtimeException;
        Iterator<CoroutineExceptionHandler> it = a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(kVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException(cYh.d("22282234272E0E3F2F7120320E3C247123281E392F36772E08702930393E0B356132382808253538393F47353932322A13392E3F"), th2);
                    C0243a.a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
