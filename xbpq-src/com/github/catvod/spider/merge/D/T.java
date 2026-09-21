/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.g0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class T
extends g0
implements X {
    public static T i = new T();
    private static final int j = i0.h(new i0[]{i0.r, i0.v, i0.x});

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        this.i(l2, object, object2, type, n2, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i(L var1_1, Object var2_2, Object var3_4, Type var4_5, int var5_6, boolean var6_7) {
        block66: {
            block65: {
                var14_8 = var1_1.j;
                if (var2_2 == null) {
                    var14_8.s();
                    return;
                }
                var11_9 = (TreeMap<K, V>)var2_2;
                var7_10 = i0.C.a;
                if ((var14_8.c & var7_10) != 0) break block65;
                var10_11 = var11_9;
                if ((var7_10 & var5_6) == 0) break block66;
            }
            var9_13 = var11_9;
            if (var11_9 instanceof e) {
                var9_13 = ((e)var11_9).q();
            }
            var10_11 = var9_13;
            if (var9_13 instanceof SortedMap) break block66;
            var10_11 = var9_13;
            if (var9_13 instanceof LinkedHashMap) break block66;
            try {
                var11_9 = new TreeMap<K, V>(var9_13);
                ** GOTO lbl24
            }
            catch (Exception var10_12) {
                var10_11 = var9_13;
                ** continue;
            }
        }
lbl22:
        // 2 sources

        while (true) {
            block57: {
                block58: {
                    var11_9 = var10_11;
lbl24:
                    // 2 sources

                    if (var1_1.i(var2_2)) {
                        var1_1.x(var2_2);
                        return;
                    }
                    var15_14 = var1_1.p;
                    var1_1.s(var15_14, var2_2, var3_4);
                    if (var6_7) ** GOTO lbl32
                    var14_8.write(123);
lbl32:
                    // 2 sources

                    var1_1.o();
                    if (!var14_8.g(i0.o)) break block57;
                    var9_13 = var1_1.i.c;
                    var3_4 = var11_9.getClass();
                    if (var3_4 != e.class && var3_4 != HashMap.class && var3_4 != LinkedHashMap.class) break block58;
                    if (!var11_9.containsKey(var9_13)) break block58;
                    var7_10 = 1;
                }
                var7_10 = 0;
                if (var7_10 == 0) {
                    var14_8.j((String)var9_13);
                    var14_8.v(var2_2.getClass().getName());
                    var7_10 = 0;
                }
            }
            var7_10 = 1;
            try {
                var16_15 = var11_9.entrySet().iterator();
                var3_4 = null;
                var9_13 = null;
            }
            catch (Throwable var2_3) {
                var1_1.p = var15_14;
                throw var2_3;
            }
            while (true) {
                block63: {
                    block64: {
                        block62: {
                            block59: {
                                block69: {
                                    block67: {
                                        block68: {
                                            if (!var16_15.hasNext()) break;
                                            var10_11 = var16_15.next();
                                            var13_18 /* !! */  = var10_11.getValue();
                                            var12_17 = var10_11.getKey();
                                            var10_11 = var1_1.f;
                                            if (var10_11 == null) ** GOTO lbl72
                                            if (var10_11.size() <= 0) ** GOTO lbl72
                                            if (var12_17 == null) ** GOTO lbl-1000
                                            if (!(var12_17 instanceof String)) {
                                                if ((var12_17.getClass().isPrimitive() || var12_17 instanceof Number) && !this.f(var1_1, var2_2, com.github.catvod.spider.merge.y.a.m(var12_17))) {
                                                    continue;
                                                }
                                            } else if (!this.f(var1_1, var2_2, (String)var12_17)) continue;
lbl72:
                                            // 4 sources

                                            if ((var10_11 = this.f) == null) ** GOTO lbl82
                                            if (var10_11.size() <= 0) ** GOTO lbl82
                                            if (var12_17 == null) ** GOTO lbl-1000
                                            if (!(var12_17 instanceof String)) {
                                                if ((var12_17.getClass().isPrimitive() || var12_17 instanceof Number) && !this.f(var1_1, var2_2, com.github.catvod.spider.merge.y.a.m(var12_17))) {
                                                    continue;
                                                }
                                            } else if (!this.f(var1_1, var2_2, (String)var12_17)) continue;
lbl82:
                                            // 4 sources

                                            if ((var10_11 = var1_1.c) == null) ** GOTO lbl92
                                            if (var10_11.size() <= 0) ** GOTO lbl92
                                            if (var12_17 == null) ** GOTO lbl-1000
                                            if (!(var12_17 instanceof String)) {
                                                if ((var12_17.getClass().isPrimitive() || var12_17 instanceof Number) && !this.e(var1_1, var2_2, com.github.catvod.spider.merge.y.a.m(var12_17), var13_18 /* !! */ )) {
                                                    continue;
                                                }
                                            } else if (!this.e(var1_1, var2_2, (String)var12_17, var13_18 /* !! */ )) continue;
lbl92:
                                            // 4 sources

                                            if ((var10_11 = this.c) == null) ** GOTO lbl102
                                            if (var10_11.size() <= 0) ** GOTO lbl102
                                            if (var12_17 == null) ** GOTO lbl-1000
                                            if (!(var12_17 instanceof String)) {
                                                if ((var12_17.getClass().isPrimitive() || var12_17 instanceof Number) && !this.e(var1_1, var2_2, com.github.catvod.spider.merge.y.a.m(var12_17), var13_18 /* !! */ )) {
                                                    continue;
                                                }
                                            } else if (!this.e(var1_1, var2_2, (String)var12_17, var13_18 /* !! */ )) continue;
lbl102:
                                            // 4 sources

                                            var17_19 = var1_1.e;
                                            var10_11 = var12_17;
                                            if (var17_19 == null) ** GOTO lbl120
                                            var10_11 = var12_17;
                                            if (var17_19.size() <= 0) ** GOTO lbl120
                                            if (var12_17 == null) ** GOTO lbl117
                                            if (var12_17 instanceof String) ** GOTO lbl117
                                            if (var12_17.getClass().isPrimitive()) ** GOTO lbl115
                                            var10_11 = var12_17;
                                            if (!(var12_17 instanceof Number)) break block67;
lbl115:
                                            // 2 sources

                                            var10_11 = com.github.catvod.spider.merge.y.a.m(var12_17);
                                            break block68;
lbl117:
                                            // 2 sources

                                            var10_11 = (String)var12_17;
                                        }
                                        var10_11 = this.g(var1_1, var2_2, (String)var10_11, var13_18 /* !! */ );
                                    }
                                    var17_19 = this.e;
                                    var12_17 = var10_11;
                                    if (var17_19 == null) break block59;
                                    var12_17 = var10_11;
                                    if (var17_19.size() <= 0) break block59;
                                    if (var10_11 == null) ** GOTO lbl136
                                    if (var10_11 instanceof String) ** GOTO lbl136
                                    if (var10_11.getClass().isPrimitive()) ** GOTO lbl134
                                    var12_17 = var10_11;
                                    if (!(var10_11 instanceof Number)) break block59;
lbl134:
                                    // 2 sources

                                    var10_11 = com.github.catvod.spider.merge.y.a.m(var10_11);
                                    break block69;
lbl136:
                                    // 2 sources

                                    var10_11 = (String)var10_11;
                                }
                                var12_17 = this.g(var1_1, var2_2, (String)var10_11, var13_18 /* !! */ );
                            }
                            if (var12_17 != null) {
                                block61: {
                                    if (var12_17 instanceof String) ** break block60
                                    var8_16 = var12_17 instanceof Map || var12_17 instanceof Collection;
                                    if (var8_16) break block61;
                                    var10_11 = this.h(var1_1, null, var2_2, com.github.catvod.spider.merge.y.a.m(var12_17), var13_18 /* !! */ , var5_6);
                                }
                                var10_11 = var13_18 /* !! */ ;
                            } else {
                                var10_11 = this.h(var1_1, null, var2_2, (String)var12_17, var13_18 /* !! */ , var5_6);
                            }
                            if (var10_11 != null) ** GOTO lbl157
                            if (!i0.b(var14_8.c, var5_6, i0.d)) continue;
lbl157:
                            // 2 sources

                            if (!(var12_17 instanceof String)) break block62;
                            var13_18 /* !! */  = (String)var12_17;
                            if (var7_10 != 0) ** GOTO lbl162
                            var14_8.write(44);
lbl162:
                            // 2 sources

                            if (var14_8.g(i0.n)) {
                                var1_1.r();
                            }
                            var14_8.j((String)var13_18 /* !! */ );
                        }
                        if (var7_10 != 0) ** GOTO lbl170
                        var14_8.write(44);
lbl170:
                        // 2 sources

                        if ((var14_8.f(T.j) || i0.e(var5_6, i0.v)) && !(var12_17 instanceof Enum)) {
                            var1_1.v(com.github.catvod.spider.merge.y.a.m(var12_17));
                        } else {
                            var1_1.u(var12_17);
                        }
                        var14_8.write(58);
                        if (var10_11 != null) ** GOTO lbl179
                        var14_8.s();
                        break block63;
lbl179:
                        // 1 sources

                        var13_18 /* !! */  = var10_11.getClass();
                        if (var13_18 /* !! */  == var3_4) break block64;
                        var9_13 = var1_1.n((Class<?>)var13_18 /* !! */ );
                        var3_4 = var13_18 /* !! */ ;
                    }
                    if (!i0.e(var5_6, i0.o) || !(var9_13 instanceof M)) ** GOTO lbl191
                    var13_18 /* !! */  = var4_5 instanceof ParameterizedType != false && ((V)(var13_18 /* !! */  = ((ParameterizedType)var4_5).getActualTypeArguments())).length == 2 ? var13_18 /* !! */ [1] : null;
                    ((M)var9_13).v(var1_1, var10_11, var12_17, (Type)var13_18 /* !! */ , var5_6);
                    break block63;
lbl191:
                    // 1 sources

                    var9_13.d(var1_1, var10_11, var12_17, null, var5_6);
                }
                var7_10 = 0;
            }
            var1_1.p = var15_14;
            var1_1.j();
            if (var14_8.g(i0.n) && var11_9.size() > 0) {
                var1_1.r();
            }
            if (!var6_7) {
                var14_8.write(125);
            }
            return;
            break;
        }
    }
}

