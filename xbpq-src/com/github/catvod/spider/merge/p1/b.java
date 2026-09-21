/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.n1.i;
import java.io.Serializable;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public final class b
implements Serializable {
    private final Instant a;
    private final boolean b;

    public b(Instant instant, boolean bl) {
        this.a = instant;
        this.b = bl;
    }

    public static b a(String object) {
        if (object != null) {
            try {
                b b2 = new b(Instant.parse((CharSequence)object), false);
                object = b2;
            }
            catch (DateTimeParseException dateTimeParseException) {
                throw new i(s.a("Could not parse date: \"", (String)object, "\""), dateTimeParseException);
            }
        } else {
            object = null;
        }
        return object;
    }

    public static b b(String object) {
        if (object != null) {
            try {
                b b2 = new b(OffsetDateTime.parse((CharSequence)object).toInstant(), false);
                object = b2;
            }
            catch (DateTimeParseException dateTimeParseException) {
                throw new i(s.a("Could not parse date: \"", (String)object, "\""), dateTimeParseException);
            }
        } else {
            object = null;
        }
        return object;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        boolean bl = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DateWrapper{instant=");
        stringBuilder.append(string);
        stringBuilder.append(", isApproximation=");
        stringBuilder.append(bl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

