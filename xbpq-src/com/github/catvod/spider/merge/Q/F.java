/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.cYh;

public final class F
implements C {
    private final int a;

    public F(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(s s2) {
        s2.l = this.a;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof F)) {
            return false;
        }
        if (this.a != ((F)object).a) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 0), this.a), 2);
    }

    public final String toString() {
        int n2 = this.a;
        return String.format(cYh.d("0438203F393F0B7864357E"), n2);
    }
}

