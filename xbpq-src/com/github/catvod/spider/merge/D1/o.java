/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.F0.e;
import java.util.AbstractMap;
import java.util.function.Predicate;

public final class o
implements Predicate {
    public static final o a = new o();

    private /* synthetic */ o() {
    }

    public final boolean test(Object object) {
        boolean bl = object instanceof e && ((AbstractMap)((e)object)).containsKey("singleActionEmergencySupportRenderer");
        return bl;
    }
}

