/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.j;

public final class p
extends j {
    public p(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.b.equalsIgnoreCase(l3.c(this.a)) ^ true;
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b;
        return String.format(cYh.d("3C7532706A7F140D"), string, string2);
    }
}

