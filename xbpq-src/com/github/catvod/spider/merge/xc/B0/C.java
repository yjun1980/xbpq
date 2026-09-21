/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.A0.b;
import com.github.catvod.spider.merge.xc.B0.A;
import com.github.catvod.spider.merge.xc.B0.B;
import com.github.catvod.spider.merge.xc.B0.p;
import com.github.catvod.spider.merge.xc.B0.q;
import com.github.catvod.spider.merge.xc.B0.r;
import com.github.catvod.spider.merge.xc.B0.s;
import com.github.catvod.spider.merge.xc.B0.t;
import com.github.catvod.spider.merge.xc.B0.u;
import com.github.catvod.spider.merge.xc.B0.v;
import com.github.catvod.spider.merge.xc.B0.w;
import com.github.catvod.spider.merge.xc.B0.x;
import com.github.catvod.spider.merge.xc.B0.y;
import com.github.catvod.spider.merge.xc.B0.z;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public final class C
implements Serializable {
    public static final u[] f = new u[0];
    public static final ConcurrentHashMap g = new ConcurrentHashMap(7);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final transient u[] d;
    public final transient int e;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public C(String var1_1, TimeZone var2_2, Locale var3_3) {
        super();
        this.a = var1_1;
        this.b = var2_2;
        this.c = var13_4 = com.github.catvod.spider.merge.xc.A0.b.a((Locale)var3_3);
        var2_2 = new DateFormatSymbols(var13_4);
        var14_5 = new ArrayList<Object>();
        var15_6 = var2_2.getEras();
        var16_7 = var2_2.getMonths();
        var17_8 = var2_2.getShortMonths();
        var11_9 = var2_2.getWeekdays();
        var3_3 = var2_2.getShortWeekdays();
        var19_10 = var2_2.getAmPmStrings();
        var6_11 = var1_1.length();
        var18_12 = new int[1];
        var5_13 = 0;
        while (var5_13 < var6_11) {
            block54: {
                block52: {
                    block53: {
                        block50: {
                            var18_12[0] = var5_13;
                            var2_2 = new StringBuilder();
                            var5_13 = var18_12[0];
                            var10_18 = var1_1.length();
                            var4_14 = var1_1.charAt(var5_13);
                            if (!(var4_14 >= 'A' && var4_14 <= 'Z' || var4_14 >= 'a' && var4_14 <= 'z')) {
                                var2_2.append('\'');
                                var7_15 = 0;
                            } else {
                                var2_2.append(var4_14);
                                while (true) {
                                    var7_15 = var5_13 + 1;
                                    var9_17 = var6_11;
                                    var8_16 = var5_13;
                                    if (var7_15 < var10_18) {
                                        var9_17 = var6_11;
                                        var8_16 = var5_13;
                                        if (var1_1.charAt(var7_15) == var4_14) {
                                            var2_2.append(var4_14);
                                            var5_13 = var7_15;
                                            continue;
                                        } else {
                                        }
                                    } else {
                                    }
                                    break;
                                }
                                while (true) {
                                    var5_13 = var9_17;
                                    var6_11 = var8_16;
                                    break block50;
                                    break;
                                }
                            }
                            while (true) {
                                var9_17 = var6_11;
                                var8_16 = var5_13;
                                if (var5_13 >= var10_18) ** continue;
                                var4_14 = var1_1.charAt(var5_13);
                                if (var4_14 == '\'') {
                                    var8_16 = var5_13 + 1;
                                    if (var8_16 < var10_18 && var1_1.charAt(var8_16) == '\'') {
                                        var2_2.append(var4_14);
                                        var5_13 = var8_16;
                                    } else {
                                        var7_15 ^= 1;
                                    }
                                } else {
                                    var8_16 = var6_11;
                                    if (var7_15 == 0 && (var4_14 >= 'A' && var4_14 <= 'Z' || var4_14 >= 'a' && var4_14 <= 'z')) {
                                        var6_11 = var5_13 - 1;
                                        var5_13 = var8_16;
                                        break;
                                    }
                                    var2_2.append(var4_14);
                                }
                                ++var5_13;
                            }
                        }
                        var18_12[0] = var6_11;
                        var12_19 = var2_2.toString();
                        var8_16 = var18_12[0];
                        var6_11 = var12_19.length();
                        if (var6_11 == 0) break;
                        var7_15 = var12_19.charAt(0);
                        if (var7_15 == 121) break block52;
                        if (var7_15 == 122) break block53;
                        switch (var7_15) {
                            default: {
                                switch (var7_15) {
                                    default: {
                                        var2_2 = r.d;
                                        switch (var7_15) {
                                            default: {
                                                throw new IllegalArgumentException("Illegal pattern component: ".concat((String)var12_19));
                                            }
                                            case 90: {
                                                if (var6_11 == 1) {
                                                    var2_2 = z.c;
                                                    break;
                                                }
                                                if (var6_11 == 2) break;
                                                var2_2 = z.b;
                                                break;
                                            }
                                            case 89: {
                                                break block52;
                                            }
                                            case 88: {
                                                if (var6_11 != 1) {
                                                    if (var6_11 != 2) {
                                                        if (var6_11 == 3) break;
                                                        throw new IllegalArgumentException("invalid number of X");
                                                    }
                                                    var2_2 = r.c;
                                                    break;
                                                }
                                                var2_2 = r.b;
                                                break;
                                            }
                                            case 87: {
                                                var2_2 = C.d(4, var6_11);
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    case 72: {
                                        var2_2 = C.d(11, var6_11);
                                        break;
                                    }
                                    case 71: {
                                        var2_2 = new w(var15_6, 0);
                                        break;
                                    }
                                    case 70: {
                                        var2_2 = C.d(8, var6_11);
                                        break;
                                    }
                                    case 69: {
                                        var2_2 = var6_11 < 4 ? var3_3 : var11_9;
                                        var2_2 = new w((String[])var2_2, 7);
                                        break;
                                    }
                                    case 68: {
                                        var2_2 = C.d(6, var6_11);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 119: {
                                var2_2 = C.d(3, var6_11);
                                break;
                            }
                            case 117: {
                                var2_2 = new q(C.d(7, var6_11), 0);
                                break;
                            }
                            case 115: {
                                var2_2 = C.d(13, var6_11);
                                break;
                            }
                            case 109: {
                                var2_2 = C.d(12, var6_11);
                                break;
                            }
                            case 107: {
                                var2_2 = new q(C.d(11, var6_11), 2);
                                break;
                            }
                            case 104: {
                                var2_2 = new q(C.d(10, var6_11), 1);
                                break;
                            }
                            case 100: {
                                var2_2 = C.d(5, var6_11);
                                break;
                            }
                            case 97: {
                                var2_2 = new w(var19_10, 9);
                                break;
                            }
                            case 83: {
                                var2_2 = C.d(14, var6_11);
                                break;
                            }
                            case 77: {
                                if (var6_11 >= 4) {
                                    var2_2 = new w(var16_7, 2);
                                    break;
                                }
                                if (var6_11 == 3) {
                                    var2_2 = new w(var17_8, 2);
                                    break;
                                }
                                if (var6_11 == 2) {
                                    var2_2 = A.b;
                                    break;
                                }
                                var2_2 = A.d;
                                break;
                            }
                            case 75: {
                                var2_2 = C.d(10, var6_11);
                                break;
                            }
                            case 39: {
                                var2_2 = var12_19.substring(1);
                                if (var2_2.length() == 1) {
                                    var2_2 = new p(var2_2.charAt(0));
                                    break;
                                }
                                var2_2 = new v((String)var2_2);
                                break;
                            }
                        }
                        break block54;
                    }
                    var2_2 = this.b;
                    var2_2 = var6_11 >= 4 ? new y((TimeZone)var2_2, var13_4, 1) : new y((TimeZone)var2_2, var13_4, 0);
                    break block54;
                }
                var2_2 = var6_11 == 2 ? A.c : C.d(1, Math.max(var6_11, 4));
                var12_19 = var2_2;
                var2_2 = var12_19;
                if (var7_15 == 89) {
                    var2_2 = new q((s)var12_19, 3);
                }
            }
            var14_5.add(var2_2);
            var7_15 = var8_16 + 1;
            var6_11 = var5_13;
            var5_13 = var7_15;
        }
        var1_1 = var14_5.toArray(C.f);
        this.d = var1_1;
        var6_11 = var1_1.length;
        var5_13 = 0;
        while (true) {
            if (--var6_11 < 0) {
                this.e = var5_13;
                return;
            }
            var5_13 += this.d[var6_11].c();
        }
    }

    public static void a(StringBuilder stringBuilder, int n2) {
        stringBuilder.append((char)(n2 / 10 + 48));
        stringBuilder.append((char)(n2 % 10 + 48));
    }

    public static void b(StringBuilder stringBuilder, int n2, int n3) {
        block12: {
            block8: {
                block9: {
                    block10: {
                        block11: {
                            if (n2 >= 10000) break block8;
                            int n4 = n2 < 1000 ? (n2 < 100 ? (n2 < 10 ? 1 : 2) : 3) : 4;
                            n3 -= n4;
                            while (n3 > 0) {
                                stringBuilder.append('0');
                                --n3;
                            }
                            n3 = n2;
                            if (n4 == 1) break block9;
                            n3 = n2;
                            if (n4 == 2) break block10;
                            n3 = n2;
                            if (n4 == 3) break block11;
                            if (n4 != 4) break block12;
                            stringBuilder.append((char)(n2 / 1000 + 48));
                            n3 = n2 % 1000;
                        }
                        if (n3 >= 100) {
                            stringBuilder.append((char)(n3 / 100 + 48));
                            n3 %= 100;
                        } else {
                            stringBuilder.append('0');
                        }
                    }
                    if (n3 >= 10) {
                        stringBuilder.append((char)(n3 / 10 + 48));
                        n3 %= 10;
                    } else {
                        stringBuilder.append('0');
                    }
                }
                stringBuilder.append((char)(n3 + 48));
                break block12;
            }
            char[] cArray = new char[10];
            int n5 = 0;
            int n6 = n2;
            n2 = n5;
            while (true) {
                n5 = n3;
                if (n6 == 0) break;
                cArray[n2] = (char)(n6 % 10 + 48);
                n6 /= 10;
                ++n2;
            }
            while (true) {
                n3 = n2;
                if (n2 >= n5) break;
                stringBuilder.append('0');
                --n5;
            }
            while (--n3 >= 0) {
                stringBuilder.append(cArray[n3]);
            }
        }
    }

    public static String c(TimeZone object, boolean bl, int n2, Locale locale) {
        x x2 = new x((TimeZone)object, bl, n2, locale);
        ConcurrentHashMap concurrentHashMap = g;
        String string = (String)concurrentHashMap.get(x2);
        Object object2 = string;
        if (string == null && (object = concurrentHashMap.putIfAbsent(x2, object2 = ((TimeZone)object).getDisplayName(bl, n2, locale))) != null) {
            object2 = object;
        }
        return object2;
    }

    public static s d(int n2, int n3) {
        if (n3 != 1) {
            if (n3 != 2) {
                return new t(n2, n3);
            }
            return new B(n2, 0);
        }
        return new B(n2, 1);
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof C;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (C)object;
        String string = ((C)object).a;
        bl = bl2;
        if (this.a.equals(string)) {
            bl = bl2;
            if (this.b.equals(((C)object).b)) {
                bl = bl2;
                if (this.c.equals(((C)object).c)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        return (this.c.hashCode() * 13 + n3) * 13 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDatePrinter[");
        stringBuilder.append(this.a);
        stringBuilder.append(",");
        stringBuilder.append(this.c);
        stringBuilder.append(",");
        stringBuilder.append(this.b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

