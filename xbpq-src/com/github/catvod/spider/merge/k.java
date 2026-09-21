/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.cI;
import com.github.catvod.spider.merge.rv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class k {
    private final Map<Object, rv> S;
    protected String l8;

    public k(String string) {
        this.l8 = string;
        this.S = new ConcurrentHashMap<Object, rv>();
    }

    private /* synthetic */ rv b(Object object) {
        return this.S((Class)object);
    }

    public /* synthetic */ rv OL(Object object) {
        return this.b(object);
    }

    public abstract rv S(Class<?> var1);

    public rv T4(Class<?> clazz) {
        return this.S.computeIfAbsent(clazz, new cI(this));
    }

    protected void l8(Class<?> clazz) {
    }
}

