/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A1;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.k1.m;
import com.github.catvod.spider.merge.n1.e;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.p1.b;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class a {
    private static final List<com.github.catvod.spider.merge.K1.c> a;
    private static final List<com.github.catvod.spider.merge.K1.c> b;
    private static String c;
    private static final Pattern d;
    public static final int e = 0;

    static {
        int n2;
        com.github.catvod.spider.merge.K1.c c2 = new com.github.catvod.spider.merge.K1.c("mini", 16, 16, 3);
        int n3 = 0;
        com.github.catvod.spider.merge.K1.c c3 = new com.github.catvod.spider.merge.K1.c("t20x20", 20, 20, 3);
        com.github.catvod.spider.merge.K1.c c4 = new com.github.catvod.spider.merge.K1.c("small", 32, 32, 3);
        com.github.catvod.spider.merge.K1.c c5 = new com.github.catvod.spider.merge.K1.c("badge", 47, 47, 3);
        com.github.catvod.spider.merge.K1.c c6 = new com.github.catvod.spider.merge.K1.c("t50x50", 50, 50, 3);
        com.github.catvod.spider.merge.K1.c c7 = new com.github.catvod.spider.merge.K1.c("t60x60", 60, 60, 3);
        com.github.catvod.spider.merge.K1.c c8 = new com.github.catvod.spider.merge.K1.c("t67x67", 67, 67, 3);
        com.github.catvod.spider.merge.K1.c c9 = new com.github.catvod.spider.merge.K1.c("t80x80", 80, 80, 3);
        com.github.catvod.spider.merge.K1.c c10 = new com.github.catvod.spider.merge.K1.c("large", 100, 100, 3);
        com.github.catvod.spider.merge.K1.c c11 = new com.github.catvod.spider.merge.K1.c("t120x120", 120, 120, 3);
        Object object = new com.github.catvod.spider.merge.K1.c("t200x200", 200, 200, 2);
        com.github.catvod.spider.merge.K1.c c12 = new com.github.catvod.spider.merge.K1.c("t240x240", 240, 240, 2);
        com.github.catvod.spider.merge.K1.c c13 = new com.github.catvod.spider.merge.K1.c("t250x250", 250, 250, 2);
        Serializable serializable = new com.github.catvod.spider.merge.K1.c("t300x300", 300, 300, 2);
        com.github.catvod.spider.merge.K1.c c14 = new com.github.catvod.spider.merge.K1.c("t500x500", 500, 500, 2);
        ArrayList<com.github.catvod.spider.merge.K1.c> arrayList = new ArrayList<com.github.catvod.spider.merge.K1.c>(15);
        for (n2 = 0; n2 < 15; ++n2) {
            com.github.catvod.spider.merge.K1.c c15 = (new com.github.catvod.spider.merge.K1.c[]{c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, object, c12, c13, serializable, c14})[n2];
            Objects.requireNonNull(c15);
            arrayList.add(c15);
        }
        a = Collections.unmodifiableList(arrayList);
        c11 = new com.github.catvod.spider.merge.K1.c("t1240x260", 1240, 260, 2);
        c14 = new com.github.catvod.spider.merge.K1.c("t2480x520", 2480, 520, 2);
        serializable = new ArrayList(2);
        for (n2 = n3; n2 < 2; ++n2) {
            object = (new Object[]{c11, c14})[n2];
            Objects.requireNonNull(object);
            ((ArrayList)serializable).add(object);
        }
        b = Collections.unmodifiableList(serializable);
        d = Pattern.compile("^https?://on.soundcloud.com/[0-9a-zA-Z]+$");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a() {
        synchronized (a.class) {
            Object object;
            if (!p.j(c)) {
                return c;
            }
            Object object2 = l.a();
            Object object3 = com.github.catvod.spider.merge.c1.d.l(((com.github.catvod.spider.merge.m1.a)object2).b("https://soundcloud.com").c()).m0("script[src*=\"sndcdn.com/assets/\"][src$=\".js\"]");
            Collections.reverse(object3);
            Object object4 = new ArrayList(1);
            for (int i2 = 0; i2 < 1; ++i2) {
                object = (new Object[]{"bytes=0-50000"})[i2];
                Objects.requireNonNull(object);
                ((ArrayList)object4).add(object);
            }
            object = com.github.catvod.spider.merge.A.c.c(Collections.unmodifiableList(object4));
            object3 = ((AbstractCollection)object3).iterator();
            while (true) {
                if (!object3.hasNext()) {
                    object2 = new e("Couldn't extract client id");
                    throw object2;
                }
                object4 = ((com.github.catvod.spider.merge.e1.m)object3.next()).c("src");
                boolean bl = p.j((String)object4);
                if (bl) continue;
                try {
                    c = object4 = com.github.catvod.spider.merge.K1.d.f(",client_id:\"(.*?)\"", ((com.github.catvod.spider.merge.m1.a)object2).c((String)object4, (Map<String, List<String>>)object).c(), 1);
                }
                catch (o o2) {
                    continue;
                }
                break;
            }
            return object4;
        }
    }

    public static List<com.github.catvod.spider.merge.k1.c> b(String string) {
        if (p.j(string)) {
            return Collections.emptyList();
        }
        string = string.replace("-large.", "-%s.");
        return a.stream().map(new com.github.catvod.spider.merge.v1.a(string, 1)).collect(Collectors.toList());
    }

    public static List<com.github.catvod.spider.merge.k1.c> c(com.github.catvod.spider.merge.F0.e object) {
        String string = ((com.github.catvod.spider.merge.F0.e)object).i("artwork_url", null);
        if (string != null) {
            return com.github.catvod.spider.merge.A1.a.b(string);
        }
        if ((object = ((com.github.catvod.spider.merge.F0.e)object).g("user").i("avatar_url", null)) != null) {
            return com.github.catvod.spider.merge.A1.a.b((String)object);
        }
        throw new i("Could not get track or track user's thumbnails");
    }

    public static b d(String string) {
        try {
            b b2 = com.github.catvod.spider.merge.p1.b.a(string);
            return b2;
        }
        catch (DateTimeParseException dateTimeParseException) {
            try {
                b b3 = new b(OffsetDateTime.parse(string, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss +0000")).toInstant(), false);
                return b3;
            }
            catch (DateTimeParseException dateTimeParseException2) {
                dateTimeParseException2.addSuppressed(dateTimeParseException);
                throw new i(s.a("Could not parse date: \"", string, "\""), dateTimeParseException2);
            }
        }
    }

    public static String e(String object) {
        Object object2;
        Object object3 = object;
        if (d.matcher((CharSequence)object).find()) {
            try {
                object3 = l.a();
                Objects.requireNonNull(object3);
                object2 = new com.github.catvod.spider.merge.m1.b();
                ((com.github.catvod.spider.merge.m1.b)object2).i((String)object);
                ((com.github.catvod.spider.merge.m1.b)object2).j(null);
                object3 = ((com.github.catvod.spider.merge.m1.a)object3).a(((com.github.catvod.spider.merge.m1.b)object2).g()).b().split("\\?")[0];
            }
            catch (e e2) {
                throw new i("Could not follow on.soundcloud.com redirect", e2);
            }
        }
        object = object3;
        if (((String)object3).charAt(((String)object3).length() - 1) == '/') {
            object = ((String)object3).substring(0, ((String)object3).length() - 1);
        }
        object = p.n(((String)object).toLowerCase());
        try {
            object = p.q((String)object);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException("The given URL is not valid");
        }
        try {
            object3 = p.c(((URL)object).toString());
            object = com.github.catvod.spider.merge.A1.a.a();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("https://api-widget.soundcloud.com/resolve?url=");
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append("&format=json&client_id=");
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object = l.a().d((String)object, null, m.a.b()).c();
            object = String.valueOf(f.i(g.d().a((String)object), "id"));
            return object;
        }
        catch (e e3) {
            throw new i("Could not resolve id with embedded player. ClientId not extracted", e3);
        }
        catch (h h2) {
            throw new i("Could not parse JSON response", h2);
        }
    }

    public static String f(String string) {
        return com.github.catvod.spider.merge.c1.d.l(l.a().d(com.github.catvod.spider.merge.B.e.c("https://w.soundcloud.com/player/?url=", p.c(string)), null, m.a.b()).c()).m0("link[rel=\"canonical\"]").f().c("abs:href");
    }
}

