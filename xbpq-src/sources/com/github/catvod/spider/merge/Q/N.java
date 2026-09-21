package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class N implements C {
    private final int a;

    public N(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        sVar.m = this.a;
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof N) && this.a == ((N) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 7), this.a), 2);
    }

    public final String toString() {
        return String.format(cYh.d("132931347F7F0379"), Integer.valueOf(this.a));
    }
}
