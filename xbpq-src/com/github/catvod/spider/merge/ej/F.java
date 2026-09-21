/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.t;
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
        return "nth-last-child";
    }
}

