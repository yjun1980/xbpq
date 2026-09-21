/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.D1.d;
import com.github.catvod.spider.merge.H1.a;
import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.spider.merge.k1.i;
import java.util.Locale;
import java.util.Objects;

public final class b
extends f {
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private String l;
    private final String m;
    private final Locale n;
    private final int o;
    private d p;

    b(a a2) {
        a.h(a2);
        String string = a.f(a2);
        boolean bl = a.i(a2);
        i i2 = a.l(a2);
        int n2 = a.g(a2);
        a.k(a2);
        super(string, bl, i2, n2);
        this.f = -1;
        if (a.j(a2) != null) {
            this.p = a.j(a2);
            this.f = a.j((a)a2).b;
            Objects.requireNonNull(a.j(a2));
            this.g = a.j(a2).e();
            this.h = a.j(a2).k();
            this.i = a.j(a2).j();
            this.j = a.j(a2).i();
            this.k = a.j(a2).h();
            this.l = a.j(a2).f();
        }
        this.e = a.e(a2);
        this.m = a.b(a2);
        a.c(a2);
        this.n = a.a(a2);
        this.o = a.d(a2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(f f2) {
        if (!super.b(f2)) return false;
        if (!(f2 instanceof b)) return false;
        int n2 = this.e;
        f2 = (b)f2;
        if (n2 != ((b)f2).e) return false;
        if (!Objects.equals(this.m, ((b)f2).m)) return false;
        if (this.o != ((b)f2).o) return false;
        if (!Objects.equals(this.n, ((b)f2).n)) return false;
        return true;
    }

    public final int e() {
        return this.g;
    }

    public final String f() {
        return this.l;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.j;
    }

    public final int i() {
        return this.i;
    }

    public final int j() {
        return this.h;
    }

    public final int k() {
        return this.f;
    }

    public final d l() {
        return this.p;
    }
}

