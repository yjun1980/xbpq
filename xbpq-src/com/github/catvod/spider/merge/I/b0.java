/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.e0;
import java.util.Comparator;

final class b0
implements Comparator<e0> {
    b0() {
    }

    @Override
    public final int compare(Object object, Object object2) {
        object = (e0)object;
        return Integer.compare(((e0)object2).a, ((e0)object).a);
    }
}

