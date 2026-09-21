/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.E0.D;
import com.github.catvod.spider.merge.E0.H;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.k0;
import com.github.catvod.spider.merge.G1.b;

public final class c
extends I<c, b>
implements k0 {
    private static final c g;
    private static volatile D h;
    private String e = "";
    private String f = "";

    static {
        c c2;
        g = c2 = new c();
        I.s(c.class, c2);
    }

    private c() {
    }

    static /* bridge */ /* synthetic */ c u() {
        return g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object f(H object) {
        int n2 = object.ordinal();
        if (n2 == 0) return (byte)1;
        if (n2 == 2) {
            return I.p(g, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1208\u0000\u0002\u1208\u0001", new Object[]{"bitField0_", "key_", "value_"});
        }
        if (n2 == 3) return new c();
        if (n2 == 4) return new b(null);
        if (n2 == 5) return g;
        if (n2 != 6) throw null;
        D d2 = h;
        object = d2;
        if (d2 != null) return object;
        synchronized (c.class) {
            try {
                d2 = h;
                object = d2;
                if (d2 != null) return object;
                object = new D(g);
                h = object;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String v() {
        return this.e;
    }

    public final String w() {
        return this.f;
    }
}

