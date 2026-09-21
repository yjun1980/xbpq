package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.e0.C0119c;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.e0.M;
import com.github.catvod.spider.merge.g0.A;
import com.github.catvod.spider.merge.g0.B;
import com.github.catvod.spider.merge.g0.C;
import com.github.catvod.spider.merge.g0.C0145c;
import com.github.catvod.spider.merge.g0.C0146d;
import com.github.catvod.spider.merge.g0.C0147e;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.g0.j;
import com.github.catvod.spider.merge.g0.k;
import com.github.catvod.spider.merge.g0.l;
import com.github.catvod.spider.merge.g0.n;
import com.github.catvod.spider.merge.g0.o;
import com.github.catvod.spider.merge.g0.p;
import com.github.catvod.spider.merge.g0.q;
import com.github.catvod.spider.merge.g0.r;
import com.github.catvod.spider.merge.g0.s;
import com.github.catvod.spider.merge.g0.t;
import com.github.catvod.spider.merge.g0.u;
import com.github.catvod.spider.merge.g0.v;
import com.github.catvod.spider.merge.g0.w;
import com.github.catvod.spider.merge.g0.x;
import com.github.catvod.spider.merge.g0.y;
import com.github.catvod.spider.merge.g0.z;
import com.github.catvod.spider.merge.x.C0243a;
import com.github.catvod.spider.merge.x.C0244b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public final class f extends m implements E<e> {
    private Stack<d> a;
    private d b;

    public f(C0123g c0123g) {
        com.github.catvod.spider.merge.n0.c.d(f.class);
        this.a = new Stack<>();
        this.b = d.c(c0123g);
        Stack<d> stack = this.a;
        d c = d.c(c0123g);
        c.j(this.b);
        stack.push(c);
    }

    private d G() {
        return this.a.peek();
    }

    private void H(C0123g c0123g) {
        this.a.peek().i(c0123g);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e B(C0147e c0147e) {
        List l = c0147e.l(o.class);
        if (l.size() == 1) {
            return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
        }
        Double c = ((e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this)).c();
        String str = null;
        for (int i = 1; i < c0147e.d(); i++) {
            com.github.catvod.spider.merge.T.b b = c0147e.b(i);
            if (b instanceof o) {
                e eVar = (e) b.e(this);
                if (cYh.d("4C").equals(str)) {
                    c = Double.valueOf(eVar.c().doubleValue() + c.doubleValue());
                } else {
                    if (!cYh.d("4A").equals(str)) {
                        StringBuilder b2 = C0059d.b(cYh.d("14292F2536224735332338284B70"));
                        b2.append(c0147e.c());
                        throw new C0244b(b2.toString());
                    }
                    c = Double.valueOf(c.doubleValue() - eVar.c().doubleValue());
                }
            } else {
                str = b.c();
            }
        }
        return new e(c);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e C(j jVar) {
        return (e) ((v) jVar.k(v.class)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e D(q qVar) {
        com.github.catvod.spider.merge.T.b n;
        String c = qVar.c();
        String d = cYh.d("4D");
        if (d.equals(c)) {
            e eVar = new e(d);
            eVar.j();
            return eVar;
        }
        if (qVar.o() != null && !qVar.o().g()) {
            n = qVar.o();
        } else {
            if (qVar.n() == null || qVar.n().g()) {
                return null;
            }
            n = qVar.n();
        }
        return (e) n.e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e b(l lVar) {
        return (e) ((w) lVar.k(w.class)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e c(C0145c c0145c) {
        if (cYh.d("497E").equals(c0145c.c())) {
            HashSet hashSet = new HashSet();
            C0123g c0123g = new C0123g();
            Iterator<com.github.catvod.spider.merge.c0.l> it = G().a().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().f0());
            }
            c0123g.addAll(hashSet);
            return new e(c0123g);
        }
        return new e(G().a());
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e d(n nVar) {
        return (e) ((i) nVar.k(i.class)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e e(z zVar) {
        boolean z;
        e eVar;
        C0123g d;
        e eVar2;
        if (zVar.n() != null && !zVar.n().g()) {
            return (e) zVar.n().e(this);
        }
        boolean z2 = false;
        if (zVar.o() == null || zVar.o().g() || (eVar2 = (e) zVar.o().e(this)) == null) {
            z = false;
        } else {
            if (eVar2.n()) {
                H(eVar2.d());
            } else if (eVar2.k()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (zVar.p() != null && !zVar.p().g()) {
            e eVar3 = (e) zVar.p().e(this);
            if (z2) {
                C0123g a = G().a();
                String g = eVar3.g();
                if (G().f()) {
                    int size = a.size();
                    String d2 = cYh.d("3A");
                    String d3 = cYh.d("3C");
                    if (size == 1) {
                        C0123g j0 = G().k().j0(d3 + g + d2);
                        LinkedList linkedList = new LinkedList();
                        Iterator<com.github.catvod.spider.merge.c0.l> it = j0.iterator();
                        while (it.hasNext()) {
                            linkedList.add(it.next().c(g));
                        }
                        return new e(linkedList);
                    }
                    C0123g c0123g = new C0123g();
                    Iterator<com.github.catvod.spider.merge.c0.l> it2 = a.iterator();
                    while (it2.hasNext()) {
                        c0123g.addAll(it2.next().j0(d3 + g + d2));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<com.github.catvod.spider.merge.c0.l> it3 = c0123g.iterator();
                    while (it3.hasNext()) {
                        linkedList2.add(it3.next().c(g));
                    }
                    eVar = new e(linkedList2);
                } else if (a.size() == 1) {
                    eVar = new e(G().k().c(g));
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<com.github.catvod.spider.merge.c0.l> it4 = a.iterator();
                    while (it4.hasNext()) {
                        linkedList3.add(it4.next().c(g));
                    }
                    return new e(linkedList3);
                }
                return eVar;
            }
            if (eVar3.o()) {
                String g2 = eVar3.g();
                C0123g a2 = G().a();
                if (G().f()) {
                    d = a2.d(g2);
                } else {
                    C0123g c0123g2 = new C0123g();
                    Iterator<com.github.catvod.spider.merge.c0.l> it5 = G().a().iterator();
                    while (it5.hasNext()) {
                        com.github.catvod.spider.merge.c0.l next = it5.next();
                        String d4 = cYh.d("4D");
                        if (!z) {
                            Iterator<com.github.catvod.spider.merge.c0.l> it6 = next.R().iterator();
                            while (it6.hasNext()) {
                                com.github.catvod.spider.merge.c0.l next2 = it6.next();
                                if (next2.t().equals(g2) || d4.equals(g2)) {
                                    c0123g2.add(next2);
                                }
                            }
                        } else if (next.t().equals(g2) || d4.equals(g2)) {
                            c0123g2.add(next);
                        }
                    }
                    H(c0123g2);
                }
            } else {
                if (!eVar3.n()) {
                    return eVar3;
                }
                d = eVar3.d();
            }
            H(d);
        }
        if (zVar.q() != null && zVar.q().size() > 0) {
            Iterator<u> it7 = zVar.q().iterator();
            while (it7.hasNext()) {
                H(((e) it7.next().e(this)).d());
            }
        }
        eVar = new e(G().a());
        return eVar;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e f(B b) {
        e eVar;
        com.github.catvod.spider.merge.c0.l lVar;
        if (b.n() == null && !b.n().g()) {
            return (e) ((B) b.k(B.class)).e(this);
        }
        e eVar2 = (e) b.n().e(this);
        if (b.g != null) {
            this.a.push(d.d(G().e()));
            e eVar3 = (e) ((B) b.k(B.class)).e(this);
            this.a.pop();
            boolean n = eVar2.n();
            String d = cYh.d("31");
            if (!n) {
                if (eVar2.r()) {
                    if (eVar3.n()) {
                        lVar = new com.github.catvod.spider.merge.c0.l(d);
                        lVar.O(eVar2.g());
                        eVar3.d().add(lVar);
                        return eVar3;
                    }
                    eVar = new e(eVar2.g() + eVar3.g());
                    return eVar;
                }
                boolean l = eVar2.l();
                String d2 = cYh.d("4B26203D6567");
                String d3 = cYh.d("04312F71393513702C34253D027037303B6B5A");
                if (l) {
                    if (eVar3.l()) {
                        eVar = new e(Boolean.valueOf(eVar3.a().booleanValue() | eVar2.a().booleanValue()));
                    } else {
                        if (eVar3.n()) {
                            lVar = new com.github.catvod.spider.merge.c0.l(d);
                            lVar.O(eVar2.g());
                            eVar3.d().add(lVar);
                            return eVar3;
                        }
                        if (eVar3.r()) {
                            eVar = new e(eVar2.a() + eVar3.g());
                        } else {
                            StringBuilder b2 = C0059d.b(d3);
                            b2.append(eVar2.a());
                            b2.append(d2);
                            b2.append(eVar3.g());
                            throw new com.github.catvod.spider.merge.l0.c(b2.toString());
                        }
                    }
                    return eVar;
                }
                if (!eVar2.q()) {
                    LinkedList linkedList = new LinkedList();
                    if (h.d(eVar2.g())) {
                        linkedList.add(eVar2.g());
                    }
                    if (h.d(eVar3.g())) {
                        linkedList.add(eVar3.g());
                    }
                    eVar = new e(h.e(linkedList, cYh.d("4B")));
                } else if (eVar3.r()) {
                    eVar = new e(eVar2.c() + eVar3.g());
                } else {
                    if (eVar3.n()) {
                        lVar = new com.github.catvod.spider.merge.c0.l(d);
                        lVar.O(eVar2.g());
                        eVar3.d().add(lVar);
                        return eVar3;
                    }
                    StringBuilder b3 = C0059d.b(d3);
                    b3.append(eVar2.c());
                    b3.append(d2);
                    b3.append(eVar3.g());
                    throw new com.github.catvod.spider.merge.l0.c(b3.toString());
                }
                return eVar;
            }
            if (eVar3.n()) {
                eVar2.d().addAll(eVar3.d());
            } else {
                com.github.catvod.spider.merge.c0.l lVar2 = new com.github.catvod.spider.merge.c0.l(d);
                lVar2.O(eVar3.g());
                eVar2.d().add(lVar2);
            }
        }
        return eVar2;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e g(i iVar) {
        return (e) ((s) iVar.k(s.class)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e h(A a) {
        e eVar = (e) ((B) a.k(B.class)).e(this);
        return a.g == null ? eVar : new e(Double.valueOf(-eVar.c().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e i(v vVar) {
        e eVar;
        com.github.catvod.spider.merge.T.b o;
        if (vVar.n() != null && !vVar.n().g()) {
            o = vVar.n();
        } else {
            if (vVar.o() == null || vVar.o().g()) {
                if (vVar.m(39) != null) {
                    eVar = new e(vVar.m(39).c());
                    eVar.j();
                } else if (vVar.m(6) != null) {
                    String c = vVar.m(6).c();
                    eVar = new e(c == null ? null : Double.valueOf(c));
                } else {
                    StringBuilder b = C0059d.b(cYh.d("093F3571242F17202E23237A1131333836380B351334313F15352F323260"));
                    b.append(vVar.c());
                    throw new C0244b(b.toString());
                }
                return eVar;
            }
            o = vVar.o();
        }
        return (e) o.e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e j(p pVar) {
        e eVar;
        if (pVar.m(7) != null) {
            eVar = new e(pVar.m(7).c());
        } else {
            eVar = new e(pVar.m(41).c());
        }
        eVar.j();
        return eVar;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e k(com.github.catvod.spider.merge.g0.h hVar) {
        e eVar;
        List l = hVar.l(x.class);
        boolean z = true;
        if (l.size() == 1) {
            return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
        }
        if (l.size() == 2) {
            e eVar2 = (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
            e eVar3 = (e) ((com.github.catvod.spider.merge.T.b) l.get(1)).e(this);
            if (cYh.d("5A").equals(hVar.g.c())) {
                if (eVar2.s().equals(eVar3.s())) {
                    if (eVar2 != eVar3 && !eVar2.equals(eVar3)) {
                        z = false;
                    }
                    eVar = new e(Boolean.valueOf(z));
                } else {
                    String g = eVar2.g();
                    String g2 = eVar3.g();
                    if (g != g2 && (g == null || !g.equals(g2))) {
                        z = false;
                    }
                    eVar = new e(Boolean.valueOf(z));
                }
            } else if (eVar2.s().equals(eVar3.s())) {
                eVar = new e(Boolean.valueOf(!(eVar2 == eVar3 || eVar2.equals(eVar3))));
            } else {
                String g3 = eVar2.g();
                String g4 = eVar3.g();
                if (g3 == g4 || (g3 != null && g3.equals(g4))) {
                    r3 = true;
                }
                eVar = new e(Boolean.valueOf(!r3));
            }
            return eVar;
        }
        StringBuilder b = C0059d.b(cYh.d("0222333E257A022134303B33132904292728473E24302560"));
        b.append(hVar.c());
        throw new C0244b(b.toString());
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e l(x xVar) {
        e eVar;
        List l = xVar.l(C0147e.class);
        if (l.size() == 1) {
            return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
        }
        if (l.size() == 2) {
            e eVar2 = (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
            e eVar3 = (e) ((com.github.catvod.spider.merge.T.b) l.get(1)).e(this);
            switch (xVar.g.e()) {
                case 24:
                    eVar = new e(Boolean.valueOf(eVar2.compareTo(eVar3) < 0));
                    break;
                case 25:
                    eVar = new e(Boolean.valueOf(eVar2.compareTo(eVar3) > 0));
                    break;
                case 26:
                    eVar = new e(Boolean.valueOf(eVar2.compareTo(eVar3) <= 0));
                    break;
                case 27:
                    eVar = new e(Boolean.valueOf(eVar2.compareTo(eVar3) >= 0));
                    break;
                case 28:
                case 29:
                default:
                    StringBuilder b = C0059d.b(cYh.d("123E2A3F382D09702E21322806242E23"));
                    b.append(xVar.g.c());
                    throw new C0244b(b.toString());
                case 30:
                    eVar = new e(Boolean.valueOf(eVar2.g().startsWith(eVar3.g())));
                    break;
                case 31:
                    eVar = new e(Boolean.valueOf(eVar2.g().endsWith(eVar3.g())));
                    break;
                case 32:
                    eVar = new e(Boolean.valueOf(eVar2.g().contains(eVar3.g())));
                    break;
                case 33:
                    eVar = new e(Boolean.valueOf(eVar2.g().matches(eVar3.g())));
                    break;
                case 34:
                    eVar = new e(Boolean.valueOf(!eVar2.g().matches(eVar3.g())));
                    break;
            }
            return eVar;
        }
        StringBuilder b2 = C0059d.b(cYh.d("0222333E257A022134303B33132904292728473E24302560"));
        b2.append(xVar.c());
        throw new C0244b(b2.toString());
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e m(u uVar) {
        long j;
        C0123g c0123g = new C0123g();
        Iterator<com.github.catvod.spider.merge.c0.l> it = G().a().iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            Stack<d> stack = this.a;
            d b = d.b(next);
            b.j(G());
            stack.push(b);
            e eVar = (e) ((i) uVar.k(i.class)).e(this);
            this.a.pop();
            if (eVar.q()) {
                long longValue = eVar.f().longValue();
                String d = cYh.d("221C1E021617220F151010052E1E05140F052C1518");
                String d2 = cYh.d("2D081E05120233");
                if (longValue < 0) {
                    String n0 = next.n0();
                    if (n0 == d2 || (n0 != null && n0.equals(d2))) {
                        longValue = (h.b(next.c(d)) ? -1 : Integer.parseInt(r11)) + longValue + 1;
                        j = 0;
                    } else {
                        d G = G();
                        C0123g c0123g2 = new C0123g();
                        com.github.catvod.spider.merge.c0.l f0 = next.f0();
                        String n02 = next.n0();
                        f0.getClass();
                        com.github.catvod.spider.merge.N.a.i(n02);
                        Iterator<com.github.catvod.spider.merge.c0.l> it2 = C0119c.a(new M(C0243a.d(n02)), f0).iterator();
                        while (it2.hasNext()) {
                            com.github.catvod.spider.merge.c0.l next2 = it2.next();
                            if (G.a().contains(next2)) {
                                c0123g2.add(next2);
                            }
                        }
                        longValue = c0123g2.size() + longValue + 1;
                        j = 0;
                    }
                    if (longValue < j) {
                        longValue = 1;
                    }
                }
                String n03 = next.n0();
                if (n03 == d2 || (n03 != null && n03.equals(d2))) {
                    if (longValue == (h.b(next.c(d)) ? -1 : Integer.parseInt(r4))) {
                        c0123g.add(next);
                    }
                } else if (longValue == com.github.catvod.spider.merge.j.l.c(next, G())) {
                    c0123g.add(next);
                }
            } else if (eVar.l()) {
                if (eVar.a().booleanValue()) {
                    c0123g.add(next);
                }
            } else if (eVar.r()) {
                if (h.d(eVar.g())) {
                    c0123g.add(next);
                }
            } else if (eVar.n()) {
                if (eVar.d().size() > 0) {
                    c0123g.add(next);
                }
            } else {
                if (!eVar.p()) {
                    throw new C0244b(cYh.d("123E2A3F382D0970242927284726203D6D") + eVar);
                }
                if (eVar.e().size() > 0) {
                    c0123g.add(next);
                }
            }
        }
        return new e(c0123g);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e n(r rVar) {
        if (((q) rVar.k(q.class)) != null) {
            return (e) ((q) rVar.k(q.class)).e(this);
        }
        if (rVar.m(5) != null) {
            return com.github.catvod.spider.merge.m0.a.b(rVar.m(5).c()).b(G());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e o(com.github.catvod.spider.merge.g0.m mVar) {
        return (e) ((mVar.n() == null || mVar.n().g()) ? (C0146d) mVar.k(C0146d.class) : mVar.n()).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e p(s sVar) {
        List l = sVar.l(com.github.catvod.spider.merge.g0.f.class);
        if (l.size() > 1) {
            Boolean a = ((e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this)).a();
            for (int i = 1; i < l.size(); i++) {
                a = Boolean.valueOf(a.booleanValue() | ((e) ((com.github.catvod.spider.merge.T.b) l.get(i)).e(this)).a().booleanValue());
            }
            return new e(a);
        }
        return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e r(y yVar) {
        e eVar = null;
        for (int i = 0; i < yVar.d(); i++) {
            com.github.catvod.spider.merge.T.b b = yVar.b(i);
            if (b instanceof z) {
                eVar = (e) b.e(this);
                if (eVar.n()) {
                    H(eVar.d());
                }
            } else {
                if (cYh.d("487F").equals(b.c())) {
                    G().h();
                } else {
                    G().g();
                }
            }
        }
        return eVar;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e s(w wVar) {
        List l = wVar.l(p.class);
        if (l == null) {
            return null;
        }
        if (l.size() > 1) {
            LinkedList linkedList = new LinkedList();
            Iterator it = l.iterator();
            while (it.hasNext()) {
                e eVar = (e) ((p) it.next()).e(this);
                if (eVar != null) {
                    linkedList.add(eVar.g());
                }
            }
            return new e(h.e(linkedList, cYh.d("5D")));
        }
        return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e t(t tVar) {
        com.github.catvod.spider.merge.T.b bVar;
        if (tVar.n() == null || tVar.n().g()) {
            D d = tVar.g;
            if (d == null) {
                bVar = (j) tVar.k(j.class);
            } else {
                if (cYh.d("487F").equals(d.c())) {
                    G().h();
                }
                bVar = (y) tVar.k(y.class);
            }
        } else {
            bVar = tVar.n();
        }
        return (e) bVar.e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e u(k kVar) {
        LinkedList linkedList = new LinkedList();
        e eVar = (e) ((l) kVar.k(l.class)).e(this);
        for (i iVar : kVar.l(i.class)) {
            this.a.push(d.d(G()));
            linkedList.add(iVar.e(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.m0.a.a(eVar.g()).b(G(), linkedList);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e v(g gVar) {
        if (gVar.m(7) != null) {
            return com.github.catvod.spider.merge.m0.a.c(gVar.m(7).c()).b(G().a());
        }
        if (!cYh.d("27").equals(gVar.c())) {
            return null;
        }
        e eVar = new e(null);
        eVar.h();
        return eVar;
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e w(o oVar) {
        if (oVar.n() != null && !oVar.n().g()) {
            e eVar = (e) ((A) oVar.k(A.class)).e(this);
            e eVar2 = (e) oVar.n().e(this);
            switch (oVar.g.e()) {
                case 17:
                    return new e(Double.valueOf(eVar2.c().doubleValue() * eVar.c().doubleValue()));
                case 18:
                    return new e(Double.valueOf(eVar.c().doubleValue() / eVar2.c().doubleValue()));
                case 19:
                    return new e(Double.valueOf(eVar.c().doubleValue() % eVar2.c().doubleValue()));
                default:
                    StringBuilder b = C0059d.b(cYh.d("14292F2536224735332338284B70"));
                    b.append(oVar.c());
                    throw new C0244b(b.toString());
            }
        }
        return (e) ((A) oVar.k(A.class)).e(this);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e x(C0146d c0146d) {
        String c = c0146d.g.c();
        String d = cYh.d("487F");
        if (c == d || (c != null && c.equals(d))) {
            G().h();
        }
        return (e) ((y) c0146d.k(y.class)).e(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.github.catvod.spider.merge.h0.e] */
    @Override // com.github.catvod.spider.merge.g0.E
    public final e y(C c) {
        return A(c);
    }

    @Override // com.github.catvod.spider.merge.g0.E
    public final e z(com.github.catvod.spider.merge.g0.f fVar) {
        List l = fVar.l(com.github.catvod.spider.merge.g0.h.class);
        if (l.size() > 1) {
            Boolean a = ((e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this)).a();
            for (int i = 1; i < l.size(); i++) {
                a = Boolean.valueOf(a.booleanValue() & ((e) ((com.github.catvod.spider.merge.T.b) l.get(i)).e(this)).a().booleanValue());
            }
            return new e(a);
        }
        return (e) ((com.github.catvod.spider.merge.T.b) l.get(0)).e(this);
    }
}
