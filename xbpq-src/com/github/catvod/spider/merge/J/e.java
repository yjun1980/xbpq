/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.J.b;
import java.util.Iterator;

public final class e
implements b<Object> {
    final Iterator a;

    public e(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public final Iterator<Object> iterator() {
        return this.a;
    }
}

