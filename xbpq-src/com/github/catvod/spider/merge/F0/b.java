/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import java.util.function.Predicate;

public final class b
implements Predicate {
    public final Class a;

    public /* synthetic */ b(Class clazz) {
        this.a = clazz;
    }

    public final boolean test(Object object) {
        return this.a.isInstance(object);
    }
}

