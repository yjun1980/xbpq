/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.o0;

import com.github.catvod.spider.merge.xc.d0.t;
import java.util.NoSuchElementException;

public final class c
extends t {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    /*
     * Enabled aggressive block sorting
     */
    public c(int n2, int n3, int n4) {
        this.a = n4;
        this.b = n3;
        boolean bl = false;
        if (n4 > 0 ? n2 <= n3 : n2 >= n3) {
            bl = true;
        }
        this.c = bl;
        if (!bl) {
            n2 = n3;
        }
        this.d = n2;
    }

    @Override
    public final boolean hasNext() {
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int nextInt() {
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
}

