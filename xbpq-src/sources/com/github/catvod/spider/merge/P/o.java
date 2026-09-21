package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.Q.AbstractC0022m;
import com.github.catvod.spider.merge.Q.C0010a;
import com.github.catvod.spider.merge.Q.S;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class o {
    protected boolean a = false;
    protected int b = -1;
    protected com.github.catvod.spider.merge.S.j c;
    protected x d;
    protected int e;

    protected final void a(w wVar, com.github.catvod.spider.merge.S.j jVar) {
        G g = wVar.e;
        while (true) {
            int f = g.f(1);
            if (f == -1 || jVar.d(f)) {
                return;
            }
            wVar.l();
            g = wVar.e;
        }
    }

    protected final String b(String str) {
        String replace = str.replace(cYh.d("6D"), cYh.d("3B3E")).replace(cYh.d("6A"), cYh.d("3B22")).replace(cYh.d("6E"), cYh.d("3B24"));
        StringBuilder sb = new StringBuilder();
        String d = cYh.d("40");
        sb.append(d);
        sb.append(replace);
        sb.append(d);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    protected final com.github.catvod.spider.merge.S.j c(w wVar) {
        C0010a c0010a = ((S) wVar.b).a;
        com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
        for (C c = wVar.g; c != null; c = c.a) {
            int i = c.b;
            if (i < 0) {
                break;
            }
            jVar.c(c0010a.e(((f0) ((AbstractC0022m) c0010a.a.get(i)).d(0)).c));
        }
        jVar.h();
        return jVar;
    }

    protected final com.github.catvod.spider.merge.S.j d(w wVar) {
        wVar.getClass();
        return com.github.catvod.spider.merge.g0.D.q.c(wVar.i(), wVar.g);
    }

    protected final String e(D d) {
        if (d == null) {
            return cYh.d("5B3E2E7123350C352F6F");
        }
        String c = d.c();
        if (c == null) {
            if (d.e() == -1) {
                c = cYh.d("5B150E1769");
            } else {
                StringBuilder b = C0059d.b(cYh.d("5B"));
                b.append(d.e());
                b.append(cYh.d("59"));
                c = b.toString();
            }
        }
        return b(c);
    }

    public void f(w wVar, z zVar) {
        com.github.catvod.spider.merge.S.j jVar;
        if (this.b == wVar.e.i() && (jVar = this.c) != null && jVar.d(wVar.i())) {
            wVar.l();
        }
        this.b = wVar.e.i();
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.S.j(new int[0]);
        }
        this.c.a(wVar.i());
        a(wVar, c(wVar));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public D g(w wVar) {
        String sb;
        D k = k(wVar);
        if (k != null) {
            wVar.l();
            return k;
        }
        boolean z = true;
        if (!((S) wVar.b).a.f(((AbstractC0022m) ((S) wVar.b).a.a.get(wVar.i())).d(0).a, wVar.g).d(wVar.e.f(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            D q = wVar.q();
            com.github.catvod.spider.merge.S.j d = d(wVar);
            StringBuilder b = C0059d.b(cYh.d("0A3932223E340070"));
            b.append(d.l(com.github.catvod.spider.merge.g0.D.o));
            b.append(cYh.d("47313571"));
            b.append(e(q));
            wVar.t(q, b.toString(), null);
        }
        if (z) {
            D q2 = wVar.q();
            com.github.catvod.spider.merge.S.j d2 = d(wVar);
            int e = !d2.f() ? d2.e() : 0;
            if (e == -1) {
                sb = cYh.d("5B3D2822243309376114181C59");
            } else {
                StringBuilder b2 = C0059d.b(cYh.d("5B3D28222433093761"));
                b2.append(com.github.catvod.spider.merge.g0.D.o.a(e));
                b2.append(cYh.d("59"));
                sb = b2.toString();
            }
            String str = sb;
            D e2 = wVar.e.e(-1);
            if (q2.e() == -1 && e2 != null) {
                q2 = e2;
            }
            return ((l) wVar.e.b().e()).a(new com.github.catvod.spider.merge.S.l(q2.b(), q2.b().b()), e, str, 0, -1, -1, q2.d(), q2.a());
        }
        if (this.d == null) {
            throw new q(wVar);
        }
        throw new q(wVar, this.e, this.d);
    }

    public final void h(w wVar, z zVar) {
        String d;
        if (this.a) {
            return;
        }
        this.a = true;
        if (zVar instanceof u) {
            u uVar = (u) zVar;
            G g = wVar.e;
            if (g != null) {
                d = uVar.f().e() == -1 ? cYh.d("5B150E1769") : g.c(uVar.f(), uVar.c());
            } else {
                d = cYh.d("5B252F3A3935103E6138392A12247F");
            }
            StringBuilder b = C0059d.b(cYh.d("093F61273E3B053C247136361335333F362E0E262471362E47392F21222E47"));
            b.append(b(d));
            wVar.t(uVar.c(), b.toString(), uVar);
            return;
        }
        if (zVar instanceof q) {
            z zVar2 = (q) zVar;
            StringBuilder b2 = C0059d.b(cYh.d("0A39323C362E0438243577330920342577"));
            b2.append(e(zVar2.c()));
            b2.append(cYh.d("47353921323913392F3677"));
            com.github.catvod.spider.merge.S.j a = zVar2.a();
            ((com.github.catvod.spider.merge.g0.D) wVar).getClass();
            b2.append(a.l(com.github.catvod.spider.merge.g0.D.o));
            wVar.t(zVar2.c(), b2.toString(), zVar2);
            return;
        }
        if (zVar instanceof p) {
            z zVar3 = (p) zVar;
            ((com.github.catvod.spider.merge.g0.D) wVar).getClass();
            wVar.t(zVar3.c(), cYh.d("15252D3477") + com.github.catvod.spider.merge.g0.D.n[wVar.g.f()] + cYh.d("47") + zVar3.getMessage(), zVar3);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder b3 = C0059d.b(cYh.d("123E2A3F382D097033343435003E28253E3509702423253515703528273F5D70"));
        b3.append(zVar.getClass().getName());
        printStream.println(b3.toString());
        wVar.t(zVar.c(), zVar.getMessage(), zVar);
    }

    public final void i() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    protected final void j(w wVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        D q = wVar.q();
        wVar.t(q, cYh.d("022835233634023F342277330920342577") + e(q) + cYh.d("47353921323913392F3677") + d(wVar).l(com.github.catvod.spider.merge.g0.D.o), null);
    }

    protected final D k(w wVar) {
        if (!d(wVar).d(wVar.e.f(2))) {
            return null;
        }
        j(wVar);
        wVar.l();
        D q = wVar.q();
        i();
        return q;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public final void l(w wVar) {
        AbstractC0022m abstractC0022m = (AbstractC0022m) ((S) wVar.b).a.a.get(wVar.i());
        if (this.a) {
            return;
        }
        int f = wVar.e.f(1);
        C0010a c0010a = com.github.catvod.spider.merge.g0.D.q;
        com.github.catvod.spider.merge.S.j e = c0010a.e(abstractC0022m);
        if (e.d(f)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (e.d(-2)) {
            if (this.d == null) {
                this.d = wVar.g;
                this.e = wVar.i();
                return;
            }
            return;
        }
        int c = abstractC0022m.c();
        if (c != 3 && c != 4 && c != 5) {
            switch (c) {
                case 9:
                case 11:
                    j(wVar);
                    com.github.catvod.spider.merge.S.j c2 = c0010a.c(wVar.i(), wVar.g);
                    com.github.catvod.spider.merge.S.j c3 = c(wVar);
                    com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
                    jVar.c(c2);
                    jVar.c(c3);
                    a(wVar, jVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (k(wVar) == null) {
            throw new q(wVar);
        }
    }
}
