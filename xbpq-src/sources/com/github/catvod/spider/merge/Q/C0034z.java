package com.github.catvod.spider.merge.Q;

/* renamed from: com.github.catvod.spider.merge.Q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034z extends C0011b {
    private final D f;
    private final boolean g;

    public C0034z(AbstractC0022m abstractC0022m, int i, X x) {
        super(abstractC0022m, i, x, l0.c);
        this.g = false;
        this.f = null;
    }

    public C0034z(C0034z c0034z, AbstractC0022m abstractC0022m) {
        super(c0034z, abstractC0022m, c0034z.c, c0034z.e);
        this.f = c0034z.f;
        this.g = d(c0034z, abstractC0022m);
    }

    public C0034z(C0034z c0034z, AbstractC0022m abstractC0022m, D d) {
        super(c0034z, abstractC0022m, c0034z.c, c0034z.e);
        this.f = d;
        this.g = d(c0034z, abstractC0022m);
    }

    public C0034z(C0034z c0034z, AbstractC0022m abstractC0022m, X x) {
        super(c0034z, abstractC0022m, x, c0034z.e);
        this.f = c0034z.f;
        this.g = d(c0034z, abstractC0022m);
    }

    private static boolean d(C0034z c0034z, AbstractC0022m abstractC0022m) {
        return c0034z.g || ((abstractC0022m instanceof AbstractC0030v) && ((AbstractC0030v) abstractC0022m).h);
    }

    @Override // com.github.catvod.spider.merge.Q.C0011b
    public final boolean a(C0011b c0011b) {
        boolean z = true;
        if (this == c0011b) {
            return true;
        }
        if (!(c0011b instanceof C0034z)) {
            return false;
        }
        C0034z c0034z = (C0034z) c0011b;
        if (this.g != c0034z.g) {
            return false;
        }
        D d = this.f;
        D d2 = c0034z.f;
        if (d != null) {
            z = d.equals(d2);
        } else if (d2 != null) {
            z = false;
        }
        if (z) {
            return super.a(c0011b);
        }
        return false;
    }

    public final D e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.Q.C0011b
    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}
