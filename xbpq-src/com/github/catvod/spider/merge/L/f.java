/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.CoroutineExceptionHandler
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.J.c;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.a;
import com.github.catvod.spider.merge.z.k;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class f {
    private static final List<CoroutineExceptionHandler> a = c.b(c.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void a(k object, Throwable throwable) {
        for (Object object2 : a) {
            try {
                object2.handleException((k)object, throwable);
            }
            catch (Throwable throwable2) {
                Thread thread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
                if (throwable == throwable2) {
                    object2 = throwable;
                } else {
                    object2 = new RuntimeException(cYh.d("22282234272E0E3F2F7120320E3C247123281E392F36772E08702930393E0B356132382808253538393F47353932322A13392E3F"), throwable2);
                    com.github.catvod.spider.merge.x.a.a((Throwable)object2, throwable);
                }
                uncaughtExceptionHandler.uncaughtException(thread, (Throwable)object2);
            }
        }
        object = Thread.currentThread();
        ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
    }
}

