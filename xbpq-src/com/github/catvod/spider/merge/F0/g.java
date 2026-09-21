/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.F0.f;
import com.github.catvod.spider.merge.F0.j;
import java.io.Serializable;
import java.math.BigInteger;

public final class g {
    private Serializable a;
    private int b;
    private j c;

    g(j j2) {
        this.c = j2;
    }

    /*
     * Unable to fully structure code
     */
    private int a(boolean var1_1, boolean var2_2) {
        block24: {
            if (var2_2) {
                var5_3 = this.c;
                --var5_3.h;
            }
            this.b = var4_5 = this.c.b(var1_1);
            var3_6 = 0;
            switch (var4_5) {
                default: {
                    break block24;
                }
                case 11: {
                    var5_3 = new c();
                    if (this.a(false, false) == 4) ** GOTO lbl26
                    do {
                        var5_3.add(this.c());
                        if (this.b == 12) ** GOTO lbl25
                        if (this.a(false, false) == 4) ** GOTO lbl26
                        if (this.b != 1) ** GOTO lbl20
                    } while (this.a(false, false) != 4);
                    throw this.c.f(null, "Trailing comma found in array", true);
lbl20:
                    // 1 sources

                    var6_7 = this.c;
                    var5_3 = com.github.catvod.spider.merge.C.a.c("Expected a comma or end of the array instead of ");
                    var5_3.append(this.b);
                    throw var6_7.f(null, var5_3.toString(), true);
lbl25:
                    // 1 sources

                    throw this.c.f(null, "Semi-string is not allowed in array", true);
lbl26:
                    // 2 sources

                    this.a = var5_3;
                    this.b = 11;
                    return 11;
                }
                case 10: {
                    var5_3 = new e();
                    if (this.a(true, false) == 3) ** GOTO lbl70
                    do {
                        if ((var3_6 = this.b) != 5 && var3_6 != 6 && var3_6 != 7) {
                            if (var3_6 != 8 && var3_6 != 12) {
                                var5_3 = this.c;
                                var6_8 = com.github.catvod.spider.merge.C.a.c("Expected STRING, got ");
                                var6_8.append(this.b);
                                throw var5_3.f(null, var6_8.toString(), true);
                            }
                        } else {
                            this.a = this.a.toString();
                        }
                        var6_8 = (String)this.a;
                        if (this.b != 12) ** GOTO lbl51
                        if (this.a(false, true) != 2) {
                            var5_3 = this.c;
                            var6_8 = com.github.catvod.spider.merge.C.a.c("Expected COLON, got ");
                            var6_8.append(this.b);
                            throw var5_3.f(null, var6_8.toString(), true);
                        }
                        ** GOTO lbl52
lbl51:
                        // 1 sources

                        if (this.a(false, false) != 2) ** GOTO lbl65
lbl52:
                        // 2 sources

                        this.a(false, false);
                        var5_3.put(var6_8, this.c());
                        if (this.a(false, false) == 3) ** GOTO lbl70
                        if (this.b != 1) ** GOTO lbl60
                    } while (this.a(true, false) != 3);
                    throw this.c.f(null, "Trailing object found in array", true);
lbl60:
                    // 1 sources

                    var5_3 = this.c;
                    var6_8 = com.github.catvod.spider.merge.C.a.c("Expected a comma or end of the object instead of ");
                    var6_8.append(this.b);
                    throw var5_3.f(null, var6_8.toString(), true);
lbl65:
                    // 1 sources

                    var5_3 = this.c;
                    var6_8 = com.github.catvod.spider.merge.C.a.c("Expected COLON, got ");
                    var6_8.append(this.b);
                    throw var5_3.f(null, var6_8.toString(), true);
lbl70:
                    // 2 sources

                    this.a = var5_3;
                    this.b = 10;
                    return 10;
                }
                case 9: {
                    var6_9 = this.c.l.toString();
                    try {
                        if (!this.c.m) ** GOTO lbl79
                        var5_3 = Double.parseDouble(var6_9);
                        ** GOTO lbl116
lbl79:
                        // 1 sources

                        if (var6_9.length() != 1) ** GOTO lbl82
                        var5_3 = var6_9.charAt(0) - 48;
                        ** GOTO lbl116
lbl82:
                        // 1 sources

                        if (var6_9.length() != 2 || var6_9.charAt(0) != '-') ** GOTO lbl85
                        var5_3 = 48 - var6_9.charAt(1);
                        ** GOTO lbl116
lbl85:
                        // 1 sources

                        if (var6_9.charAt(0) == '-') {
                            var3_6 = 1;
                        }
                        if (var3_6 == 0) ** GOTO lbl93
                    }
                    catch (NumberFormatException var5_4) {
                        throw this.c.f(var5_4, com.github.catvod.spider.merge.B.e.c("Malformed number: ", var6_9), true);
                    }
                    var4_5 = var6_9.length() - 1;
                    ** GOTO lbl94
lbl93:
                    // 1 sources

                    var4_5 = var6_9.length();
lbl94:
                    // 2 sources

                    if (var4_5 < 10) ** GOTO lbl106
                    if (var4_5 != 10) ** GOTO lbl98
                    if (var6_9.charAt(var3_6) < '2') ** GOTO lbl106
lbl98:
                    // 2 sources

                    if (var4_5 < 19) ** GOTO lbl-1000
                    if (var4_5 != 19) ** GOTO lbl-1000
                    if (var6_9.charAt(var3_6) >= '9') lbl-1000:
                    // 2 sources

                    {
                        var5_3 = new BigInteger(var6_9);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_3 = Long.parseLong(var6_9);
                    }
                    ** GOTO lbl116
lbl106:
                    // 2 sources

                    var5_3 = Integer.parseInt(var6_9);
                    ** GOTO lbl116
                }
                case 8: 
                case 12: {
                    var5_3 = this.c.l.toString();
                    ** GOTO lbl116
                }
                case 7: {
                    var5_3 = Boolean.FALSE;
                    ** GOTO lbl116
                }
                case 6: {
                    var5_3 = Boolean.TRUE;
lbl116:
                    // 9 sources

                    this.a = var5_3;
                    break block24;
                }
                case 5: 
            }
            this.a = null;
        }
        return this.b;
    }

    public static f<c> b() {
        return new f<c>(c.class);
    }

    private Object c() {
        if (this.b >= 5) {
            return this.a;
        }
        j j2 = this.c;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("Expected JSON value, got ");
        stringBuilder.append(this.b);
        throw j2.f(null, stringBuilder.toString(), true);
    }

    public static f<e> d() {
        return new f<e>(e.class);
    }

    final <T> T e(Class<T> serializable) {
        this.a(false, false);
        Object object = this.c();
        if (this.a(false, false) == 0) {
            if (!(serializable == Object.class || object != null && ((Class)serializable).isAssignableFrom(object.getClass()))) {
                object = this.c;
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("JSON did not contain the correct type, expected ");
                stringBuilder.append(((Class)serializable).getSimpleName());
                stringBuilder.append(".");
                throw ((j)object).f(null, stringBuilder.toString(), true);
            }
            return ((Class)serializable).cast(object);
        }
        object = this.c;
        serializable = com.github.catvod.spider.merge.C.a.c("Expected end of input, got ");
        ((StringBuilder)serializable).append(this.b);
        throw ((j)object).f(null, ((StringBuilder)serializable).toString(), true);
    }
}

