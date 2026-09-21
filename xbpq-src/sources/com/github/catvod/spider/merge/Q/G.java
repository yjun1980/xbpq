package com.github.catvod.spider.merge.Q;

/* loaded from: classes.dex */
public final class G implements C {
    private final int a;
    private final int b;

    public G(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        sVar.getClass();
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return this.a == g.a && this.b == g.b;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 1), this.a), this.b), 3);
    }
}
