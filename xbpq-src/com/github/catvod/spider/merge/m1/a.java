/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.m1.b;
import com.github.catvod.spider.merge.m1.c;
import com.github.catvod.spider.merge.m1.d;
import com.github.catvod.spider.merge.p1.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class a {
    public abstract d a(c var1);

    public final d b(String string) {
        return this.d(string, null, l.c());
    }

    public final d c(String string, Map<String, List<String>> map) {
        return this.d(string, map, l.c());
    }

    public final d d(String string, Map<String, List<String>> map, e e2) {
        b b2 = new b();
        b2.h(string);
        b2.j(map);
        b2.k(e2);
        return this.a(b2.g());
    }

    public final d e(String string, Map<String, List<String>> map, byte[] byArray) {
        return this.f(string, map, byArray, l.c());
    }

    public final d f(String string, Map<String, List<String>> object, byte[] byArray, e e2) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        if (object != null) {
            hashMap.putAll((Map<String, List<String>>)object);
        }
        hashMap.put("Content-Type", Collections.singletonList("application/json"));
        object = new b();
        ((b)object).l(string, byArray);
        ((b)object).j(hashMap);
        ((b)object).k(e2);
        return this.a(((b)object).g());
    }

    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

