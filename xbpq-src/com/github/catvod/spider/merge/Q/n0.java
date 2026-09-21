/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.cYh;

public class n0
extends X {
    public final X c;
    public final int d;

    n0(X x2, int n2) {
        int n3 = x2 != null ? com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.p(1, x2), n2), 2) : com.github.catvod.spider.merge.N.a.b(1, 0);
        super(n3);
        this.c = x2;
        this.d = n2;
    }

    public static n0 i(X x2, int n2) {
        if (n2 == Integer.MAX_VALUE && x2 == null) {
            return X.b;
        }
        return new n0(x2, n2);
    }

    @Override
    public X c(int n2) {
        return this.c;
    }

    @Override
    public int d(int n2) {
        return this.d;
    }

    @Override
    public boolean equals(Object object) {
        X x2;
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof n0)) {
            return false;
        }
        if (this.a != object.hashCode()) {
            return false;
        }
        object = (n0)object;
        if (this.d != ((n0)object).d || (x2 = this.c) == null || !x2.equals(((n0)object).c)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public int h() {
        return 1;
    }

    public String toString() {
        Object object = this.c;
        object = object != null ? object.toString() : "";
        if (((String)object).length() == 0) {
            int n2 = this.d;
            if (n2 == Integer.MAX_VALUE) {
                return cYh.d("43");
            }
            return String.valueOf(n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(this.d));
        stringBuilder.append(cYh.d("47"));
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

