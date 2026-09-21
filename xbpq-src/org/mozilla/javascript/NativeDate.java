/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

final class NativeDate
extends IdScriptableObject {
    static final boolean $assertionsDisabled = false;
    private static final int ConstructorId_UTC = -1;
    private static final int ConstructorId_now = -3;
    private static final int ConstructorId_parse = -2;
    private static final Object DATE_TAG = "Date";
    private static final double HalfTimeDomain = 8.64E15;
    private static final double HoursPerDay = 24.0;
    private static final int Id_constructor = 1;
    private static final int Id_getDate = 17;
    private static final int Id_getDay = 19;
    private static final int Id_getFullYear = 13;
    private static final int Id_getHours = 21;
    private static final int Id_getMilliseconds = 27;
    private static final int Id_getMinutes = 23;
    private static final int Id_getMonth = 15;
    private static final int Id_getSeconds = 25;
    private static final int Id_getTime = 11;
    private static final int Id_getTimezoneOffset = 29;
    private static final int Id_getUTCDate = 18;
    private static final int Id_getUTCDay = 20;
    private static final int Id_getUTCFullYear = 14;
    private static final int Id_getUTCHours = 22;
    private static final int Id_getUTCMilliseconds = 28;
    private static final int Id_getUTCMinutes = 24;
    private static final int Id_getUTCMonth = 16;
    private static final int Id_getUTCSeconds = 26;
    private static final int Id_getYear = 12;
    private static final int Id_setDate = 39;
    private static final int Id_setFullYear = 43;
    private static final int Id_setHours = 37;
    private static final int Id_setMilliseconds = 31;
    private static final int Id_setMinutes = 35;
    private static final int Id_setMonth = 41;
    private static final int Id_setSeconds = 33;
    private static final int Id_setTime = 30;
    private static final int Id_setUTCDate = 40;
    private static final int Id_setUTCFullYear = 44;
    private static final int Id_setUTCHours = 38;
    private static final int Id_setUTCMilliseconds = 32;
    private static final int Id_setUTCMinutes = 36;
    private static final int Id_setUTCMonth = 42;
    private static final int Id_setUTCSeconds = 34;
    private static final int Id_setYear = 45;
    private static final int Id_toDateString = 4;
    private static final int Id_toGMTString = 8;
    private static final int Id_toISOString = 46;
    private static final int Id_toJSON = 47;
    private static final int Id_toLocaleDateString = 7;
    private static final int Id_toLocaleString = 5;
    private static final int Id_toLocaleTimeString = 6;
    private static final int Id_toSource = 9;
    private static final int Id_toString = 2;
    private static final int Id_toTimeString = 3;
    private static final int Id_toUTCString = 8;
    private static final int Id_valueOf = 10;
    private static final int MAXARGS = 7;
    private static final int MAX_PROTOTYPE_ID = 47;
    private static final double MinutesPerDay = 1440.0;
    private static final double MinutesPerHour = 60.0;
    private static final double SecondsPerDay = 86400.0;
    private static final double SecondsPerHour = 3600.0;
    private static final double SecondsPerMinute = 60.0;
    private static final String js_NaN_date_str = "Invalid Date";
    private static final DateFormat localeDateFormatter;
    private static final DateFormat localeDateTimeFormatter;
    private static final DateFormat localeTimeFormatter;
    private static final double msPerDay = 8.64E7;
    private static final double msPerHour = 3600000.0;
    private static final double msPerMinute = 60000.0;
    private static final double msPerSecond = 1000.0;
    private static final long serialVersionUID = -8307438915861678966L;
    private static final DateFormat timeZoneFormatter;
    private double date;

    static {
        timeZoneFormatter = new SimpleDateFormat("zzz");
        localeDateTimeFormatter = new SimpleDateFormat("MMMM d, yyyy h:mm:ss a z");
        localeDateFormatter = new SimpleDateFormat("MMMM d, yyyy");
        localeTimeFormatter = new SimpleDateFormat("h:mm:ss a z");
    }

    private NativeDate() {
    }

    /*
     * Unable to fully structure code
     */
    private static int DateFromTime(double var0) {
        var4_1 = NativeDate.YearFromTime(var0);
        var2_2 = (int)(NativeDate.Day(var0) - NativeDate.DayFromYear(var4_1)) - 59;
        var5_3 = 31;
        if (var2_2 < 0) {
            var3_4 = var2_2;
            if (var2_2 < -28) {
                var3_4 = var2_2 + 31;
            }
            return var3_4 + 28 + 1;
        }
        var3_5 = var2_2;
        if (NativeDate.IsLeapYear(var4_1)) {
            if (var2_2 == 0) {
                return 29;
            }
            var3_5 = var2_2 - 1;
        }
        var6_6 = var3_5 / 30;
        var4_1 = 30;
        var2_2 = var5_3;
        switch (var6_6) {
            default: {
                throw Kit.codeBug();
            }
            case 10: {
                return var3_5 - 275 + 1;
            }
            case 9: {
                var2_2 = 275;
                ** GOTO lbl48
            }
            case 8: {
                var2_2 = 245;
                ** GOTO lbl46
            }
            case 7: {
                var2_2 = 214;
                ** GOTO lbl48
            }
            case 6: {
                var2_2 = 184;
                ** GOTO lbl46
            }
            case 5: {
                var2_2 = 153;
                ** GOTO lbl46
            }
            case 4: {
                var2_2 = 122;
                ** GOTO lbl48
            }
            case 3: {
                var2_2 = 92;
                ** GOTO lbl46
            }
            case 2: {
                var2_2 = 61;
                ** GOTO lbl48
            }
lbl46:
            // 5 sources

            case 1: {
                var4_1 = 31;
lbl48:
                // 5 sources

                var3_5 -= var2_2;
                var2_2 = var3_5;
                if (var3_5 < 0) {
                    var2_2 = var3_5 + var4_1;
                }
                return var2_2 + 1;
            }
            case 0: 
        }
        return var3_5 + 1;
    }

    private static double Day(double d2) {
        return Math.floor(d2 / 8.64E7);
    }

    /*
     * Unable to fully structure code
     */
    private static double DayFromMonth(int var0, int var1_1) {
        var3_2 = var0 * 30;
        if (var0 >= 7) {
            var2_3 = var0 / 2;
lbl4:
            // 2 sources

            while (true) {
                var2_3 = var2_3 - 1 + var3_2;
                break;
            }
        } else {
            if (var0 >= 2) {
                var2_3 = (var0 - 1) / 2;
                ** continue;
            }
            var2_3 = var3_2 + var0;
        }
        var3_2 = var2_3;
        if (var0 >= 2) {
            var3_2 = var2_3;
            if (NativeDate.IsLeapYear(var1_1)) {
                var3_2 = var2_3 + 1;
            }
        }
        return var3_2;
    }

    private static double DayFromYear(double d2) {
        double d3 = Math.floor((d2 - 1969.0) / 4.0);
        double d4 = Math.floor((d2 - 1901.0) / 100.0);
        return Math.floor((d2 - 1601.0) / 400.0) + (d3 + (d2 - 1970.0) * 365.0 - d4);
    }

    private static double DaylightSavingTA(Context context, double d2) {
        double d3 = d2;
        if (d2 < 0.0) {
            d3 = NativeDate.MakeDate(NativeDate.MakeDay(NativeDate.EquivalentYear(NativeDate.YearFromTime(d2)), NativeDate.MonthFromTime(d2), NativeDate.DateFromTime(d2)), NativeDate.TimeWithinDay(d2));
        }
        Date date = new Date((long)d3);
        if (context.getTimeZone().inDaylightTime(date)) {
            return 3600000.0;
        }
        return 0.0;
    }

    private static int DaysInMonth(int n2, int n3) {
        if (n3 == 2) {
            n2 = NativeDate.IsLeapYear(n2) ? 29 : 28;
            return n2;
        }
        n2 = n3 >= 8 ? 31 - (n3 & 1) : (n3 & 1) + 30;
        return n2;
    }

    private static double DaysInYear(double d2) {
        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
            d2 = NativeDate.IsLeapYear((int)d2) ? 366.0 : 365.0;
            return d2;
        }
        return Double.NaN;
    }

    private static int EquivalentYear(int n2) {
        block20: {
            int n3;
            block19: {
                int n4;
                n3 = n4 = ((int)NativeDate.DayFromYear(n2) + 4) % 7;
                if (n4 < 0) {
                    n3 = n4 + 7;
                }
                if (!NativeDate.IsLeapYear(n2)) break block19;
                switch (n3) {
                    default: {
                        break block20;
                    }
                    case 6: {
                        return 1972;
                    }
                    case 5: {
                        return 1988;
                    }
                    case 4: {
                        return 1976;
                    }
                    case 3: {
                        return 1992;
                    }
                    case 2: {
                        return 1980;
                    }
                    case 1: {
                        return 1996;
                    }
                    case 0: {
                        return 1984;
                    }
                }
            }
            switch (n3) {
                default: {
                    break;
                }
                case 6: {
                    return 1977;
                }
                case 5: {
                    return 1971;
                }
                case 4: {
                    return 1981;
                }
                case 3: {
                    return 1986;
                }
                case 2: {
                    return 1985;
                }
                case 1: {
                    return 1973;
                }
                case 0: {
                    return 1978;
                }
            }
        }
        throw Kit.codeBug();
    }

    private static int HourFromTime(double d2) {
        double d3;
        d2 = d3 = Math.floor(d2 / 3600000.0) % 24.0;
        if (d3 < 0.0) {
            d2 = d3 + 24.0;
        }
        return (int)d2;
    }

    private static boolean IsLeapYear(int n2) {
        boolean bl = n2 % 4 == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
        return bl;
    }

    private static double LocalTime(Context context, double d2) {
        return (double)context.getTimeZone().getRawOffset() + d2 + NativeDate.DaylightSavingTA(context, d2);
    }

    private static double MakeDate(double d2, double d3) {
        return d2 * 8.64E7 + d3;
    }

    private static double MakeDay(double d2, double d3, double d4) {
        double d5 = Math.floor(d3 / 12.0) + d2;
        d2 = d3 %= 12.0;
        if (d3 < 0.0) {
            d2 = d3 + 12.0;
        }
        return Math.floor(NativeDate.TimeFromYear(d5) / 8.64E7) + NativeDate.DayFromMonth((int)d2, (int)d5) + d4 - 1.0;
    }

    private static double MakeTime(double d2, double d3, double d4, double d5) {
        return ((d2 * 60.0 + d3) * 60.0 + d4) * 1000.0 + d5;
    }

    private static int MinFromTime(double d2) {
        double d3;
        d2 = d3 = Math.floor(d2 / 60000.0) % 60.0;
        if (d3 < 0.0) {
            d2 = d3 + 60.0;
        }
        return (int)d2;
    }

    /*
     * Unable to fully structure code
     */
    private static int MonthFromTime(double var0) {
        var5_1 = NativeDate.YearFromTime(var0);
        var4_2 = (int)(NativeDate.Day(var0) - NativeDate.DayFromYear(var5_1)) - 59;
        var2_3 = 1;
        if (var4_2 < 0) {
            if (var4_2 < -28) {
                var2_3 = 0;
            }
            return var2_3;
        }
        var3_4 = var4_2;
        if (NativeDate.IsLeapYear(var5_1)) {
            if (var4_2 == 0) {
                return 1;
            }
            var3_4 = var4_2 - 1;
        }
        var4_2 = var3_4 / 30;
        switch (var4_2) {
            default: {
                throw Kit.codeBug();
            }
            case 10: {
                return 11;
            }
            case 9: {
                var2_3 = 275;
                ** GOTO lbl45
            }
            case 8: {
                var2_3 = 245;
                ** GOTO lbl45
            }
            case 7: {
                var2_3 = 214;
                ** GOTO lbl45
            }
            case 6: {
                var2_3 = 184;
                ** GOTO lbl45
            }
            case 5: {
                var2_3 = 153;
                ** GOTO lbl45
            }
            case 4: {
                var2_3 = 122;
                ** GOTO lbl45
            }
            case 3: {
                var2_3 = 92;
                ** GOTO lbl45
            }
            case 2: {
                var2_3 = 61;
                ** GOTO lbl45
            }
            case 1: {
                var2_3 = 31;
lbl45:
                // 9 sources

                var2_3 = var3_4 >= var2_3 ? var4_2 + 2 : var4_2 + 1;
                return var2_3;
            }
            case 0: 
        }
        return 2;
    }

    private static int SecFromTime(double d2) {
        double d3;
        d2 = d3 = Math.floor(d2 / 1000.0) % 60.0;
        if (d3 < 0.0) {
            d2 = d3 + 60.0;
        }
        return (int)d2;
    }

    private static double TimeClip(double d2) {
        if (!Double.isNaN(d2) && d2 != Double.POSITIVE_INFINITY && d2 != Double.NEGATIVE_INFINITY && !(Math.abs(d2) > 8.64E15)) {
            double d3 = d2 + 0.0;
            if (d2 > 0.0) {
                return Math.floor(d3);
            }
            return Math.ceil(d3);
        }
        return Double.NaN;
    }

    private static double TimeFromYear(double d2) {
        return NativeDate.DayFromYear(d2) * 8.64E7;
    }

    private static double TimeWithinDay(double d2) {
        double d3;
        d2 = d3 = d2 % 8.64E7;
        if (d3 < 0.0) {
            d2 = d3 + 8.64E7;
        }
        return d2;
    }

    private static int WeekDay(double d2) {
        double d3;
        d2 = d3 = (NativeDate.Day(d2) + 4.0) % 7.0;
        if (d3 < 0.0) {
            d2 = d3 + 7.0;
        }
        return (int)d2;
    }

    private static int YearFromTime(double d2) {
        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
            double d3;
            double d4 = Math.floor(d2 / 3.1556952E10) + 1970.0;
            double d5 = NativeDate.TimeFromYear(d4);
            if (d5 > d2) {
                d3 = d4 - 1.0;
            } else {
                d3 = d4;
                if (NativeDate.DaysInYear(d4) * 8.64E7 + d5 <= d2) {
                    d3 = d4 + 1.0;
                }
            }
            return (int)d3;
        }
        return 0;
    }

    private static void append0PaddedUint(StringBuilder stringBuilder, int n2, int n3) {
        int n4;
        int n5;
        if (n2 < 0) {
            Kit.codeBug();
        }
        int n6 = n3 - 1;
        n3 = 1000000000;
        if (n2 >= 10) {
            if (n2 < 1000000000) {
                n3 = 1;
                while (n2 >= (n5 = n3 * 10)) {
                    --n6;
                    n3 = n5;
                }
            } else {
                n6 -= 9;
            }
        } else {
            n3 = 1;
        }
        while (true) {
            n4 = n2;
            if (n6 <= 0) break;
            stringBuilder.append('0');
            --n6;
        }
        for (n5 = n3; n5 != 1; n5 /= 10) {
            stringBuilder.append((char)(n4 / n5 + 48));
            n4 %= n5;
        }
        stringBuilder.append((char)(n4 + 48));
    }

    private static void appendMonthName(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 != 3; ++i2) {
            stringBuilder.append("JanFebMarAprMayJunJulAugSepOctNovDec".charAt(n2 * 3 + i2));
        }
    }

    private static void appendWeekDayName(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 != 3; ++i2) {
            stringBuilder.append("SunMonTueWedThuFriSat".charAt(n2 * 3 + i2));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String date_format(Context object, double d2, int n2) {
        StringBuilder stringBuilder = new StringBuilder(60);
        double d3 = NativeDate.LocalTime((Context)object, d2);
        if (n2 != 3) {
            int n3;
            NativeDate.appendWeekDayName(stringBuilder, NativeDate.WeekDay(d3));
            stringBuilder.append(' ');
            NativeDate.appendMonthName(stringBuilder, NativeDate.MonthFromTime(d3));
            stringBuilder.append(' ');
            NativeDate.append0PaddedUint(stringBuilder, NativeDate.DateFromTime(d3), 2);
            stringBuilder.append(' ');
            int n4 = n3 = NativeDate.YearFromTime(d3);
            if (n3 < 0) {
                stringBuilder.append('-');
                n4 = -n3;
            }
            NativeDate.append0PaddedUint(stringBuilder, n4, 4);
            if (n2 != 4) {
                stringBuilder.append(' ');
            }
        }
        if (n2 == 4) return stringBuilder.toString();
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.HourFromTime(d3), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.MinFromTime(d3), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.SecFromTime(d3), 2);
        n2 = (int)Math.floor(((double)((Context)object).getTimeZone().getRawOffset() + NativeDate.DaylightSavingTA((Context)object, d2)) / 60000.0);
        n2 = n2 % 60 + n2 / 60 * 100;
        if (n2 > 0) {
            stringBuilder.append(" GMT+");
        } else {
            stringBuilder.append(" GMT-");
            n2 = -n2;
        }
        NativeDate.append0PaddedUint(stringBuilder, n2, 4);
        double d4 = d2;
        if (d2 < 0.0) {
            d4 = NativeDate.MakeDate(NativeDate.MakeDay(NativeDate.EquivalentYear(NativeDate.YearFromTime(d3)), NativeDate.MonthFromTime(d2), NativeDate.DateFromTime(d2)), NativeDate.TimeWithinDay(d2));
        }
        stringBuilder.append(" (");
        Date date = new Date((long)d4);
        object = timeZoneFormatter;
        synchronized (object) {
            stringBuilder.append(((DateFormat)object).format(date));
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    private static double date_msecFromArgs(Object[] objectArray) {
        double[] dArray = new double[7];
        for (int i2 = 0; i2 < 7; ++i2) {
            if (i2 < objectArray.length) {
                double d2 = ScriptRuntime.toNumber(objectArray[i2]);
                if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
                    dArray[i2] = ScriptRuntime.toInteger(objectArray[i2]);
                    continue;
                }
                return Double.NaN;
            }
            dArray[i2] = i2 == 2 ? 1.0 : 0.0;
        }
        if (dArray[0] >= 0.0 && dArray[0] <= 99.0) {
            dArray[0] = dArray[0] + 1900.0;
        }
        return NativeDate.date_msecFromDate(dArray[0], dArray[1], dArray[2], dArray[3], dArray[4], dArray[5], dArray[6]);
    }

    private static double date_msecFromDate(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return NativeDate.MakeDate(NativeDate.MakeDay(d2, d3, d4), NativeDate.MakeTime(d5, d6, d7, d8));
    }

    /*
     * Unable to fully structure code
     */
    private static double date_parseString(Context var0, String var1_1) {
        var2_2 = NativeDate.parseISOString(var0, var1_1);
        if (!Double.isNaN(var2_2)) {
            return var2_2;
        }
        var19_3 = var1_1.length();
        var7_4 = 0;
        var8_5 = 0;
        var6_6 = -1;
        var15_7 = -1;
        var9_8 = -1;
        var14_9 = -1;
        var12_10 = -1;
        var11_11 = -1;
        var2_2 = -1.0;
        var16_12 = false;
        block8: while (var7_4 < var19_3) {
            block63: {
                block55: {
                    block47: {
                        block48: {
                            block52: {
                                block49: {
                                    block53: {
                                        block54: {
                                            block50: {
                                                block51: {
                                                    var13_15 = var1_1.charAt(var7_4);
                                                    var10_14 = var7_4 + 1;
                                                    if (var13_15 <= 32 || var13_15 == 44 || var13_15 == 45) break block47;
                                                    var7_4 = 1;
                                                    if (var13_15 == 40) {
                                                        var13_15 = var7_4;
                                                        while (true) {
                                                            var7_4 = var10_14;
                                                            if (var10_14 >= var19_3) continue block8;
                                                            var17_16 = var1_1.charAt(var10_14);
                                                            var7_4 = var10_14 + 1;
                                                            if (var17_16 == 40) {
                                                                ++var13_15;
                                                                var10_14 = var7_4;
                                                                continue;
                                                            }
                                                            var10_14 = var7_4;
                                                            if (var17_16 != 41) continue;
                                                            var17_16 = var13_15 - 1;
                                                            var10_14 = var7_4;
                                                            var13_15 = var17_16;
                                                            if (var17_16 <= 0) break;
                                                        }
                                                        continue;
                                                    }
                                                    if (48 > var13_15 || var13_15 > 57) break block48;
                                                    var7_4 = var13_15 - 48;
                                                    while (true) {
                                                        var17_16 = var13_15;
                                                        if (var10_14 >= var19_3) break;
                                                        var17_16 = var13_15 = (int)var1_1.charAt(var10_14);
                                                        if (48 > var13_15) break;
                                                        var17_16 = var13_15;
                                                        if (var13_15 > 57) break;
                                                        var7_4 = var7_4 * 10 + var13_15 - 48;
                                                        ++var10_14;
                                                    }
                                                    if (var8_5 == 43 || var8_5 == 45) break block49;
                                                    if (var7_4 >= 70 || var8_5 == 47 && var9_8 >= 0 && var14_9 >= 0 && var15_7 < 0) ** GOTO lbl86
                                                    if (var17_16 != 58) break block50;
                                                    if (var6_6 >= 0) break block51;
                                                    var6_6 = var7_4;
                                                    break block52;
                                                }
                                                if (var11_11 >= 0) {
                                                    return NaN;
                                                }
                                                ** GOTO lbl-1000
                                            }
                                            if (var17_16 != 47) break block53;
                                            if (var9_8 >= 0) break block54;
                                            var9_8 = var7_4 - 1;
                                            break block52;
                                        }
                                        if (var14_9 >= 0) {
                                            return NaN;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    if (var10_14 < var19_3 && var17_16 != 44 && var17_16 > 32 && var17_16 != 45) {
                                        return NaN;
                                    }
                                    if (var16_12 && var7_4 < 60) {
                                        var2_2 = var2_2 < 0.0 ? (var2_2 -= (double)var7_4) : (var2_2 += (double)var7_4);
                                    } else if (var6_6 >= 0 && var11_11 < 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var11_11 = var7_4;
                                    } else if (var11_11 >= 0 && var12_10 < 0) {
                                        var12_10 = var7_4;
                                    } else if (var14_9 < 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var14_9 = var7_4;
                                    } else {
                                        return NaN;
lbl86:
                                        // 1 sources

                                        if (var15_7 >= 0) {
                                            return NaN;
                                        }
                                        if (var17_16 > 32 && var17_16 != 44 && var17_16 != 47 && var10_14 < var19_3) {
                                            return NaN;
                                        }
                                        var8_5 = var7_4;
                                        if (var7_4 < 100) {
                                            var8_5 = var7_4 + 1900;
                                        }
                                        var15_7 = var8_5;
                                    }
                                    break block52;
                                }
                                var7_4 = var7_4 < 24 ? (var7_4 *= 60) : var7_4 / 100 * 60 + var7_4 % 100;
                                var13_15 = var7_4;
                                if (var8_5 == 43) {
                                    var13_15 = -var7_4;
                                }
                                if (var2_2 != 0.0 && var2_2 != -1.0) {
                                    return NaN;
                                }
                                var2_2 = var13_15;
                                var16_12 = true;
                            }
                            var8_5 = 0;
                            var7_4 = var10_14;
                            continue;
                        }
                        if (var13_15 == 47 || var13_15 == 58 || var13_15 == 43 || var13_15 == 45) break block55;
                        var13_15 = var10_14 - 1;
                        var7_4 = var10_14;
                        while (var7_4 < var19_3 && (65 <= (var10_14 = (int)var1_1.charAt(var7_4)) && var10_14 <= 90 || 97 <= var10_14 && var10_14 <= 122)) {
                            ++var7_4;
                        }
                        var20_18 = var7_4 - var13_15;
                        if (var20_18 < 2) {
                            return NaN;
                        }
                        var21_19 = "am;pm;monday;tuesday;wednesday;thursday;friday;saturday;sunday;january;february;march;april;may;june;july;august;september;october;november;december;gmt;ut;utc;est;edt;cst;cdt;mst;mdt;pst;pdt;";
                        var17_16 = 0;
                        var18_17 = 0;
                        var10_14 = var13_15;
                        var13_15 = var18_17;
                        while (true) {
                            block56: {
                                block59: {
                                    block61: {
                                        block62: {
                                            block60: {
                                                block57: {
                                                    block58: {
                                                        if ((var18_17 = var21_19.indexOf(59, var13_15)) < 0) {
                                                            return NaN;
                                                        }
                                                        if (!var21_19.regionMatches(true, var13_15, var1_1, var10_14, var20_18)) break block56;
                                                        var4_13 = 420.0;
                                                        if (var17_16 >= 2) break block57;
                                                        if (var6_6 > 12 || var6_6 < 0) break block58;
                                                        if (var17_16 == 0) {
                                                            var10_14 = var9_8;
                                                            var4_13 = var2_2;
                                                            if (var6_6 == 12) {
                                                                var6_6 = 0;
                                                                continue block8;
                                                            }
                                                        } else {
                                                            var10_14 = var9_8;
                                                            var4_13 = var2_2;
                                                            if (var6_6 != 12) {
                                                                var6_6 += 12;
                                                                continue block8;
                                                            }
                                                        }
                                                        break block59;
                                                    }
                                                    return NaN;
                                                }
                                                var10_14 = var17_16 - 2;
                                                if (var10_14 >= 7) break block60;
                                                var10_14 = var9_8;
                                                var4_13 = var2_2;
                                                break block59;
                                            }
                                            if ((var10_14 -= 7) >= 12) break block61;
                                            if (var9_8 >= 0) break block62;
                                            var4_13 = var2_2;
                                            break block59;
                                        }
                                        return NaN;
                                    }
                                    switch (var10_14 - 12) {
                                        default: {
                                            Kit.codeBug();
                                            var10_14 = var9_8;
                                            var4_13 = var2_2;
                                            break;
                                        }
                                        case 9: {
                                            var4_13 = 480.0;
                                            ** GOTO lbl174
                                        }
                                        case 5: 
                                        case 8: {
                                            var2_2 = 360.0;
                                            continue block8;
                                        }
                                        case 4: {
                                            var4_13 = 240.0;
                                        }
lbl174:
                                        // 3 sources

                                        case 7: 
                                        case 10: {
                                            var10_14 = var9_8;
                                            break;
                                        }
                                        case 3: 
                                        case 6: {
                                            var4_13 = 300.0;
                                            var10_14 = var9_8;
                                            break;
                                        }
                                        case 0: 
                                        case 1: 
                                        case 2: {
                                            var2_2 = 0.0;
                                            continue block8;
                                        }
                                    }
                                }
                                var2_2 = var4_13;
                                var9_8 = var10_14;
                                continue block8;
                            }
                            var13_15 = var18_17 + 1;
                            ++var17_16;
                        }
                    }
                    if (var10_14 >= var19_3) break block63;
                    var7_4 = var1_1.charAt(var10_14);
                    if (var13_15 != 45 || 48 > var7_4 || var7_4 > 57) break block63;
                }
                var8_5 = var13_15;
                var7_4 = var10_14;
                continue;
            }
            var7_4 = var10_14;
        }
        if (var15_7 >= 0 && var9_8 >= 0 && var14_9 >= 0) {
            var7_4 = var12_10;
            if (var12_10 < 0) {
                var7_4 = 0;
            }
            var8_5 = var11_11;
            if (var11_11 < 0) {
                var8_5 = 0;
            }
            if (var6_6 < 0) {
                var6_6 = 0;
            }
            var4_13 = NativeDate.date_msecFromDate(var15_7, var9_8, var14_9, var6_6, var8_5, var7_4, 0.0);
            if (var2_2 == -1.0) {
                return NativeDate.internalUTC(var0, var4_13);
            }
            return var2_2 * 60000.0 + var4_13;
        }
        return NaN;
    }

    static void init(Scriptable scriptable, boolean bl) {
        NativeDate nativeDate = new NativeDate();
        nativeDate.date = Double.NaN;
        nativeDate.exportAsJSClass(47, scriptable, bl);
    }

    private static double internalUTC(Context context, double d2) {
        return (d2 -= (double)context.getTimeZone().getRawOffset()) - NativeDate.DaylightSavingTA(context, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Object jsConstructor(Context context, Object[] object) {
        double d2;
        NativeDate nativeDate;
        block10: {
            double d3;
            block9: {
                block8: {
                    nativeDate = new NativeDate();
                    if (((Object)object).length != 0) break block8;
                    d3 = NativeDate.now();
                    break block9;
                }
                if (((Object)object).length != 1) break block10;
                Object object2 = object[0];
                if (object2 instanceof NativeDate) {
                    d3 = ((NativeDate)object2).date;
                } else {
                    object = object2;
                    if (object2 instanceof Scriptable) {
                        object = ((Scriptable)object2).getDefaultValue(null);
                    }
                    d3 = object instanceof CharSequence ? NativeDate.date_parseString(context, object.toString()) : ScriptRuntime.toNumber(object);
                    d3 = NativeDate.TimeClip(d3);
                }
            }
            nativeDate.date = d3;
            return nativeDate;
        }
        double d4 = d2 = NativeDate.date_msecFromArgs((Object[])object);
        if (!Double.isNaN(d2)) {
            d4 = d2;
            if (!Double.isInfinite(d2)) {
                d4 = NativeDate.TimeClip(NativeDate.internalUTC(context, d2));
            }
        }
        nativeDate.date = d4;
        return nativeDate;
    }

    private static double jsStaticFunction_UTC(Object[] objectArray) {
        if (objectArray.length == 0) {
            return Double.NaN;
        }
        return NativeDate.TimeClip(NativeDate.date_msecFromArgs(objectArray));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String js_toISOString(double d2) {
        StringBuilder stringBuilder = new StringBuilder(27);
        int n2 = NativeDate.YearFromTime(d2);
        int n3 = 6;
        if (n2 < 0) {
            stringBuilder.append('-');
            n2 = -n2;
        } else if (n2 > 9999) {
            stringBuilder.append('+');
        } else {
            n3 = 4;
        }
        NativeDate.append0PaddedUint(stringBuilder, n2, n3);
        stringBuilder.append('-');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.MonthFromTime(d2) + 1, 2);
        stringBuilder.append('-');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.DateFromTime(d2), 2);
        stringBuilder.append('T');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.HourFromTime(d2), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.MinFromTime(d2), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.SecFromTime(d2), 2);
        stringBuilder.append('.');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.msFromTime(d2), 3);
        stringBuilder.append('Z');
        return stringBuilder.toString();
    }

    private static String js_toUTCString(double d2) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder(60);
        NativeDate.appendWeekDayName(stringBuilder, NativeDate.WeekDay(d2));
        stringBuilder.append(", ");
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.DateFromTime(d2), 2);
        stringBuilder.append(' ');
        NativeDate.appendMonthName(stringBuilder, NativeDate.MonthFromTime(d2));
        stringBuilder.append(' ');
        int n3 = n2 = NativeDate.YearFromTime(d2);
        if (n2 < 0) {
            stringBuilder.append('-');
            n3 = -n2;
        }
        NativeDate.append0PaddedUint(stringBuilder, n3, 4);
        stringBuilder.append(' ');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.HourFromTime(d2), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.MinFromTime(d2), 2);
        stringBuilder.append(':');
        NativeDate.append0PaddedUint(stringBuilder, NativeDate.SecFromTime(d2), 2);
        stringBuilder.append(" GMT");
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static double makeDate(Context var0, double var1_1, Object[] var3_2, int var4_3) {
        block21: {
            block22: {
                if (var3_2.length == 0) {
                    return NaN;
                }
                var15_4 = 0;
                switch (var4_3) {
                    default: {
                        throw Kit.codeBug();
                    }
                    case 44: {
                        var11_5 = false;
                        ** GOTO lbl12
                    }
                    case 43: {
                        var11_5 = true;
lbl12:
                        // 2 sources

                        var4_3 = 3;
                        break block21;
                    }
                    case 42: {
                        var11_5 = false;
                        ** GOTO lbl19
                    }
                    case 41: {
                        var11_5 = true;
lbl19:
                        // 2 sources

                        var4_3 = 2;
                        break block21;
                    }
                    case 40: {
                        var11_5 = false;
                        break block22;
                    }
                    case 39: 
                }
                var11_5 = true;
            }
            var4_3 = 1;
        }
        var13_6 = var3_2.length < var4_3 ? var3_2.length : var4_3;
        var16_7 = new double[3];
        var14_9 = false;
        for (var12_8 = 0; var12_8 < var13_6; ++var12_8) {
            var5_10 = ScriptRuntime.toNumber(var3_2[var12_8]);
            if (!Double.isNaN(var5_10) && !Double.isInfinite(var5_10)) {
                var16_7[var12_8] = ScriptRuntime.toInteger(var5_10);
                continue;
            }
            var14_9 = true;
        }
        if (var14_9) {
            return NaN;
        }
        if (Double.isNaN(var1_1)) {
            if (var4_3 < 3) {
                return NaN;
            }
            var1_1 = 0.0;
        } else if (var11_5) {
            var1_1 = NativeDate.LocalTime(var0, var1_1);
        }
        if (var4_3 >= 3 && var13_6 > 0) {
            var5_10 = var16_7[0];
            var12_8 = 1;
        } else {
            var5_10 = NativeDate.YearFromTime(var1_1);
            var12_8 = var15_4;
        }
        if (var4_3 >= 2 && var12_8 < var13_6) {
            var7_11 = var16_7[var12_8];
            ++var12_8;
        } else {
            var7_11 = NativeDate.MonthFromTime(var1_1);
        }
        var9_12 = var4_3 >= 1 && var12_8 < var13_6 ? var16_7[var12_8] : (double)NativeDate.DateFromTime(var1_1);
        var1_1 = var5_10 = NativeDate.MakeDate(NativeDate.MakeDay(var5_10, var7_11, var9_12), NativeDate.TimeWithinDay(var1_1));
        if (var11_5) {
            var1_1 = NativeDate.internalUTC(var0, var5_10);
        }
        return NativeDate.TimeClip(var1_1);
    }

    /*
     * Unable to fully structure code
     */
    private static double makeTime(Context var0, double var1_1, Object[] var3_2, int var4_3) {
        block22: {
            block23: {
                if (var3_2.length == 0) {
                    return NaN;
                }
                var17_4 = 0;
                switch (var4_3) {
                    default: {
                        throw Kit.codeBug();
                    }
                    case 38: {
                        var13_5 = false;
                        ** GOTO lbl12
                    }
                    case 37: {
                        var13_5 = true;
lbl12:
                        // 2 sources

                        var4_3 = 4;
                        break block22;
                    }
                    case 36: {
                        var13_5 = false;
                        ** GOTO lbl19
                    }
                    case 35: {
                        var13_5 = true;
lbl19:
                        // 2 sources

                        var4_3 = 3;
                        break block22;
                    }
                    case 34: {
                        var13_5 = false;
                        ** GOTO lbl26
                    }
                    case 33: {
                        var13_5 = true;
lbl26:
                        // 2 sources

                        var4_3 = 2;
                        break block22;
                    }
                    case 32: {
                        var13_5 = false;
                        break block23;
                    }
                    case 31: 
                }
                var13_5 = true;
            }
            var4_3 = 1;
        }
        var15_6 = var3_2.length < var4_3 ? var3_2.length : var4_3;
        var18_7 = new double[4];
        var16_9 = false;
        for (var14_8 = 0; var14_8 < var15_6; ++var14_8) {
            var5_10 = ScriptRuntime.toNumber(var3_2[var14_8]);
            if (!Double.isNaN(var5_10) && !Double.isInfinite(var5_10)) {
                var18_7[var14_8] = ScriptRuntime.toInteger(var5_10);
                continue;
            }
            var16_9 = true;
        }
        if (!var16_9 && !Double.isNaN(var1_1)) {
            if (var13_5) {
                var1_1 = NativeDate.LocalTime(var0, var1_1);
            }
            if (var4_3 >= 4 && var15_6 > 0) {
                var5_10 = var18_7[0];
                var14_8 = 1;
            } else {
                var5_10 = NativeDate.HourFromTime(var1_1);
                var14_8 = var17_4;
            }
            if (var4_3 >= 3 && var14_8 < var15_6) {
                var7_11 = var18_7[var14_8];
                ++var14_8;
            } else {
                var7_11 = NativeDate.MinFromTime(var1_1);
            }
            if (var4_3 >= 2 && var14_8 < var15_6) {
                var9_12 = var18_7[var14_8];
                ++var14_8;
            } else {
                var9_12 = NativeDate.SecFromTime(var1_1);
            }
            var11_13 = var4_3 >= 1 && var14_8 < var15_6 ? var18_7[var14_8] : (double)NativeDate.msFromTime(var1_1);
            var5_10 = NativeDate.MakeTime(var5_10, var7_11, var9_12, var11_13);
            var1_1 = var5_10 = NativeDate.MakeDate(NativeDate.Day(var1_1), var5_10);
            if (var13_5) {
                var1_1 = NativeDate.internalUTC(var0, var5_10);
            }
            return NativeDate.TimeClip(var1_1);
        }
        return NaN;
    }

    private static int msFromTime(double d2) {
        double d3;
        d2 = d3 = d2 % 1000.0;
        if (d3 < 0.0) {
            d2 = d3 + 1000.0;
        }
        return (int)d2;
    }

    private static double now() {
        return System.currentTimeMillis();
    }

    /*
     * Unable to fully structure code
     */
    private static double parseISOString(Context var0, String var1_1) {
        block30: {
            block32: {
                block33: {
                    block31: {
                        block27: {
                            block26: {
                                block24: {
                                    block25: {
                                        v0 = var18_2 = new int[9];
                                        var18_2[0] = 1970;
                                        v0[1] = 1;
                                        v0[2] = 1;
                                        v0[3] = 0;
                                        v0[4] = 0;
                                        v0[5] = 0;
                                        v0[6] = 0;
                                        v0[7] = -1;
                                        v0[8] = -1;
                                        var14_3 = var1_1.length();
                                        if (var14_3 == 0) break block24;
                                        var6_4 = var1_1.charAt(0);
                                        if (var6_4 == 43 || var6_4 == 45) break block25;
                                        if (var6_4 != 84) break block24;
                                        var8_5 = 3;
                                        var6_4 = 1;
                                        break block26;
                                    }
                                    var6_4 = var6_4 == 45 ? -1 : 1;
                                    var8_5 = 0;
                                    var7_6 = 1;
                                    var9_7 = 6;
                                    var11_8 = var6_4;
                                    var6_4 = var7_6;
                                    break block27;
                                }
                                var8_5 = 0;
                                var6_4 = 0;
                            }
                            var11_8 = 1;
                            var9_7 = 4;
                        }
                        var12_9 = 1;
                        var13_10 = false;
                        block10: while (true) {
                            block29: {
                                var10_11 = var8_5;
                                var7_6 = var6_4;
                                if (var8_5 == -1) break;
                                var7_6 = var8_5 == 0 ? var9_7 : (var8_5 == 6 ? 3 : 2);
                                var15_12 = var6_4 + var7_6;
                                if (var15_12 > var14_3) {
                                    var7_6 = var6_4;
lbl45:
                                    // 4 sources

                                    while (true) {
                                        var10_11 = -1;
                                        break block10;
                                        break;
                                    }
                                }
                                var10_11 = 0;
                                while (var6_4 < var15_12) {
                                    block28: {
                                        var16_13 = var1_1.charAt(var6_4);
                                        var7_6 = var6_4++;
                                        if (var16_13 < 48) ** GOTO lbl45
                                        if (var16_13 <= 57) break block28;
                                        var7_6 = var6_4;
                                        ** GOTO lbl45
                                    }
                                    var10_11 = var16_13 - 48 + var10_11 * 10;
                                }
                                var18_2[var8_5] = var10_11;
                                if (var6_4 == var14_3) {
                                    if (var8_5 != 3 && var8_5 != 7) {
                                        var10_11 = var8_5;
                                        var7_6 = var6_4;
                                        break;
                                    }
                                    var10_11 = -1;
                                    var7_6 = var6_4;
                                    break;
                                }
                                var7_6 = var6_4 + 1;
                                var15_12 = var1_1.charAt(var6_4);
                                if (var15_12 == 90) {
                                    var18_2[7] = 0;
                                    var18_2[8] = 0;
                                    if (var8_5 == 4 || var8_5 == 5 || var8_5 == 6) ** break;
                                    ** continue;
                                    var10_11 = var8_5;
                                    break;
                                }
                                switch (var8_5) {
                                    default: {
                                        var6_4 = var8_5;
                                        break block29;
                                    }
                                    case 8: {
                                        var6_4 = -1;
                                        break block29;
                                    }
                                    case 7: {
                                        var6_4 = var7_6;
                                        if (var15_12 != 58) {
                                            var6_4 = var7_6 - 1;
                                        }
                                        var8_5 = 8;
                                        var7_6 = var6_4;
                                        var6_4 = var8_5;
                                        break block29;
                                    }
                                    case 6: {
                                        if (var15_12 != 43 && var15_12 != 45) ** GOTO lbl-1000
                                        ** GOTO lbl-1000
                                    }
                                    case 5: {
                                        if (var15_12 == 46) {
                                            var6_4 = 6;
                                        } else if (var15_12 != 43 && var15_12 != 45) lbl-1000:
                                        // 2 sources

                                        {
                                            var6_4 = -1;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var6_4 = 7;
                                        }
                                        break block29;
                                    }
                                    case 4: {
                                        var6_4 = var15_12 == 58 ? 5 : (var15_12 != 43 && var15_12 != 45 ? -1 : 7);
                                        break block29;
                                    }
                                    case 3: {
                                        var6_4 = var15_12 == 58 ? 4 : -1;
                                        var13_10 = true;
                                        break block29;
                                    }
                                    case 2: {
                                        var6_4 = var15_12 == 84 ? 3 : -1;
                                        break block29;
                                    }
                                    case 0: 
                                    case 1: 
                                }
                                var6_4 = var15_12 == 45 ? var8_5 + 1 : (var15_12 == 84 ? 3 : -1);
                            }
                            var10_11 = var12_9;
                            if (var6_4 == 7) {
                                var10_11 = var15_12 == 45 ? -1 : 1;
                            }
                            var8_5 = var6_4;
                            var6_4 = var7_6;
                            var12_9 = var10_11;
                        }
                        if (var10_11 == -1 || var7_6 != var14_3) break block30;
                        var7_6 = var18_2[0];
                        var17_14 = var18_2[1];
                        var6_4 = var18_2[2];
                        var15_12 = var18_2[3];
                        var10_11 = var18_2[4];
                        var8_5 = var18_2[5];
                        var14_3 = var18_2[6];
                        var16_13 = var18_2[7];
                        var9_7 = var18_2[8];
                        if (var7_6 > 275943 || var17_14 < 1 || var17_14 > 12 || var6_4 < 1 || var6_4 > NativeDate.DaysInMonth(var7_6, var17_14) || var15_12 > 24 || var15_12 == 24 && (var10_11 > 0 || var8_5 > 0 || var14_3 > 0) || var10_11 > 59 || var8_5 > 59 || var16_13 > 23 || var9_7 > 59) break block30;
                        var4_15 = NativeDate.date_msecFromDate(var7_6 * var11_8, var17_14 - 1, var6_4, var15_12, var10_11, var8_5, var14_3);
                        if (var16_13 != -1) break block31;
                        var2_16 = var4_15;
                        if (!var13_10) break block32;
                        var2_16 = (double)var0.getTimeZone().getRawOffset() + NativeDate.DaylightSavingTA(var0, var4_15);
                        break block33;
                    }
                    var2_16 = (double)(var16_13 * 60 + var9_7) * 60000.0 * (double)var12_9;
                }
                var2_16 = var4_15 - var2_16;
            }
            if (!(var2_16 < -8.64E15) && !(var2_16 > 8.64E15)) {
                return var2_16;
            }
        }
        return NaN;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String toLocale_helper(double d2, int n2) {
        DateFormat dateFormat;
        if (n2 != 5) {
            if (n2 != 6) {
                if (n2 != 7) {
                    throw new AssertionError();
                }
                dateFormat = localeDateFormatter;
            } else {
                dateFormat = localeTimeFormatter;
            }
        } else {
            dateFormat = localeDateTimeFormatter;
        }
        synchronized (dateFormat) {
            Object object = new Date((long)d2);
            return dateFormat.format((Date)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable object2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(DATE_TAG)) {
            return super.execIdCall((IdFunctionObject)object, context, scriptable, (Scriptable)object2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        if (n2 == -3) return ScriptRuntime.wrapNumber(NativeDate.now());
        if (n2 == -2) return ScriptRuntime.wrapNumber(NativeDate.date_parseString(context, ScriptRuntime.toString(objectArray, 0)));
        if (n2 == -1) return ScriptRuntime.wrapNumber(NativeDate.jsStaticFunction_UTC(objectArray));
        if (n2 != 1) {
            double d2;
            if (n2 != 47) {
                object = IdScriptableObject.ensureType(object2, NativeDate.class, (IdFunctionObject)object);
                double d3 = ((NativeDate)object).date;
                switch (n2) {
                    default: {
                        throw new IllegalArgumentException(String.valueOf(n2));
                    }
                    case 46: {
                        if (Double.isNaN(d3)) throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.invalid.date", new Object[0]));
                        return NativeDate.js_toISOString(d3);
                    }
                    case 45: {
                        double d4 = ScriptRuntime.toNumber(objectArray, 0);
                        if (!Double.isNaN(d4) && !Double.isInfinite(d4)) {
                            d3 = Double.isNaN(d3) ? 0.0 : NativeDate.LocalTime(context, d3);
                            double d5 = d4;
                            if (d4 >= 0.0) {
                                d5 = d4;
                                if (d4 <= 99.0) {
                                    d5 = d4 + 1900.0;
                                }
                            }
                            d3 = NativeDate.TimeClip(NativeDate.internalUTC(context, NativeDate.MakeDate(NativeDate.MakeDay(d5, NativeDate.MonthFromTime(d3), NativeDate.DateFromTime(d3)), NativeDate.TimeWithinDay(d3))));
                        } else {
                            d3 = Double.NaN;
                        }
                        ((NativeDate)object).date = d3;
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: {
                        ((NativeDate)object).date = d3 = NativeDate.makeDate(context, d3, objectArray, n2);
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: {
                        ((NativeDate)object).date = d3 = NativeDate.makeTime(context, d3, objectArray, n2);
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    case 30: {
                        ((NativeDate)object).date = d3 = NativeDate.TimeClip(ScriptRuntime.toNumber(objectArray, 0));
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    case 29: {
                        double d6 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d6);
                        d6 = (d3 - NativeDate.LocalTime(context, d3)) / 60000.0;
                        return ScriptRuntime.wrapNumber(d6);
                    }
                    case 27: 
                    case 28: {
                        double d7 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d7);
                        d7 = d3;
                        if (n2 == 27) {
                            d7 = NativeDate.LocalTime(context, d3);
                        }
                        d7 = NativeDate.msFromTime(d7);
                        return ScriptRuntime.wrapNumber(d7);
                    }
                    case 25: 
                    case 26: {
                        double d8 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d8);
                        d8 = d3;
                        if (n2 == 25) {
                            d8 = NativeDate.LocalTime(context, d3);
                        }
                        d8 = NativeDate.SecFromTime(d8);
                        return ScriptRuntime.wrapNumber(d8);
                    }
                    case 23: 
                    case 24: {
                        double d9 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d9);
                        d9 = d3;
                        if (n2 == 23) {
                            d9 = NativeDate.LocalTime(context, d3);
                        }
                        d9 = NativeDate.MinFromTime(d9);
                        return ScriptRuntime.wrapNumber(d9);
                    }
                    case 21: 
                    case 22: {
                        double d10 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d10);
                        d10 = d3;
                        if (n2 == 21) {
                            d10 = NativeDate.LocalTime(context, d3);
                        }
                        d10 = NativeDate.HourFromTime(d10);
                        return ScriptRuntime.wrapNumber(d10);
                    }
                    case 19: 
                    case 20: {
                        double d11 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d11);
                        d11 = d3;
                        if (n2 == 19) {
                            d11 = NativeDate.LocalTime(context, d3);
                        }
                        d11 = NativeDate.WeekDay(d11);
                        return ScriptRuntime.wrapNumber(d11);
                    }
                    case 17: 
                    case 18: {
                        double d12 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d12);
                        d12 = d3;
                        if (n2 == 17) {
                            d12 = NativeDate.LocalTime(context, d3);
                        }
                        d12 = NativeDate.DateFromTime(d12);
                        return ScriptRuntime.wrapNumber(d12);
                    }
                    case 15: 
                    case 16: {
                        double d13 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d13);
                        d13 = d3;
                        if (n2 == 15) {
                            d13 = NativeDate.LocalTime(context, d3);
                        }
                        d13 = NativeDate.MonthFromTime(d13);
                        return ScriptRuntime.wrapNumber(d13);
                    }
                    case 12: 
                    case 13: 
                    case 14: {
                        double d14 = d3;
                        if (Double.isNaN(d3)) return ScriptRuntime.wrapNumber(d14);
                        d14 = d3;
                        if (n2 != 14) {
                            d14 = NativeDate.LocalTime(context, d3);
                        }
                        d14 = d3 = (double)NativeDate.YearFromTime(d14);
                        if (n2 != 12) return ScriptRuntime.wrapNumber(d14);
                        if (context.hasFeature(1)) {
                            d14 = d3;
                            if (!(1900.0 <= d3)) return ScriptRuntime.wrapNumber(d14);
                            d14 = d3;
                            if (!(d3 < 2000.0)) return ScriptRuntime.wrapNumber(d14);
                        }
                        d14 = d3 - 1900.0;
                        return ScriptRuntime.wrapNumber(d14);
                    }
                    case 10: 
                    case 11: {
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    case 9: {
                        object = a.c("(new Date(");
                        ((StringBuilder)object).append(ScriptRuntime.toString(d3));
                        ((StringBuilder)object).append("))");
                        return ((StringBuilder)object).toString();
                    }
                    case 8: {
                        if (Double.isNaN(d3)) return js_NaN_date_str;
                        return NativeDate.js_toUTCString(d3);
                    }
                    case 5: 
                    case 6: 
                    case 7: {
                        if (Double.isNaN(d3)) return js_NaN_date_str;
                        return NativeDate.toLocale_helper(d3, n2);
                    }
                    case 2: 
                    case 3: 
                    case 4: 
                }
                if (Double.isNaN(d3)) return js_NaN_date_str;
                return NativeDate.date_format(context, d3, n2);
            }
            object = ScriptRuntime.toObject(context, scriptable, object2);
            if ((object2 = ScriptRuntime.toPrimitive(object, ScriptRuntime.NumberClass)) instanceof Number && (Double.isNaN(d2 = ((Number)object2).doubleValue()) || Double.isInfinite(d2))) {
                return null;
            }
            object2 = ScriptableObject.getProperty((Scriptable)object, "toISOString");
            if (object2 == Scriptable.NOT_FOUND) throw ScriptRuntime.typeErrorById("msg.function.not.found.in", "toISOString", ScriptRuntime.toString(object));
            if (!(object2 instanceof Callable)) throw ScriptRuntime.typeErrorById("msg.isnt.function.in", "toISOString", ScriptRuntime.toString(object), ScriptRuntime.toString(object2));
            if (!ScriptRuntime.isPrimitive(object = ((Callable)object2).call(context, scriptable, (Scriptable)object, ScriptRuntime.emptyArgs))) throw ScriptRuntime.typeErrorById("msg.toisostring.must.return.primitive", ScriptRuntime.toString(object));
            return object;
        }
        if (object2 == null) return NativeDate.jsConstructor(context, objectArray);
        return NativeDate.date_format(context, NativeDate.now(), 2);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object object = DATE_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -3, "now", 0);
        this.addIdFunctionProperty(idFunctionObject, object, -2, "parse", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -1, "UTC", 7);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 21;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 2101762217: {
                if (!string.equals("getMinutes")) break;
                n4 = 47;
                break;
            }
            case 1985132479: {
                if (!string.equals("setYear")) break;
                n4 = 46;
                break;
            }
            case 1984987727: {
                if (!string.equals("setTime")) break;
                n4 = 45;
                break;
            }
            case 1984503600: {
                if (!string.equals("setDate")) break;
                n4 = 44;
                break;
            }
            case 1959905482: {
                if (!string.equals("getMonth")) break;
                n4 = 43;
                break;
            }
            case 1955294553: {
                if (!string.equals("getHours")) break;
                n4 = 42;
                break;
            }
            case 1906261168: {
                if (!string.equals("setUTCDate")) break;
                n4 = 41;
                break;
            }
            case 1895745085: {
                if (!string.equals("setUTCSeconds")) break;
                n4 = 40;
                break;
            }
            case 1711705224: {
                if (!string.equals("getMilliseconds")) break;
                n4 = 39;
                break;
            }
            case 1424216019: {
                if (!string.equals("toLocaleTimeString")) break;
                n4 = 38;
                break;
            }
            case 1398793022: {
                if (!string.equals("setMonth")) break;
                n4 = 37;
                break;
            }
            case 1394182093: {
                if (!string.equals("setHours")) break;
                n4 = 36;
                break;
            }
            case 1162969076: {
                if (!string.equals("toLocaleDateString")) break;
                n4 = 35;
                break;
            }
            case 1121613873: {
                if (!string.equals("getUTCSeconds")) break;
                n4 = 34;
                break;
            }
            case 1078252731: {
                if (!string.equals("toISOString")) break;
                n4 = 33;
                break;
            }
            case 990550173: {
                if (!string.equals("setUTCMinutes")) break;
                n4 = 32;
                break;
            }
            case 830298702: {
                if (!string.equals("getUTCDay")) break;
                n4 = 31;
                break;
            }
            case 798017530: {
                if (!string.equals("getUTCFullYear")) break;
                n4 = 30;
                break;
            }
            case 648795069: {
                if (!string.equals("setSeconds")) break;
                n4 = 29;
                break;
            }
            case 546336410: {
                if (!string.equals("toUTCString")) break;
                n4 = 28;
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 27;
                break;
            }
            case 216418961: {
                if (!string.equals("getUTCMinutes")) break;
                n4 = 26;
                break;
            }
            case -30544068: {
                if (!string.equals("getUTCDate")) break;
                n4 = 25;
                break;
            }
            case -74977101: {
                if (!string.equals("getYear")) break;
                n4 = 24;
                break;
            }
            case -75121853: {
                if (!string.equals("getTime")) break;
                n4 = 23;
                break;
            }
            case -75605980: {
                if (!string.equals("getDate")) break;
                n4 = 22;
                break;
            }
            case -256399843: {
                if (!string.equals("setMinutes")) break;
                n4 = 21;
                break;
            }
            case -493762846: {
                if (!string.equals("getTimezoneOffset")) break;
                n4 = 20;
                break;
            }
            case -869188125: {
                if (!string.equals("toJSON")) break;
                n4 = 19;
                break;
            }
            case -885883678: {
                if (!string.equals("getFullYear")) break;
                n4 = 18;
                break;
            }
            case -938142542: {
                if (!string.equals("getUTCMonth")) break;
                n4 = 17;
                break;
            }
            case -942753471: {
                if (!string.equals("getUTCHours")) break;
                n4 = 16;
                break;
            }
            case -973718674: {
                if (!string.equals("setUTCFullYear")) break;
                n4 = 15;
                break;
            }
            case -974463506: {
                if (!string.equals("setFullYear")) break;
                n4 = 14;
                break;
            }
            case -999283436: {
                if (!string.equals("setUTCMilliseconds")) break;
                n4 = 13;
                break;
            }
            case -1026722370: {
                if (!string.equals("setUTCMonth")) break;
                n4 = 12;
                break;
            }
            case -1031333299: {
                if (!string.equals("setUTCHours")) break;
                n4 = 11;
                break;
            }
            case -1249364890: {
                if (!string.equals("getDay")) break;
                n4 = 10;
                break;
            }
            case -1288010167: {
                if (!string.equals("getSeconds")) break;
                n4 = 9;
                break;
            }
            case -1312629223: {
                if (!string.equals("toTimeString")) break;
                n4 = 8;
                break;
            }
            case -1326181948: {
                if (!string.equals("toGMTString")) break;
                n4 = 7;
                break;
            }
            case -1573876166: {
                if (!string.equals("toDateString")) break;
                n4 = 6;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 5;
                break;
            }
            case -1672509548: {
                if (!string.equals("setMilliseconds")) break;
                n4 = 4;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 3;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 2;
                break;
            }
            case -1919317088: {
                if (!string.equals("getUTCMilliseconds")) break;
                n4 = 1;
                break;
            }
            case -2020003546: {
                if (!string.equals("toLocaleString")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 34: {
                n3 = 26;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 7: 
            case 28: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 24: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 11;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 43;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 12: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 8: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 28;
                break;
            }
            case 0: {
                n3 = 5;
            }
            case 42: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Date";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        Class<?> clazz2 = clazz;
        if (clazz == null) {
            clazz2 = ScriptRuntime.StringClass;
        }
        return super.getDefaultValue(clazz2);
    }

    double getJSTimeValue() {
        return this.date;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block49: {
            var2_2 = 0;
            switch (var1_1) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(var1_1));
                }
                case 47: {
                    var3_3 = "toJSON";
                    ** GOTO lbl61
                }
                case 46: {
                    var3_3 = "toISOString";
                    break block49;
                }
                case 45: {
                    var3_3 = "setYear";
                    ** GOTO lbl61
                }
                case 44: {
                    var3_3 = "setUTCFullYear";
                    ** GOTO lbl44
                }
                case 43: {
                    var3_3 = "setFullYear";
                    ** GOTO lbl44
                }
                case 42: {
                    var3_3 = "setUTCMonth";
                    ** GOTO lbl51
                }
                case 41: {
                    var3_3 = "setMonth";
                    ** GOTO lbl51
                }
                case 40: {
                    var3_3 = "setUTCDate";
                    ** GOTO lbl61
                }
                case 39: {
                    var3_3 = "setDate";
                    ** GOTO lbl61
                }
                case 38: {
                    var3_3 = "setUTCHours";
                    ** GOTO lbl37
                }
                case 37: {
                    var3_3 = "setHours";
lbl37:
                    // 2 sources

                    var2_2 = 4;
                    break block49;
                }
                case 36: {
                    var3_3 = "setUTCMinutes";
                    ** GOTO lbl44
                }
                case 35: {
                    var3_3 = "setMinutes";
lbl44:
                    // 4 sources

                    var2_2 = 3;
                    break block49;
                }
                case 34: {
                    var3_3 = "setUTCSeconds";
                    ** GOTO lbl51
                }
                case 33: {
                    var3_3 = "setSeconds";
lbl51:
                    // 4 sources

                    var2_2 = 2;
                    break block49;
                }
                case 32: {
                    var3_3 = "setUTCMilliseconds";
                    ** GOTO lbl61
                }
                case 31: {
                    var3_3 = "setMilliseconds";
                    ** GOTO lbl61
                }
                case 30: {
                    var3_3 = "setTime";
lbl61:
                    // 7 sources

                    var2_2 = 1;
                    break block49;
                }
                case 29: {
                    var3_3 = "getTimezoneOffset";
                    break block49;
                }
                case 28: {
                    var3_3 = "getUTCMilliseconds";
                    break block49;
                }
                case 27: {
                    var3_3 = "getMilliseconds";
                    break block49;
                }
                case 26: {
                    var3_3 = "getUTCSeconds";
                    break block49;
                }
                case 25: {
                    var3_3 = "getSeconds";
                    break block49;
                }
                case 24: {
                    var3_3 = "getUTCMinutes";
                    break block49;
                }
                case 23: {
                    var3_3 = "getMinutes";
                    break block49;
                }
                case 22: {
                    var3_3 = "getUTCHours";
                    break block49;
                }
                case 21: {
                    var3_3 = "getHours";
                    break block49;
                }
                case 20: {
                    var3_3 = "getUTCDay";
                    break block49;
                }
                case 19: {
                    var3_3 = "getDay";
                    break block49;
                }
                case 18: {
                    var3_3 = "getUTCDate";
                    break block49;
                }
                case 17: {
                    var3_3 = "getDate";
                    break block49;
                }
                case 16: {
                    var3_3 = "getUTCMonth";
                    break block49;
                }
                case 15: {
                    var3_3 = "getMonth";
                    break block49;
                }
                case 14: {
                    var3_3 = "getUTCFullYear";
                    break block49;
                }
                case 13: {
                    var3_3 = "getFullYear";
                    break block49;
                }
                case 12: {
                    var3_3 = "getYear";
                    break block49;
                }
                case 11: {
                    var3_3 = "getTime";
                    break block49;
                }
                case 10: {
                    var3_3 = "valueOf";
                    break block49;
                }
                case 9: {
                    var3_3 = "toSource";
                    break block49;
                }
                case 8: {
                    var3_3 = "toUTCString";
                    break block49;
                }
                case 7: {
                    var3_3 = "toLocaleDateString";
                    break block49;
                }
                case 6: {
                    var3_3 = "toLocaleTimeString";
                    break block49;
                }
                case 5: {
                    var3_3 = "toLocaleString";
                    break block49;
                }
                case 4: {
                    var3_3 = "toDateString";
                    break block49;
                }
                case 3: {
                    var3_3 = "toTimeString";
                    break block49;
                }
                case 2: {
                    var3_3 = "toString";
                    break block49;
                }
                case 1: 
            }
            var3_3 = "constructor";
            var2_2 = 7;
        }
        this.initPrototypeMethod(NativeDate.DATE_TAG, var1_1, var3_3, var2_2);
    }
}

