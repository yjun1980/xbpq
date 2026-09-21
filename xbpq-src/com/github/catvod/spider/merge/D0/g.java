/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.y.e;
import java.util.function.Predicate;

public final class g
implements Predicate {
    public static final g a = new g();

    private /* synthetic */ g() {
    }

    public final boolean test(Object object) {
        boolean bl = object instanceof e && ((e)object).x("continuationCommand") != null;
        return bl;
    }
}

