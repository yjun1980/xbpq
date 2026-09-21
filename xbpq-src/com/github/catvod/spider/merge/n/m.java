/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.t;
import com.github.catvod.spider.merge.n.W;
import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.k;
import com.github.catvod.spider.merge.n.l;
import com.github.catvod.spider.merge.n.n;
import com.github.catvod.spider.merge.n.o;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class m
extends a {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        try {
            object = Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                object = new l();
                object = (Unsafe)AccessController.doPrivileged(object);
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                throw new RuntimeException(cYh.d("243F343D337A093F35713E340E2428303B331D356138392E15392F223E3914"), throwable);
            }
        }
        try {
            c = ((Unsafe)object).objectFieldOffset(o.class.getDeclaredField(cYh.d("02")));
            b = ((Unsafe)object).objectFieldOffset(o.class.getDeclaredField(cYh.d("03")));
            d = ((Unsafe)object).objectFieldOffset(o.class.getDeclaredField(cYh.d("04")));
            e = ((Unsafe)object).objectFieldOffset(n.class.getDeclaredField(cYh.d("06")));
            f = ((Unsafe)object).objectFieldOffset(n.class.getDeclaredField(cYh.d("05")));
            a = object;
            return;
        }
        catch (Exception exception) {
            int n2 = t.b;
            if (exception instanceof RuntimeException) {
                throw (RuntimeException)exception;
            }
            if (!(exception instanceof Error)) {
                throw new RuntimeException(exception);
            }
            throw (Error)((Object)exception);
        }
    }

    m() {
        super((W)null);
    }

    final boolean a(o<?> o2, e e2, e e3) {
        return k.a(a, o2, b, e2, e3);
    }

    final boolean b(o<?> o2, Object object, Object object2) {
        return k.a(a, o2, d, object, object2);
    }

    final boolean c(o<?> o2, n n2, n n3) {
        return k.a(a, o2, c, n2, n3);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    final e f(o o2) {
        e e2;
        e e3 = com.github.catvod.spider.merge.n.e.d;
        do {
            if (e3 != (e2 = o.f(o2))) continue;
            return e2;
        } while (!k.a(a, o2, b, e2, e3));
        return e2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    final n g(o o2) {
        n n2;
        n n3 = n.c;
        do {
            if (n3 != (n2 = o.h(o2))) continue;
            return n2;
        } while (!this.c(o2, n2, n3));
        return n2;
    }

    @Override
    final void h(n n2, n n3) {
        a.putObject(n2, f, n3);
    }

    @Override
    final void i(n n2, Thread thread) {
        a.putObject(n2, e, thread);
    }
}

