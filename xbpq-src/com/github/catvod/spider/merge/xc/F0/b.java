/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.F0.a;
import com.github.catvod.spider.merge.xc.F0.c;
import java.util.Iterator;

public final class b
implements Iterator {
    public int a;
    public final c b;

    public b(c c2) {
        this.b = c2;
        this.a = 0;
    }

    @Override
    public final boolean hasNext() {
        boolean bl;
        c c2;
        int n2;
        int n3;
        do {
            n3 = this.a++;
            c2 = this.b;
            n2 = c2.a;
            bl = true;
        } while (n3 < n2 && c.i(c2.b[n3]));
        if (this.a >= c2.a) {
            bl = false;
        }
        return bl;
    }

    public final Object next() {
        c c2 = this.b;
        Object object = c2.b;
        int n2 = this.a++;
        object = new a(object[n2], (String)c2.c[n2], c2);
        return object;
    }

    @Override
    public final void remove() {
        int n2;
        this.a = n2 = this.a - 1;
        this.b.l(n2);
    }
}

