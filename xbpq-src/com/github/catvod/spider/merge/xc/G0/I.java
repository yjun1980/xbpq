/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.N;

public final class I
extends N {
    public final StringBuilder b = new StringBuilder();
    public String c = null;
    public final StringBuilder d = new StringBuilder();
    public final StringBuilder e = new StringBuilder();
    public boolean f = false;

    public I() {
        this.a = 1;
    }

    @Override
    public final void f() {
        N.g(this.b);
        this.c = null;
        N.g(this.d);
        N.g(this.e);
        this.f = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<!doctype ");
        stringBuilder.append(this.b.toString());
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

