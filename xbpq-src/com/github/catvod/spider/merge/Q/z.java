/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.Q.D;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.Q.b;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.v;

public final class z
extends b {
    private final D f;
    private final boolean g;

    public z(m m2, int n2, X x2) {
        super(m2, n2, x2, (l0)l0.c);
        this.g = false;
        this.f = null;
    }

    public z(z z2, m m2) {
        super(z2, m2, z2.c, z2.e);
        this.f = z2.f;
        this.g = z.d(z2, m2);
    }

    public z(z z2, m m2, D d2) {
        super(z2, m2, z2.c, z2.e);
        this.f = d2;
        this.g = z.d(z2, m2);
    }

    public z(z z2, m m2, X x2) {
        super(z2, m2, x2, z2.e);
        this.f = z2.f;
        this.g = z.d(z2, m2);
    }

    private static boolean d(z z2, m m2) {
        boolean bl = z2.g || m2 instanceof v && ((v)m2).h;
        return bl;
    }

    @Override
    public final boolean a(b b2) {
        boolean bl = true;
        if (this == b2) {
            return true;
        }
        if (!(b2 instanceof z)) {
            return false;
        }
        Object object = (z)b2;
        if (this.g != ((z)object).g) {
            return false;
        }
        D d2 = this.f;
        object = ((z)object).f;
        if (d2 == null) {
            if (object != null) {
                bl = false;
            }
        } else {
            bl = ((Object)d2).equals(object);
        }
        if (!bl) {
            return false;
        }
        return super.a(b2);
    }

    public final D e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    @Override
    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }
}

