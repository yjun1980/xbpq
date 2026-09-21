/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.c;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d0.e;
import com.github.catvod.spider.merge.d0.f;
import com.github.catvod.spider.merge.d0.g;
import com.github.catvod.spider.merge.d0.h;
import com.github.catvod.spider.merge.d0.h1;
import com.github.catvod.spider.merge.d0.i;
import com.github.catvod.spider.merge.d0.j;
import com.github.catvod.spider.merge.d0.k;
import com.github.catvod.spider.merge.d0.l;
import com.github.catvod.spider.merge.d0.m;
import com.github.catvod.spider.merge.d0.n;
import com.github.catvod.spider.merge.d0.o;
import com.github.catvod.spider.merge.d0.p;
import com.github.catvod.spider.merge.d0.q;
import com.github.catvod.spider.merge.d0.r;
import com.github.catvod.spider.merge.d0.s;
import com.github.catvod.spider.merge.d0.t;
import com.github.catvod.spider.merge.d0.u;
import com.github.catvod.spider.merge.d0.v;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.x;
import com.github.catvod.spider.merge.d0.y;

abstract class A
extends Enum<A> {
    private static final A[] A;
    public static final /* enum */ m c;
    public static final /* enum */ r d;
    public static final /* enum */ s e;
    public static final /* enum */ t f;
    public static final /* enum */ u g;
    public static final /* enum */ v h;
    public static final /* enum */ w i;
    public static final /* enum */ x j;
    public static final /* enum */ y k;
    public static final /* enum */ c l;
    public static final /* enum */ d m;
    public static final /* enum */ e n;
    public static final /* enum */ f o;
    public static final /* enum */ g p;
    public static final /* enum */ h q;
    public static final /* enum */ i r;
    public static final /* enum */ j s;
    public static final /* enum */ k t;
    public static final /* enum */ l u;
    public static final /* enum */ n v;
    public static final /* enum */ o w;
    public static final /* enum */ p x;
    public static final /* enum */ q y;
    private static final String z;

    static {
        q q2;
        p p2;
        o o2;
        n n2;
        l l2;
        k k2;
        j j2;
        i i2;
        h h2;
        g g2;
        f f2;
        e e2;
        d d2;
        c c2;
        y y2;
        x x2;
        w w2;
        v v2;
        u u2;
        t t2;
        s s2;
        r r2;
        m m2;
        c = m2 = new m();
        d = r2 = new r();
        e = s2 = new s();
        f = t2 = new t();
        g = u2 = new u();
        h = v2 = new v();
        i = w2 = new w();
        j = x2 = new x();
        k = y2 = new y();
        l = c2 = new c();
        m = d2 = new d();
        n = e2 = new e();
        o = f2 = new f();
        p = g2 = new g();
        q = h2 = new h();
        r = i2 = new i();
        s = j2 = new j();
        t = k2 = new k();
        u = l2 = new l();
        v = n2 = new n();
        w = o2 = new o();
        x = p2 = new p();
        y = q2 = new q();
        A = new A[]{m2, r2, s2, t2, u2, v2, w2, x2, y2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, n2, o2, p2, q2};
        z = String.valueOf('\u0000');
    }

    A(m m2) {
    }

    static boolean a(O o2) {
        boolean bl = o2.a() ? com.github.catvod.spider.merge.b0.b.c(((H)o2).j()) : false;
        return bl;
    }

    static void b(M m2, b b2) {
        b2.c.u(h1.g);
        b2.P();
        b2.j0(j);
        b2.D(m2);
    }

    static /* synthetic */ String c() {
        return z;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])A.clone();
    }

    abstract boolean d(O var1, b var2);
}

