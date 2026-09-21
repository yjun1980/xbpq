/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.KT.y;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.f;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.g0.i;
import com.github.catvod.spider.merge.xc.s0.B;
import java.io.Serializable;
import java.util.Map;

public final class x
extends i
implements p {
    public int d;
    public final String e;
    public final Map f;

    public x(String string, Map map, d d2) {
        this.e = string;
        this.f = map;
        super(d2);
    }

    @Override
    public final d create(Object object, d d2) {
        return new x(this.e, this.f, d2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        return ((x)this.create((B)object, (d)object2)).invokeSuspend(com.github.catvod.spider.merge.xc.c0.f.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object invokeSuspend(Object object) {
        com.github.catvod.spider.merge.xc.f0.a a2 = com.github.catvod.spider.merge.xc.f0.a.a;
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.github.catvod.spider.merge.xc.a.a.C(object);
            return object;
        } else {
            com.github.catvod.spider.merge.xc.a.a.C(object);
            object = y.a;
            this.d = 1;
            Serializable serializable = y.a((y)object, this.e, this.f, this);
            object = serializable;
            if (serializable != a2) return object;
            return a2;
        }
    }
}

