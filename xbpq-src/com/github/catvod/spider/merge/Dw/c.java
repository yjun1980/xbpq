/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.t;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.g;
import com.github.catvod.spider.merge.ka.d;
import java.util.AbstractCollection;
import java.util.AbstractList;

public final class c {
    private g a;
    private boolean b = false;
    private c c;

    private c(l l2) {
        g g2;
        this.a = g2 = new g();
        ((AbstractCollection)g2).add(l2);
    }

    private c(g g2) {
        g g3;
        this.a = g3 = new g();
        ((AbstractCollection)g3).addAll(g2);
    }

    public static c b(l l2) {
        return new c(l2);
    }

    public static c c(g g2) {
        return new c(g2);
    }

    public static c d(c c2) {
        c c3 = new c(c2.a);
        c3.c = c2;
        return c3;
    }

    public final g a() {
        return this.a;
    }

    public final c e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.b = false;
    }

    final void h() {
        this.b = true;
    }

    public final void i(g g2) {
        this.a = g2;
    }

    public final c j(c c2) {
        this.c = c2;
        return this;
    }

    public final l k() {
        if (((AbstractCollection)this.a).size() == 1) {
            Cloneable cloneable = this.a;
            cloneable = ((AbstractCollection)((Object)cloneable)).isEmpty() ? null : (l)((AbstractList)((Object)cloneable)).get(0);
            return cloneable;
        }
        StringBuilder stringBuilder = d.b("current context is more than one el,total = ");
        stringBuilder.append(((AbstractCollection)this.a).size());
        throw new t(stringBuilder.toString());
    }
}

