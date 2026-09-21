/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.d0.f;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.K;
import com.github.catvod.spider.merge.xc.s0.w;

public abstract class S
extends w {
    public static final int f = 0;
    public long c;
    public boolean d;
    public f e;

    public final void h(boolean bl) {
        long l2 = this.c;
        long l3 = bl ? 0x100000000L : 1L;
        this.c = l3 = l2 - l3;
        if (l3 > 0L) {
            return;
        }
        bl = D.a;
        if (this.d) {
            this.m();
        }
    }

    public abstract Thread i();

    public final void j(boolean bl) {
        long l2 = this.c;
        long l3 = bl ? 0x100000000L : 1L;
        this.c = l3 + l2;
        if (!bl) {
            this.d = true;
        }
    }

    public abstract long k();

    public final boolean l() {
        Object object = this.e;
        if (object == null) {
            return false;
        }
        object = ((f)object).isEmpty() ? null : ((f)object).removeFirst();
        if ((object = (K)object) == null) {
            return false;
        }
        ((K)object).run();
        return true;
    }

    public abstract void m();
}

