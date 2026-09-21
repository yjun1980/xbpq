/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e;

import com.github.catvod.spider.merge.xc.e.c;
import com.github.catvod.spider.merge.xc.e.e;
import java.util.Iterator;

public final class b
implements Iterator,
e {
    public c a;
    public c b;
    public final int c;

    public b(c c2, c c3, int n2) {
        this.c = n2;
        this.a = c3;
        this.b = c2;
    }

    @Override
    public final void a(c c2) {
        c c3 = this.a;
        Object var2_3 = null;
        if (c3 == c2 && c2 == this.b) {
            this.b = null;
            this.a = null;
        }
        if ((c3 = this.a) == c2) {
            this.a = this.b(c3);
        }
        if ((c3 = this.b) == c2) {
            c c4 = this.a;
            c2 = var2_3;
            if (c3 != c4) {
                c2 = c4 == null ? var2_3 : this.c(c3);
            }
            this.b = c2;
        }
    }

    public final c b(c c2) {
        switch (this.c) {
            default: {
                return c2.c;
            }
            case 0: 
        }
        return c2.d;
    }

    public final c c(c c2) {
        switch (this.c) {
            default: {
                return c2.d;
            }
            case 0: 
        }
        return c2.c;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b != null;
        return bl;
    }

    public final Object next() {
        c c2 = this.b;
        c c3 = this.a;
        c3 = c2 != c3 && c3 != null ? this.c(c2) : null;
        this.b = c3;
        return c2;
    }
}

