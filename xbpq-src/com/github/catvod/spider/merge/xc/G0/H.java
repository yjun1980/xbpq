/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.G0.N;

public final class H
extends N {
    public final StringBuilder b = new StringBuilder();
    public String c;

    public H() {
        this.a = 4;
    }

    @Override
    public final void f() {
        N.g(this.b);
        this.c = null;
    }

    public final void h(char c2) {
        String string = this.c;
        StringBuilder stringBuilder = this.b;
        if (string != null) {
            stringBuilder.append(string);
            this.c = null;
        }
        stringBuilder.append(c2);
    }

    public final void i(String string) {
        String string2 = this.c;
        StringBuilder stringBuilder = this.b;
        if (string2 != null) {
            stringBuilder.append(string2);
            this.c = null;
        }
        if (stringBuilder.length() == 0) {
            this.c = string;
        } else {
            stringBuilder.append(string);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<!--");
        String string = this.c;
        if (string == null) {
            string = this.b.toString();
        }
        return m.h(stringBuilder, string, "-->");
    }
}

