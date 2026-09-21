package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class k implements J, Serializable {
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected com.github.catvod.spider.merge.S.l<F, InterfaceC0003d> g;
    protected String h;
    protected int i = -1;
    protected int j;
    protected int k;

    public k(com.github.catvod.spider.merge.S.l<F, InterfaceC0003d> lVar, int i, int i2, int i3, int i4) {
        this.e = -1;
        this.g = lVar;
        this.c = i;
        this.f = i2;
        this.j = i3;
        this.k = i4;
        F f = lVar.c;
        if (f != null) {
            this.d = f.d();
            this.e = lVar.c.a();
        }
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final int a() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final F b() {
        return this.g.c;
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final String c() {
        int i;
        String str = this.h;
        if (str != null) {
            return str;
        }
        InterfaceC0003d interfaceC0003d = this.g.d;
        if (interfaceC0003d == null) {
            return null;
        }
        int size = interfaceC0003d.size();
        int i2 = this.j;
        return (i2 >= size || (i = this.k) >= size) ? cYh.d("5B150E1769") : interfaceC0003d.h(com.github.catvod.spider.merge.S.i.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final int d() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final int e() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.P.J
    public final void f(int i) {
        this.i = i;
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final int g() {
        return this.i;
    }

    @Override // com.github.catvod.spider.merge.P.D
    public final int getChannel() {
        return this.f;
    }

    public final String toString() {
        String str;
        if (this.f > 0) {
            StringBuilder b = C0059d.b(cYh.d("4B3329303934023C7C"));
            b.append(this.f);
            str = b.toString();
        } else {
            str = "";
        }
        String c = c();
        String replace = c != null ? c.replace(cYh.d("6D"), cYh.d("3B3E")).replace(cYh.d("6A"), cYh.d("3B22")).replace(cYh.d("6E"), cYh.d("3B24")) : cYh.d("5B3E2E71233F1F247F");
        String valueOf = String.valueOf(this.c);
        StringBuilder b2 = C0059d.b(cYh.d("3C10"));
        b2.append(this.i);
        String d = cYh.d("4B");
        b2.append(d);
        b2.append(this.j);
        String d2 = cYh.d("5D");
        b2.append(d2);
        b2.append(this.k);
        b2.append(cYh.d("5A77"));
        b2.append(replace);
        b2.append(cYh.d("407C7D"));
        b2.append(valueOf);
        b2.append(cYh.d("59"));
        b2.append(str);
        b2.append(d);
        b2.append(this.d);
        b2.append(d2);
        b2.append(this.e);
        b2.append(cYh.d("3A"));
        return b2.toString();
    }
}
