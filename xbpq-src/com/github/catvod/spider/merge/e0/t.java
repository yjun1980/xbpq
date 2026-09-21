/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;

public abstract class t
extends N {
    protected final int a;
    protected final int b;

    public t(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(l l2, l l3) {
        l2 = l3.f0();
        boolean bl = true;
        boolean bl2 = true;
        if (l2 == null) return false;
        if (l2 instanceof h) return false;
        int n2 = this.b(l3);
        int n3 = this.a;
        if (n3 == 0) {
            if (n2 != this.b) return false;
            return bl2;
        }
        if ((n2 -= this.b) * n3 < 0) return false;
        if (n2 % n3 != 0) return false;
        return bl;
    }

    protected abstract int b(l var1);

    protected abstract String c();

    public String toString() {
        if (this.a == 0) {
            String string = this.c();
            int n2 = this.b;
            return String.format(cYh.d("5D753279723E4E"), string, n2);
        }
        if (this.b == 0) {
            String string = this.c();
            int n3 = this.a;
            return String.format(cYh.d("5D753279723E0979"), string, n3);
        }
        String string = this.c();
        int n4 = this.a;
        int n5 = this.b;
        return String.format(cYh.d("5D753279723E09756A357E"), string, n4, n5);
    }
}

