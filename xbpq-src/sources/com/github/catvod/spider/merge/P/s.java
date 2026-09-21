package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public abstract class s extends B<Integer, com.github.catvod.spider.merge.Q.B> implements F {
    public InterfaceC0003d d;
    protected com.github.catvod.spider.merge.S.l<F, InterfaceC0003d> e;
    public D g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected E<?> f = l.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.S.h n = new com.github.catvod.spider.merge.S.h();
    public int o = 0;

    public s(InterfaceC0003d interfaceC0003d) {
        this.d = interfaceC0003d;
        this.e = new com.github.catvod.spider.merge.S.l<>(this, interfaceC0003d);
    }

    @Override // com.github.catvod.spider.merge.P.F
    public final int a() {
        return ((com.github.catvod.spider.merge.Q.B) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.P.F
    public final InterfaceC0003d b() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.github.catvod.spider.merge.P.E<?>, com.github.catvod.spider.merge.P.l] */
    @Override // com.github.catvod.spider.merge.P.F
    public final D c() {
        int i;
        int i2;
        InterfaceC0003d interfaceC0003d = this.d;
        if (interfaceC0003d == null) {
            throw new IllegalStateException(cYh.d("0935392503350C352F71253F1625282332294731613F38344A3E343D3B7A0E3E3124237A14243334363749"));
        }
        interfaceC0003d.g();
        while (true) {
            try {
                if (this.k) {
                    l();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.i();
                this.j = ((com.github.catvod.spider.merge.Q.B) this.b).g();
                this.i = ((com.github.catvod.spider.merge.Q.B) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((com.github.catvod.spider.merge.Q.B) this.b).i(this.d, this.o);
                    } catch (t e) {
                        m(e);
                        if (this.d.f(1) != -1) {
                            ((com.github.catvod.spider.merge.Q.B) this.b).e(this.d);
                        }
                        i = -3;
                    }
                    if (this.d.f(1) == -1) {
                        this.k = true;
                    }
                    if (this.m == 0) {
                        this.m = i;
                    }
                    i2 = this.m;
                    if (i2 == -3) {
                        break;
                    }
                } while (i2 == -2);
                if (this.g == null) {
                    this.g = this.f.a(this.e, i2, null, this.l, this.h, this.d.i() - 1, this.i, this.j);
                }
            } finally {
                this.d.a();
            }
        }
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.P.F
    public final int d() {
        return ((com.github.catvod.spider.merge.Q.B) this.b).h();
    }

    @Override // com.github.catvod.spider.merge.P.F
    public final E<? extends D> e() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.P.E<?>, com.github.catvod.spider.merge.P.l] */
    public final D l() {
        D a = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, ((com.github.catvod.spider.merge.Q.B) this.b).h(), ((com.github.catvod.spider.merge.Q.B) this.b).g());
        this.g = a;
        return a;
    }

    public final void m(t tVar) {
        InterfaceC0003d interfaceC0003d = this.d;
        String h = interfaceC0003d.h(com.github.catvod.spider.merge.S.i.b(this.h, interfaceC0003d.i()));
        StringBuilder b = C0059d.b(cYh.d("133F2A34397A1535223E30340E24283E397A0222333E257A06247B7170"));
        StringBuilder sb = new StringBuilder();
        for (char c : h.toCharArray()) {
            String valueOf = String.valueOf(c);
            if (c == 65535) {
                valueOf = cYh.d("5B150E1769");
            } else if (c == '\r') {
                valueOf = cYh.d("3B22");
            } else if (c == '\t') {
                valueOf = cYh.d("3B24");
            } else if (c == '\n') {
                valueOf = cYh.d("3B3E");
            }
            sb.append(valueOf);
        }
        b.append(sb.toString());
        b.append(cYh.d("40"));
        ((y) g()).a(this, null, this.i, this.j, b.toString(), tVar);
    }
}
