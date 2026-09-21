/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.n0;

public final class O
implements W {
    public final boolean a;

    public O(boolean bl) {
        this.a = bl;
    }

    @Override
    public final boolean a() {
        return this.a;
    }

    @Override
    public final n0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Empty{");
        String string = this.a ? "Active" : "New";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

