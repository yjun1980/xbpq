/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.C;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class D
extends ArrayList<C> {
    private final int a;

    D() {
        super(0);
        this.a = 0;
    }

    final boolean a() {
        boolean bl = ((AbstractCollection)this).size() < this.a;
        return bl;
    }

    final int c() {
        return this.a;
    }

    @Override
    public final Object clone() {
        return super.clone();
    }
}

