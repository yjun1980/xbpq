/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O0;

import java.util.Iterator;

public abstract class a
implements Iterator<Character> {
    public abstract char b();

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

