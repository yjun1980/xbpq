/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;

public final class H
implements C {
    private final int a;
    private final C b;

    public H(int n2, C c2) {
        this.a = n2;
        this.b = c2;
    }

    @Override
    public final void a(s s2) {
        this.b.a(s2);
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final C c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof H)) {
            return false;
        }
        object = (H)object;
        if (this.a != ((H)object).a || !this.b.equals(((H)object).b)) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(0, this.a), this.b), 2);
    }
}

