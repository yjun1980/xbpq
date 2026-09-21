/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.f1.P;

final class K
extends P {
    final StringBuilder d = new StringBuilder();
    String e = null;
    final StringBuilder f = new StringBuilder();
    final StringBuilder g = new StringBuilder();
    boolean h = false;

    K() {
        this.a = 1;
    }

    @Override
    final P h() {
        super.h();
        P.i(this.d);
        this.e = null;
        P.i(this.f);
        P.i(this.g);
        this.h = false;
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("<!doctype ");
        stringBuilder.append(this.d.toString());
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

