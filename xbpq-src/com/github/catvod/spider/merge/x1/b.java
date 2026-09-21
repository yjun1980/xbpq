/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import java.util.function.Predicate;

public final class b
implements Predicate {
    public static final b a = new b();

    private /* synthetic */ b() {
    }

    public final boolean test(Object object) {
        return p.j(((e)object).i("path", null)) ^ true;
    }
}

