/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.S;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.E0.j0;
import java.util.Map;

final class P<K>
implements Map.Entry<K, Object> {
    private Map.Entry<K, S> a;

    P(Map.Entry entry, f f2) {
        this.a = entry;
    }

    @Override
    public final K getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        S s2 = this.a.getValue();
        if (s2 == null) {
            return null;
        }
        return s2.a(null);
    }

    @Override
    public final Object setValue(Object object) {
        if (object instanceof j0) {
            return this.a.getValue().b((j0)object);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

