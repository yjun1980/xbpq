/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.e;
import com.github.catvod.spider.merge.q.m;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class k
implements Iterator<Map.Entry<Object, Object>>,
Map.Entry<Object, Object> {
    int a;
    int b;
    boolean c;
    final m d;

    k(m m2) {
        this.d = m2;
        this.c = false;
        this.a = m2.d() - 1;
        this.b = -1;
    }

    @Override
    public final boolean equals(Object object) {
        if (this.c) {
            boolean bl = object instanceof Map.Entry;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (Map.Entry)object;
            bl = bl2;
            if (e.c(object.getKey(), this.d.b(this.b, 0))) {
                bl = bl2;
                if (e.c(object.getValue(), this.d.b(this.b, 1))) {
                    bl = true;
                }
            }
            return bl;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getKey() {
        if (this.c) {
            return this.d.b(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if (this.c) {
            return this.d.b(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b < this.a;
        return bl;
    }

    @Override
    public final int hashCode() {
        if (this.c) {
            Object object = this.d;
            int n2 = this.b;
            int n3 = 0;
            object = ((m)object).b(n2, 0);
            Object object2 = this.d.b(this.b, 1);
            n2 = object == null ? 0 : object.hashCode();
            if (object2 != null) {
                n3 = object2.hashCode();
            }
            return n2 ^ n3;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            ++this.b;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.c) {
            this.d.h(this.b);
            --this.b;
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object setValue(Object object) {
        if (this.c) {
            return this.d.i(this.b, object);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append("=");
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}

