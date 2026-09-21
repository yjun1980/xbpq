/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.ka.d;

final class I
extends O {
    private final StringBuilder b = new StringBuilder();
    private String c;

    I() {
        this.a = 4;
    }

    @Override
    final O g() {
        O.h(this.b);
        this.c = null;
        return this;
    }

    final I i(char c2) {
        String string = this.c;
        if (string != null) {
            this.b.append(string);
            this.c = null;
        }
        this.b.append(c2);
        return this;
    }

    final I j(String string) {
        String string2 = this.c;
        if (string2 != null) {
            this.b.append(string2);
            this.c = null;
        }
        if (this.b.length() == 0) {
            this.c = string;
        } else {
            this.b.append(string);
        }
        return this;
    }

    final String k() {
        String string = this.c;
        if (string == null) {
            string = this.b.toString();
        }
        return string;
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b("<!--");
        String string = this.c;
        if (string == null) {
            string = this.b.toString();
        }
        return n.b(stringBuilder, string, "-->");
    }
}

