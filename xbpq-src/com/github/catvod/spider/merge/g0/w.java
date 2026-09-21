/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.u0.c;
import java.util.function.Predicate;

public final class w
implements Predicate {
    public static final w a = new w();

    private /* synthetic */ w() {
    }

    public final boolean test(Object object) {
        object = (a)object;
        int n2 = Youtube.u;
        boolean bl = ((com.github.catvod.spider.merge.B0.c)object).b() == c.f;
        return bl;
    }
}

