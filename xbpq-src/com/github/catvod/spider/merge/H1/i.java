/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.H1.b;
import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.H1.e;
import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.H1.h;
import com.github.catvod.spider.merge.H1.l;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.H1.p;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.k1.f;
import com.github.catvod.spider.merge.k1.j;
import com.github.catvod.spider.merge.n1.c;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class i
extends com.github.catvod.spider.merge.k1.d {
    private static final String z = i.class.getSimpleName();
    private m g;
    private List<com.github.catvod.spider.merge.k1.c> h = Collections.emptyList();
    private long i = -1L;
    private int j;
    private d k;
    private String l = "";
    private List<com.github.catvod.spider.merge.k1.c> m = Collections.emptyList();
    private List<com.github.catvod.spider.merge.k1.c> n = Collections.emptyList();
    private List<r> o = Collections.emptyList();
    private List<b> p = Collections.emptyList();
    private List<r> q = Collections.emptyList();
    private String r = "";
    private String s = "";
    private List<com.github.catvod.spider.merge.k1.e> t = Collections.emptyList();
    private List<p> u = Collections.emptyList();
    private List<String> v = Collections.emptyList();
    private List<l> w = Collections.emptyList();
    private List<j> x = Collections.emptyList();
    private List<e> y = Collections.emptyList();

    public i(int n2, String string, String string2, m m2, String string3, String string4, int n3) {
        super(n2, string3, string, string2, string4);
        this.g = m2;
        this.j = n3;
        com.github.catvod.spider.merge.K1.b.a("Created {}", this);
    }

    private static i h(g g2) {
        String string = g2.n();
        m m2 = g2.H();
        String string2 = g2.g();
        String string3 = g2.i();
        int n2 = g2.p();
        if (m2 != com.github.catvod.spider.merge.H1.m.a && !com.github.catvod.spider.merge.K1.p.j(string) && !com.github.catvod.spider.merge.K1.p.j(string2) && string3 != null && n2 != -1) {
            return new i(g2.l(), string, g2.j(), m2, string2, string3, n2);
        }
        throw new com.github.catvod.spider.merge.n1.e("Some important stream information was not given.");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i(i i2, g list) {
        void var1_7;
        try {
            i2.h = ((g)((Object)list)).P();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.i = ((g)((Object)list)).A();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.l = ((g)((Object)list)).U();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).W();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.m = ((g)((Object)list)).T();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).a0();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).V();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).J();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).K();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.n = ((g)((Object)list)).I();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.k = ((g)((Object)list)).t();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).Z();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).O();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).S();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).Q();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).C();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).u();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.u = ((g)((Object)list)).L();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).y();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).E();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).r();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).B();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).z();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.v = ((g)((Object)list)).N();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            ((g)((Object)list)).M();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.w = ((g)((Object)list)).G();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.x = ((g)((Object)list)).D();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            i2.y = ((g)((Object)list)).w();
        }
        catch (Exception exception) {
            i2.b(exception);
        }
        try {
            com.github.catvod.spider.merge.k1.g<? extends com.github.catvod.spider.merge.k1.e, ? extends f> g2 = ((g)((Object)list)).F();
            if (g2 == null) {
                List list2 = Collections.emptyList();
            } else {
                i2.a(g2.e());
                List<? extends com.github.catvod.spider.merge.k1.e> list3 = g2.f();
            }
        }
        catch (Exception exception) {
            i2.b(exception);
            List list4 = Collections.emptyList();
        }
        i2.t = var1_7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void j(i i2, g g2) {
        try {
            i2.r = g2.s();
        }
        catch (Exception exception) {
            i2.b(new com.github.catvod.spider.merge.n1.e("Couldn't get DASH manifest", exception));
        }
        try {
            i2.s = g2.x();
        }
        catch (Exception exception) {
            i2.b(new com.github.catvod.spider.merge.n1.e("Couldn't get HLS manifest", exception));
        }
        try {
            i2.p = g2.q();
        }
        catch (Exception exception) {
            i2.b(new com.github.catvod.spider.merge.n1.e("Couldn't get audio streams", exception));
        }
        catch (com.github.catvod.spider.merge.n1.d d2) {
            throw d2;
        }
        try {
            i2.o = g2.Y();
        }
        catch (Exception exception) {
            i2.b(new com.github.catvod.spider.merge.n1.e("Couldn't get video streams", exception));
        }
        try {
            i2.q = g2.X();
        }
        catch (Exception exception) {
            i2.b(new com.github.catvod.spider.merge.n1.e("Couldn't get video only streams", exception));
        }
        if (!i2.o.isEmpty()) return;
        if (!i2.p.isEmpty()) return;
        if (!com.github.catvod.spider.merge.K1.p.j(i2.r)) return;
        if (com.github.catvod.spider.merge.K1.p.j(i2.s)) throw new h();
    }

    public static i p(String object) {
        com.github.catvod.spider.merge.K1.b.a("getInfo({url})", object);
        int n2 = com.github.catvod.spider.merge.k1.l.d;
        for (com.github.catvod.spider.merge.k1.p p2 : com.github.catvod.spider.merge.k1.m.a()) {
            Objects.requireNonNull(p2);
            String string = com.github.catvod.spider.merge.K1.p.d((String)object);
            a a2 = p2.f();
            com.github.catvod.spider.merge.o1.c c2 = p2.a();
            Object object2 = p2.c();
            n2 = a2 != null && a2.h(string) ? 2 : (c2 != null && c2.h(string) ? 3 : (object2 != null && ((a)object2).h(string) ? 4 : 1));
            if (n2 == 1) continue;
            com.github.catvod.spider.merge.K1.b.a("getInfo({service},{url})", p2, object);
            object2 = p2.e(p2.f().a((String)object));
            com.github.catvod.spider.merge.K1.b.a("getInfo({extractor})", object2);
            ((com.github.catvod.spider.merge.k1.b)object2).b();
            try {
                object = com.github.catvod.spider.merge.H1.i.h((g)object2);
                com.github.catvod.spider.merge.H1.i.j((i)object, (g)object2);
                com.github.catvod.spider.merge.H1.i.i((i)object, (g)object2);
                return object;
            }
            catch (com.github.catvod.spider.merge.n1.e e2) {
                object2 = ((g)object2).v();
                if (com.github.catvod.spider.merge.K1.p.j((String)object2)) {
                    throw e2;
                }
                throw new c((String)object2, e2);
            }
        }
        throw new com.github.catvod.spider.merge.n1.e(com.github.catvod.spider.merge.I.s.a("No service can handle the url = \"", (String)object, "\""));
    }

    public final List<b> k() {
        return this.p;
    }

    public final String l() {
        return this.r;
    }

    public final d m() {
        return this.k;
    }

    public final long n() {
        return this.i;
    }

    public final String o() {
        return this.s;
    }

    public final m q() {
        return this.g;
    }

    public final List<com.github.catvod.spider.merge.k1.c> r() {
        return this.h;
    }

    public final String s() {
        return this.l;
    }

    public final List<r> t() {
        return this.q;
    }

    public final String toString() {
        String string = z;
        int n2 = this.f();
        String string2 = this.g();
        String string3 = this.e();
        String string4 = this.c();
        String string5 = this.d();
        String string6 = String.valueOf((Object)this.g);
        int n3 = this.j;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("[serviceId=");
        stringBuilder.append(n2);
        stringBuilder.append(", url='");
        stringBuilder.append(string2);
        O0.a(stringBuilder, "', originalUrl='", string3, "', id='", string4);
        O0.a(stringBuilder, "', name='", string5, "', streamType=", string6);
        stringBuilder.append(", ageLimit=");
        stringBuilder.append(n3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

