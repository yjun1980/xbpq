/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.o1.c;
import com.github.catvod.spider.merge.v1.k;
import com.github.catvod.spider.merge.v1.l;
import com.github.catvod.spider.merge.v1.n;
import com.github.catvod.spider.merge.w1.b;
import java.util.EnumSet;

public final class a
extends p {
    public a() {
        super(2, "media.ccc.de", EnumSet.of(com.github.catvod.spider.merge.k1.n.a, com.github.catvod.spider.merge.k1.n.b));
    }

    @Override
    public final c a() {
        return com.github.catvod.spider.merge.w1.a.m();
    }

    @Override
    public final c c() {
        return null;
    }

    @Override
    public final g e(com.github.catvod.spider.merge.o1.a a2) {
        if (l.e(a2.b())) {
            return new k(this, a2);
        }
        return new n(this, a2);
    }

    @Override
    public final com.github.catvod.spider.merge.b.a f() {
        return b.i();
    }
}

