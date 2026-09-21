package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public final class j0 extends l0 implements Comparable<j0> {
    public final int d;

    protected j0() {
        this.d = 0;
    }

    public j0(int i) {
        this.d = i;
    }

    @Override // com.github.catvod.spider.merge.Q.l0
    public final boolean c(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c) {
        return b.j(this.d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0 j0Var) {
        return this.d - j0Var.d;
    }

    @Override // com.github.catvod.spider.merge.Q.l0
    public final l0 d(com.github.catvod.spider.merge.P.B<?, ?> b, com.github.catvod.spider.merge.P.C c) {
        if (b.j(this.d)) {
            return l0.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this == obj || this.d == ((j0) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.d;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("1C"));
        b.append(this.d);
        b.append(cYh.d("596D312332391A6F"));
        return b.toString();
    }
}
