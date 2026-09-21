/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.Q.f;
import com.github.catvod.spider.merge.Q.p0;
import com.github.catvod.spider.merge.Q.v;
import com.github.catvod.spider.merge.R.c;
import com.github.catvod.spider.merge.R.e;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public final Map<e, e> a = new HashMap<e, e>();
    public volatile e b;
    public final int c;
    public final v d;
    private final boolean e;

    public b(v object, int n2) {
        this.d = object;
        this.c = n2;
        boolean bl = object instanceof p0;
        boolean bl2 = true;
        if (bl && ((p0)object).j) {
            object = new e(new f(true));
            ((e)object).c = new e[0];
            ((e)object).d = false;
            ((e)object).g = false;
            this.b = object;
        } else {
            bl2 = false;
        }
        this.e = bl2;
    }

    public final e a(int n2) {
        if (this.e) {
            if (n2 >= 0 && n2 < this.b.c.length) {
                return this.b.c[n2];
            }
            return null;
        }
        throw new IllegalStateException(cYh.d("283E2D28772A15352234333F09332471131C2623613C362347332E3F233B0E3E6130772A15352234333F09332471242E06223571242E0624247F"));
    }

    public final boolean b() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2, e e2) {
        if (!this.e) {
            throw new IllegalStateException(cYh.d("283E2D28772A15352234333F09332471131C2623613C362347332E3F233B0E3E6130772A15352234333F09332471242E06223571242E0624247F"));
        }
        if (n2 < 0) {
            return;
        }
        e e3 = this.b;
        synchronized (e3) {
            if (n2 >= this.b.c.length) {
                this.b.c = Arrays.copyOf(this.b.c, n2 + 1);
            }
            this.b.c[n2] = e2;
            return;
        }
    }

    public final String toString() {
        Object object = I.e;
        object = this.b == null ? "" : new c(this, (H)object).toString();
        return object;
    }
}

