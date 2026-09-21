/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.g;
import java.util.Iterator;

public class f
implements Iterable<Integer> {
    private final int a;
    private final int b;
    private final int c;

    public f() {
        this.a = 1;
        this.b = 0;
        this.c = 1;
    }

    public final int a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @Override
    public final Iterator iterator() {
        return new g(this.a, this.b, this.c);
    }
}

