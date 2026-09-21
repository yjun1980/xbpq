/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.F0.e;
import java.util.function.Predicate;

public final class t
implements Predicate {
    public final String a;

    public /* synthetic */ t(String string) {
        this.a = string;
    }

    public final boolean test(Object object) {
        String string = this.a;
        return ((e)object).i("service", "").equals(string);
    }
}

