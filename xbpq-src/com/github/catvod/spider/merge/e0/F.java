/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.t;
import java.util.AbstractCollection;

public final class F
extends t {
    public F(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    protected final int b(l l2) {
        if (l2.f0() == null) {
            return 0;
        }
        return ((AbstractCollection)l2.f0().R()).size() - l2.U();
    }

    @Override
    protected final String c() {
        return cYh.d("0924297C3B3B14246C323F330B34");
    }
}

