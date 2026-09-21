/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.Q.d0;
import com.github.catvod.spider.merge.Q.e0;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.r0;
import com.github.catvod.spider.merge.Q.v;
import com.github.catvod.spider.merge.Q.y;
import com.github.catvod.spider.merge.S.j;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class a {
    public final List<m> a = new ArrayList<m>();
    public final List<v> b = new ArrayList<v>();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public C[] h;
    public final List<r0> i;

    public a(int n2, int n3) {
        new LinkedHashMap();
        this.i = new ArrayList<r0>();
        this.e = n2;
        this.f = n3;
    }

    public final void a(m m2) {
        if (m2 != null) {
            m2.a = this;
            m2.b = ((ArrayList)this.a).size();
        }
        ((ArrayList)this.a).add(m2);
    }

    public final v b(int n2) {
        if (!((ArrayList)this.b).isEmpty()) {
            return (v)((ArrayList)this.b).get(n2);
        }
        return null;
    }

    public final j c(int n2, com.github.catvod.spider.merge.P.C object) {
        if (n2 >= 0 && n2 < ((ArrayList)this.a).size()) {
            j j2 = this.e((m)((ArrayList)this.a).get(n2));
            if (!j2.d(-2)) {
                return j2;
            }
            j j3 = new j(new int[0]);
            j3.c(j2);
            j3.h();
            while (object != null && ((com.github.catvod.spider.merge.P.C)object).b >= 0 && j2.d(-2)) {
                j2 = this.e(((f0)((m)((ArrayList)this.a).get((int)((com.github.catvod.spider.merge.P.C)object).b)).d((int)0)).c);
                j3.c(j2);
                j3.h();
                object = ((com.github.catvod.spider.merge.P.C)object).a;
            }
            if (j2.d(-2)) {
                j3.a(-1);
            }
            return j3;
        }
        object = new IllegalArgumentException(cYh.d("2E3E37303B3303703225362E02702F243A3802226F"));
        throw object;
    }

    public final int d() {
        return ((ArrayList)this.b).size();
    }

    public final j e(m m2) {
        j j2 = m2.f;
        if (j2 != null) {
            return j2;
        }
        m2.f = j2 = this.f(m2, null);
        j2.i();
        return m2.f;
    }

    public final j f(m m2, com.github.catvod.spider.merge.P.C object) {
        y y2 = new y(this);
        j j2 = new j(new int[0]);
        object = object != null ? X.a(m2.a, (com.github.catvod.spider.merge.P.C)object) : null;
        y2.a(m2, (X)object, j2, new HashSet(), new BitSet());
        return j2;
    }
}

