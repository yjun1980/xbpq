/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.y.n;
import java.util.NoSuchElementException;

public final class b
extends n {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(int n2, int n3, int n4) {
        this.a = n4;
        this.b = n3;
        boolean bl = true;
        if (!(n4 > 0 ? n2 <= n3 : n2 >= n3)) {
            bl = false;
        }
        this.c = bl;
        if (!bl) {
            n2 = n3;
        }
        this.d = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int a() {
        int n2 = this.d;
        if (n2 == this.b) {
            if (!this.c) throw new NoSuchElementException();
            this.c = false;
            return n2;
        } else {
            this.d = this.a + n2;
        }
        return n2;
    }

    @Override
    public final boolean hasNext() {
        return this.c;
    }
}

