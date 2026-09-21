/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.l.c;
import com.github.catvod.spider.merge.l.e;
import com.github.catvod.spider.merge.l.f;
import com.github.catvod.spider.merge.l.g;
import com.github.catvod.spider.merge.l.n;
import com.github.catvod.spider.merge.l.o;
import com.github.catvod.spider.merge.l.p;
import java.util.Iterator;

public final class r {
    private final g a;
    private final boolean b;
    private final o c;
    private final int d;

    private r(o o2, boolean bl, g g2, int n2) {
        this.c = o2;
        this.b = bl;
        this.a = g2;
        this.d = n2;
    }

    static Iterator a(r r2, CharSequence charSequence) {
        o o2 = r2.c;
        o2.getClass();
        return new n(o2, r2, charSequence);
    }

    static /* synthetic */ g b(r r2) {
        return r2.a;
    }

    static /* synthetic */ boolean c(r r2) {
        return r2.b;
    }

    static /* synthetic */ int d(r r2) {
        return r2.d;
    }

    public static r f() {
        return new r(new o(new c()), false, e.b, Integer.MAX_VALUE);
    }

    public final r e() {
        return new r(this.c, true, this.a, this.d);
    }

    public final Iterable<String> g(CharSequence charSequence) {
        charSequence.getClass();
        return new p(this, charSequence);
    }

    public final r h() {
        f f2 = f.c;
        f2.getClass();
        return new r(this.c, this.b, f2, this.d);
    }
}

