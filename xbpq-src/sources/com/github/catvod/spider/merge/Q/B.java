package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.InterfaceC0003d;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B extends AbstractC0021l {
    protected final com.github.catvod.spider.merge.P.s d;
    protected int e;
    protected int f;
    protected int g;
    public final com.github.catvod.spider.merge.R.b[] h;
    protected int i;
    protected final A j;

    public B(com.github.catvod.spider.merge.P.s sVar, C0010a c0010a, com.github.catvod.spider.merge.R.b[] bVarArr, Y y) {
        super(c0010a, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new A();
        this.h = bVarArr;
        this.d = sVar;
    }

    @Override // com.github.catvod.spider.merge.Q.AbstractC0021l
    public final void a() {
        A a = this.j;
        a.a = -1;
        a.b = 0;
        a.c = -1;
        a.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    protected final void b(com.github.catvod.spider.merge.R.e eVar, int i, com.github.catvod.spider.merge.R.e eVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.R.e[128];
            }
            eVar.c[i + 0] = eVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    protected final com.github.catvod.spider.merge.R.e c(C0015f c0015f) {
        C0011b c0011b;
        com.github.catvod.spider.merge.R.e eVar = new com.github.catvod.spider.merge.R.e(c0015f);
        Iterator<C0011b> it = c0015f.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0011b = null;
                break;
            }
            c0011b = it.next();
            if (c0011b.a instanceof e0) {
                break;
            }
        }
        if (c0011b != null) {
            eVar.d = true;
            eVar.f = ((C0034z) c0011b).e();
            eVar.e = this.a.g[c0011b.a.c];
        }
        com.github.catvod.spider.merge.R.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.R.e eVar2 = (com.github.catvod.spider.merge.R.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            c0015f.c = true;
            c0015f.d = null;
            eVar.b = c0015f;
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00ab. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean d(com.github.catvod.spider.merge.P.InterfaceC0003d r16, com.github.catvod.spider.merge.Q.C0034z r17, com.github.catvod.spider.merge.Q.C0015f r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.B.d(com.github.catvod.spider.merge.P.d, com.github.catvod.spider.merge.Q.z, com.github.catvod.spider.merge.Q.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC0003d interfaceC0003d) {
        if (interfaceC0003d.f(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC0003d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124 A[EDGE_INSN: B:90:0x0124->B:70:0x0124 BREAK  A[LOOP:0: B:5:0x0023->B:88:0x0160], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int f(com.github.catvod.spider.merge.P.InterfaceC0003d r22, com.github.catvod.spider.merge.R.e r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.B.f(com.github.catvod.spider.merge.P.d, com.github.catvod.spider.merge.R.e):int");
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC0003d interfaceC0003d, int i) {
        this.i = i;
        interfaceC0003d.g();
        try {
            this.e = interfaceC0003d.i();
            A a = this.j;
            a.a = -1;
            a.b = 0;
            a.c = -1;
            a.d = null;
            com.github.catvod.spider.merge.R.b bVar = this.h[i];
            return bVar.b == null ? j(interfaceC0003d) : f(interfaceC0003d, bVar.b);
        } finally {
            interfaceC0003d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.Q.r0>, java.util.ArrayList] */
    protected final int j(InterfaceC0003d interfaceC0003d) {
        AbstractC0022m abstractC0022m = (AbstractC0022m) this.a.i.get(this.i);
        C0031w c0031w = X.b;
        Q q = new Q();
        int i = 0;
        while (i < abstractC0022m.b()) {
            int i2 = i + 1;
            d(interfaceC0003d, new C0034z(abstractC0022m.d(i).a, i2, c0031w), q, false, false, false);
            i = i2;
        }
        boolean z = q.h;
        q.h = false;
        com.github.catvod.spider.merge.R.e c = c(q);
        if (!z) {
            this.h[this.i].b = c;
        }
        return f(interfaceC0003d, c);
    }
}
