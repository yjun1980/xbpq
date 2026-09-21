package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.e0.C0119c;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.e0.C0124h;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.P;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class l extends r {
    private static final List<l> j = Collections.emptyList();
    private static final String k;
    private F f;
    private WeakReference<List<l>> g;
    List<r> h;
    private c i;

    static {
        Pattern.compile(cYh.d("3B236A"));
        k = cYh.d("48322022320F1539");
    }

    public l(F f, String str, c cVar) {
        com.github.catvod.spider.merge.N.a.k(f);
        this.h = r.e;
        this.i = cVar;
        this.f = f;
        if (str != null) {
            l(str);
        }
    }

    private static void K(l lVar, C0123g c0123g) {
        l lVar2 = (l) lVar.c;
        if (lVar2 == null || lVar2.n0().equals(cYh.d("44222E3E23"))) {
            return;
        }
        c0123g.add(lVar2);
        K(lVar2, c0123g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(StringBuilder sb, u uVar) {
        String I = uVar.I();
        if (!h0(uVar.c) && !(uVar instanceof d)) {
            boolean M = u.M(sb);
            int i = com.github.catvod.spider.merge.b0.b.d;
            int length = I.length();
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            while (i2 < length) {
                int codePointAt = I.codePointAt(i2);
                if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                    if (!(codePointAt == 8203 || codePointAt == 173)) {
                        sb.appendCodePoint(codePointAt);
                        z = true;
                        z2 = false;
                    }
                } else if ((!M || z) && !z2) {
                    sb.append(' ');
                    z2 = true;
                }
                i2 += Character.charCount(codePointAt);
            }
            return;
        }
        sb.append(I);
    }

    private static <E extends l> int Z(l lVar, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == lVar) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h0(r rVar) {
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            int i = 0;
            while (!lVar.f.j()) {
                lVar = (l) lVar.c;
                i++;
                if (i < 6 && lVar != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.c0.r] */
    @Override // com.github.catvod.spider.merge.c0.r
    public final r F() {
        l lVar = this;
        while (true) {
            ?? r1 = lVar.c;
            if (r1 == 0) {
                return lVar;
            }
            lVar = r1;
        }
    }

    public final l L(r rVar) {
        com.github.catvod.spider.merge.N.a.k(rVar);
        r rVar2 = rVar.c;
        if (rVar2 != null) {
            rVar2.D(rVar);
        }
        rVar.c = this;
        n();
        this.h.add(rVar);
        rVar.d = this.h.size() - 1;
        return this;
    }

    public final l M(String str) {
        s.a(this).getClass();
        l lVar = new l(F.l(str, D.c), e(), null);
        L(lVar);
        return lVar;
    }

    public final l O(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        L(new u(str));
        return this;
    }

    public final l P() {
        return Q().get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<l> Q() {
        List<l> list;
        if (h() == 0) {
            return j;
        }
        WeakReference<List<l>> weakReference = this.g;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.h.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            r rVar = this.h.get(i);
            if (rVar instanceof l) {
                arrayList.add((l) rVar);
            }
        }
        this.g = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final C0123g R() {
        return new C0123g(Q());
    }

    @Override // com.github.catvod.spider.merge.c0.r
    /* renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l j() {
        return (l) super.j();
    }

    public final String T() {
        String I;
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        for (r rVar : this.h) {
            if (rVar instanceof f) {
                I = ((f) rVar).I();
            } else if (rVar instanceof e) {
                I = ((e) rVar).I();
            } else if (rVar instanceof l) {
                I = ((l) rVar).T();
            } else if (rVar instanceof d) {
                I = ((d) rVar).I();
            }
            a.append(I);
        }
        return com.github.catvod.spider.merge.b0.b.g(a);
    }

    public final int U() {
        r rVar = this.c;
        if (((l) rVar) == null) {
            return 0;
        }
        return Z(this, ((l) rVar).Q());
    }

    public final C0123g V() {
        return C0119c.a(new C0124h(), this);
    }

    public final boolean W(String str) {
        c cVar = this.i;
        if (cVar == null) {
            return false;
        }
        String k2 = cVar.k(cYh.d("043C202224"));
        int length = k2.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(k2);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(k2.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && k2.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return k2.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public final String X() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).v(a);
        }
        String g = com.github.catvod.spider.merge.b0.b.g(a);
        h y = y();
        if (y == null) {
            y = new h();
        }
        return y.s0().f() ? g.trim() : g;
    }

    public final String Y() {
        c cVar = this.i;
        return cVar != null ? cVar.k(cYh.d("0E34")) : "";
    }

    public final boolean a0() {
        return this.f.c();
    }

    public final l b0() {
        r rVar = this.c;
        if (rVar == null) {
            return null;
        }
        List<l> Q = ((l) rVar).Q();
        int Z = Z(this, Q) + 1;
        if (Q.size() > Z) {
            return Q.get(Z);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0() {
        this.g = null;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final c d() {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public final String d0() {
        return this.f.i();
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final String e() {
        String str = k;
        for (l lVar = this; lVar != null; lVar = (l) lVar.c) {
            c cVar = lVar.i;
            if (cVar != null) {
                if (cVar.o(str) != -1) {
                    return lVar.i.j(str);
                }
            }
        }
        return "";
    }

    public final String e0() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        for (r rVar : this.h) {
            if (rVar instanceof u) {
                N(a, (u) rVar);
            } else if ((rVar instanceof l) && ((l) rVar).f.b().equals(cYh.d("0522")) && !u.M(a)) {
                a.append(cYh.d("47"));
            }
        }
        return com.github.catvod.spider.merge.b0.b.g(a).trim();
    }

    public final l f0() {
        return (l) this.c;
    }

    public final C0123g g0() {
        C0123g c0123g = new C0123g();
        K(this, c0123g);
        return c0123g;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final int h() {
        return this.h.size();
    }

    public final l i0() {
        List<l> Q;
        int Z;
        r rVar = this.c;
        if (rVar != null && (Z = Z(this, (Q = ((l) rVar).Q()))) > 0) {
            return Q.get(Z - 1);
        }
        return null;
    }

    public final C0123g j0(String str) {
        com.github.catvod.spider.merge.N.a.i(str);
        N h = P.h(str);
        com.github.catvod.spider.merge.N.a.k(h);
        return C0119c.a(h, this);
    }

    @Override // com.github.catvod.spider.merge.c0.r
    protected final r k(r rVar) {
        l lVar = (l) super.k(rVar);
        c cVar = this.i;
        lVar.i = cVar != null ? cVar.clone() : null;
        k kVar = new k(lVar, this.h.size());
        lVar.h = kVar;
        kVar.addAll(this.h);
        return lVar;
    }

    public final l k0(String str) {
        com.github.catvod.spider.merge.N.a.i(str);
        return C0119c.b(P.h(str), this);
    }

    @Override // com.github.catvod.spider.merge.c0.r
    protected final void l(String str) {
        d().t(k, str);
    }

    public final C0123g l0() {
        r rVar = this.c;
        if (rVar == null) {
            return new C0123g(0);
        }
        List<l> Q = ((l) rVar).Q();
        C0123g c0123g = new C0123g(Q.size() - 1);
        for (l lVar : Q) {
            if (lVar != this) {
                c0123g.add(lVar);
            }
        }
        return c0123g;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final r m() {
        this.h.clear();
        return this;
    }

    public final F m0() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    protected final List<r> n() {
        if (this.h == r.e) {
            this.h = new k(this, 4);
        }
        return this.h;
    }

    public final String n0() {
        return this.f.b();
    }

    public l o0(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        this.h.clear();
        h y = y();
        L((y == null || !y.u0().b(d0())) ? new u(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    protected final boolean p() {
        return this.i != null;
    }

    public final String p0() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        com.github.catvod.spider.merge.W.a.c(new j(a), this);
        return com.github.catvod.spider.merge.b0.b.g(a).trim();
    }

    public final List<u> q0() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.h) {
            if (rVar instanceof u) {
                arrayList.add((u) rVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public String t() {
        return this.f.b();
    }

    @Override // com.github.catvod.spider.merge.c0.r
    void w(Appendable appendable, int i, g gVar) {
        l lVar;
        l lVar2;
        if (gVar.f()) {
            boolean z = false;
            if (this.f.a() || ((lVar2 = (l) this.c) != null && lVar2.f.a())) {
                if (this.f.f() && !this.f.d() && ((lVar = (l) this.c) == null || lVar.a0())) {
                    r rVar = this.c;
                    r rVar2 = null;
                    if (rVar != null && this.d > 0) {
                        rVar2 = rVar.n().get(this.d - 1);
                    }
                    if (rVar2 != null) {
                        z = true;
                    }
                }
                if (!z && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
                    r(appendable, i, gVar);
                }
            }
        }
        appendable.append('<').append(n0());
        c cVar = this.i;
        if (cVar != null) {
            cVar.n(appendable, gVar);
        }
        if (this.h.isEmpty() && this.f.h() && (gVar.g() != 1 || !this.f.d())) {
            appendable.append(cYh.d("477F7F"));
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.merge.c0.r
    void x(Appendable appendable, int i, g gVar) {
        if (this.h.isEmpty() && this.f.h()) {
            return;
        }
        if (gVar.f() && !this.h.isEmpty() && this.f.a()) {
            r(appendable, i, gVar);
        }
        appendable.append(cYh.d("5B7F")).append(n0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final r z() {
        return (l) this.c;
    }

    public l(String str) {
        this(F.l(str, D.d), "", null);
    }
}
