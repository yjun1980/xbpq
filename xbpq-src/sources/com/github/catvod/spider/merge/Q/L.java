package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class L implements C {
    private final int a;

    public L(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        int i = this.a;
        sVar.n.a(sVar.o);
        sVar.o = i;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof L) && this.a == ((L) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 5), this.a), 2);
    }

    public final String toString() {
        return String.format(cYh.d("172532391A35033569743373"), Integer.valueOf(this.a));
    }
}
