/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.d;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public final class e
extends LinkedHashMap<String, Object> {
    public static d<e> a() {
        return new d<e>(new e());
    }

    public final c b(String object) {
        c c2 = new c();
        Object v2 = ((AbstractMap)this).get(object);
        object = c2;
        if (v2 instanceof c) {
            object = (c)v2;
        }
        return object;
    }

    public final boolean c(String string) {
        return this.d(string);
    }

    public final boolean d(String string) {
        if ((string = ((AbstractMap)this).get(string)) instanceof Boolean) {
            return (Boolean)((Object)string);
        }
        return false;
    }

    public final int e(String string, int n2) {
        if ((string = ((AbstractMap)this).get(string)) instanceof Number) {
            return ((Number)((Object)string)).intValue();
        }
        return n2;
    }

    public final long f(String string) {
        long l2 = (string = ((AbstractMap)this).get(string)) instanceof Number ? ((Number)((Object)string)).longValue() : 0L;
        return l2;
    }

    public final e g(String string) {
        return this.h(string, new e());
    }

    public final e h(String string, e e2) {
        if ((string = ((AbstractMap)this).get(string)) instanceof e) {
            return (e)((Object)string);
        }
        return e2;
    }

    public final String i(String string, String string2) {
        if ((string = ((AbstractMap)this).get(string)) instanceof String) {
            return string;
        }
        return string2;
    }
}

