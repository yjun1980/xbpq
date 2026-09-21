/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.\u7f51\u76d8\u96c6\u5408;
import java.util.function.Predicate;

public final class T
implements Predicate {
    public final k a;

    public /* synthetic */ T(k k2) {
        this.a = k2;
    }

    public final boolean test(Object object) {
        k k2 = this.a;
        object = (a)object;
        int n2 = \u7f51\u76d8\u96c6\u5408.n;
        return ((a)object).a().equals(k2.h());
    }
}

