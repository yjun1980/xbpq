/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.G1.c;
import java.util.function.Predicate;

public final class x
implements Predicate {
    public static final x a = new x();

    private /* synthetic */ x() {
    }

    public final boolean test(Object object) {
        object = (c)object;
        int n2 = A.j;
        return "acont".equals(((c)object).v());
    }
}

