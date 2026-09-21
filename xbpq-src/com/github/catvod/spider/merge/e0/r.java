/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.x.a;

public final class r
extends N {
    private final String a;

    public r(String string) {
        this.a = com.github.catvod.spider.merge.x.a.c(string);
    }

    @Override
    public final boolean a(l l2, l l3) {
        return com.github.catvod.spider.merge.x.a.c(l3.e0()).contains(this.a);
    }

    public final String toString() {
        String string = this.a;
        return String.format(cYh.d("5D332E3F233B0E3E321E20344F753278"), string);
    }
}

