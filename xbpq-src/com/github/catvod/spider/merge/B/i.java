/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public final class i
extends f {
    private final String q;
    private final int r;

    public i(String string) {
        this(string, com.github.catvod.spider.merge.y.a.f);
    }

    public i(String string, int n2) {
        super(n2);
        this.q = string;
        this.r = string.length();
        this.e = -1;
        this.next();
        if (this.d == '\ufeff') {
            this.next();
        }
    }

    static boolean t0(String string, int n2, char[] cArray) {
        int n3 = cArray.length;
        if (n3 + n2 > string.length()) {
            return false;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            if (cArray[i2] == string.charAt(n2 + i2)) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean u0(char c2, char c3, char c4, char c5, char c6, char c7, int n2, int n3) {
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') return false;
        if (c6 == '0') {
            if (c7 >= '1' && c7 <= '9') return !(n2 == 48 ? n3 < 49 || n3 > 57 : (n2 != 49 && n2 != 50 ? n2 != 51 || n3 != 48 && n3 != 49 : n3 < 48 || n3 > 57));
            return false;
        }
        if (c6 != '1') return false;
        if (c7 == '0' || c7 == '1' || c7 == '2') return !(n2 == 48 ? n3 < 49 || n3 > 57 : (n2 != 49 && n2 != 50 ? n2 != 51 || n3 != 48 && n3 != 49 : n3 < 48 || n3 > 57));
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean v0(char c2, char c3, char c4, char c5, char c6, char c7) {
        if (c2 == '0') {
            if (c3 < '0' || c3 > '9') {
                return false;
            }
        } else if (c2 == '1') {
            if (c3 < '0' || c3 > '9') {
                return false;
            }
        } else if (c2 != '2' || c3 < '0' || c3 > '4') return false;
        if (c4 >= '0' && c4 <= '5') {
            if (c5 < '0' || c5 > '9') {
                return false;
            }
        } else {
            if (c4 != '6') return false;
            if (c5 != '0') {
                return false;
            }
        }
        if (c6 >= '0' && c6 <= '5') {
            if (c7 >= '0' && c7 <= '9') return true;
            return false;
        }
        if (c6 != '6') return false;
        if (c7 == '0') return true;
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean y0(boolean var1_1, int var2_2) {
        block60: {
            block74: {
                block87: {
                    block86: {
                        block61: {
                            block79: {
                                block80: {
                                    block76: {
                                        block78: {
                                            block82: {
                                                block85: {
                                                    block84: {
                                                        block83: {
                                                            block81: {
                                                                block77: {
                                                                    block75: {
                                                                        block73: {
                                                                            block58: {
                                                                                block71: {
                                                                                    block66: {
                                                                                        block72: {
                                                                                            block70: {
                                                                                                block67: {
                                                                                                    block69: {
                                                                                                        block68: {
                                                                                                            block64: {
                                                                                                                block65: {
                                                                                                                    block62: {
                                                                                                                        block63: {
                                                                                                                            block59: {
                                                                                                                                if (var2_2 < 8) {
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                var9_3 = this.Q(this.e);
                                                                                                                                var8_4 = this.Q(this.e + 1);
                                                                                                                                var11_5 = this.Q(this.e + 2);
                                                                                                                                var7_6 = this.Q(this.e + 3);
                                                                                                                                var10_7 = this.Q(this.e + 4);
                                                                                                                                var3_8 = this.Q(this.e + 5);
                                                                                                                                var4_9 = this.Q(this.e + 6);
                                                                                                                                var5_10 = this.Q(this.e + 7);
                                                                                                                                if (var1_1 || var2_2 <= 13) break block59;
                                                                                                                                var14_11 = this.Q(this.e + var2_2 - 1);
                                                                                                                                var13_12 = this.Q(this.e + var2_2 - 2);
                                                                                                                                if (var9_3 != '/' || var8_4 != 'D' || var11_5 != 97 || var7_6 != 116 || var10_7 != 101 || var3_8 != 40 || var14_11 != 47 || var13_12 != 41) break block59;
                                                                                                                                var14_11 = -1;
                                                                                                                                for (var13_12 = 6; var13_12 < var2_2; ++var13_12) {
                                                                                                                                    var16_16 = this.Q(this.e + var13_12);
                                                                                                                                    if (var16_16 == '+') {
                                                                                                                                        var15_13 = var13_12;
                                                                                                                                    } else {
                                                                                                                                        if (var16_16 < '0') break;
                                                                                                                                        var15_13 = var14_11;
                                                                                                                                        if (var16_16 > '9') break;
                                                                                                                                    }
                                                                                                                                    var14_11 = var15_13;
                                                                                                                                }
                                                                                                                                if (var14_11 == -1) {
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                var2_2 = this.e;
                                                                                                                                var13_12 = var2_2 + 6;
                                                                                                                                var18_18 = Long.parseLong(this.r0(var13_12, var2_2 + var14_11 - var13_12));
                                                                                                                                this.j = var20_19 = Calendar.getInstance(this.k, this.l);
                                                                                                                                var20_19.setTimeInMillis(var18_18);
                                                                                                                                this.a = 5;
                                                                                                                                break block60;
                                                                                                                            }
                                                                                                                            if (var2_2 == 8 || var2_2 == 14 || var2_2 == 16 && ((var13_12 = this.Q(this.e + 10)) == 84 || var13_12 == 32) || var2_2 == 17 && this.Q(this.e + 6) != '-') break block61;
                                                                                                                            if (var2_2 < 9) {
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            var6_22 = this.Q(this.e + 8);
                                                                                                                            var12_24 = this.Q(this.e + 9);
                                                                                                                            if ((var10_7 != 45 || var5_10 != 45) && (var10_7 != 47 || var5_10 != 47)) break block62;
                                                                                                                            if (var12_24 != 32) break block63;
                                                                                                                            var13_12 = 9;
                                                                                                                            ** GOTO lbl124
                                                                                                                        }
                                                                                                                        var13_12 = 10;
                                                                                                                        ** GOTO lbl112
                                                                                                                    }
                                                                                                                    if (var10_7 != 45 || var4_9 != 45) break block64;
                                                                                                                    if (var6_22 != 32) break block65;
                                                                                                                    var13_12 = 8;
                                                                                                                    break block66;
                                                                                                                }
                                                                                                                var13_12 = 9;
                                                                                                                break block67;
                                                                                                            }
                                                                                                            if ((var11_5 != 46 || var3_8 != 46) && (var11_5 != 45 || var3_8 != 45)) break block68;
                                                                                                            var11_5 = var12_24;
                                                                                                            var3_8 = var4_9;
                                                                                                            var4_9 = var9_3;
                                                                                                            var9_3 = var5_10;
                                                                                                            var5_10 = var8_4;
                                                                                                            var8_4 = var6_22;
                                                                                                            var13_12 = 10;
                                                                                                            var6_22 = var9_3;
                                                                                                            var9_3 = var11_5;
                                                                                                            break block58;
                                                                                                        }
                                                                                                        if (var6_22 != 84) break block69;
                                                                                                        var13_12 = 8;
                                                                                                        var6_22 = var10_7;
                                                                                                        var10_7 = var3_8;
                                                                                                        break block70;
                                                                                                    }
                                                                                                    if (var10_7 != 24180 && var10_7 != 45380) {
                                                                                                        return false;
                                                                                                    }
                                                                                                    if (var5_10 == 26376 || var5_10 == 50900) break block71;
                                                                                                    if (var4_9 != 26376 && var4_9 != 50900) {
                                                                                                        return false;
                                                                                                    }
                                                                                                    if (var6_22 == 26085 || var6_22 == 51068) break block72;
                                                                                                    if (var12_24 != 26085 && var12_24 != 51068) {
                                                                                                        return false;
                                                                                                    }
                                                                                                    var13_12 = 10;
                                                                                                }
                                                                                                var12_24 = 48;
                                                                                                var4_9 = var5_10;
                                                                                                var5_10 = var6_22;
                                                                                                var10_7 = var3_8;
                                                                                                var6_22 = var12_24;
                                                                                            }
lbl91:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                var3_8 = var9_3;
                                                                                                var9_3 = var8_4;
                                                                                                var8_4 = var11_5;
                                                                                                var11_5 = var7_6;
                                                                                                var7_6 = var6_22;
                                                                                                var6_22 = var9_3;
                                                                                                var9_3 = var11_5;
                                                                                                break block58;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var13_12 = 10;
                                                                                    }
                                                                                    var6_22 = 48;
                                                                                    var4_9 = 48;
                                                                                    var10_7 = var3_8;
                                                                                    ** GOTO lbl91
                                                                                }
                                                                                if (var12_24 != 26085 && var12_24 != 51068) {
                                                                                    if (this.Q(this.e + 10) != '\u65e5' && this.Q(this.e + 10) != '\uc77c') {
                                                                                        return false;
                                                                                    }
                                                                                    var13_12 = 11;
lbl112:
                                                                                    // 2 sources

                                                                                    var5_10 = var12_24;
                                                                                    var10_7 = var3_8;
                                                                                    var12_24 = var4_9;
                                                                                    var4_9 = var6_22;
                                                                                    var3_8 = var9_3;
                                                                                    var6_22 = var8_4;
                                                                                    var8_4 = var11_5;
                                                                                    var9_3 = var7_6;
                                                                                    var7_6 = var10_7;
                                                                                    var10_7 = var12_24;
                                                                                } else {
                                                                                    var13_12 = 10;
lbl124:
                                                                                    // 2 sources

                                                                                    var5_10 = var6_22;
                                                                                    var12_24 = 48;
                                                                                    var6_22 = var3_8;
                                                                                    var10_7 = var4_9;
                                                                                    var4_9 = var12_24;
                                                                                    ** continue;
                                                                                }
                                                                            }
                                                                            if (!com.github.catvod.spider.merge.B.i.u0((char)var3_8, (char)var6_22, (char)var8_4, (char)var9_3, (char)var7_6, (char)var10_7, var4_9, var5_10)) {
                                                                                return false;
                                                                            }
                                                                            this.z0((char)var3_8, (char)var6_22, (char)var8_4, (char)var9_3, (char)var7_6, (char)var10_7, (char)var4_9, (char)var5_10);
                                                                            var3_8 = this.Q(this.e + var13_12);
                                                                            if (var3_8 != 84 || var2_2 != 16 || var13_12 != 8 || this.Q(this.e + 15) != 'Z') break block73;
                                                                            var7_6 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 1, this);
                                                                            if (!this.v0((char)var7_6, (char)(var6_22 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 2, this)), (char)(var3_8 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 3, this)), (char)(var5_10 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 4, this)), (char)(var8_4 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 5, this)), (char)(var4_9 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 6, this)))) {
                                                                                return false;
                                                                            }
                                                                            this.A0((char)var7_6, (char)var6_22, (char)var3_8, (char)var5_10, (char)var8_4, (char)var4_9);
                                                                            this.j.set(14, 0);
                                                                            if (this.j.getTimeZone().getRawOffset() != 0 && (var20_20 /* !! */  = TimeZone.getAvailableIDs(0)).length > 0) {
                                                                                var20_20 /* !! */  = TimeZone.getTimeZone(var20_20 /* !! */ [0]);
                                                                                this.j.setTimeZone((TimeZone)var20_20 /* !! */ );
                                                                            }
                                                                            break block74;
                                                                        }
                                                                        if (var3_8 == 84 || var3_8 == 32 && !var1_1) break block75;
                                                                        if (var3_8 != 34 && var3_8 != 26 && var3_8 != 26085 && var3_8 != 51068) {
                                                                            if (var3_8 != 43 && var3_8 != 45) {
                                                                                return false;
                                                                            }
                                                                            if (this.r == var13_12 + 6) {
                                                                                if (com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 3, this) == ':' && com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 4, this) == '0' && com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 5, this) == '0') {
                                                                                    this.A0('0', '0', '0', '0', '0', '0');
                                                                                    this.j.set(14, 0);
                                                                                    this.B0((char)var3_8, com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 1, this), com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 2, this), '0', '0');
                                                                                    return true;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        this.j.set(11, 0);
                                                                        this.j.set(12, 0);
                                                                        this.j.set(13, 0);
                                                                        this.j.set(14, 0);
                                                                        break block76;
                                                                    }
                                                                    if (var2_2 < var13_12 + 9) {
                                                                        return false;
                                                                    }
                                                                    if (com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 3, this) != ':') {
                                                                        return false;
                                                                    }
                                                                    if (com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 6, this) != ':') {
                                                                        return false;
                                                                    }
                                                                    var3_8 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 1, this);
                                                                    if (!this.v0((char)var3_8, (char)(var7_6 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 2, this)), (char)(var4_9 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 4, this)), (char)(var6_22 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 5, this)), (char)(var8_4 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 7, this)), (char)(var5_10 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 8, this)))) {
                                                                        return false;
                                                                    }
                                                                    this.A0((char)var3_8, (char)var7_6, (char)var4_9, (char)var6_22, (char)var8_4, (char)var5_10);
                                                                    var15_14 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 9, this);
                                                                    var14_11 = -1;
                                                                    if (var15_14 != 46) ** GOTO lbl203
                                                                    var14_11 = var13_12 + 11;
                                                                    if (var2_2 < var14_11) {
                                                                        return false;
                                                                    }
                                                                    var15_14 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 10, this);
                                                                    if (var15_14 >= 48 && var15_14 <= 57) {
                                                                        var16_17 = var15_14 - 48;
                                                                        if (var2_2 > var14_11 && (var2_2 = (int)com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 11, this)) >= 48 && var2_2 <= 57) {
                                                                            var16_17 = var16_17 * 10 + (var2_2 - 48);
                                                                            var15_14 = 2;
                                                                        } else {
                                                                            var15_14 = 1;
                                                                        }
                                                                        var14_11 = var16_17;
                                                                        var2_2 = var15_14;
                                                                        if (var15_14 == 2) {
                                                                            var17_26 = com.github.catvod.spider.merge.B.h.d(this.e, var13_12, 12, this);
                                                                            var14_11 = var16_17;
                                                                            var2_2 = var15_14;
                                                                            if (var17_26 >= '0') {
                                                                                var14_11 = var16_17;
                                                                                var2_2 = var15_14;
                                                                                if (var17_26 <= '9') {
                                                                                    var14_11 = var16_17 * 10 + (var17_26 - 48);
                                                                                    var2_2 = 3;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        return false;
lbl203:
                                                                        // 1 sources

                                                                        var15_14 = 0;
                                                                        var2_2 = var14_11;
                                                                        var14_11 = var15_14;
                                                                    }
                                                                    this.j.set(14, var14_11);
                                                                    var5_10 = var3_8 = this.Q(this.e + var13_12 + 10 + var2_2);
                                                                    var14_11 = var2_2;
                                                                    if (var3_8 == 32) {
                                                                        var14_11 = var2_2 + 1;
                                                                        var5_10 = this.Q(this.e + var13_12 + 10 + var14_11);
                                                                    }
                                                                    if (var5_10 == 43 || var5_10 == 45) break block77;
                                                                    if (var5_10 == 90) {
                                                                        if (this.j.getTimeZone().getRawOffset() != 0 && (var20_21 /* !! */  = TimeZone.getAvailableIDs(0)).length > 0) {
                                                                            var20_21 /* !! */  = TimeZone.getTimeZone(var20_21 /* !! */ [0]);
                                                                            this.j.setTimeZone((TimeZone)var20_21 /* !! */ );
                                                                        }
                                                                        var2_2 = 1;
                                                                    } else {
                                                                        var2_2 = 0;
                                                                    }
                                                                    break block78;
                                                                }
                                                                var7_6 = this.Q(this.e + var13_12 + 10 + var14_11 + 1);
                                                                if (var7_6 < 48 || var7_6 > 49) break block79;
                                                                var6_22 = this.Q(this.e + var13_12 + 10 + var14_11 + 2);
                                                                if (var6_22 < 48 || var6_22 > 57) break block80;
                                                                var2_2 = this.Q(this.e + var13_12 + 10 + var14_11 + 3);
                                                                var3_8 = 51;
                                                                if (var2_2 != 58) break block81;
                                                                var3_8 = this.Q(this.e + var13_12 + 10 + var14_11 + 4);
                                                                var4_9 = this.Q(this.e + var13_12 + 10 + var14_11 + 5);
                                                                if (var3_8 == 52 && var4_9 == 53) {
                                                                    if ((var7_6 != 49 || var6_22 != 50 && var6_22 != 51) && (var7_6 != 48 || var6_22 != 53 && var6_22 != 56)) {
                                                                        return false;
                                                                    }
                                                                } else {
                                                                    if (var3_8 != 48 && var3_8 != 51) {
                                                                        return false;
                                                                    }
                                                                    if (var4_9 != 48) {
                                                                        return false;
                                                                    }
                                                                }
                                                                var2_2 = 6;
                                                                break block82;
                                                            }
                                                            if (var2_2 != 48) break block83;
                                                            var3_8 = this.Q(this.e + var13_12 + 10 + var14_11 + 4);
                                                            if (var3_8 != 48 && var3_8 != 51) {
                                                                return false;
                                                            }
                                                            break block84;
                                                        }
                                                        if (var2_2 != 51 || this.Q(this.e + var13_12 + 10 + var14_11 + 4) != '0') break block85;
                                                    }
                                                    var4_9 = 48;
                                                    ** GOTO lbl256
                                                }
                                                if (var2_2 == 52 && this.Q(this.e + var13_12 + 10 + var14_11 + 4) == '5') {
                                                    var3_8 = 52;
                                                    var4_9 = 53;
lbl256:
                                                    // 2 sources

                                                    var2_2 = 5;
                                                } else {
                                                    var3_8 = 48;
                                                    var4_9 = 48;
                                                    var2_2 = 3;
                                                }
                                            }
                                            this.B0((char)var5_10, (char)var7_6, (char)var6_22, (char)var3_8, (char)var4_9);
                                        }
                                        var15_14 = this.e;
                                        var2_2 = var13_12 + 10 + var14_11 + var2_2;
                                        var14_11 = this.Q(var15_14 + var2_2);
                                        var13_12 = var2_2;
                                        if (var14_11 != 26) {
                                            var13_12 = var2_2;
                                            if (var14_11 != 34) {
                                                return false;
                                            }
                                        }
                                    }
                                    this.e = var2_2 = this.e + var13_12;
                                    this.d = this.Q(var2_2);
                                    break block74;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (var1_1) {
                            return false;
                        }
                        var12_25 = this.Q(this.e + 8);
                        var14_11 = var10_7 == 45 && var5_10 == 45 ? 1 : 0;
                        var13_12 = var14_11 != 0 && var2_2 == 16 ? 1 : 0;
                        if ((var14_11 = var14_11 != 0 && var2_2 == 17 ? 1 : 0) == 0 && var13_12 == 0) {
                            if (var10_7 == 45 && var4_9 == 45) {
                                var4_9 = var3_8;
                                var6_23 = var5_10;
                                var3_8 = 48;
                                var5_10 = 48;
                            } else {
                                var6_23 = var5_10;
                                var5_10 = var4_9;
                                var4_9 = var3_8;
                                var3_8 = var10_7;
                            }
                        } else {
                            var6_23 = this.Q(this.e + 9);
                            var5_10 = var12_25;
                        }
                        if (!com.github.catvod.spider.merge.B.i.u0((char)var9_3, (char)var8_4, (char)var11_5, (char)var7_6, (char)var3_8, (char)var4_9, var5_10, var6_23)) {
                            return false;
                        }
                        this.z0((char)var9_3, (char)var8_4, (char)var11_5, (char)var7_6, (char)var3_8, (char)var4_9, (char)var5_10, (char)var6_23);
                        if (var2_2 == 8) break block86;
                        var3_8 = this.Q(this.e + 9);
                        var4_9 = this.Q(this.e + 10);
                        var6_23 = this.Q(this.e + 11);
                        var5_10 = this.Q(this.e + 12);
                        var8_4 = this.Q(this.e + 13);
                        if (var14_11 != 0 && var4_9 == 84 && var8_4 == 58 && this.Q(this.e + 16) == 'Z' || var13_12 != 0 && (var4_9 == 32 || var4_9 == 84) && var8_4 == 58) {
                            var8_4 = this.Q(this.e + 14);
                            var7_6 = this.Q(this.e + 15);
                            var3_8 = var6_23;
                            var4_9 = var5_10;
                            var9_3 = 48;
                            var5_10 = 48;
                            var6_23 = var7_6;
                            var7_6 = var9_3;
                            var12_25 = var3_8;
                        } else {
                            var7_6 = var5_10;
                            var5_10 = var8_4;
                            var8_4 = var4_9;
                            var4_9 = var3_8;
                        }
                        if (!this.v0((char)var12_25, (char)var4_9, (char)var8_4, (char)var6_23, (char)var7_6, (char)var5_10)) {
                            return false;
                        }
                        if (var2_2 != 17 || var14_11 != 0) ** GOTO lbl338
                        var2_2 = this.Q(this.e + 14);
                        var13_12 = this.Q(this.e + 15);
                        var14_11 = this.Q(this.e + 16);
                        if (var2_2 < 48 || var2_2 > 57) ** GOTO lbl337
                        if (var13_12 < 48 || var13_12 > 57) ** GOTO lbl336
                        if (var14_11 >= 48 && var14_11 <= 57) {
                            var2_2 = var14_11 - 48 + ((var13_12 - 48) * 10 + (var2_2 - 48) * 100);
                        } else {
                            return false;
lbl336:
                            // 1 sources

                            return false;
lbl337:
                            // 1 sources

                            return false;
lbl338:
                            // 1 sources

                            var2_2 = 0;
                        }
                        var15_15 = var4_9 - 48 + (var12_25 - 48) * 10;
                        var13_12 = var6_23 - 48 + (var8_4 - 48) * 10;
                        var14_11 = var5_10 - 48 + (var7_6 - 48) * 10;
                        break block87;
                    }
                    var13_12 = 0;
                    var14_11 = 0;
                    var2_2 = 0;
                    var15_15 = 0;
                }
                this.j.set(11, var15_15);
                this.j.set(12, var13_12);
                this.j.set(13, var14_11);
                this.j.set(14, var2_2);
            }
            this.a = 5;
        }
        return true;
    }

    private void z0(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9) {
        Calendar calendar;
        this.j = calendar = Calendar.getInstance(this.k, this.l);
        calendar.set(1, c5 - 48 + ((c4 - 48) * 10 + ((c3 - 48) * 100 + (c2 - 48) * 1000)));
        this.j.set(2, c7 - 48 + (c6 - 48) * 10 - 1);
        this.j.set(5, c9 - 48 + (c8 - 48) * 10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final byte[] A() {
        block17: {
            block19: {
                block18: {
                    var3_1 = this.a;
                    var1_2 = 2;
                    var7_3 = '\u0000';
                    var2_4 = 0;
                    if (var3_1 == 26) {
                        var4_5 = this.h;
                        var1_2 = this.g;
                        if (var1_2 % 2 == 0) {
                            var5_7 = var1_2 / 2;
                            var15_9 = new byte[var5_7];
                            for (var1_2 = var2_4; var1_2 < var5_7; ++var1_2) {
                                var14_13 = this.q;
                                var2_4 = var1_2 * 2 + (var4_5 + 1);
                                var6_11 = var14_13.charAt(var2_4);
                                var7_3 = this.q.charAt(var2_4 + 1);
                                var3_1 = 48;
                                var2_4 = var6_11 <= '9' ? 48 : 55;
                                if (var7_3 > '9') {
                                    var3_1 = 55;
                                }
                                var15_9[var1_2] = (byte)(var6_11 - var2_4 << 4 | var7_3 - var3_1);
                            }
                            return var15_9;
                        }
                        throw new d(com.github.catvod.spider.merge.I.r.a("illegal state. ", var1_2));
                    }
                    if (this.i) break block17;
                    var15_10 = this.q;
                    var3_1 = this.h + 1;
                    var4_6 = this.g;
                    var14_14 = com.github.catvod.spider.merge.H.i.a;
                    if (var4_6 != 0) break block18;
                    var14_14 = new byte[0];
                    break block19;
                }
                var2_4 = var3_1 + var4_6 - 1;
                while (true) {
                    var5_8 = var2_4;
                    if (var3_1 >= var2_4) break;
                    var5_8 = var2_4;
                    if (com.github.catvod.spider.merge.H.i.p[var15_10.charAt(var3_1)] >= 0) break;
                    ++var3_1;
                }
                while (var5_8 > 0 && com.github.catvod.spider.merge.H.i.p[var15_10.charAt(var5_8)] < 0) {
                    --var5_8;
                }
                if (var15_10.charAt(var5_8) == '=') {
                    if (var15_10.charAt(var5_8 - 1) != '=') {
                        var1_2 = 1;
                    }
                } else {
                    var1_2 = 0;
                }
                var8_15 = var5_8 - var3_1 + 1;
                if (var4_6 > 76) {
                    var2_4 = var15_10.charAt(76) == '\r' ? var8_15 / 78 : 0;
                    var6_12 = var2_4 << 1;
                } else {
                    var6_12 = 0;
                }
                var8_15 = ((var8_15 - var6_12) * 6 >> 3) - var1_2;
                var14_14 = new byte[var8_15];
                var9_16 = var8_15 / 3;
                var2_4 = 0;
                var4_6 = 0;
                while (var2_4 < var9_16 * 3) {
                    var16_21 = com.github.catvod.spider.merge.H.i.p;
                    var11_18 = var3_1 + 1;
                    var10_17 = var16_21[var15_10.charAt(var3_1)];
                    var3_1 = var11_18 + 1;
                    var12_19 = var16_21[var15_10.charAt(var11_18)];
                    var11_18 = var3_1 + 1;
                    var13_20 = var16_21[var15_10.charAt(var3_1)];
                    var3_1 = var11_18 + 1;
                    var11_18 = var10_17 << 18 | var12_19 << 12 | var13_20 << 6 | var16_21[var15_10.charAt(var11_18)];
                    var12_19 = var2_4 + 1;
                    var14_14[var2_4] = (byte)(var11_18 >> 16);
                    var10_17 = var12_19 + 1;
                    var14_14[var12_19] = (byte)(var11_18 >> 8);
                    var14_14[var10_17] = (byte)var11_18;
                    var2_4 = var4_6++;
                    if (var6_12 <= 0) ** GOTO lbl-1000
                    var2_4 = var4_6;
                    if (var4_6 == 19) {
                        var3_1 += 2;
                        var4_6 = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = var2_4;
                    }
                    var2_4 = var10_17 + 1;
                }
                if (var2_4 < var8_15) {
                    var4_6 = 0;
                    var6_12 = var7_3;
                    while (var3_1 <= var5_8 - var1_2) {
                        var4_6 |= com.github.catvod.spider.merge.H.i.p[var15_10.charAt(var3_1)] << 18 - var6_12 * 6;
                        ++var6_12;
                        ++var3_1;
                    }
                    var1_2 = 16;
                    while (var2_4 < var8_15) {
                        var14_14[var2_4] = (byte)(var4_6 >> var1_2);
                        var1_2 -= 8;
                        ++var2_4;
                    }
                }
            }
            return var14_14;
        }
        return com.github.catvod.spider.merge.H.i.b(new String(this.f, 0, this.g));
    }

    protected final void A0(char c2, char c3, char c4, char c5, char c6, char c7) {
        this.j.set(11, c3 - 48 + (c2 - 48) * 10);
        this.j.set(12, c5 - 48 + (c4 - 48) * 10);
        this.j.set(13, c7 - 48 + (c6 - 48) * 10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final double B(char var1_1) {
        block22: {
            block20: {
                block21: {
                    this.m = 0;
                    var8_2 = this.e;
                    var9_3 = var8_2 + 1;
                    var11_4 = this.Q(var8_2);
                    var8_2 = var11_4 == 34 ? 1 : 0;
                    var10_5 = var9_3;
                    if (var8_2 != 0) {
                        var11_4 = this.Q(var9_3);
                        var10_5 = var9_3 + 1;
                    }
                    var9_3 = var11_4 == 45 ? 1 : 0;
                    var12_6 = var11_4;
                    var11_4 = var10_5;
                    if (var9_3 != 0) {
                        var11_4 = this.Q(var10_5);
                        var12_6 = var10_5 + 1;
                        var10_5 = var11_4;
                        var11_4 = var12_6;
                        var12_6 = var10_5;
                    }
                    if (var12_6 < 48 || var12_6 > 57) break block20;
                    var18_7 = var12_6 - 48;
                    while (true) {
                        var13_8 = var11_4 + 1;
                        if ((var11_4 = (int)this.Q(var11_4)) < 48 || var11_4 > 57) break;
                        var18_7 = var18_7 * 10L + (long)(var11_4 - 48);
                        var11_4 = var13_8;
                    }
                    var10_5 = var11_4 == 46 ? 1 : 0;
                    if (var10_5 == 0) ** GOTO lbl45
                    var11_4 = var13_8 + 1;
                    var10_5 = this.Q(var13_8);
                    if (var10_5 >= 48 && var10_5 <= 57) {
                        var18_7 = var18_7 * 10L + (long)(var10_5 - 48);
                        var20_9 = 10L;
                        while (true) {
                            var10_5 = var11_4 + 1;
                            if ((var11_4 = (int)this.Q(var11_4)) < 48 || var11_4 > 57) break;
                            var18_7 = var18_7 * 10L + (long)(var11_4 - 48);
                            var20_9 *= 10L;
                            var11_4 = var10_5;
                        }
                        var13_8 = var10_5;
                    } else {
                        this.m = -1;
                        return 0.0;
lbl45:
                        // 1 sources

                        var20_9 = 1L;
                    }
                    var10_5 = var11_4 != 101 && var11_4 != 69 ? 0 : 1;
                    var22_10 = var18_7;
                    var24_11 = var20_9;
                    var17_12 = var8_2;
                    var15_13 = var9_3;
                    var12_6 = var13_8;
                    var16_14 = var10_5;
                    if (var10_5 == 0) break block21;
                    var14_15 = var13_8 + 1;
                    var17_12 = this.Q(var13_8);
                    if (var17_12 == 43) ** GOTO lbl-1000
                    var22_10 = var18_7;
                    var11_4 = var14_15;
                    var24_11 = var20_9;
                    var13_8 = var8_2;
                    var16_14 = var9_3;
                    var12_6 = var17_12;
                    var15_13 = var10_5;
                    if (var17_12 != 45) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var18_7 = var22_10;
                            var14_15 = var12_6;
                            var20_9 = var24_11;
                            var8_2 = var13_8;
                            var9_3 = var16_14;
                            var13_8 = var11_4;
                            var10_5 = var15_13;
                            break;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var11_4 = this.Q(var14_15);
                        var13_8 = var14_15 + 1;
                        var14_15 = var11_4;
                    }
                    var22_10 = var18_7;
                    var11_4 = var14_15;
                    var24_11 = var20_9;
                    var17_12 = var8_2;
                    var15_13 = var9_3;
                    var12_6 = var13_8;
                    var16_14 = var10_5;
                    if (var14_15 >= 48) {
                        var22_10 = var18_7;
                        var11_4 = var14_15;
                        var24_11 = var20_9;
                        var17_12 = var8_2;
                        var15_13 = var9_3;
                        var12_6 = var13_8;
                        var16_14 = var10_5;
                        if (var14_15 <= 57) {
                            var11_4 = var13_8 + 1;
                            var12_6 = this.Q(var13_8);
                            var22_10 = var18_7;
                            var24_11 = var20_9;
                            var13_8 = var8_2;
                            var16_14 = var9_3;
                            var15_13 = var10_5;
                            ** continue;
                        }
                    }
                }
                if (var17_12 != 0) {
                    if (var11_4 != 34) {
                        this.m = -1;
                        return 0.0;
                    }
                    var8_2 = var12_6 + 1;
                    var11_4 = this.Q(var12_6);
                    var10_5 = this.e + 1;
                    var9_3 = var8_2 - var10_5 - 2;
                } else {
                    var10_5 = this.e;
                    var9_3 = var12_6 - var10_5 - 1;
                    var8_2 = var12_6;
                }
                if (var16_14 == 0 && var9_3 < 18) {
                    var4_17 = var6_16 = (double)var22_10 / (double)var24_11;
                    if (var15_13 != 0) {
                        var4_17 = -var6_16;
                    }
                } else {
                    var4_17 = Double.parseDouble(this.r0(var10_5, var9_3));
                }
                if (var11_4 == var1_1) {
                    this.e = var8_2;
                    this.d = this.Q(var8_2);
                    this.m = 3;
                    this.a = 16;
                    return var4_17;
                }
                this.m = -1;
                return var4_17;
            }
            if (var12_6 != 110) break block22;
            var1_1 = (char)(var11_4 + 1);
            if (this.Q(var11_4) != 'u') break block22;
            var9_3 = var1_1 + '\u0001';
            if (this.Q(var1_1) != 'l') break block22;
            var1_1 = (char)(var9_3 + 1);
            if (this.Q(var9_3) != 'l') break block22;
            this.m = 5;
            var9_3 = var1_1 + '\u0001';
            var2_19 = var3_18 = this.Q(var1_1);
            var1_1 = (char)var9_3;
            if (var8_2 == 0) ** GOTO lbl148
            var2_19 = var3_18;
            var1_1 = (char)var9_3;
            if (var3_18 != '\"') ** GOTO lbl148
            var1_1 = (char)var9_3;
            do {
                var2_19 = this.Q(var1_1);
                var1_1 = (char)(var1_1 + 1);
lbl148:
                // 3 sources

                if (var2_19 == ',') {
                    this.e = var1_1;
                    this.d = this.Q(var1_1);
                    this.m = 5;
                    this.a = 16;
                    return 0.0;
                }
                if (var2_19 != ']') continue;
                this.e = var1_1;
                this.d = this.Q(var1_1);
                this.m = 5;
                this.a = 15;
                return 0.0;
            } while (com.github.catvod.spider.merge.B.f.V(var2_19));
            this.m = -1;
            return 0.0;
        }
        this.m = -1;
        return 0.0;
    }

    protected final void B0(char c2, char c3, char c4, char c5, char c6) {
        c3 = c4 = (char)((c6 - 48 + (c5 - 48) * 10) * 60 * 1000 + (c4 - 48 + (c3 - 48) * 10) * 3600 * 1000);
        if (c2 == '-') {
            c3 = -c4;
        }
        if (this.j.getTimeZone().getRawOffset() != c3) {
            this.j.setTimeZone(new SimpleTimeZone(c3, Integer.toString(c3)));
        }
    }

    @Override
    public final String C(p object) {
        int n2;
        if (this.q.startsWith("\"@type\":\"", this.e) && (n2 = this.q.indexOf(34, this.e + 9)) != -1) {
            int n3;
            this.e = n3 = this.e + 9;
            int n4 = 0;
            while (n3 < n2) {
                n4 = n4 * 31 + this.q.charAt(n3);
                ++n3;
            }
            n3 = this.e;
            object = ((p)object).a(this.q, n3, n2 - n3, n4);
            n4 = this.q.charAt(n2 + 1);
            if (n4 != 44 && n4 != 93) {
                return null;
            }
            this.e = n4 = n2 + 2;
            this.d = this.q.charAt(n4);
            return object;
        }
        return null;
    }

    @Override
    public final String J() {
        int n2;
        block3: {
            int n3;
            block2: {
                char c2 = this.Q(this.h + this.g - 1);
                n3 = this.g;
                if (c2 == 'L' || c2 == 'S' || c2 == 'B' || c2 == 'F') break block2;
                n2 = n3;
                if (c2 != 'D') break block3;
            }
            n2 = n3 - 1;
        }
        return this.r0(this.h, n2);
    }

    @Override
    public final String K() {
        if (!this.i) {
            return this.r0(this.h + 1, this.g);
        }
        return new String(this.f, 0, this.g);
    }

    @Override
    public final String N(int n2, int n3, int n4, p p2) {
        return p2.a(this.q, n2, n3, n4);
    }

    @Override
    protected final void O(int n2, char[] cArray, int n3) {
        this.q.getChars(n2, n3 + n2, cArray, 0);
    }

    @Override
    public final boolean P(char[] cArray) {
        return com.github.catvod.spider.merge.B.i.t0(this.q, this.e, cArray);
    }

    @Override
    public final char Q(int n2) {
        if (n2 >= this.r) {
            return '\u001a';
        }
        return this.q.charAt(n2);
    }

    @Override
    protected final void R(int n2, int n3, char[] cArray) {
        this.q.getChars(n2, n3 + n2, cArray, 0);
    }

    @Override
    public final int T(int n2) {
        return this.q.indexOf(34, n2);
    }

    @Override
    public final boolean U() {
        boolean bl;
        int n2 = this.e;
        int n3 = this.r;
        boolean bl2 = bl = true;
        if (n2 != n3) {
            bl2 = this.d == '\u001a' && n2 + 1 >= n3 ? bl : false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean c0(char[] var1_1) {
        block36: {
            block35: {
                block33: {
                    block34: {
                        block31: {
                            block32: {
                                block30: {
                                    this.m = 0;
                                    if (!com.github.catvod.spider.merge.B.i.t0(this.q, this.e, var1_1)) {
                                        this.m = -2;
                                        return false;
                                    }
                                    var7_2 = this.e;
                                    var3_3 = var1_1.length + var7_2;
                                    var6_4 = var3_3 + 1;
                                    var4_5 = this.Q(var3_3);
                                    var5_6 = var4_5 == 34;
                                    var3_3 = var6_4;
                                    if (var5_6) {
                                        var4_5 = this.Q(var6_4);
                                        var3_3 = var6_4 + 1;
                                    }
                                    if (var4_5 != 116) break block30;
                                    var4_5 = var3_3 + 1;
                                    if (this.Q(var3_3) != 'r') {
                                        this.m = -1;
                                        return false;
                                    }
                                    var3_3 = var4_5 + 1;
                                    if (this.Q(var4_5) != 'u') {
                                        this.m = -1;
                                        return false;
                                    }
                                    var4_5 = var3_3 + 1;
                                    if (this.Q(var3_3) != 'e') {
                                        this.m = -1;
                                        return false;
                                    }
                                    var3_3 = var4_5;
                                    if (var5_6) {
                                        if (this.Q(var4_5) != '\"') {
                                            this.m = -1;
                                            return false;
                                        }
                                        var3_3 = var4_5 + 1;
                                    }
                                    this.e = var3_3;
                                    var2_7 = this.Q(var3_3);
                                    break block31;
                                }
                                if (var4_5 != 102) break block32;
                                var4_5 = var3_3 + 1;
                                if (this.Q(var3_3) != 'a') {
                                    this.m = -1;
                                    return false;
                                }
                                var3_3 = var4_5 + 1;
                                if (this.Q(var4_5) != 'l') {
                                    this.m = -1;
                                    return false;
                                }
                                var4_5 = var3_3 + 1;
                                if (this.Q(var3_3) != 's') {
                                    this.m = -1;
                                    return false;
                                }
                                var3_3 = var4_5 + 1;
                                if (this.Q(var4_5) != 'e') {
                                    this.m = -1;
                                    return false;
                                }
                                var4_5 = var3_3;
                                if (var5_6) {
                                    var4_5 = var3_3 + 1;
                                    if (this.Q(var3_3) != '\"') {
                                        this.m = -1;
                                        return false;
                                    }
                                }
                                break block33;
                            }
                            if (var4_5 != 49) break block34;
                            var4_5 = var3_3;
                            if (var5_6) {
                                if (this.Q(var3_3) != '\"') {
                                    this.m = -1;
                                    return false;
                                }
                                var4_5 = var3_3 + 1;
                            }
                            this.e = var4_5;
                            var2_7 = this.Q(var4_5);
                        }
                        var8_8 = true;
                        break block35;
                    }
                    if (var4_5 == 48) {
                        var4_5 = var3_3;
                        if (var5_6) {
                            var4_5 = var3_3 + 1;
                            if (this.Q(var3_3) != '\"') {
                                this.m = -1;
                                return false;
                            } else {
                                ** GOTO lbl83
                            }
                        } else {
                            ** GOTO lbl83
                        }
                    }
                    break block36;
                }
                this.e = var4_5;
                var2_7 = this.Q(var4_5);
                var8_8 = false;
            }
            while (true) {
                block38: {
                    block37: {
                        if (var2_7 != ',') break block37;
                        this.e = var3_3 = this.e + 1;
                        this.d = this.Q(var3_3);
                        this.m = 3;
                        this.a = 16;
                        ** GOTO lbl117
                    }
                    if (var2_7 != '}') break block38;
                    do {
                        this.e = var3_3 = this.e + 1;
                        var2_7 = this.Q(var3_3);
                        if (var2_7 == ',') {
                            this.a = 16;
lbl102:
                            // 2 sources

                            while (true) {
                                this.e = var3_3 = this.e + 1;
                                this.d = this.Q(var3_3);
                                break;
                            }
                        } else {
                            if (var2_7 == ']') {
                                var3_3 = 15;
lbl108:
                                // 2 sources

                                while (true) {
                                    this.a = var3_3;
                                    ** continue;
                                    break;
                                }
                            }
                            if (var2_7 == '}') {
                                var3_3 = 13;
                                ** continue;
                            }
                            if (var2_7 != '\u001a') continue;
                            this.a = 20;
                        }
                        this.m = 4;
lbl117:
                        // 2 sources

                        return var8_8;
                    } while (com.github.catvod.spider.merge.B.f.V(var2_7));
                    this.m = -1;
                    return false;
                }
                if (!com.github.catvod.spider.merge.B.f.V(var2_7)) break;
                this.e = var3_3 = this.e + 1;
                var2_7 = this.Q(var3_3);
            }
            this.e = var7_2;
            this.Q(var7_2);
            this.m = -1;
            return false;
        }
        this.m = -1;
        return false;
    }

    @Override
    public final Date d0(char[] object) {
        char c2;
        int n2;
        block28: {
            block27: {
                int n3;
                block26: {
                    block23: {
                        block25: {
                            block24: {
                                block22: {
                                    block18: {
                                        long l2;
                                        long l3;
                                        boolean bl;
                                        block21: {
                                            block19: {
                                                int n4;
                                                int n5;
                                                block20: {
                                                    char c3;
                                                    block15: {
                                                        block16: {
                                                            block17: {
                                                                bl = false;
                                                                this.m = 0;
                                                                n2 = this.e;
                                                                c2 = this.d;
                                                                if (!com.github.catvod.spider.merge.B.i.t0(this.q, n2, object)) {
                                                                    this.m = -2;
                                                                    return null;
                                                                }
                                                                n3 = this.e + ((char[])object).length;
                                                                n5 = n3 + 1;
                                                                c3 = this.Q(n3);
                                                                if (c3 != '\"') break block15;
                                                                n3 = this.T(n5);
                                                                if (n3 == -1) break block16;
                                                                this.e = n5;
                                                                if (!this.y0(false, n3 - n5)) break block17;
                                                                object = this.j.getTime();
                                                                char c4 = this.Q(n3 + 1);
                                                                this.e = n2;
                                                                while (c4 != ',' && c4 != '}') {
                                                                    if (com.github.catvod.spider.merge.B.f.V(c4)) {
                                                                        c4 = this.Q(++n3 + 1);
                                                                        continue;
                                                                    }
                                                                    this.m = -1;
                                                                    return null;
                                                                }
                                                                this.e = n3 + 1;
                                                                this.d = c4;
                                                                n3 = c4;
                                                                break block18;
                                                            }
                                                            this.e = n2;
                                                            this.m = -1;
                                                            return null;
                                                        }
                                                        throw new d("unclosed str");
                                                    }
                                                    if (c3 != '-' && (c3 < '0' || c3 > '9')) {
                                                        this.m = -1;
                                                        return null;
                                                    }
                                                    n4 = n5;
                                                    n3 = c3;
                                                    if (c3 == '-') {
                                                        n3 = this.Q(n5);
                                                        n4 = n5 + 1;
                                                        bl = true;
                                                    }
                                                    if (n3 < 48 || n3 > 57) break block19;
                                                    l3 = n3 - 48;
                                                    while (true) {
                                                        n5 = n4 + 1;
                                                        if ((n4 = (int)this.Q(n4)) < 48 || n4 > 57) break;
                                                        l3 = l3 * 10L + (long)(n4 - 48);
                                                        n4 = n5;
                                                    }
                                                    if (n4 == 44) break block20;
                                                    n3 = n4;
                                                    l2 = l3;
                                                    if (n4 != 125) break block21;
                                                }
                                                this.e = n5 - 1;
                                                n3 = n4;
                                                l2 = l3;
                                                break block21;
                                            }
                                            l2 = 0L;
                                        }
                                        if (l2 < 0L) {
                                            this.m = -1;
                                            return null;
                                        }
                                        l3 = l2;
                                        if (bl) {
                                            l3 = -l2;
                                        }
                                        object = new Date(l3);
                                    }
                                    if (n3 == 44) {
                                        this.e = n3 = this.e + 1;
                                        this.d = this.Q(n3);
                                        this.m = 3;
                                        this.a = 16;
                                        return object;
                                    }
                                    this.e = n3 = this.e + 1;
                                    if ((n3 = (int)this.Q(n3)) != 44) break block22;
                                    this.a = 16;
                                    break block23;
                                }
                                if (n3 != 93) break block24;
                                n3 = 15;
                                break block25;
                            }
                            if (n3 != 125) break block26;
                            n3 = 13;
                        }
                        this.a = n3;
                    }
                    this.e = n3 = this.e + 1;
                    this.d = this.Q(n3);
                    break block27;
                }
                if (n3 != 26) break block28;
                this.a = 20;
            }
            this.m = 4;
            return object;
        }
        this.e = n2;
        this.d = c2;
        this.m = -1;
        return null;
    }

    @Override
    public final String f() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = 1;
        int n4 = 1;
        while (n2 < this.e) {
            int n5 = n3;
            if (this.q.charAt(n2) == '\n') {
                n5 = n3 + 1;
                n4 = 1;
            }
            ++n2;
            ++n4;
            n3 = n5;
        }
        stringBuilder.append("pos ");
        stringBuilder.append(this.e);
        stringBuilder.append(", line ");
        stringBuilder.append(n3);
        stringBuilder.append(", column ");
        stringBuilder.append(n4);
        String string = this.q.length() < 65535 ? this.q : this.q.substring(0, 65535);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long j(char var1_1) {
        block18: {
            block15: {
                block17: {
                    block16: {
                        var9_2 = 0;
                        this.m = 0;
                        var4_3 = this.e;
                        var7_4 = var4_3 + 1;
                        var5_5 = this.Q(var4_3);
                        var6_6 = var5_5 == 34;
                        var4_3 = var7_4;
                        if (var6_6) {
                            var5_5 = this.Q(var7_4);
                            var4_3 = var7_4 + 1;
                        }
                        var7_4 = var5_5 == 45 ? 1 : 0;
                        var8_7 = var5_5;
                        var5_5 = var4_3;
                        if (var7_4 != 0) {
                            var8_7 = this.Q(var4_3);
                            var5_5 = var4_3 + 1;
                        }
                        if (var8_7 < 48 || var8_7 > 57) break block15;
                        var10_8 = var8_7 - 48;
                        var4_3 = var5_5;
                        while (true) {
                            var5_5 = var4_3 + 1;
                            var3_9 = this.Q(var4_3);
                            if (var3_9 < '0' || var3_9 > '9') break;
                            var10_8 = var10_8 * 10L + (long)(var3_9 - 48);
                            var4_3 = var5_5;
                        }
                        if (var3_9 == '.') {
                            this.m = -1;
                            return 0L;
                        }
                        var4_3 = var5_5;
                        var2_11 = var3_9;
                        if (var6_6) {
                            if (var3_9 != '\"') {
                                this.m = -1;
                                return 0L;
                            }
                            var2_11 = this.Q(var5_5);
                            var4_3 = var5_5 + 1;
                        }
                        if (var10_8 >= 0L) break block16;
                        var5_5 = var9_2;
                        if (var10_8 != -9223372036854775808L) break block17;
                        var5_5 = var9_2;
                        if (var7_4 == 0) break block17;
                    }
                    var5_5 = 1;
                }
                if (var5_5 == 0) {
                    this.m = -1;
                    return 0L;
                }
                while (true) {
                    if (var2_11 == var1_1) {
                        this.e = var4_3;
                        this.d = this.Q(var4_3);
                        this.m = 3;
                        this.a = 16;
                        var12_13 = var10_8;
                        if (var7_4 != 0) {
                            var12_13 = -var10_8;
                        }
                        return var12_13;
                    }
                    if (!com.github.catvod.spider.merge.B.f.V(var2_11)) break;
                    var2_11 = this.Q(var4_3);
                    ++var4_3;
                }
                this.m = -1;
                return var10_8;
            }
            if (var8_7 != 110) break block18;
            var1_1 = (char)(var5_5 + 1);
            if (this.Q(var5_5) != 'u') break block18;
            var4_3 = var1_1 + '\u0001';
            if (this.Q(var1_1) != 'l') break block18;
            var1_1 = (char)(var4_3 + 1);
            if (this.Q(var4_3) != 'l') break block18;
            this.m = 5;
            var4_3 = var1_1 + '\u0001';
            var2_12 = var3_10 = this.Q(var1_1);
            var1_1 = (char)var4_3;
            if (!var6_6) ** GOTO lbl85
            var2_12 = var3_10;
            var1_1 = (char)var4_3;
            if (var3_10 != '\"') ** GOTO lbl85
            var1_1 = (char)var4_3;
            do {
                var2_12 = this.Q(var1_1);
                var1_1 = (char)(var1_1 + 1);
lbl85:
                // 3 sources

                if (var2_12 == ',') {
                    this.e = var1_1;
                    this.d = this.Q(var1_1);
                    this.m = 5;
                    this.a = 16;
                    return 0L;
                }
                if (var2_12 != ']') continue;
                this.e = var1_1;
                this.d = this.Q(var1_1);
                this.m = 5;
                this.a = 15;
                return 0L;
            } while (com.github.catvod.spider.merge.B.f.V(var2_12));
            this.m = -1;
            return 0L;
        }
        this.m = -1;
        return 0L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public final int j0(char[] cArray) {
        int n2;
        int n3;
        int n4;
        block20: {
            char c2;
            this.m = 0;
            int n5 = this.e;
            char c3 = this.d;
            if (!com.github.catvod.spider.merge.B.i.t0(this.q, n5, cArray)) {
                this.m = -2;
                return 0;
            }
            n4 = this.e + cArray.length;
            n3 = n4 + 1;
            int n6 = this.Q(n4);
            boolean bl = n6 == 34;
            n4 = n3;
            if (bl) {
                n6 = this.Q(n3);
                n4 = n3 + 1;
            }
            n3 = n6 == 45 ? 1 : 0;
            int n7 = n6;
            n6 = n4;
            if (n3 != 0) {
                n7 = this.Q(n4);
                n6 = n4 + 1;
            }
            if (n7 < 48 || n7 > 57) {
                this.m = -1;
                return 0;
            }
            n4 = n6;
            n6 = n7 -= 48;
            while (true) {
                n7 = n4 + 1;
                c2 = this.Q(n4);
                if (c2 < '0' || c2 > '9') break;
                n4 = n6 * 10;
                if (n4 < n6) {
                    this.m = -1;
                    return 0;
                }
                n6 = c2 - 48 + n4;
                n4 = n7;
            }
            if (c2 == '.') {
                this.m = -1;
                return 0;
            }
            if (n6 < 0) {
                this.m = -1;
                return 0;
            }
            n4 = n6;
            n2 = n3;
            int n8 = n7;
            char c4 = c2;
            boolean bl2 = true;
            while (true) {
                block19: {
                    block18: {
                        if (!bl2 || (bl2 = false)) break block18;
                        if (!bl) break block19;
                        n4 = n6;
                        if (c2 != '\"') {
                            this.m = -1;
                            return 0;
                        }
                    }
                    c4 = this.Q(n7);
                    n8 = n7 + 1;
                    n2 = n3;
                }
                if (c4 == ',' || c4 == '}') break;
                if (!com.github.catvod.spider.merge.B.f.V(c4)) {
                    this.m = -1;
                    return 0;
                }
                n3 = n2;
                n7 = n8;
            }
            n3 = n8 - 1;
            this.e = n3++;
            if (c4 == ',') {
                this.e = n3;
                this.d = this.Q(n3);
                this.m = 3;
                this.a = 16;
                n3 = n4;
                if (n2 == 0) return n3;
                return -n4;
            }
            if (c4 != '}') break block20;
            this.e = ++n3;
            c4 = this.Q(n3);
            while (true) {
                block27: {
                    block26: {
                        block25: {
                            block22: {
                                block24: {
                                    block23: {
                                        block21: {
                                            if (c4 != ',') break block21;
                                            this.a = 16;
                                            break block22;
                                        }
                                        if (c4 != ']') break block23;
                                        n3 = 15;
                                        break block24;
                                    }
                                    if (c4 != '}') break block25;
                                    n3 = 13;
                                }
                                this.a = n3;
                            }
                            this.e = n3 = this.e + 1;
                            this.d = this.Q(n3);
                            break block26;
                        }
                        if (c4 != '\u001a') break block27;
                        this.a = 20;
                    }
                    this.m = 4;
                    break;
                }
                if (!com.github.catvod.spider.merge.B.f.V(c4)) {
                    this.e = n5;
                    this.d = c3;
                    this.m = -1;
                    return 0;
                }
                this.e = n3 = this.e + 1;
                c4 = this.Q(n3);
            }
        }
        n3 = n4;
        if (n2 == 0) return n3;
        return -n4;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long l0(char[] var1_1) {
        this.m = 0;
        var9_2 = this.e;
        var4_3 = this.d;
        if (!com.github.catvod.spider.merge.B.i.t0(this.q, var9_2, var1_1)) {
            this.m = -2;
            return 0L;
        }
        var5_4 = this.e + var1_1.length;
        var7_5 = var5_4 + 1;
        var6_6 = this.Q(var5_4);
        var8_7 = var6_6 == 34;
        var5_4 = var7_5;
        if (var8_7) {
            var6_6 = this.Q(var7_5);
            var5_4 = var7_5 + 1;
        }
        if (var6_6 == 45) {
            var6_6 = this.Q(var5_4);
            var7_5 = 1;
            ++var5_4;
        } else {
            var7_5 = 0;
        }
        if (var6_6 >= 48 && var6_6 <= 57) {
            var10_8 = var6_6 - 48;
            while (true) {
                var6_6 = var5_4 + 1;
                var3_9 = this.Q(var5_4);
                if (var3_9 < '0' || var3_9 > '9') break;
                var10_8 = var10_8 * 10L + (long)(var3_9 - 48);
                var5_4 = var6_6;
            }
            if (var3_9 == '.') {
                this.m = -1;
                return 0L;
            }
            var2_10 = var3_9;
            var5_4 = var6_6;
            if (var8_7) {
                if (var3_9 != '\"') {
                    this.m = -1;
                    return 0L;
                }
                var2_10 = this.Q(var6_6);
                var5_4 = var6_6 + 1;
            }
            if (var2_10 == ',' || var2_10 == '}') {
                this.e = var5_4 - 1;
            }
            var6_6 = var10_8 < 0L && (var10_8 != -9223372036854775808L || var7_5 == 0) ? 0 : 1;
            if (var6_6 == 0) {
                this.e = var9_2;
                this.d = var4_3;
                this.m = -1;
                return 0L;
            }
            while (true) {
                if (var2_10 == ',') {
                    this.e = var5_4 = this.e + 1;
                    this.d = this.Q(var5_4);
                    this.m = 3;
                    this.a = 16;
                    var12_11 = var10_8;
                    if (var7_5 != 0) {
                        var12_11 = -var10_8;
                    }
                    return var12_11;
                }
                if (var2_10 == '}') {
                    do {
                        this.e = var5_4 = this.e + 1;
                        var2_10 = this.Q(var5_4);
                        if (var2_10 == ',') {
                            this.a = 16;
lbl65:
                            // 2 sources

                            while (true) {
                                this.e = var5_4 = this.e + 1;
                                this.d = this.Q(var5_4);
                                break;
                            }
                        } else {
                            if (var2_10 == ']') {
                                var5_4 = 15;
lbl71:
                                // 2 sources

                                while (true) {
                                    this.a = var5_4;
                                    ** continue;
                                    break;
                                }
                            }
                            if (var2_10 == '}') {
                                var5_4 = 13;
                                ** continue;
                            }
                            if (var2_10 != '\u001a') continue;
                            this.a = 20;
                        }
                        this.m = 4;
                        var12_12 = var10_8;
                        if (var7_5 != 0) {
                            var12_12 = -var10_8;
                        }
                        return var12_12;
                    } while (com.github.catvod.spider.merge.B.f.V(var2_10));
                    this.e = var9_2;
                    this.d = var4_3;
                    this.m = -1;
                    return 0L;
                }
                if (!com.github.catvod.spider.merge.B.f.V(var2_10)) break;
                this.e = var5_4;
                var2_10 = this.Q(var5_4);
                ++var5_4;
            }
            this.m = -1;
            return 0L;
        }
        this.e = var9_2;
        this.d = var4_3;
        this.m = -1;
        return 0L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final String m0(char[] object) {
        block15: {
            char c2;
            int n2;
            block24: {
                void var1_4;
                int n3;
                block18: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    block19: {
                                        block17: {
                                            int n4;
                                            int n5;
                                            char c3;
                                            int n6;
                                            block16: {
                                                this.m = 0;
                                                n2 = this.e;
                                                c2 = this.d;
                                                block0: while (!com.github.catvod.spider.merge.B.i.t0(this.q, this.e, object)) {
                                                    if (!com.github.catvod.spider.merge.B.f.V(this.d)) {
                                                        this.m = -2;
                                                        return this.n;
                                                    }
                                                    while (true) {
                                                        this.next();
                                                        if (!com.github.catvod.spider.merge.B.f.V(this.d)) continue block0;
                                                    }
                                                }
                                                n3 = this.e + ((char[])object).length;
                                                n6 = n3 + 1;
                                                c3 = this.Q(n3);
                                                n5 = 0;
                                                n3 = 0;
                                                n4 = n6;
                                                if (c3 == '\"') break block16;
                                                n5 = n6;
                                                while (com.github.catvod.spider.merge.B.f.V(c3)) {
                                                    ++n3;
                                                    c3 = this.Q(n5);
                                                    ++n5;
                                                }
                                                n4 = n5;
                                                n5 = n3;
                                                if (c3 != '\"') break block15;
                                            }
                                            if ((n6 = this.T(n4)) == -1) throw new d("unclosed str");
                                            String string = this.r0(n4, n6 - n4);
                                            n3 = n6;
                                            String string2 = string;
                                            if (string.indexOf(92) != -1) {
                                                n3 = n6;
                                                while (true) {
                                                    n4 = 0;
                                                    for (n6 = n3 - 1; n6 >= 0 && this.Q(n6) == '\\'; ++n4, --n6) {
                                                    }
                                                    if (n4 % 2 == 0) {
                                                        n6 = this.e;
                                                        n4 = n3 - (((char[])object).length + n6 + 1 + n5);
                                                        string2 = com.github.catvod.spider.merge.B.f.Z(this.s0(n6 + ((char[])object).length + 1 + n5, n4), n4);
                                                        break;
                                                    }
                                                    n3 = this.T(n3 + 1);
                                                }
                                            }
                                            n5 = n3;
                                            String string3 = string2;
                                            if ((this.c & com.github.catvod.spider.merge.B.c.y.a) != 0) {
                                                String string4 = string2.trim();
                                                n5 = n3;
                                            }
                                            while ((c3 = this.Q(++n5)) != ',' && c3 != '}') {
                                                if (com.github.catvod.spider.merge.B.f.V(c3)) {
                                                    continue;
                                                }
                                                break block15;
                                            }
                                            this.d = c3;
                                            this.e = n3 = n5 + 1;
                                            if (c3 != ',') break block17;
                                            this.d = this.Q(n3);
                                            n3 = 3;
                                            break block18;
                                        }
                                        if ((n3 = (int)this.Q(n3)) != 44) break block19;
                                        n3 = 16;
                                        break block20;
                                    }
                                    if (n3 != 93) break block21;
                                    n3 = 15;
                                    break block20;
                                }
                                if (n3 != 125) break block22;
                                n3 = 13;
                            }
                            this.a = n3;
                            this.e = n3 = this.e + 1;
                            this.d = this.Q(n3);
                            break block23;
                        }
                        if (n3 != 26) break block24;
                        this.a = 20;
                    }
                    n3 = 4;
                }
                this.m = n3;
                return var1_4;
            }
            this.e = n2;
            this.d = c2;
        }
        this.m = -1;
        return this.n;
    }

    @Override
    public final char next() {
        int n2;
        this.e = n2 = this.e + 1;
        char c2 = n2 >= this.r ? (char)'\u001a' : (char)this.q.charAt(n2);
        this.d = c2;
        return c2;
    }

    @Override
    public final String r0(int n2, int n3) {
        if (com.github.catvod.spider.merge.H.c.a) {
            char[] cArray = this.f;
            if (n3 < cArray.length) {
                this.q.getChars(n2, n2 + n3, cArray, 0);
                return new String(this.f, 0, n3);
            }
            cArray = new char[n3];
            this.q.getChars(n2, n3 + n2, cArray, 0);
            return new String(cArray);
        }
        return this.q.substring(n2, n3 + n2);
    }

    @Override
    public final BigDecimal s() {
        int n2;
        int n3;
        block6: {
            block5: {
                char c2 = this.Q(this.h + this.g - 1);
                n3 = this.g;
                if (c2 == 'L' || c2 == 'S' || c2 == 'B' || c2 == 'F') break block5;
                n2 = n3;
                if (c2 != 'D') break block6;
            }
            n2 = n3 - 1;
        }
        if (n2 <= 65535) {
            n3 = this.h;
            char[] cArray = this.f;
            if (n2 < cArray.length) {
                this.q.getChars(n3, n3 + n2, cArray, 0);
                return new BigDecimal(this.f, 0, n2, MathContext.UNLIMITED);
            }
            cArray = new char[n2];
            this.q.getChars(n3, n3 + n2, cArray, 0);
            return new BigDecimal(cArray, 0, n2, MathContext.UNLIMITED);
        }
        throw new d("decimal overflow");
    }

    @Override
    public final char[] s0(int n2, int n3) {
        char[] cArray;
        if (com.github.catvod.spider.merge.H.c.a && n3 < (cArray = this.f).length) {
            this.q.getChars(n2, n3 + n2, cArray, 0);
            return this.f;
        }
        cArray = new char[n3];
        this.q.getChars(n2, n3 + n2, cArray, 0);
        return cArray;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    @Override
    public final int u(char c2) {
        i i2;
        int n2;
        block18: {
            boolean bl;
            int n3;
            int n4;
            block16: {
                block17: {
                    int n5;
                    boolean bl2;
                    block15: {
                        char c3;
                        this.m = 0;
                        int n6 = this.e;
                        n4 = n6 + 1;
                        n2 = this.Q(n6);
                        while (com.github.catvod.spider.merge.B.f.V((char)n2)) {
                            n2 = this.Q(n4);
                            ++n4;
                        }
                        bl2 = n2 == 34;
                        n3 = n4;
                        n5 = n2;
                        if (bl2) {
                            n5 = this.Q(n4);
                            n3 = n4 + 1;
                        }
                        bl = n5 == 45;
                        n4 = n3;
                        if (bl) {
                            n5 = this.Q(n3);
                            n4 = n3 + 1;
                        }
                        if (n5 < 48 || n5 > 57) break block15;
                        n3 = n5 - 48;
                        while (true) {
                            n5 = n4 + 1;
                            c3 = this.Q(n4);
                            if (c3 < '0' || c3 > '9') break;
                            n4 = n3 * 10;
                            if (n4 < n3) {
                                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("parseInt error : ");
                                stringBuilder.append(this.r0(n6, n5 - 1));
                                throw new d(stringBuilder.toString());
                            }
                            n3 = c3 - 48 + n4;
                            n4 = n5;
                        }
                        if (c3 == '.') {
                            this.m = -1;
                            return 0;
                        }
                        n2 = c3;
                        n4 = n5;
                        if (bl2) {
                            if (c3 != '\"') {
                                this.m = -1;
                                return 0;
                            }
                            n2 = this.Q(n5);
                            n4 = n5 + 1;
                        }
                        if (n3 < 0) {
                            this.m = -1;
                            return 0;
                        }
                        break block16;
                    }
                    if (n5 != 110) break block17;
                    c2 = (char)(n4 + 1);
                    if (this.Q(n4) != 'u') break block17;
                    n4 = c2 + '\u0001';
                    if (this.Q(c2) != 'l') break block17;
                    n3 = n4 + 1;
                    if (this.Q(n4) != 'l') break block17;
                    this.m = 5;
                    c2 = (char)(n3 + 1);
                    n2 = this.Q(n3);
                    if (!bl2 || n2 != 34) break block18;
                    i2 = this;
                    n2 = i2.Q(c2);
                    c2 = (char)(c2 + 1);
                }
                this.m = -1;
                return 0;
            }
            while (true) {
                if (n2 == c2) {
                    this.e = n4;
                    this.d = this.Q(n4);
                    this.m = 3;
                    this.a = 16;
                    c2 = (char)n3;
                    if (!bl) return c2;
                    return (char)(-n3);
                }
                if (!com.github.catvod.spider.merge.B.f.V((char)n2)) break;
                n2 = this.Q(n4);
                ++n4;
            }
            this.m = -1;
            c2 = (char)n3;
            if (!bl) return c2;
            return (char)(-n3);
        }
        i2 = this;
        while (true) {
            if (n2 == 44) {
                i2.e = c2;
                i2.d = i2.Q(c2);
                i2.m = 5;
                i2.a = 16;
                return 0;
            }
            if (n2 == 93) {
                i2.e = c2;
                i2.d = i2.Q(c2);
                i2.m = 5;
                i2.a = 15;
                return 0;
            }
            if (!com.github.catvod.spider.merge.B.f.V((char)n2)) {
                i2.m = -1;
                return 0;
            }
            n2 = i2.Q(c2);
            c2 = (char)(c2 + 1);
        }
    }

    public final boolean w0() {
        return this.x0(true);
    }

    public final boolean x0(boolean bl) {
        return this.y0(bl, this.r - this.e);
    }
}

