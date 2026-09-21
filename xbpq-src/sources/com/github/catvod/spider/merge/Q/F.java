package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class F implements C {
    private final int a;

    public F(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        sVar.l = this.a;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof F) && this.a == ((F) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 0), this.a), 2);
    }

    public final String toString() {
        return String.format(cYh.d("0438203F393F0B7864357E"), Integer.valueOf(this.a));
    }
}
