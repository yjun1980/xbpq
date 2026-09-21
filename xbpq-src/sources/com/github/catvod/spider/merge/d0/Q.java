package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Q {
    private static final char[] r;
    static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final C0060a a;
    private final C b;
    private O d;
    N i;
    private String o;
    private h1 c = h1.c;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    M j = new M();
    L k = new L();
    H l = new H();
    J m = new J();
    I n = new I();
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(C0060a c0060a, C c) {
        this.a = c0060a;
        this.b = c;
    }

    private void c(String str) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), cYh.d("2E3E37303B3303702239362806333534257A15352734253F0933246B777F14"), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(h1 h1Var) {
        this.a.a();
        this.c = h1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] d(Character ch, boolean z) {
        int i;
        if (this.a.t()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.s()) || this.a.A(r)) {
            return null;
        }
        int[] iArr = this.p;
        this.a.v();
        boolean w = this.a.w(cYh.d("44"));
        String d = cYh.d("0A3932223E34007032343A33043F2D3E39");
        String d2 = cYh.d("5C");
        if (w) {
            boolean x = this.a.x(cYh.d("3F"));
            C0060a c0060a = this.a;
            String i2 = x ? c0060a.i() : c0060a.h();
            if (i2.length() != 0) {
                this.a.H();
                if (!this.a.w(d2)) {
                    c(d);
                }
                try {
                    i = Integer.valueOf(i2, x ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                    c(cYh.d("04382023363913353371382F13232835327A0836612736360E34612336340035"));
                    iArr[0] = 65533;
                } else {
                    if (i >= 128) {
                        int[] iArr2 = s;
                        if (i < 160) {
                            c(cYh.d("043820233639133533713E29473E2E25773B4726203D3E3E47252F38343503356132383E0270313E3E3413"));
                            i = iArr2[i - 128];
                        }
                    }
                    iArr[0] = i;
                }
                return iArr;
            }
            c(cYh.d("09252C34253304703334313F15352F32327A10393539773408702F243A3F15312D22"));
        } else {
            String k = this.a.k();
            boolean y = this.a.y(';');
            if (!(com.github.catvod.spider.merge.c0.n.e(k) || (com.github.catvod.spider.merge.c0.n.f(k) && y))) {
                this.a.F();
                if (y) {
                    c(cYh.d("0E3E37303B3303702F303A3F03703334313F15352F3232"));
                }
                return null;
            }
            if (!z || (!this.a.C() && !this.a.B() && !this.a.z('=', '-', '_'))) {
                this.a.H();
                if (!this.a.w(d2)) {
                    c(d);
                }
                int c = com.github.catvod.spider.merge.c0.n.c(k, this.q);
                if (c == 1) {
                    iArr[0] = this.q[0];
                    return iArr;
                }
                if (c == 2) {
                    return this.q;
                }
                com.github.catvod.spider.merge.N.a.a(cYh.d("323E2429273F0424243577390F313330342E02223271253F1325333F323E47362E2377") + k);
                throw null;
            }
        }
        this.a.F();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.n.g();
        this.n.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.m.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final N g(boolean z) {
        N n;
        if (z) {
            n = this.j;
            n.g();
        } else {
            n = this.k;
            n.g();
        }
        this.i = n;
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        O.h(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(O o) {
        com.github.catvod.spider.merge.N.a.e(this.e);
        this.d = o;
        this.e = true;
        int i = o.a;
        if (i == 2) {
            this.o = ((M) o).b;
        } else if (i == 3 && ((L) o).r()) {
            r(cYh.d("262435233E3812242422773309332E23253F04242D28772A15353234392E473F2F7132340370353030"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append((CharSequence) sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        j(this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        j(this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.i.q();
        j(this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(h1 h1Var) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), cYh.d("323E2429273F042424353B2347222430343202346134393E473F277131330B356179121521796138397A0E3E3124237A14242025327A3C75320C"), h1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(h1 h1Var) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), cYh.d("323E2429273F0424243577390F313330342E0222617672294070283F773309203425772913313534770142231C"), Character.valueOf(this.a.s()), h1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(String str) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        return this.o != null && this.i.t().equalsIgnoreCase(this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final O t() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            this.f = null;
            H h = this.l;
            h.i(sb2);
            return h;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        H h2 = this.l;
        h2.i(str);
        this.f = null;
        return h2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(h1 h1Var) {
        this.c = h1Var;
    }
}
