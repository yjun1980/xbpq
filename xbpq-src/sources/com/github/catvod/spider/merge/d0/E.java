package com.github.catvod.spider.merge.d0;

import java.io.StringReader;

/* loaded from: classes.dex */
public final class E {
    private i1 a;
    private C b = new C();

    public E(i1 i1Var) {
        this.a = i1Var;
    }

    public static com.github.catvod.spider.merge.c0.h c(String str) {
        O t;
        C0062b c0062b = new C0062b();
        c0062b.C(new StringReader(str), new E(c0062b));
        Q q = c0062b.c;
        do {
            t = q.t();
            c0062b.c(t);
            t.g();
        } while (t.a != 6);
        c0062b.b.d();
        c0062b.b = null;
        c0062b.c = null;
        c0062b.e = null;
        return c0062b.d;
    }

    public final C a() {
        return this.b;
    }

    public final boolean b(String str) {
        return this.a.b(str);
    }
}
