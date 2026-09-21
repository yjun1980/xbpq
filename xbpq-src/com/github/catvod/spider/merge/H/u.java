/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.f;
import com.github.catvod.spider.merge.y.d;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

final class u
implements f<Object, Object> {
    u() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object apply(Object object) {
        int n2;
        Object object2;
        long l2;
        block15: {
            block14: {
                block13: {
                    if (object == null) {
                        return null;
                    }
                    if (object instanceof Calendar) {
                        return new Timestamp(((Calendar)object).getTimeInMillis());
                    }
                    if (object instanceof Timestamp) {
                        return (Timestamp)object;
                    }
                    if (object instanceof Date) {
                        return new Timestamp(((Date)object).getTime());
                    }
                    l2 = 0L;
                    if (object instanceof BigDecimal) {
                        l2 = A.o0((BigDecimal)object);
                    } else if (object instanceof Number) {
                        l2 = ((Number)object).longValue();
                    }
                    if (!(object instanceof String)) return new Timestamp(l2);
                    object2 = (String)object;
                    if (((String)object2).length() == 0 || "null".equals(object2) || "NULL".equals(object2)) return null;
                    if (!((String)object2).endsWith(".000000000")) break block13;
                    n2 = ((String)object2).length() - 10;
                    break block14;
                }
                object = object2;
                if (!((String)object2).endsWith(".000000")) break block15;
                n2 = ((String)object2).length() - 7;
            }
            object = ((String)object2).substring(0, n2);
        }
        if (((String)object).length() == 29 && ((String)object).charAt(4) == '-' && ((String)object).charAt(7) == '-' && ((String)object).charAt(10) == ' ' && ((String)object).charAt(13) == ':' && ((String)object).charAt(16) == ':' && ((String)object).charAt(19) == '.') {
            int n3 = ((String)object).charAt(0);
            n2 = ((String)object).charAt(1);
            int n4 = ((String)object).charAt(2);
            int n5 = ((String)object).charAt(3);
            n2 = n3 >= 48 && n3 <= 57 && n2 >= 48 && n2 <= 57 && n4 >= 48 && n4 <= 57 && n5 >= 48 && n5 <= 57 ? n5 - 48 + ((n4 - 48) * 10 + ((n2 - 48) * 100 + (n3 - 48) * 1000)) : -1;
            int n6 = A.q0(((String)object).charAt(5), ((String)object).charAt(6));
            int n7 = A.q0(((String)object).charAt(8), ((String)object).charAt(9));
            n4 = A.q0(((String)object).charAt(11), ((String)object).charAt(12));
            n5 = A.q0(((String)object).charAt(14), ((String)object).charAt(15));
            int n8 = A.q0(((String)object).charAt(17), ((String)object).charAt(18));
            char c2 = ((String)object).charAt(20);
            char c3 = ((String)object).charAt(21);
            n3 = ((String)object).charAt(22);
            char c4 = ((String)object).charAt(23);
            char c5 = ((String)object).charAt(24);
            char c6 = ((String)object).charAt(25);
            char c7 = ((String)object).charAt(26);
            char c8 = ((String)object).charAt(27);
            char c9 = ((String)object).charAt(28);
            n3 = c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && n3 >= 48 && n3 <= 57 && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9' && c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9' ? c9 - 48 + ((c8 - 48) * 10 + ((c7 - 48) * 100 + ((c6 - 48) * 1000 + ((c5 - 48) * 10000 + ((c4 - 48) * 100000 + ((n3 - 48) * 1000000 + ((c3 - 48) * 10000000 + (c2 - 48) * 100000000))))))) : -1;
            return new Timestamp(n2 - 1900, n6 - 1, n7, n4, n5, n8, n3);
        }
        if (A.g0((String)object)) {
            l2 = Long.parseLong((String)object);
            return new Timestamp(l2);
        } else {
            object2 = new i((String)object);
            if (!((i)object2).x0(false)) throw new d(e.c("can not cast to Timestamp, value : ", (String)object));
            l2 = ((com.github.catvod.spider.merge.B.f)object2).S().getTime().getTime();
        }
        return new Timestamp(l2);
    }
}

