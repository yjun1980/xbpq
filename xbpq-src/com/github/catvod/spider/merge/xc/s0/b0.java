/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.q;

public final class b0
extends h0 {
    public final int e;
    public final Object f;

    public /* synthetic */ b0(int n2, Object object) {
        this.e = n2;
        this.f = object;
    }

    @Override
    public final void d(Throwable object) {
        Object object2 = this.f;
        switch (this.e) {
            default: {
                object = this.k().s();
                boolean bl = D.a;
                bl = object instanceof q;
                object2 = (j)object2;
                if (bl) {
                    ((j)object2).resumeWith(com.github.catvod.spider.merge.xc.a.a.h(((q)object).a));
                } else {
                    ((j)object2).resumeWith(E.k(object));
                }
                return;
            }
            case 0: 
        }
        ((Z)object2).d((Throwable)object);
    }
}

