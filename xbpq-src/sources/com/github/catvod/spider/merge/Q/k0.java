package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public final class k0 extends l0 {
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX INFO: Access modifiers changed from: protected */
    public k0() {
        this.d = -1;
        this.e = -1;
        this.f = false;
    }

    public k0(int i, int i2, boolean z) {
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override // com.github.catvod.spider.merge.Q.l0
    public final boolean c(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c) {
        b.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k0 k0Var = (k0) obj;
        return this.d == k0Var.d && this.e == k0Var.e && this.f == k0Var.f;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, this.d), this.e), this.f ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("1C"));
        b.append(this.d);
        b.append(cYh.d("5D"));
        b.append(this.e);
        b.append(cYh.d("1A6F"));
        return b.toString();
    }
}
