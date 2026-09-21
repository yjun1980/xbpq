/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.gu.I
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.c;
import com.github.catvod.spider.merge.Dw.m;
import com.github.catvod.spider.merge.Nx.f;
import com.github.catvod.spider.merge.Nx.p0;
import com.github.catvod.spider.merge.Nx.v;
import com.github.catvod.spider.merge.gu.H;
import com.github.catvod.spider.merge.gu.I;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class k {
    public final Map<m, m> a = new HashMap<m, m>();
    public volatile m b;
    public final int c;
    public final v d;
    private final boolean e;

    public k(v object, int n2) {
        this.d = object;
        this.c = n2;
        boolean bl = object instanceof p0;
        boolean bl2 = true;
        if (bl && ((p0)((Object)object)).j) {
            object = new m(new f(true));
            ((m)object).c = new m[0];
            ((m)object).d = false;
            ((m)object).g = false;
            this.b = object;
        } else {
            bl2 = false;
        }
        this.e = bl2;
    }

    public final m a(int n2) {
        if (this.e) {
            if (n2 >= 0 && n2 < this.b.c.length) {
                return this.b.c[n2];
            }
            return null;
        }
        throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
    }

    public final boolean b() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2, m m2) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (n2 < 0) {
            return;
        }
        m m3 = this.b;
        synchronized (m3) {
            if (n2 >= this.b.c.length) {
                this.b.c = Arrays.copyOf(this.b.c, n2 + 1);
            }
            this.b.c[n2] = m2;
            return;
        }
    }

    public final String toString() {
        Object object = I.e;
        object = this.b == null ? "" : new c(this, (H)object).toString();
        return object;
    }
}

