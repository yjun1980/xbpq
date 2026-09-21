/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.a;
import com.github.catvod.spider.merge.e1.c;
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
        } while (n3 < n2 && c.c(c2 = this.b, c2.b[this.a]));
        if (this.a >= c.a(this.b)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final Object next() {
        Cloneable cloneable = this.b;
        String[] stringArray = cloneable.b;
        int n2 = this.a++;
        cloneable = new a(stringArray[n2], (String)cloneable.c[n2], (c)cloneable);
        return cloneable;
    }

    @Override
    public final void remove() {
        int n2;
        c c2 = this.b;
        this.a = n2 = this.a - 1;
        c.d(c2, n2);
    }
}

