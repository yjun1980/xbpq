/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.a;
import com.github.catvod.spider.merge.e0.b;
import com.github.catvod.spider.merge.e0.g;

public final class c {
    public static g a(N n2, l l2) {
        g g2 = new g();
        com.github.catvod.spider.merge.W.a.c(new a(l2, g2, n2), l2);
        return g2;
    }

    public static l b(N object, l l2) {
        int n2;
        b b2 = new b(l2, (N)object);
        object = l2;
        int n3 = 0;
        while (object != null && (n2 = b2.b((r)object)) != 5) {
            int n4 = 1;
            Object object2 = object;
            int n5 = n3;
            int n6 = n2;
            if (n2 == 1) {
                object2 = object;
                n5 = n3++;
                n6 = n2;
                if (((r)object).h() > 0) {
                    object = ((r)object).g(0);
                    continue;
                }
            }
            while (((r)object2).s() == null && n5 > 0) {
                block11: {
                    block10: {
                        if (n6 == 1) break block10;
                        n3 = n6;
                        if (n6 != 2) break block11;
                    }
                    n3 = 1;
                }
                object = ((r)object2).A();
                --n5;
                if (n3 == 4) {
                    ((r)object2).C();
                }
                object2 = object;
                n6 = 1;
            }
            n3 = n4;
            if (n6 != 1) {
                n3 = n6 == 2 ? n4 : n6;
            }
            if (object2 == l2) break;
            object = ((r)object2).s();
            if (n3 == 4) {
                ((r)object2).C();
            }
            n3 = n5;
        }
        return b.a(b2);
    }
}

