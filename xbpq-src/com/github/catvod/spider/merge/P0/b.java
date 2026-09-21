/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.O0.a;
import com.github.catvod.spider.merge.c1.d;
import java.util.NoSuchElementException;

public final class b
extends a {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(char c2, char c3, int n2) {
        this.a = n2;
        this.b = c3;
        boolean bl = true;
        if (!(n2 > 0 ? com.github.catvod.spider.merge.c1.d.b(c2, c3) <= 0 : com.github.catvod.spider.merge.c1.d.b(c2, c3) >= 0)) {
            bl = false;
        }
        this.c = bl;
        if (!bl) {
            c2 = c3;
        }
        this.d = c2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final char b() {
        int n2 = this.d;
        if (n2 == this.b) {
            if (!this.c) throw new NoSuchElementException();
            this.c = false;
            return (char)n2;
        } else {
            this.d = this.a + n2;
        }
        return (char)n2;
    }

    @Override
    public final boolean hasNext() {
        return this.c;
    }
}

