/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.F
 *  com.github.catvod.spider.merge.gu.c
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.gu.D;
import com.github.catvod.spider.merge.gu.F;
import com.github.catvod.spider.merge.gu.c;

public final class m
extends c {
    public m(F f2) {
        super(f2);
    }

    public final D e(int n2) {
        this.m();
        if (n2 == 0) {
            return null;
        }
        if (n2 < 0) {
            return this.p(-n2);
        }
        int n3 = this.c;
        for (int i2 = 1; i2 < n2; ++i2) {
            int n4 = n3 + 1;
            if (!this.o(n4)) continue;
            n3 = this.n(n4);
        }
        return (D)this.b.get(n3);
    }

    protected final int k(int n2) {
        return this.n(n2);
    }

    protected final D p(int n2) {
        int n3;
        if (n2 != 0 && (n3 = this.c) - n2 >= 0) {
            block0: for (int i2 = 1; i2 <= n2 && n3 > 0; ++i2) {
                this.o(--n3);
                int n4 = n3;
                if (n3 >= this.size()) {
                    n3 = this.size() - 1;
                    continue;
                }
                while (true) {
                    n3 = n4;
                    if (n4 < 0) continue block0;
                    D d2 = (D)this.b.get(n4);
                    n3 = n4--;
                    if (d2.e() == -1) continue block0;
                    if (d2.getChannel() != 0) continue;
                    n3 = n4;
                    continue block0;
                }
            }
            if (n3 < 0) {
                return null;
            }
            return (D)this.b.get(n3);
        }
        return null;
    }
}

