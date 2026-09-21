/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.mI.f;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.mI.n;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.g0.c;

public abstract class i
extends c
implements f {
    public final int c;

    public i(d d2) {
        super(d2);
        this.c = 2;
    }

    @Override
    public final int getArity() {
        return this.c;
    }

    @Override
    public final String toString() {
        String string;
        if (this.getCompletion() == null) {
            m.a.getClass();
            string = n.a(this);
            com.github.catvod.spider.merge.mI.i.d(string, "renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }
}

