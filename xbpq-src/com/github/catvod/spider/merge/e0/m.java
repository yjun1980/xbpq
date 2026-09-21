/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.j;
import com.github.catvod.spider.merge.x.a;

public final class m
extends j {
    public m(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = l3.o(this.a) && com.github.catvod.spider.merge.x.a.c(l3.c(this.a)).contains(this.b);
        return bl;
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b;
        return String.format(cYh.d("3C75327B6A7F140D"), string, string2);
    }
}

