/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.c;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.n1.k;
import com.github.catvod.spider.merge.s1.a;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public final class b {
    private static final List<c> a;
    public static final int b = 0;

    static {
        c c2 = new c("10.jpg", -1, 1200, 1);
        c c3 = new c("101.jpg", 90, -1, 3);
        c c4 = new c("170.jpg", 422, -1, 2);
        c c5 = new c("171.jpg", 646, -1, 2);
        c c6 = new c("20.jpg", -1, 1024, 1);
        c c7 = new c("200.jpg", 420, -1, 2);
        c c8 = new c("201.jpg", 280, -1, 2);
        c c9 = new c("202.jpg", 140, -1, 3);
        c c10 = new c("204.jpg", 360, -1, 2);
        c c11 = new c("205.jpg", 240, -1, 2);
        c c12 = new c("206.jpg", 180, -1, 2);
        c c13 = new c("207.jpg", 120, -1, 3);
        c c14 = new c("43.jpg", 100, -1, 3);
        c c15 = new c("44.jpg", 200, -1, 2);
        ArrayList<c> arrayList = new ArrayList<c>(14);
        for (int i2 = 0; i2 < 14; ++i2) {
            c c16 = (new c[]{c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15})[i2];
            Objects.requireNonNull(c16);
            arrayList.add(c16);
        }
        a = Collections.unmodifiableList(arrayList);
    }

    private static List<com.github.catvod.spider.merge.k1.c> a(String string) {
        return a.stream().map(new a(string, 0)).collect(Collectors.toList());
    }

    public static List<com.github.catvod.spider.merge.k1.c> b(long l2, boolean bl) {
        if (l2 == 0L) {
            return Collections.emptyList();
        }
        Object object = bl ? Character.valueOf('a') : "";
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://f4.bcbits.com/img/");
        stringBuilder.append((String)object);
        stringBuilder.append(l2);
        stringBuilder.append("_");
        return com.github.catvod.spider.merge.s1.b.a(stringBuilder.toString());
    }

    public static List<com.github.catvod.spider.merge.k1.c> c(String string) {
        if (p.j(string)) {
            return Collections.emptyList();
        }
        return com.github.catvod.spider.merge.s1.b.a(string.replaceFirst("_\\d+\\.\\w+", "_"));
    }

    public static boolean d(String string) {
        if (string.toLowerCase().matches("https?://.+\\.bandcamp\\.com(/.*)?")) {
            return true;
        }
        if (string.toLowerCase().matches("https?://bandcamp\\.com(/.*)?")) {
            return false;
        }
        try {
            boolean bl = ((m)((AbstractList)((m)((AbstractList)d.l(l.a().b(p.p(string)).c()).X("cart-wrapper")).get(0)).Y()).get(0)).c("href").equals("https://bandcamp.com/cart");
            return bl;
        }
        catch (k | IOException exception) {
            throw new i("Could not determine whether URL is custom domain (not available? network error?)");
        }
        catch (IndexOutOfBoundsException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static boolean e(String string) {
        return string.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+");
    }

    public static com.github.catvod.spider.merge.p1.b f(String string) {
        try {
            com.github.catvod.spider.merge.p1.b b2 = new com.github.catvod.spider.merge.p1.b(ZonedDateTime.parse(string, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH)).toInstant(), false);
            return b2;
        }
        catch (DateTimeException dateTimeException) {
            throw new i(s.a("Could not parse date '", string, "'"), dateTimeException);
        }
    }
}

