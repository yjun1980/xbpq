/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.v;
import java.util.AbstractCollection;

public final class G
extends v {
    public G(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(m m2) {
        if (m2.i0() == null) {
            return 0;
        }
        return ((AbstractCollection)m2.i0().T()).size() - m2.W();
    }

    @Override
    protected final String c() {
        return "nth-last-child";
    }
}

