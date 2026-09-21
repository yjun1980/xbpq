package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.Q.S;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class w extends B<D, S> {
    protected o d = new o();
    protected G e;
    protected final com.github.catvod.spider.merge.S.h f;
    protected x g;
    protected boolean h;
    private v i;
    protected List<com.github.catvod.spider.merge.T.c> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public w(G g) {
        com.github.catvod.spider.merge.S.h hVar = new com.github.catvod.spider.merge.S.h();
        this.f = hVar;
        hVar.a(0);
        this.h = true;
        this.e = null;
        o oVar = this.d;
        oVar.a = false;
        oVar.c = null;
        oVar.b = -1;
        this.g = null;
        this.k = false;
        u(this.i);
        this.i = null;
        hVar.b();
        hVar.a(0);
        ATNInterpreter atninterpreter = this.b;
        if (atninterpreter != 0) {
            atninterpreter.a();
        }
        this.e = g;
    }

    @Override // com.github.catvod.spider.merge.P.B
    public final boolean j(int i) {
        com.github.catvod.spider.merge.S.h hVar = this.f;
        return i >= hVar.c(hVar.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    public final D l() {
        D q = q();
        if (q.e() != -1) {
            this.e.j();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                x xVar = this.g;
                com.github.catvod.spider.merge.T.a aVar = new com.github.catvod.spider.merge.T.a(q);
                xVar.getClass();
                xVar.h(aVar);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((com.github.catvod.spider.merge.T.c) it.next()).a();
                    }
                }
            } else {
                x xVar2 = this.g;
                com.github.catvod.spider.merge.T.g gVar = new com.github.catvod.spider.merge.T.g(q);
                xVar2.getClass();
                xVar2.h(gVar);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((com.github.catvod.spider.merge.T.c) it2.next()).b(gVar);
                    }
                }
            }
        }
        return q;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    public final void m(x xVar) {
        x xVar2;
        x xVar3;
        if (this.h && (xVar2 = this.g) != xVar && (xVar3 = (x) xVar2.a) != null) {
            ?? r1 = xVar3.d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            xVar3.h(xVar);
        }
        this.g = xVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    public final void n(x xVar, int i) {
        k(i);
        this.g = xVar;
        xVar.e = this.e.e(1);
        if (this.h) {
            x xVar2 = this.g;
            x xVar3 = (x) xVar2.a;
            if (xVar3 != null) {
                xVar3.h(xVar2);
            }
        }
        ?? r2 = this.j;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.T.c cVar = (com.github.catvod.spider.merge.T.c) it.next();
                cVar.h(this.g);
                this.g.i(cVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    public final void o() {
        x xVar;
        D e;
        if (this.k) {
            xVar = this.g;
            e = this.e.e(1);
        } else {
            xVar = this.g;
            e = this.e.e(-1);
        }
        xVar.f = e;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.T.c cVar = (com.github.catvod.spider.merge.T.c) this.j.get(size);
                this.g.j(cVar);
                cVar.S(this.g);
            }
        }
        k(this.g.b);
        this.g = (x) this.g.a;
    }

    public final x p() {
        return this.g;
    }

    public final D q() {
        return this.e.e(1);
    }

    public final int r() {
        if (this.f.d()) {
            return -1;
        }
        return this.f.c(r0.f() - 1);
    }

    public final D s(int i) {
        D q = q();
        if (q.e() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            l();
        } else {
            q = this.d.g(this);
            if (this.h && q.g() == -1) {
                x xVar = this.g;
                com.github.catvod.spider.merge.T.a aVar = new com.github.catvod.spider.merge.T.a(q);
                xVar.getClass();
                xVar.h(aVar);
            }
        }
        return q;
    }

    public final void t(D d, String str, z zVar) {
        ((y) g()).a(this, d, d.d(), d.a(), str, zVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.T.c>, java.util.ArrayList] */
    public final void u(com.github.catvod.spider.merge.T.c cVar) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(cVar) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void v(o oVar) {
        this.d = oVar;
    }
}
