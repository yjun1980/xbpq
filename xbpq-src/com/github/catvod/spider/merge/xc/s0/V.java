/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.n0;

public final class V
implements W {
    public final n0 a;

    public V(n0 n02) {
        this.a = n02;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final n0 e() {
        return this.a;
    }

    public final String toString() {
        String string = D.a ? this.a.k("New") : super.toString();
        return string;
    }
}

