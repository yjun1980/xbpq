/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.c0.a;
import com.github.catvod.spider.merge.c0.c;
import java.util.Iterator;

final class b
implements Iterator<a> {
    int a;
    final c b;

    b(c c2) {
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
            n3 = ++this.a;
            n2 = c.a(this.b);
            bl = true;
        } while (n3 < n2 && c.b(c2 = this.b, c2.d[this.a]));
        if (this.a >= c.a(this.b)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final Object next() {
        c c2 = this.b;
        Object object = c2.d;
        int n2 = this.a++;
        object = new a(object[n2], c2.e[n2], c2);
        return object;
    }

    @Override
    public final void remove() {
        int n2;
        c c2 = this.b;
        this.a = n2 = this.a - 1;
        c.c(c2, n2);
    }
}

