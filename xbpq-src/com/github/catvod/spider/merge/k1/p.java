/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.k1.n;
import com.github.catvod.spider.merge.k1.o;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.o1.c;
import com.github.catvod.spider.merge.p1.e;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class p {
    private final int a;
    private final o b;

    public p(int n2, String string, Set<n> set) {
        this.a = n2;
        this.b = new o(string);
    }

    public abstract c a();

    public final e b() {
        e e2 = l.c();
        if (this.h().contains(e2)) {
            return e2;
        }
        for (e e3 : this.h()) {
            if (!e3.b().equals(e2.b())) continue;
            return e3;
        }
        return e.c;
    }

    public abstract c c();

    public final int d() {
        return this.a;
    }

    public abstract g e(a var1);

    public abstract com.github.catvod.spider.merge.b.a f();

    public List<com.github.catvod.spider.merge.p1.a> g() {
        return Collections.singletonList(com.github.catvod.spider.merge.p1.a.b);
    }

    public List<e> h() {
        return Collections.singletonList(e.c);
    }

    public final String toString() {
        int n2 = this.a;
        String string = this.b.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(":");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

