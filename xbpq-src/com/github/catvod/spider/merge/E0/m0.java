/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.E0.A;
import com.github.catvod.spider.merge.E0.B0;
import com.github.catvod.spider.merge.E0.D0;
import com.github.catvod.spider.merge.E0.E;
import com.github.catvod.spider.merge.E0.E0;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.J;
import com.github.catvod.spider.merge.E0.L;
import com.github.catvod.spider.merge.E0.L0;
import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.P0;
import com.github.catvod.spider.merge.E0.U;
import com.github.catvod.spider.merge.E0.X;
import com.github.catvod.spider.merge.E0.d0;
import com.github.catvod.spider.merge.E0.e;
import com.github.catvod.spider.merge.E0.f;
import com.github.catvod.spider.merge.E0.g;
import com.github.catvod.spider.merge.E0.g0;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.n;
import com.github.catvod.spider.merge.E0.o0;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.E0.r;
import com.github.catvod.spider.merge.E0.r0;
import com.github.catvod.spider.merge.E0.t0;
import com.github.catvod.spider.merge.E0.u;
import com.github.catvod.spider.merge.E0.u0;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.E0.v0;
import com.github.catvod.spider.merge.y.z;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class m0<T>
implements u0<T> {
    private static final int[] q = new int[0];
    private static final Unsafe r = L0.s();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final j0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final o0 l;
    private final U m;
    private final D0<?, ?> n;
    private final v<?> o;
    private final d0 p;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private m0(int[] nArray, Object[] objectArray, int n2, int n3, j0 j02, int[] nArray2, int n4, int n5, o0 o02, U u2, D0 d02, v v2, d0 d03) {
        this.a = nArray;
        this.b = objectArray;
        this.c = n2;
        this.d = n3;
        this.g = j02 instanceof I;
        boolean bl = v2 != null && v2.d(j02);
        this.f = bl;
        this.h = false;
        this.i = nArray2;
        this.j = n4;
        this.k = n5;
        this.l = o02;
        this.m = u2;
        this.n = d02;
        this.o = v2;
        this.e = j02;
        this.p = d03;
    }

    private static <T> double A(T t2, long l2) {
        return (Double)L0.r(t2, l2);
    }

    private static <T> float B(T t2, long l2) {
        return ((Float)L0.r(t2, l2)).floatValue();
    }

    private static <T> int C(T t2, long l2) {
        return (Integer)L0.r(t2, l2);
    }

    private static <T> long D(T t2, long l2) {
        return (Long)L0.r(t2, l2);
    }

    private <K, V> int E(T t2, byte[] byArray, int n2, int n3, int n4, long l2, e e2) {
        Object object;
        Unsafe unsafe = r;
        Object object2 = this.l(n4);
        Object object3 = object = unsafe.getObject(t2, l2);
        if (this.p.e(object)) {
            object3 = this.p.b();
            this.p.a(object3, object);
            unsafe.putObject(t2, l2, object3);
        }
        this.p.g(object2);
        this.p.d(object3);
        n2 = com.github.catvod.spider.merge.E0.f.u(byArray, n2, e2);
        n4 = e2.a;
        if (n4 >= 0 && n4 <= n3 - n2) {
            throw null;
        }
        throw O.g();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int G(T var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, long var10_10, int var12_11, e var13_12) {
        block19: {
            block20: {
                block21: {
                    var19_13 = m0.r;
                    var16_14 = this.a[var12_11 + 2] & 1048575;
                    switch (var9_9) {
                        default: {
                            break block19;
                        }
                        case 68: {
                            if (var7_7 != 3) break block19;
                            var19_13 = this.w(var1_1, var6_6, var12_11);
                            var3_3 = com.github.catvod.spider.merge.E0.f.x(var19_13, this.m(var12_11), var2_2 /* !! */ , var3_3, var4_4, var5_5 & -8 | 4, var13_12);
                            var2_2 /* !! */  = (byte[])var19_13;
                            ** GOTO lbl43
                        }
                        case 67: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var3_3, var13_12);
                            var14_15 = com.github.catvod.spider.merge.E0.q.b(var13_12.b);
                            ** GOTO lbl81
                        }
                        case 66: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var3_3, var13_12);
                            var4_4 = com.github.catvod.spider.merge.E0.q.a(var13_12.a);
                            ** GOTO lbl75
                        }
                        case 63: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var3_3, var13_12);
                            var4_4 = var13_12.a;
                            var2_2 /* !! */  = (byte[])this.k(var12_11);
                            if (var2_2 /* !! */  != null && !var2_2 /* !! */ .a()) {
                                m0.n(var1_1).h(var5_5, var4_4);
                            } else {
                                var19_13.putObject(var1_1, var10_10, var4_4);
                                var19_13.putInt(var1_1, var16_14, var6_6);
                            }
                            break block19;
                        }
                        case 61: {
                            if (var7_7 != 2) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.b(var2_2 /* !! */ , var3_3, var13_12);
                            var2_2 /* !! */  = (byte[])var13_12.c;
                            ** GOTO lbl82
                        }
                        case 60: {
                            if (var7_7 != 2) break block19;
                            var19_13 = this.w(var1_1, var6_6, var12_11);
                            var3_3 = com.github.catvod.spider.merge.E0.f.y(var19_13, this.m(var12_11), var2_2 /* !! */ , var3_3, var4_4, var13_12);
                            var2_2 /* !! */  = (byte[])var19_13;
lbl43:
                            // 2 sources

                            this.O(var1_1, var6_6, var12_11, var2_2 /* !! */ );
                            break block19;
                        }
                        case 59: {
                            if (var7_7 != 2) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var3_3, var13_12);
                            var4_4 = var13_12.a;
                            if (var4_4 != 0) ** GOTO lbl52
                            var2_2 /* !! */  = (byte[])"";
                            ** GOTO lbl82
lbl52:
                            // 1 sources

                            if ((var8_8 & 0x20000000) != 0 && !P0.e(var2_2 /* !! */ , var3_3, var3_3 + var4_4)) {
                                throw O.b();
                            }
                            var19_13.putObject(var1_1, var10_10, new String(var2_2 /* !! */ , var3_3, var4_4, N.a));
                            var3_3 += var4_4;
                            break block20;
                        }
                        case 58: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var3_3, var13_12);
                            var18_16 = var13_12.b != 0L;
                            var2_2 /* !! */  = (byte[])var18_16;
                            ** GOTO lbl82
                        }
                        case 57: 
                        case 64: {
                            if (var7_7 != 5) break block19;
                            var2_2 /* !! */  = (byte[])com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var3_3);
                            ** GOTO lbl87
                        }
                        case 56: 
                        case 65: {
                            if (var7_7 != 1) break block19;
                            var2_2 /* !! */  = (byte[])com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var3_3);
                            break block21;
                        }
                        case 55: 
                        case 62: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var3_3, var13_12);
                            var4_4 = var13_12.a;
lbl75:
                            // 2 sources

                            var2_2 /* !! */  = (byte[])var4_4;
                            ** GOTO lbl82
                        }
                        case 53: 
                        case 54: {
                            if (var7_7 != 0) break block19;
                            var3_3 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var3_3, var13_12);
                            var14_15 = var13_12.b;
lbl81:
                            // 2 sources

                            var2_2 /* !! */  = (byte[])var14_15;
lbl82:
                            // 5 sources

                            var19_13.putObject(var1_1, var10_10, var2_2 /* !! */ );
                            break block20;
                        }
                        case 52: {
                            if (var7_7 != 5) break block19;
                            var2_2 /* !! */  = (byte[])Float.valueOf(Float.intBitsToFloat(com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var3_3)));
lbl87:
                            // 2 sources

                            var19_13.putObject(var1_1, var10_10, var2_2 /* !! */ );
                            var3_3 += 4;
                            break block20;
                        }
                        case 51: 
                    }
                    if (var7_7 != 1) break block19;
                    var2_2 /* !! */  = (byte[])Double.longBitsToDouble(com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var3_3));
                }
                var19_13.putObject(var1_1, var10_10, var2_2 /* !! */ );
                var3_3 += 8;
            }
            var19_13.putInt(var1_1, var16_14, var6_6);
        }
        return var3_3;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int H(T var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, long var9_9, int var11_10, long var12_11, e var14_12) {
        var19_13 /* !! */  = var2_2 /* !! */ ;
        var15_14 = var3_3;
        var16_15 = var5_5;
        var21_16 = m0.r;
        var20_17 = (M<Integer>)var21_16.getObject(var1_1 /* !! */ , var12_11);
        var18_18 = var20_17;
        if (!var20_17.h()) {
            var18_18 = var20_17.e(var20_17.size() * 2);
            var21_16.putObject(var1_1 /* !! */ , var12_11, var18_18);
        }
        switch (var11_10) {
            default: {
                var11_10 = var15_14;
                return var11_10;
            }
            case 49: {
                var11_10 = var15_14;
                if (var7_7 != 3) return var11_10;
                var1_1 /* !! */  = this.m(var8_8);
                var5_5 = var16_15 & -8 | 4;
                var3_3 = com.github.catvod.spider.merge.E0.f.e((u0)var1_1 /* !! */ , var2_2 /* !! */ , var3_3, var4_4, var5_5, var14_12);
                while (true) {
                    var18_18.add((Integer)var14_12.c);
                    var11_10 = var3_3;
                    if (var3_3 >= var4_4) return var11_10;
                    var6_6 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var3_3, var14_12);
                    if (var16_15 != var14_12.a) {
                        var11_10 = var3_3;
                        return var11_10;
                    }
                    var3_3 = com.github.catvod.spider.merge.E0.f.e(var1_1 /* !! */ , var2_2 /* !! */ , var6_6, var4_4, var5_5, var14_12);
                }
            }
            case 34: 
            case 48: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.n(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 0) return var11_10;
                var1_1 /* !! */  = (X)var18_18;
                do {
                    var5_5 = com.github.catvod.spider.merge.E0.f.w(var19_13 /* !! */ , var15_14, var14_12);
                    var1_1 /* !! */ .c(com.github.catvod.spider.merge.E0.q.b(var14_12.b));
                    var3_3 = var5_5;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                } while (var16_15 == var14_12.a);
                return var5_5;
            }
            case 33: 
            case 47: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.m(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 0) return var11_10;
                var1_1 /* !! */  = (J)var18_18;
                do {
                    var5_5 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var15_14, var14_12);
                    var1_1 /* !! */ .c(com.github.catvod.spider.merge.E0.q.a(var14_12.a));
                    var3_3 = var5_5;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                } while (var16_15 == var14_12.a);
                return var5_5;
            }
            case 30: 
            case 44: {
                if (var7_7 == 2) {
                    var3_3 = com.github.catvod.spider.merge.E0.f.o(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                } else {
                    var11_10 = var15_14;
                    if (var7_7 != 0) return var11_10;
                    var3_3 = com.github.catvod.spider.merge.E0.f.v(var5_5, var2_2 /* !! */ , var3_3, var4_4, var18_18, var14_12);
                }
                v0.a(var1_1 /* !! */ , var6_6, var18_18, this.k(var8_8), null, this.n);
                return var3_3;
            }
            case 28: {
                var11_10 = var15_14;
                if (var7_7 != 2) return var11_10;
                var6_6 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var15_14, var14_12);
                var7_7 = var14_12.a;
                if (var7_7 < 0) throw O.c();
                if (var7_7 > var19_13 /* !! */ .length - var6_6) throw O.g();
                var5_5 = var6_6;
                var3_3 = var7_7;
                var1_1 /* !! */  = var18_18;
                if (var7_7 != 0) ** GOTO lbl83
                var5_5 = var6_6;
                var2_2 /* !! */  = (byte[])var18_18;
                ** GOTO lbl103
lbl83:
                // 1 sources

                block19: while (true) {
                    var1_1 /* !! */ .add((n)com.github.catvod.spider.merge.E0.n.d(var19_13 /* !! */ , var5_5, var3_3));
                    var5_5 += var3_3;
                    var2_2 /* !! */  = var1_1 /* !! */ ;
                    while (true) {
                        var3_3 = var5_5;
                        if (var5_5 >= var4_4) return var3_3;
                        var3_3 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                        if (var16_15 != var14_12.a) {
                            return var5_5;
                        }
                        var6_6 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var3_3, var14_12);
                        var7_7 = var14_12.a;
                        if (var7_7 < 0) throw O.c();
                        if (var7_7 > var19_13 /* !! */ .length - var6_6) throw O.g();
                        var5_5 = var6_6;
                        var3_3 = var7_7;
                        var1_1 /* !! */  = (T)var2_2 /* !! */ ;
                        if (var7_7 != 0) continue block19;
                        var5_5 = var6_6;
lbl103:
                        // 2 sources

                        var2_2 /* !! */ .add(com.github.catvod.spider.merge.E0.n.b);
                    }
                    break;
                }
            }
            case 27: {
                var11_10 = var15_14;
                if (var7_7 != 2) return var11_10;
                return com.github.catvod.spider.merge.E0.f.g(this.m(var8_8), var5_5, var2_2 /* !! */ , var3_3, var4_4, var18_18, var14_12);
            }
            case 26: {
                var11_10 = var15_14;
                if (var7_7 != 2) return var11_10;
                var1_1 /* !! */  = "";
                if ((var9_9 & 0x20000000L) != 0L) ** GOTO lbl144
                var5_5 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var15_14, var14_12);
                var3_3 = var14_12.a;
                if (var3_3 < 0) throw O.c();
                if (var3_3 != 0) ** GOTO lbl121
                var3_3 = var5_5;
                ** GOTO lbl137
lbl121:
                // 1 sources

                var1_1 /* !! */  = new String(var19_13 /* !! */ , var5_5, var3_3, N.a);
                while (true) {
                    var18_18.add((Integer)var1_1 /* !! */ );
                    var3_3 = var5_5 + var3_3;
                    while (true) {
                        var11_10 = var3_3;
                        if (var3_3 >= var4_4) return var11_10;
                        var5_5 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var3_3, var14_12);
                        if (var16_15 != var14_12.a) {
                            var11_10 = var3_3;
                            return var11_10;
                        }
                        var3_3 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                        var6_6 = var14_12.a;
                        if (var6_6 < 0) throw O.c();
                        if (var6_6 != 0) break;
lbl137:
                        // 2 sources

                        var18_18.add((Integer)"");
                    }
                    var1_1 /* !! */  = new String(var19_13 /* !! */ , var3_3, var6_6, N.a);
                    var5_5 = var3_3;
                    var3_3 = var6_6;
                }
lbl144:
                // 1 sources

                var6_6 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var15_14, var14_12);
                var5_5 = var14_12.a;
                if (var5_5 < 0) throw O.c();
                if (var5_5 != 0) ** GOTO lbl152
                var2_2 /* !! */  = (byte[])"";
                var1_1 /* !! */  = (T)var19_13 /* !! */ ;
                var5_5 = var16_15;
                ** GOTO lbl172
lbl152:
                // 1 sources

                var3_3 = var6_6 + var5_5;
                if (P0.e(var19_13 /* !! */ , var6_6, var3_3) == false) throw O.b();
                var2_2 /* !! */  = (byte[])new String(var19_13 /* !! */ , var6_6, var5_5, N.a);
                while (true) {
                    var18_18.add((Integer)var2_2 /* !! */ );
                    var5_5 = var16_15;
                    var2_2 /* !! */  = (byte[])var1_1 /* !! */ ;
                    var1_1 /* !! */  = (T)var19_13 /* !! */ ;
                    var6_6 = var3_3;
                    while (true) {
                        var3_3 = var6_6;
                        if (var6_6 >= var4_4) return var3_3;
                        var3_3 = com.github.catvod.spider.merge.E0.f.u(var1_1 /* !! */ , var6_6, var14_12);
                        if (var5_5 != var14_12.a) {
                            return var6_6;
                        }
                        var6_6 = com.github.catvod.spider.merge.E0.f.u(var1_1 /* !! */ , var3_3, var14_12);
                        var7_7 = var14_12.a;
                        if (var7_7 < 0) throw O.c();
                        if (var7_7 != 0) break;
lbl172:
                        // 2 sources

                        var18_18.add((Integer)var2_2 /* !! */ );
                    }
                    var3_3 = var6_6 + var7_7;
                    if (P0.e(var1_1 /* !! */ , var6_6, var3_3) == false) throw O.b();
                    var20_17 = new String((byte[])var1_1 /* !! */ , var6_6, var7_7, N.a);
                    var19_13 /* !! */  = (byte[])var1_1 /* !! */ ;
                    var1_1 /* !! */  = (T)var2_2 /* !! */ ;
                    var16_15 = var5_5;
                    var2_2 /* !! */  = (byte[])var20_17;
                }
            }
            case 25: 
            case 42: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.h(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 0) return var11_10;
                var1_1 /* !! */  = (g)var18_18;
                var3_3 = var5_5 = com.github.catvod.spider.merge.E0.f.w(var19_13 /* !! */ , var15_14, var14_12);
                if (var14_12.b != 0L) ** GOTO lbl203
                block25: while (true) {
                    var17_19 = false;
                    var5_5 = var3_3;
                    while (true) {
                        var1_1 /* !! */ .c(var17_19);
                        var3_3 = var5_5;
                        if (var5_5 >= var4_4) return var3_3;
                        var3_3 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                        if (var16_15 != var14_12.a) {
                            return var5_5;
                        }
                        var3_3 = var5_5 = com.github.catvod.spider.merge.E0.f.w(var19_13 /* !! */ , var3_3, var14_12);
                        if (var14_12.b == 0L) continue block25;
lbl203:
                        // 2 sources

                        var17_19 = true;
                    }
                    break;
                }
            }
            case 24: 
            case 31: 
            case 41: 
            case 45: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.j(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 5) return var11_10;
                var1_1 /* !! */  = (J)var18_18;
                var3_3 = com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var3_3);
                while (true) {
                    var1_1 /* !! */ .c(var3_3);
                    var3_3 = var5_5 = var15_14 + 4;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                    if (var16_15 != var14_12.a) {
                        return var5_5;
                    }
                    var3_3 = com.github.catvod.spider.merge.E0.f.c(var19_13 /* !! */ , var15_14);
                }
            }
            case 23: 
            case 32: 
            case 40: 
            case 46: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.k(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 1) return var11_10;
                var1_1 /* !! */  = (X)var18_18;
                var9_9 = com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var3_3);
                while (true) {
                    var1_1 /* !! */ .c(var9_9);
                    var3_3 = var5_5 = var15_14 + 8;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                    if (var16_15 != var14_12.a) {
                        return var5_5;
                    }
                    var9_9 = com.github.catvod.spider.merge.E0.f.d(var19_13 /* !! */ , var15_14);
                }
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.o(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 0) return var11_10;
                return com.github.catvod.spider.merge.E0.f.v(var5_5, var2_2 /* !! */ , var3_3, var4_4, var18_18, var14_12);
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.p(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 0) return var11_10;
                var1_1 /* !! */  = (X)var18_18;
                do {
                    var5_5 = com.github.catvod.spider.merge.E0.f.w(var19_13 /* !! */ , var15_14, var14_12);
                    var1_1 /* !! */ .c(var14_12.b);
                    var3_3 = var5_5;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                } while (var16_15 == var14_12.a);
                return var5_5;
            }
            case 19: 
            case 36: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.l(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 5) return var11_10;
                var1_1 /* !! */  = (A)var18_18;
                var3_3 = com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var3_3);
                while (true) {
                    var1_1 /* !! */ .c(Float.intBitsToFloat(var3_3));
                    var3_3 = var5_5 = var15_14 + 4;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                    if (var16_15 != var14_12.a) {
                        return var5_5;
                    }
                    var3_3 = com.github.catvod.spider.merge.E0.f.c(var19_13 /* !! */ , var15_14);
                }
            }
            case 18: 
            case 35: {
                if (var7_7 == 2) {
                    return com.github.catvod.spider.merge.E0.f.i(var19_13 /* !! */ , var15_14, var18_18, var14_12);
                }
                var11_10 = var15_14;
                if (var7_7 != 1) return var11_10;
                var1_1 /* !! */  = (r)var18_18;
                var9_9 = com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var3_3);
                while (true) {
                    var1_1 /* !! */ .c(Double.longBitsToDouble(var9_9));
                    var3_3 = var5_5 = var15_14 + 8;
                    if (var5_5 >= var4_4) return var3_3;
                    var15_14 = com.github.catvod.spider.merge.E0.f.u(var19_13 /* !! */ , var5_5, var14_12);
                    if (var16_15 != var14_12.a) {
                        return var5_5;
                    }
                    var9_9 = com.github.catvod.spider.merge.E0.f.d(var19_13 /* !! */ , var15_14);
                }
            }
        }
    }

    private int I(int n2) {
        return this.a[n2 + 2];
    }

    private static Field J(Class<?> clazz, String string) {
        try {
            Field field = clazz.getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object object;
            Object[] objectArray = clazz.getDeclaredFields();
            int n2 = objectArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = objectArray[i2];
                if (!string.equals(((Field)object).getName())) continue;
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Field ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append(clazz.getName());
            ((StringBuilder)object).append(" not found. Known fields are ");
            ((StringBuilder)object).append(Arrays.toString(objectArray));
            throw new RuntimeException(((StringBuilder)object).toString(), noSuchFieldException);
        }
    }

    private void K(T t2, int n2) {
        long l2 = 0xFFFFF & (n2 = this.I(n2));
        if (l2 == 1048575L) {
            return;
        }
        L0.A(t2, l2, 1 << (n2 >>> 20) | L0.p(t2, l2));
    }

    private void L(T t2, int n2, int n3) {
        L0.A(t2, this.I(n3) & 0xFFFFF, n2);
    }

    private int M(int n2, int n3) {
        int n4 = this.a.length / 3 - 1;
        while (n3 <= n4) {
            int n5 = n4 + n3 >>> 1;
            int n6 = n5 * 3;
            int n7 = this.a[n6];
            if (n2 == n7) {
                return n6;
            }
            if (n2 < n7) {
                n4 = n5 - 1;
                continue;
            }
            n3 = n5 + 1;
        }
        return -1;
    }

    private void N(T t2, int n2, Object object) {
        r.putObject(t2, this.P(n2) & 0xFFFFF, object);
        this.K(t2, n2);
    }

    private void O(T t2, int n2, int n3, Object object) {
        r.putObject(t2, this.P(n3) & 0xFFFFF, object);
        this.L(t2, n2, n3);
    }

    private int P(int n2) {
        return this.a[n2 + 1];
    }

    private boolean h(T t2, T t3, int n2) {
        boolean bl = this.p(t2, n2) == this.p(t3, n2);
        return bl;
    }

    private static void i(Object object) {
        if (m0.r(object)) {
            return;
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("Mutating immutable message: ", object));
    }

    private <UT, UB> UB j(Object object, int n2, UB UB, D0<UT, UB> d02, Object object2) {
        int n3 = this.a[n2];
        Map<?, ?> map = L0.r(object, this.P(n2) & 0xFFFFF);
        if (map == null) {
            return UB;
        }
        object = this.k(n2);
        if (object == null) {
            return UB;
        }
        map = this.p.d(map);
        this.p.g(this.l(n2));
        for (Map.Entry entry : map.entrySet()) {
            ((Integer)entry.getValue()).intValue();
            if (object.a()) continue;
            if (UB == null) {
                d02.b(object2);
            }
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return UB;
    }

    private L k(int n2) {
        return (L)this.b[n2 / 3 * 2 + 1];
    }

    private Object l(int n2) {
        return this.b[n2 / 3 * 2];
    }

    private u0 m(int n2) {
        u0 u02 = (u0)this.b[n2 = n2 / 3 * 2];
        if (u02 != null) {
            return u02;
        }
        this.b[n2] = u02 = r0.a().b((Class)this.b[n2 + 1]);
        return u02;
    }

    static E0 n(Object object) {
        I i2 = (I)object;
        E0 e02 = i2.c;
        object = e02;
        if (e02 == E0.b()) {
            i2.c = object = E0.f();
        }
        return object;
    }

    private static boolean o(int n2) {
        boolean bl = (n2 & 0x20000000) != 0;
        return bl;
    }

    private boolean p(T object, int n2) {
        int n3 = this.I(n2);
        long l2 = n3 & 0xFFFFF;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        if (l2 == 1048575L) {
            n2 = this.P(n2);
            l2 = n2 & 0xFFFFF;
            switch ((n2 & 0xFF00000) >>> 20) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    bl9 = bl16;
                    if (L0.r(object, l2) != null) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 16: {
                    bl9 = bl;
                    if (L0.q(object, l2) != 0L) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 15: {
                    bl9 = bl2;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 14: {
                    bl9 = bl3;
                    if (L0.q(object, l2) != 0L) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 13: {
                    bl9 = bl4;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 12: {
                    bl9 = bl5;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 11: {
                    bl9 = bl6;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 10: {
                    return com.github.catvod.spider.merge.E0.n.b.equals(L0.r(object, l2)) ^ true;
                }
                case 9: {
                    bl9 = bl7;
                    if (L0.r(object, l2) != null) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 8: {
                    object = L0.r(object, l2);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof n) {
                        return com.github.catvod.spider.merge.E0.n.b.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return L0.l(object, l2);
                }
                case 6: {
                    bl9 = bl8;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 5: {
                    if (L0.q(object, l2) != 0L) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 4: {
                    bl9 = bl10;
                    if (L0.p(object, l2) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 3: {
                    bl9 = bl11;
                    if (L0.q(object, l2) != 0L) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 2: {
                    bl9 = bl12;
                    if (L0.q(object, l2) != 0L) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 1: {
                    bl9 = bl13;
                    if (Float.floatToRawIntBits(L0.o(object, l2)) != 0) {
                        bl9 = true;
                    }
                    return bl9;
                }
                case 0: 
            }
            bl9 = bl14;
            if (Double.doubleToRawLongBits(L0.n(object, l2)) != 0L) {
                bl9 = true;
            }
            return bl9;
        }
        bl9 = bl15;
        if ((L0.p(object, l2) & 1 << (n3 >>> 20)) != 0) {
            bl9 = true;
        }
        return bl9;
    }

    private boolean q(T t2, int n2, int n3, int n4, int n5) {
        if (n3 == 1048575) {
            return this.p(t2, n2);
        }
        boolean bl = (n4 & n5) != 0;
        return bl;
    }

    private static boolean r(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof I) {
            return ((I)object).l();
        }
        return true;
    }

    private boolean s(T t2, int n2, int n3) {
        boolean bl = L0.p(t2, this.I(n3) & 0xFFFFF) == n2;
        return bl;
    }

    private void t(T object, T object2, int n2) {
        if (!this.p(object2, n2)) {
            return;
        }
        Unsafe unsafe = r;
        long l2 = this.P(n2) & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            u0 u02 = this.m(n2);
            if (!this.p(object, n2)) {
                if (!m0.r(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = u02.e();
                    u02.a(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.K(object, n2);
                return;
            }
            Object object4 = unsafe.getObject(object, l2);
            object2 = object4;
            if (!m0.r(object4)) {
                object2 = u02.e();
                u02.a(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            u02.a(object2, object3);
            return;
        }
        object = com.github.catvod.spider.merge.C.a.c("Source subfield ");
        ((StringBuilder)object).append(this.a[n2]);
        ((StringBuilder)object).append(" is present but null: ");
        ((StringBuilder)object).append(object2);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private void u(T object, T object2, int n2) {
        int n3 = this.a[n2];
        if (!this.s(object2, n3, n2)) {
            return;
        }
        Unsafe unsafe = r;
        long l2 = this.P(n2) & 0xFFFFF;
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            u0 u02 = this.m(n2);
            if (!this.s(object, n3, n2)) {
                if (!m0.r(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = u02.e();
                    u02.a(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.L(object, n3, n2);
                return;
            }
            Object object4 = unsafe.getObject(object, l2);
            object2 = object4;
            if (!m0.r(object4)) {
                object2 = u02.e();
                u02.a(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            u02.a(object2, object3);
            return;
        }
        object = com.github.catvod.spider.merge.C.a.c("Source subfield ");
        ((StringBuilder)object).append(this.a[n2]);
        ((StringBuilder)object).append(" is present but null: ");
        ((StringBuilder)object).append(object2);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private Object v(T object, int n2) {
        u0 u02 = this.m(n2);
        long l2 = this.P(n2) & 0xFFFFF;
        if (!this.p(object, n2)) {
            return u02.e();
        }
        if (m0.r(object = r.getObject(object, l2))) {
            return object;
        }
        Object t2 = u02.e();
        if (object != null) {
            u02.a(t2, object);
        }
        return t2;
    }

    private Object w(T object, int n2, int n3) {
        u0 u02 = this.m(n3);
        if (!this.s(object, n2, n3)) {
            return u02.e();
        }
        if (m0.r(object = r.getObject(object, this.P(n3) & 0xFFFFF))) {
            return object;
        }
        Object t2 = u02.e();
        if (object != null) {
            u02.a(t2, object);
        }
        return t2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    static m0 x(g0 g02, o0 o02, U u2, D0 d02, v v2, d0 d03) {
        if (g02 instanceof t0) {
            return m0.y((t0)g02, o02, u2, d02, v2, d03);
        }
        g02 = (B0)g02;
        throw null;
    }

    static <T> m0<T> y(t0 t02, o0 o02, U u2, D0<?, ?> d02, v<?> v2, d0 d03) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int[] nArray;
        int n9;
        int n10;
        int n11;
        String string = t02.e();
        int n12 = string.length();
        if (string.charAt(0) >= '\ud800') {
            n11 = 1;
            while (true) {
                n9 = n10 = n11 + 1;
                if (string.charAt(n11) >= '\ud800') {
                    n11 = n10;
                    continue;
                }
                break;
            }
        } else {
            n9 = 1;
        }
        n11 = n9 + 1;
        int n13 = string.charAt(n9);
        n9 = n11;
        n10 = n13;
        if (n13 >= 55296) {
            n10 = n13 & 0x1FFF;
            n9 = 13;
            n13 = n11;
            while (true) {
                n11 = n13 + 1;
                if ((n13 = (int)string.charAt(n13)) < 55296) break;
                n10 |= (n13 & 0x1FFF) << n9;
                n9 += 13;
                n13 = n11;
            }
            n10 |= n13 << n9;
            n9 = n11;
        }
        if (n10 == 0) {
            nArray = q;
            n8 = 0;
            n13 = 0;
            n10 = 0;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            n11 = 0;
        } else {
            n10 = n9 + 1;
            n11 = n13 = (int)string.charAt(n9);
            n9 = n10;
            if (n13 >= 55296) {
                n9 = n13 & 0x1FFF;
                n11 = 13;
                n13 = n10;
                n10 = n9;
                while (true) {
                    n9 = n13 + 1;
                    if ((n13 = (int)string.charAt(n13)) < 55296) break;
                    n10 |= (n13 & 0x1FFF) << n11;
                    n11 += 13;
                    n13 = n9;
                }
                n11 = n10 | n13 << n11;
            }
            n10 = n9 + 1;
            n7 = n13 = (int)string.charAt(n9);
            n9 = n10;
            if (n13 >= 55296) {
                n13 &= 0x1FFF;
                n9 = 13;
                n8 = n10;
                while (true) {
                    n10 = n8 + 1;
                    if ((n8 = (int)string.charAt(n8)) < 55296) break;
                    n13 |= (n8 & 0x1FFF) << n9;
                    n9 += 13;
                    n8 = n10;
                }
                n7 = n13 | n8 << n9;
                n9 = n10;
            }
            n10 = n9 + 1;
            n9 = n13 = (int)string.charAt(n9);
            n8 = n10;
            if (n13 >= 55296) {
                n13 &= 0x1FFF;
                n9 = 13;
                n8 = n10;
                while (true) {
                    n10 = n8 + 1;
                    if ((n8 = (int)string.charAt(n8)) < 55296) break;
                    n13 |= (n8 & 0x1FFF) << n9;
                    n9 += 13;
                    n8 = n10;
                }
                n9 = n13 | n8 << n9;
                n8 = n10;
            }
            n13 = n8 + 1;
            n10 = n8 = (int)string.charAt(n8);
            n6 = n13;
            if (n8 >= 55296) {
                n10 = n8 & 0x1FFF;
                n8 = 13;
                n6 = n13;
                n13 = n10;
                while (true) {
                    n10 = n6 + 1;
                    if ((n6 = (int)string.charAt(n6)) < 55296) break;
                    n13 |= (n6 & 0x1FFF) << n8;
                    n8 += 13;
                    n6 = n10;
                }
                n13 |= n6 << n8;
                n6 = n10;
                n10 = n13;
            }
            n8 = n6 + 1;
            n13 = n6 = (int)string.charAt(n6);
            n5 = n8;
            if (n6 >= 55296) {
                n13 = n6 & 0x1FFF;
                n6 = 13;
                n5 = n8;
                n8 = n13;
                while (true) {
                    n13 = n5 + 1;
                    if ((n5 = (int)string.charAt(n5)) < 55296) break;
                    n8 |= (n5 & 0x1FFF) << n6;
                    n6 += 13;
                    n5 = n13;
                }
                n8 |= n5 << n6;
                n5 = n13;
                n13 = n8;
            }
            n6 = n5 + 1;
            n8 = n4 = (int)string.charAt(n5);
            n5 = n6;
            if (n4 >= 55296) {
                n5 = n4 & 0x1FFF;
                n8 = 13;
                n4 = n6;
                while (true) {
                    n6 = n4 + 1;
                    if ((n4 = (int)string.charAt(n4)) < 55296) break;
                    n5 |= (n4 & 0x1FFF) << n8;
                    n8 += 13;
                    n4 = n6;
                }
                n8 = n5 | n4 << n8;
                n5 = n6;
            }
            n6 = n5 + 1;
            n4 = n3 = (int)string.charAt(n5);
            n5 = n6;
            if (n3 >= 55296) {
                n4 = n3 & 0x1FFF;
                n5 = 13;
                n3 = n6;
                while (true) {
                    n6 = n3 + 1;
                    if ((n3 = (int)string.charAt(n3)) < 55296) break;
                    n4 |= (n3 & 0x1FFF) << n5;
                    n5 += 13;
                    n3 = n6;
                }
                n4 |= n3 << n5;
                n5 = n6;
            }
            n3 = n5 + 1;
            n6 = n2 = (int)string.charAt(n5);
            n5 = n3;
            if (n2 >= 55296) {
                n5 = n2 & 0x1FFF;
                n6 = 13;
                n2 = n3;
                n3 = n5;
                while (true) {
                    n5 = n2 + 1;
                    if ((n2 = (int)string.charAt(n2)) < 55296) break;
                    n3 |= (n2 & 0x1FFF) << n6;
                    n6 += 13;
                    n2 = n5;
                }
                n6 = n3 | n2 << n6;
            }
            nArray = new int[n6 + n8 + n4];
            n3 = n11;
            n4 = n5;
            n2 = n11 * 2 + n7;
            n11 = n6;
            n5 = n10;
            n6 = n9;
            n7 = n8;
            n10 = n13;
            n13 = n2;
            n8 = n3;
            n9 = n4;
        }
        Unsafe unsafe = r;
        Object[] objectArray = t02.d();
        Class<?> clazz = t02.b().getClass();
        int[] nArray2 = new int[n10 * 3];
        Object[] objectArray2 = new Object[n10 * 2];
        int n14 = n11 + n7;
        n10 = n11;
        int n15 = n14;
        int n16 = 0;
        n7 = 0;
        n2 = n11;
        n11 = n5;
        n3 = n6;
        int n17 = n8;
        n8 = n9;
        n9 = n12;
        while (n8 < n9) {
            int n18;
            int n19;
            int n20;
            int n21;
            int n22;
            int n23;
            int n24;
            int n25;
            block62: {
                Object object;
                block57: {
                    block59: {
                        block61: {
                            block58: {
                                block60: {
                                    n4 = n8 + 1;
                                    n12 = string.charAt(n8);
                                    if (n12 >= 55296) {
                                        n5 = n12 & 0x1FFF;
                                        n8 = 13;
                                        while (true) {
                                            n6 = n4 + 1;
                                            if ((n4 = (int)string.charAt(n4)) < 55296) break;
                                            n5 |= (n4 & 0x1FFF) << n8;
                                            n8 += 13;
                                            n4 = n6;
                                        }
                                        n12 = n5 | n4 << n8;
                                    } else {
                                        n6 = n4;
                                    }
                                    n8 = n6 + 1;
                                    n25 = string.charAt(n6);
                                    if (n25 >= 55296) {
                                        n5 = n25 & 0x1FFF;
                                        n4 = n8;
                                        n8 = 13;
                                        while (true) {
                                            n6 = n4 + 1;
                                            if ((n4 = (int)string.charAt(n4)) < 55296) break;
                                            n5 |= (n4 & 0x1FFF) << n8;
                                            n8 += 13;
                                            n4 = n6;
                                        }
                                        n25 = n5 | n4 << n8;
                                        n8 = n6;
                                    }
                                    n24 = n25 & 0xFF;
                                    n23 = n7;
                                    if ((n25 & 0x400) != 0) {
                                        nArray[n7] = n16;
                                        n23 = n7 + 1;
                                    }
                                    if (n24 < 51) break block57;
                                    n6 = n8 + 1;
                                    n5 = string.charAt(n8);
                                    if (n5 >= 55296) {
                                        n5 &= 0x1FFF;
                                        n8 = n6;
                                        n6 = 13;
                                        while (true) {
                                            n7 = n8 + 1;
                                            n4 = string.charAt(n8);
                                            n8 = n11;
                                            if (n4 < 55296) break;
                                            n5 |= (n4 & 0x1FFF) << n6;
                                            n6 += 13;
                                            n11 = n8;
                                            n8 = n7;
                                        }
                                        n5 |= n4 << n6;
                                        n11 = n7;
                                    } else {
                                        n8 = n11;
                                        n11 = n6;
                                    }
                                    n7 = n24 - 51;
                                    if (n7 == 9 || n7 == 17) break block58;
                                    n6 = n13;
                                    if (n7 != 12) break block59;
                                    if (z.a(t02.a(), 1)) break block60;
                                    n6 = n13;
                                    if ((n25 & 0x800) == 0) break block59;
                                }
                                n7 = n16 / 3;
                                n6 = n13 + 1;
                                objectArray2[n7 * 2 + 1] = objectArray[n13];
                                n13 = n6;
                                break block61;
                            }
                            n7 = n16 / 3;
                            n6 = n13 + 1;
                            objectArray2[n7 * 2 + 1] = objectArray[n13];
                            n13 = n6;
                        }
                        n6 = n13;
                    }
                    if ((object = objectArray[n13 = n5 * 2]) instanceof Field) {
                        object = (Field)object;
                    } else {
                        objectArray[n13] = object = m0.J(clazz, (String)object);
                    }
                    n22 = (int)unsafe.objectFieldOffset((Field)object);
                    object = objectArray[++n13];
                    if (object instanceof Field) {
                        object = (Field)object;
                    } else {
                        objectArray[n13] = object = m0.J(clazz, (String)object);
                    }
                    n21 = (int)unsafe.objectFieldOffset((Field)object);
                    n20 = 0;
                    n19 = n10;
                    n18 = n15;
                    n13 = n11;
                    break block62;
                }
                int n26 = n11;
                n11 = n13 + 1;
                object = m0.J(clazz, (String)objectArray[n13]);
                if (n24 != 9 && n24 != 17) {
                    if (n24 != 27 && n24 != 49) {
                        if (n24 != 12 && n24 != 30 && n24 != 44) {
                            if (n24 == 50) {
                                n13 = n10 + 1;
                                nArray[n10] = n16;
                                n6 = n16 / 3 * 2;
                                n10 = n11 + 1;
                                objectArray2[n6] = objectArray[n11];
                                if ((n25 & 0x800) != 0) {
                                    objectArray2[n6 + 1] = objectArray[n10];
                                    n11 = n10 + 1;
                                } else {
                                    n11 = n10;
                                }
                                n10 = n13;
                            }
                        } else if (t02.a() == 1 || (n25 & 0x800) != 0) {
                            n6 = n16 / 3;
                            n13 = n11 + 1;
                            objectArray2[n6 * 2 + 1] = objectArray[n11];
                            n11 = n13;
                        }
                    } else {
                        n6 = n16 / 3;
                        n13 = n11 + 1;
                        objectArray2[n6 * 2 + 1] = objectArray[n11];
                        n11 = n13;
                    }
                } else {
                    objectArray2[n16 / 3 * 2 + 1] = ((Field)object).getType();
                }
                int n27 = (int)unsafe.objectFieldOffset((Field)object);
                n13 = (n25 & 0x1000) != 0 ? 1 : 0;
                if (n13 != 0 && n24 <= 17) {
                    n6 = n8 + 1;
                    n13 = string.charAt(n8);
                    if (n13 >= 55296) {
                        n8 = n13 & 0x1FFF;
                        n13 = 13;
                        while (true) {
                            n7 = n6 + 1;
                            if ((n6 = (int)string.charAt(n6)) < 55296) break;
                            n8 |= (n6 & 0x1FFF) << n13;
                            n13 += 13;
                            n6 = n7;
                        }
                        n13 = n8 | n6 << n13;
                    } else {
                        n7 = n6;
                    }
                    n8 = n13 / 32 + n17 * 2;
                    object = objectArray[n8];
                    if (object instanceof Field) {
                        object = (Field)object;
                    } else {
                        objectArray[n8] = object = m0.J(clazz, (String)object);
                    }
                    n4 = (int)unsafe.objectFieldOffset((Field)object);
                    n5 = n13 % 32;
                } else {
                    n5 = 0;
                    n4 = 1048575;
                    n7 = n8;
                }
                n20 = n5;
                n21 = n4;
                n22 = n27;
                n19 = n10;
                n18 = n15;
                n6 = n11;
                n13 = n7;
                n8 = n26;
                if (n24 >= 18) {
                    n20 = n5;
                    n21 = n4;
                    n22 = n27;
                    n19 = n10;
                    n18 = n15;
                    n6 = n11;
                    n13 = n7;
                    n8 = n26;
                    if (n24 <= 49) {
                        nArray[n15] = n27;
                        n18 = n15 + 1;
                        n8 = n26;
                        n13 = n7;
                        n6 = n11;
                        n19 = n10;
                        n22 = n27;
                        n21 = n4;
                        n20 = n5;
                    }
                }
            }
            n7 = n16 + 1;
            nArray2[n16] = n12;
            n4 = n7 + 1;
            n11 = (n25 & 0x200) != 0 ? 0x20000000 : 0;
            n10 = (n25 & 0x100) != 0 ? 0x10000000 : 0;
            n5 = (n25 & 0x800) != 0 ? Integer.MIN_VALUE : 0;
            nArray2[n7] = n24 << 20 | (n5 | (n11 | n10)) | n22;
            n16 = n4 + 1;
            nArray2[n4] = n20 << 20 | n21;
            n11 = n8;
            n8 = n13;
            n13 = n6;
            n7 = n23;
            n10 = n19;
            n15 = n18;
        }
        return new m0<T>(nArray2, objectArray2, n3, n11, t02.b(), nArray, n2, n14, o02, u2, d02, v2, d03);
    }

    private static <T> boolean z(T t2, long l2) {
        return (Boolean)L0.r(t2, l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final int F(T var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, e var6_6) {
        block64: {
            block63: {
                block62: {
                    block61: {
                        block44: {
                            block60: {
                                block45: {
                                    var23_7 = var1_1;
                                    var23_7 = var6_6;
                                    m0.i(var1_1);
                                    var23_7 = m0.r;
                                    var11_8 /* !! */  = var5_5;
                                    var7_9 = 0;
                                    var13_10 = -1;
                                    var14_11 = 0;
                                    var8_12 = 1048575;
                                    var9_13 = 0;
                                    block16: while (true) {
                                        block57: {
                                            block58: {
                                                block59: {
                                                    block55: {
                                                        block56: {
                                                            block54: {
                                                                block49: {
                                                                    block53: {
                                                                        block50: {
                                                                            block47: {
                                                                                block48: {
                                                                                    block52: {
                                                                                        block46: {
                                                                                            block51: {
                                                                                                var24_22 /* !! */  = var1_1;
                                                                                                var25_23 = var6_6;
                                                                                                if (var3_3 >= var4_4) break block44;
                                                                                                var10_14 = var3_3 + 1;
                                                                                                if ((var3_3 = var2_2 /* !! */ [var3_3]) < 0) {
                                                                                                    var10_14 = com.github.catvod.spider.merge.E0.f.t(var3_3, var2_2 /* !! */ , var10_14, (e)var25_23);
                                                                                                    var3_3 = var25_23.a;
                                                                                                }
                                                                                                var12_15 = var3_3 >>> 3;
                                                                                                var15_16 = var3_3 & 7;
                                                                                                if (var12_15 > var13_10) {
                                                                                                    var7_9 = var14_11 / 3;
                                                                                                    var7_9 = var12_15 >= this.c && var12_15 <= this.d ? this.M(var12_15, var7_9) : -1;
                                                                                                } else {
                                                                                                    var7_9 = var12_15 >= this.c && var12_15 <= this.d ? this.M(var12_15, 0) : -1;
                                                                                                }
                                                                                                if (var7_9 == -1) {
                                                                                                    var13_10 = var3_3;
                                                                                                    var7_9 = var8_12;
                                                                                                    var8_12 = var9_13;
                                                                                                    var14_11 = 0;
                                                                                                    var3_3 = var11_8 /* !! */ ;
                                                                                                    var9_13 = var13_10;
                                                                                                    var11_8 /* !! */  = var14_11;
                                                                                                    break block45;
                                                                                                }
                                                                                                var25_23 = this.a;
                                                                                                var16_17 = var25_23[var7_9 + 1];
                                                                                                var17_18 = (var16_17 & 0xFF00000) >>> 20;
                                                                                                var20_20 = var16_17 & 1048575;
                                                                                                if (var17_18 > 17) break block47;
                                                                                                var11_8 /* !! */  = (int)var25_23[var7_9 + 2];
                                                                                                var14_11 = 1 << (var11_8 /* !! */  >>> 20);
                                                                                                var13_10 = var11_8 /* !! */  & 1048575;
                                                                                                if (var13_10 != var8_12) {
                                                                                                    if (var8_12 != 1048575) {
                                                                                                        var23_7.putInt(var24_22 /* !! */ , var8_12, var9_13);
                                                                                                    }
                                                                                                    var11_8 /* !! */  = var13_10 == 1048575 ? 0 : var23_7.getInt(var24_22 /* !! */ , var13_10);
                                                                                                    var8_12 = var13_10;
                                                                                                } else {
                                                                                                    var11_8 /* !! */  = var9_13;
                                                                                                }
                                                                                                switch (var17_18) {
                                                                                                    default: {
                                                                                                        var9_13 = var3_3;
                                                                                                        break block48;
                                                                                                    }
                                                                                                    case 17: {
                                                                                                        if (var15_16 != 3) ** GOTO lbl64
                                                                                                        var25_23 = this.v(var24_22 /* !! */ , var7_9);
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.x(var25_23, this.m(var7_9), var2_2 /* !! */ , var10_14, var4_4, var12_15 << 3 | 4, var6_6);
                                                                                                        this.N(var24_22 /* !! */ , var7_9, var25_23);
                                                                                                        var10_14 = var7_9;
                                                                                                        var10_14 = var3_3;
                                                                                                        var3_3 = var9_13;
                                                                                                        var9_13 = var11_8 /* !! */  |= var14_11;
                                                                                                        break block49;
lbl64:
                                                                                                        // 1 sources

                                                                                                        var9_13 = var3_3;
                                                                                                        break block48;
                                                                                                    }
                                                                                                    case 16: {
                                                                                                        var9_13 = var3_3;
                                                                                                        if (var15_16 != 0) break block48;
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        var18_19 = com.github.catvod.spider.merge.E0.q.b(var6_6.b);
                                                                                                        ** GOTO lbl141
                                                                                                    }
                                                                                                    case 15: {
                                                                                                        var9_13 = var3_3;
                                                                                                        if (var15_16 != 0) break block48;
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        var10_14 = com.github.catvod.spider.merge.E0.q.a(var6_6.a);
                                                                                                        ** GOTO lbl133
                                                                                                    }
                                                                                                    case 12: {
                                                                                                        if (var15_16 != 0) ** GOTO lbl126
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        var13_10 = var6_6.a;
                                                                                                        var25_23 = this.k(var7_9);
                                                                                                        var10_14 = (-2147483648 & var16_17) != 0 ? 1 : 0;
                                                                                                        if (var10_14 == 0 || var25_23 == null || var25_23.a()) ** GOTO lbl89
                                                                                                        m0.n(var1_1).h(var3_3, var13_10);
                                                                                                        var10_14 = var8_12;
                                                                                                        var8_12 = var11_8 /* !! */ ;
                                                                                                        break block50;
lbl89:
                                                                                                        // 1 sources

                                                                                                        var10_14 = var13_10;
                                                                                                        ** GOTO lbl133
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var15_16 != 2) ** GOTO lbl126
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.b(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        ** GOTO lbl106
                                                                                                    }
                                                                                                    case 9: {
                                                                                                        if (var15_16 != 2) ** GOTO lbl126
                                                                                                        var25_23 = this.v(var24_22 /* !! */ , var7_9);
                                                                                                        var26_24 = this.m(var7_9);
                                                                                                        var9_13 = var3_3;
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.y(var25_23, (u0)var26_24, var2_2 /* !! */ , var10_14, var4_4, var6_6);
                                                                                                        this.N(var24_22 /* !! */ , var7_9, var25_23);
                                                                                                        break block46;
                                                                                                    }
                                                                                                    case 8: {
                                                                                                        if (var15_16 != 2) ** GOTO lbl126
                                                                                                        var9_13 = m0.o((int)var16_17) != false ? com.github.catvod.spider.merge.E0.f.r(var2_2 /* !! */ , var10_14, var6_6) : com.github.catvod.spider.merge.E0.f.q(var2_2 /* !! */ , var10_14, var6_6);
lbl106:
                                                                                                        // 2 sources

                                                                                                        var23_7.putObject(var24_22 /* !! */ , var20_20, var6_6.c);
lbl107:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var10_14 = var3_3;
                                                                                                            break block46;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var15_16 == 0) {
                                                                                                            var9_13 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                            var22_21 = var6_6.b != 0L;
                                                                                                            L0.v(var24_22 /* !! */ , var20_20, var22_21);
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        ** GOTO lbl126
                                                                                                    }
                                                                                                    case 6: 
                                                                                                    case 13: {
                                                                                                        if (var15_16 != 5) ** GOTO lbl126
                                                                                                        var23_7.putInt(var24_22 /* !! */ , var20_20, com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var10_14));
                                                                                                        ** GOTO lbl149
                                                                                                    }
                                                                                                    case 5: 
                                                                                                    case 14: {
                                                                                                        if (var15_16 != 1) ** GOTO lbl126
                                                                                                        var23_7.putLong(var1_1, var20_20, com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var10_14));
                                                                                                        break block51;
lbl126:
                                                                                                        // 7 sources

                                                                                                        var9_13 = var3_3;
                                                                                                        break block48;
                                                                                                    }
                                                                                                    case 4: 
                                                                                                    case 11: {
                                                                                                        var9_13 = var3_3;
                                                                                                        if (var15_16 != 0) break block48;
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.u(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        var10_14 = var6_6.a;
lbl133:
                                                                                                        // 3 sources

                                                                                                        var13_10 = var3_3;
                                                                                                        var23_7.putInt(var24_22 /* !! */ , var20_20, var10_14);
                                                                                                        break block46;
                                                                                                    }
                                                                                                    case 2: 
                                                                                                    case 3: {
                                                                                                        var9_13 = var3_3;
                                                                                                        if (var15_16 != 0) break block48;
                                                                                                        var9_13 = com.github.catvod.spider.merge.E0.f.w(var2_2 /* !! */ , var10_14, var6_6);
                                                                                                        var18_19 = var6_6.b;
lbl141:
                                                                                                        // 2 sources

                                                                                                        var10_14 = var3_3;
                                                                                                        var23_7.putLong(var1_1, var20_20, var18_19);
                                                                                                        var10_14 = var11_8 /* !! */  | var14_11;
                                                                                                        break block52;
                                                                                                    }
                                                                                                    case 1: {
                                                                                                        var9_13 = var3_3;
                                                                                                        if (var15_16 != 5) break block48;
                                                                                                        L0.z(var24_22 /* !! */ , var20_20, Float.intBitsToFloat(com.github.catvod.spider.merge.E0.f.c(var2_2 /* !! */ , var10_14)));
lbl149:
                                                                                                        // 2 sources

                                                                                                        var9_13 = var3_3;
                                                                                                        var9_13 = var10_14 + 4;
                                                                                                        break block46;
                                                                                                    }
                                                                                                    case 0: 
                                                                                                }
                                                                                                var9_13 = var3_3;
                                                                                                if (var15_16 != 1) break block48;
                                                                                                L0.y(var24_22 /* !! */ , var20_20, Double.longBitsToDouble(com.github.catvod.spider.merge.E0.f.d(var2_2 /* !! */ , var10_14)));
                                                                                            }
                                                                                            var9_13 = var3_3;
                                                                                            var9_13 = var10_14 + 8;
                                                                                        }
                                                                                        var10_14 = var3_3;
                                                                                        var10_14 = var11_8 /* !! */  | var14_11;
                                                                                    }
                                                                                    var11_8 /* !! */  = var7_9;
                                                                                    break block53;
                                                                                }
                                                                                var9_13 = var3_3;
                                                                                var13_10 = var11_8 /* !! */ ;
                                                                                var3_3 = var5_5;
                                                                                var11_8 /* !! */  = var7_9;
                                                                                var7_9 = var8_12;
                                                                                var8_12 = var13_10;
                                                                                break block45;
                                                                            }
                                                                            if (var17_18 != 27) break block54;
                                                                            if (var15_16 != 2) break block55;
                                                                            var25_23 = var26_24 = (M)var23_7.getObject(var24_22 /* !! */ , var20_20);
                                                                            if (!var26_24.h()) {
                                                                                var11_8 /* !! */  = var26_24.size();
                                                                                var11_8 /* !! */  = var11_8 /* !! */  == 0 ? 10 : (var11_8 /* !! */  *= 2);
                                                                                var25_23 = var26_24.e(var11_8 /* !! */ );
                                                                                var23_7.putObject(var24_22 /* !! */ , var20_20, var25_23);
                                                                            }
                                                                            var11_8 /* !! */  = com.github.catvod.spider.merge.E0.f.g(this.m(var7_9), var3_3, var2_2 /* !! */ , var10_14, var4_4, (M)var25_23, var6_6);
                                                                            var10_14 = var8_12;
                                                                            var8_12 = var9_13;
                                                                            var9_13 = var11_8 /* !! */ ;
                                                                        }
                                                                        var11_8 /* !! */  = var7_9;
                                                                        var11_8 /* !! */  = var10_14;
                                                                        var10_14 = var8_12;
                                                                        var8_12 = var11_8 /* !! */ ;
                                                                    }
                                                                    var11_8 /* !! */  = var7_9;
                                                                    var13_10 = var10_14;
                                                                    var11_8 /* !! */  = var9_13;
                                                                    var10_14 = var3_3;
                                                                    var9_13 = var13_10;
                                                                    var3_3 = var11_8 /* !! */ ;
                                                                }
                                                                var14_11 = var7_9;
                                                                var24_22 /* !! */  = var6_6;
                                                                var11_8 /* !! */  = var5_5;
                                                                var7_9 = var10_14;
                                                                var13_10 = var12_15;
                                                                continue;
                                                            }
                                                            var11_8 /* !! */  = var7_9;
                                                            var14_11 = var8_12;
                                                            var13_10 = var9_13;
                                                            if (var17_18 > 49) break block56;
                                                            var7_9 = var8_12 = this.H(var1_1, var2_2 /* !! */ , var10_14, var4_4, var3_3, var12_15, var15_16, var11_8 /* !! */ , (long)var16_17, var17_18, var20_20, var6_6);
                                                            if (var8_12 == var10_14) break;
                                                            var7_9 = var8_12;
                                                            break block57;
                                                        }
                                                        if (var17_18 != 50) break block58;
                                                        if (var15_16 == 2) break block59;
                                                    }
                                                    var13_10 = var9_13;
                                                    var9_13 = var3_3;
                                                    var3_3 = var5_5;
                                                    var11_8 /* !! */  = var7_9;
                                                    var7_9 = var8_12;
                                                    var8_12 = var13_10;
                                                    break block45;
                                                }
                                                this.E(var1_1, var2_2 /* !! */ , var10_14, var4_4, var11_8 /* !! */ , var20_20, var6_6);
                                                throw null;
                                            }
                                            var7_9 = var8_12 = this.G(var1_1, var2_2 /* !! */ , var10_14, var4_4, var3_3, var12_15, var15_16, (int)var16_17, var17_18, var20_20, var11_8 /* !! */ , var6_6);
                                            if (var8_12 == var10_14) break;
                                            var7_9 = var8_12;
                                        }
                                        var24_22 /* !! */  = var1_1;
                                        var10_14 = var3_3;
                                        var3_3 = var5_5;
                                        var24_22 /* !! */  = var6_6;
                                        var8_12 = var14_11;
                                        var9_13 = var13_10;
                                        var13_10 = var12_15;
                                        var14_11 = var11_8 /* !! */ ;
                                        var11_8 /* !! */  = var3_3;
                                        var3_3 = var7_9;
lbl245:
                                        // 2 sources

                                        while (true) {
                                            var24_22 /* !! */  = var1_1;
                                            var24_22 /* !! */  = var6_6;
                                            var7_9 = var10_14;
                                            var13_10 = var12_15;
                                            continue block16;
                                            break;
                                        }
                                        break;
                                    }
                                    var9_13 = var3_3;
                                    var3_3 = var5_5;
                                    var10_14 = var7_9;
                                    var8_12 = var13_10;
                                    var7_9 = var14_11;
                                }
                                if (var9_13 != var3_3 || var3_3 == 0) break block60;
                                var2_2 /* !! */  = (byte[])this;
                                var24_22 /* !! */  = var1_1;
                                var5_5 = var10_14;
                                var10_14 = var8_12;
                                var8_12 = var7_9;
                                break block61;
                            }
                            if (!this.f || var6_6.d == u.b()) ** GOTO lbl273
                            var24_22 /* !! */  = this.e;
                            if (var6_6.d.a(var24_22 /* !! */ , var12_15) == null) {
                                var10_14 = com.github.catvod.spider.merge.E0.f.s(var9_13, var2_2 /* !! */ , var10_14, var4_4, m0.n(var1_1), var6_6);
                            } else {
                                ((E)var1_1).u();
                                throw null;
lbl273:
                                // 1 sources

                                var10_14 = com.github.catvod.spider.merge.E0.f.s(var9_13, var2_2 /* !! */ , var10_14, var4_4, m0.n(var1_1), var6_6);
                            }
                            var13_10 = var3_3;
                            var3_3 = var12_15;
                            var24_22 /* !! */  = var1_1;
                            var14_11 = var11_8 /* !! */ ;
                            var15_16 = var8_12;
                            var24_22 /* !! */  = var6_6;
                            var3_3 = var10_14;
                            var11_8 /* !! */  = var13_10;
                            var10_14 = var9_13;
                            var8_12 = var7_9;
                            var9_13 = var15_16;
                            ** while (true)
                        }
                        var2_2 /* !! */  = (byte[])this;
                        var5_5 = var3_3;
                        var3_3 = var11_8 /* !! */ ;
                        var10_14 = var7_9;
                        var7_9 = var9_13;
                        var9_13 = var10_14;
                        var10_14 = var7_9;
                    }
                    var2_2 /* !! */  = (byte[])this;
                    if (var8_12 != 1048575) {
                        var23_7.putInt(var24_22 /* !! */ , var8_12, var10_14);
                    }
                    for (var7_9 = var2_2 /* !! */ .j; var7_9 < var2_2 /* !! */ .k; ++var7_9) {
                        this.j(var1_1, var2_2 /* !! */ .i[var7_9], null, var2_2 /* !! */ .n, var1_1);
                    }
                    if (var3_3 != 0) break block62;
                    if (var5_5 != var4_4) {
                        throw O.d();
                    }
                    break block63;
                }
                if (var5_5 > var4_4 || var9_13 != var3_3) break block64;
            }
            return var5_5;
        }
        throw O.d();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a(T var1_1, T var2_2) {
        m0.i(var1_1);
        Objects.requireNonNull(var2_2);
        block24: for (var3_3 = 0; var3_3 < this.a.length; var3_3 += 3) {
            block26: {
                var4_4 = this.P(var3_3);
                var6_6 = 1048575 & var4_4;
                var5_5 = this.a[var3_3];
                switch ((var4_4 & 0xFF00000) >>> 20) {
                    default: {
                        continue block24;
                    }
                    case 61: 
                    case 62: 
                    case 63: 
                    case 64: 
                    case 65: 
                    case 66: 
                    case 67: {
                        if (!this.s(var2_2, var5_5, var3_3)) continue block24;
                        ** GOTO lbl19
                    }
                    case 60: 
                    case 68: {
                        this.u(var1_1, var2_2, var3_3);
                        continue block24;
                    }
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: 
                    case 59: {
                        if (!this.s(var2_2, var5_5, var3_3)) continue block24;
lbl19:
                        // 2 sources

                        L0.C(var1_1, var6_6, L0.r(var2_2, var6_6));
                        this.L(var1_1, var5_5, var3_3);
                        continue block24;
                    }
                    case 50: {
                        var8_7 = this.p;
                        var4_4 = v0.d;
                        L0.C(var1_1, var6_6, var8_7.a(L0.r(var1_1, var6_6), L0.r(var2_2, var6_6)));
                        continue block24;
                    }
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: {
                        this.m.a(var1_1, var2_2, var6_6);
                        continue block24;
                    }
                    case 16: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl77
                    }
                    case 15: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl70
                    }
                    case 14: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl77
                    }
                    case 13: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl70
                    }
                    case 12: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl70
                    }
                    case 11: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl70
                    }
                    case 10: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl56
                    }
                    case 9: 
                    case 17: {
                        this.t(var1_1, var2_2, var3_3);
                        continue block24;
                    }
                    case 8: {
                        if (!this.p(var2_2, var3_3)) continue block24;
lbl56:
                        // 2 sources

                        L0.C(var1_1, var6_6, L0.r(var2_2, var6_6));
                        break block26;
                    }
                    case 7: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        L0.v(var1_1, var6_6, L0.l(var2_2, var6_6));
                        break block26;
                    }
                    case 6: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl70
                    }
                    case 5: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl77
                    }
                    case 4: {
                        if (!this.p(var2_2, var3_3)) continue block24;
lbl70:
                        // 6 sources

                        L0.A(var1_1, var6_6, L0.p(var2_2, var6_6));
                        break block26;
                    }
                    case 3: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        ** GOTO lbl77
                    }
                    case 2: {
                        if (!this.p(var2_2, var3_3)) continue block24;
lbl77:
                        // 5 sources

                        L0.B(var1_1, var6_6, L0.q(var2_2, var6_6));
                        break block26;
                    }
                    case 1: {
                        if (!this.p(var2_2, var3_3)) continue block24;
                        L0.z(var1_1, var6_6, L0.o(var2_2, var6_6));
                        break block26;
                    }
                    case 0: 
                }
                if (!this.p(var2_2, var3_3)) continue;
                L0.y(var1_1, var6_6, L0.n(var2_2, var6_6));
            }
            this.K(var1_1, var3_3);
        }
        var8_7 = this.n;
        var3_3 = v0.d;
        var8_7.f(var1_1, var8_7.e(var8_7.c(var1_1), var8_7.c(var2_2)));
        if (this.f && !(var2_2 = (var8_7 = this.o).b(var2_2)).e()) {
            var8_7.c(var1_1).l(var2_2);
        }
    }

    @Override
    public final boolean b(T object) {
        int n2 = 1048575;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            block15: {
                int n5;
                int n6;
                int n7;
                block12: {
                    List list;
                    int n8;
                    int n9;
                    block13: {
                        int n10;
                        block14: {
                            n9 = this.j;
                            n8 = 1;
                            if (n4 >= n9) break;
                            n7 = this.i[n4];
                            n10 = this.a[n7];
                            n6 = this.P(n7);
                            n5 = this.a[n7 + 2];
                            n9 = n5 & 0xFFFFF;
                            n5 = 1 << (n5 >>> 20);
                            if (n9 != n2) {
                                if (n9 != 1048575) {
                                    n3 = r.getInt(object, n9);
                                }
                                n2 = n9;
                            }
                            if ((n9 = (0x10000000 & n6) != 0 ? 1 : 0) != 0 && !this.q(object, n7, n2, n3, n5)) {
                                return false;
                            }
                            n9 = (0xFF00000 & n6) >>> 20;
                            if (n9 == 9 || n9 == 17) break block12;
                            if (n9 == 27) break block13;
                            if (n9 == 60 || n9 == 68) break block14;
                            if (n9 == 49) break block13;
                            if (n9 == 50 && !this.p.c(L0.r(object, n6 & 0xFFFFF)).isEmpty()) {
                                object = this.l(n7);
                                this.p.g(object);
                                throw null;
                            }
                            break block15;
                        }
                        if (this.s(object, n10, n7) && !this.m(n7).b(L0.r(object, n6 & 0xFFFFF))) {
                            return false;
                        }
                        break block15;
                    }
                    if ((list = (List)L0.r(object, n6 & 0xFFFFF)).isEmpty()) {
                        n9 = n8;
                    } else {
                        u0 u02 = this.m(n7);
                        n7 = 0;
                        while (true) {
                            n9 = n8;
                            if (n7 >= list.size()) break;
                            if (!u02.b(list.get(n7))) {
                                n9 = 0;
                                break;
                            }
                            ++n7;
                        }
                    }
                    if (n9 == 0) {
                        return false;
                    }
                    break block15;
                }
                if (this.q(object, n7, n2, n3, n5) && !this.m(n7).b(L0.r(object, n6 & 0xFFFFF))) {
                    return false;
                }
            }
            ++n4;
        }
        return !this.f || this.o.b(object).g();
    }

    @Override
    public final void c(T t2, byte[] byArray, int n2, int n3, e e2) {
        this.F(t2, byArray, n2, n3, 0, e2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean d(T t2, T t3) {
        int n2 = this.a.length;
        int n3 = 0;
        while (true) {
            boolean bl = true;
            if (n3 >= n2) break;
            int n4 = this.P(n3);
            long l2 = n4 & 0xFFFFF;
            switch ((n4 & 0xFF00000) >>> 20) {
                default: {
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    long l3 = this.I(n3) & 0xFFFFF;
                    if (L0.p(t2, l3) != L0.p(t3, l3)) return false;
                    n4 = 1;
                    if (n4 == 0) return false;
                    if (!v0.c(L0.r(t2, l2), L0.r(t3, l2))) return false;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: 
                case 50: {
                    bl = v0.c(L0.r(t2, l2), L0.r(t3, l2));
                    break;
                }
                case 17: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (!v0.c(L0.r(t2, l2), L0.r(t3, l2))) return false;
                    break;
                }
                case 16: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.q(t2, l2) != L0.q(t3, l2)) return false;
                    break;
                }
                case 15: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 14: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.q(t2, l2) != L0.q(t3, l2)) return false;
                    break;
                }
                case 13: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 12: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 11: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 10: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (!v0.c(L0.r(t2, l2), L0.r(t3, l2))) return false;
                    break;
                }
                case 9: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (!v0.c(L0.r(t2, l2), L0.r(t3, l2))) return false;
                    break;
                }
                case 8: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (!v0.c(L0.r(t2, l2), L0.r(t3, l2))) return false;
                    break;
                }
                case 7: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.l(t2, l2) != L0.l(t3, l2)) return false;
                    break;
                }
                case 6: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 5: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.q(t2, l2) != L0.q(t3, l2)) return false;
                    break;
                }
                case 4: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.p(t2, l2) != L0.p(t3, l2)) return false;
                    break;
                }
                case 3: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.q(t2, l2) != L0.q(t3, l2)) return false;
                    break;
                }
                case 2: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (L0.q(t2, l2) != L0.q(t3, l2)) return false;
                    break;
                }
                case 1: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (Float.floatToIntBits(L0.o(t2, l2)) != Float.floatToIntBits(L0.o(t3, l2))) return false;
                    break;
                }
                case 0: {
                    if (!this.h(t2, t3, n3)) return false;
                    if (Double.doubleToLongBits(L0.n(t2, l2)) != Double.doubleToLongBits(L0.n(t3, l2))) return false;
                }
            }
            if (!bl) {
                return false;
            }
            n3 += 3;
        }
        if (!this.n.c(t2).equals(this.n.c(t3))) {
            return false;
        }
        if (!this.f) return true;
        return this.o.b(t2).equals(this.o.b(t3));
    }

    @Override
    public final T e() {
        return (T)this.l.a(this.e);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void f(T var1_1) {
        if (!m0.r(var1_1)) {
            return;
        }
        var5_2 = var1_1 instanceof I;
        var2_3 = 0;
        if (var5_2) {
            var8_4 = (I)var1_1;
            var8_4.t(0x7FFFFFFF);
            var8_4.a = 0;
            var8_4.n();
        }
        var3_5 = this.a.length;
        while (var2_3 < var3_5) {
            var4_6 = this.P(var2_3);
            var6_7 = 1048575 & var4_6;
            if ((var4_6 = (var4_6 & 0xFF00000) >>> 20) == 9) ** GOTO lbl-1000
            if (var4_6 == 60 || var4_6 == 68) ** GOTO lbl28
            switch (var4_6) {
                default: {
                    break;
                }
                case 50: {
                    var8_4 = m0.r;
                    var9_8 = var8_4.getObject(var1_1, var6_7);
                    if (var9_8 == null) break;
                    var8_4.putObject(var1_1, var6_7, this.p.f(var9_8));
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    this.m.b(var1_1, var6_7);
                    break;
                }
lbl28:
                // 1 sources

                if (!this.s(var1_1, this.a[var2_3], var2_3)) break;
                ** GOTO lbl32
                case 17: lbl-1000:
                // 2 sources

                {
                    if (!this.p(var1_1, var2_3)) break;
lbl32:
                    // 2 sources

                    this.m(var2_3).f(m0.r.getObject(var1_1, var6_7));
                }
            }
            var2_3 += 3;
        }
        this.n.d(var1_1);
        if (this.f) {
            this.o.e(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int g(T var1_1) {
        var8_2 = this.a.length;
        var6_4 = 0;
        for (var7_3 = 0; var7_3 < var8_2; var7_3 += 3) {
            block34: {
                block37: {
                    block35: {
                        block36: {
                            var10_9 = this.P(var7_3);
                            var9_8 = this.a[var7_3];
                            var11_10 = 1048575 & var10_9;
                            var5_7 = 37;
                            switch ((var10_9 & 0xFF00000) >>> 20) {
                                default: {
                                    var5_7 = var6_4;
                                    break block34;
                                }
                                case 68: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl47
                                }
                                case 67: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl81
                                }
                                case 66: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl71
                                }
                                case 65: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl81
                                }
                                case 64: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl71
                                }
                                case 63: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl71
                                }
                                case 62: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl71
                                }
                                case 61: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl100
                                }
                                case 60: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
lbl47:
                                    // 2 sources

                                    var14_12 = L0.r(var1_1, var11_10);
                                    var5_7 = var6_4 * 53;
                                    ** GOTO lbl103
                                }
                                case 59: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl111
                                }
                                case 58: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var13_11 = m0.z(var1_1, var11_10);
                                    ** GOTO lbl118
                                }
                                case 57: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl71
                                }
                                case 56: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl81
                                }
                                case 55: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
lbl71:
                                    // 6 sources

                                    var5_7 = var6_4 * 53;
                                    var6_4 = m0.C(var1_1, var11_10);
                                    ** GOTO lbl123
                                }
                                case 54: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl81
                                }
                                case 53: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
lbl81:
                                    // 5 sources

                                    var5_7 = var6_4 * 53;
                                    var11_10 = m0.D(var1_1, var11_10);
                                    break block35;
                                }
                                case 52: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var4_6 = m0.B(var1_1, var11_10);
                                    ** GOTO lbl132
                                }
                                case 51: {
                                    var5_7 = var6_4;
                                    if (!this.s(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var2_5 = m0.A(var1_1, var11_10);
                                    break block36;
                                }
                                case 17: {
                                    var14_12 = L0.r(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl109
                                    ** GOTO lbl108
                                }
lbl100:
                                // 2 sources

                                case 10: 
                                case 18: 
                                case 19: 
                                case 20: 
                                case 21: 
                                case 22: 
                                case 23: 
                                case 24: 
                                case 25: 
                                case 26: 
                                case 27: 
                                case 28: 
                                case 29: 
                                case 30: 
                                case 31: 
                                case 32: 
                                case 33: 
                                case 34: 
                                case 35: 
                                case 36: 
                                case 37: 
                                case 38: 
                                case 39: 
                                case 40: 
                                case 41: 
                                case 42: 
                                case 43: 
                                case 44: 
                                case 45: 
                                case 46: 
                                case 47: 
                                case 48: 
                                case 49: 
                                case 50: {
                                    var5_7 = var6_4 * 53;
                                    var14_12 = L0.r(var1_1, var11_10);
lbl103:
                                    // 2 sources

                                    var6_4 = var14_12.hashCode();
                                    break block37;
                                }
                                case 9: {
                                    var14_12 = L0.r(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl109
lbl108:
                                    // 2 sources

                                    var5_7 = var14_12.hashCode();
lbl109:
                                    // 3 sources

                                    var5_7 = var6_4 * 53 + var5_7;
                                    break block34;
                                }
lbl111:
                                // 2 sources

                                case 8: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = ((String)L0.r(var1_1, var11_10)).hashCode();
                                    break block37;
                                }
                                case 7: {
                                    var5_7 = var6_4 * 53;
                                    var13_11 = L0.l(var1_1, var11_10);
lbl118:
                                    // 2 sources

                                    var6_4 = N.a(var13_11);
                                    break block37;
                                }
                                case 4: 
                                case 6: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 15: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = L0.p(var1_1, var11_10);
lbl123:
                                    // 2 sources

                                    var5_7 += var6_4;
                                    break block34;
                                }
                                case 2: 
                                case 3: 
                                case 5: 
                                case 14: 
                                case 16: {
                                    var5_7 = var6_4 * 53;
                                    var11_10 = L0.q(var1_1, var11_10);
                                    break block35;
                                }
                                case 1: {
                                    var5_7 = var6_4 * 53;
                                    var4_6 = L0.o(var1_1, var11_10);
lbl132:
                                    // 2 sources

                                    var6_4 = Float.floatToIntBits(var4_6);
                                    break block37;
                                }
                                case 0: 
                            }
                            var5_7 = var6_4 * 53;
                            var2_5 = L0.n(var1_1, var11_10);
                        }
                        var11_10 = Double.doubleToLongBits(var2_5);
                    }
                    var6_4 = N.b(var11_10);
                }
                var5_7 = var6_4 + var5_7;
            }
            var6_4 = var5_7;
        }
        var5_7 = var6_4 = this.n.c(var1_1).hashCode() + var6_4 * 53;
        if (this.f) {
            var5_7 = var6_4 * 53 + this.o.b(var1_1).hashCode();
        }
        return var5_7;
    }
}

