/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.A0;
import com.github.catvod.spider.merge.E0.y0;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class z0
extends AbstractSet<Map.Entry<Comparable<Object>, Object>> {
    final A0 a;

    z0(A0 a02) {
        this.a = a02;
    }

    @Override
    public final boolean add(Object object) {
        boolean bl;
        if (!this.contains(object = (Map.Entry)object)) {
            this.a.n((Comparable)object.getKey(), object.getValue());
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        Map.Entry entry = (Map.Entry)object;
        object = this.a.get(entry.getKey());
        boolean bl = object == (entry = entry.getValue()) || object != null && object.equals(entry);
        return bl;
    }

    @Override
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new y0(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.a.remove(object.getKey());
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

