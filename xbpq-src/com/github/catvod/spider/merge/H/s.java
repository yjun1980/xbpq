/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.f;
import com.github.catvod.spider.merge.y.d;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

final class s
implements f<Object, Object> {
    s() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object apply(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof java.sql.Date) {
            return (java.sql.Date)object;
        }
        if (object instanceof Date) {
            return new java.sql.Date(((Date)object).getTime());
        }
        if (object instanceof Calendar) {
            return new java.sql.Date(((Calendar)object).getTimeInMillis());
        }
        long l2 = object instanceof BigDecimal ? A.o0((BigDecimal)object) : (object instanceof Number ? ((Number)object).longValue() : 0L);
        if (object instanceof String) {
            String string = (String)object;
            if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) return null;
            if (A.g0(string)) {
                l2 = Long.parseLong(string);
            } else {
                i i2 = new i(string);
                if (!i2.x0(false)) throw new d(e.c("can not cast to Timestamp, value : ", string));
                l2 = i2.S().getTime().getTime();
            }
        }
        if (l2 <= 0L) throw new d(c.a("can not cast to Date, value : ", object));
        return new java.sql.Date(l2);
    }
}

