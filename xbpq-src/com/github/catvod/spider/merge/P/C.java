/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.T.e;
import com.github.catvod.spider.merge.cYh;

public class C
implements e {
    public static final x c = new x();
    public C a;
    public int b;

    public C() {
        this.b = -1;
    }

    public C(C c2, int n2) {
        this.a = c2;
        this.b = n2;
    }

    @Override
    public b b(int n2) {
        throw null;
    }

    @Override
    public final String c() {
        if (this.d() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.d(); ++i2) {
            stringBuilder.append(this.b(i2).c());
        }
        return stringBuilder.toString();
    }

    @Override
    public int d() {
        throw null;
    }

    @Override
    public <T> T e(d<? extends T> d2) {
        return d2.A(this);
    }

    public int f() {
        return -1;
    }

    public final boolean g() {
        boolean bl = this.b == -1;
        return bl;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("3C"));
        C c2 = this;
        while (c2 != null) {
            C c3;
            if (!c2.g()) {
                stringBuilder.append(c2.b);
            }
            if ((c3 = c2.a) != null && !c3.g()) {
                stringBuilder.append(cYh.d("47"));
            }
            c2 = c2.a;
        }
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

