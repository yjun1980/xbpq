/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.f0;

public abstract class d
implements f0 {
    private static final ThreadLocal<L> a = new ThreadLocal();
    private static final ThreadLocal<Character> b = new ThreadLocal();

    final char f(L object, Object object2, char c2) {
        ThreadLocal<L> threadLocal = a;
        object2 = threadLocal.get();
        threadLocal.set((L)object);
        object = b;
        ((ThreadLocal)object).set(Character.valueOf(c2));
        this.g();
        threadLocal.set((L)object2);
        return ((Character)((ThreadLocal)object).get()).charValue();
    }

    public abstract void g();
}

