/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.g;
import com.github.catvod.spider.merge.xc.KW.j;
import com.github.catvod.spider.merge.xc.t0.B;
import com.github.catvod.spider.merge.xc.t0.a;
import java.util.concurrent.TimeUnit;

public abstract class l {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;
    public static final j g;
    public static final j h;

    static {
        int n2;
        String string;
        int n3 = B.a;
        try {
            string = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        }
        catch (SecurityException securityException) {
            string = null;
        }
        String string2 = string;
        if (string == null) {
            string2 = "DefaultDispatcher";
        }
        a = string2;
        b = com.github.catvod.spider.merge.xc.t0.a.h(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        n3 = n2 = B.a;
        if (n2 < 2) {
            n3 = 2;
        }
        c = com.github.catvod.spider.merge.xc.t0.a.i("kotlinx.coroutines.scheduler.core.pool.size", n3, 1, 0, 8);
        d = com.github.catvod.spider.merge.xc.t0.a.i("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4);
        e = TimeUnit.SECONDS.toNanos(com.github.catvod.spider.merge.xc.t0.a.h(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = com.github.catvod.spider.merge.xc.KW.g.a;
        g = new j(0);
        h = new j(1);
    }
}

