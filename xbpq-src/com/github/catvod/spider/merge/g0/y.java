/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.B0.c;
import com.github.catvod.spider.merge.B0.f;
import com.github.catvod.spider.merge.i0.m;
import java.util.function.Predicate;

public final class y
implements Predicate {
    public static final y a = new y();

    private /* synthetic */ y() {
    }

    public final boolean test(Object object) {
        object = (f)object;
        int n2 = Youtube.u;
        boolean bl = m.r() ? true : ((c)object).g().contains("avc");
        return bl;
    }
}

