/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I0.a;
import com.github.catvod.spider.merge.c.b;
import java.math.BigInteger;

public final class d {
    public BigInteger a;
    public BigInteger b;

    public d(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public final a a() {
        Object object;
        Object object2 = com.github.catvod.spider.merge.c.b.a(this.a);
        a a2 = com.github.catvod.spider.merge.c.b.a(this.b);
        a a3 = new a(com.github.catvod.spider.merge.c1.d.o(48));
        int n2 = 0;
        for (int i2 = 0; i2 < 2; ++i2) {
            object = (new a[]{object2, a2})[i2];
            n2 += ((a)object).e();
            a3.d(((a)object).a());
        }
        if (n2 < 128) {
            object2 = new a(com.github.catvod.spider.merge.c1.d.o(n2));
        } else {
            object2 = object = String.format("%x", n2);
            if (((String)object).length() % 2 != 0) {
                object2 = e.c("0", (String)object);
            }
            object2 = new a(com.github.catvod.spider.merge.c1.d.a((String)object2));
            ((a)object2).c(0, com.github.catvod.spider.merge.c1.d.o(0x80 | ((a)object2).e()));
        }
        a3.c(1, ((a)object2).a());
        return a3;
    }
}

