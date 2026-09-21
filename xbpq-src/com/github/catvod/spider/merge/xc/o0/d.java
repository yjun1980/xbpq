/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.o0;

import com.github.catvod.spider.merge.xc.o0.a;
import com.github.catvod.spider.merge.xc.o0.b;

public final class d
extends b
implements a {
    public static final d d = new d(1, 0);

    public d(int n2, int n3) {
        super(n2, n3, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof d)) return false;
        if (this.isEmpty()) {
            if (((d)object).isEmpty()) return true;
        }
        object = (d)object;
        int n2 = ((b)object).a;
        if (this.a != n2) return false;
        n2 = ((b)object).b;
        if (this.b != n2) return false;
        return true;
    }

    @Override
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.b);
    }

    @Override
    public final Comparable getStart() {
        return Integer.valueOf(this.a);
    }

    @Override
    public final int hashCode() {
        int n2 = this.isEmpty() ? -1 : this.a * 31 + this.b;
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.a > this.b;
        return bl;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("..");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

