/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.n0.a;
import java.util.Iterator;

public abstract class h
implements Iterator,
a {
    public final Boolean next() {
        return this.nextBoolean();
    }

    public abstract boolean nextBoolean();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

