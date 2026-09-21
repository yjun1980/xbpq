/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.N;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.ka.d;

final class M
extends N {
    M() {
        this.a = 2;
    }

    public final String toString() {
        String string;
        StringBuilder stringBuilder;
        if (this.r() && this.j.size() > 0) {
            stringBuilder = d.b("<");
            stringBuilder.append(this.x());
            stringBuilder.append(" ");
            string = this.j.toString();
        } else {
            stringBuilder = d.b("<");
            string = this.x();
        }
        return n.b(stringBuilder, string, ">");
    }

    @Override
    final N v() {
        super.v();
        this.j = null;
        return this;
    }
}

