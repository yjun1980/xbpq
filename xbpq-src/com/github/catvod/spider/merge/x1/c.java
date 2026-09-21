/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.n;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.x1.a;
import com.github.catvod.spider.merge.z1.b;
import java.util.EnumSet;

public final class c
extends p {
    private a c;

    public c() {
        a a2 = a.a;
        super(3, "PeerTube", EnumSet.of(n.b, n.d));
        this.c = a2;
    }

    @Override
    public final com.github.catvod.spider.merge.o1.c a() {
        return com.github.catvod.spider.merge.z1.a.n();
    }

    @Override
    public final com.github.catvod.spider.merge.o1.c c() {
        return b.m();
    }

    @Override
    public final g e(com.github.catvod.spider.merge.o1.a a2) {
        return new com.github.catvod.spider.merge.y1.c(this, a2);
    }

    @Override
    public final com.github.catvod.spider.merge.b.a f() {
        return com.github.catvod.spider.merge.z1.c.i();
    }

    public final String i() {
        return this.c.a();
    }
}

