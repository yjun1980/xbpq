/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.N;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import java.util.ArrayList;

abstract class i1 {
    protected E a;
    a b;
    Q c;
    protected h d;
    protected ArrayList<l> e;
    protected String f;
    protected O g;
    protected D h;
    private M i = new M();
    private L j = new L();

    i1() {
    }

    protected final l a() {
        int n2 = this.e.size();
        l l2 = n2 > 0 ? this.e.get(n2 - 1) : null;
        return l2;
    }

    protected abstract boolean b(String var1);

    protected abstract boolean c(O var1);

    protected final boolean d(String string) {
        O o2 = this.g;
        L l2 = this.j;
        if (o2 == l2) {
            o2 = new L();
            ((N)o2).s(string);
            return this.c(o2);
        }
        l2.v();
        l2.s(string);
        return this.c(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean e(c c2) {
        M m2 = this.i;
        O o2 = this.g;
        String string = cYh.d("0E3E312423");
        if (o2 == m2) {
            m2 = new M();
        } else {
            m2.v();
        }
        m2.b = string;
        m2.j = c2;
        m2.c = com.github.catvod.spider.merge.x.a.c(string);
        return this.c(m2);
    }

    protected final boolean f(String string) {
        M m2 = this.i;
        if (this.g == m2) {
            m2 = new M();
        } else {
            m2.v();
        }
        m2.s(string);
        return this.c(m2);
    }
}

