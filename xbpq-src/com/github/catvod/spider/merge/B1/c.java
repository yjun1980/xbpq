/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.A1.a;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.k;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.p1.b;
import java.util.List;

public final class c
implements k {
    private final e a;

    public c(e e2) {
        this.a = e2;
    }

    @Override
    public final String a() {
        return p.p(this.a.g("user").i("permalink_url", null));
    }

    @Override
    public final boolean b() {
        return this.a.g("user").c("verified");
    }

    @Override
    public final String c() {
        return this.a.g("user").i("username", null);
    }

    @Override
    public final m e() {
        return m.c;
    }

    @Override
    public final String g() {
        return p.p(this.a.i("permalink_url", null));
    }

    @Override
    public final String getName() {
        return this.a.i("title", null);
    }

    @Override
    public final long h() {
        return this.a.f("playback_count");
    }

    @Override
    public final long i() {
        return this.a.f("duration") / 1000L;
    }

    @Override
    public final /* synthetic */ int j() {
        return 1;
    }

    @Override
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final String m() {
        return this.a.i("created_at", null);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> o() {
        return com.github.catvod.spider.merge.A1.a.b(this.a.g("user").i("avatar_url", null));
    }

    @Override
    public final /* synthetic */ String q() {
        return null;
    }

    @Override
    public final b r() {
        return com.github.catvod.spider.merge.A1.a.d(this.a.i("created_at", null));
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> s() {
        return com.github.catvod.spider.merge.A1.a.c(this.a);
    }
}

