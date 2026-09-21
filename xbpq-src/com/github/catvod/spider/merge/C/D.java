/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;

public final class D
implements v {
    public static final D a = new D();

    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        object2 = ((b)object).f;
        if (object2.p() == 16) {
            object2.o(4);
            if (object2.p() == 4) {
                object2.a();
                if (object2.p() == 2) {
                    long l2 = object2.h();
                    object2.o(13);
                    if (object2.p() == 13) {
                        object2.o(16);
                        return (T)new Time(l2);
                    }
                    throw new d("syntax error");
                }
                throw new d("syntax error");
            }
            throw new d("syntax error");
        }
        if ((object = ((b)object).o(null)) == null) {
            return null;
        }
        if (object instanceof Time) {
            return (T)object;
        }
        if (object instanceof BigDecimal) {
            return (T)new Time(A.o0((BigDecimal)object));
        }
        if (object instanceof Number) {
            return (T)new Time(((Number)object).longValue());
        }
        if (object instanceof String) {
            long l3;
            object2 = (String)object;
            if (((String)object2).length() == 0) {
                return null;
            }
            object = new i((String)object2);
            char c2 = '\u0001';
            if (((i)object).x0(true)) {
                l3 = ((f)object).S().getTimeInMillis();
            } else {
                char c3;
                block14: {
                    int n2 = 0;
                    while (true) {
                        c3 = c2;
                        if (n2 >= ((String)object2).length()) break block14;
                        c3 = ((String)object2).charAt(n2);
                        if (c3 < '0' || c3 > '9') break;
                        ++n2;
                    }
                    c3 = '\u0000';
                }
                if (c3 == '\u0000') {
                    ((f)object).close();
                    return (T)Time.valueOf((String)object2);
                }
                l3 = Long.parseLong((String)object2);
            }
            ((f)object).close();
            return (T)new Time(l3);
        }
        throw new d("parse error");
    }

    @Override
    public final int e() {
        return 2;
    }
}

