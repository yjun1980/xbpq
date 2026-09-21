/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.s0.k0;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.n;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.t0.q;

public final class j0
extends h0 {
    public final m0 e;
    public final k0 f;
    public final n g;
    public final Object h;

    public j0(m0 m02, k0 k02, n n2, Object object) {
        this.e = m02;
        this.f = k02;
        this.g = n2;
        this.h = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void d(Throwable object) {
        m0 m02 = this.e;
        m02.getClass();
        boolean bl = D.a;
        object = m0.x(this.g);
        k0 k02 = this.f;
        Object object2 = this.h;
        if (object != null) {
            n n2;
            do {
                j0 j02;
                if (E.f(((n)object).e, false, j02 = new j0(m02, k02, (n)object, object2), 1) != o0.a) {
                    return;
                }
                n2 = m0.x((q)object);
                object = n2;
            } while (n2 != null);
        }
        m02.o(k02, object2);
        m02.i();
    }
}

