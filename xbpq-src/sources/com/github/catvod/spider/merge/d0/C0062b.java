package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062b extends i1 {
    static final String[] A;
    static final String[] B;
    static final String[] v;
    static final String[] w;
    static final String[] x;
    static final String[] y;
    static final String[] z;
    private A k;
    private A l;
    private boolean m;
    private com.github.catvod.spider.merge.c0.l n;
    private com.github.catvod.spider.merge.c0.o o;
    private ArrayList<com.github.catvod.spider.merge.c0.l> p;
    private List<String> q;
    private L r;
    private boolean s;
    private boolean t;
    private String[] u = {null};

    static {
        String d = cYh.d("0620313D322E");
        String d2 = cYh.d("043131253E3509");
        String d3 = cYh.d("0F242C3D");
        String d4 = cYh.d("0A313320223F02");
        String d5 = cYh.d("08322B34342E");
        String d6 = cYh.d("1331233D32");
        String d7 = cYh.d("1334");
        String d8 = cYh.d("1338");
        v = new String[]{d, d2, d3, d4, d5, d6, d7, d8};
        String d9 = cYh.d("083C");
        String d10 = cYh.d("123C");
        w = new String[]{d9, d10};
        String d11 = cYh.d("052535253834");
        x = new String[]{d11};
        y = new String[]{d3, d6};
        String d12 = cYh.d("0820353625351220");
        String d13 = cYh.d("082035383834");
        z = new String[]{d12, d13};
        A = new String[]{cYh.d("0334"), cYh.d("0324"), cYh.d("0B39"), d12, d13, cYh.d("17"), cYh.d("1520"), cYh.d("1524")};
        B = new String[]{cYh.d("06342523322914"), d, cYh.d("06222430"), cYh.d("06223538343602"), cYh.d("0623283532"), cYh.d("05313234"), cYh.d("0531323431350924"), cYh.d("0537323E223403"), cYh.d("053C2E323C2B123F3534"), cYh.d("053F2528"), cYh.d("0522"), d11, d2, cYh.d("04352F253228"), cYh.d("043F2D"), cYh.d("043F2D3625351220"), cYh.d("043F2C3C363403"), cYh.d("0334"), cYh.d("033535303E3614"), cYh.d("033933"), cYh.d("033937"), cYh.d("033C"), cYh.d("0324"), cYh.d("023D233433"), cYh.d("0139243D33290224"), cYh.d("01392632362A13392E3F"), cYh.d("01392624253F"), cYh.d("013F2E253228"), cYh.d("013F333C"), cYh.d("0122203C32"), cYh.d("0122203C32290224"), cYh.d("0F61"), cYh.d("0F62"), cYh.d("0F63"), cYh.d("0F64"), cYh.d("0F65"), cYh.d("0F66"), cYh.d("0F352035"), cYh.d("0F3520353228"), cYh.d("0F37333E222A"), cYh.d("0F22"), d3, cYh.d("0E3633303A3F"), cYh.d("0E3D26"), cYh.d("0E3E312423"), cYh.d("0E23283F333F1F"), cYh.d("0B39"), cYh.d("0B392F3A"), cYh.d("0B3932253E3400"), d4, cYh.d("0A352F24"), cYh.d("0A353530"), cYh.d("093137"), cYh.d("093F243C353F03"), cYh.d("093F272336370223"), cYh.d("093F323225331724"), d5, d9, cYh.d("17"), cYh.d("173133303A"), cYh.d("173C2038392E022835"), cYh.d("172224"), cYh.d("14333338272E"), cYh.d("143522253E3509"), cYh.d("14352D34342E"), cYh.d("1424383D32"), cYh.d("14252C3C36281E"), d6, cYh.d("13322E352E"), d7, cYh.d("1335392536280231"), cYh.d("13362E3E23"), d8, cYh.d("1338243033"), cYh.d("1339353D32"), cYh.d("1322"), d10, cYh.d("103233"), cYh.d("1F3D31")};
    }

    private boolean A(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String d0 = this.e.get(size).d0();
            if (com.github.catvod.spider.merge.b0.b.b(d0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(d0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.b0.b.b(d0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K(com.github.catvod.spider.merge.c0.r r2) {
        /*
            r1 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.c0.l> r0 = r1.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.c0.h r0 = r1.d
            goto L17
        Lb:
            boolean r0 = r1.t
            if (r0 == 0) goto L13
            r1.I(r2)
            goto L1a
        L13:
            com.github.catvod.spider.merge.c0.l r0 = r1.a()
        L17:
            r0.L(r2)
        L1a:
            boolean r0 = r2 instanceof com.github.catvod.spider.merge.c0.l
            if (r0 == 0) goto L31
            com.github.catvod.spider.merge.c0.l r2 = (com.github.catvod.spider.merge.c0.l) r2
            com.github.catvod.spider.merge.d0.F r0 = r2.m0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L31
            com.github.catvod.spider.merge.c0.o r0 = r1.o
            if (r0 == 0) goto L31
            r0.r0(r2)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0062b.K(com.github.catvod.spider.merge.c0.r):void");
    }

    private boolean M(ArrayList<com.github.catvod.spider.merge.c0.l> arrayList, com.github.catvod.spider.merge.c0.l lVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == lVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    private void j(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c0.l lVar = this.e.get(size);
            String d0 = lVar.d0();
            int i = com.github.catvod.spider.merge.b0.b.d;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(d0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || lVar.d0().equals(cYh.d("0F242C3D"))) {
                return;
            }
            this.e.remove(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(String str) {
        String[] strArr = y;
        String[] strArr2 = this.u;
        strArr2[0] = str;
        return A(strArr2, strArr, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(Reader reader, E e) {
        com.github.catvod.spider.merge.c0.h hVar = new com.github.catvod.spider.merge.c0.h();
        this.d = hVar;
        hVar.t0(e);
        this.a = e;
        this.h = D.c;
        this.b = new C0060a(reader, 32768);
        this.g = null;
        this.c = new Q(this.b, e.a());
        this.e = new ArrayList<>(32);
        this.f = "";
        this.k = A.c;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = new ArrayList<>();
        this.q = new ArrayList();
        this.r = new L();
        this.s = true;
        this.t = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l D(M m) {
        if (m.r() && !m.j.isEmpty() && m.j.i(this.h) > 0) {
            C a = this.a.a();
            if (a.a()) {
                a.add(new B(this.b.E(), cYh.d("2325313D3E3906242471362E13222833222E02")));
            }
        }
        if (m.i) {
            com.github.catvod.spider.merge.c0.l G = G(m);
            this.e.add(G);
            this.c.u(h1.c);
            Q q = this.c;
            L l = this.r;
            l.g();
            l.s(G.n0());
            q.j(l);
            return G;
        }
        F l2 = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.c0.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.c0.l lVar = new com.github.catvod.spider.merge.c0.l(l2, null, cVar);
        K(lVar);
        this.e.add(lVar);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(H h) {
        com.github.catvod.spider.merge.c0.r fVar;
        com.github.catvod.spider.merge.c0.l a = a();
        if (a == null) {
            a = this.d;
        }
        String d0 = a.d0();
        String j = h.j();
        if (h instanceof G) {
            fVar = new com.github.catvod.spider.merge.c0.d(j);
        } else {
            fVar = b(d0) ? new com.github.catvod.spider.merge.c0.f(j) : new com.github.catvod.spider.merge.c0.u(j);
        }
        a.L(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(I i) {
        K(new com.github.catvod.spider.merge.c0.e(i.k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l G(M m) {
        F l = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.c0.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.c0.l lVar = new com.github.catvod.spider.merge.c0.l(l, null, cVar);
        K(lVar);
        if (m.i) {
            if (!l.g()) {
                l.k();
            } else if (!l.d()) {
                this.c.r(cYh.d("33312671343B093E2E257738027032343B3C47332D3E243309377A7139351370207121350E346125363D"));
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.o H(M m, boolean z2) {
        F l = F.l(m.t(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.c0.c cVar = m.j;
        d.b(cVar);
        com.github.catvod.spider.merge.c0.o oVar = new com.github.catvod.spider.merge.c0.o(l, cVar);
        this.o = oVar;
        K(oVar);
        if (z2) {
            this.e.add(oVar);
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(com.github.catvod.spider.merge.c0.r rVar) {
        com.github.catvod.spider.merge.c0.l lVar;
        com.github.catvod.spider.merge.c0.l t = t(cYh.d("1331233D32"));
        boolean z2 = false;
        if (t == null) {
            lVar = this.e.get(0);
        } else if (t.f0() != null) {
            lVar = t.f0();
            z2 = true;
        } else {
            lVar = g(t);
        }
        if (z2) {
            com.github.catvod.spider.merge.N.a.k(t);
            t.f(rVar);
        } else {
            lVar.L(rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J() {
        this.p.add(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l L(String str) {
        com.github.catvod.spider.merge.c0.l lVar = new com.github.catvod.spider.merge.c0.l(F.l(str, this.h), null, null);
        K(lVar);
        this.e.add(lVar);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(com.github.catvod.spider.merge.c0.l lVar) {
        return M(this.p, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(com.github.catvod.spider.merge.c0.l lVar) {
        return com.github.catvod.spider.merge.b0.b.b(lVar.d0(), B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P() {
        this.l = this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(com.github.catvod.spider.merge.c0.l lVar) {
        if (this.m) {
            return;
        }
        String a = lVar.a(cYh.d("0F222437"));
        if (a.length() != 0) {
            this.f = a;
            this.m = true;
            this.d.G(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        this.q = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(com.github.catvod.spider.merge.c0.l lVar) {
        return M(this.e, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A T() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l U() {
        return this.e.remove(this.e.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l V(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c0.l lVar = this.e.get(size);
            this.e.remove(size);
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int W(com.github.catvod.spider.merge.c0.l lVar) {
        for (int i = 0; i < this.p.size(); i++) {
            if (lVar == this.p.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X(O o, A a) {
        this.g = o;
        return a.d(o, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(com.github.catvod.spider.merge.c0.l lVar) {
        h(lVar);
        this.p.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(com.github.catvod.spider.merge.c0.l lVar, int i) {
        h(lVar);
        this.p.add(i, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a0() {
        com.github.catvod.spider.merge.c0.l lVar;
        if (this.p.size() > 0) {
            lVar = this.p.get(r0.size() - 1);
        } else {
            lVar = null;
        }
        if (lVar == null || S(lVar)) {
            return;
        }
        boolean z2 = true;
        int size = this.p.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            lVar = this.p.get(i);
            if (lVar == null || S(lVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i++;
                lVar = this.p.get(i);
            }
            com.github.catvod.spider.merge.N.a.k(lVar);
            com.github.catvod.spider.merge.c0.l L = L(lVar.d0());
            L.d().e(lVar.d());
            this.p.set(i, L);
            if (i == size) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.d0.i1
    protected final boolean b(String str) {
        return str.equals(cYh.d("14333338272E")) || str.equals(cYh.d("1424383D32"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(com.github.catvod.spider.merge.c0.l lVar) {
        int size = this.p.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.p.get(size) != lVar);
        this.p.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.d0.i1
    public final boolean c(O o) {
        this.g = o;
        return this.k.d(o, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(com.github.catvod.spider.merge.c0.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == lVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d0(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        ArrayList<com.github.catvod.spider.merge.c0.l> arrayList = this.p;
        int lastIndexOf = arrayList.lastIndexOf(lVar);
        com.github.catvod.spider.merge.N.a.f(lastIndexOf != -1);
        arrayList.set(lastIndexOf, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e0() {
        A a;
        boolean z2 = false;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c0.l lVar = this.e.get(size);
            if (size == 0) {
                lVar = null;
                z2 = true;
            }
            String d0 = lVar != null ? lVar.d0() : "";
            if (cYh.d("14352D34342E").equals(d0)) {
                a = A.r;
            } else if (cYh.d("1334").equals(d0) || (cYh.d("1338").equals(d0) && !z2)) {
                a = A.q;
            } else if (cYh.d("1322").equals(d0)) {
                a = A.p;
            } else if (cYh.d("13322E352E").equals(d0) || cYh.d("1338243033").equals(d0) || cYh.d("13362E3E23").equals(d0)) {
                a = A.o;
            } else if (cYh.d("043131253E3509").equals(d0)) {
                a = A.m;
            } else if (cYh.d("043F2D3625351220").equals(d0)) {
                a = A.n;
            } else if (cYh.d("1331233D32").equals(d0)) {
                a = A.k;
            } else {
                if (!cYh.d("0F352035").equals(d0) && !cYh.d("053F2528").equals(d0)) {
                    if (cYh.d("0122203C32290224").equals(d0)) {
                        a = A.u;
                    } else if (cYh.d("0F242C3D").equals(d0)) {
                        a = A.e;
                    } else if (!z2) {
                    }
                }
                a = A.i;
            }
            this.k = a;
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f0() {
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l g(com.github.catvod.spider.merge.c0.l lVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == lVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g0(boolean z2) {
        this.t = z2;
    }

    final void h(com.github.catvod.spider.merge.c0.l lVar) {
        int i = 0;
        for (int size = this.p.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c0.l lVar2 = this.p.get(size);
            if (lVar2 == null) {
                return;
            }
            if (lVar.d0().equals(lVar2.d0()) && lVar.d().equals(lVar2.d())) {
                i++;
            }
            if (i == 3) {
                this.p.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h0(com.github.catvod.spider.merge.c0.l lVar) {
        this.n = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        while (!this.p.isEmpty()) {
            int size = this.p.size();
            if ((size > 0 ? this.p.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A i0() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j0(A a) {
        this.k = a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        j(cYh.d("13322E352E"), cYh.d("13362E3E23"), cYh.d("1338243033"), cYh.d("13352C213B3B1335"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        j(cYh.d("1331233D32"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        j(cYh.d("1322"), cYh.d("13352C213B3B1335"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(A a) {
        if (this.a.a().a()) {
            this.a.a().add(new B(this.b.E(), cYh.d("323E2429273F04242435772E083B243F770142231C712032023E6138397A14242025327A3C75320C"), this.g.getClass().getSimpleName(), a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z2) {
        this.s = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        while (str != null && !a().d0().equals(str) && com.github.catvod.spider.merge.b0.b.b(a().d0(), A)) {
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l r(String str) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.c0.l lVar = this.p.get(size);
            if (lVar == null) {
                return null;
            }
            if (lVar.d0().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.o s() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l t(String str) {
        com.github.catvod.spider.merge.c0.l lVar;
        int size = this.e.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            lVar = this.e.get(size);
        } while (!lVar.d0().equals(str));
        return lVar;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("33222434152F0E3C2534252104253323323413042E3A32345A"));
        b.append(this.g);
        b.append(cYh.d("4B703225362E026D"));
        b.append(this.k);
        b.append(cYh.d("4B7022242528023E35143B3F0A352F256A"));
        b.append(a());
        b.append('}');
        return b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.github.catvod.spider.merge.c0.l u() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> v() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(String str) {
        return x(str, x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(String str, String[] strArr) {
        String[] strArr2 = v;
        String[] strArr3 = this.u;
        strArr3[0] = str;
        return A(strArr3, strArr2, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(String[] strArr) {
        return A(strArr, v, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String d0 = this.e.get(size).d0();
            if (d0.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.b0.b.b(d0, z)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.N.a.a(cYh.d("34382E243B3E473E2E2577380270333436390F31233D32"));
        throw null;
    }
}
