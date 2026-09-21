/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O0;

import java.util.Iterator;

public abstract class b
implements Iterator<Integer> {
    public abstract int b();

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

