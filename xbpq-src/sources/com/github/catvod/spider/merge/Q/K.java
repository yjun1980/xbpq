package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.EmptyStackException;

/* loaded from: classes.dex */
public final class K implements C {
    public static final K a = new K();

    private K() {
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final void a(com.github.catvod.spider.merge.P.s sVar) {
        if (!sVar.n.d()) {
            sVar.o = sVar.n.e(r0.f() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    @Override // com.github.catvod.spider.merge.Q.C
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(0, 4), 1);
    }

    public final String toString() {
        return cYh.d("173F311C383E02");
    }
}
