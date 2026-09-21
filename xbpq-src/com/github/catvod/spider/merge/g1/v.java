/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;

public abstract class v
extends N {
    protected final int a;
    protected final int b;

    public v(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl;
        block5: {
            block4: {
                m2 = m3.i0();
                bl = true;
                boolean bl2 = true;
                if (m2 == null || m2 instanceof h) break block4;
                int n2 = this.b(m3);
                int n3 = this.a;
                if (n3 == 0) {
                    bl = n2 == this.b ? bl2 : false;
                    return bl;
                }
                if ((n2 -= this.b) * n3 >= 0 && n2 % n3 == 0) break block5;
            }
            bl = false;
        }
        return bl;
    }

    protected abstract int b(m var1);

    protected abstract String c();

    public String toString() {
        if (this.a == 0) {
            return String.format(":%s(%d)", this.c(), this.b);
        }
        if (this.b == 0) {
            return String.format(":%s(%dn)", this.c(), this.a);
        }
        return String.format(":%s(%dn%+d)", this.c(), this.a, this.b);
    }
}

