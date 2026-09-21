/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A1;

import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.n;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.o1.c;
import java.util.EnumSet;
import java.util.List;

public final class b
extends p {
    public b() {
        super(1, "SoundCloud", EnumSet.of(n.a, n.d));
    }

    @Override
    public final c a() {
        return com.github.catvod.spider.merge.C1.a.m();
    }

    @Override
    public final c c() {
        return com.github.catvod.spider.merge.C1.b.m();
    }

    @Override
    public final g e(a a2) {
        return new com.github.catvod.spider.merge.B1.b(this, a2);
    }

    @Override
    public final com.github.catvod.spider.merge.b.a f() {
        return com.github.catvod.spider.merge.C1.c.i();
    }

    @Override
    public final List<com.github.catvod.spider.merge.p1.a> g() {
        return com.github.catvod.spider.merge.p1.a.b("AU", "CA", "DE", "FR", "GB", "IE", "NL", "NZ", "US");
    }
}

