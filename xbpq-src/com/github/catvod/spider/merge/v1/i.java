/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.v1.j;
import java.util.function.Predicate;

public final class i
implements Predicate {
    public static final i a = new i();

    private /* synthetic */ i() {
    }

    public final boolean test(Object object) {
        return "dash".equals(((j)object).b) ^ true;
    }
}

