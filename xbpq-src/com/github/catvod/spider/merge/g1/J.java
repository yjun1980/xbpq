/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import java.util.AbstractCollection;

public final class J
extends N {
    @Override
    public final boolean a(m m2, m m3) {
        m2 = m3.i0();
        boolean bl = m2 != null && !(m2 instanceof h) && ((AbstractCollection)m3.p0()).isEmpty();
        return bl;
    }

    public final String toString() {
        return ":only-child";
    }
}

