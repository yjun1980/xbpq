/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.C.g;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.D.w;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.a;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.TimeZone;

public final class s
extends g
implements X,
w {
    public static final s a = new s();
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter c = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5 HH:mm:ss");
    private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5 H\u65f6m\u5206s\u79d2");
    private static final DateTimeFormatter g = DateTimeFormatter.ofPattern("yyyy\ub144M\uc6d4d\uc77c HH:mm:ss");
    private static final DateTimeFormatter h = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter i = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter j = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter k = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter l = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter n = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5");
    private static final DateTimeFormatter o = DateTimeFormatter.ofPattern("yyyy\ub144M\uc6d4d\uc77c");
    private static final DateTimeFormatter p = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter q = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter r = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter s = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
    private static final DateTimeFormatter u = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static Object g(Object object, String object2) {
        if (object == null) {
            return null;
        }
        object2 = DateTimeFormatter.ofPattern((String)object2);
        return LocalDateTime.parse(object.toString(), (DateTimeFormatter)object2);
    }

    private void i(h0 h02, TemporalAccessor temporalAccessor, String object) {
        if ("unixtime".equals(object)) {
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                h02.q((int)((ChronoZonedDateTime)temporalAccessor).toEpochSecond());
                return;
            }
            if (temporalAccessor instanceof LocalDateTime) {
                h02.q((int)((LocalDateTime)temporalAccessor).atZone(com.github.catvod.spider.merge.y.a.a.toZoneId()).toEpochSecond());
                return;
            }
        }
        if ("millis".equals(object)) {
            Instant instant = null;
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                instant = ((ChronoZonedDateTime)temporalAccessor).toInstant();
            } else if (temporalAccessor instanceof LocalDateTime) {
                instant = ((LocalDateTime)temporalAccessor).atZone(com.github.catvod.spider.merge.y.a.a.toZoneId()).toInstant();
            }
            if (instant != null) {
                h02.r(instant.toEpochMilli());
                return;
            }
        }
        object = object == "yyyy-MM-dd'T'HH:mm:ss" ? u : DateTimeFormatter.ofPattern((String)object);
        h02.v(((DateTimeFormatter)object).format(temporalAccessor));
    }

    @Override
    public final void b(L object, Object object2, k object3) {
        object = ((L)object).j;
        object3 = ((k)object3).b();
        this.i((h0)object, (TemporalAccessor)object2, (String)object3);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(L var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) {
        block8: {
            block9: {
                block10: {
                    block7: {
                        var7_6 = var1_1.j;
                        if (var2_2 != null) break block7;
                        var7_6.s();
                        break block8;
                    }
                    var3_3 = var4_4;
                    if (var4_4 == null) {
                        var3_3 = var2_2.getClass();
                    }
                    if (var3_3 != LocalDateTime.class) break block9;
                    var8_7 = i0.g;
                    var6_8 = var8_7.a;
                    var4_4 = (LocalDateTime)var2_2;
                    var2_2 = var3_3 = var1_1.m();
                    if (var3_3 != null) break block10;
                    if ((var5_5 & var6_8) != 0 || var1_1.j.g(var8_7)) ** GOTO lbl-1000
                    if (var1_1.p(i0.s)) {
                        var2_2 = com.github.catvod.spider.merge.y.a.e;
                    } else {
                        var5_5 = var4_4.getNano();
                        if (var5_5 != 0) {
                            var2_2 = var5_5 % 1000000 == 0 ? "yyyy-MM-dd'T'HH:mm:ss.SSS" : "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = "yyyy-MM-dd'T'HH:mm:ss";
                        }
                    }
                }
                if (var2_2 != null) {
                    this.i(var7_6, (TemporalAccessor)var4_4, (String)var2_2);
                } else {
                    var7_6.r(var4_4.atZone(com.github.catvod.spider.merge.y.a.a.toZoneId()).toInstant().toEpochMilli());
                }
                break block8;
            }
            var7_6.v(var2_2.toString());
        }
    }

    @Override
    public final int e() {
        return 4;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final <T> T f(b var1_1, Type var2_2, Object var3_3, String var4_4, int var5_5) {
        block100: {
            block99: {
                block78: {
                    block91: {
                        block76: {
                            block94: {
                                block96: {
                                    block97: {
                                        block98: {
                                            block95: {
                                                block92: {
                                                    block93: {
                                                        block79: {
                                                            block90: {
                                                                block80: {
                                                                    block74: {
                                                                        block89: {
                                                                            block81: {
                                                                                block83: {
                                                                                    block82: {
                                                                                        block86: {
                                                                                            block87: {
                                                                                                block88: {
                                                                                                    block85: {
                                                                                                        block84: {
                                                                                                            var3_3 = var1_1.f;
                                                                                                            if (var3_3.p() == 8) {
                                                                                                                var3_3.nextToken();
                                                                                                                return null;
                                                                                                            }
                                                                                                            if (var3_3.p() != 4) break block78;
                                                                                                            var16_6 = var3_3.K();
                                                                                                            var3_3.nextToken();
                                                                                                            var3_3 = var4_4 != null ? ("yyyy-MM-dd HH:mm:ss".equals(var4_4) ? com.github.catvod.spider.merge.C.s.b : DateTimeFormatter.ofPattern((String)var4_4)) : null;
                                                                                                            if ("".equals(var16_6)) {
                                                                                                                return null;
                                                                                                            }
                                                                                                            if (var2_2 != LocalDateTime.class) break block79;
                                                                                                            if (var16_6.length() == 10 || var16_6.length() == 8) break block80;
                                                                                                            var2_2 = var3_3;
                                                                                                            if (var3_3 != null) break block81;
                                                                                                            if (var16_6.length() != 19) break block82;
                                                                                                            var5_5 = var16_6.charAt(4);
                                                                                                            var9_7 = var16_6.charAt(7);
                                                                                                            var7_10 = var16_6.charAt(10);
                                                                                                            var8_13 = var16_6.charAt(13);
                                                                                                            var6_16 = var16_6.charAt(16);
                                                                                                            var1_1 = var3_3;
                                                                                                            if (var8_13 != ':') break block83;
                                                                                                            var1_1 = var3_3;
                                                                                                            if (var6_16 != ':') break block83;
                                                                                                            if (var5_5 != 45 || var9_7 != '-') break block84;
                                                                                                            if (var7_10 == 'T') {
                                                                                                                var1_1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                                                                                                            } else {
                                                                                                                var1_1 = var3_3;
                                                                                                                if (var7_10 == ' ') {
                                                                                                                    var1_1 = com.github.catvod.spider.merge.C.s.b;
                                                                                                                }
                                                                                                            }
                                                                                                            break block83;
                                                                                                        }
                                                                                                        if (var5_5 != 47 || var9_7 != '/') break block85;
                                                                                                        var1_1 = com.github.catvod.spider.merge.C.s.d;
                                                                                                        break block83;
                                                                                                    }
                                                                                                    var8_13 = var16_6.charAt(0);
                                                                                                    var7_10 = var16_6.charAt(1);
                                                                                                    var10_21 = var16_6.charAt(2);
                                                                                                    var6_16 = var16_6.charAt(3);
                                                                                                    var9_7 = var16_6.charAt(5);
                                                                                                    if (var10_21 != '/' || var9_7 != '/') break block86;
                                                                                                    if (var7_10 - 48 + (var8_13 - 48) * 10 > 12) break block87;
                                                                                                    if (var5_5 - 48 + (var6_16 - 48) * 10 <= 12 && !(var2_2 = Locale.getDefault().getCountry()).equals("US")) break block88;
                                                                                                    var1_1 = com.github.catvod.spider.merge.C.s.h;
                                                                                                    break block83;
                                                                                                }
                                                                                                if (var2_2.equals("BR")) break block87;
                                                                                                var1_1 = var3_3;
                                                                                                if (!var2_2.equals("AU")) break block83;
                                                                                            }
                                                                                            var1_1 = com.github.catvod.spider.merge.C.s.i;
                                                                                            break block83;
                                                                                        }
                                                                                        if (var10_21 == '.' && var9_7 == '.') {
                                                                                            var1_1 = com.github.catvod.spider.merge.C.s.j;
                                                                                        } else {
                                                                                            var1_1 = var3_3;
                                                                                            if (var10_21 == '-') {
                                                                                                var1_1 = var3_3;
                                                                                                if (var9_7 == '-') {
                                                                                                    var1_1 = com.github.catvod.spider.merge.C.s.k;
                                                                                                    ** GOTO lbl89
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break block83;
                                                                                    }
                                                                                    var1_1 = var3_3;
                                                                                    if (var16_6.length() == 23) {
                                                                                        var6_16 = var16_6.charAt(4);
                                                                                        var5_5 = var16_6.charAt(7);
                                                                                        var9_7 = var16_6.charAt(10);
                                                                                        var10_21 = var16_6.charAt(13);
                                                                                        var8_13 = var16_6.charAt(16);
                                                                                        var7_10 = var16_6.charAt(19);
                                                                                        var1_1 = var3_3;
                                                                                        if (var10_21 == ':') {
                                                                                            var1_1 = var3_3;
                                                                                            if (var8_13 == ':') {
                                                                                                var1_1 = var3_3;
                                                                                                if (var6_16 == '-') {
                                                                                                    var1_1 = var3_3;
                                                                                                    if (var5_5 == 45) {
                                                                                                        var1_1 = var3_3;
                                                                                                        if (var9_7 == ' ') {
                                                                                                            var1_1 = var3_3;
                                                                                                            if (var7_10 == '.') {
                                                                                                                var1_1 = com.github.catvod.spider.merge.C.s.c;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                var2_2 = var1_1;
                                                                                if (var16_6.length() >= 17) {
                                                                                    var5_5 = var16_6.charAt(4);
                                                                                    if (var5_5 == 24180) {
                                                                                        var2_2 = var16_6.charAt(var16_6.length() - 1) == '\u79d2' ? com.github.catvod.spider.merge.C.s.f : com.github.catvod.spider.merge.C.s.e;
                                                                                    } else {
                                                                                        var2_2 = var1_1;
                                                                                        if (var5_5 == 45380) {
                                                                                            var2_2 = com.github.catvod.spider.merge.C.s.g;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (var2_2 != null) ** GOTO lbl-1000
                                                                            var1_1 = new i(var16_6);
                                                                            if (!var1_1.x0(false)) break block89;
                                                                            var1_1 = var1_1.S().toInstant();
                                                                            var2_2 = ZoneId.systemDefault();
                                                                            ** GOTO lbl118
                                                                        }
                                                                        for (var5_5 = 0; var5_5 < var16_6.length(); ++var5_5) {
                                                                            var6_16 = var16_6.charAt(var5_5);
                                                                            if (var6_16 >= '0' && var6_16 <= '9') {
                                                                                continue;
                                                                            }
                                                                            var5_5 = 0;
                                                                            break block74;
                                                                        }
                                                                        var5_5 = 1;
                                                                    }
                                                                    if (var5_5 != 0 && var16_6.length() > 8 && var16_6.length() < 19) {
                                                                        var1_1 = Instant.ofEpochMilli(Long.parseLong(var16_6));
                                                                        var2_2 = com.github.catvod.spider.merge.y.a.a.toZoneId();
lbl118:
                                                                        // 2 sources

                                                                        var1_1 = LocalDateTime.ofInstant((Instant)var1_1, (ZoneId)var2_2);
                                                                    } else lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        var1_1 = var2_2 == null ? LocalDateTime.parse(var16_6) : LocalDateTime.parse(var16_6, (DateTimeFormatter)var2_2);
                                                                    }
                                                                    break block90;
                                                                }
                                                                var1_1 = LocalDateTime.of(this.h(var16_6, (DateTimeFormatter)var3_3), LocalTime.MIN);
                                                            }
                                                            return (T)var1_1;
                                                        }
                                                        if (var2_2 == LocalDate.class) {
                                                            if (var16_6.length() == 23) {
                                                                var1_1 = LocalDateTime.parse(var16_6);
                                                                var1_1 = LocalDate.of(var1_1.getYear(), var1_1.getMonthValue(), var1_1.getDayOfMonth());
                                                            } else {
                                                                var1_1 = this.h(var16_6, (DateTimeFormatter)var3_3);
                                                            }
                                                            return (T)var1_1;
                                                        }
                                                        if (var2_2 == LocalTime.class) {
                                                            if (var16_6.length() == 23) {
                                                                var1_1 = LocalDateTime.parse(var16_6);
                                                                var1_1 = LocalTime.of(var1_1.getHour(), var1_1.getMinute(), var1_1.getSecond(), var1_1.getNano());
                                                            } else {
                                                                block75: {
                                                                    for (var5_5 = 0; var5_5 < var16_6.length(); ++var5_5) {
                                                                        var6_17 = var16_6.charAt(var5_5);
                                                                        if (var6_17 >= '0' && var6_17 <= '9') {
                                                                            continue;
                                                                        }
                                                                        var5_5 = 0;
                                                                        break block75;
                                                                    }
                                                                    var5_5 = 1;
                                                                }
                                                                var1_1 = var5_5 != 0 && var16_6.length() > 8 && var16_6.length() < 19 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(var16_6)), com.github.catvod.spider.merge.y.a.a.toZoneId()).toLocalTime() : LocalTime.parse(var16_6);
                                                            }
                                                            return (T)var1_1;
                                                        }
                                                        if (var2_2 != ZonedDateTime.class) break block91;
                                                        var4_4 = com.github.catvod.spider.merge.C.s.b;
                                                        var2_2 = var3_3;
                                                        if (var3_3 == var4_4) {
                                                            var2_2 = com.github.catvod.spider.merge.C.s.t;
                                                        }
                                                        if (var2_2 == null && var16_6.length() <= 19) {
                                                            var3_3 = new i(var16_6);
                                                            var1_1 = var1_1.f.M();
                                                            var3_3.p0((TimeZone)var1_1);
                                                            if (var3_3.x0(false)) {
                                                                return (T)ZonedDateTime.ofInstant(var3_3.S().getTime().toInstant(), var1_1.toZoneId());
                                                            }
                                                        }
                                                        var3_3 = var2_2;
                                                        if (var2_2 != null) ** GOTO lbl-1000
                                                        if (var16_6.length() != 19) ** GOTO lbl-1000
                                                        var5_5 = var16_6.charAt(4);
                                                        var7_11 = var16_6.charAt(7);
                                                        var6_18 = var16_6.charAt(10);
                                                        var8_14 = var16_6.charAt(13);
                                                        var9_8 = var16_6.charAt(16);
                                                        if (var8_14 != ':' || var9_8 != ':') ** GOTO lbl-1000
                                                        if (var5_5 != 45 || var7_11 != '-') break block92;
                                                        if (var6_18 != 'T') break block93;
                                                        var1_1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                                                        break block94;
                                                    }
                                                    if (var6_18 != ' ') ** GOTO lbl-1000
                                                    var1_1 = var4_4;
                                                    break block94;
                                                }
                                                if (var5_5 != 47 || var7_11 != '/') break block95;
                                                var1_1 = com.github.catvod.spider.merge.C.s.d;
                                                break block94;
                                            }
                                            var10_22 = var16_6.charAt(0);
                                            var6_18 = var16_6.charAt(1);
                                            var9_8 = var16_6.charAt(2);
                                            var8_14 = var16_6.charAt(3);
                                            var7_11 = var16_6.charAt(5);
                                            if (var9_8 != '/' || var7_11 != '/') break block96;
                                            if (var6_18 - 48 + (var10_22 - 48) * 10 > 12) break block97;
                                            if (var5_5 - 48 + (var8_14 - 48) * 10 <= 12 && !(var1_1 = Locale.getDefault().getCountry()).equals("US")) break block98;
                                            var1_1 = com.github.catvod.spider.merge.C.s.h;
                                            break block94;
                                        }
                                        if (!var1_1.equals("BR") && !var1_1.equals("AU")) ** GOTO lbl-1000
                                    }
                                    var1_1 = com.github.catvod.spider.merge.C.s.i;
                                    break block94;
                                }
                                if (var9_8 == '.' && var7_11 == '.') {
                                    var1_1 = com.github.catvod.spider.merge.C.s.j;
                                } else if (var9_8 == '-' && var7_11 == '-') {
                                    var1_1 = com.github.catvod.spider.merge.C.s.k;
                                } else lbl-1000:
                                // 5 sources

                                {
                                    var1_1 = var2_2;
                                }
                            }
                            if (var16_6.length() >= 17) {
                                var5_5 = var16_6.charAt(4);
                                if (var5_5 == 24180) {
                                    var1_1 = var16_6.charAt(var16_6.length() - 1) == '\u79d2' ? com.github.catvod.spider.merge.C.s.f : com.github.catvod.spider.merge.C.s.e;
                                } else if (var5_5 == 45380) {
                                    var1_1 = com.github.catvod.spider.merge.C.s.g;
                                }
                            }
                            for (var5_5 = 0; var5_5 < var16_6.length(); ++var5_5) {
                                var6_18 = var16_6.charAt(var5_5);
                                if (var6_18 >= '0' && var6_18 <= '9') {
                                    continue;
                                }
                                var5_5 = 0;
                                break block76;
                            }
                            var5_5 = 1;
                        }
                        var3_3 = var1_1;
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var3_3 = var1_1;
                        if (var16_6.length() <= 8) ** GOTO lbl-1000
                        var3_3 = var1_1;
                        if (var16_6.length() < 19) {
                            var1_1 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(var16_6)), com.github.catvod.spider.merge.y.a.a.toZoneId());
                        } else lbl-1000:
                        // 4 sources

                        {
                            var1_1 = var3_3 == null ? ZonedDateTime.parse(var16_6) : ZonedDateTime.parse(var16_6, (DateTimeFormatter)var3_3);
                        }
                        return (T)var1_1;
                    }
                    if (var2_2 == OffsetDateTime.class) {
                        return (T)OffsetDateTime.parse(var16_6);
                    }
                    if (var2_2 == OffsetTime.class) {
                        return (T)OffsetTime.parse(var16_6);
                    }
                    if (var2_2 == ZoneId.class) {
                        return (T)ZoneId.of(var16_6);
                    }
                    if (var2_2 == Period.class) {
                        return (T)Period.parse(var16_6);
                    }
                    if (var2_2 == Duration.class) {
                        return (T)Duration.parse(var16_6);
                    }
                    if (var2_2 == Instant.class) {
                        block77: {
                            for (var5_5 = 0; var5_5 < var16_6.length(); ++var5_5) {
                                var6_19 = var16_6.charAt(var5_5);
                                if (var6_19 >= '0' && var6_19 <= '9') {
                                    continue;
                                }
                                var5_5 = 0;
                                break block77;
                            }
                            var5_5 = 1;
                        }
                        if (var5_5 != 0 && var16_6.length() > 8 && var16_6.length() < 19) {
                            return (T)Instant.ofEpochMilli(Long.parseLong(var16_6));
                        }
                        return (T)Instant.parse(var16_6);
                    }
                    break block99;
                }
                if (var3_3.p() == 2) {
                    var13_24 = var3_3.h();
                    var3_3.nextToken();
                    if ("unixtime".equals(var4_4)) {
                        var11_25 = var13_24 * 1000L;
                    } else {
                        var11_25 = var13_24;
                        if ("yyyyMMddHHmmss".equals(var4_4)) {
                            var9_9 = (int)(var13_24 / 10000000000L);
                            var8_15 = (int)(var13_24 / 100000000L % 100L);
                            var7_12 = (int)(var13_24 / 1000000L % 100L);
                            var6_20 = (int)(var13_24 / 10000L % 100L);
                            var10_23 = (int)(var13_24 / 100L % 100L);
                            var5_5 = (int)(var13_24 % 100L);
                            var11_25 = var13_24;
                            if (var2_2 == LocalDateTime.class) {
                                return (T)LocalDateTime.of(var9_9, var8_15, var7_12, var6_20, var10_23, var5_5);
                            }
                        }
                    }
                    if (var2_2 == LocalDateTime.class) {
                        return (T)LocalDateTime.ofInstant(Instant.ofEpochMilli(var11_25), com.github.catvod.spider.merge.y.a.a.toZoneId());
                    }
                    if (var2_2 == LocalDate.class) {
                        return (T)LocalDateTime.ofInstant(Instant.ofEpochMilli(var11_25), com.github.catvod.spider.merge.y.a.a.toZoneId()).toLocalDate();
                    }
                    if (var2_2 == LocalTime.class) {
                        return (T)LocalDateTime.ofInstant(Instant.ofEpochMilli(var11_25), com.github.catvod.spider.merge.y.a.a.toZoneId()).toLocalTime();
                    }
                    if (var2_2 == ZonedDateTime.class) {
                        return (T)ZonedDateTime.ofInstant(Instant.ofEpochMilli(var11_25), com.github.catvod.spider.merge.y.a.a.toZoneId());
                    }
                    if (var2_2 == Instant.class) {
                        return (T)Instant.ofEpochMilli(var11_25);
                    }
                    throw new UnsupportedOperationException();
                }
                if (var3_3.p() == 12) {
                    var1_1 = var1_1.s();
                    if (var2_2 == Instant.class) {
                        var2_2 = var1_1.get("epochSecond");
                        var1_1 = var1_1.get("nano");
                        var15_27 = var2_2 instanceof Number;
                        if (var15_27 && var1_1 instanceof Number) {
                            return (T)Instant.ofEpochSecond(A.n0((Number)var2_2), A.n0((Number)var1_1));
                        }
                        if (var15_27) {
                            return (T)Instant.ofEpochSecond(A.n0((Number)var2_2));
                        }
                    } else if (var2_2 == Duration.class && (var2_2 = var1_1.v("seconds")) != null) {
                        var11_26 = var1_1.w("nano");
                        return (T)Duration.ofSeconds(var2_2.longValue(), var11_26);
                    } else {
                        ** GOTO lbl299
                    }
                }
                break block100;
            }
            return null;
        }
        throw new UnsupportedOperationException();
    }

    protected final LocalDate h(String object, DateTimeFormatter dateTimeFormatter) {
        DateTimeFormatter dateTimeFormatter2;
        block19: {
            int n2;
            Object object2;
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
                                object2 = dateTimeFormatter;
                                if (((String)object).length() == 8) {
                                    object2 = l;
                                }
                                n2 = ((String)object).length();
                                n4 = 0;
                                dateTimeFormatter = object2;
                                if (n2 != 10) break block20;
                                n2 = ((String)object).charAt(4);
                                n3 = ((String)object).charAt(7);
                                dateTimeFormatter2 = object2;
                                if (n2 == 47) {
                                    dateTimeFormatter2 = object2;
                                    if (n3 == 47) {
                                        dateTimeFormatter2 = m;
                                    }
                                }
                                n3 = ((String)object).charAt(0);
                                char c4 = ((String)object).charAt(1);
                                c3 = ((String)object).charAt(2);
                                char c5 = ((String)object).charAt(3);
                                c2 = ((String)object).charAt(5);
                                if (c3 != '/' || c2 != '/') break block21;
                                if (c4 - 48 + (n3 - 48) * 10 > 12) break block22;
                                if (n2 - 48 + (c5 - 48) * 10 <= 12 && !((String)(object2 = Locale.getDefault().getCountry())).equals("US")) break block23;
                                dateTimeFormatter = p;
                                break block20;
                            }
                            if (((String)object2).equals("BR")) break block22;
                            dateTimeFormatter = dateTimeFormatter2;
                            if (!((String)object2).equals("AU")) break block20;
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
                object2 = dateTimeFormatter;
                if (((String)object).length() >= 9) {
                    n2 = ((String)object).charAt(4);
                    if (n2 == 24180) {
                        object2 = n;
                    } else {
                        object2 = dateTimeFormatter;
                        if (n2 == 45380) {
                            object2 = o;
                        }
                    }
                }
                for (n3 = 0; n3 < ((String)object).length(); ++n3) {
                    c2 = ((String)object).charAt(n3);
                    n2 = n4;
                    if (c2 >= '0') {
                        if (c2 <= '9') continue;
                        n2 = n4;
                    }
                    break block18;
                }
                n2 = 1;
            }
            dateTimeFormatter2 = object2;
            if (n2 != 0) {
                dateTimeFormatter2 = object2;
                if (((String)object).length() > 8) {
                    dateTimeFormatter2 = object2;
                    if (((String)object).length() < 19) {
                        return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong((String)object)), com.github.catvod.spider.merge.y.a.a.toZoneId()).toLocalDate();
                    }
                }
            }
        }
        object = dateTimeFormatter2 == null ? LocalDate.parse((CharSequence)object) : LocalDate.parse((CharSequence)object, dateTimeFormatter2);
        return object;
    }
}

