/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.E
 *  com.github.catvod.spider.merge.gu.F
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Mm.h;
import com.github.catvod.spider.merge.Mm.i;
import com.github.catvod.spider.merge.gu.B;
import com.github.catvod.spider.merge.gu.D;
import com.github.catvod.spider.merge.gu.E;
import com.github.catvod.spider.merge.gu.F;
import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.l;
import com.github.catvod.spider.merge.gu.t;
import com.github.catvod.spider.merge.gu.y;

public abstract class s
extends B<Integer, com.github.catvod.spider.merge.Nx.B>
implements F {
    public d d;
    protected com.github.catvod.spider.merge.Mm.l<F, d> e;
    protected E<?> f = com.github.catvod.spider.merge.gu.l.a;
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
        this.e = new com.github.catvod.spider.merge.Mm.l<s, d>(this, d2);
    }

    public final int a() {
        return ((com.github.catvod.spider.merge.Nx.B)this.b).g();
    }

    public final d b() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final D c() {
        Object object = this.d;
        if (object == null) {
            object = new IllegalStateException("nextToken requires a non-null input stream.");
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
                    this.j = ((com.github.catvod.spider.merge.Nx.B)this.b).g();
                    this.i = ((com.github.catvod.spider.merge.Nx.B)this.b).h();
                    do {
                        this.m = 0;
                        try {
                            n2 = ((com.github.catvod.spider.merge.Nx.B)this.b).i(this.d, this.o);
                        }
                        catch (t t2) {
                            this.m(t2);
                            if (this.d.f(1) != -1) {
                                ((com.github.catvod.spider.merge.Nx.B)this.b).e(this.d);
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
                    this.g = this.f.a(this.e, n2, null, this.l, this.h, this.d.i() - 1, this.i, this.j);
                }
            }
            object = this.g;
            return object;
        }
        finally {
            this.d.a();
        }
    }

    public final int d() {
        return ((com.github.catvod.spider.merge.Nx.B)this.b).h();
    }

    public final E<? extends D> e() {
        return this.f;
    }

    public final D l() {
        D d2;
        int n2 = ((com.github.catvod.spider.merge.Nx.B)this.b).g();
        int n3 = ((com.github.catvod.spider.merge.Nx.B)this.b).h();
        this.g = d2 = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, n3, n2);
        return d2;
    }

    public final void m(t t2) {
        Object object = this.d;
        object = object.h(com.github.catvod.spider.merge.Mm.i.b(this.h, object.i()));
        StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("token recognition error at: '");
        StringBuilder stringBuilder2 = new StringBuilder();
        for (char c2 : ((String)object).toCharArray()) {
            object = String.valueOf(c2);
            if (c2 != '\uffffffff') {
                if (c2 != '\r') {
                    if (c2 != '\t') {
                        if (c2 == '\n') {
                            object = "\\n";
                        }
                    } else {
                        object = "\\t";
                    }
                } else {
                    object = "\\r";
                }
            } else {
                object = "<EOF>";
            }
            stringBuilder2.append((String)object);
        }
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("'");
        object = stringBuilder.toString();
        stringBuilder2 = this.g();
        int n2 = this.i;
        int n3 = this.j;
        ((y)((Object)stringBuilder2)).a(this, null, n2, n3, (String)object, t2);
    }
}

