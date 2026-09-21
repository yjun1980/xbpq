/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joda.time.DateTime
 *  org.joda.time.DateTimeZone
 *  org.joda.time.Duration
 *  org.joda.time.Instant
 *  org.joda.time.LocalDate
 *  org.joda.time.LocalDateTime
 *  org.joda.time.LocalTime
 *  org.joda.time.Period
 *  org.joda.time.ReadablePartial
 *  org.joda.time.format.DateTimeFormat
 *  org.joda.time.format.DateTimeFormatter
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.d;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.D.w;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public final class N
implements X,
w,
v {
    public static final N a = new N();
    private static final DateTimeFormatter b = DateTimeFormat.forPattern((String)"yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter c = DateTimeFormat.forPattern((String)"yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter d = DateTimeFormat.forPattern((String)"yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter e = DateTimeFormat.forPattern((String)"yyyy\u5e74M\u6708d\u65e5 HH:mm:ss");
    private static final DateTimeFormatter f = DateTimeFormat.forPattern((String)"yyyy\u5e74M\u6708d\u65e5 H\u65f6m\u5206s\u79d2");
    private static final DateTimeFormatter g = DateTimeFormat.forPattern((String)"yyyy\ub144M\uc6d4d\uc77c HH:mm:ss");
    private static final DateTimeFormatter h = DateTimeFormat.forPattern((String)"MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter i = DateTimeFormat.forPattern((String)"dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter j = DateTimeFormat.forPattern((String)"dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter k = DateTimeFormat.forPattern((String)"dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter l = DateTimeFormat.forPattern((String)"yyyyMMdd");
    private static final DateTimeFormatter m = DateTimeFormat.forPattern((String)"yyyy/MM/dd");
    private static final DateTimeFormatter n = DateTimeFormat.forPattern((String)"yyyy\u5e74M\u6708d\u65e5");
    private static final DateTimeFormatter o = DateTimeFormat.forPattern((String)"yyyy\ub144M\uc6d4d\uc77c");
    private static final DateTimeFormatter p = DateTimeFormat.forPattern((String)"MM/dd/yyyy");
    private static final DateTimeFormatter q = DateTimeFormat.forPattern((String)"dd/MM/yyyy");
    private static final DateTimeFormatter r = DateTimeFormat.forPattern((String)"dd.MM.yyyy");
    private static final DateTimeFormatter s = DateTimeFormat.forPattern((String)"dd-MM-yyyy");
    private static final DateTimeFormatter t = DateTimeFormat.forPattern((String)"yyyy-MM-dd HH:mm:ss").withZone(DateTimeZone.getDefault());
    private static final DateTimeFormatter u = DateTimeFormat.forPattern((String)"yyyy-MM-dd'T'HH:mm:ss");

    private void j(h0 h02, ReadablePartial readablePartial, String string) {
        string = string.equals("yyyy-MM-dd'T'HH:mm:ss") ? u : DateTimeFormat.forPattern((String)string);
        h02.v(string.print(readablePartial));
    }

    @Override
    public final void b(L object, Object object2, k object3) {
        object = ((L)object).j;
        object3 = ((k)object3).b();
        this.j((h0)object, (ReadablePartial)object2, (String)object3);
    }

    @Override
    public final <T> T c(b b2, Type type, Object object) {
        return this.f(b2, type, object, null, 0);
    }

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        h0 h02 = l2.j;
        if (object == null) {
            h02.s();
        } else {
            object2 = type;
            if (type == null) {
                object2 = object.getClass();
            }
            if (object2 == LocalDateTime.class) {
                i0 i02 = i0.g;
                int n3 = i02.a;
                type = (LocalDateTime)object;
                object = object2 = l2.m();
                if (object2 == null) {
                    object = (n2 & n3) == 0 && !l2.j.g(i02) ? (l2.p(i0.s) ? com.github.catvod.spider.merge.y.a.e : (type.getMillisOfSecond() == 0 ? "yyyy-MM-dd'T'HH:mm:ss.SSS" : "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS")) : "yyyy-MM-dd'T'HH:mm:ss";
                }
                if (object != null) {
                    this.j(h02, (ReadablePartial)type, (String)object);
                } else {
                    h02.r(type.toDateTime(DateTimeZone.forTimeZone((TimeZone)com.github.catvod.spider.merge.y.a.a)).toInstant().getMillis());
                }
            } else {
                h02.v(object.toString());
            }
        }
    }

    @Override
    public final int e() {
        return 4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final <T> T f(b object, Type object2, Object object3, String string, int n2) {
        d d2 = ((b)object).f;
        n2 = d2.p();
        object3 = null;
        if (n2 == 8) {
            d2.nextToken();
            return null;
        }
        if (d2.p() == 4) {
            string = d2.K();
            d2.nextToken();
            if ("".equals(string)) {
                return null;
            }
            if (object2 == LocalDateTime.class) {
                object = string.length() != 10 && string.length() != 8 ? this.g(string, null) : this.h(string, null).toLocalDateTime(LocalTime.MIDNIGHT);
                return (T)object;
            }
            if (object2 == LocalDate.class) {
                object = string.length() == 23 ? LocalDateTime.parse((String)string).toLocalDate() : this.h(string, null);
                return (T)object;
            }
            if (object2 == LocalTime.class) {
                object = string.length() == 23 ? LocalDateTime.parse((String)string).toLocalTime() : LocalTime.parse((String)string);
                return (T)object;
            }
            if (object2 == DateTime.class) {
                object = object3;
                if (b != null) return (T)this.i(string, (DateTimeFormatter)object);
                object = t;
                return (T)this.i(string, (DateTimeFormatter)object);
            }
            if (object2 == DateTimeZone.class) {
                return (T)DateTimeZone.forID((String)string);
            }
            if (object2 == Period.class) {
                return (T)Period.parse((String)string);
            }
            if (object2 == Duration.class) {
                return (T)Duration.parse((String)string);
            }
            if (object2 == Instant.class) {
                boolean bl;
                block20: {
                    boolean bl2 = false;
                    for (n2 = 0; n2 < string.length(); ++n2) {
                        char c2 = string.charAt(n2);
                        bl = bl2;
                        if (c2 >= '0') {
                            if (c2 <= '9') continue;
                            bl = bl2;
                        }
                        break block20;
                    }
                    bl = true;
                }
                if (!bl || string.length() <= 8 || string.length() >= 19) return (T)Instant.parse((String)string);
                return (T)new Instant(Long.parseLong(string));
            }
            if (object2 != DateTimeFormatter.class) return null;
            return (T)DateTimeFormat.forPattern((String)string);
        }
        if (d2.p() == 2) {
            long l2 = d2.h();
            d2.nextToken();
            object = object3 = com.github.catvod.spider.merge.y.a.a;
            if (object3 == null) {
                object = TimeZone.getDefault();
            }
            if (object2 == DateTime.class) {
                return (T)new DateTime(l2, DateTimeZone.forTimeZone((TimeZone)object));
            }
            object = new LocalDateTime(l2, DateTimeZone.forTimeZone((TimeZone)object));
            if (object2 == LocalDateTime.class) {
                return (T)object;
            }
            if (object2 == LocalDate.class) {
                return (T)object.toLocalDate();
            }
            if (object2 == LocalTime.class) {
                return (T)object.toLocalTime();
            }
            if (object2 != Instant.class) throw new UnsupportedOperationException();
            return (T)new Instant(l2);
        }
        if (d2.p() != 12) throw new UnsupportedOperationException();
        object = ((b)object).s();
        if (object2 != Instant.class) return null;
        object2 = ((e)object).get("epochSecond");
        if (object2 instanceof Number) {
            return (T)Instant.ofEpochSecond((long)A.n0((Number)object2));
        }
        if (!((object = ((e)object).get("millis")) instanceof Number)) return null;
        return (T)Instant.ofEpochMilli((long)A.n0((Number)object));
    }

    protected final LocalDateTime g(String string, DateTimeFormatter dateTimeFormatter) {
        block20: {
            Object object;
            int n2;
            block19: {
                int n3;
                char c2;
                int n4;
                block22: {
                    char c3;
                    char c4;
                    char c5;
                    block21: {
                        block25: {
                            block26: {
                                block27: {
                                    block24: {
                                        block23: {
                                            if (dateTimeFormatter != null) break block20;
                                            n2 = string.length();
                                            n4 = 0;
                                            if (n2 != 19) break block21;
                                            n2 = string.charAt(4);
                                            c2 = string.charAt(7);
                                            c5 = string.charAt(10);
                                            c4 = string.charAt(13);
                                            n3 = string.charAt(16);
                                            if (c4 != ':' || n3 != 58) break block22;
                                            if (n2 != 45 || c2 != '-') break block23;
                                            if (c5 == 'T') {
                                                dateTimeFormatter = u;
                                            } else if (c5 == ' ') {
                                                dateTimeFormatter = b;
                                            }
                                            break block22;
                                        }
                                        if (n2 != 47 || c2 != '/') break block24;
                                        dateTimeFormatter = d;
                                        break block22;
                                    }
                                    c2 = string.charAt(0);
                                    c4 = string.charAt(1);
                                    c5 = string.charAt(2);
                                    c3 = string.charAt(3);
                                    n3 = string.charAt(5);
                                    if (c5 != '/' || n3 != 47) break block25;
                                    if (c4 - 48 + (c2 - 48) * 10 > 12) break block26;
                                    if (n2 - 48 + (c3 - 48) * 10 <= 12 && !((String)(object = Locale.getDefault().getCountry())).equals("US")) break block27;
                                    dateTimeFormatter = h;
                                    break block22;
                                }
                                if (!((String)object).equals("BR") && !((String)object).equals("AU")) break block22;
                            }
                            dateTimeFormatter = i;
                            break block22;
                        }
                        if (c5 == '.' && n3 == 46) {
                            dateTimeFormatter = j;
                        } else if (c5 == '-' && n3 == 45) {
                            dateTimeFormatter = k;
                        }
                        break block22;
                    }
                    if (string.length() == 23) {
                        c3 = string.charAt(4);
                        n3 = string.charAt(7);
                        c5 = string.charAt(10);
                        c2 = string.charAt(13);
                        c4 = string.charAt(16);
                        n2 = string.charAt(19);
                        if (c2 == ':' && c4 == ':' && c3 == '-' && n3 == 45 && c5 == ' ' && n2 == 46) {
                            dateTimeFormatter = c;
                        }
                    }
                }
                object = dateTimeFormatter;
                if (string.length() >= 17) {
                    n2 = string.charAt(4);
                    if (n2 == 24180) {
                        object = string.charAt(string.length() - 1) == '\u79d2' ? f : e;
                    } else {
                        object = dateTimeFormatter;
                        if (n2 == 45380) {
                            object = g;
                        }
                    }
                }
                for (n3 = 0; n3 < string.length(); ++n3) {
                    c2 = string.charAt(n3);
                    n2 = n4;
                    if (c2 >= '0') {
                        if (c2 <= '9') continue;
                        n2 = n4;
                    }
                    break block19;
                }
                n2 = 1;
            }
            dateTimeFormatter = object;
            if (n2 != 0) {
                dateTimeFormatter = object;
                if (string.length() > 8) {
                    dateTimeFormatter = object;
                    if (string.length() < 19) {
                        return new LocalDateTime(Long.parseLong(string), DateTimeZone.forTimeZone((TimeZone)com.github.catvod.spider.merge.y.a.a));
                    }
                }
            }
        }
        string = dateTimeFormatter == null ? LocalDateTime.parse((String)string) : LocalDateTime.parse((String)string, (DateTimeFormatter)dateTimeFormatter);
        return string;
    }

    protected final LocalDate h(String string, DateTimeFormatter dateTimeFormatter) {
        DateTimeFormatter dateTimeFormatter2;
        block19: {
            int n2;
            Object object;
            block18: {
                char c2;
                int n3;
                int n4;
                block20: {
                    char c3;
                    block21: {
                        block22: {
                            block23: {
                                dateTimeFormatter2 = dateTimeFormatter;
                                if (dateTimeFormatter != null) break block19;
                                object = dateTimeFormatter;
                                if (string.length() == 8) {
                                    object = l;
                                }
                                n2 = string.length();
                                n4 = 0;
                                dateTimeFormatter = object;
                                if (n2 != 10) break block20;
                                n2 = string.charAt(4);
                                n3 = string.charAt(7);
                                dateTimeFormatter2 = object;
                                if (n2 == 47) {
                                    dateTimeFormatter2 = object;
                                    if (n3 == 47) {
                                        dateTimeFormatter2 = m;
                                    }
                                }
                                n3 = string.charAt(0);
                                char c4 = string.charAt(1);
                                c3 = string.charAt(2);
                                char c5 = string.charAt(3);
                                c2 = string.charAt(5);
                                if (c3 != '/' || c2 != '/') break block21;
                                if (c4 - 48 + (n3 - 48) * 10 > 12) break block22;
                                if (n2 - 48 + (c5 - 48) * 10 <= 12 && !((String)(object = Locale.getDefault().getCountry())).equals("US")) break block23;
                                dateTimeFormatter = p;
                                break block20;
                            }
                            if (((String)object).equals("BR")) break block22;
                            dateTimeFormatter = dateTimeFormatter2;
                            if (!((String)object).equals("AU")) break block20;
                        }
                        dateTimeFormatter = q;
                        break block20;
                    }
                    if (c3 == '.' && c2 == '.') {
                        dateTimeFormatter = r;
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        if (c3 == '-') {
                            dateTimeFormatter = dateTimeFormatter2;
                            if (c2 == '-') {
                                dateTimeFormatter = s;
                            }
                        }
                    }
                }
                object = dateTimeFormatter;
                if (string.length() >= 9) {
                    n2 = string.charAt(4);
                    if (n2 == 24180) {
                        object = n;
                    } else {
                        object = dateTimeFormatter;
                        if (n2 == 45380) {
                            object = o;
                        }
                    }
                }
                for (n3 = 0; n3 < string.length(); ++n3) {
                    c2 = string.charAt(n3);
                    n2 = n4;
                    if (c2 >= '0') {
                        if (c2 <= '9') continue;
                        n2 = n4;
                    }
                    break block18;
                }
                n2 = 1;
            }
            dateTimeFormatter2 = object;
            if (n2 != 0) {
                dateTimeFormatter2 = object;
                if (string.length() > 8) {
                    dateTimeFormatter2 = object;
                    if (string.length() < 19) {
                        return new LocalDateTime(Long.parseLong(string), DateTimeZone.forTimeZone((TimeZone)com.github.catvod.spider.merge.y.a.a)).toLocalDate();
                    }
                }
            }
        }
        string = dateTimeFormatter2 == null ? LocalDate.parse((String)string) : LocalDate.parse((String)string, (DateTimeFormatter)dateTimeFormatter2);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final DateTime i(String string, DateTimeFormatter dateTimeFormatter) {
        Object object;
        block13: {
            char c2;
            DateTimeFormatter dateTimeFormatter2;
            block14: {
                char c3;
                char c4;
                block17: {
                    block18: {
                        block19: {
                            char c5;
                            char c6;
                            block16: {
                                block15: {
                                    object = dateTimeFormatter;
                                    if (dateTimeFormatter != null) break block13;
                                    dateTimeFormatter2 = dateTimeFormatter;
                                    if (string.length() != 19) break block14;
                                    c2 = string.charAt(4);
                                    c4 = string.charAt(7);
                                    c6 = string.charAt(10);
                                    c5 = string.charAt(13);
                                    c3 = string.charAt(16);
                                    dateTimeFormatter2 = dateTimeFormatter;
                                    if (c5 != ':') break block14;
                                    dateTimeFormatter2 = dateTimeFormatter;
                                    if (c3 != ':') break block14;
                                    if (c2 != '-' || c4 != '-') break block15;
                                    if (c6 == 'T') {
                                        dateTimeFormatter2 = u;
                                        break block14;
                                    } else {
                                        dateTimeFormatter2 = dateTimeFormatter;
                                        if (c6 == ' ') {
                                            dateTimeFormatter2 = b;
                                        }
                                    }
                                    break block14;
                                }
                                if (c2 != '/' || c4 != '/') break block16;
                                dateTimeFormatter2 = d;
                                break block14;
                            }
                            c5 = string.charAt(0);
                            char c7 = string.charAt(1);
                            c3 = string.charAt(2);
                            c6 = string.charAt(3);
                            c4 = string.charAt(5);
                            if (c3 != '/' || c4 != '/') break block17;
                            if (c7 - 48 + (c5 - 48) * 10 > 12) break block18;
                            if (c2 - 48 + (c6 - 48) * 10 <= 12 && !((String)(object = Locale.getDefault().getCountry())).equals("US")) break block19;
                            dateTimeFormatter2 = h;
                            break block14;
                        }
                        if (((String)object).equals("BR")) break block18;
                        dateTimeFormatter2 = dateTimeFormatter;
                        if (!((String)object).equals("AU")) break block14;
                    }
                    dateTimeFormatter2 = i;
                    break block14;
                }
                if (c3 == '.' && c4 == '.') {
                    dateTimeFormatter2 = j;
                } else {
                    dateTimeFormatter2 = dateTimeFormatter;
                    if (c3 == '-') {
                        dateTimeFormatter2 = dateTimeFormatter;
                        if (c4 == '-') {
                            dateTimeFormatter2 = k;
                        }
                    }
                }
            }
            object = dateTimeFormatter2;
            if (string.length() >= 17) {
                c2 = string.charAt(4);
                if (c2 == '\u5e74') {
                    object = string.charAt(string.length() - 1) == '\u79d2' ? f : e;
                } else {
                    object = dateTimeFormatter2;
                    if (c2 == '\ub144') {
                        object = g;
                    }
                }
            }
        }
        if (object != null) return DateTime.parse((String)string, (DateTimeFormatter)object);
        return DateTime.parse((String)string);
    }
}

