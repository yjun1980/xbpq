/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.I1.b;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

public abstract class c {
    private final String a;
    private final Collection<String> b;
    private final Collection<String> c;
    private final Collection<String> d;
    private final Collection<String> e;
    private final Collection<String> f;
    private final Collection<String> g;
    private final Collection<String> h;
    private final Map<ChronoUnit, Map<String, Integer>> i;

    protected c(String string, String[] object, String[] object2, String[] object3, String[] object4, String[] object5, String[] object6, String[] object7) {
        object = Arrays.asList(object);
        object2 = Arrays.asList(object2);
        object3 = Arrays.asList(object3);
        object4 = Arrays.asList(object4);
        object5 = Arrays.asList(object5);
        object6 = Arrays.asList(object6);
        object7 = Arrays.asList(object7);
        this.i = new EnumMap<ChronoUnit, Map<String, Integer>>(ChronoUnit.class);
        this.a = string;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = object4;
        this.f = object5;
        this.g = object6;
        this.h = object7;
    }

    public final Map<ChronoUnit, Collection<String>> a() {
        EnumMap<ChronoUnit, Collection<String>> enumMap = new EnumMap<ChronoUnit, Collection<String>>(ChronoUnit.class);
        enumMap.put((Object)ChronoUnit.SECONDS, this.b);
        enumMap.put((Object)ChronoUnit.MINUTES, this.c);
        enumMap.put((Object)ChronoUnit.HOURS, this.d);
        enumMap.put((Object)ChronoUnit.DAYS, this.e);
        enumMap.put((Object)ChronoUnit.WEEKS, this.f);
        enumMap.put((Object)ChronoUnit.MONTHS, this.g);
        enumMap.put((Object)ChronoUnit.YEARS, this.h);
        return enumMap;
    }

    protected final void b(ChronoUnit chronoUnit, String string) {
        this.i.computeIfAbsent(chronoUnit, com.github.catvod.spider.merge.I1.b.a).put(string, 2);
    }

    public final Map<ChronoUnit, Map<String, Integer>> c() {
        return this.i;
    }

    public final String d() {
        return this.a;
    }
}

