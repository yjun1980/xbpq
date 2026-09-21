/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.s1.b;
import java.util.List;

public final class f
implements com.github.catvod.spider.merge.q1.b {
    private final m a;

    public f(m m2) {
        this.a = m2;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String c() {
        return this.a.X("by-artist").j().replace("by ", "");
    }

    @Override
    public final long d() {
        return -1L;
    }

    @Override
    public final String g() {
        return this.a.X("album-link").a("abs:href");
    }

    @Override
    public final d getDescription() {
        return d.c;
    }

    @Override
    public final String getName() {
        return this.a.X("release-title").j();
    }

    @Override
    public final /* synthetic */ int n() {
        return 1;
    }

    @Override
    public final List<c> s() {
        return b.c(this.a.X("album-art").a("src"));
    }
}

