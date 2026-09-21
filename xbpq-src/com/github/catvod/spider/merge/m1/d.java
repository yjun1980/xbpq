/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m1;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {
    private final int a;
    private final String b;
    private final Map<String, List<String>> c;
    private final String d;
    private final String e;

    public d(int n2, String object, Map<String, List<String>> map, String string, String string2) {
        this.a = n2;
        this.b = object;
        object = map;
        if (map == null) {
            object = Collections.emptyMap();
        }
        this.c = object;
        object = string;
        if (string == null) {
            object = "";
        }
        this.d = object;
        this.e = string2;
    }

    public final String a() {
        for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
            String string = entry.getKey();
            if (string == null || !string.equalsIgnoreCase("Content-Type") || entry.getValue().isEmpty()) continue;
            return entry.getValue().get(0);
        }
        return null;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }
}

