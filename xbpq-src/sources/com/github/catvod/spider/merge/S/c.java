package com.github.catvod.spider.merge.S;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> a = new LinkedHashMap();

    public final Value a(Key1 key1, Key2 key2) {
        Map map = (Map) this.a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    public final Value b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> map = (Map) this.a.get(key1);
        if (map == null) {
            map = new LinkedHashMap<>();
            this.a.put(key1, map);
            value2 = null;
        } else {
            value2 = map.get(key2);
        }
        map.put(key2, value);
        return value2;
    }
}
