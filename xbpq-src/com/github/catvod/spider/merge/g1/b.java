/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.g1.N;

final class b {
    private m a = null;
    private m b = null;
    private final N c;

    b(N n2) {
        this.c = n2;
    }

    final m a(m s2, m m2) {
        int n2;
        this.a = s2;
        this.b = null;
        s2 = m2;
        int n3 = 0;
        while (s2 != null && (n2 = this.b(s2)) != 5) {
            int n4 = 1;
            m m3 = s2;
            int n5 = n3;
            int n6 = n2;
            if (n2 == 1) {
                m3 = s2;
                n5 = n3++;
                n6 = n2;
                if (((s)s2).g() > 0) {
                    s2 = s2.f(0);
                    continue;
                }
            }
            while (m3.r() == null && n5 > 0) {
                block11: {
                    block10: {
                        if (n6 == 1) break block10;
                        n3 = n6;
                        if (n6 != 2) break block11;
                    }
                    n3 = 1;
                }
                s2 = m3.z();
                --n5;
                if (n3 == 4) {
                    m3.B();
                }
                m3 = s2;
                n6 = 1;
            }
            n3 = n4;
            if (n6 != 1) {
                n3 = n6 == 2 ? n4 : n6;
            }
            if (m3 == m2) break;
            s2 = m3.r();
            if (n3 == 4) {
                m3.B();
            }
            n3 = n5;
        }
        return this.b;
    }

    public final int b(s s2) {
        if (s2 instanceof m && this.c.a(this.a, (m)(s2 = (m)s2))) {
            this.b = s2;
            return 5;
        }
        return 1;
    }
}

