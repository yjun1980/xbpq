/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.C;
import com.github.catvod.spider.merge.E0.F;
import com.github.catvod.spider.merge.E0.H;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.i0;
import com.github.catvod.spider.merge.E0.k0;
import com.github.catvod.spider.merge.E0.z;

public abstract class E<MessageType extends E<MessageType, BuilderType>, BuilderType>
extends I<MessageType, BuilderType>
implements k0 {
    protected z<F> e = z.c();

    @Override
    public final i0 c() {
        C c2 = (C)this.f(H.e);
        c2.g(this);
        return c2;
    }

    final z<F> u() {
        if (this.e.f()) {
            this.e = this.e.a();
        }
        return this.e;
    }
}

