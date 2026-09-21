/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.D;
import com.github.catvod.spider.merge.n.M;
import java.util.concurrent.Future;

public abstract class C<V>
extends D<V> {
    private final M<V> c;

    protected C(M<V> m2) {
        this.c = m2;
    }

    @Override
    protected final Object b() {
        return this.c;
    }

    @Override
    protected final M<V> c() {
        return this.c;
    }

    @Override
    protected final Future d() {
        return this.c;
    }
}

