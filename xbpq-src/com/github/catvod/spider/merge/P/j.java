/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.f;
import com.github.catvod.spider.merge.P.g;
import com.github.catvod.spider.merge.P.h;
import com.github.catvod.spider.merge.P.i;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.a;

public abstract class j
implements d {
    protected final int a;
    protected int b;

    j(int n2) {
        this.a = n2;
        this.b = 0;
    }

    public static j k(f f2) {
        int n2 = com.github.catvod.spider.merge.l.a.a(f2.e());
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    n2 = f2.g();
                    int n3 = f2.h();
                    int[] nArray = f2.f();
                    f2.a();
                    return new h(n2, n3, nArray);
                }
                throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
            }
            n2 = f2.g();
            int n4 = f2.h();
            char[] cArray = f2.d();
            f2.a();
            return new g(n2, n4, cArray);
        }
        n2 = f2.g();
        int n5 = f2.h();
        byte[] byArray = f2.c();
        f2.a();
        return new i(n2, n5, byArray);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d(int n2) {
        this.b = n2;
    }

    @Override
    public final int g() {
        return -1;
    }

    @Override
    public final int i() {
        return this.b;
    }

    @Override
    public final void j() {
        int n2 = this.a;
        int n3 = this.b;
        if (n2 - n3 != 0) {
            this.b = n3 + 1;
            return;
        }
        throw new IllegalStateException(cYh.d("04312F3F382E47332E3F242F0A356114181C"));
    }

    @Override
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return this.h(com.github.catvod.spider.merge.S.i.b(0, this.a - 1));
    }
}

