/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.D1.d;
import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.spider.merge.k1.i;

public final class r
extends f {
    @Deprecated
    public final String e;
    @Deprecated
    public final boolean f;
    private int g = -1;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private String p;

    r(String string, String string2, boolean bl, i i2, int n2, String string3, boolean bl2, String string4, d d2) {
        super(string2, bl, i2, n2);
        if (d2 != null) {
            this.g = d2.b;
            this.h = d2.e();
            this.i = d2.k();
            this.j = d2.j();
            this.k = d2.i();
            this.l = d2.h();
            this.p = d2.f();
            this.n = d2.g();
            this.m = d2.o();
            this.o = d2.g;
        }
        this.e = string3;
        this.f = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(f f2) {
        if (!super.b(f2)) return false;
        if (!(f2 instanceof r)) return false;
        String string = this.e;
        f2 = (r)f2;
        if (!string.equals(((r)f2).e)) return false;
        if (this.f != ((r)f2).f) return false;
        return true;
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.p;
    }

    public final int g() {
        return this.o;
    }

    public final int h() {
        return this.n;
    }

    public final int i() {
        return this.l;
    }

    public final int j() {
        return this.k;
    }

    public final int k() {
        return this.j;
    }

    public final int l() {
        return this.i;
    }

    public final int m() {
        return this.g;
    }

    public final int n() {
        return this.m;
    }
}

