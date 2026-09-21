/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.j;

public final class l
extends j {
    public l(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(com.github.catvod.spider.merge.c0.l l2, com.github.catvod.spider.merge.c0.l l3) {
        boolean bl = l3.o(this.a) && this.b.equalsIgnoreCase(l3.c(this.a).trim());
        return bl;
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b;
        return String.format(cYh.d("3C75326C72293A"), string, string2);
    }
}

