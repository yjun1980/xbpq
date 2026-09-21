/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import java.util.function.Predicate;

public final class n
implements Predicate {
    public static final n a = new n();

    private /* synthetic */ n() {
    }

    public final boolean test(Object object) {
        int n2 = ((String[])object).length;
        boolean bl = true;
        if (n2 <= 1) {
            bl = false;
        }
        return bl;
    }
}

