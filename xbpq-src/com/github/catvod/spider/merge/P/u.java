/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.G;
import com.github.catvod.spider.merge.P.w;
import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.P.z;

public final class u
extends z {
    private final D h;

    public u(w w2) {
        G g2 = w2.e;
        D d2 = w2.q();
        D d3 = w2.q();
        super(w2, g2, w2.g);
        this.h = d2;
        this.e(d3);
    }

    public u(w w2, G g2, D d2, D d3, x x2) {
        super(w2, g2, x2);
        this.h = d2;
        this.e(d3);
    }

    public final D f() {
        return this.h;
    }
}

