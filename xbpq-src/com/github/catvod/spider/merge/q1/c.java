/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q1;

import com.github.catvod.spider.merge.H1.j;
import com.github.catvod.spider.merge.H1.k;
import com.github.catvod.spider.merge.k1.g;
import com.github.catvod.spider.merge.n1.f;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.q1.a;
import com.github.catvod.spider.merge.q1.b;

public final class c
extends g {
    public final int e;

    public /* synthetic */ c(int n2, int n3) {
        this.e = n3;
        super(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(k k2) {
        try {
            this.c(this.i(k2));
            return;
        }
        catch (Exception exception) {
            this.b(exception);
            return;
        }
        catch (f f2) {
            return;
        }
    }

    public final j i(k k2) {
        if (!k2.l()) {
            j j2 = new j(this.g(), k2.g(), k2.getName(), k2.e());
            try {
                j2.g(k2.i());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.j(k2.c());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.h(k2.m());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                k2.r();
            }
            catch (i i2) {
                this.b(i2);
            }
            try {
                j2.m(k2.h());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.f(k2.s());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.k(k2.a());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.i(k2.o());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                j2.l(k2.b());
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                k2.q();
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                k2.k();
            }
            catch (Exception exception) {
                this.b(exception);
            }
            try {
                k2.j();
            }
            catch (Exception exception) {
                this.b(exception);
            }
            return j2;
        }
        throw new f("Found ad");
    }

    public final a j(b b2) {
        a a2 = new a(this.g(), b2.g(), b2.getName());
        try {
            b2.c();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.a();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.b();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            a2.f(b2.s());
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.d();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.getDescription();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        try {
            b2.n();
        }
        catch (Exception exception) {
            this.b(exception);
        }
        return a2;
    }
}

