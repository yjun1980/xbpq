/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.c;
import com.github.catvod.spider.merge.xc.G0.d;
import com.github.catvod.spider.merge.xc.G0.e;
import com.github.catvod.spider.merge.xc.G0.f;
import com.github.catvod.spider.merge.xc.G0.g;
import com.github.catvod.spider.merge.xc.G0.g1;
import com.github.catvod.spider.merge.xc.G0.h;
import com.github.catvod.spider.merge.xc.G0.i;
import com.github.catvod.spider.merge.xc.G0.j;
import com.github.catvod.spider.merge.xc.G0.k;
import com.github.catvod.spider.merge.xc.G0.l;
import com.github.catvod.spider.merge.xc.G0.m;
import com.github.catvod.spider.merge.xc.G0.n;
import com.github.catvod.spider.merge.xc.G0.o;
import com.github.catvod.spider.merge.xc.G0.p;
import com.github.catvod.spider.merge.xc.G0.q;
import com.github.catvod.spider.merge.xc.G0.r;
import com.github.catvod.spider.merge.xc.G0.s;
import com.github.catvod.spider.merge.xc.G0.t;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.v;
import com.github.catvod.spider.merge.xc.G0.w;
import com.github.catvod.spider.merge.xc.G0.x;
import com.github.catvod.spider.merge.xc.G0.y;
import com.github.catvod.spider.merge.xc.G0.z;

public abstract class B
extends Enum {
    public static final /* enum */ m a;
    public static final /* enum */ s b;
    public static final /* enum */ t c;
    public static final /* enum */ u d;
    public static final /* enum */ v e;
    public static final /* enum */ w f;
    public static final /* enum */ x g;
    public static final /* enum */ y h;
    public static final /* enum */ z i;
    public static final /* enum */ c j;
    public static final /* enum */ d k;
    public static final /* enum */ e l;
    public static final /* enum */ f m;
    public static final /* enum */ g n;
    public static final /* enum */ h o;
    public static final /* enum */ i p;
    public static final /* enum */ j q;
    public static final /* enum */ k r;
    public static final /* enum */ l s;
    public static final /* enum */ n t;
    public static final /* enum */ o u;
    public static final /* enum */ p v;
    public static final /* enum */ q w;
    public static final String x;
    public static final B[] y;

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
        z z2;
        y y2;
        x x2;
        w w2;
        v v2;
        u u2;
        t t2;
        s s2;
        m m2;
        a = m2 = new m();
        b = s2 = new s();
        c = t2 = new t();
        d = u2 = new u();
        e = v2 = new v();
        f = w2 = new w();
        g = x2 = new x();
        h = y2 = new y();
        i = z2 = new z();
        j = c2 = new c();
        k = d2 = new d();
        l = e2 = new e();
        m = f2 = new f();
        n = g2 = new g();
        o = h2 = new h();
        p = i2 = new i();
        q = j2 = new j();
        r = k2 = new k();
        s = l2 = new l();
        t = n2 = new n();
        u = o2 = new o();
        v = p2 = new p();
        w = q2 = new q();
        y = new B[]{m2, s2, t2, u2, v2, w2, x2, y2, z2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, n2, o2, p2, q2, new r()};
        x = String.valueOf('\u0000');
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public B() {
        void var2_-1;
        void var1_-1;
    }

    public static boolean a(N n2) {
        boolean bl = n2.a == 5 ? com.github.catvod.spider.merge.xc.E0.b.d(((G)n2).b) : false;
        return bl;
    }

    public static void b(L l2, b b2) {
        b2.c.o(g1.e);
        b2.m = b2.l;
        b2.l = h;
        b2.r(l2);
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    public static B[] values() {
        return (B[])y.clone();
    }

    public abstract boolean c(N var1, b var2);
}

