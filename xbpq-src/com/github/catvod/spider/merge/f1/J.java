/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.f1.P;

final class J
extends P {
    private final StringBuilder d = new StringBuilder();
    private String e;

    J() {
        this.a = 4;
    }

    @Override
    final P h() {
        super.h();
        P.i(this.d);
        this.e = null;
        return this;
    }

    final J k(char c2) {
        String string = this.e;
        if (string != null) {
            this.d.append(string);
            this.e = null;
        }
        this.d.append(c2);
        return this;
    }

    final J l(String string) {
        String string2 = this.e;
        if (string2 != null) {
            this.d.append(string2);
            this.e = null;
        }
        if (this.d.length() == 0) {
            this.e = string;
        } else {
            this.d.append(string);
        }
        return this;
    }

    final String m() {
        String string = this.e;
        if (string == null) {
            string = this.d.toString();
        }
        return string;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("<!--");
        String string = this.e;
        if (string == null) {
            string = this.d.toString();
        }
        return r.c(stringBuilder, string, "-->");
    }
}

