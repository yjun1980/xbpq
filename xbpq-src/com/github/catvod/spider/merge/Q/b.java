/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.cYh;

public class b {
    public final m a;
    public final int b;
    public X c;
    public int d;
    public final l0 e;

    public b(b b2, m m2, X x2, l0 l02) {
        this.a = m2;
        this.b = b2.b;
        this.c = x2;
        this.e = l02;
        this.d = b2.d;
    }

    public b(m m2, int n2, X x2, l0 l02) {
        this.a = m2;
        this.b = n2;
        this.c = x2;
        this.e = l02;
    }

    public boolean a(b b2) {
        X x2;
        X x3;
        boolean bl = true;
        if (this == b2) {
            return true;
        }
        if (b2 == null) {
            return false;
        }
        if (this.a.b != b2.a.b || this.b != b2.b || (x3 = this.c) != (x2 = b2.c) && (x3 == null || !x3.equals(x2)) || !this.e.equals(b2.e) || this.c() != b2.c()) {
            bl = false;
        }
        return bl;
    }

    public final int b() {
        return this.d & 0xBFFFFFFF;
    }

    public final boolean c() {
        boolean bl = (this.d & 0x40000000) != 0;
        return bl;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        return this.a((b)object);
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        l0 l02;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.a);
        String string = cYh.d("4B");
        stringBuilder.append(string);
        stringBuilder.append(this.b);
        if (this.c != null) {
            stringBuilder.append(cYh.d("4B0B"));
            stringBuilder.append(this.c.toString());
            stringBuilder.append(cYh.d("3A"));
        }
        if ((l02 = this.e) != null && l02 != l0.c) {
            stringBuilder.append(string);
            stringBuilder.append(this.e);
        }
        if (this.b() > 0) {
            stringBuilder.append(cYh.d("4B25316C"));
            stringBuilder.append(this.b());
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

