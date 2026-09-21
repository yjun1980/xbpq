/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;

public final class G
implements C {
    private final int a;
    private final int b;

    public G(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final void a(s s2) {
        s2.getClass();
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof G)) {
            return false;
        }
        object = (G)object;
        if (this.a != ((G)object).a || this.b != ((G)object).b) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 1), this.a), this.b), 3);
    }
}

