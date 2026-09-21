/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.E;
import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.l;
import com.github.catvod.spider.merge.P.t;
import com.github.catvod.spider.merge.P.y;
import com.github.catvod.spider.merge.S.h;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.cYh;

public abstract class s
extends B<Integer, com.github.catvod.spider.merge.Q.B>
implements F {
    public d d;
    protected com.github.catvod.spider.merge.S.l<F, d> e;
    protected E<?> f = com.github.catvod.spider.merge.P.l.a;
    public D g;
    public int h = -1;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public final h n = new h();
    public int o = 0;

    public s(d d2) {
        this.d = d2;
        this.e = new com.github.catvod.spider.merge.S.l<s, d>(this, d2);
    }

    @Override
    public final int a() {
        return ((com.github.catvod.spider.merge.Q.B)this.b).g();
    }

    @Override
    public final d b() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final D c() {
        Object object = this.d;
        if (object == null) {
            object = new IllegalStateException(cYh.d("0935392503350C352F71253F1625282332294731613F38344A3E343D3B7A0E3E3124237A14243334363749"));
            throw object;
        }
        object.g();
        try {
            block13: {
                int n2;
                block5: while (true) {
                    if (this.k) {
                        this.l();
                        break block13;
                    }
                    this.g = null;
                    this.l = 0;
                    this.h = this.d.i();
                    this.j = ((com.github.catvod.spider.merge.Q.B)this.b).g();
                    this.i = ((com.github.catvod.spider.merge.Q.B)this.b).h();
                    do {
                        this.m = 0;
                        try {
                            n2 = ((com.github.catvod.spider.merge.Q.B)this.b).i(this.d, this.o);
                        }
                        catch (t t2) {
                            this.m(t2);
                            if (this.d.f(1) != -1) {
                                ((com.github.catvod.spider.merge.Q.B)this.b).e(this.d);
                            }
                            n2 = -3;
                        }
                        if (this.d.f(1) == -1) {
                            this.k = true;
                        }
                        if (this.m == 0) {
                            this.m = n2;
                        }
                        if ((n2 = this.m) == -3) continue block5;
                    } while (n2 == -2);
                    break;
                }
                if (this.g == null) {
                    this.g = ((l)this.f).a(this.e, n2, null, this.l, this.h, this.d.i() - 1, this.i, this.j);
                }
            }
            object = this.g;
            return object;
        }
        finally {
            this.d.a();
        }
    }

    @Override
    public final int d() {
        return ((com.github.catvod.spider.merge.Q.B)this.b).h();
    }

    public final E<? extends D> e() {
        return this.f;
    }

    public final D l() {
        D d2;
        int n2 = ((com.github.catvod.spider.merge.Q.B)this.b).g();
        int n3 = ((com.github.catvod.spider.merge.Q.B)this.b).h();
        this.g = d2 = ((l)this.f).a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, n3, n2);
        return d2;
    }

    public final void m(t t2) {
        Object object = this.d;
        object = object.h(com.github.catvod.spider.merge.S.i.b(this.h, object.i()));
        CharSequence charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("133F2A34397A1535223E30340E24283E397A0222333E257A06247B7170"));
        StringBuilder stringBuilder = new StringBuilder();
        for (char c2 : ((String)object).toCharArray()) {
            object = String.valueOf(c2);
            if (c2 != '\uffffffff') {
                if (c2 != '\r') {
                    if (c2 != '\t') {
                        if (c2 == '\n') {
                            object = cYh.d("3B3E");
                        }
                    } else {
                        object = cYh.d("3B24");
                    }
                } else {
                    object = cYh.d("3B22");
                }
            } else {
                object = cYh.d("5B150E1769");
            }
            stringBuilder.append((String)object);
        }
        charSequence.append(stringBuilder.toString());
        charSequence.append(cYh.d("40"));
        charSequence = charSequence.toString();
        object = this.g();
        int n2 = this.i;
        int n3 = this.j;
        ((y)object).a(this, null, n2, n3, (String)charSequence, t2);
    }
}

