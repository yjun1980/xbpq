/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A0;
import com.github.catvod.spider.merge.E0.x0;
import java.util.Iterator;
import java.util.Map;

final class y0
implements Iterator<Map.Entry<Comparable<Object>, Object>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<Comparable<Object>, Object>> c;
    final A0 d;

    y0(A0 a02) {
        this.d = a02;
        this.a = -1;
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> b() {
        if (this.c == null) {
            this.c = A0.c(this.d).entrySet().iterator();
        }
        return this.c;
    }

    @Override
    public final boolean hasNext() {
        boolean bl;
        int n2 = this.a;
        boolean bl2 = bl = true;
        if (n2 + 1 >= A0.b(this.d)) {
            bl2 = !A0.c(this.d).isEmpty() && this.b().hasNext() ? bl : false;
        }
        return bl2;
    }

    @Override
    public final Object next() {
        int n2;
        this.b = true;
        this.a = n2 = this.a + 1;
        x0 x02 = n2 < A0.b(this.d) ? (x0)A0.d(this.d)[this.a] : this.b().next();
        return x02;
    }

    @Override
    public final void remove() {
        if (this.b) {
            this.b = false;
            A0.a(this.d);
            if (this.a < A0.b(this.d)) {
                A0 a02 = this.d;
                int n2 = this.a;
                this.a = n2 - 1;
                A0.e(a02, n2);
            } else {
                this.b().remove();
            }
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

