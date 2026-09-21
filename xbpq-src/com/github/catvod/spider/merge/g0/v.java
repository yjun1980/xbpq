/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.B0.f;
import java.util.function.Predicate;

public final class v
implements Predicate {
    public static final v a = new v();

    private /* synthetic */ v() {
    }

    public final boolean test(Object object) {
        object = (f)object;
        int n2 = Youtube.u;
        boolean bl = ((f)object).k().ordinal() > 4;
        return bl;
    }
}

