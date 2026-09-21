/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.mI.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.mI.n;
import java.io.Serializable;

public abstract class j
implements f,
Serializable {
    private final int arity;

    public j(int n2) {
        this.arity = n2;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        m.a.getClass();
        String string = n.a(this);
        i.d(string, "renderLambdaToString(...)");
        return string;
    }
}

