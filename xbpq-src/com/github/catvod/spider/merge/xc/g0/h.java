/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.mI.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.mI.n;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.g0.g;

public abstract class h
extends g
implements f {
    private final int arity;

    public h(d d2) {
        super(d2);
        this.arity = 2;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        String string;
        if (this.getCompletion() == null) {
            m.a.getClass();
            string = n.a(this);
            i.d(string, "renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }
}

