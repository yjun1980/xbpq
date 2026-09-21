/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.g;

public abstract class r0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static S a() {
        S s2;
        ThreadLocal threadLocal = a;
        S s3 = s2 = (S)threadLocal.get();
        if (s2 == null) {
            s3 = new g(Thread.currentThread());
            threadLocal.set(s3);
        }
        return s3;
    }
}

