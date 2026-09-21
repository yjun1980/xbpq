/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.q0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.q0.g;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f
extends g
implements Iterator,
d,
com.github.catvod.spider.merge.xc.n0.a {
    public int a;
    public Object b;
    public Iterator c;
    public d d;

    public final RuntimeException b() {
        Serializable serializable;
        int n2 = this.a;
        if (n2 != 4) {
            if (n2 != 5) {
                serializable = new StringBuilder("Unexpected state of the iterator: ");
                ((StringBuilder)serializable).append(this.a);
                serializable = new IllegalStateException(((StringBuilder)serializable).toString());
            } else {
                serializable = new IllegalStateException("Iterator has failed.");
            }
        } else {
            serializable = new NoSuchElementException();
        }
        return serializable;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i getContext() {
        return j.a;
    }

    @Override
    public final boolean hasNext() {
        while (true) {
            Object object;
            int n2;
            if ((n2 = this.a) != 0) {
                if (n2 != 1) {
                    if (n2 != 2 && n2 != 3) {
                        if (n2 == 4) {
                            return false;
                        }
                        throw this.b();
                    }
                    return true;
                }
                object = this.c;
                i.b(object);
                if (object.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            object = this.d;
            i.b(object);
            this.d = null;
            object.resumeWith(com.github.catvod.spider.merge.xc.c0.f.a);
        }
    }

    public final Object next() {
        int n2 = this.a;
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    this.a = 0;
                    Object object = this.b;
                    this.b = null;
                    return object;
                }
                throw this.b();
            }
            this.a = 1;
            Iterator iterator = this.c;
            i.b(iterator);
            return iterator.next();
        }
        if (this.hasNext()) {
            return this.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object object) {
        com.github.catvod.spider.merge.xc.a.a.C(object);
        this.a = 4;
    }
}

