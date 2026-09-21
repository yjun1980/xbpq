/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.x.a;
import java.util.regex.Pattern;

public final class o
extends N {
    String a;
    Pattern b;

    public o(String string, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.x.a.d(string);
        this.b = pattern;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = l3.o(this.a) && this.b.matcher(l3.c(this.a)).find();
        return bl;
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b.toString();
        return String.format(cYh.d("3C75322F6A7F140D"), string, string2);
    }
}

