/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.o;

final class b {
    static final b c;
    static final b d;
    final boolean a;
    final Throwable b;

    static {
        if (o.f) {
            d = null;
            c = null;
        } else {
            d = new b(false, null);
            c = new b(true, null);
        }
    }

    b(boolean bl, Throwable throwable) {
        this.a = bl;
        this.b = throwable;
    }
}

