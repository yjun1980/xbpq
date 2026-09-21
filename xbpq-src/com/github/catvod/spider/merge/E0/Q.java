/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.P;
import com.github.catvod.spider.merge.E0.S;
import java.util.Iterator;
import java.util.Map;

final class Q<K>
implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public Q(Iterator<Map.Entry<K, Object>> iterator) {
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry<K, Object> entry;
        Map.Entry<K, Object> entry2 = entry = this.a.next();
        if (entry.getValue() instanceof S) {
            entry2 = new P(entry, null);
        }
        return entry2;
    }

    @Override
    public final void remove() {
        this.a.remove();
    }
}

