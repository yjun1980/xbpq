/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.d;
import java.io.Serializable;

final class a
implements Serializable {
    private final String a;
    private final d b;
    private boolean c;

    a(String string, d d2) {
        this.a = string;
        this.b = d2;
    }

    final String a() {
        return this.a;
    }

    final boolean b() {
        return this.c;
    }

    final d c() {
        return this.b;
    }

    final void d(boolean bl) {
        this.c = bl;
    }
}

