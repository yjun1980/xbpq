/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.k0;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.q;

public final class i0
extends j {
    public final m0 i;

    public i0(d d2, m0 m02) {
        super(d2);
        this.i = m02;
    }

    @Override
    public final Throwable j(m0 m02) {
        Throwable throwable;
        Object object = this.i.s();
        if (object instanceof k0 && (throwable = ((k0)object).c()) != null) {
            return throwable;
        }
        if (object instanceof q) {
            return ((q)object).a;
        }
        return m02.p();
    }

    @Override
    public final String o() {
        return "AwaitContinuation";
    }
}

