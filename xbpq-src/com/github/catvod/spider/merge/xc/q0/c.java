/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.n0.a;
import com.github.catvod.spider.merge.xc.q0.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c
implements Iterator,
a {
    public Object a;
    public int b;
    public final d c;

    public c(d d2) {
        this.c = d2;
        this.b = -2;
    }

    public final void a() {
        int n2 = this.b;
        Object object = this.c;
        if (n2 == -2) {
            object = ((d)object).a.a();
        } else {
            l l2 = ((d)object).b;
            object = this.a;
            i.b(object);
            object = l2.invoke(object);
        }
        this.a = object;
        n2 = object == null ? 0 : 1;
        this.b = n2;
    }

    @Override
    public final boolean hasNext() {
        if (this.b < 0) {
            this.a();
        }
        int n2 = this.b;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public final Object next() {
        if (this.b < 0) {
            this.a();
        }
        if (this.b != 0) {
            Object object = this.a;
            i.c(object, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

