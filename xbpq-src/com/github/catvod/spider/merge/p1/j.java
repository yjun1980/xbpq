/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I1.c;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.p1.b;
import com.github.catvod.spider.merge.p1.f;
import com.github.catvod.spider.merge.p1.g;
import com.github.catvod.spider.merge.p1.h;
import com.github.catvod.spider.merge.p1.i;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public final class j {
    private final c a;
    private final LocalDateTime b;

    public j(c c2, LocalDateTime localDateTime) {
        this.a = c2;
        this.b = localDateTime;
    }

    public static /* synthetic */ boolean a(j j2, String string, String string2) {
        return j2.e(string, string2);
    }

    public static /* synthetic */ boolean b(j j2, String string, Map.Entry entry) {
        Objects.requireNonNull(j2);
        return ((Collection)entry.getValue()).stream().anyMatch(new g(j2, string));
    }

    private b c(int n2, ChronoUnit object) {
        LocalDateTime localDateTime = object == ChronoUnit.YEARS ? this.b.minusYears(n2).minusDays(1L) : this.b.minus(n2, (TemporalUnit)object);
        boolean bl = ((ChronoUnit)object).isDateBased();
        object = localDateTime;
        if (bl) {
            object = localDateTime.truncatedTo(ChronoUnit.DAYS);
        }
        return new b(((LocalDateTime)object).atZone(ZoneId.systemDefault()).toInstant(), bl);
    }

    private boolean e(String string, String string2) {
        if (string.equals(string2)) {
            return true;
        }
        if (this.a.d().isEmpty()) {
            return string.toLowerCase().contains(string2.toLowerCase());
        }
        String string3 = Pattern.quote(string2.toLowerCase());
        string2 = this.a.d().equals(" ") ? "[ \\t\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000\\d]" : Pattern.quote(this.a.d());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(^|");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        stringBuilder.append(string3);
        stringBuilder.append("($|");
        return d.c(r.c(stringBuilder, string2, ")"), string.toLowerCase());
    }

    public final b d(String string) {
        int n2;
        for (Map.Entry entry : ((EnumMap)this.a.c()).entrySet()) {
            ChronoUnit chronoUnit = (ChronoUnit)entry.getKey();
            for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                String string2 = (String)entry2.getKey();
                n2 = (Integer)entry2.getValue();
                if (!this.e(string, string2)) continue;
                return this.c(n2, chronoUnit);
            }
        }
        try {
            n2 = Integer.parseInt(string.replaceAll("\\D+", ""));
        }
        catch (NumberFormatException numberFormatException) {
            n2 = 1;
        }
        return this.c(n2, (ChronoUnit)((EnumMap)this.a.a()).entrySet().stream().filter(new h(this, string)).map(f.a).findFirst().orElseThrow(new i(string, 0)));
    }
}

