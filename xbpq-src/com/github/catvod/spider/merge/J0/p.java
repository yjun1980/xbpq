/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.n;

public final class p
extends Exception {
    private final n a;

    public p(n n2, String string) {
        super(string);
        this.a = n2;
    }

    public p(String string, Exception exception) {
        n n2 = n.h;
        super(string, exception);
        this.a = n2;
    }

    public final n a() {
        return this.a;
    }
}

