/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.g
 *  com.github.catvod.spider.merge.gu.h
 *  com.github.catvod.spider.merge.gu.i
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.f;
import com.github.catvod.spider.merge.gu.g;
import com.github.catvod.spider.merge.gu.h;
import com.github.catvod.spider.merge.gu.i;

public abstract class j
implements d {
    protected final int a;
    protected int b;

    j(int n2) {
        this.a = n2;
        this.b = 0;
    }

    public static j k(f f2) {
        int n2 = com.github.catvod.spider.merge.Dw.h.a(f2.e());
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    int n3 = f2.g();
                    n2 = f2.h();
                    int[] nArray = f2.f();
                    f2.a();
                    return new h(n3, n2, nArray);
                }
                throw new UnsupportedOperationException("Not reached");
            }
            n2 = f2.g();
            int n4 = f2.h();
            char[] cArray = f2.d();
            f2.a();
            return new g(n2, n4, cArray);
        }
        int n5 = f2.g();
        n2 = f2.h();
        byte[] byArray = f2.c();
        f2.a();
        return new i(n5, n2, byArray);
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
        throw new IllegalStateException("cannot consume EOF");
    }

    @Override
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return this.h(com.github.catvod.spider.merge.Mm.i.b(0, this.a - 1));
    }
}

