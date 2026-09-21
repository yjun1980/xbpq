/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.O0.c;
import java.util.NoSuchElementException;

public final class j
extends c {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public j(long l2, long l3, long l4) {
        this.a = l4;
        this.b = l3;
        boolean bl = true;
        long l5 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (!(l4 > 0L ? l5 <= 0 : l5 >= 0)) {
            bl = false;
        }
        this.c = bl;
        if (!bl) {
            l2 = l3;
        }
        this.d = l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long b() {
        long l2 = this.d;
        if (l2 == this.b) {
            if (!this.c) throw new NoSuchElementException();
            this.c = false;
            return l2;
        } else {
            this.d = this.a + l2;
        }
        return l2;
    }

    @Override
    public final boolean hasNext() {
        return this.c;
    }
}

