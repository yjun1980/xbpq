/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;

public final class k0
extends l0 {
    public final int d;
    public final int e;
    public final boolean f;

    protected k0() {
        this.d = -1;
        this.e = -1;
        this.f = false;
    }

    public k0(int n2, int n3, boolean bl) {
        this.d = n2;
        this.e = n3;
        this.f = bl;
    }

    @Override
    public final boolean c(B<?, ?> b2, C c2) {
        b2.getClass();
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof k0;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (k0)object;
        bl = bl2;
        if (this.d == ((k0)object).d) {
            bl = bl2;
            if (this.e == ((k0)object).e) {
                bl = bl2;
                if (this.f == ((k0)object).f) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final int hashCode() {
        return a.b(a.o(a.o(a.o(0, this.d), this.e), this.f ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("1C"));
        stringBuilder.append(this.d);
        stringBuilder.append(cYh.d("5D"));
        stringBuilder.append(this.e);
        stringBuilder.append(cYh.d("1A6F"));
        return stringBuilder.toString();
    }
}

