/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.n0.a;
import java.io.Serializable;
import java.util.Map;

public final class r
implements Map,
Serializable,
a {
    public static final r a = new r();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object object) {
        return false;
    }

    @Override
    public final boolean containsValue(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        i.e((Void)object, "value");
        return false;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = object instanceof Map && ((Map)object).isEmpty();
        return bl;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "{}";
    }
}

