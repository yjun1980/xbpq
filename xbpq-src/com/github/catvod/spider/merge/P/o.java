/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.E;
import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.G;
import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.l;
import com.github.catvod.spider.merge.P.p;
import com.github.catvod.spider.merge.P.q;
import com.github.catvod.spider.merge.P.u;
import com.github.catvod.spider.merge.P.w;
import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.Q.S;
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.S.f;
import com.github.catvod.spider.merge.S.j;
import com.github.catvod.spider.merge.cYh;
import java.io.PrintStream;
import java.util.ArrayList;

public class o {
    protected boolean a = false;
    protected int b = -1;
    protected j c;
    protected x d;
    protected int e;

    protected final void a(w w2, j j2) {
        int n2;
        G g2 = w2.e;
        while ((n2 = g2.f(1)) != -1 && !j2.d(n2)) {
            w2.l();
            g2 = w2.e;
        }
    }

    protected final String b(String string) {
        string = string.replace(cYh.d("6D"), cYh.d("3B3E")).replace(cYh.d("6A"), cYh.d("3B22")).replace(cYh.d("6E"), cYh.d("3B24"));
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = cYh.d("40");
        stringBuilder.append(string2);
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    protected final j c(w object) {
        int n2;
        a a2 = ((S)((B)object).b).a;
        object = ((w)object).g;
        j j2 = new j(new int[0]);
        while (object != null && (n2 = ((C)object).b) >= 0) {
            j2.c(a2.e(((f0)((m)((ArrayList)a2.a).get((int)n2)).d((int)0)).c));
            object = ((C)object).a;
        }
        j2.h();
        return j2;
    }

    protected final j d(w w2) {
        w2.getClass();
        return com.github.catvod.spider.merge.g0.D.q.c(w2.i(), w2.g);
    }

    protected final String e(D d2) {
        if (d2 == null) {
            return cYh.d("5B3E2E7123350C352F6F");
        }
        String string = d2.c();
        CharSequence charSequence = string;
        if (string == null) {
            if (d2.e() == -1) {
                charSequence = cYh.d("5B150E1769");
            } else {
                charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("5B"));
                ((StringBuilder)charSequence).append(d2.e());
                ((StringBuilder)charSequence).append(cYh.d("59"));
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return this.b((String)charSequence);
    }

    public void f(w w2, z object) {
        if (this.b == w2.e.i() && (object = this.c) != null && ((j)object).d(w2.i())) {
            w2.l();
        }
        this.b = w2.e.i();
        if (this.c == null) {
            this.c = new j(new int[0]);
        }
        this.c.a(w2.i());
        this.a(w2, this.c(w2));
    }

    public D g(w serializable) {
        E<?> e2;
        Object object;
        Object object2 = this.k((w)((Object)serializable));
        if (object2 != null) {
            ((w)((Object)serializable)).l();
            return object2;
        }
        object2 = ((w)((Object)serializable)).e;
        int n2 = 1;
        int n3 = object2.f(1);
        object2 = ((m)((ArrayList)((S)((B)((Object)serializable)).b).a.a).get((int)((B)((Object)serializable)).i())).d((int)0).a;
        if (((S)((B)((Object)serializable)).b).a.f((m)object2, ((w)((Object)serializable)).g).d(n3)) {
            if (!this.a) {
                this.a = true;
                object = ((w)((Object)serializable)).q();
                object2 = this.d((w)((Object)serializable));
                e2 = com.github.catvod.spider.merge.d.d.b(cYh.d("0A3932223E340070"));
                ((StringBuilder)((Object)e2)).append(((j)object2).l(com.github.catvod.spider.merge.g0.D.o));
                ((StringBuilder)((Object)e2)).append(cYh.d("47313571"));
                ((StringBuilder)((Object)e2)).append(this.e((D)object));
                ((w)((Object)serializable)).t((D)object, ((StringBuilder)((Object)e2)).toString(), null);
            }
        } else {
            n2 = 0;
        }
        if (n2 != 0) {
            e2 = ((w)((Object)serializable)).q();
            object2 = this.d((w)((Object)serializable));
            n2 = !((j)object2).f() ? ((j)object2).e() : 0;
            if (n2 == -1) {
                object2 = cYh.d("5B3D2822243309376114181C59");
            } else {
                object2 = com.github.catvod.spider.merge.d.d.b(cYh.d("5B3D28222433093761"));
                ((StringBuilder)object2).append(com.github.catvod.spider.merge.g0.D.o.a(n2));
                ((StringBuilder)object2).append(cYh.d("59"));
                object2 = ((StringBuilder)object2).toString();
            }
            D d2 = ((w)((Object)serializable)).e.e(-1);
            object = e2;
            if (e2.e() == -1) {
                object = e2;
                if (d2 != null) {
                    object = d2;
                }
            }
            e2 = ((w)((Object)serializable)).e.b().e();
            serializable = new com.github.catvod.spider.merge.S.l<F, d>(object.b(), object.b().b());
            n3 = object.d();
            int n4 = object.a();
            return ((l)e2).a((com.github.catvod.spider.merge.S.l)serializable, n2, (String)object2, 0, -1, -1, n3, n4);
        }
        serializable = this.d == null ? new q((w)((Object)serializable)) : new q((w)((Object)serializable), this.e, this.d);
        throw serializable;
    }

    public final void h(w w2, z object) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (object instanceof u) {
            u u2 = (u)object;
            object = w2.e;
            object = object != null ? (u2.f().e() == -1 ? cYh.d("5B150E1769") : object.c(u2.f(), u2.c())) : cYh.d("5B252F3A3935103E6138392A12247F");
            StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("093F61273E3B053C247136361335333F362E0E262471362E47392F21222E47"));
            stringBuilder.append(this.b((String)object));
            object = stringBuilder.toString();
            w2.t(u2.c(), (String)object, u2);
        } else if (object instanceof q) {
            object = (q)object;
            CharSequence charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("0A39323C362E0438243577330920342577"));
            charSequence.append(this.e(((z)object).c()));
            charSequence.append(cYh.d("47353921323913392F3677"));
            j j2 = ((z)object).a();
            ((com.github.catvod.spider.merge.g0.D)w2).getClass();
            charSequence.append(j2.l(com.github.catvod.spider.merge.g0.D.o));
            charSequence = charSequence.toString();
            w2.t(((z)object).c(), (String)charSequence, (z)object);
        } else if (object instanceof p) {
            object = (p)object;
            ((com.github.catvod.spider.merge.g0.D)w2).getClass();
            String string = com.github.catvod.spider.merge.g0.D.n[w2.g.f()];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cYh.d("15252D3477"));
            stringBuilder.append(string);
            stringBuilder.append(cYh.d("47"));
            stringBuilder.append(((Throwable)object).getMessage());
            string = stringBuilder.toString();
            w2.t(((z)object).c(), string, (z)object);
        } else {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("123E2A3F382D097033343435003E28253E3509702423253515703528273F5D70"));
            stringBuilder.append(object.getClass().getName());
            printStream.println(stringBuilder.toString());
            w2.t(((z)object).c(), ((Throwable)object).getMessage(), (z)object);
        }
    }

    public final void i() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    protected final void j(w w2) {
        if (this.a) {
            return;
        }
        this.a = true;
        D d2 = w2.q();
        String string = this.e(d2);
        j j2 = this.d(w2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("022835233634023F342277330920342577"));
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("47353921323913392F3677"));
        stringBuilder.append(j2.l(com.github.catvod.spider.merge.g0.D.o));
        w2.t(d2, stringBuilder.toString(), null);
    }

    protected final D k(w object) {
        int n2 = ((w)object).e.f(2);
        if (this.d((w)object).d(n2)) {
            this.j((w)object);
            ((w)object).l();
            object = ((w)object).q();
            this.i();
            return object;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void l(w w2) {
        Object object = (m)((ArrayList)((S)w2.b).a.a).get(w2.i());
        if (this.a) {
            return;
        }
        int n2 = w2.e.f(1);
        Object object2 = com.github.catvod.spider.merge.g0.D.q;
        j j2 = ((a)object2).e((m)object);
        if (j2.d(n2)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (j2.d(-2)) {
            if (this.d != null) return;
            this.d = w2.g;
            this.e = w2.i();
            return;
        }
        n2 = ((m)object).c();
        if (n2 != 3 && n2 != 4 && n2 != 5) {
            switch (n2) {
                default: {
                    return;
                }
                case 9: 
                case 11: {
                    this.j(w2);
                    j2 = ((a)object2).c(w2.i(), w2.g);
                    object = this.c(w2);
                    object2 = new j(new int[0]);
                    ((j)object2).c(j2);
                    ((j)object2).c((f)object);
                    this.a(w2, (j)object2);
                    return;
                }
                case 10: 
            }
        }
        if (this.k(w2) == null) throw new q(w2);
    }
}

