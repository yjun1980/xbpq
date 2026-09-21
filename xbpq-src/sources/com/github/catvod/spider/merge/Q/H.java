package com.github.catvod.spider.merge.Q;

/* loaded from: classes.dex */
public final class H implements C {
    private final int a;
    private final C b;

    public H(int i, C c) {
        this.a = i;
        this.b = c;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        this.b.a(sVar);
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return true;
    }

    public final C c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return this.a == h.a && this.b.equals(h.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(0, this.a), this.b), 2);
    }
}
