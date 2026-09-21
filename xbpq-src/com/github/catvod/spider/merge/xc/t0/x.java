/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.s0.E;

public abstract class x {
    public abstract Object a(Object var1);

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        return stringBuilder.toString();
    }
}

