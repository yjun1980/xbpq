/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.G;
import com.github.catvod.spider.merge.P.J;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.List;

public class c
implements G {
    protected F a;
    protected List<D> b = new ArrayList<D>(100);
    protected int c = -1;
    protected boolean d;

    public c(F f2) {
        this.a = f2;
    }

    @Override
    public final void a() {
    }

    @Override
    public final F b() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String c(D object, D d2) {
        if (object == null) return "";
        if (d2 == null) return "";
        object = i.b(object.g(), d2.g());
        int n2 = ((i)object).a;
        int n3 = ((i)object).b;
        if (n2 < 0) return "";
        if (n3 < 0) return "";
        this.m();
        while (this.l(1000) >= 1000) {
        }
        int n4 = n3;
        if (n3 >= ((ArrayList)this.b).size()) {
            n4 = ((ArrayList)this.b).size() - 1;
        }
        object = new StringBuilder();
        while (n2 <= n4) {
            d2 = (D)((ArrayList)this.b).get(n2);
            if (d2.e() == -1) return ((StringBuilder)object).toString();
            ((StringBuilder)object).append(d2.c());
            ++n2;
        }
        return ((StringBuilder)object).toString();
    }

    @Override
    public final void d(int n2) {
        this.m();
        this.c = this.k(n2);
    }

    @Override
    public D e(int n2) {
        throw null;
    }

    @Override
    public final int f(int n2) {
        return this.e(n2).e();
    }

    @Override
    public final int g() {
        return 0;
    }

    @Override
    public final D get(int n2) {
        if (n2 >= 0 && n2 < ((ArrayList)this.b).size()) {
            return (D)((ArrayList)this.b).get(n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("133F2A34397A0E3E25342F7A"));
        stringBuilder.append(n2);
        stringBuilder.append(cYh.d("473F3425773501703330393D0270717F79"));
        stringBuilder.append(((ArrayList)this.b).size() - 1);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final int i() {
        return this.c;
    }

    @Override
    public final void j() {
        int n2 = this.c;
        n2 = n2 >= 0 && (this.d ? n2 < ((ArrayList)this.b).size() - 1 : n2 < ((ArrayList)this.b).size()) ? 1 : 0;
        if (n2 == 0 && this.f(1) == -1) {
            throw new IllegalStateException(cYh.d("04312F3F382E47332E3F242F0A356114181C"));
        }
        if (this.o(this.c + 1)) {
            this.c = this.k(this.c + 1);
        }
    }

    protected int k(int n2) {
        throw null;
    }

    protected final int l(int n2) {
        boolean bl = this.d;
        if (bl) {
            return 0;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            D d2 = this.a.c();
            if (d2 instanceof J) {
                ((J)d2).f(((ArrayList)this.b).size());
            }
            ((ArrayList)this.b).add(d2);
            if (d2.e() != -1) continue;
            this.d = true;
            return i2 + 1;
        }
        return n2;
    }

    protected final void m() {
        if (this.c == -1) {
            this.o(0);
            this.c = this.k(0);
        }
    }

    protected final int n(int n2) {
        D d2;
        this.o(n2);
        int n3 = n2;
        if (n2 >= this.size()) {
            return this.size() - 1;
        }
        while ((d2 = (D)((ArrayList)this.b).get(n3)).getChannel() != 0) {
            if (d2.e() == -1) {
                return n3;
            }
            this.o(++n3);
        }
        return n3;
    }

    protected final boolean o(int n2) {
        int n3 = ((ArrayList)this.b).size();
        boolean bl = true;
        n2 = n2 - n3 + 1;
        boolean bl2 = bl;
        if (n2 > 0) {
            bl2 = this.l(n2) >= n2 ? bl : false;
        }
        return bl2;
    }

    @Override
    public final int size() {
        return ((ArrayList)this.b).size();
    }
}

