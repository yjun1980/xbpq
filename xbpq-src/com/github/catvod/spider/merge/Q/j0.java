/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;

public final class j0
extends l0
implements Comparable<j0> {
    public final int d;

    protected j0() {
        this.d = 0;
    }

    public j0(int n2) {
        this.d = n2;
    }

    @Override
    public final boolean c(B<?, ?> b2, C c2) {
        return b2.j(this.d);
    }

    @Override
    public final int compareTo(Object object) {
        object = (j0)object;
        return this.d - ((j0)object).d;
    }

    @Override
    public final l0 d(B<?, ?> b2, C c2) {
        if (b2.j(this.d)) {
            return l0.c;
        }
        return null;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof j0;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (j0)object;
        if (this.d == ((j0)object).d) {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        return 31 + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("1C"));
        stringBuilder.append(this.d);
        stringBuilder.append(cYh.d("596D312332391A6F"));
        return stringBuilder.toString();
    }
}

