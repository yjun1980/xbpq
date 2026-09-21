/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.c;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.y.V;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.z.a;
import com.github.catvod.spider.merge.z.b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class l {
    public final Class<?> a;
    public final Class<?> b;
    public final Constructor<?> c;
    public final Constructor<?> d;
    public final Method e;
    public final Method f;
    public final int g;
    public final e[] h;
    public final e[] i;
    public final int j;
    public final com.github.catvod.spider.merge.z.d k;
    public final String l;
    public final String m;
    public String[] n;
    public Type[] o;
    public String[] p;
    public boolean q;
    public Constructor<?> r;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public l(Class<?> var1_1, Class<?> var2_3, Constructor<?> var3_4, Constructor<?> var4_5, Method var5_6, Method var6_7, com.github.catvod.spider.merge.z.d var7_8, List<e> var8_9) {
        block25: {
            block27: {
                super();
                this.a = var1_1;
                this.b = var2_3;
                this.c = var3_4;
                this.d = var4_5;
                this.e = var5_6;
                var14_10 = A.b;
                var2_3 = A.D(var1_1, com.github.catvod.spider.merge.z.d.class);
                var12_11 = 0;
                var9_12 = var2_3 == null ? 0 : com.github.catvod.spider.merge.B.c.b(var2_3.parseFeatures());
                this.j = var9_12;
                this.f = var6_7;
                this.k = var7_8;
                if (var7_8 != null) {
                    var6_7 = var7_8.typeName();
                    var2_3 = var7_8.typeKey();
                    if (var2_3.length() <= 0) {
                        var2_3 = null;
                    }
                    this.m = var2_3;
                    var2_3 = var6_7.length() != 0 ? var6_7 : var1_1.getName();
                    this.l = var2_3;
                    var6_7 = var7_8.orders();
                    var2_3 = var6_7;
                    if (((Object[])var6_7).length == 0) {
                        var2_3 = null;
                    }
                    this.n = var2_3;
                } else {
                    this.l = var1_1.getName();
                    this.m = null;
                    this.n = null;
                }
                var10_13 = var8_9 /* !! */ .size();
                var7_8 = new e[var10_13];
                this.h = var7_8;
                var8_9 /* !! */ .toArray(var7_8);
                var6_7 = new e[var10_13];
                if (this.n != null) {
                    var2_3 = new LinkedHashMap<K, V>(var8_9 /* !! */ .size());
                    for (var9_12 = 0; var9_12 < var10_13; ++var9_12) {
                        var8_9 /* !! */  = var7_8[var9_12];
                        var2_3.put(var8_9 /* !! */ .a, var8_9 /* !! */ );
                    }
                    var8_9 /* !! */  = this.n;
                    var13_14 = var8_9 /* !! */ .length;
                    var9_12 = 0;
                    for (var10_13 = 0; var10_13 < var13_14; ++var10_13) {
                        var15_16 = var8_9 /* !! */ [var10_13];
                        var7_8 = (e)var2_3.get(var15_16);
                        var11_15 = var9_12;
                        if (var7_8 != null) {
                            var6_7[var9_12] = var7_8;
                            var2_3.remove(var15_16);
                            var11_15 = var9_12 + 1;
                        }
                        var9_12 = var11_15;
                    }
                    var2_3 = var2_3.values().iterator();
                    while (var2_3.hasNext()) {
                        var6_7[var9_12] = (e)var2_3.next();
                        ++var9_12;
                    }
                } else {
                    System.arraycopy(var7_8, 0, var6_7, 0, var10_13);
                    Arrays.sort(var6_7);
                }
                var2_3 = var6_7;
                if (Arrays.equals(this.h, var6_7)) {
                    var2_3 = this.h;
                }
                this.i = var2_3;
                if (var3_4 == null) break block27;
                var9_12 = var3_4.getParameterTypes().length;
                ** GOTO lbl76
            }
            if (var5_6 != null) {
                var9_12 = var5_6.getParameterTypes().length;
lbl76:
                // 2 sources

                this.g = var9_12;
            } else {
                this.g = 0;
            }
            if (var4_5 != null) {
                block26: {
                    this.o = var4_5.getParameterTypes();
                    this.q = var14_10 = A.f0(var1_1);
                    if (var14_10) {
                        this.p = A.Q(var1_1);
                        this.r = var1_1.getConstructor(new Class[0]);
lbl86:
                        // 2 sources

                        while (true) {
                            var2_3 = A.S(var4_5);
                            for (var9_12 = 0; var9_12 < this.p.length && var9_12 < ((Object)var2_3).length; ++var9_12) {
                                block24: {
                                    for (Object var1_1 : var2_3[var9_12]) {
                                        if (!(var1_1 instanceof b)) continue;
                                        var1_1 = (b)var1_1;
                                        break block24;
                                    }
                                    var1_1 = null;
                                }
                                if (var1_1 == null || (var1_1 = var1_1.name()).length() <= 0) continue;
                                this.p[var9_12] = var1_1;
                            }
                            break block25;
                            break;
                        }
                    }
                    if (this.o.length != this.h.length) {
                        var9_12 = var12_11;
                    } else {
                        for (var9_12 = 0; var9_12 < ((Type[])(var1_1 = this.o)).length; ++var9_12) {
                            if (var1_1[var9_12] == this.h[var9_12].e) continue;
                            var9_12 = var12_11;
                            break block26;
                        }
                        var9_12 = 1;
                    }
                }
                if (var9_12 == 0) {
                    this.p = com.github.catvod.spider.merge.H.c.e(var4_5);
                }
            }
        }
        return;
        catch (Throwable var1_2) {
            ** continue;
        }
    }

    static boolean a(List<e> list, e e2) {
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            e e3 = list.get(i2);
            if (!e3.a.equals(e2.a) || e3.h && !e2.h) continue;
            if (e3.e.isAssignableFrom(e2.e)) {
                list.set(i2, e2);
                return true;
            }
            if (e3.b(e2) < 0) {
                list.set(i2, e2);
                return true;
            }
            return false;
        }
        list.add(e2);
        return true;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static l b(Class var0, Type var1_1, boolean var2_2) {
        block172: {
            block171: {
                block138: {
                    block144: {
                        block145: {
                            var20_3 /* !! */  = String.class;
                            var21_4 = Object.class;
                            var30_5 = A.D(var0, com.github.catvod.spider.merge.z.d.class);
                            if (var30_5 == null || (var13_6 = var30_5.naming()) == null || var13_6 == V.a) {
                                var13_6 = null;
                            }
                            var29_9 = com.github.catvod.spider.merge.H.l.e(var0, (com.github.catvod.spider.merge.z.d)var30_5);
                            var16_10 = var0.getDeclaredFields();
                            var14_11 = var0.getMethods();
                            var36_12 = com.github.catvod.spider.merge.H.l.c(var0);
                            var12_13 = A.f0(var0);
                            var23_14 = var0.getDeclaredConstructors();
                            if (var12_13 && ((Constructor<?>[])var23_14).length != 1) {
                                var28_15 = null;
                            } else {
                                var15_16 = var29_9 == null ? com.github.catvod.spider.merge.H.l.g(var0, var23_14) : com.github.catvod.spider.merge.H.l.g(var29_9, var29_9.getDeclaredConstructors());
                                var28_15 = var15_16;
                            }
                            var34_18 = null;
                            var33_19 = null;
                            var35_20 = null;
                            var17_21 /* !! */  = new ArrayList();
                            if (var2_2) {
                                for (var14_11 = var0; var14_11 != null; var14_11 = var14_11.getSuperclass()) {
                                    com.github.catvod.spider.merge.H.l.d(var0, (Type)var1_1, (V)var13_6, var17_21 /* !! */ , var14_11.getDeclaredFields());
                                }
                                if (var28_15 != null) {
                                    A.s0(var28_15);
                                }
                                return new l(var0, (Class<?>)var29_9, var28_15, null, null, null, (com.github.catvod.spider.merge.z.d)var30_5, (List<e>)var17_21 /* !! */ );
                            }
                            var4_22 = !var0.isInterface() && !Modifier.isAbstract(var0.getModifiers()) ? 0 : 1;
                            if ((var28_15 != null || var29_9 != null) && var4_22 == 0) break block144;
                            var15_16 = com.github.catvod.spider.merge.y.a.d(var0);
                            if (!(var15_16 instanceof Class) || (var15_16 = com.github.catvod.spider.merge.H.l.f(var15_16.getConstructors())) == null) break block145;
                            var15_16 = var0.getConstructor(var15_16.getParameterTypes());
                            ** GOTO lbl38
                        }
lbl36:
                        // 2 sources

                        while (true) {
                            block151: {
                                block140: {
                                    block155: {
                                        block150: {
                                            block146: {
                                                block147: {
                                                    var15_16 = null;
lbl38:
                                                    // 2 sources

                                                    var18_23 = var15_16;
                                                    if (var15_16 == null) {
                                                        var18_23 = com.github.catvod.spider.merge.H.l.f((Constructor[])var23_14);
                                                    }
                                                    if ((var15_16 = var18_23) == null || var4_22 != 0) break block146;
                                                    A.s0((AccessibleObject)var15_16);
                                                    var32_24 /* !! */  = var15_16.getParameterTypes();
                                                    var27_25 = var17_21 /* !! */ ;
                                                    var25_26 /* !! */  = var14_11;
                                                    var23_14 = var16_10;
                                                    var26_27 = var13_6;
                                                    var24_28 = var21_4;
                                                    var22_29 /* !! */  = var20_3 /* !! */ ;
                                                    if (var32_24 /* !! */ .length <= 0) break block147;
                                                    var31_30 = A.S((Constructor)var15_16);
                                                    var22_29 /* !! */  = null;
                                                    var4_22 = 0;
                                                    var19_31 = var20_3 /* !! */ ;
                                                    var20_3 /* !! */  = var21_4;
                                                    var18_23 = var13_6;
                                                    var21_4 = var14_11;
                                                    var13_6 = var22_29 /* !! */ ;
                                                    while (true) {
                                                        block149: {
                                                            block148: {
                                                                block137: {
                                                                    var27_25 = var17_21 /* !! */ ;
                                                                    var25_26 /* !! */  = var21_4;
                                                                    var23_14 = var16_10;
                                                                    var26_27 = var18_23;
                                                                    var24_28 = var20_3 /* !! */ ;
                                                                    var22_29 /* !! */  = var19_31;
                                                                    if (var4_22 >= var32_24 /* !! */ .length) break;
                                                                    var27_25 = var17_21 /* !! */ ;
                                                                    var25_26 /* !! */  = var21_4;
                                                                    var23_14 = var16_10;
                                                                    var26_27 = var18_23;
                                                                    var24_28 = var20_3 /* !! */ ;
                                                                    var22_29 /* !! */  = var19_31;
                                                                    if (var4_22 >= ((Object)var31_30).length) break;
                                                                    var14_11 = var31_30[var4_22];
                                                                    var6_33 = ((Object)var14_11).length;
                                                                    for (var5_32 = 0; var5_32 < var6_33; ++var5_32) {
                                                                        var22_29 /* !! */  = var14_11[var5_32];
                                                                        if (!(var22_29 /* !! */  instanceof b)) continue;
                                                                        var14_11 = (b)var22_29 /* !! */ ;
                                                                        break block137;
                                                                    }
                                                                    var14_11 = null;
                                                                }
                                                                var25_26 /* !! */  = var32_24 /* !! */ [var4_22];
                                                                var26_27 = var15_16.getGenericParameterTypes()[var4_22];
                                                                if (var14_11 != null) {
                                                                    var22_29 /* !! */  = A.N(var0, var14_11.name(), (Field[])var16_10);
                                                                    var7_34 = var14_11.ordinal();
                                                                    var6_33 = i0.h(var14_11.serialzeFeatures());
                                                                    var5_32 = com.github.catvod.spider.merge.B.c.b(var14_11.parseFeatures());
                                                                    var23_14 = var14_11.name();
                                                                } else {
                                                                    var22_29 /* !! */  = null;
                                                                    var23_14 = null;
                                                                    var7_34 = 0;
                                                                    var6_33 = 0;
                                                                    var5_32 = 0;
                                                                }
                                                                if (var23_14 == null) break block148;
                                                                var14_11 = var13_6;
                                                                var24_28 = var23_14;
                                                                if (var23_14.length() != 0) break block149;
                                                            }
                                                            var14_11 = var13_6;
                                                            if (var13_6 == null) {
                                                                var14_11 = com.github.catvod.spider.merge.H.c.e((AccessibleObject)var15_16);
                                                            }
                                                            var24_28 = var14_11[var4_22];
                                                        }
                                                        if (var22_29 /* !! */  != null) ** GOTO lbl-1000
                                                        var13_6 = var14_11;
                                                        if (var14_11 == null) {
                                                            var13_6 = var12_13 != false ? A.Q(var0) : com.github.catvod.spider.merge.H.c.e((AccessibleObject)var15_16);
                                                        }
                                                        var14_11 = var13_6;
                                                        if (((Object)var13_6).length > var4_22) {
                                                            var14_11 = A.N(var0, (String)var13_6[var4_22], (Field[])var16_10);
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var13_6 = var14_11;
                                                            var14_11 = var22_29 /* !! */ ;
                                                        }
                                                        com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , new e((String)var24_28, var0, (Class<?>)var25_26 /* !! */ , (Type)var26_27, (Field)var14_11, var7_34, var6_33, var5_32));
                                                        ++var4_22;
                                                    }
                                                }
                                                var17_21 /* !! */  = var27_25;
                                                var16_10 = var26_27;
                                                var13_6 = var25_26 /* !! */ ;
                                                var18_23 = var23_14;
                                                var14_11 = var22_29 /* !! */ ;
                                                var25_26 /* !! */  = var35_20;
                                                var19_31 = var15_16;
                                                var15_16 = var24_28;
                                                break block138;
                                            }
                                            var20_3 /* !! */  = var17_21 /* !! */ ;
                                            var21_4 = var13_6;
                                            var13_6 = Object.class;
                                            var18_23 = String.class;
                                            var22_29 /* !! */  = var14_11;
                                            var17_21 /* !! */  = var16_10;
                                            var6_33 = var22_29 /* !! */ .length;
                                            var16_10 = null;
                                            for (var5_32 = 0; var5_32 < var6_33; ++var5_32) {
                                                var19_31 = var22_29 /* !! */ [var5_32];
                                                if (!Modifier.isStatic(var19_31.getModifiers())) {
                                                    var14_11 = var16_10;
                                                } else if (!var0.isAssignableFrom(var19_31.getReturnType())) {
                                                    var14_11 = var16_10;
                                                } else {
                                                    var14_11 = var16_10;
                                                    if (A.F((Method)var19_31, a.class) != null) {
                                                        if (var16_10 == null) {
                                                            var14_11 = var19_31;
                                                        } else {
                                                            throw new d("multi-JSONCreator");
                                                        }
                                                    }
                                                }
                                                var16_10 = var14_11;
                                            }
                                            if (var16_10 == null) break block150;
                                            A.s0((AccessibleObject)var16_10);
                                            var13_6 = var16_10.getParameterTypes();
                                            if (((Field[])var13_6).length <= 0) break block151;
                                            var18_23 = A.T((Method)var16_10);
                                            var1_1 = null;
                                            var15_16 = var13_6;
                                            for (var4_22 = 0; var4_22 < ((Object)var15_16).length; ++var4_22) {
                                                block152: {
                                                    block154: {
                                                        block153: {
                                                            block139: {
                                                                var13_6 = var18_23[var4_22];
                                                                var6_33 = ((Field[])var13_6).length;
                                                                for (var5_32 = 0; var5_32 < var6_33; ++var5_32) {
                                                                    var14_11 = var13_6[var5_32];
                                                                    if (!(var14_11 instanceof b)) continue;
                                                                    var13_6 = (b)var14_11;
                                                                    break block139;
                                                                }
                                                                var13_6 = null;
                                                            }
                                                            if (var13_6 == null) break block152;
                                                            if (var13_6 != null) {
                                                                var14_11 = var13_6.name();
                                                                var5_32 = var13_6.ordinal();
                                                                var8_36 = i0.h(var13_6.serialzeFeatures());
                                                                var7_35 = com.github.catvod.spider.merge.B.c.b(var13_6.parseFeatures());
                                                                var6_33 = var5_32;
                                                                var5_32 = var7_35;
                                                            } else {
                                                                var14_11 = null;
                                                                var6_33 = 0;
                                                                var8_36 = 0;
                                                                var5_32 = 0;
                                                            }
                                                            if (var14_11 == null) break block153;
                                                            var13_6 = var1_1;
                                                            var19_31 = var14_11;
                                                            if (var14_11.length() != 0) break block154;
                                                        }
                                                        var13_6 = var1_1;
                                                        if (var1_1 == null) {
                                                            var13_6 = com.github.catvod.spider.merge.H.c.e((AccessibleObject)var16_10);
                                                        }
                                                        var19_31 = var13_6[var4_22];
                                                    }
                                                    com.github.catvod.spider.merge.H.l.a(var20_3 /* !! */ , new e((String)var19_31, var0, (Class<?>)var15_16[var4_22], var16_10.getGenericParameterTypes()[var4_22], A.N(var0, var19_31, var17_21 /* !! */ ), var6_33, var8_36, var5_32));
                                                    var1_1 = var13_6;
                                                    continue;
                                                }
                                                throw new d("illegal json creator");
                                            }
                                            return new l(var0, (Class<?>)var29_9, null, null, (Method)var16_10, null, (com.github.catvod.spider.merge.z.d)var30_5, (List<e>)var20_3 /* !! */ );
                                        }
                                        if (var4_22 != 0) break block151;
                                        var31_30 = var0.getName();
                                        if (!var12_13 || ((Constructor[])var23_14).length <= 0) break block155;
                                        var14_11 = A.Q(var0);
                                        var18_23 = A.R((Constructor[])var23_14, (String[])var14_11);
                                        A.s0((AccessibleObject)var18_23);
                                        var15_16 = String.class;
                                        ** GOTO lbl224
                                    }
                                    var5_32 = ((Constructor[])var23_14).length;
                                    var19_31 = null;
                                    var14_11 = var18_23;
                                    for (var4_22 = 0; var4_22 < var5_32; ++var4_22) {
                                        block161: {
                                            block159: {
                                                block157: {
                                                    block160: {
                                                        block158: {
                                                            block156: {
                                                                var18_23 = var23_14[var4_22];
                                                                var32_24 /* !! */  = var18_23.getParameterTypes();
                                                                if (!var31_30.equals("org.springframework.security.web.authentication.WebAuthenticationDetails")) break block156;
                                                                if (var32_24 /* !! */ .length != 2 || (var25_26 /* !! */  = var32_24 /* !! */ [0]) != (var24_28 = var14_11) || var32_24 /* !! */ [1] != var24_28) break block157;
                                                                var18_23.setAccessible(true);
                                                                var14_11 = com.github.catvod.spider.merge.H.c.e((AccessibleObject)var18_23);
                                                                var15_16 = var24_28;
lbl224:
                                                                // 2 sources

                                                                var19_31 = var15_16;
                                                                break block158;
                                                            }
                                                            var24_28 = var14_11;
                                                            if (!var31_30.equals("org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken")) break block159;
                                                            if (var32_24 /* !! */ .length != 3) break block157;
                                                            var25_26 /* !! */  = var32_24 /* !! */ [0];
                                                            var27_25 = var13_6;
                                                            if (var25_26 /* !! */  != var27_25) break block160;
                                                            var26_27 = var19_31;
                                                            var25_26 /* !! */  = var15_16;
                                                            if (var32_24 /* !! */ [1] != var27_25) break block161;
                                                            var26_27 = var19_31;
                                                            var25_26 /* !! */  = var15_16;
                                                            if (var32_24 /* !! */ [2] != Collection.class) break block161;
                                                            var18_23.setAccessible(true);
                                                            var14_11 = new String[]{"principal", "credentials", "authorities"};
                                                            var19_31 = var24_28;
                                                            var13_6 = var27_25;
                                                        }
lbl244:
                                                        // 2 sources

                                                        while (true) {
                                                            var23_14 = var18_23;
                                                            var18_23 = var14_11;
                                                            var15_16 = var13_6;
                                                            var14_11 = var19_31;
                                                            var13_6 = var23_14;
                                                            break block140;
                                                            break;
                                                        }
                                                        break block161;
                                                    }
                                                    var26_27 = var19_31;
                                                    var25_26 /* !! */  = var15_16;
                                                    break block161;
                                                }
                                                var26_27 = var19_31;
                                                var25_26 /* !! */  = var15_16;
                                                break block161;
                                            }
                                            var27_25 = var13_6;
                                            if (var31_30.equals("org.springframework.security.core.authority.SimpleGrantedAuthority")) {
                                                var26_27 = var19_31;
                                                var25_26 /* !! */  = var15_16;
                                                if (var32_24 /* !! */ .length == 1) {
                                                    var26_27 = var19_31;
                                                    var25_26 /* !! */  = var15_16;
                                                    if (var32_24 /* !! */ [0] == var24_28) {
                                                        var14_11 = new String[]{"authority"};
                                                        var13_6 = var27_25;
                                                        var19_31 = var24_28;
                                                        ** continue;
                                                    }
                                                }
                                            } else {
                                                var6_33 = (var18_23.getModifiers() & 1) != 0 ? 1 : 0;
                                                if (var6_33 == 0) {
                                                    var26_27 = var19_31;
                                                    var25_26 /* !! */  = var15_16;
                                                } else {
                                                    var26_27 = com.github.catvod.spider.merge.H.c.e((AccessibleObject)var18_23);
                                                    if (((AccessibleObject[])var26_27).length == 0) {
                                                        var26_27 = var19_31;
                                                        var25_26 /* !! */  = var15_16;
                                                    } else if (var15_16 != null && var19_31 != null && ((AccessibleObject[])var26_27).length <= ((Class<?>[])var19_31).length) {
                                                        var26_27 = var19_31;
                                                        var25_26 /* !! */  = var15_16;
                                                    } else {
                                                        var25_26 /* !! */  = var18_23;
                                                    }
                                                }
                                            }
                                        }
                                        var19_31 = var26_27;
                                        var15_16 = var25_26 /* !! */ ;
                                    }
                                    var18_23 = var13_6;
                                    var13_6 = var15_16;
                                    var15_16 = var18_23;
                                    var18_23 = var19_31;
                                }
                                var19_31 = var18_23 != null ? var13_6.getParameterTypes() : null;
                                if (var18_23 != null && ((Class<?>[])var19_31).length == ((Object)var18_23).length) {
                                    var27_25 = A.S((Constructor)var13_6);
                                    var23_14 = var31_30;
                                    var24_28 = var18_23;
                                    var25_26 /* !! */  = var19_31;
                                    for (var7_34 = 0; var7_34 < var25_26 /* !! */ .length; ++var7_34) {
                                        block141: {
                                            var19_31 = var27_25[var7_34];
                                            var18_23 = var24_28[var7_34];
                                            var5_32 = ((Class<?>[])var19_31).length;
                                            for (var4_22 = 0; var4_22 < var5_32; ++var4_22) {
                                                var26_27 = var19_31[var4_22];
                                                if (!(var26_27 instanceof b)) continue;
                                                var19_31 = (b)var26_27;
                                                break block141;
                                            }
                                            var19_31 = null;
                                        }
                                        var35_20 = var25_26 /* !! */ [var7_34];
                                        var32_24 /* !! */  = var13_6.getGenericParameterTypes()[var7_34];
                                        var31_30 = A.N(var0, (String)var18_23, var17_21 /* !! */ );
                                        var26_27 = var19_31;
                                        if (var31_30 != null) {
                                            var26_27 = var19_31;
                                            if (var19_31 == null) {
                                                var26_27 = A.E((Field)var31_30, b.class);
                                            }
                                        }
                                        if (var26_27 == null) {
                                            if ("org.springframework.security.core.userdetails.User".equals(var23_14) && "password".equals(var18_23)) {
                                                var6_33 = com.github.catvod.spider.merge.B.c.l.a;
                                                var4_22 = 0;
                                                var5_32 = 0;
                                            } else {
                                                var4_22 = 0;
                                                var5_32 = 0;
                                                var6_33 = 0;
                                            }
                                        } else {
                                            var19_31 = var26_27.name();
                                            if (var19_31.length() != 0) {
                                                var18_23 = var19_31;
                                            }
                                            var4_22 = var26_27.ordinal();
                                            var5_32 = i0.h(var26_27.serialzeFeatures());
                                            var6_33 = com.github.catvod.spider.merge.B.c.b(var26_27.parseFeatures());
                                        }
                                        com.github.catvod.spider.merge.H.l.a((List<e>)var20_3 /* !! */ , new e((String)var18_23, var0, (Class<?>)var35_20, (Type)var32_24 /* !! */ , (Field)var31_30, var4_22, var5_32, var6_33));
                                    }
                                    var19_31 = var15_16;
                                    var23_14 = var16_10;
                                    var24_28 = var17_21 /* !! */ ;
                                    var25_26 /* !! */  = var14_11;
                                    var14_11 = var25_26 /* !! */ ;
                                    var15_16 = var13_6;
                                    var16_10 = var19_31;
                                    var18_23 = var24_28;
                                    var17_21 /* !! */  = var23_14;
                                    if (!var12_13) {
                                        var14_11 = var25_26 /* !! */ ;
                                        var15_16 = var13_6;
                                        var16_10 = var19_31;
                                        var18_23 = var24_28;
                                        var17_21 /* !! */  = var23_14;
                                        if (!var0.getName().equals("javax.servlet.http.Cookie")) {
                                            return new l(var0, (Class<?>)var29_9, null, (Constructor<?>)var13_6, null, null, (com.github.catvod.spider.merge.z.d)var30_5, (List<e>)var20_3 /* !! */ );
                                        }
                                    }
lbl359:
                                    // 5 sources

                                    while (true) {
                                        var25_26 /* !! */  = var17_21 /* !! */ ;
                                        var13_6 = var22_29 /* !! */ ;
                                        var17_21 /* !! */  = var20_3 /* !! */ ;
                                        var19_31 = var15_16;
                                        var15_16 = var16_10;
                                        var16_10 = var21_4;
                                        break block138;
                                        break;
                                    }
                                }
                                var1_1 = new StringBuilder();
                                var1_1.append("default constructor not found. ");
                                var1_1.append(var0);
                                throw new d(var1_1.toString());
                            }
                            var13_6 = var16_10;
                            var16_10 = Object.class;
                            var14_11 = String.class;
                            var18_23 = var17_21 /* !! */ ;
                            var17_21 /* !! */  = var13_6;
                            ** continue;
                            break;
                        }
                    }
                    var18_23 = var16_10;
                    var16_10 = var13_6;
                    var15_16 = Object.class;
                    var13_6 = var14_11;
                    var19_31 = null;
                    var25_26 /* !! */  = var35_20;
                    var14_11 = var20_3 /* !! */ ;
                }
                if (var28_15 != null) {
                    A.s0(var28_15);
                }
                var26_27 = "set";
                if (var29_9 == null) ** GOTO lbl496
                var20_3 /* !! */  = A.D(var29_9, com.github.catvod.spider.merge.z.c.class);
                var20_3 /* !! */  = var20_3 /* !! */  != null ? var20_3 /* !! */ .withPrefix() : null;
                var21_4 = var20_3 /* !! */ ;
                if (var20_3 /* !! */  == null) {
                    var21_4 = "with";
                }
                var24_28 = var21_4;
                var27_25 = var29_9.getMethods();
                var4_22 = ((AccessibleObject[])var27_25).length;
                var21_4 = var14_11;
                var22_29 /* !! */  = var13_6;
                var23_14 = var30_5;
                var13_6 = var26_27;
                var20_3 /* !! */  = var29_9;
                var14_11 = var24_28;
                var26_27 = var27_25;
                for (var5_32 = 0; var5_32 < var4_22; ++var5_32) {
                    block170: {
                        block169: {
                            block167: {
                                block168: {
                                    block166: {
                                        block165: {
                                            block163: {
                                                block164: {
                                                    block162: {
                                                        var29_9 = var26_27[var5_32];
                                                        if (Modifier.isStatic(var29_9.getModifiers()) || !var29_9.getReturnType().equals(var20_3 /* !! */ )) break block162;
                                                        var27_25 = var24_28 = A.F((Method)var29_9, b.class);
                                                        if (var24_28 == null) {
                                                            var27_25 = A.X(var0, (Method)var29_9);
                                                        }
                                                        if (var27_25 == null) break block163;
                                                        if (var27_25.deserialize()) break block164;
                                                    }
                                                    var24_28 = var14_11;
                                                    var24_28 = var13_6;
                                                    continue;
                                                }
                                                var6_33 = var27_25.ordinal();
                                                var7_34 = i0.h(var27_25.serialzeFeatures());
                                                var8_37 = com.github.catvod.spider.merge.B.c.b(var27_25.parseFeatures());
                                                if (var27_25.name().length() != 0) {
                                                    com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , new e(var27_25.name(), (Method)var29_9, null, var0, (Type)var1_1, var6_33, var7_34, var8_37, (b)var27_25, null, null, var36_12));
                                                    var24_28 = var14_11;
                                                    var24_28 = var13_6;
                                                    continue;
                                                }
                                                break block165;
                                            }
                                            var6_33 = 0;
                                            var7_34 = 0;
                                            var8_37 = 0;
                                        }
                                        if (!(var24_28 = var29_9.getName()).startsWith((String)var13_6) || var24_28.length() <= 3) break block166;
                                        var24_28 = new StringBuilder(var24_28.substring(3));
                                        break block167;
                                    }
                                    if (var14_11.length() != 0) break block168;
                                    var24_28 = new StringBuilder((String)var24_28);
                                    break block167;
                                }
                                if (!var24_28.startsWith((String)var14_11) || var24_28.length() <= var14_11.length()) break block169;
                                var24_28 = new StringBuilder(var24_28.substring(var14_11.length()));
                            }
                            var3_38 = var24_28.charAt(0);
                            if (var14_11.length() == 0 || Character.isUpperCase(var3_38)) break block170;
                        }
                        var24_28 = var14_11;
                        var24_28 = var13_6;
                        continue;
                    }
                    var24_28.setCharAt(0, Character.toLowerCase(var3_38));
                    var30_5 = var24_28.toString();
                    var24_28 = var14_11;
                    var24_28 = var13_6;
                    com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , new e((String)var30_5, (Method)var29_9, null, var0, (Type)var1_1, var6_33, var7_34, var8_37, (b)var27_25, null, null, var36_12));
                }
                var24_28 = var13_6;
                var26_27 = var23_14;
                var23_14 = var15_16;
                var27_25 = var16_10;
                var15_16 = var20_3 /* !! */ ;
                var13_6 = A.D(var15_16, com.github.catvod.spider.merge.z.c.class);
                var13_6 = var13_6 != null ? var13_6.buildMethod() : null;
                if (var13_6 == null) break block171;
                var14_11 = var13_6;
                if (var13_6.length() != 0) break block172;
            }
            var14_11 = "build";
        }
        try {
            var14_11 = var15_16.getMethod((String)var14_11, new Class[0]);
        }
        catch (NoSuchMethodException | SecurityException var13_7) {
            var14_11 = var33_19;
        }
        var13_6 = var14_11;
        if (var14_11 == null) {
            try {
                var13_6 = var15_16.getMethod("create", new Class[0]);
            }
            catch (NoSuchMethodException | SecurityException var13_8) {
                var13_6 = var14_11;
            }
        }
        if (var13_6 != null) {
            A.s0((AccessibleObject)var13_6);
            var16_10 = var23_14;
            var20_3 /* !! */  = var22_29 /* !! */ ;
            var23_14 = var13_6;
            var22_29 /* !! */  = var26_27;
            var13_6 = var27_25;
            var14_11 = var24_28;
        } else {
            throw new d("buildMethod not found.");
lbl496:
            // 1 sources

            var23_14 = "set";
            var22_29 /* !! */  = var30_5;
            var21_4 = var14_11;
            var20_3 /* !! */  = var13_6;
            var14_11 = var23_14;
            var13_6 = var16_10;
            var23_14 = var34_18;
            var16_10 = var15_16;
            var15_16 = var29_9;
        }
        var7_34 = var20_3 /* !! */ .length;
        var8_37 = 0;
        var24_28 = var13_6;
        var13_6 = var18_23;
        var26_27 = var20_3 /* !! */ ;
        var27_25 = var16_10;
        var20_3 /* !! */  = var15_16;
        while (true) {
            block142: {
                block173: {
                    block192: {
                        block191: {
                            block193: {
                                block189: {
                                    block184: {
                                        block188: {
                                            block190: {
                                                block181: {
                                                    block187: {
                                                        block182: {
                                                            block186: {
                                                                block185: {
                                                                    block183: {
                                                                        block180: {
                                                                            block176: {
                                                                                block178: {
                                                                                    block175: {
                                                                                        block179: {
                                                                                            block177: {
                                                                                                block174: {
                                                                                                    var15_16 = "get";
                                                                                                    if (var8_37 >= var7_34) break;
                                                                                                    var31_30 = var26_27[var8_37];
                                                                                                    var4_22 = 0;
                                                                                                    var5_32 = 0;
                                                                                                    var6_33 = 0;
                                                                                                    var16_10 = var31_30.getName();
                                                                                                    if (Modifier.isStatic(var31_30.getModifiers()) || !(var15_16 = var31_30.getReturnType()).equals(Void.TYPE) && !var15_16.equals(var31_30.getDeclaringClass()) || var31_30.getDeclaringClass() == var27_25 || (var32_24 /* !! */  = var31_30.getParameterTypes()).length == 0 || var32_24 /* !! */ .length > 2) break block173;
                                                                                                    var15_16 = A.F((Method)var31_30, b.class);
                                                                                                    if (var15_16 == null || var32_24 /* !! */ .length != 2 || var32_24 /* !! */ [0] != var21_4 || var32_24 /* !! */ [1] != var27_25) break block174;
                                                                                                    var15_16 = new e("", (Method)var31_30, null, var0, (Type)var1_1, 0, 0, 0, (b)var15_16, null, null, var36_12);
                                                                                                    break block175;
                                                                                                }
                                                                                                if (var32_24 /* !! */ .length != 1) break block176;
                                                                                                var29_9 = var15_16;
                                                                                                if (var15_16 == null) {
                                                                                                    var29_9 = A.X(var0, (Method)var31_30);
                                                                                                }
                                                                                                if (var29_9 == null && var16_10.length() < 4) break block177;
                                                                                                if (var29_9 == null) break block178;
                                                                                                if (var29_9.deserialize()) break block179;
                                                                                            }
                                                                                            var15_16 = var13_6;
                                                                                            var15_16 = var14_11;
                                                                                            break block142;
                                                                                        }
                                                                                        var11_41 = var29_9.ordinal();
                                                                                        var10_40 = i0.h(var29_9.serialzeFeatures());
                                                                                        var9_39 = com.github.catvod.spider.merge.B.c.b(var29_9.parseFeatures());
                                                                                        var4_22 = var11_41;
                                                                                        var5_32 = var10_40;
                                                                                        var6_33 = var9_39;
                                                                                        if (var29_9.name().length() == 0) break block178;
                                                                                        var15_16 = new e(var29_9.name(), (Method)var31_30, null, var0, (Type)var1_1, var11_41, var10_40, var9_39, (b)var29_9, null, null, var36_12);
                                                                                    }
                                                                                    com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , (e)var15_16);
                                                                                    break block176;
                                                                                }
                                                                                if ((var29_9 != null || var16_10.startsWith((String)var14_11)) && var20_3 /* !! */  == null) break block180;
                                                                            }
                                                                            var15_16 = var13_6;
                                                                            var15_16 = var14_11;
                                                                            break block142;
                                                                        }
                                                                        var3_38 = var16_10.charAt(3);
                                                                        if (var12_13) {
                                                                            var18_23 = new ArrayList<E>();
                                                                            var9_39 = 0;
                                                                            while (true) {
                                                                                var15_16 = var18_23;
                                                                                if (var9_39 < ((Object)var26_27).length) {
                                                                                    if (var26_27[var9_39].getName().startsWith("get")) {
                                                                                        var18_23.add(var26_27[var9_39].getName());
                                                                                    }
                                                                                    ++var9_39;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            var15_16 = null;
                                                                        }
                                                                        if (Character.isUpperCase(var3_38) || var3_38 > '\u0200') break block181;
                                                                        if (var3_38 != '_') break block182;
                                                                        if (!var12_13) break block183;
                                                                        var18_23 = com.github.catvod.spider.merge.C.a.c("g");
                                                                        var18_23.append(var16_10.substring(1));
                                                                        if (var15_16.contains(var18_23.toString())) {
                                                                            var15_16 = var16_10.substring(3);
                                                                        } else {
                                                                            var15_16 = com.github.catvod.spider.merge.C.a.c("is");
                                                                            var15_16.append(var16_10.substring(3));
                                                                            var15_16 = var15_16.toString();
                                                                        }
                                                                        var16_10 = A.N(var0, (String)var15_16, (Field[])var13_6);
                                                                        break block184;
                                                                    }
                                                                    var30_5 = var16_10.substring(4);
                                                                    var15_16 = var18_23 = A.N(var0, var30_5, (Field[])var13_6);
                                                                    if (var18_23 != null) break block185;
                                                                    var16_10 = var16_10.substring(3);
                                                                    var15_16 = var18_23 = A.N(var0, (String)var16_10, (Field[])var13_6);
                                                                    if (var18_23 != null) break block186;
                                                                    var15_16 = var18_23;
                                                                }
                                                                var16_10 = var30_5;
                                                            }
                                                            var18_23 = var15_16;
                                                            var15_16 = var16_10;
                                                            var16_10 = var18_23;
                                                            break block184;
                                                        }
                                                        if (var3_38 != 'f') break block187;
                                                        var15_16 = var16_10.substring(3);
                                                        break block188;
                                                    }
                                                    if (var16_10.length() >= 5 && Character.isUpperCase(var16_10.charAt(4))) ** GOTO lbl-1000
                                                    var15_16 = var16_10.substring(3);
                                                    var16_10 = var18_23 = A.N(var0, (String)var15_16, (Field[])var13_6);
                                                    if (var18_23 != null) break block184;
                                                    break block189;
                                                }
                                                if (!var12_13) break block190;
                                                var15_16 = com.github.catvod.spider.merge.C.a.c("g");
                                                var15_16.append(var16_10.substring(1));
                                                var15_16 = var15_16.toString();
                                                ** GOTO lbl-1000
                                            }
                                            var15_16 = var16_10;
                                            if (A.b) lbl-1000:
                                            // 2 sources

                                            {
                                                var15_16 = A.y(var16_10.substring(3));
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var15_16 = A.V((String)var15_16);
                                            }
                                        }
                                        var16_10 = null;
                                    }
                                    var18_23 = var16_10;
                                    if (var16_10 == null) {
                                        var18_23 = A.N(var0, (String)var15_16, (Field[])var13_6);
                                    }
                                    var16_10 = var18_23;
                                    if (var18_23 == null) {
                                        var16_10 = var18_23;
                                        if (var32_24 /* !! */ [0] == Boolean.TYPE) {
                                            var16_10 = com.github.catvod.spider.merge.C.a.c("is");
                                            var16_10.append(Character.toUpperCase(var15_16.charAt(0)));
                                            var16_10.append(var15_16.substring(1));
                                            var16_10 = A.N(var0, var16_10.toString(), (Field[])var13_6);
                                        }
                                    }
                                    if (var16_10 == null) break block191;
                                    var18_23 = A.E((Field)var16_10, b.class);
                                    if (var18_23 == null) break block192;
                                    if (var18_23.deserialize()) break block193;
                                }
                                var15_16 = var13_6;
lbl646:
                                // 2 sources

                                while (true) {
                                    var15_16 = var13_6;
                                    var15_16 = var14_11;
                                    break block142;
                                    break;
                                }
                            }
                            var10_40 = var18_23.ordinal();
                            var9_39 = i0.h(var18_23.serialzeFeatures());
                            var11_41 = com.github.catvod.spider.merge.B.c.b(var18_23.parseFeatures());
                            var4_22 = var10_40;
                            var5_32 = var9_39;
                            var6_33 = var11_41;
                            if (var18_23.name().length() != 0) {
                                var30_5 = var18_23.name();
                                var15_16 = var13_6;
                                com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , new e((String)var30_5, (Method)var31_30, (Field)var16_10, var0, (Type)var1_1, var10_40, var9_39, var11_41, (b)var29_9, (b)var18_23, null, var36_12));
                                ** continue;
                            }
                            break block192;
                        }
                        var18_23 = null;
                    }
                    var30_5 = var13_6;
                    var30_5 = var14_11;
                    var30_5 = var15_16;
                    if (var24_28 != null) {
                        var30_5 = var24_28.b((String)var15_16);
                    }
                    com.github.catvod.spider.merge.H.l.a((List<e>)var17_21 /* !! */ , new e((String)var30_5, (Method)var31_30, (Field)var16_10, var0, (Type)var1_1, var4_22, var5_32, var6_33, (b)var29_9, (b)var18_23, null, var36_12));
                    break block142;
                }
                var15_16 = var13_6;
                var15_16 = var14_11;
            }
            ++var8_37;
        }
        var14_11 = var0.getFields();
        var16_10 = var17_21 /* !! */ ;
        com.github.catvod.spider.merge.H.l.d(var0, (Type)var1_1, (V)var24_28, (List<e>)var16_10, (Field[])var14_11);
        var18_23 = var0.getMethods();
        var4_22 = ((Object)var18_23).length;
        var17_21 /* !! */  = var15_16;
        block22: for (var5_32 = 0; var5_32 < var4_22; ++var5_32) {
            block198: {
                block197: {
                    block143: {
                        block195: {
                            block196: {
                                block194: {
                                    var27_25 = var18_23[var5_32];
                                    var14_11 = var27_25.getName();
                                    if (var14_11.length() < 4) {
                                        while (true) {
                                            var14_11 = var13_6;
                                            continue block22;
                                            break;
                                        }
                                    }
                                    if (Modifier.isStatic(var27_25.getModifiers()) || var20_3 /* !! */  != null || !var14_11.startsWith((String)var17_21 /* !! */ ) || !Character.isUpperCase(var14_11.charAt(3)) || var27_25.getParameterTypes().length != 0 || !Collection.class.isAssignableFrom(var27_25.getReturnType()) && !Map.class.isAssignableFrom(var27_25.getReturnType()) && AtomicBoolean.class != var27_25.getReturnType() && AtomicInteger.class != var27_25.getReturnType() && AtomicLong.class != var27_25.getReturnType() || (var26_27 = A.F((Method)var27_25, b.class)) != null && var26_27.deserialize()) ** continue;
                                    if (var26_27 == null || var26_27.name().length() <= 0) break block194;
                                    var15_16 = var26_27.name();
                                    var14_11 = null;
                                    break block195;
                                }
                                var15_16 = A.V((String)var14_11);
                                if ((var14_11 = A.N(var0, (String)var15_16, (Field[])var13_6)) == null) break block196;
                                var21_4 = A.E((Field)var14_11, b.class);
                                if (var21_4 != null && !var21_4.deserialize()) break block197;
                                if (Collection.class.isAssignableFrom(var27_25.getReturnType()) || Map.class.isAssignableFrom(var27_25.getReturnType())) break block195;
                            }
                            var14_11 = null;
                        }
                        var21_4 = var15_16;
                        if (var24_28 != null) {
                            var21_4 = var24_28.b((String)var15_16);
                        }
                        var30_5 = var16_10.iterator();
                        while (var30_5.hasNext()) {
                            var15_16 = (e)var30_5.next();
                            if (!var15_16.a.equals(var21_4) && ((var29_9 = var15_16.c) == null || var15_16.h() == null || !var29_9.getName().equals(var21_4))) continue;
                            break block143;
                        }
                        var15_16 = null;
                    }
                    if (var15_16 == null) break block198;
                }
                var14_11 = var13_6;
                continue;
            }
            var15_16 = var13_6;
            com.github.catvod.spider.merge.H.l.a((List<e>)var16_10, new e((String)var21_4, (Method)var27_25, (Field)var14_11, var0, (Type)var1_1, 0, 0, 0, (b)var26_27, null, null, var36_12));
        }
        if (var16_10.size() == 0) {
            if (A.k0(var0)) {
                var2_2 = true;
            }
            if (var2_2) {
                for (var14_11 = var0; var14_11 != null; var14_11 = var14_11.getSuperclass()) {
                    com.github.catvod.spider.merge.H.l.d(var0, (Type)var1_1, (V)var24_28, (List<e>)var16_10, (Field[])var13_6);
                }
            }
        }
        return new l(var0, (Class<?>)var20_3 /* !! */ , var28_15, (Constructor<?>)var19_31, (Method)var25_26 /* !! */ , (Method)var23_14, (com.github.catvod.spider.merge.z.d)var22_29 /* !! */ , (List<e>)var16_10);
        catch (NoSuchMethodException var15_17) {
            ** continue;
        }
    }

    private static Map<TypeVariable, Type> c(Class<?> object) {
        Class<?> clazz = object.getSuperclass();
        Object object2 = null;
        Serializable serializable = clazz;
        if (clazz == null) {
            return null;
        }
        while (true) {
            Type[] typeArray = object;
            object = serializable;
            if (object == null || object == Object.class) break;
            clazz = object2;
            if (typeArray.getGenericSuperclass() instanceof ParameterizedType) {
                typeArray = ((ParameterizedType)typeArray.getGenericSuperclass()).getActualTypeArguments();
                TypeVariable<Class<T>>[] typeVariableArray = object.getTypeParameters();
                int n2 = 0;
                while (true) {
                    clazz = object2;
                    if (n2 >= typeArray.length) break;
                    serializable = object2;
                    if (object2 == null) {
                        serializable = new HashMap();
                    }
                    if (serializable.containsKey(typeArray[n2])) {
                        object2 = (Type)serializable.get(typeArray[n2]);
                        serializable.put(typeVariableArray[n2], object2);
                    } else {
                        serializable.put(typeVariableArray[n2], typeArray[n2]);
                    }
                    ++n2;
                    object2 = serializable;
                }
            }
            serializable = object.getSuperclass();
            object2 = clazz;
        }
        return object2;
    }

    private static void d(Class<?> clazz, Type type, V v2, List<e> list, Field[] fieldArray) {
        Map<TypeVariable, Type> map = com.github.catvod.spider.merge.H.l.c(clazz);
        for (Field field : fieldArray) {
            int n2;
            Class<?> clazz2;
            int n3;
            int n4;
            block7: {
                n4 = field.getModifiers();
                if ((n4 & 8) != 0) continue;
                n3 = 1;
                if ((n4 & 0x10) != 0) {
                    clazz2 = field.getType();
                    n4 = !(Map.class.isAssignableFrom(clazz2) || Collection.class.isAssignableFrom(clazz2) || AtomicLong.class.equals((Object)clazz2) || AtomicInteger.class.equals((Object)clazz2) || AtomicBoolean.class.equals((Object)clazz2)) ? 0 : 1;
                    if (n4 == 0) continue;
                }
                clazz2 = list.iterator();
                while (clazz2.hasNext()) {
                    if (!((e)clazz2.next()).a.equals(field.getName())) continue;
                    n4 = n3;
                    break block7;
                }
                n4 = 0;
            }
            if (n4 != 0) continue;
            clazz2 = field.getName();
            b b2 = A.E(field, b.class);
            if (b2 != null) {
                if (!b2.deserialize()) continue;
                n3 = b2.ordinal();
                n4 = i0.h(b2.serialzeFeatures());
                int n5 = com.github.catvod.spider.merge.B.c.b(b2.parseFeatures());
                if (b2.name().length() != 0) {
                    clazz2 = b2.name();
                }
                n2 = n3;
                n3 = n4;
                n4 = n5;
            } else {
                n2 = 0;
                n3 = 0;
                n4 = 0;
            }
            Class<?> clazz3 = clazz2;
            if (v2 != null) {
                clazz3 = v2.b((String)((Object)clazz2));
            }
            com.github.catvod.spider.merge.H.l.a(list, new e((String)((Object)clazz3), null, field, clazz, type, n2, n3, n4, null, b2, null, map));
        }
    }

    public static Class<?> e(Class<?> clazz, com.github.catvod.spider.merge.z.d d2) {
        if (clazz != null && clazz.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return A.l0("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }
        if (d2 == null) {
            return null;
        }
        clazz = d2.builder();
        if (clazz == Void.class) {
            return null;
        }
        return clazz;
    }

    public static Constructor<?> f(Constructor[] constructorArray) {
        Object annotationArray;
        int n2 = constructorArray.length;
        Annotation[][] annotationArray2 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            Annotation[][] object = constructorArray[i2];
            annotationArray = annotationArray2;
            if (object.getAnnotation(a.class) != null) {
                if (annotationArray2 == null) {
                    annotationArray = object;
                } else {
                    throw new d("multi-JSONCreator");
                }
            }
            annotationArray2 = annotationArray;
        }
        if (annotationArray2 != null) {
            return annotationArray2;
        }
        for (Constructor constructor : constructorArray) {
            annotationArray = A.S(constructor);
            if (((Annotation[][])annotationArray).length == 0) {
                annotationArray = annotationArray2;
            } else {
                int n3;
                int n4 = ((Annotation[][])annotationArray).length;
                n2 = 0;
                while (true) {
                    block14: {
                        n3 = 1;
                        int n5 = 1;
                        if (n2 >= n4) break;
                        Annotation[] annotationArray3 = annotationArray[n2];
                        int n6 = annotationArray3.length;
                        for (n3 = 0; n3 < n6; ++n3) {
                            if (!(annotationArray3[n3] instanceof b)) continue;
                            n3 = n5;
                            break block14;
                        }
                        n3 = 0;
                    }
                    if (n3 == 0) {
                        n3 = 0;
                        break;
                    }
                    ++n2;
                }
                annotationArray = annotationArray2;
                if (n3 != 0) {
                    if (annotationArray2 == null) {
                        annotationArray = constructor;
                    } else {
                        throw new d("multi-JSONCreator");
                    }
                }
            }
            annotationArray2 = annotationArray;
        }
        return annotationArray2;
    }

    static Constructor<?> g(Class<?> clazz, Constructor<?>[] constructorArray) {
        Constructor<?> constructor;
        boolean bl = Modifier.isAbstract(clazz.getModifiers());
        Constructor<?> constructor2 = null;
        if (bl) {
            return null;
        }
        int n2 = constructorArray.length;
        int n3 = 0;
        while (true) {
            constructor = constructor2;
            if (n3 >= n2 || (constructor = constructorArray[n3]).getParameterTypes().length == 0) break;
            ++n3;
        }
        constructor2 = constructor;
        if (constructor == null) {
            constructor2 = constructor;
            if (clazz.isMemberClass()) {
                constructor2 = constructor;
                if (!Modifier.isStatic(clazz.getModifiers())) {
                    n2 = constructorArray.length;
                    n3 = 0;
                    while (true) {
                        Class<?>[] classArray;
                        constructor2 = constructor;
                        if (n3 >= n2 || (classArray = (constructor2 = constructorArray[n3]).getParameterTypes()).length == 1 && classArray[0].equals(clazz.getDeclaringClass())) break;
                        ++n3;
                    }
                }
            }
        }
        return constructor2;
    }
}

