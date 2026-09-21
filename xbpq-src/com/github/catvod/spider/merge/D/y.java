/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public final class y
extends com.github.catvod.spider.merge.C.d
implements X {
    public static final y a = new y();

    @Override
    public final void d(L object, Object object2, Object object3, Type object4, int n2) {
        block33: {
            long l2;
            h0 h02;
            block24: {
                block26: {
                    float f2;
                    int n3;
                    block30: {
                        block32: {
                            block31: {
                                block29: {
                                    block28: {
                                        block27: {
                                            block25: {
                                                h02 = ((L)object).j;
                                                if (object2 == null) {
                                                    h02.s();
                                                    return;
                                                }
                                                Class<?> clazz = object2.getClass();
                                                if (clazz == Date.class && !h02.g(i0.s) && ((l2 = ((Date)object2).getTime()) + (long)((L)object).q.getOffset(l2)) % 86400000L == 0L && !i0.b(h02.c, n2, i0.o)) {
                                                    h02.v(object2.toString());
                                                    return;
                                                }
                                                if (clazz == Time.class) {
                                                    l2 = ((Time)object2).getTime();
                                                    if ("unixtime".equals(((L)object).m())) {
                                                        h02.r(l2 / 1000L);
                                                        return;
                                                    }
                                                    if ("millis".equals(((L)object).m())) {
                                                        h02.r(l2);
                                                        return;
                                                    }
                                                    if (l2 < 86400000L) {
                                                        h02.v(object2.toString());
                                                        return;
                                                    }
                                                }
                                                n3 = clazz == Timestamp.class ? ((Timestamp)object2).getNanos() : 0;
                                                object3 = object2 instanceof java.util.Date ? (java.util.Date)object2 : A.l(object2, null);
                                                if ("unixtime".equals(((L)object).m())) {
                                                    h02.r(((java.util.Date)object3).getTime() / 1000L);
                                                    return;
                                                }
                                                if ("millis".equals(((L)object).m())) {
                                                    h02.r(((java.util.Date)object3).getTime());
                                                    return;
                                                }
                                                if (h02.g(i0.s)) {
                                                    object2 = object4 = ((L)object).l();
                                                    if (object4 == null) {
                                                        object2 = new SimpleDateFormat(com.github.catvod.spider.merge.y.a.e, ((L)object).r);
                                                        ((DateFormat)object2).setTimeZone(((L)object).q);
                                                    }
                                                    h02.v(((DateFormat)object2).format((java.util.Date)object3));
                                                    return;
                                                }
                                                if (h02.g(i0.o) && clazz != object4) {
                                                    if (clazz == java.util.Date.class) {
                                                        h02.write("new Date(");
                                                        h02.r(((java.util.Date)object2).getTime());
                                                        n2 = 41;
                                                    } else {
                                                        h02.write(123);
                                                        h02.j(com.github.catvod.spider.merge.y.a.c);
                                                        ((L)object).v(clazz.getName());
                                                        h02.l(',', "val", ((java.util.Date)object2).getTime());
                                                        n2 = 125;
                                                    }
                                                    h02.write(n2);
                                                    return;
                                                }
                                                l2 = ((java.util.Date)object3).getTime();
                                                if (!h02.g(i0.g)) break block24;
                                                n2 = h02.g(i0.c) ? 39 : 34;
                                                h02.write(n2);
                                                object2 = Calendar.getInstance(((L)object).q, ((L)object).r);
                                                ((Calendar)object2).setTimeInMillis(l2);
                                                int n4 = ((Calendar)object2).get(1);
                                                int n5 = ((Calendar)object2).get(2) + 1;
                                                int n6 = ((Calendar)object2).get(5);
                                                int n7 = ((Calendar)object2).get(11);
                                                int n8 = ((Calendar)object2).get(12);
                                                int n9 = ((Calendar)object2).get(13);
                                                int n10 = ((Calendar)object2).get(14);
                                                if (n3 > 0) {
                                                    object = "0000-00-00 00:00:00.000000000".toCharArray();
                                                    i.c(n3, 29, (char[])object);
                                                    i.c(n9, 19, (char[])object);
                                                    i.c(n8, 16, (char[])object);
                                                    i.c(n7, 13, (char[])object);
                                                    i.c(n6, 10, (char[])object);
                                                    i.c(n5, 7, (char[])object);
                                                    i.c(n4, 4, (char[])object);
                                                } else if (n10 != 0) {
                                                    object = "0000-00-00T00:00:00.000".toCharArray();
                                                    i.c(n10, 23, (char[])object);
                                                    i.c(n9, 19, (char[])object);
                                                    i.c(n8, 16, (char[])object);
                                                    i.c(n7, 13, (char[])object);
                                                    i.c(n6, 10, (char[])object);
                                                    i.c(n5, 7, (char[])object);
                                                    i.c(n4, 4, (char[])object);
                                                } else if (n9 == 0 && n8 == 0 && n7 == 0) {
                                                    object = "0000-00-00".toCharArray();
                                                    i.c(n6, 10, (char[])object);
                                                    i.c(n5, 7, (char[])object);
                                                    i.c(n4, 4, (char[])object);
                                                } else {
                                                    object = "0000-00-00T00:00:00".toCharArray();
                                                    i.c(n9, 19, (char[])object);
                                                    i.c(n8, 16, (char[])object);
                                                    i.c(n7, 13, (char[])object);
                                                    i.c(n6, 10, (char[])object);
                                                    i.c(n5, 7, (char[])object);
                                                    i.c(n4, 4, (char[])object);
                                                }
                                                if (n3 > 0) {
                                                    for (n3 = 0; n3 < 9 && object[((Object)object).length - n3 - 1] == 48; ++n3) {
                                                    }
                                                    h02.write((char[])object, 0, ((Object)object).length - n3);
                                                    h02.write(n2);
                                                    return;
                                                }
                                                h02.write((char[])object);
                                                f2 = (float)((Calendar)object2).getTimeZone().getOffset(((Calendar)object2).getTimeInMillis()) / 3600000.0f;
                                                n3 = (int)f2;
                                                if ((double)n3 != 0.0) break block25;
                                                h02.write(90);
                                                break block26;
                                            }
                                            if (n3 <= 9) break block27;
                                            h02.write(43);
                                            break block28;
                                        }
                                        if (n3 <= 0) break block29;
                                        h02.write(43);
                                        h02.write(48);
                                    }
                                    h02.q(n3);
                                    break block30;
                                }
                                if (n3 >= -9) break block31;
                                h02.write(45);
                                break block32;
                            }
                            if (n3 >= 0) break block30;
                            h02.write(45);
                            h02.write(48);
                        }
                        h02.q(-n3);
                    }
                    h02.write(58);
                    h02.b(String.format("%02d", (int)(Math.abs(f2 - (float)n3) * 60.0f)));
                }
                h02.write(n2);
                break block33;
            }
            h02.r(l2);
        }
    }

    @Override
    public final int e() {
        return 2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final Object g(b object, Type type, Object object2) {
        block25: {
            Object object3;
            block26: {
                block28: {
                    int n2;
                    TimeZone timeZone;
                    block27: {
                        block21: {
                            block22: {
                                timeZone = null;
                                if (object2 == null) {
                                    return null;
                                }
                                if (object2 instanceof java.util.Date) {
                                    return object2;
                                }
                                if (object2 instanceof BigDecimal) {
                                    return new java.util.Date(A.o0((BigDecimal)object2));
                                }
                                if (object2 instanceof Number) {
                                    return new java.util.Date(((Number)object2).longValue());
                                }
                                if (!(object2 instanceof String)) break block25;
                                object3 = (String)object2;
                                if (((String)object3).length() == 0) {
                                    return null;
                                }
                                object2 = object3;
                                if (((String)object3).length() == 23) {
                                    object2 = object3;
                                    if (((String)object3).endsWith(" 000")) {
                                        object2 = ((String)object3).substring(0, 19);
                                    }
                                }
                                object3 = new com.github.catvod.spider.merge.B.i((String)object2);
                                if (!((com.github.catvod.spider.merge.B.i)object3).x0(false)) break block21;
                                object = ((f)object3).S();
                                if (type != Calendar.class) break block22;
                                ((f)object3).close();
                                return object;
                            }
                            object = ((Calendar)object).getTime();
                            return object;
                        }
                        ((f)object3).close();
                        object3 = ((b)object).g();
                        n2 = !(((String)object2).length() == ((String)object3).length() || ((String)object2).length() == 22 && ((String)object3).equals("yyyyMMddHHmmssSSSZ") || ((String)object2).indexOf(84) != -1 && ((String)object3).contains("'T'") && ((String)object2).length() + 2 == ((String)object3).length()) ? 0 : 1;
                        if (n2 != 0) {
                            object = ((b)object).h();
                            try {
                                object = ((DateFormat)object).parse((String)object2);
                                return object;
                            }
                            catch (ParseException parseException) {
                                // empty catch block
                            }
                        }
                        object = object2;
                        if (((String)object2).startsWith("/Date(")) {
                            object = object2;
                            if (((String)object2).endsWith(")/")) {
                                object = ((String)object2).substring(6, ((String)object2).length() - 2);
                            }
                        }
                        object2 = timeZone;
                        if ("0000-00-00".equals(object)) break block26;
                        object2 = timeZone;
                        if ("0000-00-00T00:00:00".equalsIgnoreCase((String)object)) break block26;
                        if (!"0001-01-01T00:00:00+08:00".equalsIgnoreCase((String)object)) break block27;
                        object2 = timeZone;
                        break block26;
                    }
                    n2 = ((String)object).lastIndexOf(124);
                    if (n2 > 20 && !"GMT".equals((timeZone = TimeZone.getTimeZone(((String)object).substring(n2 + 1))).getID())) {
                        block23: {
                            block24: {
                                object2 = new com.github.catvod.spider.merge.B.i(((String)object).substring(0, n2));
                                if (!((com.github.catvod.spider.merge.B.i)object2).x0(false)) break block23;
                                object = ((f)object2).S();
                                ((Calendar)object).setTimeZone(timeZone);
                                if (type != Calendar.class) break block24;
                                ((f)object2).close();
                                return object;
                            }
                            object = ((Calendar)object).getTime();
                            return object;
                        }
                        ((f)object2).close();
                        break block28;
                        finally {
                            ((f)object2).close();
                        }
                    }
                }
                object2 = new java.util.Date(Long.parseLong((String)object));
            }
            return object2;
            finally {
                ((f)object3).close();
            }
        }
        throw new d("parse error");
    }
}

