/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.d;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.y.a;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class f
implements d,
Closeable {
    private static final ThreadLocal<char[]> o;
    protected static final int[] p;
    protected int a;
    protected int b;
    protected int c;
    protected char d;
    protected int e;
    protected char[] f;
    protected int g;
    protected int h;
    protected boolean i;
    protected Calendar j = null;
    protected TimeZone k = com.github.catvod.spider.merge.y.a.a;
    protected Locale l = com.github.catvod.spider.merge.y.a.b;
    public int m = 0;
    protected String n = null;

    static {
        int n2;
        o = new ThreadLocal();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\"");
        stringBuilder.append(com.github.catvod.spider.merge.y.a.c);
        stringBuilder.append("\":\"");
        stringBuilder.toString().toCharArray();
        p = new int[103];
        for (n2 = 48; n2 <= 57; ++n2) {
            com.github.catvod.spider.merge.B.f.p[n2] = n2 - 48;
        }
        for (n2 = 97; n2 <= 102; ++n2) {
            com.github.catvod.spider.merge.B.f.p[n2] = n2 - 97 + 10;
        }
        for (n2 = 65; n2 <= 70; ++n2) {
            com.github.catvod.spider.merge.B.f.p[n2] = n2 - 65 + 10;
        }
    }

    public f(int n2) {
        this.c = n2;
        if ((n2 & com.github.catvod.spider.merge.B.c.l.a) != 0) {
            this.n = "";
        }
        char[] cArray = o.get();
        this.f = cArray;
        if (cArray == null) {
            this.f = new char[512];
        }
    }

    public static boolean V(char c2) {
        boolean bl = c2 <= ' ' && (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b');
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String Z(char[] cArray, int n2) {
        char[] cArray2 = new char[n2];
        int n3 = 0;
        int n4 = 0;
        while (true) {
            block22: {
                int n5;
                block24: {
                    block25: {
                        block26: {
                            block27: {
                                block28: {
                                    block29: {
                                        char c2;
                                        block23: {
                                            if (n3 >= n2) {
                                                return new String(cArray2, 0, n4);
                                            }
                                            c2 = cArray[n3];
                                            if (c2 == '\\') break block23;
                                            cArray2[n4] = c2;
                                            ++n4;
                                            break block22;
                                        }
                                        if ((n5 = cArray[++n3]) == 34) break block24;
                                        if (n5 == 39) break block25;
                                        if (n5 == 70) break block26;
                                        if (n5 == 92) break block27;
                                        if (n5 == 98) break block28;
                                        if (n5 == 102) break block26;
                                        if (n5 == 110) break block29;
                                        if (n5 != 114) {
                                            if (n5 != 120) {
                                                block0 : switch (n5) {
                                                    default: {
                                                        switch (n5) {
                                                            default: {
                                                                throw new com.github.catvod.spider.merge.y.d("unclosed.str.lit");
                                                            }
                                                            case 118: {
                                                                n5 = n4 + 1;
                                                                cArray2[n4] = 11;
                                                                n4 = n5;
                                                                break block0;
                                                            }
                                                            case 117: {
                                                                n5 = n4 + 1;
                                                                char c3 = cArray[++n3];
                                                                char c4 = cArray[++n3];
                                                                c2 = cArray[++n3];
                                                                cArray2[n4] = (char)Integer.parseInt(new String(new char[]{c3, c4, c2, cArray[++n3]}), 16);
                                                                n4 = n5;
                                                                break block0;
                                                            }
                                                            case 116: 
                                                        }
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 9;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 55: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 7;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 54: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 6;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 53: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 5;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 52: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 4;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 51: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 3;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 50: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 2;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 49: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = '\u0001';
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 48: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = '\u0000';
                                                        n4 = n5;
                                                        break;
                                                    }
                                                    case 47: {
                                                        n5 = n4 + 1;
                                                        cArray2[n4] = 47;
                                                        n4 = n5;
                                                        break;
                                                    }
                                                }
                                                break block22;
                                            } else {
                                                n5 = n4 + 1;
                                                int[] nArray = p;
                                                int n6 = nArray[cArray[++n3]];
                                                cArray2[n4] = (char)(n6 * 16 + nArray[cArray[++n3]]);
                                                n4 = n5;
                                            }
                                            break block22;
                                        } else {
                                            n5 = n4 + 1;
                                            cArray2[n4] = 13;
                                            n4 = n5;
                                        }
                                        break block22;
                                    }
                                    n5 = n4 + 1;
                                    cArray2[n4] = 10;
                                    n4 = n5;
                                    break block22;
                                }
                                n5 = n4 + 1;
                                cArray2[n4] = 8;
                                n4 = n5;
                                break block22;
                            }
                            n5 = n4 + 1;
                            cArray2[n4] = 92;
                            n4 = n5;
                            break block22;
                        }
                        n5 = n4 + 1;
                        cArray2[n4] = 12;
                        n4 = n5;
                        break block22;
                    }
                    n5 = n4 + 1;
                    cArray2[n4] = 39;
                    n4 = n5;
                    break block22;
                }
                n5 = n4 + 1;
                cArray2[n4] = 34;
                n4 = n5;
            }
            ++n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public double B(char var1_1) {
        block25: {
            block24: {
                this.m = 0;
                var9_2 = this.Q(this.e + 0);
                var11_3 = var9_2 == 34 ? 1 : 0;
                if (var11_3 != 0) {
                    var9_2 = this.Q(this.e + 1);
                    var8_4 = 2;
                } else {
                    var8_4 = 1;
                }
                var10_5 = var9_2 == 45;
                var12_6 = var9_2;
                var9_2 = var8_4;
                if (var10_5) {
                    var12_6 = this.Q(this.e + var8_4);
                    var9_2 = var8_4 + 1;
                }
                if (var12_6 < 48 || var12_6 > 57) break block24;
                var15_7 = var12_6 - 48;
                while (true) {
                    var12_6 = this.e;
                    var8_4 = var9_2 + 1;
                    if ((var12_6 = (int)this.Q(var12_6 + var9_2)) < 48 || var12_6 > 57) break;
                    var15_7 = var15_7 * 10L + (long)(var12_6 - 48);
                    var9_2 = var8_4;
                }
                var9_2 = var12_6 == 46 ? 1 : 0;
                if (var9_2 == 0) ** GOTO lbl52
                var12_6 = this.e;
                var9_2 = var8_4 + 1;
                if ((var8_4 = (int)this.Q(var12_6 + var8_4)) >= 48 && var8_4 <= 57) {
                    var19_8 = var15_7 * 10L + (long)(var8_4 - 48);
                    var17_9 = 10L;
                    var8_4 = var9_2;
                    while (true) {
                        var9_2 = this.e;
                        var12_6 = var8_4 + 1;
                        var9_2 = var13_11 = (int)this.Q(var9_2 + var8_4);
                        var21_10 = var17_9;
                        var15_7 = var19_8;
                        var8_4 = var12_6;
                        if (var13_11 >= 48) {
                            var9_2 = var13_11;
                            var21_10 = var17_9;
                            var15_7 = var19_8;
                            var8_4 = var12_6;
                            if (var13_11 <= 57) {
                                var19_8 = var19_8 * 10L + (long)(var13_11 - 48);
                                var17_9 *= 10L;
                                var8_4 = var12_6;
                                continue;
                            }
                        }
                        break;
                    }
                } else {
                    this.m = -1;
                    return 0.0;
lbl52:
                    // 1 sources

                    var21_10 = 1L;
                    var9_2 = var12_6;
                }
                var12_6 = var9_2 != 101 && var9_2 != 69 ? 0 : 1;
                if (var12_6 != 0) {
                    var13_11 = this.e;
                    var9_2 = var8_4 + 1;
                    if ((var13_11 = (int)this.Q(var13_11 + var8_4)) != 43 && var13_11 != 45) {
                        var8_4 = var9_2;
                        var9_2 = var13_11;
                    } else {
                        var13_11 = this.Q(this.e + var9_2);
                        var8_4 = var9_2 + 1;
                        var9_2 = var13_11;
                    }
                    while (var9_2 >= 48 && var9_2 <= 57) {
                        var9_2 = this.Q(this.e + var8_4);
                        ++var8_4;
                    }
                    var13_11 = var8_4;
                    var8_4 = var9_2;
                    var9_2 = var13_11;
                } else {
                    var13_11 = var9_2;
                    var9_2 = var8_4;
                    var8_4 = var13_11;
                }
                if (var11_3 != 0) {
                    if (var8_4 != 34) {
                        this.m = -1;
                        return 0.0;
                    }
                    var8_4 = this.e;
                    var11_3 = var9_2 + 1;
                    var8_4 = this.Q(var8_4 + var9_2);
                    var13_11 = this.e;
                    var9_2 = var13_11 + 1;
                    var13_11 = var13_11 + var11_3 - var9_2 - 2;
                } else {
                    var14_12 = this.e;
                    var13_11 = var14_12 + var9_2 - var14_12 - 1;
                    var11_3 = var9_2;
                    var9_2 = var14_12;
                }
                if (var12_6 == 0 && var13_11 < 17) {
                    var4_14 = var6_13 = (double)var15_7 / (double)var21_10;
                    if (var10_5) {
                        var4_14 = -var6_13;
                    }
                } else {
                    var4_14 = Double.parseDouble(this.r0(var9_2, var13_11));
                }
                if (var8_4 == var1_1) {
                    var1_1 = (char)(this.e + var11_3);
                    this.e = var1_1;
                    this.d = this.Q(var1_1);
                    this.m = 3;
                    this.a = 16;
                    return var4_14;
                }
                this.m = -1;
                return var4_14;
            }
            if (var12_6 != 110 || this.Q(this.e + var9_2) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, var9_2, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, var9_2, 2, this) != 'l') break block25;
            this.m = 5;
            var1_1 = (char)this.e;
            var8_4 = (var9_2 += 3) + 1;
            var2_16 = var3_15 = this.Q(var1_1 + var9_2);
            var1_1 = (char)var8_4;
            if (var11_3 == 0) ** GOTO lbl121
            var2_16 = var3_15;
            var1_1 = (char)var8_4;
            if (var3_15 != '\"') ** GOTO lbl121
            var1_1 = (char)var8_4;
            do {
                var2_16 = this.Q(this.e + var1_1);
                var1_1 = (char)(var1_1 + 1);
lbl121:
                // 3 sources

                if (var2_16 == ',') {
                    var1_1 = (char)(this.e + var1_1);
                    this.e = var1_1;
                    this.d = this.Q(var1_1);
                    this.m = 5;
                    var1_1 = (char)16;
lbl127:
                    // 2 sources

                    while (true) {
                        this.a = var1_1;
                        return 0.0;
                    }
                }
                if (var2_16 != ']') continue;
                var1_1 = (char)(this.e + var1_1);
                this.e = var1_1;
                this.d = this.Q(var1_1);
                this.m = 5;
                var1_1 = (char)15;
                ** continue;
            } while (com.github.catvod.spider.merge.B.f.V(var2_16));
            this.m = -1;
            return 0.0;
        }
        this.m = -1;
        return 0.0;
    }

    @Override
    public String C(p p2) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final float D(char var1_1) {
        block25: {
            block21: {
                block24: {
                    block22: {
                        block23: {
                            this.m = 0;
                            var8_2 = this.Q(this.e + 0);
                            var11_3 = var8_2 == 34 ? 1 : 0;
                            if (var11_3 != 0) {
                                var8_2 = this.Q(this.e + 1);
                                var7_4 = 2;
                            } else {
                                var7_4 = 1;
                            }
                            var6_5 = var8_2 == 45 ? 1 : 0;
                            var9_6 = var8_2;
                            var8_2 = var7_4;
                            if (var6_5 != 0) {
                                var9_6 = this.Q(this.e + var7_4);
                                var8_2 = var7_4 + 1;
                            }
                            if (var9_6 < 48 || var9_6 > 57) break block21;
                            var14_7 = var9_6 - 48;
                            while (true) {
                                var7_4 = this.e;
                                var9_6 = var8_2 + 1;
                                if ((var8_2 = (int)this.Q(var7_4 + var8_2)) < 48 || var8_2 > 57) break;
                                var14_7 = var14_7 * 10L + (long)(var8_2 - 48);
                                var8_2 = var9_6;
                            }
                            var16_8 = 1L;
                            var7_4 = var8_2 == 46 ? 1 : 0;
                            if (var7_4 != 0) {
                                var7_4 = this.e;
                                var8_2 = var9_6 + 1;
                                if ((var7_4 = (int)this.Q(var7_4 + var9_6)) >= 48 && var7_4 <= 57) {
                                    var20_9 = var14_7 * 10L + (long)(var7_4 - 48);
                                    var18_10 = 10L;
                                    while (true) {
                                        var9_6 = this.e;
                                        var7_4 = var8_2 + 1;
                                        var8_2 = var10_11 = (int)this.Q(var9_6 + var8_2);
                                        var14_7 = var20_9;
                                        var9_6 = var7_4;
                                        var16_8 = var18_10;
                                        if (var10_11 >= 48) {
                                            var8_2 = var10_11;
                                            var14_7 = var20_9;
                                            var9_6 = var7_4;
                                            var16_8 = var18_10;
                                            if (var10_11 <= 57) {
                                                var20_9 = var20_9 * 10L + (long)(var10_11 - 48);
                                                var18_10 *= 10L;
                                                var8_2 = var7_4;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                } else {
                                    this.m = -1;
                                    return 0.0f;
                                }
                            }
                            var7_4 = var8_2 != 101 && var8_2 != 69 ? 0 : 1;
                            if (var7_4 == 0) break block22;
                            var10_11 = this.e;
                            var8_2 = var9_6 + 1;
                            if ((var10_11 = (int)this.Q(var10_11 + var9_6)) == 43 || var10_11 == 45) break block23;
                            var22_12 = this;
                            var12_13 = 34;
                            var9_6 = var7_4;
                            var7_4 = var8_2;
                            var8_2 = var12_13;
                            ** GOTO lbl81
                        }
                        var10_11 = this.e;
                        var9_6 = var8_2 + 1;
                        var12_13 = this.Q(var10_11 + var8_2);
                        var22_12 = this;
                        var10_11 = var7_4;
                        var8_2 = 34;
                        var7_4 = var12_13;
                        var12_13 = var1_1;
                        var1_1 = var7_4;
                        var7_4 = var12_13;
                        while (true) {
                            var12_13 = var7_4;
                            var13_14 = var1_1;
                            var7_4 = var9_6;
                            var9_6 = var10_11;
                            var1_1 = var12_13;
                            var10_11 = var13_14;
lbl81:
                            // 2 sources

                            if (var10_11 < 48 || var10_11 > 57) break;
                            var10_11 = var22_12.e;
                            var12_13 = var7_4 + 1;
                            var10_11 = var22_12.Q(var10_11 + var7_4);
                            var7_4 = var1_1;
                            var1_1 = var10_11;
                            var10_11 = var9_6;
                            var9_6 = var12_13;
                        }
                        var12_13 = var9_6;
                        var13_14 = var8_2;
                        var8_2 = var10_11;
                        var9_6 = var1_1;
                        var10_11 = var13_14;
                        var1_1 = var12_13;
                        break block24;
                    }
                    var22_12 = this;
                    var10_11 = var7_4;
                    var13_15 = 34;
                    var12_13 = var1_1;
                    var7_4 = var9_6;
                    var1_1 = var10_11;
                    var10_11 = var13_15;
                    var9_6 = var12_13;
                }
                if (var11_3 != 0) {
                    if (var8_2 != var10_11) {
                        var22_12.m = -1;
                        return 0.0f;
                    }
                    var8_2 = var22_12.e;
                    var10_11 = var7_4 + 1;
                    var8_2 = var22_12.Q(var8_2 + var7_4);
                    var7_4 = var22_12.e;
                    var11_3 = var7_4 + 1;
                    var12_13 = var7_4 + var10_11 - var11_3 - 2;
                    var7_4 = var10_11;
                    var10_11 = var12_13;
                } else {
                    var11_3 = var22_12.e;
                    var10_11 = var11_3 + var7_4 - var11_3 - 1;
                }
                if (var1_1 == 0 && var10_11 < 17) {
                    var4_17 = var5_16 = (float)((double)var14_7 / (double)var16_8);
                    if (var6_5 != 0) {
                        var4_17 = -var5_16;
                    }
                } else {
                    var4_17 = Float.parseFloat(var22_12.r0(var11_3, var10_11));
                }
                if (var8_2 == var9_6) {
                    var22_12.e = var1_1 = var22_12.e + var7_4;
                    var22_12.d = var22_12.Q(var1_1);
                    var22_12.m = 3;
                    var22_12.a = 16;
                    return var4_17;
                }
                var22_12.m = -1;
                return var4_17;
            }
            if (var9_6 != 110 || this.Q(this.e + var8_2) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, var8_2, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, var8_2, 2, this) != 'l') break block25;
            this.m = 5;
            var7_4 = var8_2 + 3;
            var1_1 = this.e;
            var6_5 = var7_4 + 1;
            var2_19 = var3_18 = this.Q(var1_1 + var7_4);
            var1_1 = var6_5;
            if (var11_3 == 0) ** GOTO lbl152
            var2_19 = var3_18;
            var1_1 = var6_5;
            if (var3_18 != '\"') ** GOTO lbl152
            var1_1 = var6_5;
            do {
                var2_19 = this.Q(this.e + var1_1);
                ++var1_1;
lbl152:
                // 3 sources

                if (var2_19 == ',') {
                    this.e = var1_1 = (int)(this.e + var1_1);
                    this.d = this.Q(var1_1);
                    this.m = 5;
                    var1_1 = 16;
lbl157:
                    // 2 sources

                    while (true) {
                        this.a = var1_1;
                        return 0.0f;
                    }
                }
                if (var2_19 != ']') continue;
                this.e = var1_1 = this.e + var1_1;
                this.d = this.Q(var1_1);
                this.m = 5;
                var1_1 = 15;
                ** continue;
            } while (com.github.catvod.spider.merge.B.f.V(var2_19));
            this.m = -1;
            return 0.0f;
        }
        this.m = -1;
        return 0.0f;
    }

    @Override
    public final String E(p object) {
        boolean[] blArray;
        int n2 = this.a;
        int n3 = 0;
        if (n2 == 1 && this.b == 0 && this.e == 1) {
            this.e = 0;
        }
        if ((n2 = (int)this.d) >= (blArray = com.github.catvod.spider.merge.H.i.c).length || blArray[n2]) {
            n3 = 1;
        }
        if (n3 != 0) {
            blArray = com.github.catvod.spider.merge.H.i.d;
            this.h = this.e;
            this.g = 1;
            n3 = n2;
            while (true) {
                if ((n2 = (int)this.next()) < blArray.length && !blArray[n2]) {
                    this.d = this.Q(this.e);
                    this.a = 18;
                    if (this.g == 4 && n3 == 3392903 && this.Q(this.h) == 'n' && this.Q(this.h + 1) == 'u' && this.Q(this.h + 2) == 'l' && this.Q(this.h + 3) == 'l') {
                        return null;
                    }
                    if (object == null) {
                        return this.r0(this.h, this.g);
                    }
                    return this.N(this.h, this.g, n3, (p)object);
                }
                n3 = n3 * 31 + n2;
                ++this.g;
            }
        }
        object = com.github.catvod.spider.merge.C.a.c("illegal identifier : ");
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append(this.f());
        throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
    }

    @Override
    public final char F() {
        return this.d;
    }

    @Override
    public final Locale G() {
        return this.l;
    }

    @Override
    public final boolean H() {
        int n2 = this.g;
        boolean bl = false;
        if (n2 != 4) {
            return false;
        }
        boolean bl2 = bl;
        if (this.Q(this.h + 1) == '$') {
            bl2 = bl;
            if (this.Q(this.h + 2) == 'r') {
                bl2 = bl;
                if (this.Q(this.h + 3) == 'e') {
                    bl2 = bl;
                    if (this.Q(this.h + 4) == 'f') {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final String I(p var1_1, char var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 11[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public abstract String J();

    @Override
    public abstract String K();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void L() {
        this.h = this.e;
        this.i = false;
        block16: while (true) {
            block37: {
                block36: {
                    block35: {
                        var3_3 = this.next();
                        var1_1 = '\"';
                        if (var3_3 == '\"') {
                            this.a = 4;
                            this.d = this.next();
                            return;
                        }
                        var2_2 = '\u001a';
                        if (var3_3 == '\u001a') {
                            if (!this.U()) {
                                var1_1 = var2_2;
                                while (true) {
                                    this.Y(var1_1);
                                    continue block16;
                                    break;
                                }
                            }
                            var7_7 = new StringBuilder();
                            var7_7.append("unclosed string : ");
                            var7_7.append(var3_3);
                            throw new com.github.catvod.spider.merge.y.d(var7_7.toString());
                        }
                        var2_2 = '\\';
                        var6_6 = 1;
                        if (var3_3 != '\\') break block35;
                        if (!this.i) {
                            this.i = true;
                            var5_5 = this.g;
                            var7_7 = this.f;
                            if (var5_5 >= ((Object)var7_7).length) {
                                var4_4 /* !! */  = ((Object)var7_7).length * 2;
                                if (var5_5 > var4_4 /* !! */ ) {
                                    var4_4 /* !! */  = var5_5;
                                }
                                var8_8 = new char[var4_4 /* !! */ ];
                                System.arraycopy(var7_7, 0, var8_8, 0, ((Object)var7_7).length);
                                this.f = var8_8;
                            }
                            this.R(this.h + 1, this.g, this.f);
                        }
                        if ((var3_3 = this.next()) == '\"') ** GOTO lbl-1000
                        var1_1 = '\'';
                        if (var3_3 == '\'') ** GOTO lbl-1000
                        if (var3_3 == 70) ** GOTO lbl125
                        var1_1 = var2_2;
                        if (var3_3 == 92) ** continue;
                        if (var3_3 == 98) ** GOTO lbl123
                        if (var3_3 == 102) ** GOTO lbl125
                        if (var3_3 == 110) ** GOTO lbl121
                        if (var3_3 == 114) ** GOTO lbl119
                        if (var3_3 == 120) ** GOTO lbl97
                        var1_1 = '\u0003';
                        switch (var3_3) {
                            default: {
                                block11 : switch (var3_3) {
                                    default: {
                                        this.d = var3_3;
                                        var7_7 = new StringBuilder();
                                        var7_7.append("unclosed string : ");
                                        var7_7.append(var3_3);
                                        throw new com.github.catvod.spider.merge.y.d(var7_7.toString());
                                    }
                                    case 'v': {
                                        var1_1 = '\u000b';
                                        break;
                                    }
                                    case 'u': {
                                        var4_4 /* !! */  = Integer.parseInt(new String(new char[]{this.next(), this.next(), this.next(), this.next()}), 16);
lbl66:
                                        // 2 sources

                                        while (true) {
                                            var1_1 = (char)var4_4 /* !! */ ;
                                            break block11;
                                            break;
                                        }
                                    }
                                    case 't': {
                                        var1_1 = '\t';
                                        break;
                                    }
                                }
                                break block36;
                            }
                            case '7': {
                                var1_1 = '\u0007';
                                break block36;
                            }
                            case '6': {
                                var1_1 = '\u0006';
                                break block36;
                            }
                            case '5': {
                                var1_1 = '\u0005';
                                break block36;
                            }
                            case '4': {
                                this.Y('\u0004');
                                break;
                            }
                            case '2': {
                                this.Y('\u0002');
                                break;
                            }
                            case '1': {
                                this.Y('\u0001');
                                break;
                            }
                            case '0': {
                                this.Y('\u0000');
                                break;
                            }
                            case '/': {
                                var1_1 = '/';
                                break block36;
                            }
lbl97:
                            // 1 sources

                            var1_1 = this.next();
                            var2_2 = this.next();
                            var4_4 /* !! */  = var1_1 >= '0' && var1_1 <= '9' || var1_1 >= 'a' && var1_1 <= 'f' || var1_1 >= 'A' && var1_1 <= 'F' ? 1 : 0;
                            if (var2_2 < 48) ** GOTO lbl103
                            var5_5 = var6_6;
                            if (var2_2 <= 57) ** GOTO lbl107
lbl103:
                            // 2 sources

                            if (var2_2 < 97) ** GOTO lbl106
                            var5_5 = var6_6;
                            if (var2_2 <= 102) ** GOTO lbl107
lbl106:
                            // 2 sources

                            var5_5 = var2_2 >= 'A' && var2_2 <= 'F' ? var6_6 : 0;
lbl107:
                            // 3 sources

                            if (var4_4 /* !! */  != 0 && var5_5 != 0) {
                                var7_7 = com.github.catvod.spider.merge.B.f.p;
                                var4_4 /* !! */  = (int)(var7_7[var1_1] * 16 + var7_7[var2_2]);
                                ** continue;
                            }
                            var7_7 = new StringBuilder();
                            var7_7.append("invalid escape character \\x");
                            var7_7.append(var1_1);
                            var7_7.append(var2_2);
                            throw new com.github.catvod.spider.merge.y.d(var7_7.toString());
lbl119:
                            // 1 sources

                            var1_1 = '\r';
                            break block36;
lbl121:
                            // 1 sources

                            var1_1 = '\n';
                            break block36;
lbl123:
                            // 1 sources

                            var1_1 = '\b';
                            break block36;
lbl125:
                            // 2 sources

                            var1_1 = '\f';
                            break block36;
                            case '3': lbl-1000:
                            // 3 sources

                            {
                                this.Y(var1_1);
                                break;
                            }
                        }
                        continue;
                    }
                    if (!this.i) {
                        ++this.g;
                        continue;
                    }
                    var4_4 /* !! */  = this.g;
                    var7_7 = this.f;
                    if (var4_4 /* !! */  != ((Object)var7_7).length) break block37;
                    var1_1 = var3_3;
                }
                this.Y(var1_1);
                continue;
            }
            this.g = var4_4 /* !! */  + 1;
            var7_7[var4_4 /* !! */ ] = var3_3;
        }
    }

    @Override
    public final TimeZone M() {
        return this.k;
    }

    public abstract String N(int var1, int var2, int var3, p var4);

    protected abstract void O(int var1, char[] var2, int var3);

    protected abstract boolean P(char[] var1);

    public abstract char Q(int var1);

    protected abstract void R(int var1, int var2, char[] var3);

    public final Calendar S() {
        return this.j;
    }

    public abstract int T(int var1);

    public abstract boolean U();

    /*
     * Enabled aggressive block sorting
     */
    public final boolean W(char[] cArray) {
        block6: {
            int n2;
            block4: {
                char c2;
                block5: {
                    block3: {
                        while (!this.P(cArray)) {
                            if (!com.github.catvod.spider.merge.B.f.V(this.d)) return false;
                            this.next();
                        }
                        this.e = n2 = this.e + cArray.length;
                        this.d = c2 = this.Q(n2);
                        if (c2 != '{') break block3;
                        this.next();
                        n2 = 12;
                        break block4;
                    }
                    if (c2 != '[') break block5;
                    this.next();
                    n2 = 14;
                    break block4;
                }
                if (c2 != 'S' || this.Q(this.e + 1) != 'e' || this.Q(this.e + 2) != 't' || this.Q(this.e + 3) != '[') break block6;
                this.e = n2 = this.e + 3;
                this.d = this.Q(n2);
                n2 = 21;
            }
            this.a = n2;
            return true;
        }
        this.nextToken();
        return true;
    }

    public final void X() {
        this.g = 0;
        while (true) {
            char c2;
            if ((c2 = this.d) == ':') {
                this.next();
                this.nextToken();
                return;
            }
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("not match ");
                stringBuilder.append(':');
                stringBuilder.append(" - ");
                stringBuilder.append(this.d);
                stringBuilder.append(", info : ");
                stringBuilder.append(this.f());
                throw new com.github.catvod.spider.merge.y.d(stringBuilder.toString());
            }
            this.next();
        }
    }

    protected final void Y(char c2) {
        char[] cArray;
        int n2;
        int n3 = this.g;
        char[] cArray2 = this.f;
        if (n3 >= cArray2.length) {
            int n4;
            n2 = n4 = cArray2.length * 2;
            if (n4 < n3) {
                n2 = n3 + 1;
            }
            cArray = new char[n2];
            System.arraycopy(cArray2, 0, cArray, 0, cArray2.length);
            this.f = cArray;
        }
        cArray = this.f;
        n2 = this.g;
        this.g = n2 + 1;
        cArray[n2] = c2;
    }

    @Override
    public final void a() {
        this.X();
    }

    /*
     * Unable to fully structure code
     */
    public final long a0(char[] var1_1) {
        this.m = 0;
        if (!this.P(var1_1)) {
            this.m = -2;
            return 0L;
        }
        var3_2 = var1_1.length;
        var4_3 = this.e;
        var2_4 = var3_2 + 1;
        if (this.Q(var4_3 + var3_2) != '\"') {
            this.m = -1;
            return 0L;
        }
        var5_5 = -3750763034362895579L;
        while (true) {
            block9: {
                block10: {
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    block13: {
                                        block11: {
                                            var4_3 = this.e;
                                            var3_2 = var2_4 + 1;
                                            if ((var4_3 = (int)this.Q(var4_3 + var2_4)) != 34) break block9;
                                            var4_3 = this.e;
                                            var2_4 = var3_2 + 1;
                                            if ((var3_2 = (int)this.Q(var4_3 + var3_2)) == 44) {
                                                this.e = var2_4 = this.e + var2_4;
                                                this.d = this.Q(var2_4);
                                                var2_4 = 3;
lbl22:
                                                // 2 sources

                                                while (true) {
                                                    this.m = var2_4;
                                                    return var5_5;
                                                }
                                            }
                                            if (var3_2 != 125) break block10;
                                            var4_3 = this.e;
                                            var3_2 = var2_4 + 1;
                                            if ((var2_4 = (int)this.Q(var4_3 + var2_4)) != 44) break block11;
                                            var2_4 = 16;
                                            break block12;
                                        }
                                        if (var2_4 != 93) break block13;
                                        var2_4 = 15;
                                        break block12;
                                    }
                                    if (var2_4 != 125) break block14;
                                    var2_4 = 13;
                                }
                                this.a = var2_4;
                                this.e = var2_4 = this.e + var3_2;
                                this.d = this.Q(var2_4);
                                break block15;
                            }
                            if (var2_4 != 26) break block16;
                            this.a = 20;
                            this.e = var3_2 - 1 + this.e;
                            this.d = (char)26;
                        }
                        var2_4 = 4;
                        ** continue;
                    }
                    this.m = -1;
                    return 0L;
                }
                this.m = -1;
                return 0L;
            }
            var2_4 = var4_3 >= 65 && var4_3 <= 90 ? var4_3 + 32 : var4_3;
            var5_5 = (var5_5 ^ (long)var2_4) * 1099511628211L;
            if (var4_3 == 92) {
                this.m = -1;
                return 0L;
            }
            var2_4 = var3_2;
        }
    }

    @Override
    public final int b() {
        return this.b;
    }

    public final BigInteger b0(char[] object) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        block21: {
            block24: {
                block25: {
                    block31: {
                        block30: {
                            block29: {
                                block28: {
                                    block26: {
                                        block27: {
                                            block23: {
                                                int n7;
                                                block22: {
                                                    long l2;
                                                    long l3;
                                                    block20: {
                                                        this.m = 0;
                                                        if (!this.P((char[])object)) {
                                                            this.m = -2;
                                                            return null;
                                                        }
                                                        n6 = ((char[])object).length;
                                                        n5 = this.e;
                                                        n4 = n6 + 1;
                                                        n3 = (n6 = (int)this.Q(n5 + n6)) == 34 ? 1 : 0;
                                                        n5 = n4;
                                                        if (n3 != 0) {
                                                            n6 = this.Q(this.e + n4);
                                                            n5 = n4 + 1;
                                                        }
                                                        n4 = n6 == 45 ? 1 : 0;
                                                        n2 = n6;
                                                        n6 = n5;
                                                        if (n4 != 0) {
                                                            n2 = this.Q(this.e + n5);
                                                            n6 = n5 + 1;
                                                        }
                                                        if (n2 < 48 || n2 > 57) break block21;
                                                        l3 = n2 - 48;
                                                        n5 = n6;
                                                        while (true) {
                                                            n2 = this.e;
                                                            n6 = n5 + 1;
                                                            n7 = this.Q(n2 + n5);
                                                            if (n7 < 48 || n7 > 57) break;
                                                            l2 = 10L * l3 + (long)(n7 - 48);
                                                            if (l2 < l3) {
                                                                n5 = 1;
                                                                break block20;
                                                            }
                                                            l3 = l2;
                                                            n5 = n6;
                                                        }
                                                        n5 = 0;
                                                    }
                                                    if (n3 != 0) {
                                                        if (n7 != 34) {
                                                            this.m = -1;
                                                            return null;
                                                        }
                                                        n2 = this.e;
                                                        n3 = n6 + 1;
                                                        n2 = this.Q(n2 + n6);
                                                        n6 = this.e;
                                                        n7 = ((char[])object).length + n6 + 1;
                                                        int n8 = n6 + n3 - n7 - 2;
                                                        n6 = n3;
                                                        n3 = n2;
                                                        n2 = n8;
                                                    } else {
                                                        n3 = this.e;
                                                        int n9 = ((char[])object).length + n3;
                                                        n2 = n3 + n6 - n9 - 1;
                                                        n3 = n7;
                                                        n7 = n9;
                                                    }
                                                    if (n5 != 0 || n2 >= 20 && (n4 == 0 || n2 >= 21)) break block22;
                                                    l2 = l3;
                                                    if (n4 != 0) {
                                                        l2 = -l3;
                                                    }
                                                    object = BigInteger.valueOf(l2);
                                                    break block23;
                                                }
                                                if (n2 > 65535) break block24;
                                                object = new BigInteger(this.r0(n7, n2), 10);
                                            }
                                            if (n3 == 44) {
                                                this.e = n5 = this.e + n6;
                                                this.d = this.Q(n5);
                                                this.m = 3;
                                                this.a = 16;
                                                return object;
                                            }
                                            n5 = 16;
                                            if (n3 != 125) break block25;
                                            n3 = this.e;
                                            n4 = n6 + 1;
                                            if ((n6 = (int)this.Q(n3 + n6)) == 44) break block26;
                                            if (n6 != 93) break block27;
                                            this.a = 15;
                                            break block28;
                                        }
                                        if (n6 != 125) break block29;
                                        n5 = 13;
                                    }
                                    this.a = n5;
                                }
                                this.e = n5 = this.e + n4;
                                this.d = this.Q(n5);
                                break block30;
                            }
                            if (n6 != 26) break block31;
                            this.a = 20;
                            this.e = n4 - 1 + this.e;
                            this.d = (char)26;
                        }
                        this.m = 4;
                        return object;
                    }
                    this.m = -1;
                    return null;
                }
                this.m = -1;
                return null;
            }
            throw new com.github.catvod.spider.merge.y.d("scanInteger overflow");
        }
        if (n2 == 110 && this.Q(this.e + n6) == 'u' && com.github.catvod.spider.merge.B.e.a(this.e, n6, 1, this) == 'l' && com.github.catvod.spider.merge.B.e.a(this.e, n6, 2, this) == 'l') {
            char c2;
            this.m = 5;
            n4 = n6 + 3;
            n5 = this.e;
            n6 = n4 + 1;
            char c3 = c2 = this.Q(n5 + n4);
            n5 = n6;
            if (n3 != 0) {
                c3 = c2;
                n5 = n6;
                if (c2 == '\"') {
                    c3 = this.Q(this.e + n6);
                    n5 = n6 + 1;
                }
            }
            while (true) {
                if (c3 == ',') {
                    this.e = n5 = this.e + n5;
                    this.d = this.Q(n5);
                    this.m = 5;
                    this.a = 16;
                    return null;
                }
                if (c3 == '}') {
                    this.e = n5 = this.e + n5;
                    this.d = this.Q(n5);
                    this.m = 5;
                    this.a = 13;
                    return null;
                }
                if (!com.github.catvod.spider.merge.B.f.V(c3)) break;
                c3 = this.Q(this.e + n5);
                ++n5;
            }
            this.m = -1;
            return null;
        }
        this.m = -1;
        return null;
    }

    @Override
    public final int c() {
        boolean bl;
        int n2;
        int n3;
        block7: {
            block8: {
                int n4;
                int n5 = this.h;
                n3 = 0;
                if (n5 == -1) {
                    this.h = 0;
                }
                n2 = this.h;
                int n6 = this.g + n2;
                if (this.Q(n2) == '-') {
                    n4 = Integer.MIN_VALUE;
                    ++n2;
                    bl = true;
                } else {
                    n4 = -2147483647;
                    bl = false;
                }
                n5 = n2;
                if (n2 < n6) {
                    n3 = -(this.Q(n2) - 48);
                    n5 = n2 + 1;
                }
                while (true) {
                    n2 = n5;
                    if (n5 >= n6) break block7;
                    n2 = n5 + 1;
                    if ((n5 = (int)this.Q(n5)) == 76 || n5 == 83 || n5 == 66) break block7;
                    n5 -= 48;
                    if ((long)n3 < -214748364L) break block8;
                    if ((n3 *= 10) < n4 + n5) break;
                    n3 -= n5;
                    n5 = n2;
                }
                throw new NumberFormatException(this.J());
            }
            throw new NumberFormatException(this.J());
        }
        if (bl) {
            if (n2 > this.h + 1) {
                return n3;
            }
            throw new NumberFormatException(this.J());
        }
        return -n3;
    }

    /*
     * Unable to fully structure code
     */
    public boolean c0(char[] var1_1) {
        block21: {
            block22: {
                block23: {
                    block18: {
                        block20: {
                            block19: {
                                this.m = 0;
                                if (!this.P(var1_1)) {
                                    this.m = -2;
                                    return false;
                                }
                                var4_2 = var1_1.length;
                                var3_3 = this.e;
                                var2_4 = var4_2 + 1;
                                if ((var3_3 = (int)this.Q(var3_3 + var4_2)) != 116) break block19;
                                var4_2 = this.e;
                                var3_3 = var2_4 + 1;
                                if (this.Q(var4_2 + var2_4) != 'r') {
                                    this.m = -1;
                                    return false;
                                }
                                var2_4 = this.e;
                                var4_2 = var3_3 + 1;
                                if (this.Q(var2_4 + var3_3) != 'u') {
                                    this.m = -1;
                                    return false;
                                }
                                var3_3 = this.e;
                                var2_4 = var4_2 + 1;
                                if (this.Q(var3_3 + var4_2) != 'e') {
                                    this.m = -1;
                                    return false;
                                }
                                var5_5 = true;
                                break block20;
                            }
                            if (var3_3 != 102) break block21;
                            var4_2 = this.e;
                            var3_3 = var2_4 + 1;
                            if (this.Q(var4_2 + var2_4) != 'a') {
                                this.m = -1;
                                return false;
                            }
                            var4_2 = this.e;
                            var2_4 = var3_3 + 1;
                            if (this.Q(var4_2 + var3_3) != 'l') {
                                this.m = -1;
                                return false;
                            }
                            var4_2 = this.e;
                            var3_3 = var2_4 + 1;
                            if (this.Q(var4_2 + var2_4) != 's') {
                                this.m = -1;
                                return false;
                            }
                            if (this.Q(this.e + var3_3) != 'e') {
                                this.m = -1;
                                return false;
                            }
                            var2_4 = var3_3 + 1;
                            var5_5 = false;
                        }
                        var3_3 = this.e;
                        var4_2 = var2_4 + 1;
                        var2_4 = this.Q(var3_3 + var2_4);
                        if (var2_4 == 44) {
                            this.e = var2_4 = this.e + var4_2;
                            this.d = this.Q(var2_4);
                            this.m = 3;
                            this.a = 16;
                            return var5_5;
                        }
                        if (var2_4 != 125) break block22;
                        var2_4 = this.e;
                        var3_3 = var4_2 + 1;
                        if ((var2_4 = (int)this.Q(var2_4 + var4_2)) == 44) {
                            this.a = 16;
lbl63:
                            // 2 sources

                            while (true) {
                                this.e = var2_4 = this.e + var3_3;
                                this.d = this.Q(var2_4);
                                break block18;
                                break;
                            }
                        }
                        if (var2_4 == 93) {
                            var2_4 = 15;
lbl69:
                            // 2 sources

                            while (true) {
                                this.a = var2_4;
                                ** continue;
                                break;
                            }
                        }
                        if (var2_4 == 125) {
                            var2_4 = 13;
                            ** continue;
                        }
                        if (var2_4 != 26) break block23;
                        this.a = 20;
                        this.e = var3_3 - 1 + this.e;
                        this.d = (char)26;
                    }
                    this.m = 4;
                    return var5_5;
                }
                this.m = -1;
                return false;
            }
            this.m = -1;
            return false;
        }
        this.m = -1;
        return false;
    }

    @Override
    public void close() {
        char[] cArray = this.f;
        if (cArray.length <= 8192) {
            o.set(cArray);
        }
        this.f = null;
    }

    @Override
    public final void d() {
        char c2;
        while ((c2 = this.d) <= '/') {
            if (c2 != ' ' && c2 != '\r' && c2 != '\n' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                if (c2 != '/') break;
                this.q0();
                continue;
            }
            this.next();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Date d0(char[] var1_1) {
        block26: {
            block32: {
                block31: {
                    block30: {
                        block28: {
                            block29: {
                                block27: {
                                    var4_3 = 0;
                                    this.m = 0;
                                    if (!this.P(var1_1 /* !! */ )) {
                                        this.m = -2;
                                        return null;
                                    }
                                    var2_4 = var1_1 /* !! */ .length;
                                    var3_5 = this.e;
                                    var5_6 = var2_4 + 1;
                                    var6_7 = this.Q(var3_5 + var2_4);
                                    if (var6_7 != '\"') ** GOTO lbl46
                                    var3_5 = this.T(this.e + var1_1 /* !! */ .length + 1);
                                    if (var3_5 != -1) {
                                        var2_4 = this.e + var1_1 /* !! */ .length + 1;
                                        var12_8 = this.r0(var2_4, var3_5 - var2_4);
                                        var2_4 = var3_5;
                                        var11_9 = var12_8;
                                        if (var12_8.indexOf(92) != -1) {
                                            var2_4 = var3_5;
                                            while (true) {
                                                var4_3 = 0;
                                                for (var3_5 = var2_4 - 1; var3_5 >= 0 && this.Q(var3_5) == '\\'; --var3_5) {
                                                    ++var4_3;
                                                }
                                                if (var4_3 % 2 == 0) {
                                                    var4_3 = this.e;
                                                    var3_5 = var2_4 - (var1_1 /* !! */ .length + var4_3 + 1);
                                                    var11_9 = com.github.catvod.spider.merge.B.f.Z(this.s0(var4_3 + var1_1 /* !! */ .length + 1, var3_5), var3_5);
                                                    break;
                                                }
                                                var2_4 = this.T(var2_4 + 1);
                                            }
                                        }
                                        var3_5 = this.e;
                                        var4_3 = var2_4 - (var1_1 /* !! */ .length + var3_5 + 1) + 1 + var5_6;
                                        var2_4 = var4_3 + 1;
                                        var3_5 = this.Q(var3_5 + var4_3);
                                        var11_9 = new i((String)var11_9);
                                        try {
                                            if (!var11_9.x0(false)) {
                                                this.m = -1;
                                                return null;
                                            }
                                            var1_1 /* !! */  = (char[])var11_9.j.getTime();
                                        }
                                        finally {
                                            var11_9.close();
                                        }
                                    } else {
                                        throw new com.github.catvod.spider.merge.y.d("unclosed str");
lbl46:
                                        // 1 sources

                                        if (var6_7 != '-' && (var6_7 < '0' || var6_7 > '9')) {
                                            this.m = -1;
                                            return null;
                                        }
                                        var3_5 = var6_7;
                                        var2_4 = var5_6;
                                        if (var6_7 == '-') {
                                            var3_5 = this.Q(this.e + var5_6);
                                            var2_4 = var5_6 + 1;
                                            var4_3 = 1;
                                        }
                                        if (var3_5 >= 48 && var3_5 <= 57) {
                                            var7_10 = var3_5 - 48;
                                            var3_5 = var2_4;
                                            while (true) {
                                                var5_6 = this.e;
                                                var2_4 = var3_5 + 1;
                                                if ((var3_5 = (int)this.Q(var5_6 + var3_5)) >= 48 && var3_5 <= 57) {
                                                    var7_10 = var7_10 * 10L + (long)(var3_5 - 48);
                                                    var3_5 = var2_4;
                                                    continue;
                                                }
                                                break;
                                            }
                                        } else {
                                            var7_10 = 0L;
                                        }
                                        if (var7_10 < 0L) {
                                            this.m = -1;
                                            return null;
                                        }
                                        var9_11 = var7_10;
                                        if (var4_3 != 0) {
                                            var9_11 = -var7_10;
                                        }
                                        var1_1 /* !! */  = (char[])new Date(var9_11);
                                    }
                                    if (var3_5 == 44) {
                                        this.e = var2_4 = this.e + var2_4;
                                        this.d = this.Q(var2_4);
                                        var2_4 = 3;
lbl78:
                                        // 2 sources

                                        while (true) {
                                            this.m = var2_4;
                                            return var1_1 /* !! */ ;
                                        }
                                    }
                                    if (var3_5 != 125) break block26;
                                    var4_3 = this.e;
                                    var3_5 = var2_4 + 1;
                                    if ((var2_4 = (int)this.Q(var4_3 + var2_4)) != 44) break block27;
                                    var2_4 = 16;
                                    break block28;
                                }
                                if (var2_4 != 93) break block29;
                                var2_4 = 15;
                                break block28;
                            }
                            if (var2_4 != 125) break block30;
                            var2_4 = 13;
                        }
                        this.a = var2_4;
                        this.e = var2_4 = this.e + var3_5;
                        this.d = this.Q(var2_4);
                        break block31;
                    }
                    if (var2_4 != 26) break block32;
                    this.a = 20;
                    this.e = var3_5 - 1 + this.e;
                    this.d = (char)26;
                }
                var2_4 = 4;
                ** while (true)
            }
            this.m = -1;
            return null;
        }
        this.m = -1;
        return null;
    }

    @Override
    public final void e() {
        this.g = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final BigDecimal e0(char[] var1_1) {
        block36: {
            block25: {
                block28: {
                    block29: {
                        block35: {
                            block34: {
                                block33: {
                                    block31: {
                                        block32: {
                                            block30: {
                                                block24: {
                                                    block26: {
                                                        block27: {
                                                            this.m = 0;
                                                            if (!this.P(var1_1 /* !! */ )) {
                                                                this.m = -2;
                                                                return null;
                                                            }
                                                            var4_2 = var1_1 /* !! */ .length;
                                                            var5_3 = this.e;
                                                            var7_4 = var4_2 + 1;
                                                            var6_5 = this.Q(var5_3 + var4_2);
                                                            var4_2 = var6_5 == 34 ? 1 : 0;
                                                            var5_3 = var7_4;
                                                            if (var4_2 != 0) {
                                                                var6_5 = this.Q(this.e + var7_4);
                                                                var5_3 = var7_4 + 1;
                                                            }
                                                            var7_4 = var6_5 == 45 ? 1 : 0;
                                                            var8_6 = var6_5;
                                                            var6_5 = var5_3;
                                                            if (var7_4 != 0) {
                                                                var8_6 = this.Q(this.e + var5_3);
                                                                var6_5 = var5_3 + 1;
                                                            }
                                                            if (var8_6 < 48 || var8_6 > 57) break block25;
                                                            while (true) {
                                                                var5_3 = this.e;
                                                                var7_4 = var6_5 + 1;
                                                                if ((var6_5 = (int)this.Q(var5_3 + var6_5)) < 48 || var6_5 > 57) break;
                                                                var6_5 = var7_4;
                                                            }
                                                            var8_6 = var6_5 == 46 ? 1 : 0;
                                                            var5_3 = var7_4;
                                                            if (var8_6 != 0) {
                                                                var6_5 = this.e;
                                                                var5_3 = var7_4 + 1;
                                                                if ((var6_5 = (int)this.Q(var6_5 + var7_4)) >= 48 && var6_5 <= 57) {
                                                                    while (true) {
                                                                        var6_5 = this.e;
                                                                        var7_4 = var5_3 + 1;
                                                                        var6_5 = var8_6 = (int)this.Q(var6_5 + var5_3);
                                                                        var5_3 = var7_4;
                                                                        if (var8_6 >= 48) {
                                                                            var6_5 = var8_6;
                                                                            var5_3 = var7_4;
                                                                            if (var8_6 <= 57) {
                                                                                var5_3 = var7_4;
                                                                                continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                } else {
                                                                    this.m = -1;
                                                                    return null;
                                                                }
                                                            }
                                                            var7_4 = var6_5 != 101 && var6_5 != 69 ? 0 : 1;
                                                            if (var7_4 == 0) break block26;
                                                            var6_5 = this.e;
                                                            var7_4 = var5_3 + 1;
                                                            var8_6 = this.Q(var6_5 + var5_3);
                                                            if (var8_6 == 43 || var8_6 == 45) break block27;
                                                            var10_7 = this;
                                                            var6_5 = var4_2;
                                                            ** GOTO lbl64
                                                        }
                                                        var6_5 = this.e;
                                                        var5_3 = var7_4 + 1;
                                                        var8_6 = this.Q(var6_5 + var7_4);
                                                        var10_7 = this;
                                                        while (true) {
                                                            var7_4 = var5_3;
                                                            var6_5 = var4_2;
lbl64:
                                                            // 2 sources

                                                            var4_2 = var8_6;
                                                            var11_9 = var10_7;
                                                            var9_8 = var6_5;
                                                            var5_3 = var7_4;
                                                            if (var8_6 >= 48) {
                                                                var4_2 = var8_6;
                                                                var11_9 = var10_7;
                                                                var9_8 = var6_5;
                                                                var5_3 = var7_4;
                                                                if (var8_6 <= 57) {
                                                                    var4_2 = var10_7.e;
                                                                    var5_3 = var7_4 + 1;
                                                                    var8_6 = var10_7.Q(var4_2 + var7_4);
                                                                    var4_2 = var6_5;
                                                                    continue;
                                                                }
                                                            }
                                                            break block24;
                                                            break;
                                                        }
                                                    }
                                                    var11_9 = this;
                                                    var9_8 = var4_2;
                                                    var4_2 = var6_5;
                                                }
                                                if (var9_8 != 0) {
                                                    if (var4_2 != 34) {
                                                        var11_9.m = -1;
                                                        return null;
                                                    }
                                                    var6_5 = var11_9.e;
                                                    var4_2 = var5_3 + 1;
                                                    var6_5 = var11_9.Q(var6_5 + var5_3);
                                                    var5_3 = var11_9.e;
                                                    var7_4 = var1_1 /* !! */ .length + var5_3 + 1;
                                                    var8_6 = var5_3 + var4_2 - var7_4 - 2;
                                                    var5_3 = var4_2;
                                                    var4_2 = var6_5;
                                                    var6_5 = var8_6;
                                                } else {
                                                    var6_5 = var11_9.e;
                                                    var7_4 = var1_1 /* !! */ .length + var6_5;
                                                    var6_5 = var6_5 + var5_3 - var7_4 - 1;
                                                }
                                                if (var6_5 > 65535) break block28;
                                                var1_1 /* !! */  = var11_9.s0(var7_4, var6_5);
                                                var1_1 /* !! */  = (char[])new BigDecimal(var1_1 /* !! */ , 0, var1_1 /* !! */ .length, MathContext.UNLIMITED);
                                                if (var4_2 == 44) {
                                                    var11_9.e = var4_2 = var11_9.e + var5_3;
                                                    var11_9.d = var11_9.Q(var4_2);
                                                    var11_9.m = 3;
                                                    var11_9.a = 16;
                                                    return var1_1 /* !! */ ;
                                                }
                                                var6_5 = 16;
                                                if (var4_2 != 125) break block29;
                                                var4_2 = var11_9.e;
                                                var7_4 = var5_3 + 1;
                                                if ((var4_2 = (int)var11_9.Q(var4_2 + var5_3)) != 44) break block30;
                                                var4_2 = var6_5;
                                                break block31;
                                            }
                                            if (var4_2 != 93) break block32;
                                            var4_2 = 15;
                                            break block31;
                                        }
                                        if (var4_2 != 125) break block33;
                                        var4_2 = 13;
                                    }
                                    var11_9.a = var4_2;
                                    var11_9.e = var4_2 = var11_9.e + var7_4;
                                    var2_10 = var11_9.Q(var4_2);
                                    break block34;
                                }
                                var2_10 = 26;
                                if (var4_2 != 26) break block35;
                                var11_9.a = 20;
                                var11_9.e = var7_4 - 1 + var11_9.e;
                            }
                            var11_9.d = (char)var2_10;
                            var11_9.m = 4;
                            return var1_1 /* !! */ ;
                        }
                        var11_9.m = -1;
                        return null;
                    }
                    var11_9.m = -1;
                    return null;
                }
                throw new com.github.catvod.spider.merge.y.d("scan decimal overflow");
            }
            if (var8_6 != 110 || this.Q(this.e + var6_5) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, var6_5, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, var6_5, 2, this) != 'l') break block36;
            this.m = 5;
            var5_3 = var6_5 + 3;
            var7_4 = this.e;
            var6_5 = var5_3 + 1;
            var2_11 = var3_12 = this.Q(var7_4 + var5_3);
            var5_3 = var6_5;
            if (var4_2 == 0) ** GOTO lbl163
            var2_11 = var3_12;
            var5_3 = var6_5;
            if (var3_12 != '\"') ** GOTO lbl163
            var5_3 = var6_5;
            do {
                var2_11 = this.Q(this.e + var5_3);
                ++var5_3;
lbl163:
                // 3 sources

                if (var2_11 == ',') {
                    this.e = var4_2 = this.e + var5_3;
                    this.d = this.Q(var4_2);
                    this.m = 5;
                    this.a = 16;
                    return null;
                }
                if (var2_11 != '}') continue;
                this.e = var4_2 = this.e + var5_3;
                this.d = this.Q(var4_2);
                this.m = 5;
                this.a = 13;
                return null;
            } while (com.github.catvod.spider.merge.B.f.V(var2_11));
            this.m = -1;
            return null;
        }
        this.m = -1;
        return null;
    }

    @Override
    public String f() {
        return "";
    }

    public final double f0(char[] cArray) {
        int n2;
        char c2;
        int n3;
        int n4;
        int n5;
        block28: {
            block29: {
                block35: {
                    int n6;
                    double d2;
                    block34: {
                        block33: {
                            block31: {
                                block32: {
                                    block30: {
                                        this.m = 0;
                                        if (!this.P(cArray)) {
                                            this.m = -2;
                                            return 0.0;
                                        }
                                        n5 = cArray.length;
                                        n4 = this.e;
                                        n3 = n5 + 1;
                                        c2 = (n4 = (int)this.Q(n4 + n5)) == 34 ? (char)'\u0001' : '\u0000';
                                        n5 = n3;
                                        if (c2 != '\u0000') {
                                            n4 = this.Q(this.e + n3);
                                            n5 = n3 + 1;
                                        }
                                        n3 = n4 == 45 ? 1 : 0;
                                        n2 = n4;
                                        n4 = n5;
                                        if (n3 != 0) {
                                            n2 = this.Q(this.e + n5);
                                            n4 = n5 + 1;
                                        }
                                        if (n2 < 48 || n2 > 57) break block28;
                                        long l2 = n2 - 48;
                                        int n7 = n3;
                                        n5 = n4;
                                        while (true) {
                                            n3 = this.e;
                                            n4 = n5 + 1;
                                            if ((n3 = (int)this.Q(n3 + n5)) < 48 || n3 > 57) break;
                                            l2 = l2 * 10L + (long)(n3 - 48);
                                            n5 = n4;
                                        }
                                        long l3 = 1L;
                                        n2 = n3 == 46 ? 1 : 0;
                                        long l4 = l2;
                                        n5 = n4;
                                        if (n2 != 0) {
                                            n5 = this.e;
                                            n3 = n4 + 1;
                                            if ((n5 = (int)this.Q(n5 + n4)) >= 48 && n5 <= 57) {
                                                l2 = l2 * 10L + (long)(n5 - 48);
                                                l3 = 10L;
                                                while (true) {
                                                    n4 = this.e;
                                                    n5 = n3 + 1;
                                                    if ((n3 = (int)this.Q(n4 + n3)) < 48 || n3 > 57) break;
                                                    l2 = l2 * 10L + (long)(n3 - 48);
                                                    l3 *= 10L;
                                                    n3 = n5;
                                                }
                                                l4 = l2;
                                            } else {
                                                this.m = -1;
                                                return 0.0;
                                            }
                                        }
                                        boolean bl = n3 == 101 || n3 == 69;
                                        if (bl) {
                                            n3 = this.e;
                                            n4 = n5 + 1;
                                            n2 = this.Q(n3 + n5);
                                            if (n2 == 43 || n2 == 45) {
                                                n2 = this.Q(this.e + n4);
                                                ++n4;
                                            }
                                            while (true) {
                                                n3 = n2;
                                                n5 = n4;
                                                if (n2 < 48) break;
                                                n3 = n2;
                                                n5 = n4;
                                                if (n2 > 57) break;
                                                n2 = this.Q(this.e + n4);
                                                ++n4;
                                            }
                                        }
                                        if (c2 != '\u0000') {
                                            if (n3 != 34) {
                                                this.m = -1;
                                                return 0.0;
                                            }
                                            n4 = this.e;
                                            n3 = n5 + 1;
                                            c2 = this.Q(n4 + n5);
                                            n5 = this.e;
                                            n4 = cArray.length + n5 + 1;
                                            n2 = n5 + n3 - n4 - 2;
                                            n5 = n3;
                                            n3 = c2;
                                        } else {
                                            n2 = this.e;
                                            n4 = cArray.length + n2;
                                            n2 = n2 + n5 - n4 - 1;
                                        }
                                        if (!bl && n2 < 17) {
                                            double d3;
                                            d2 = d3 = (double)l4 / (double)l3;
                                            if (n7 != 0) {
                                                d2 = -d3;
                                            }
                                        } else {
                                            d2 = Double.parseDouble(this.r0(n4, n2));
                                        }
                                        if (n3 == 44) {
                                            this.e = n5 = this.e + n5;
                                            this.d = this.Q(n5);
                                            this.m = 3;
                                            this.a = 16;
                                            return d2;
                                        }
                                        n4 = 16;
                                        if (n3 != 125) break block29;
                                        n2 = this.e;
                                        n3 = n5 + 1;
                                        if ((n5 = (int)this.Q(n2 + n5)) != 44) break block30;
                                        n5 = n4;
                                        break block31;
                                    }
                                    if (n5 != 93) break block32;
                                    n5 = 15;
                                    break block31;
                                }
                                if (n5 != 125) break block33;
                                n5 = 13;
                            }
                            this.a = n5;
                            this.e = n5 = this.e + n3;
                            n6 = this.Q(n5);
                            break block34;
                        }
                        n6 = 26;
                        if (n5 != 26) break block35;
                        this.a = 20;
                        this.e = n3 - 1 + this.e;
                    }
                    this.d = (char)n6;
                    this.m = 4;
                    return d2;
                }
                this.m = -1;
                return 0.0;
            }
            this.m = -1;
            return 0.0;
        }
        if (n2 == 110 && this.Q(this.e + n4) == 'u' && com.github.catvod.spider.merge.B.e.a(this.e, n4, 1, this) == 'l' && com.github.catvod.spider.merge.B.e.a(this.e, n4, 2, this) == 'l') {
            char c3;
            this.m = 5;
            n5 = this.e;
            n3 = (n4 += 3) + 1;
            char c4 = c3 = this.Q(n5 + n4);
            n5 = n3;
            if (c2 != '\u0000') {
                c4 = c3;
                n5 = n3;
                if (c3 == '\"') {
                    c4 = this.Q(this.e + n3);
                    n5 = n3 + 1;
                }
            }
            while (true) {
                if (c4 == ',') {
                    this.e = n5 = this.e + n5;
                    this.d = this.Q(n5);
                    this.m = 5;
                    this.a = 16;
                    return 0.0;
                }
                if (c4 == '}') {
                    this.e = n5 = this.e + n5;
                    this.d = this.Q(n5);
                    this.m = 5;
                    this.a = 13;
                    return 0.0;
                }
                if (!com.github.catvod.spider.merge.B.f.V(c4)) break;
                c4 = this.Q(this.e + n5);
                ++n5;
            }
            this.m = -1;
            return 0.0;
        }
        this.m = -1;
        return 0.0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void g() {
        block13: {
            block12: {
                block15: {
                    block14: {
                        this.h = this.e;
                        var1_1 = this.d;
                        var2_2 = 1;
                        if (var1_1 != 45) ** GOTO lbl9
                        do {
                            ++this.g;
                            this.next();
lbl9:
                            // 2 sources

                        } while ((var3_3 = this.d) >= 48 && var3_3 <= 57);
                        var1_1 = 0;
                        if (var3_3 == 46) {
                            do {
                                ++this.g;
                                this.next();
                                var1_1 = this.d;
                            } while (var1_1 >= 48 && var1_1 <= 57);
                            var1_1 = 1;
                        }
                        if ((var3_3 = this.g) > 65535) break block13;
                        var4_4 = this.d;
                        if (var4_4 == 'L') lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                this.g = var3_3 + 1;
                                this.next();
                                break block12;
                                break;
                            }
                        }
                        ** while (var4_4 == 'S' || var4_4 == 'B')
lbl28:
                        // 1 sources

                        if (var4_4 == 'F') {
                            var1_1 = var3_3;
lbl30:
                            // 3 sources

                            while (true) {
                                this.g = var1_1 + 1;
                                this.next();
                                var1_1 = var2_2;
                                break block12;
                                break;
                            }
                        }
                        if (var4_4 != 'D') break block14;
                        var1_1 = var3_3;
                        ** GOTO lbl30
                    }
                    if (var4_4 != 'e' && var4_4 != 'E') break block12;
                    this.g = var3_3 + 1;
                    this.next();
                    var1_1 = this.d;
                    if (var1_1 != 43 && var1_1 != 45) ** GOTO lbl50
                    do {
                        ++this.g;
                        this.next();
lbl50:
                        // 2 sources

                    } while ((var3_3 = (int)this.d) >= 48 && var3_3 <= 57);
                    if (var3_3 == 68) break block15;
                    var1_1 = var2_2;
                    if (var3_3 != 70) break block12;
                }
                var1_1 = this.g;
                ** while (true)
            }
            var1_1 = var1_1 != 0 ? 3 : 2;
            this.a = var1_1;
            return;
        }
        throw new com.github.catvod.spider.merge.y.d("scanNumber overflow");
    }

    /*
     * Unable to fully structure code
     */
    public final float g0(char[] var1_1) {
        block36: {
            block39: {
                block43: {
                    block42: {
                        block41: {
                            block35: {
                                block40: {
                                    block34: {
                                        block37: {
                                            block38: {
                                                this.m = 0;
                                                if (!this.P(var1_1)) {
                                                    this.m = -2;
                                                    return 0.0f;
                                                }
                                                var7_2 = var1_1.length;
                                                var6_3 = this.e;
                                                var9_4 = var7_2 + 1;
                                                var8_5 = this.Q(var6_3 + var7_2);
                                                var6_3 = var8_5 == 34 ? 1 : 0;
                                                var7_2 = var9_4;
                                                if (var6_3 != 0) {
                                                    var8_5 = this.Q(this.e + var9_4);
                                                    var7_2 = var9_4 + 1;
                                                }
                                                var12_6 = var8_5 == 45;
                                                var9_4 = var8_5;
                                                var8_5 = var7_2;
                                                if (var12_6) {
                                                    var9_4 = this.Q(this.e + var7_2);
                                                    var8_5 = var7_2 + 1;
                                                }
                                                if (var9_4 < 48 || var9_4 > 57) break block36;
                                                var16_7 = var9_4 - 48;
                                                var7_2 = var8_5;
                                                while (true) {
                                                    var9_4 = this.e;
                                                    var8_5 = var7_2 + 1;
                                                    if ((var9_4 = (int)this.Q(var9_4 + var7_2)) < 48 || var9_4 > 57) break;
                                                    var16_7 = var16_7 * 10L + (long)(var9_4 - 48);
                                                    var7_2 = var8_5;
                                                }
                                                var7_2 = var9_4 == 46 ? 1 : 0;
                                                if (var7_2 == 0) ** GOTO lbl58
                                                var9_4 = this.e;
                                                var7_2 = var8_5 + 1;
                                                if ((var8_5 = (int)this.Q(var9_4 + var8_5)) >= 48 && var8_5 <= 57) {
                                                    var20_8 = var16_7 * 10L + (long)(var8_5 - 48);
                                                    var22_9 = 10L;
                                                    var8_5 = var7_2;
                                                    while (true) {
                                                        var9_4 = this.e;
                                                        var7_2 = var8_5 + 1;
                                                        var9_4 = var10_11 = (int)this.Q(var9_4 + var8_5);
                                                        var18_10 = var22_9;
                                                        var16_7 = var20_8;
                                                        var8_5 = var7_2;
                                                        if (var10_11 >= 48) {
                                                            var9_4 = var10_11;
                                                            var18_10 = var22_9;
                                                            var16_7 = var20_8;
                                                            var8_5 = var7_2;
                                                            if (var10_11 <= 57) {
                                                                var20_8 = var20_8 * 10L + (long)(var10_11 - 48);
                                                                var22_9 *= 10L;
                                                                var8_5 = var7_2;
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    this.m = -1;
                                                    return 0.0f;
lbl58:
                                                    // 1 sources

                                                    var18_10 = 1L;
                                                }
                                                var7_2 = var9_4 != 101 && var9_4 != 69 ? 0 : 1;
                                                if (var7_2 == 0) break block37;
                                                var9_4 = this.e;
                                                var10_11 = var8_5 + 1;
                                                var11_12 = this.Q(var9_4 + var8_5);
                                                if (var11_12 == '+' || var11_12 == '-') break block38;
                                                var24_13 = this;
                                                var14_14 = '0';
                                                ** GOTO lbl77
                                            }
                                            var8_5 = this.e;
                                            var9_4 = var10_11 + 1;
                                            var8_5 += var10_11;
                                            var24_13 = this;
                                            var14_14 = '0';
                                            var10_11 = var9_4;
                                            while (true) {
                                                var11_12 = var24_13.Q(var8_5);
lbl77:
                                                // 2 sources

                                                var9_4 = var11_12;
                                                var15_16 = var6_3;
                                                var13_15 = var7_2;
                                                var22_9 = var18_10;
                                                var8_5 = var10_11;
                                                var20_8 = var16_7;
                                                var25_17 = var24_13;
                                                if (var11_12 >= var14_14) {
                                                    var9_4 = var11_12;
                                                    var15_16 = var6_3;
                                                    var13_15 = var7_2;
                                                    var22_9 = var18_10;
                                                    var8_5 = var10_11;
                                                    var20_8 = var16_7;
                                                    var25_17 = var24_13;
                                                    if (var11_12 <= '9') {
                                                        var8_5 = var24_13.e + var10_11;
                                                        ++var10_11;
                                                        continue;
                                                    }
                                                }
                                                break block34;
                                                break;
                                            }
                                        }
                                        var25_17 = this;
                                        var20_8 = var16_7;
                                        var22_9 = var18_10;
                                        var13_15 = var7_2;
                                        var15_16 = var6_3;
                                    }
                                    if (var15_16 != 0) {
                                        if (var9_4 != 34) {
                                            var25_17.m = -1;
                                            return 0.0f;
                                        }
                                        var7_2 = var25_17.e;
                                        var6_3 = var8_5 + 1;
                                        var9_4 = var25_17.Q(var7_2 + var8_5);
                                        var8_5 = var25_17.e;
                                        var7_2 = var1_1.length + var8_5 + 1;
                                        var10_11 = var8_5 + var6_3 - var7_2 - 2;
                                        var8_5 = var6_3;
                                        var6_3 = var10_11;
                                    } else {
                                        var6_3 = var25_17.e;
                                        var7_2 = var1_1.length + var6_3;
                                        var6_3 = var6_3 + var8_5 - var7_2 - 1;
                                    }
                                    if (var13_15 == 0 && var6_3 < 17) {
                                        var4_19 = var5_18 = (float)((double)var20_8 / (double)var22_9);
                                        if (var12_6) {
                                            var4_19 = -var5_18;
                                        }
                                    } else {
                                        var4_19 = Float.parseFloat(var25_17.r0(var7_2, var6_3));
                                    }
                                    if (var9_4 == 44) {
                                        var25_17.e = var6_3 = var25_17.e + var8_5;
                                        var25_17.d = var25_17.Q(var6_3);
                                        var25_17.m = 3;
                                        var25_17.a = 16;
                                        return var4_19;
                                    }
                                    if (var9_4 != 125) break block39;
                                    var6_3 = var25_17.e;
                                    var7_2 = var8_5 + 1;
                                    if ((var6_3 = (int)var25_17.Q(var6_3 + var8_5)) != 44) break block40;
                                    var25_17.a = 16;
                                    break block35;
                                }
                                if (var6_3 == 93) {
                                    var6_3 = 15;
lbl141:
                                    // 2 sources

                                    while (true) {
                                        var25_17.a = var6_3;
                                        break block35;
                                        break;
                                    }
                                }
                                if (var6_3 == 125) {
                                    var6_3 = 13;
                                    ** continue;
                                }
                                break block41;
                            }
                            var25_17.e = var6_3 = var25_17.e + var7_2;
                            var25_17.d = var25_17.Q(var6_3);
                            break block42;
                        }
                        if (var6_3 != 26) break block43;
                        var25_17.e = var7_2 - 1 + var25_17.e;
                        var25_17.a = 20;
                        var25_17.d = (char)26;
                    }
                    var25_17.m = 4;
                    return var4_19;
                }
                var25_17.m = -1;
                return 0.0f;
            }
            var25_17.m = -1;
            return 0.0f;
        }
        if (var9_4 == 110 && this.Q(this.e + var8_5) == 'u' && com.github.catvod.spider.merge.B.e.a(this.e, var8_5, 1, this) == 'l' && com.github.catvod.spider.merge.B.e.a(this.e, var8_5, 2, this) == 'l') {
            this.m = 5;
            var7_2 = var8_5 + 3;
            var9_4 = this.e;
            var8_5 = var7_2 + 1;
            var2_21 = var3_20 = this.Q(var9_4 + var7_2);
            var7_2 = var8_5;
            if (var6_3 != 0) {
                var2_21 = var3_20;
                var7_2 = var8_5;
                if (var3_20 == '\"') {
                    var2_21 = this.Q(this.e + var8_5);
                    var7_2 = var8_5 + 1;
                }
            }
            while (true) {
                if (var2_21 == ',') {
                    this.e = var6_3 = this.e + var7_2;
                    this.d = this.Q(var6_3);
                    this.m = 5;
                    this.a = 16;
                    return 0.0f;
                }
                if (var2_21 == '}') {
                    this.e = var6_3 = this.e + var7_2;
                    this.d = this.Q(var6_3);
                    this.m = 5;
                    this.a = 13;
                    return 0.0f;
                }
                if (!com.github.catvod.spider.merge.B.f.V(var2_21)) break;
                var2_21 = this.Q(this.e + var7_2);
                ++var7_2;
            }
            this.m = -1;
            return 0.0f;
        }
        this.m = -1;
        return 0.0f;
    }

    @Override
    public final long h() {
        long l2;
        int n2;
        boolean bl;
        block8: {
            block9: {
                long l3;
                int n3 = this.h;
                bl = false;
                if (n3 == -1) {
                    this.h = 0;
                }
                n3 = this.h;
                int n4 = this.g + n3;
                if (this.Q(n3) == '-') {
                    l3 = Long.MIN_VALUE;
                    ++n3;
                    bl = true;
                } else {
                    l3 = -9223372036854775807L;
                }
                if (n3 < n4) {
                    n2 = n3 + 1;
                    l2 = -(this.Q(n3) - 48);
                    n3 = n2;
                } else {
                    l2 = 0L;
                }
                while (true) {
                    n2 = n3;
                    if (n3 >= n4) break block8;
                    n2 = n3 + 1;
                    if ((n3 = (int)this.Q(n3)) == 76 || n3 == 83 || n3 == 66) break block8;
                    if (l2 < -922337203685477580L) break block9;
                    long l4 = l2 * 10L;
                    if (l4 < l3 + (l2 = (long)(n3 - 48))) break;
                    l2 = l4 - l2;
                    n3 = n2;
                }
                throw new NumberFormatException(this.J());
            }
            throw new NumberFormatException(this.J());
        }
        if (bl) {
            if (n2 > this.h + 1) {
                return l2;
            }
            throw new NumberFormatException(this.J());
        }
        return -l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float[] h0(char[] var1_1) {
        this.m = 0;
        if (!this.P(var1_1 /* !! */ )) {
            this.m = -2;
            return null;
        }
        var6_2 = var1_1 /* !! */ .length;
        var5_3 = this.e;
        var4_4 = var6_2 + 1;
        if (this.Q(var5_3 + var6_2) != '[') {
            this.m = -2;
            return null;
        }
        var5_3 = this.e;
        var6_2 = var4_4 + 1;
        var7_5 = this.Q(var5_3 + var4_4);
        var1_1 /* !! */  = (char[])new float[16];
        var4_4 = 0;
        while (true) {
            block28: {
                block29: {
                    block30: {
                        block34: {
                            block33: {
                                block32: {
                                    block31: {
                                        block27: {
                                            block26: {
                                                block24: {
                                                    block25: {
                                                        var9_9 = this.e;
                                                        var15_15 = var9_9 + var6_2 - 1;
                                                        var5_3 = var7_5 == 45 ? 1 : 0;
                                                        var8_8 = var7_5;
                                                        var7_5 = var6_2;
                                                        if (var5_3 != 0) {
                                                            var8_8 = this.Q(var9_9 + var6_2);
                                                            var7_5 = var6_2 + 1;
                                                        }
                                                        if (var8_8 < 48 || var8_8 > 57) break;
                                                        var6_2 = var8_8 - 48;
                                                        while (true) {
                                                            var8_8 = this.e;
                                                            var10_10 = var7_5 + 1;
                                                            var9_9 = this.Q(var8_8 + var7_5);
                                                            if (var9_9 < 48 || var9_9 > 57) break;
                                                            var6_2 = var6_2 * 10 + (var9_9 - 48);
                                                            var7_5 = var10_10;
                                                        }
                                                        var7_5 = var9_9 == 46 ? 1 : 0;
                                                        if (var7_5 == 0) ** GOTO lbl64
                                                        var8_8 = this.e;
                                                        var7_5 = var10_10 + 1;
                                                        if ((var8_8 = (int)this.Q(var8_8 + var10_10)) >= 48 && var8_8 <= 57) {
                                                            var11_11 = var8_8 - 48 + var6_2 * 10;
                                                            var8_8 = 10;
                                                            var6_2 = var7_5;
                                                            while (true) {
                                                                var7_5 = this.e;
                                                                var12_12 = var6_2 + 1;
                                                                var13_13 = this.Q(var7_5 + var6_2);
                                                                var6_2 = var8_8;
                                                                var7_5 = var11_11;
                                                                var9_9 = var13_13;
                                                                var10_10 = var12_12;
                                                                if (var13_13 >= 48) {
                                                                    var6_2 = var8_8;
                                                                    var7_5 = var11_11;
                                                                    var9_9 = var13_13;
                                                                    var10_10 = var12_12;
                                                                    if (var13_13 <= 57) {
                                                                        var11_11 = var11_11 * 10 + (var13_13 - 48);
                                                                        var8_8 *= 10;
                                                                        var6_2 = var12_12;
                                                                        continue;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        } else {
                                                            this.m = -1;
                                                            return null;
lbl64:
                                                            // 1 sources

                                                            var8_8 = 1;
                                                            var7_5 = var6_2;
                                                            var6_2 = var8_8;
                                                        }
                                                        var8_8 = var9_9 != 101 && var9_9 != 69 ? 0 : 1;
                                                        if (var8_8 == 0) break block24;
                                                        var9_9 = this.e;
                                                        var12_12 = var10_10 + 1;
                                                        var11_11 = this.Q(var9_9 + var10_10);
                                                        if (var11_11 == 43 || var11_11 == 45) break block25;
                                                        var13_13 = 1;
                                                        var10_10 = var6_2;
                                                        var9_9 = var7_5;
                                                        var6_2 = var4_4;
                                                        var7_5 = var13_13;
                                                        var4_4 = var12_12;
                                                        ** GOTO lbl96
                                                    }
                                                    var10_10 = this.e;
                                                    var9_9 = var12_12 + 1;
                                                    var11_11 = 1;
                                                    var13_13 = var4_4;
                                                    var4_4 = var10_10 += var12_12;
                                                    var10_10 = var7_5;
                                                    var12_12 = var6_2;
                                                    while (true) {
                                                        var14_14 = this.Q(var4_4);
                                                        var4_4 = var9_9;
                                                        var7_5 = var11_11;
                                                        var6_2 = var13_13;
                                                        var11_11 = var14_14;
                                                        var9_9 = var10_10;
                                                        var10_10 = var12_12;
lbl96:
                                                        // 2 sources

                                                        if (var11_11 < 48 || var11_11 > 57) break;
                                                        var12_12 = this.e;
                                                        var11_11 = var4_4 + 1;
                                                        var4_4 = var12_12 + var4_4;
                                                        var12_12 = var10_10;
                                                        var10_10 = var9_9;
                                                        var13_13 = var6_2;
                                                        var9_9 = var11_11;
                                                        var11_11 = var7_5;
                                                    }
                                                    var14_14 = var7_5;
                                                    var7_5 = var10_10;
                                                    var13_13 = var9_9;
                                                    var9_9 = var11_11;
                                                    var16_16 /* !! */  = var1_1 /* !! */ ;
                                                    var12_12 = var6_2;
                                                    var11_11 = var14_14;
                                                    var10_10 = var4_4;
                                                    break block26;
                                                }
                                                var11_11 = 1;
                                                var12_12 = var4_4;
                                                var16_16 /* !! */  = var1_1 /* !! */ ;
                                                var13_13 = var7_5;
                                                var7_5 = var6_2;
                                            }
                                            var4_4 = this.e + var10_10 - var15_15 - var11_11;
                                            if (var8_8 == 0 && var4_4 < 10) {
                                                var2_6 = var3_7 = (float)var13_13 / (float)var7_5;
                                                if (var5_3 != 0) {
                                                    var2_6 = -var3_7;
                                                }
                                            } else {
                                                var2_6 = Float.parseFloat(this.r0(var15_15, var4_4));
                                            }
                                            var1_1 /* !! */  = var16_16 /* !! */ ;
                                            if (var12_12 >= var16_16 /* !! */ .length) {
                                                var1_1 /* !! */  = (char[])new float[var16_16 /* !! */ .length * 3 / 2];
                                                System.arraycopy(var16_16 /* !! */ , 0, var1_1 /* !! */ , 0, var12_12);
                                            }
                                            var5_3 = var12_12 + 1;
                                            var1_1 /* !! */ [var12_12] = (char)var2_6;
                                            if (var9_9 != 44) break block27;
                                            var4_4 = this.Q(this.e + var10_10);
                                            ++var10_10;
                                            break block28;
                                        }
                                        if (var9_9 != 93) break block29;
                                        var4_4 = this.e;
                                        var6_2 = var10_10 + 1;
                                        var7_5 = this.Q(var4_4 + var10_10);
                                        var16_16 /* !! */  = var1_1 /* !! */ ;
                                        if (var5_3 != var1_1 /* !! */ .length) {
                                            var16_16 /* !! */  = (char[])new float[var5_3];
                                            System.arraycopy(var1_1 /* !! */ , 0, var16_16 /* !! */ , 0, var5_3);
                                        }
                                        if (var7_5 == 44) {
                                            this.e = var6_2 - var11_11 + this.e;
                                            this.next();
                                            this.m = 3;
                                            this.a = 16;
                                            return var16_16 /* !! */ ;
                                        }
                                        var4_4 = 16;
                                        if (var7_5 != 125) break block30;
                                        var7_5 = this.e;
                                        var5_3 = var6_2 + 1;
                                        if ((var6_2 = (int)this.Q(var7_5 + var6_2)) == 44) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        if (var6_2 != 93) break block31;
                                        var4_4 = 15;
                                        ** GOTO lbl-1000
                                    }
                                    if (var6_2 == 125) {
                                        var4_4 = 13;
                                        ** continue;
                                    }
                                    break block32;
                                    this.a = var4_4;
                                    this.e = var5_3 - var11_11 + this.e;
                                    this.next();
                                    break block33;
                                }
                                if (var6_2 != 26) break block34;
                                this.e = var5_3 - var11_11 + this.e;
                                this.a = 20;
                                this.d = (char)26;
                            }
                            this.m = 4;
                            return var16_16 /* !! */ ;
                        }
                        this.m = -1;
                        return null;
                    }
                    this.m = -1;
                    return null;
                }
                var4_4 = var9_9;
            }
            var6_2 = var10_10;
            var7_5 = var4_4;
            var4_4 = var5_3;
        }
        this.m = -1;
        return null;
    }

    @Override
    public final Number i() {
        long l2;
        long l3;
        int n2 = this.h;
        boolean bl = false;
        if (n2 == -1) {
            this.h = 0;
        }
        int n3 = this.h;
        n2 = this.g + n3;
        int n4 = 32;
        int n5 = this.Q(n2 - 1);
        if (n5 != 66) {
            if (n5 != 76) {
                if (n5 == 83) {
                    --n2;
                    n4 = 83;
                }
            } else {
                --n2;
                n4 = 76;
            }
        } else {
            --n2;
            n4 = 66;
        }
        if (this.Q(this.h) == '-') {
            l3 = Long.MIN_VALUE;
            ++n3;
            bl = true;
        } else {
            l3 = -9223372036854775807L;
        }
        if (n3 < n2) {
            n5 = n3 + 1;
            l2 = -(this.Q(n3) - 48);
            n3 = n5;
        } else {
            l2 = 0L;
        }
        while (n3 < n2) {
            n5 = n3 + 1;
            n3 = this.Q(n3);
            if (l2 < -922337203685477580L) {
                return new BigInteger(this.J(), 10);
            }
            long l4 = l2 * 10L;
            if (l4 < l3 + (l2 = (long)(n3 - 48))) {
                return new BigInteger(this.J(), 10);
            }
            l2 = l4 - l2;
            n3 = n5;
        }
        if (bl) {
            if (n3 > this.h + 1) {
                if (l2 >= Integer.MIN_VALUE && n4 != 76) {
                    if (n4 == 83) {
                        return (short)l2;
                    }
                    if (n4 == 66) {
                        return (byte)l2;
                    }
                    return (int)l2;
                }
                return l2;
            }
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("illegal number format : ");
            stringBuilder.append(this.J());
            throw new com.github.catvod.spider.merge.y.d(stringBuilder.toString());
        }
        l3 = -l2;
        if (l3 <= Integer.MAX_VALUE && n4 != 76) {
            if (n4 == 83) {
                return (short)l3;
            }
            n2 = (int)l3;
            if (n4 == 66) {
                return (byte)n2;
            }
            return n2;
        }
        return l3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float[][] i0(char[] var1_1) {
        block35: {
            block40: {
                block39: {
                    block38: {
                        block36: {
                            block37: {
                                block32: {
                                    this.m = 0;
                                    if (!this.P(var1_1 /* !! */ )) {
                                        this.m = -2;
                                        return null;
                                    }
                                    var4_2 = var1_1 /* !! */ .length;
                                    var6_3 = this.e;
                                    var5_4 = var4_2 + 1;
                                    if (this.Q(var6_3 + var4_2) != '[') {
                                        this.m = -2;
                                        return null;
                                    }
                                    var6_3 = this.e;
                                    var4_2 = var5_4 + 1;
                                    var5_4 = this.Q(var6_3 + var5_4);
                                    var1_1 /* !! */  = (char[])new float[16][];
                                    var9_5 = 0;
                                    block0: while (true) {
                                        var7_8 = var5_4;
                                        var6_3 = var4_2;
                                        var21_21 /* !! */  = var1_1 /* !! */ ;
                                        var8_9 = var9_5;
                                        if (var5_4 != 91) break block32;
                                        var5_4 = this.e;
                                        var6_3 = var4_2 + 1;
                                        var7_8 = this.Q(var5_4 + var4_2);
                                        var22_22 /* !! */  = new float[16];
                                        var4_2 = 0;
                                        var21_21 /* !! */  = var1_1 /* !! */ ;
                                        var1_1 /* !! */  = (char[])var22_22 /* !! */ ;
                                        while (true) {
                                            block33: {
                                                block34: {
                                                    var11_11 = this.e;
                                                    var10_10 = var11_11 + var6_3 - 1;
                                                    var5_4 = var7_8 == 45 ? 1 : 0;
                                                    var8_9 = var7_8;
                                                    var7_8 = var6_3;
                                                    if (var5_4 != 0) {
                                                        var8_9 = this.Q(var11_11 + var6_3);
                                                        var7_8 = var6_3 + 1;
                                                    }
                                                    if (var8_9 < 48 || var8_9 > 57) break block0;
                                                    var6_3 = var8_9 - 48;
                                                    while (true) {
                                                        var8_9 = this.e;
                                                        var12_12 = var7_8 + 1;
                                                        var13_13 = this.Q(var8_9 + var7_8);
                                                        if (var13_13 < 48 || var13_13 > 57) break;
                                                        var6_3 = var6_3 * 10 + (var13_13 - 48);
                                                        var7_8 = var12_12;
                                                    }
                                                    if (var13_13 != 46) ** GOTO lbl76
                                                    var8_9 = this.e;
                                                    var7_8 = var12_12 + 1;
                                                    if ((var8_9 = (int)this.Q(var8_9 + var12_12)) >= 48 && var8_9 <= 57) {
                                                        var8_9 = var8_9 - 48 + var6_3 * 10;
                                                        var11_11 = 10;
                                                        var6_3 = var7_8;
                                                        while (true) {
                                                            var7_8 = this.e;
                                                            var14_14 = var6_3 + 1;
                                                            var15_15 = this.Q(var7_8 + var6_3);
                                                            var7_8 = var11_11;
                                                            var13_13 = var15_15;
                                                            var6_3 = var8_9;
                                                            var12_12 = var14_14;
                                                            if (var15_15 >= 48) {
                                                                var7_8 = var11_11;
                                                                var13_13 = var15_15;
                                                                var6_3 = var8_9;
                                                                var12_12 = var14_14;
                                                                if (var15_15 <= 57) {
                                                                    var8_9 = var8_9 * 10 + (var15_15 - 48);
                                                                    var11_11 *= 10;
                                                                    var6_3 = var14_14;
                                                                    continue;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        this.m = -1;
                                                        return null;
lbl76:
                                                        // 1 sources

                                                        var7_8 = 1;
                                                    }
                                                    var8_9 = var13_13 != 101 && var13_13 != 69 ? 0 : 1;
                                                    var20_20 = var7_8;
                                                    var23_23 /* !! */  = var1_1 /* !! */ ;
                                                    var19_19 = var6_3;
                                                    var18_18 = var4_2;
                                                    var22_22 /* !! */  = var21_21 /* !! */ ;
                                                    var14_14 = var9_5;
                                                    var17_17 = var8_9;
                                                    var16_16 = var10_10;
                                                    var15_15 = var5_4;
                                                    var11_11 = var12_12;
                                                    if (var8_9 == 0) break block33;
                                                    var11_11 = this.e;
                                                    var15_15 = var12_12 + 1;
                                                    var14_14 = this.Q(var11_11 + var12_12);
                                                    if (var14_14 == 43 || var14_14 == 45) break block34;
                                                    var11_11 = var15_15;
                                                    var12_12 = var8_9;
                                                    var8_9 = var5_4;
                                                    var15_15 = 48;
                                                    var13_13 = 57;
                                                    var5_4 = var14_14;
                                                    var14_14 = var15_15;
                                                    ** GOTO lbl118
                                                }
                                                var13_13 = this.e + var15_15;
                                                var11_11 = var5_4;
                                                var5_4 = 57;
                                                var16_16 = var15_15 + 1;
                                                var15_15 = var10_10;
                                                var12_12 = var8_9;
                                                var14_14 = 48;
                                                var8_9 = var11_11;
                                                var10_10 = var16_16;
                                                var11_11 = var13_13;
                                                while (true) {
                                                    var16_16 = this.Q(var11_11);
                                                    var11_11 = var10_10;
                                                    var13_13 = var5_4;
                                                    var10_10 = var15_15;
                                                    var5_4 = var16_16;
lbl118:
                                                    // 2 sources

                                                    if (var5_4 < var14_14 || var5_4 > var13_13) break;
                                                    var15_15 = this.e + var11_11;
                                                    var5_4 = var13_13;
                                                    var13_13 = var11_11 + 1;
                                                    var11_11 = var15_15;
                                                    var15_15 = var10_10;
                                                    var10_10 = var13_13;
                                                }
                                                var15_15 = var8_9;
                                                var16_16 = var10_10;
                                                var17_17 = var12_12;
                                                var14_14 = var9_5;
                                                var22_22 /* !! */  = var21_21 /* !! */ ;
                                                var18_18 = var4_2;
                                                var19_19 = var6_3;
                                                var13_13 = var5_4;
                                                var23_23 /* !! */  = var1_1 /* !! */ ;
                                                var20_20 = var7_8;
                                            }
                                            var4_2 = this.e + var11_11 - var16_16 - 1;
                                            if (var17_17 == 0 && var4_2 < 10) {
                                                var2_6 = var3_7 = (float)var19_19 / (float)var20_20;
                                                if (var15_15 != 0) {
                                                    var2_6 = -var3_7;
                                                }
                                            } else {
                                                var2_6 = Float.parseFloat(this.r0(var16_16, var4_2));
                                            }
                                            var1_1 /* !! */  = var23_23 /* !! */ ;
                                            if (var18_18 >= var23_23 /* !! */ .length) {
                                                var1_1 /* !! */  = (char[])new float[var23_23 /* !! */ .length * 3 / 2];
                                                System.arraycopy(var23_23 /* !! */ , 0, var1_1 /* !! */ , 0, var18_18);
                                            }
                                            var4_2 = var18_18 + 1;
                                            var1_1 /* !! */ [var18_18] = (char)var2_6;
                                            if (var13_13 == 44) {
                                                var5_4 = this.e;
                                                var6_3 = var11_11 + 1;
                                                var13_13 = this.Q(var5_4 + var11_11);
                                            } else {
                                                if (var13_13 == 93) {
                                                    var5_4 = this.e;
                                                    var8_9 = var11_11 + 1;
                                                    var5_4 = this.Q(var5_4 + var11_11);
                                                    if (var4_2 != var1_1 /* !! */ .length) {
                                                        var21_21 /* !! */  = (char[])new float[var4_2];
                                                        System.arraycopy(var1_1 /* !! */ , 0, var21_21 /* !! */ , 0, var4_2);
                                                    } else {
                                                        var21_21 /* !! */  = var1_1 /* !! */ ;
                                                    }
                                                    var1_1 /* !! */  = (char[])var22_22 /* !! */ ;
                                                    if (var14_14 >= var22_22 /* !! */ .length) {
                                                        var1_1 /* !! */  = (char[])new float[var22_22 /* !! */ .length * 3 / 2][];
                                                        System.arraycopy(var21_21 /* !! */ , 0, var1_1 /* !! */ , 0, var4_2);
                                                    }
                                                    var6_3 = var14_14 + 1;
                                                    var1_1 /* !! */ [var14_14] = (char)var21_21 /* !! */ ;
                                                    if (var5_4 == 44) {
                                                        var5_4 = this.e;
                                                        var4_2 = var8_9 + 1;
                                                        var5_4 = this.Q(var5_4 + var8_9);
                                                    } else {
                                                        if (var5_4 == 93) {
                                                            var7_8 = this.Q(this.e + var8_9);
                                                            var4_2 = var6_3;
                                                            var6_3 = var8_9 + 1;
                                                            var21_21 /* !! */  = var1_1 /* !! */ ;
                                                            var8_9 = var4_2;
                                                            break block32;
                                                        }
                                                        var4_2 = var8_9;
                                                    }
                                                    var9_5 = var6_3;
                                                    continue block0;
                                                }
                                                var6_3 = var11_11;
                                            }
                                            var7_8 = var13_13;
                                            var21_21 /* !! */  = (char[])var22_22 /* !! */ ;
                                            var9_5 = var14_14;
                                        }
                                        break;
                                    }
                                    this.m = -1;
                                    return null;
                                }
                                var1_1 /* !! */  = var21_21 /* !! */ ;
                                if (var8_9 != var21_21 /* !! */ .length) {
                                    var1_1 /* !! */  = (char[])new float[var8_9][];
                                    System.arraycopy(var21_21 /* !! */ , 0, var1_1 /* !! */ , 0, var8_9);
                                }
                                if (var7_8 == 44) {
                                    this.e = var6_3 - 1 + this.e;
                                    this.next();
                                    this.m = 3;
                                    this.a = 16;
                                    return var1_1 /* !! */ ;
                                }
                                var4_2 = 16;
                                if (var7_8 != 125) break block35;
                                var7_8 = this.e;
                                var5_4 = var6_3 + 1;
                                if ((var6_3 = (int)this.Q(var7_8 + var6_3)) == 44) break block36;
                                if (var6_3 != 93) break block37;
                                var4_2 = 15;
                                break block36;
                            }
                            if (var6_3 != 125) break block38;
                            var4_2 = 13;
                        }
                        this.a = var4_2;
                        this.e = var5_4 - 1 + this.e;
                        this.next();
                        break block39;
                    }
                    if (var6_3 != 26) break block40;
                    this.e = var5_4 - 1 + this.e;
                    this.a = 20;
                    this.d = (char)26;
                }
                this.m = 4;
                return var1_1 /* !! */ ;
            }
            this.m = -1;
            return null;
        }
        this.m = -1;
        return null;
    }

    @Override
    public final boolean isEnabled(int n2) {
        boolean bl = (n2 & this.c) != 0;
        return bl;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    @Override
    public long j(char c2) {
        f f2;
        char c3;
        int n2;
        block18: {
            char c4;
            long l2;
            boolean bl;
            block16: {
                block17: {
                    int n3;
                    boolean bl2;
                    int n4;
                    block15: {
                        char c5;
                        this.m = 0;
                        n4 = this.Q(this.e + 0);
                        bl2 = n4 == 34;
                        if (bl2) {
                            n4 = this.Q(this.e + 1);
                            n2 = 2;
                        } else {
                            n2 = 1;
                        }
                        bl = n4 == 45;
                        n3 = n4;
                        n4 = n2;
                        if (bl) {
                            n3 = this.Q(this.e + n2);
                            n4 = n2 + 1;
                        }
                        if (n3 < 48 || n3 > 57) break block15;
                        l2 = n3 - 48;
                        n2 = n4;
                        while (true) {
                            n3 = this.e;
                            n4 = n2 + 1;
                            c5 = this.Q(n3 + n2);
                            if (c5 < '0' || c5 > '9') break;
                            l2 = l2 * 10L + (long)(c5 - 48);
                            n2 = n4;
                        }
                        if (c5 == '.') {
                            this.m = -1;
                            return 0L;
                        }
                        n2 = !(l2 >= 0L || l2 == Long.MIN_VALUE && bl) ? 0 : 1;
                        if (n2 == 0) {
                            throw new NumberFormatException(this.r0(this.e, n4 - 1));
                        }
                        c4 = c5;
                        n2 = n4;
                        if (bl2) {
                            if (c5 != '\"') {
                                this.m = -1;
                                return 0L;
                            }
                            c4 = this.Q(this.e + n4);
                            n2 = n4 + 1;
                        }
                        break block16;
                    }
                    if (n3 != 110 || this.Q(this.e + n4) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, n4, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, n4, 2, this) != 'l') break block17;
                    this.m = 5;
                    n2 = this.e;
                    c2 = (char)((n4 += 3) + 1);
                    c3 = this.Q(n2 + n4);
                    if (!bl2 || c3 != '\"') break block18;
                    f2 = this;
                    n2 = 16;
                    c3 = f2.Q(f2.e + c2);
                    c2 = (char)(c2 + 1);
                }
                this.m = -1;
                return 0L;
            }
            while (true) {
                if (c4 == c2) {
                    c2 = (char)(this.e + n2);
                    this.e = c2;
                    this.d = this.Q(c2);
                    this.m = 3;
                    this.a = 16;
                    long l3 = l2;
                    if (!bl) return l3;
                    return -l2;
                }
                if (!com.github.catvod.spider.merge.B.f.V(c4)) {
                    this.m = -1;
                    return l2;
                }
                c4 = this.Q(this.e + n2);
                ++n2;
            }
        }
        f2 = this;
        n2 = 16;
        while (true) {
            if (c3 == ',') {
                c2 = (char)(f2.e + c2);
                f2.e = c2;
                f2.d = f2.Q(c2);
                f2.m = 5;
                f2.a = n2;
                return 0L;
            }
            if (c3 == ']') {
                c2 = (char)(f2.e + c2);
                f2.e = c2;
                f2.d = f2.Q(c2);
                f2.m = 5;
                f2.a = 15;
                return 0L;
            }
            if (!com.github.catvod.spider.merge.B.f.V(c3)) {
                f2.m = -1;
                return 0L;
            }
            c3 = f2.Q(f2.e + c2);
            c2 = (char)(c2 + 1);
        }
    }

    /*
     * Unable to fully structure code
     */
    public int j0(char[] var1_1) {
        block12: {
            block13: {
                block14: {
                    block16: {
                        block15: {
                            this.m = 0;
                            if (!this.P(var1_1)) {
                                this.m = -2;
                                return 0;
                            }
                            var3_2 = var1_1.length;
                            var4_3 = this.e;
                            var6_4 = var3_2 + 1;
                            var5_5 = (var4_3 = (int)this.Q(var4_3 + var3_2)) == 45;
                            var3_2 = var6_4;
                            if (var5_5) {
                                var4_3 = this.Q(this.e + var6_4);
                                var3_2 = var6_4 + 1;
                            }
                            if (var4_3 < 48 || var4_3 > 57) break block12;
                            var6_4 = var4_3 - 48;
                            var4_3 = var3_2;
                            var3_2 = var6_4;
                            while (true) {
                                var7_6 = this.e;
                                var6_4 = var4_3 + 1;
                                if ((var7_6 = (int)this.Q(var7_6 + var4_3)) < 48 || var7_6 > 57) break;
                                var3_2 = var3_2 * 10 + (var7_6 - 48);
                                var4_3 = var6_4;
                            }
                            if (var7_6 == 46) {
                                this.m = -1;
                                return 0;
                            }
                            if (!(var3_2 >= 0 && var6_4 <= var1_1.length + 14 || var3_2 == -2147483648 && var6_4 == 17 && var5_5 != false)) break block13;
                            var4_3 = 16;
                            if (var7_6 == 44) {
                                this.e = var4_3 = this.e + var6_4;
                                this.d = this.Q(var4_3);
                                this.m = 3;
                                this.a = 16;
                                var4_3 = var3_2;
                                if (var5_5) {
                                    var4_3 = -var3_2;
                                }
                                return var4_3;
                            }
                            if (var7_6 != 125) break block14;
                            var8_7 = this.e;
                            var7_6 = var6_4 + 1;
                            if ((var6_4 = (int)this.Q(var8_7 + var6_4)) == 44) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    this.a = var4_3;
                                    this.e = var4_3 = this.e + var7_6;
                                    var2_8 = this.Q(var4_3);
lbl46:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            if (var6_4 != 93) break block15;
                            var4_3 = 15;
                            ** GOTO lbl-1000
                        }
                        if (var6_4 == 125) {
                            var4_3 = 13;
                            ** continue;
                        }
                        var2_8 = 26;
                        if (var6_4 == 26) {
                            this.a = 20;
                            this.e = var7_6 - 1 + this.e;
                            ** continue;
                        }
                        break block16;
                        this.d = (char)var2_8;
                        this.m = 4;
                        var4_3 = var3_2;
                        if (var5_5) {
                            var4_3 = -var3_2;
                        }
                        return var4_3;
                    }
                    this.m = -1;
                    return 0;
                }
                this.m = -1;
                return 0;
            }
            this.m = -1;
            return 0;
        }
        this.m = -1;
        return 0;
    }

    @Override
    public final float k() {
        char c2;
        String string = this.J();
        float f2 = Float.parseFloat(string);
        if ((f2 == 0.0f || f2 == Float.POSITIVE_INFINITY) && (c2 = string.charAt(0)) > '0' && c2 <= '9') {
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("float overflow : ", string));
        }
        return f2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int[] k0(char[] var1_1) {
        block20: {
            this.m = 0;
            if (!this.P(var1_1 /* !! */ )) {
                this.m = -2;
                return null;
            }
            var4_2 = var1_1 /* !! */ .length;
            var3_3 = this.e;
            var2_4 = var4_2 + 1;
            if (this.Q(var3_3 + var4_2) != '[') {
                this.m = -2;
                return null;
            }
            var4_2 = this.e;
            var3_3 = var2_4 + 1;
            var2_4 = this.Q(var4_2 + var2_4);
            var1_1 /* !! */  = (char[])new int[16];
            if (var2_4 != 93) break block20;
            var4_2 = this.e;
            var2_4 = var3_3 + 1;
            var3_3 = this.Q(var4_2 + var3_3);
            var5_5 = 0;
            ** GOTO lbl61
        }
        var4_2 = 0;
        var9_6 /* !! */  = var1_1 /* !! */ ;
        while (true) {
            block22: {
                block23: {
                    block24: {
                        block19: {
                            block21: {
                                if (var2_4 == 45) {
                                    var2_4 = this.Q(this.e + var3_3);
                                    ++var3_3;
                                    var6_7 = true;
                                } else {
                                    var6_7 = false;
                                }
                                if (var2_4 < 48 || var2_4 > 57) break;
                                var2_4 -= 48;
                                while (true) {
                                    var5_5 = this.e;
                                    var7_8 = var3_3 + 1;
                                    var8_9 = this.Q(var5_5 + var3_3);
                                    if (var8_9 < '0' || var8_9 > '9') break;
                                    var2_4 = var2_4 * 10 + (var8_9 - 48);
                                    var3_3 = var7_8;
                                }
                                var1_1 /* !! */  = var9_6 /* !! */ ;
                                if (var4_2 >= var9_6 /* !! */ .length) {
                                    var1_1 /* !! */  = (char[])new int[var9_6 /* !! */ .length * 3 / 2];
                                    System.arraycopy(var9_6 /* !! */ , 0, var1_1 /* !! */ , 0, var4_2);
                                }
                                var5_5 = var4_2 + 1;
                                var3_3 = var2_4;
                                if (var6_7) {
                                    var3_3 = -var2_4;
                                }
                                var1_1 /* !! */ [var4_2] = var3_3;
                                if (var8_9 != ',') break block21;
                                var3_3 = this.Q(this.e + var7_8);
                                var2_4 = var7_8 + 1;
                                break block22;
                            }
                            var3_3 = var8_9;
                            var2_4 = var7_8;
                            if (var8_9 != ']') break block22;
                            var3_3 = this.e;
                            var2_4 = var7_8 + 1;
                            var3_3 = this.Q(var3_3 + var7_8);
lbl61:
                            // 2 sources

                            var9_6 /* !! */  = var1_1 /* !! */ ;
                            if (var5_5 != var1_1 /* !! */ .length) {
                                var9_6 /* !! */  = (char[])new int[var5_5];
                                System.arraycopy(var1_1 /* !! */ , 0, var9_6 /* !! */ , 0, var5_5);
                            }
                            if (var3_3 == 44) {
                                this.e = var2_4 - 1 + this.e;
                                this.next();
                                this.m = 3;
                                this.a = 16;
                                return var9_6 /* !! */ ;
                            }
                            if (var3_3 != 125) break block23;
                            var4_2 = this.e;
                            var3_3 = var2_4 + 1;
                            if ((var2_4 = (int)this.Q(var4_2 + var2_4)) == 44) {
                                this.a = 16;
lbl77:
                                // 2 sources

                                while (true) {
                                    this.e = var3_3 - 1 + this.e;
                                    this.next();
                                    break block19;
                                    break;
                                }
                            }
                            if (var2_4 == 93) {
                                var2_4 = 15;
lbl84:
                                // 2 sources

                                while (true) {
                                    this.a = var2_4;
                                    ** continue;
                                    break;
                                }
                            }
                            if (var2_4 == 125) {
                                var2_4 = 13;
                                ** continue;
                            }
                            if (var2_4 != 26) break block24;
                            this.e = var3_3 - 1 + this.e;
                            this.a = 20;
                            this.d = (char)26;
                        }
                        this.m = 4;
                        return var9_6 /* !! */ ;
                    }
                    this.m = -1;
                    return null;
                }
                this.m = -1;
                return null;
            }
            var4_2 = var5_5;
            var5_5 = var3_3;
            var3_3 = var2_4;
            var2_4 = var5_5;
            var9_6 /* !! */  = var1_1 /* !! */ ;
        }
        this.m = -1;
        return null;
    }

    @Override
    public final boolean l(c c2) {
        return this.isEnabled(c2.a);
    }

    /*
     * Unable to fully structure code
     */
    public long l0(char[] var1_1) {
        block14: {
            block15: {
                block17: {
                    block16: {
                        this.m = 0;
                        if (!this.P(var1_1)) {
                            this.m = -2;
                            return 0L;
                        }
                        var4_2 = var1_1.length;
                        var5_3 = this.e;
                        var3_4 = var4_2 + 1;
                        if ((var5_3 = (int)this.Q(var5_3 + var4_2)) == 45) {
                            var5_3 = this.Q(this.e + var3_4);
                            ++var3_4;
                            var4_2 = 1;
                        } else {
                            var4_2 = 0;
                        }
                        if (var5_3 < 48 || var5_3 > 57) break block14;
                        var8_5 = var5_3 - 48;
                        while (true) {
                            var6_6 = this.e;
                            var5_3 = var3_4 + 1;
                            if ((var6_6 = (int)this.Q(var6_6 + var3_4)) < 48 || var6_6 > 57) break;
                            var8_5 = var8_5 * 10L + (long)(var6_6 - 48);
                            var3_4 = var5_3;
                        }
                        if (var6_6 == 46) {
                            this.m = -1;
                            return 0L;
                        }
                        var3_4 = var5_3 - var1_1.length < 21 && (var8_5 >= 0L || var8_5 == -9223372036854775808L && var4_2 != 0) ? 1 : 0;
                        if (var3_4 == 0) {
                            this.m = -1;
                            return 0L;
                        }
                        var3_4 = 16;
                        if (var6_6 == 44) {
                            this.e = var3_4 = this.e + var5_3;
                            this.d = this.Q(var3_4);
                            this.m = 3;
                            this.a = 16;
                            var10_7 = var8_5;
                            if (var4_2 != 0) {
                                var10_7 = -var8_5;
                            }
                            return var10_7;
                        }
                        if (var6_6 != 125) break block15;
                        var7_9 = this.e;
                        var6_6 = var5_3 + 1;
                        if ((var5_3 = (int)this.Q(var7_9 + var5_3)) == 44) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                this.a = var3_4;
                                this.e = var3_4 = this.e + var6_6;
                                var2_10 = this.Q(var3_4);
lbl48:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
                        }
                        if (var5_3 != 93) break block16;
                        var3_4 = 15;
                        ** GOTO lbl-1000
                    }
                    if (var5_3 == 125) {
                        var3_4 = 13;
                        ** continue;
                    }
                    var2_10 = 26;
                    if (var5_3 == 26) {
                        this.a = 20;
                        this.e = var6_6 - 1 + this.e;
                        ** continue;
                    }
                    break block17;
                    this.d = (char)var2_10;
                    this.m = 4;
                    var10_8 = var8_5;
                    if (var4_2 != 0) {
                        var10_8 = -var8_5;
                    }
                    return var10_8;
                }
                this.m = -1;
                return 0L;
            }
            this.m = -1;
            return 0L;
        }
        this.m = -1;
        return 0L;
    }

    @Override
    public boolean m() {
        int n2 = 0;
        while (true) {
            char c2;
            if ((c2 = this.Q(n2)) == '\u001a') {
                this.a = 20;
                return true;
            }
            if (!com.github.catvod.spider.merge.B.f.V(c2)) {
                return false;
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String m0(char[] cArray) {
        String string;
        int n2;
        block10: {
            block15: {
                int n3;
                block16: {
                    block8: {
                        block14: {
                            block12: {
                                block13: {
                                    block11: {
                                        int n4;
                                        block9: {
                                            this.m = 0;
                                            if (!this.P(cArray)) {
                                                this.m = -2;
                                                return this.n;
                                            }
                                            int n5 = cArray.length;
                                            if (this.Q(this.e + n5) != '\"') break block8;
                                            n2 = this.T(this.e + cArray.length + 1);
                                            if (n2 == -1) throw new com.github.catvod.spider.merge.y.d("unclosed str");
                                            n3 = this.e + cArray.length + 1;
                                            String string2 = this.r0(n3, n2 - n3);
                                            n3 = n2;
                                            string = string2;
                                            if (string2.indexOf(92) != -1) {
                                                while (true) {
                                                    n3 = 0;
                                                    for (n4 = n2 - 1; n4 >= 0 && this.Q(n4) == '\\'; ++n3, --n4) {
                                                    }
                                                    if (n3 % 2 == 0) {
                                                        n4 = this.e;
                                                        n3 = n2 - (cArray.length + n4 + 1);
                                                        string = com.github.catvod.spider.merge.B.f.Z(this.s0(n4 + cArray.length + 1, n3), n3);
                                                        n3 = n2;
                                                        break;
                                                    }
                                                    n2 = this.T(n2 + 1);
                                                }
                                            }
                                            n4 = this.e;
                                            n3 = n3 - (cArray.length + n4 + 1) + 1 + (n5 + 1);
                                            n2 = n3 + 1;
                                            if ((n3 = (int)this.Q(n4 + n3)) != 44) break block9;
                                            this.e = n2 = this.e + n2;
                                            this.d = this.Q(n2);
                                            n2 = 3;
                                            break block10;
                                        }
                                        if (n3 != 125) break block8;
                                        n4 = this.e;
                                        n3 = n2 + 1;
                                        if ((n2 = (int)this.Q(n4 + n2)) != 44) break block11;
                                        n2 = 16;
                                        break block12;
                                    }
                                    if (n2 != 93) break block13;
                                    n2 = 15;
                                    break block12;
                                }
                                if (n2 != 125) break block14;
                                n2 = 13;
                            }
                            this.a = n2;
                            this.e = n2 = this.e + n3;
                            this.d = this.Q(n2);
                            break block15;
                        }
                        if (n2 == 26) break block16;
                    }
                    this.m = -1;
                    return this.n;
                }
                this.a = 20;
                this.e = n3 - 1 + this.e;
                this.d = (char)26;
            }
            n2 = 4;
        }
        this.m = n2;
        return string;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final BigDecimal n() {
        block37: {
            block25: {
                block28: {
                    block29: {
                        block36: {
                            block35: {
                                block34: {
                                    block31: {
                                        block33: {
                                            block32: {
                                                block30: {
                                                    block24: {
                                                        block26: {
                                                            block27: {
                                                                this.m = 0;
                                                                var5_1 = this.Q(this.e + 0);
                                                                var3_2 = var5_1 == 34 ? 1 : 0;
                                                                if (var3_2 != 0) {
                                                                    var5_1 = this.Q(this.e + 1);
                                                                    var4_3 = 2;
                                                                } else {
                                                                    var4_3 = 1;
                                                                }
                                                                var6_4 = var5_1 == 45 ? 1 : 0;
                                                                var7_5 = var5_1;
                                                                var5_1 = var4_3;
                                                                if (var6_4 != 0) {
                                                                    var7_5 = this.Q(this.e + var4_3);
                                                                    var5_1 = var4_3 + 1;
                                                                }
                                                                if (var7_5 < 48 || var7_5 > 57) break block25;
                                                                while (true) {
                                                                    var4_3 = this.e;
                                                                    var6_4 = var5_1 + 1;
                                                                    if ((var5_1 = (int)this.Q(var4_3 + var5_1)) < 48 || var5_1 > 57) break;
                                                                    var5_1 = var6_4;
                                                                }
                                                                var7_5 = var5_1 == 46 ? 1 : 0;
                                                                var4_3 = var6_4;
                                                                if (var7_5 != 0) {
                                                                    var5_1 = this.e;
                                                                    var4_3 = var6_4 + 1;
                                                                    if ((var5_1 = (int)this.Q(var5_1 + var6_4)) >= 48 && var5_1 <= 57) {
                                                                        while (true) {
                                                                            var5_1 = this.e;
                                                                            var6_4 = var4_3 + 1;
                                                                            var5_1 = var7_5 = (int)this.Q(var5_1 + var4_3);
                                                                            var4_3 = var6_4;
                                                                            if (var7_5 >= 48) {
                                                                                var5_1 = var7_5;
                                                                                var4_3 = var6_4;
                                                                                if (var7_5 <= 57) {
                                                                                    var4_3 = var6_4;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        this.m = -1;
                                                                        return null;
                                                                    }
                                                                }
                                                                var6_4 = var5_1 != 101 && var5_1 != 69 ? 0 : 1;
                                                                if (var6_4 == 0) break block26;
                                                                var5_1 = this.e;
                                                                var6_4 = var4_3 + 1;
                                                                var7_5 = this.Q(var5_1 + var4_3);
                                                                if (var7_5 == 43 || var7_5 == 45) break block27;
                                                                var9_6 = this;
                                                                ** GOTO lbl57
                                                            }
                                                            var5_1 = this.e;
                                                            var4_3 = var6_4 + 1;
                                                            var7_5 = this.Q(var5_1 + var6_4);
                                                            var9_6 = this;
                                                            while (true) {
                                                                var6_4 = var4_3;
lbl57:
                                                                // 2 sources

                                                                var5_1 = var7_5;
                                                                var8_7 = var3_2;
                                                                var10_8 = var9_6;
                                                                var4_3 = var6_4;
                                                                if (var7_5 >= 48) {
                                                                    var5_1 = var7_5;
                                                                    var8_7 = var3_2;
                                                                    var10_8 = var9_6;
                                                                    var4_3 = var6_4;
                                                                    if (var7_5 <= 57) {
                                                                        var5_1 = var9_6.e;
                                                                        var4_3 = var6_4 + 1;
                                                                        var7_5 = var9_6.Q(var5_1 + var6_4);
                                                                        continue;
                                                                    }
                                                                }
                                                                break block24;
                                                                break;
                                                            }
                                                        }
                                                        var10_8 = this;
                                                        var8_7 = var3_2;
                                                    }
                                                    if (var8_7 != 0) {
                                                        if (var5_1 != 34) {
                                                            var10_8.m = -1;
                                                            return null;
                                                        }
                                                        var3_2 = var10_8.e;
                                                        var5_1 = var4_3 + 1;
                                                        var6_4 = var10_8.Q(var3_2 + var4_3);
                                                        var4_3 = var10_8.e;
                                                        var3_2 = var4_3 + 1;
                                                        var7_5 = var4_3 + var5_1 - var3_2 - 2;
                                                        var4_3 = var5_1;
                                                        var5_1 = var6_4;
                                                        var6_4 = var7_5;
                                                    } else {
                                                        var3_2 = var10_8.e;
                                                        var6_4 = var3_2 + var4_3 - var3_2 - 1;
                                                    }
                                                    if (var6_4 > 65535) break block28;
                                                    var9_6 = var10_8.s0(var3_2, var6_4);
                                                    var9_6 = new BigDecimal((char[])var9_6, 0, ((Object)var9_6).length, MathContext.UNLIMITED);
                                                    if (var5_1 == 44) {
                                                        var10_8.e = var3_2 = var10_8.e + var4_3;
                                                        var10_8.d = var10_8.Q(var3_2);
                                                        var10_8.m = 3;
                                                        var10_8.a = 16;
                                                        return var9_6;
                                                    }
                                                    if (var5_1 != 93) break block29;
                                                    var3_2 = var10_8.e;
                                                    var5_1 = var4_3 + 1;
                                                    if ((var3_2 = (int)var10_8.Q(var3_2 + var4_3)) != 44) break block30;
                                                    var10_8.a = 16;
                                                    break block31;
                                                }
                                                if (var3_2 != 93) break block32;
                                                var3_2 = 15;
                                                break block33;
                                            }
                                            if (var3_2 != 125) break block34;
                                            var3_2 = 13;
                                        }
                                        var10_8.a = var3_2;
                                    }
                                    var10_8.e = var3_2 = var10_8.e + var5_1;
                                    var1_9 = var10_8.Q(var3_2);
                                    break block35;
                                }
                                var1_9 = 26;
                                if (var3_2 != 26) break block36;
                                var10_8.a = 20;
                                var10_8.e = var5_1 - 1 + var10_8.e;
                            }
                            var10_8.d = (char)var1_9;
                            var10_8.m = 4;
                            return var9_6;
                        }
                        var10_8.m = -1;
                        return null;
                    }
                    var10_8.m = -1;
                    return null;
                }
                throw new com.github.catvod.spider.merge.y.d("decimal overflow");
            }
            if (var7_5 != 110 || this.Q(this.e + var5_1) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, var5_1, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, var5_1, 2, this) != 'l') break block37;
            this.m = 5;
            var4_3 = var5_1 + 3;
            var6_4 = this.e;
            var5_1 = var4_3 + 1;
            var1_10 = var2_11 = this.Q(var6_4 + var4_3);
            var4_3 = var5_1;
            if (var3_2 == 0) ** GOTO lbl153
            var1_10 = var2_11;
            var4_3 = var5_1;
            if (var2_11 != '\"') ** GOTO lbl153
            var4_3 = var5_1;
            do {
                var1_10 = this.Q(this.e + var4_3);
                ++var4_3;
lbl153:
                // 3 sources

                if (var1_10 == ',') {
                    this.e = var3_2 = this.e + var4_3;
                    this.d = this.Q(var3_2);
                    this.m = 5;
                    this.a = 16;
                    return null;
                }
                if (var1_10 != '}') continue;
                this.e = var3_2 = this.e + var4_3;
                this.d = this.Q(var3_2);
                this.m = 5;
                this.a = 13;
                return null;
            } while (com.github.catvod.spider.merge.B.f.V(var1_10));
            this.m = -1;
            return null;
        }
        this.m = -1;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n0() {
        this.h = this.e - 1;
        this.i = false;
        do {
            ++this.g;
            this.next();
        } while (Character.isLetterOrDigit(this.d));
        String string = this.K();
        int n2 = "null".equalsIgnoreCase(string) ? 8 : ("new".equals(string) ? 9 : ("true".equals(string) ? 6 : ("false".equals(string) ? 7 : ("undefined".equals(string) ? 23 : ("Set".equals(string) ? 21 : ("TreeSet".equals(string) ? 22 : 18))))));
        this.a = n2;
    }

    @Override
    public abstract char next();

    /*
     * Exception decompiling
     */
    @Override
    public final void nextToken() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[CASE]], but top level block is 30[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final void o(int n2) {
        this.g = 0;
        while (true) {
            char c2;
            block33: {
                block28: {
                    block29: {
                        block30: {
                            block31: {
                                block32: {
                                    if (n2 == 2) break block28;
                                    if (n2 == 4) break block29;
                                    if (n2 == 12) break block30;
                                    if (n2 == 18) break block31;
                                    if (n2 == 20) break block32;
                                    switch (n2) {
                                        default: {
                                            break block33;
                                        }
                                        case 16: {
                                            c2 = this.d;
                                            if (c2 == ',') {
                                                this.a = 16;
                                                this.next();
                                                return;
                                            }
                                            if (c2 == '}') {
                                                this.a = 13;
                                                this.next();
                                                return;
                                            }
                                            if (c2 == ']') {
                                                this.a = 15;
                                                this.next();
                                                return;
                                            }
                                            if (c2 == '\u001a') {
                                                this.a = 20;
                                                return;
                                            }
                                            if (c2 == 'n') {
                                                this.o0(false);
                                                return;
                                            }
                                            break block33;
                                        }
                                        case 15: {
                                            if (this.d != ']') break;
                                            this.a = 15;
                                            this.next();
                                            return;
                                        }
                                        case 14: {
                                            c2 = this.d;
                                            if (c2 == '[') {
                                                this.a = 14;
                                                this.next();
                                                return;
                                            }
                                            if (c2 == '{') {
                                                this.a = 12;
                                                this.next();
                                                return;
                                            }
                                            break block33;
                                        }
                                    }
                                }
                                if (this.d == '\u001a') {
                                    this.a = 20;
                                    return;
                                }
                                break block33;
                            }
                            while (com.github.catvod.spider.merge.B.f.V(this.d)) {
                                this.next();
                            }
                            char c3 = this.d;
                            if (c3 != '_' && c3 != '$' && !Character.isLetter(c3)) {
                                this.nextToken();
                            } else {
                                this.n0();
                            }
                            return;
                        }
                        c2 = this.d;
                        if (c2 == '{') {
                            this.a = 12;
                            this.next();
                            return;
                        }
                        if (c2 == '[') {
                            this.a = 14;
                            this.next();
                            return;
                        }
                        break block33;
                    }
                    c2 = this.d;
                    if (c2 == '\"') {
                        this.b = this.e;
                        this.L();
                        return;
                    }
                    if (c2 >= '0' && c2 <= '9') {
                        this.b = this.e;
                        this.g();
                        return;
                    }
                    if (c2 == '[') {
                        this.a = 14;
                        this.next();
                        return;
                    }
                    if (c2 == '{') {
                        this.a = 12;
                        this.next();
                        return;
                    }
                    break block33;
                }
                c2 = this.d;
                if (c2 >= '0' && c2 <= '9') {
                    this.b = this.e;
                    this.g();
                    return;
                }
                if (c2 == '\"') {
                    this.b = this.e;
                    this.L();
                    return;
                }
                if (c2 == '[') {
                    this.a = 14;
                    this.next();
                    return;
                }
                if (c2 == '{') {
                    this.a = 12;
                    this.next();
                    return;
                }
            }
            c2 = this.d;
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                this.nextToken();
                return;
            }
            this.next();
        }
    }

    public final void o0(boolean bl) {
        if (this.d == 'n') {
            this.next();
            char c2 = this.d;
            if (c2 == 'u') {
                this.next();
                if (this.d == 'l') {
                    this.next();
                    if (this.d == 'l') {
                        this.next();
                        c2 = this.d;
                        if (!(c2 == ' ' || c2 == ',' || c2 == '}' || c2 == ']' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\u001a' || c2 == ':' && bl || c2 == '\f' || c2 == '\b')) {
                            throw new com.github.catvod.spider.merge.y.d("scan null error");
                        }
                        this.a = 8;
                        return;
                    }
                    throw new com.github.catvod.spider.merge.y.d("error parse null");
                }
                throw new com.github.catvod.spider.merge.y.d("error parse null");
            }
            if (c2 == 'e') {
                this.next();
                if (this.d == 'w') {
                    this.next();
                    c2 = this.d;
                    if (c2 != ' ' && c2 != ',' && c2 != '}' && c2 != ']' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\u001a' && c2 != '\f' && c2 != '\b') {
                        throw new com.github.catvod.spider.merge.y.d("scan new error");
                    }
                    this.a = 9;
                    return;
                }
                throw new com.github.catvod.spider.merge.y.d("error parse new");
            }
            throw new com.github.catvod.spider.merge.y.d("error parse new");
        }
        throw new com.github.catvod.spider.merge.y.d("error parse null or new");
    }

    @Override
    public final int p() {
        return this.a;
    }

    public final void p0(TimeZone timeZone) {
        this.k = timeZone;
    }

    @Override
    public final void q() {
        this.X();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected final void q0() {
        this.next();
        char c2 = this.d;
        if (c2 != '/') {
            if (c2 != '*') throw new com.github.catvod.spider.merge.y.d("invalid comment");
            block0: while (true) {
                this.next();
                do {
                    if ((c2 = this.d) == '\u001a') return;
                    if (c2 != '*') continue block0;
                    this.next();
                } while (this.d != '/');
                break;
            }
            this.next();
            return;
        }
        do {
            this.next();
            c2 = this.d;
            if (c2 != '\n') continue;
            this.next();
            return;
        } while (c2 != '\u001a');
    }

    @Override
    public final String r(char c2) {
        this.m = 0;
        char c3 = this.Q(this.e + 0);
        if (c3 == 'n') {
            if (this.Q(this.e + 1) == 'u' && com.github.catvod.spider.merge.B.e.a(this.e, 1, 1, this) == 'l' && com.github.catvod.spider.merge.B.e.a(this.e, 1, 2, this) == 'l') {
                if (this.Q(this.e + 4) == c2) {
                    c2 = (char)(this.e + 5);
                    this.e = c2;
                    this.d = this.Q(c2);
                    this.m = 3;
                    return null;
                }
                this.m = -1;
                return null;
            }
            this.m = -1;
            return null;
        }
        int n2 = 1;
        while (true) {
            if (c3 == '\"') {
                int n3 = this.e + n2;
                int n4 = this.T(n3);
                if (n4 != -1) {
                    String string = this.r0(this.e + n2, n4 - n3);
                    int n5 = n4;
                    String string2 = string;
                    if (string.indexOf(92) != -1) {
                        n5 = n4;
                        while (true) {
                            n4 = 0;
                            for (int i2 = n5 - 1; i2 >= 0 && this.Q(i2) == '\\'; --i2) {
                                ++n4;
                            }
                            if (n4 % 2 == 0) {
                                n4 = n5 - n3;
                                string2 = com.github.catvod.spider.merge.B.f.Z(this.s0(this.e + 1, n4), n4);
                                break;
                            }
                            n5 = this.T(n5 + 1);
                        }
                    }
                    n2 = n5 - n3 + 1 + n2;
                    n4 = this.e;
                    n5 = n2 + 1;
                    c3 = this.Q(n4 + n2);
                    while (true) {
                        if (c3 == c2) {
                            c2 = (char)(this.e + n5);
                            this.e = c2;
                            this.d = this.Q(c2);
                            this.m = 3;
                            this.a = 16;
                            return string2;
                        }
                        if (!com.github.catvod.spider.merge.B.f.V(c3)) break;
                        c3 = this.Q(this.e + n5);
                        ++n5;
                    }
                    if (c3 == ']') {
                        c2 = (char)(this.e + n5);
                        this.e = c2;
                        this.d = this.Q(c2);
                        this.m = -1;
                    }
                    return string2;
                }
                throw new com.github.catvod.spider.merge.y.d("unclosed str");
            }
            if (!com.github.catvod.spider.merge.B.f.V(c3)) break;
            c3 = this.Q(this.e + n2);
            ++n2;
        }
        this.m = -1;
        return this.n;
    }

    public abstract String r0(int var1, int var2);

    @Override
    public abstract BigDecimal s();

    protected abstract char[] s0(int var1, int var2);

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean t(char var1_1) {
        block6: {
            block9: {
                block7: {
                    block8: {
                        block4: {
                            block5: {
                                var5_2 = false;
                                var4_3 = false;
                                this.m = 0;
                                var2_4 = this.Q(this.e + 0);
                                var3_5 = 5;
                                if (var2_4 != 't') break block4;
                                if (this.Q(this.e + 1) != 'r' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 1, this) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 2, this) != 'e') break block5;
                                var2_4 = this.Q(this.e + 4);
                                var4_3 = true;
                                break block6;
                            }
                            this.m = -1;
                            return false;
                        }
                        if (var2_4 != 'f') break block7;
                        if (this.Q(this.e + 1) != 'a' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 2, this) != 's' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 3, this) != 'e') break block8;
                        var2_4 = this.Q(this.e + 5);
                        var3_5 = 6;
                        var4_3 = var5_2;
                        break block6;
                    }
                    this.m = -1;
                    return false;
                }
                if (var2_4 != '1') break block9;
                var2_4 = this.Q(this.e + 1);
                var4_3 = true;
                ** GOTO lbl32
            }
            if (var2_4 == '0') {
                var2_4 = this.Q(this.e + 1);
lbl32:
                // 2 sources

                var3_5 = 2;
            } else {
                var3_5 = 1;
                var4_3 = var5_2;
            }
        }
        while (true) {
            if (var2_4 == var1_1) {
                var1_1 = (char)(this.e + var3_5);
                this.e = var1_1;
                this.d = this.Q(var1_1);
                this.m = 3;
                return var4_3;
            }
            if (!com.github.catvod.spider.merge.B.f.V(var2_4)) break;
            var2_4 = this.Q(this.e + var3_5);
            ++var3_5;
        }
        this.m = -1;
        return var4_3;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    @Override
    public int u(char c2) {
        f f2;
        char c3;
        block15: {
            char c4;
            boolean bl;
            int n2;
            int n3;
            block13: {
                block14: {
                    int n4;
                    int n5;
                    block12: {
                        this.m = 0;
                        n5 = this.Q(this.e + 0);
                        n3 = n5 == 34 ? 1 : 0;
                        if (n3 != 0) {
                            n5 = this.Q(this.e + 1);
                            n2 = 2;
                        } else {
                            n2 = 1;
                        }
                        bl = n5 == 45;
                        n4 = n5;
                        n5 = n2;
                        if (bl) {
                            n4 = this.Q(this.e + n2);
                            n5 = n2 + 1;
                        }
                        if (n4 < 48 || n4 > 57) break block12;
                        n2 = n4 - 48;
                        while (true) {
                            n4 = this.e;
                            n3 = n5 + 1;
                            c4 = this.Q(n4 + n5);
                            if (c4 < '0' || c4 > '9') break;
                            n2 = n2 * 10 + (c4 - 48);
                            n5 = n3;
                        }
                        if (c4 == '.') {
                            this.m = -1;
                            return 0;
                        }
                        if (n2 < 0) {
                            this.m = -1;
                            return 0;
                        }
                        break block13;
                    }
                    if (n4 != 110 || this.Q(this.e + n5) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, n5, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, n5, 2, this) != 'l') break block14;
                    this.m = 5;
                    n2 = n5 + 3;
                    n5 = this.e;
                    c2 = (char)(n2 + 1);
                    c3 = this.Q(n5 + n2);
                    if (n3 == 0 || c3 != '\"') break block15;
                    f2 = this;
                    c3 = f2.Q(f2.e + c2);
                    c2 = (char)(c2 + 1);
                }
                this.m = -1;
                return 0;
            }
            while (true) {
                if (c4 == c2) {
                    c2 = (char)(this.e + n3);
                    this.e = c2;
                    this.d = this.Q(c2);
                    this.m = 3;
                    this.a = 16;
                    c2 = (char)n2;
                    if (!bl) return c2;
                    return (char)(-n2);
                }
                if (!com.github.catvod.spider.merge.B.f.V(c4)) break;
                c4 = this.Q(this.e + n3);
                ++n3;
            }
            this.m = -1;
            c2 = (char)n2;
            if (!bl) return c2;
            return (char)(-n2);
        }
        f2 = this;
        while (true) {
            if (c3 == ',') {
                c2 = (char)(f2.e + c2);
                f2.e = c2;
                f2.d = f2.Q(c2);
                f2.m = 5;
                f2.a = 16;
                return 0;
            }
            if (c3 == ']') {
                c2 = (char)(f2.e + c2);
                f2.e = c2;
                f2.d = f2.Q(c2);
                f2.m = 5;
                f2.a = 15;
                return 0;
            }
            if (!com.github.catvod.spider.merge.B.f.V(c3)) {
                f2.m = -1;
                return 0;
            }
            c3 = f2.Q(f2.e + c2);
            c2 = (char)(c2 + 1);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Enum<?> v(Class<?> var1_1, p var2_2, char var3_3) {
        block9: {
            var5_4 = 0;
            this.m = 0;
            var6_5 = this.Q(this.e + 0);
            if (var6_5 != 110) break block9;
            if (this.Q(this.e + 1) != 'u' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 1, this) != 'l' || com.github.catvod.spider.merge.B.e.a(this.e, 1, 2, this) != 'l' || this.Q(this.e + 4) != var3_3) ** GOTO lbl40
            var3_3 = (char)(this.e + 5);
            this.e = var3_3;
            this.d = this.Q(var3_3);
            this.m = 3;
            ** GOTO lbl41
        }
        if (var6_5 != 34) ** GOTO lbl40
        var6_5 = 1;
        while (true) {
            block11: {
                block8: {
                    block10: {
                        var8_7 = this.e;
                        var7_6 = var6_5 + '\u0001';
                        if ((var6_5 = this.Q(var8_7 + var6_5)) != 34) break block10;
                        var6_5 = this.e;
                        var8_7 = var6_5 + 0 + 1;
                        var2_2 = this.N(var8_7, var6_5 + var7_6 - var8_7 - 1, var5_4, (p)var2_2);
                        var6_5 = this.e;
                        var5_4 = var7_6 + 1;
                        var4_8 = this.Q(var6_5 + var7_6);
                        while (true) {
                            if (var4_8 == var3_3) {
                                var3_3 = (char)(this.e + var5_4);
                                this.e = var3_3;
                                this.d = this.Q(var3_3);
                                this.m = 3;
                                break block8;
                            }
                            if (!com.github.catvod.spider.merge.B.f.V(var4_8)) break;
                            var4_8 = this.Q(this.e + var5_4);
                            ++var5_4;
                        }
                        this.m = -1;
                        break block8;
                    }
                    var5_4 = var5_4 * 31 + var6_5;
                    if (var6_5 != 92) break block11;
lbl40:
                    // 3 sources

                    this.m = -1;
lbl41:
                    // 2 sources

                    var2_2 = null;
                }
                if (var2_2 == null) {
                    return null;
                }
                return Enum.valueOf(var1_1, (String)var2_2);
            }
            var6_5 = var7_6;
        }
    }

    @Override
    public final int w() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final String x(p p2) {
        block10: {
            int n2;
            block8: {
                block9: {
                    block7: {
                        this.d();
                        n2 = this.d;
                        if (n2 == 34) {
                            return this.I(p2, '\"');
                        }
                        if (n2 == 39) {
                            if (this.l(com.github.catvod.spider.merge.B.c.d)) {
                                return this.I(p2, '\'');
                            }
                            throw new com.github.catvod.spider.merge.y.d("syntax error");
                        }
                        if (n2 != 125) break block7;
                        this.next();
                        n2 = 13;
                        break block8;
                    }
                    if (n2 != 44) break block9;
                    this.next();
                    n2 = 16;
                    break block8;
                }
                if (n2 != 26) break block10;
                n2 = 20;
            }
            this.a = n2;
            return null;
        }
        if (this.l(com.github.catvod.spider.merge.B.c.c)) {
            return this.E(p2);
        }
        throw new com.github.catvod.spider.merge.y.d("syntax error");
    }

    @Override
    public final String y() {
        return com.github.catvod.spider.merge.B.j.f(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Number z(boolean bl) {
        NumberFormatException numberFormatException2;
        char c2 = this.Q(this.h + this.g - 1);
        if (c2 == 'F') {
            try {
                return Float.valueOf(Float.parseFloat(this.J()));
            }
            catch (NumberFormatException numberFormatException2) {
            }
        } else {
            if (c2 == 'D') {
                return Double.parseDouble(this.J());
            }
            if (bl) {
                return this.s();
            }
            double d2 = Double.parseDouble(this.J());
            return d2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numberFormatException2.getMessage());
        stringBuilder.append(", ");
        stringBuilder.append(this.f());
        throw new com.github.catvod.spider.merge.y.d(stringBuilder.toString());
    }
}

