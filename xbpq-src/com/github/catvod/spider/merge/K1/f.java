/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.K1.e;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.i;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class f {
    public static c a(com.github.catvod.spider.merge.F0.e e2, String string) {
        return f.c(e2, string, c.class);
    }

    public static Boolean b(com.github.catvod.spider.merge.F0.e e2) {
        return f.c(e2, "nsfw", Boolean.class);
    }

    private static <T> T c(com.github.catvod.spider.merge.F0.e object, String string, Class<T> clazz) {
        if (clazz.isInstance(object = f.i((com.github.catvod.spider.merge.F0.e)object, string))) {
            return clazz.cast(object);
        }
        throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.B.e.c("Wrong data type at path ", string));
    }

    public static com.github.catvod.spider.merge.F0.e d(String object, String string) {
        object = d.l((String)object);
        Objects.requireNonNull(object);
        d.h(string);
        object = com.github.catvod.spider.merge.g1.c.a(new i(string.trim(), 0), (m)object).a(string);
        return g.d().a((String)object);
    }

    public static Number e(com.github.catvod.spider.merge.F0.e e2) {
        return f.c(e2, "resolution.id", Number.class);
    }

    public static com.github.catvod.spider.merge.F0.e f(com.github.catvod.spider.merge.F0.e e2, String string) {
        return f.c(e2, string, com.github.catvod.spider.merge.F0.e.class);
    }

    public static String g(com.github.catvod.spider.merge.F0.e e2, String string) {
        return f.c(e2, string, String.class);
    }

    public static List<String> h(c c2) {
        return c2.stream().filter(new e()).map(new com.github.catvod.spider.merge.D1.f(String.class, 1)).collect(Collectors.toList());
    }

    public static Object i(com.github.catvod.spider.merge.F0.e e2, String string) {
        com.github.catvod.spider.merge.F0.e e3;
        List<String> list = Arrays.asList(string.split("\\."));
        Iterator<String> iterator = list.subList(0, list.size() - 1).iterator();
        do {
            e3 = e2;
            if (!iterator.hasNext()) break;
            e2 = e3 = e2.g(iterator.next());
        } while (e3 != null);
        if (e3 != null) {
            e2 = ((AbstractMap)e3).get(list.get(list.size() - 1));
            if (e2 != null) {
                return e2;
            }
            throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.B.e.c("Unable to get ", string));
        }
        throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.B.e.c("Unable to get ", string));
    }

    public static com.github.catvod.spider.merge.F0.e j(String object) {
        try {
            object = g.d().a((String)object);
            return object;
        }
        catch (h h2) {
            throw new com.github.catvod.spider.merge.n1.i("Could not parse JSON", h2);
        }
    }
}

