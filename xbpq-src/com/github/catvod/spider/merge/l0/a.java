/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.o;
import com.github.catvod.spider.merge.P.q;
import com.github.catvod.spider.merge.P.w;
import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.S.m;

public final class a
extends o {
    @Override
    public final void f(w object, z z2) {
        object = ((w)object).p();
        while (object != null) {
            object = (x)((C)object).a;
        }
        object = new m(z2);
        throw object;
    }

    @Override
    public final D g(w object) {
        q q2 = new q((w)object);
        object = ((w)object).p();
        while (object != null) {
            object = (x)((C)object).a;
        }
        object = new m(q2);
        throw object;
    }
}

