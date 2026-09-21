/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.S.h;
import com.github.catvod.spider.merge.cYh;
import java.util.EmptyStackException;

public final class K
implements C {
    public static final K a = new K();

    private K() {
    }

    @Override
    public final void a(s s2) {
        if (!s2.n.d()) {
            h h2 = s2.n;
            s2.o = h2.e(h2.f() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        boolean bl = object == this;
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(0, 4), 1);
    }

    public final String toString() {
        return cYh.d("173F311C383E02");
    }
}

