/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.P0.b;
import java.util.Iterator;

public class a
implements Iterable<Character> {
    private final char a;
    private final char b = (char)0;
    private final int c;

    public a() {
        this.a = '\u0001';
        this.c = 1;
    }

    public final char a() {
        return this.a;
    }

    public final char c() {
        return this.b;
    }

    @Override
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}

