/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.LinkedHashMap;
import java.util.Map;

public class \u10cd<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> \u037f = new LinkedHashMap<Key1, Map<Key2, Value>>();

    public Value \u037f(Key1 object, Key2 Key2) {
        if ((object = this.\u037f.get(object)) == null) {
            return null;
        }
        return (Value)object.get(Key2);
    }

    public Value \u0528(Key1 object, Key2 Key2, Value Value) {
        Map<Object, Object> map;
        Map<Key2, Value> map2 = this.\u037f.get(object);
        if (map2 == null) {
            map = new LinkedHashMap();
            this.\u037f.put(object, map);
            map2 = null;
            object = map;
            map = map2;
        } else {
            map = map2.get(Key2);
            object = map2;
        }
        object.put(Key2, Value);
        return (Value)map;
    }
}

