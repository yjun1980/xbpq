/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.b
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.e;
import com.github.catvod.spider.merge.N.a;
import kotlinx.coroutines.b;

public abstract class k
extends e {
    private long d;
    private boolean e;
    private a f;

    private final long c(boolean bl) {
        long l2 = bl ? 0x100000000L : 1L;
        return l2;
    }

    public static void e(k k2, boolean bl, int n2, Object object) {
        k2.d += k2.c(false);
        k2.e = true;
    }

    protected long d() {
        long l2;
        a a2 = this.f;
        long l3 = l2 = Long.MAX_VALUE;
        if (a2 != null) {
            l3 = a2.d() ? l2 : 0L;
        }
        return l3;
    }

    public final boolean f() {
        a a2 = this.f;
        boolean bl = a2 != null ? a2.d() : true;
        return bl;
    }

    public final boolean g() {
        a a2 = this.f;
        if (a2 != null && (a2 = (b)a2.n()) != null) {
            a2.run();
            return true;
        }
        return false;
    }
}

