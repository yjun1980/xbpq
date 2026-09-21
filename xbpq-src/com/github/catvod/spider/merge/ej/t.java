/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public abstract class t
extends N {
    protected final int a;
    protected final int b;

    public t(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl;
        block5: {
            block4: {
                l2 = l3.f0();
                bl = true;
                boolean bl2 = true;
                if (l2 == null || l2 instanceof h) break block4;
                int n2 = this.b(l3);
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

    protected abstract int b(l var1);

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

