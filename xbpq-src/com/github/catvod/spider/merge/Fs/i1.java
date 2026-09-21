/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.E;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
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
            l2 = new L();
            l2.s(string);
            return this.c(l2);
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
        if (this.g == m2) {
            m2 = new M();
        } else {
            m2.v();
        }
        m2.b = "input";
        m2.j = c2;
        m2.c = s.c("input");
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

