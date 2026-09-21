/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class c {
    public static String a(String string, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static HashMap b(String string, String string2, String string3, String string4) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        hashMap.put(string3, string4);
        return hashMap;
    }

    public static /* synthetic */ Map c(Object hashMap) {
        AbstractMap.SimpleEntry<String, Object> simpleEntry = new AbstractMap.SimpleEntry<String, Object>("Range", hashMap);
        hashMap = new HashMap(1);
        for (int i2 = 0; i2 < 1; ++i2) {
            Map.Entry entry = (new Map.Entry[]{simpleEntry})[i2];
            Object k2 = entry.getKey();
            Objects.requireNonNull(k2);
            entry = entry.getValue();
            Objects.requireNonNull(entry);
            if (hashMap.put(k2, entry) == null) {
                continue;
            }
            throw new IllegalArgumentException(c.a("duplicate key: ", k2));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static /* synthetic */ String d(int n2) {
        if (n2 == 1) {
            return "PROGRESSIVE_HTTP";
        }
        if (n2 == 2) {
            return "DASH";
        }
        if (n2 == 3) {
            return "HLS";
        }
        if (n2 == 4) {
            return "SS";
        }
        if (n2 == 5) {
            return "TORRENT";
        }
        return "null";
    }
}

