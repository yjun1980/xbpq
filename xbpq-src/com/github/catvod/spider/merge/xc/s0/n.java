/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.e0;
import com.github.catvod.spider.merge.xc.s0.m;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.o;
import java.util.concurrent.CancellationException;

public final class n
extends e0
implements m {
    public final o e;

    public n(m0 m02) {
        this.e = m02;
    }

    @Override
    public final boolean c(Throwable throwable) {
        m0 m02 = this.k();
        boolean bl = throwable instanceof CancellationException;
        boolean bl2 = true;
        if (!(bl || m02.j(throwable) && m02.q())) {
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final void d(Throwable object) {
        object = this.k();
        ((m0)this.e).j(object);
    }
}

