/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.f1.O;

final class N
extends O {
    N() {
        this.a = 2;
    }

    public final String toString() {
        String string;
        StringBuilder stringBuilder;
        if (this.u() && this.n.size() > 0) {
            stringBuilder = com.github.catvod.spider.merge.C.a.c("<");
            stringBuilder.append(this.A());
            stringBuilder.append(" ");
            string = this.n.toString();
        } else {
            stringBuilder = com.github.catvod.spider.merge.C.a.c("<");
            string = this.A();
        }
        return r.c(stringBuilder, string, ">");
    }

    @Override
    final O y() {
        super.y();
        this.n = null;
        return this;
    }
}

