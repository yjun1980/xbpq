/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.x.b;
import java.util.AbstractCollection;
import java.util.AbstractList;

public final class d {
    private g a;
    private boolean b = false;
    private d c;

    private d(l l2) {
        g g2;
        this.a = g2 = new g();
        ((AbstractCollection)g2).add(l2);
    }

    private d(g g2) {
        g g3;
        this.a = g3 = new g();
        ((AbstractCollection)g3).addAll(g2);
    }

    public static d b(l l2) {
        return new d(l2);
    }

    public static d c(g g2) {
        return new d(g2);
    }

    public static d d(d d2) {
        d d3 = new d(d2.a);
        d3.c = d2;
        return d3;
    }

    public final g a() {
        return this.a;
    }

    public final d e() {
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

    public final d j(d d2) {
        this.c = d2;
        return this;
    }

    public final l k() {
        if (((AbstractCollection)this.a).size() == 1) {
            Cloneable cloneable = this.a;
            cloneable = ((AbstractCollection)((Object)cloneable)).isEmpty() ? null : (l)((AbstractList)((Object)cloneable)).get(0);
            return cloneable;
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("0425332332341370223E392E022835713E29473D2E23327A1338203F7735093561343B76133F35303B7A5A70"));
        stringBuilder.append(((AbstractCollection)this.a).size());
        throw new b(stringBuilder.toString());
    }
}

