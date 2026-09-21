/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.c;
import java.util.List;

public final class a
extends c {
    private static final a a = new a();

    private a() {
    }

    public static a m() {
        return a;
    }

    @Override
    public final String c(String string) {
        return d.f("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", string, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean h(String string) {
        boolean bl = false;
        try {
            string = d.f("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", string, 1);
            if (string == null) return bl;
            return true;
        }
        catch (i i2) {
            return bl;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List list) {
        return e.c("https://media.ccc.de/c/", string);
    }
}

