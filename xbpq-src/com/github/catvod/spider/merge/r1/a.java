/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.r1;

import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.n;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.o1.c;
import com.github.catvod.spider.merge.s1.e;
import com.github.catvod.spider.merge.s1.j;
import com.github.catvod.spider.merge.t1.b;
import java.util.EnumSet;

public final class a
extends p {
    public a() {
        super(4, "Bandcamp", EnumSet.of(n.a, n.d));
    }

    @Override
    public final c a() {
        return com.github.catvod.spider.merge.t1.a.m();
    }

    @Override
    public final c c() {
        return b.m();
    }

    @Override
    public final g e(com.github.catvod.spider.merge.o1.a a2) {
        if (com.github.catvod.spider.merge.s1.b.e(a2.d())) {
            return new e(this, a2);
        }
        return new j(this, a2);
    }

    @Override
    public final com.github.catvod.spider.merge.b.a f() {
        return com.github.catvod.spider.merge.t1.c.i();
    }
}

