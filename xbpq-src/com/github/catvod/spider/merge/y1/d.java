/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.k;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.g;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.p1.b;
import java.util.List;
import java.util.Objects;

public final class d
implements k {
    protected final e a;
    private String b;

    public d(e e2, String string) {
        this.a = e2;
        this.b = string;
    }

    @Override
    public final String a() {
        String string = f.g(this.a, "account.name");
        String string2 = f.g(this.a, "account.host");
        Objects.requireNonNull(com.github.catvod.spider.merge.k1.m.b);
        return com.github.catvod.spider.merge.z1.a.n().i(com.github.catvod.spider.merge.G1.a.a("accounts/", string, "@", string2), this.b).d();
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String c() {
        return f.g(this.a, "account.displayName");
    }

    @Override
    public final m e() {
        m m2 = this.a.c("isLive") ? m.d : m.b;
        return m2;
    }

    @Override
    public final String g() {
        String string = f.g(this.a, "uuid");
        Objects.requireNonNull(com.github.catvod.spider.merge.k1.m.b);
        Object object = com.github.catvod.spider.merge.z1.c.i();
        String string2 = this.b;
        Objects.requireNonNull(string, "ID cannot be null");
        object = ((com.github.catvod.spider.merge.z1.c)object).f(string, string2);
        return new a((String)object, (String)object, string).d();
    }

    @Override
    public final String getName() {
        return f.g(this.a, "name");
    }

    @Override
    public final long h() {
        return this.a.f("views");
    }

    @Override
    public final long i() {
        return this.a.f("duration");
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
        return f.g(this.a, "publishedAt");
    }

    @Override
    public final List<c> o() {
        return g.b(this.b, this.a.g("account"));
    }

    @Override
    public final /* synthetic */ String q() {
        return null;
    }

    @Override
    public final b r() {
        return com.github.catvod.spider.merge.p1.b.a(f.g(this.a, "publishedAt"));
    }

    @Override
    public final List<c> s() {
        return g.c(this.b, this.a);
    }
}

