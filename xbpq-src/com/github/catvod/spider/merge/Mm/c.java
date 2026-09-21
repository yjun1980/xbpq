/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Mm;

import java.util.LinkedHashMap;
import java.util.Map;

public final class c<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> a = new LinkedHashMap<Key1, Map<Key2, Value>>();

    public final Value a(Key1 object, Key2 Key2) {
        if ((object = (Map)((LinkedHashMap)this.a).get(object)) == null) {
            return null;
        }
        return (Value)object.get(Key2);
    }

    public final Value b(Key1 object, Key2 Key2, Value Value) {
        LinkedHashMap<Key2, Value> linkedHashMap = (LinkedHashMap<Key2, Value>)((LinkedHashMap)this.a).get(object);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<Key2, Value>();
            this.a.put(object, linkedHashMap);
            object = null;
        } else {
            object = linkedHashMap.get(Key2);
        }
        linkedHashMap.put(Key2, Value);
        return (Value)object;
    }
}

