/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.d0.N;

final class M
extends N {
    M() {
        this.a = 2;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        boolean bl = this.r();
        String string = cYh.d("59");
        String string2 = cYh.d("5B");
        if (bl && this.j.size() > 0) {
            stringBuilder = d.b(string2);
            stringBuilder.append(this.x());
            stringBuilder.append(cYh.d("47"));
            string2 = this.j.toString();
        } else {
            stringBuilder = d.b(string2);
            string2 = this.x();
        }
        return n.b(stringBuilder, string2, string);
    }

    @Override
    final N v() {
        super.v();
        this.j = null;
        return this;
    }
}

