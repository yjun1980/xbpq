/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.j;
import java.util.Iterator;

public class i
implements Iterable<Long> {
    private final long a;
    private final long b;
    private final long c;

    public i() {
        this.a = 1L;
        this.b = 0L;
        this.c = 1L;
    }

    public final long a() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    @Override
    public final Iterator iterator() {
        return new j(this.a, this.b, this.c);
    }
}

