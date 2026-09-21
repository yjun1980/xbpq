/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.E0.D;
import com.github.catvod.spider.merge.E0.H;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.k0;
import com.github.catvod.spider.merge.G1.c;
import com.github.catvod.spider.merge.G1.e;
import java.util.List;

public final class f
extends I<f, e>
implements k0 {
    private static final f f;
    private static volatile D g;
    private M<c> e = I.g();

    static {
        f f2;
        f = f2 = new f();
        I.s(f.class, f2);
    }

    private f() {
    }

    static /* bridge */ /* synthetic */ f u() {
        return f;
    }

    public static f w(byte[] byArray) {
        return I.r(f, byArray);
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
            return I.p(f, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"xtags_", c.class});
        }
        if (n2 == 3) return new f();
        if (n2 == 4) return new e(null);
        if (n2 == 5) return f;
        if (n2 != 6) throw null;
        D d2 = g;
        object = d2;
        if (d2 != null) return object;
        synchronized (f.class) {
            try {
                d2 = g;
                object = d2;
                if (d2 != null) return object;
                object = new D(f);
                g = object;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final List<c> v() {
        return this.e;
    }
}

