/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.J;
import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.S.l;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

public final class k
implements J,
Serializable {
    protected int c;
    protected int d;
    protected int e = -1;
    protected int f;
    protected l<F, d> g;
    protected String h;
    protected int i = -1;
    protected int j;
    protected int k;

    public k(l<F, d> l2, int n2, int n3, int n4, int n5) {
        this.g = l2;
        this.c = n2;
        this.f = n3;
        this.j = n4;
        this.k = n5;
        Object a2 = l2.c;
        if (a2 != null) {
            this.d = ((F)a2).d();
            this.e = ((F)l2.c).a();
        }
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final F b() {
        return (F)this.g.c;
    }

    @Override
    public final String c() {
        int n2;
        Object object = this.h;
        if (object != null) {
            return object;
        }
        object = (d)this.g.d;
        if (object == null) {
            return null;
        }
        int n3 = this.j;
        int n4 = object.size();
        if (n3 < n4 && (n2 = this.k) < n4) {
            return object.h(com.github.catvod.spider.merge.S.i.b(n3, n2));
        }
        return cYh.d("5B150E1769");
    }

    @Override
    public final int d() {
        return this.d;
    }

    @Override
    public final int e() {
        return this.c;
    }

    @Override
    public final void f(int n2) {
        this.i = n2;
    }

    @Override
    public final int g() {
        return this.i;
    }

    @Override
    public final int getChannel() {
        return this.f;
    }

    public final String toString() {
        CharSequence charSequence;
        if (this.f > 0) {
            charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("4B3329303934023C7C"));
            ((StringBuilder)charSequence).append(this.f);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        String string = this.c();
        string = string != null ? string.replace(cYh.d("6D"), cYh.d("3B3E")).replace(cYh.d("6A"), cYh.d("3B22")).replace(cYh.d("6E"), cYh.d("3B24")) : cYh.d("5B3E2E71233F1F247F");
        int n2 = this.c;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("3C10"));
        stringBuilder.append(this.i);
        String string2 = cYh.d("4B");
        stringBuilder.append(string2);
        stringBuilder.append(this.j);
        String string3 = cYh.d("5D");
        stringBuilder.append(string3);
        stringBuilder.append(this.k);
        stringBuilder.append(cYh.d("5A77"));
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("407C7D"));
        stringBuilder.append(String.valueOf(n2));
        stringBuilder.append(cYh.d("59"));
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string2);
        stringBuilder.append(this.d);
        stringBuilder.append(string3);
        stringBuilder.append(this.e);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

