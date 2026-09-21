/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.e;
import java.util.Map;
import java.util.function.Predicate;

public final class h
implements Predicate {
    public static final h a = new h();

    private /* synthetic */ h() {
    }

    public final boolean test(Object object) {
        return ((Map.Entry)object).getValue() instanceof e;
    }
}

