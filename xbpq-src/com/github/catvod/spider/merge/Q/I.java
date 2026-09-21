/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.cYh;

public final class I
implements C {
    private final int a;

    public I(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(s s2) {
        s2.o = this.a;
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
        if (!(object instanceof I)) {
            return false;
        }
        if (this.a != ((I)object).a) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(0, 2), this.a), 2);
    }

    public final String toString() {
        int n2 = this.a;
        return String.format(cYh.d("0A3F25347F7F0379"), n2);
    }
}

