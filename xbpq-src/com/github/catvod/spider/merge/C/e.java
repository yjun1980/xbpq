/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.y.X;
import com.github.catvod.spider.merge.y.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Map;

public final class e
extends n {
    private final Type c;
    private int d;
    private v e;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public e(Class object, com.github.catvod.spider.merge.H.e object2) {
        super((Class<?>)object, (com.github.catvod.spider.merge.H.e)object2);
        object = ((com.github.catvod.spider.merge.H.e)object2).f;
        if (object instanceof ParameterizedType) {
            object = object2 = ((ParameterizedType)object).getActualTypeArguments()[0];
            if (object2 instanceof WildcardType) {
                Type[] typeArray = ((WildcardType)object2).getUpperBounds();
                object = object2;
                if (typeArray.length == 1) {
                    object = typeArray[0];
                }
            }
        } else {
            object = Object.class;
        }
        this.c = object;
    }

    @Override
    public final int b() {
        return 14;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void d(b var1_1, Object var2_2, Type var3_3, Map<String, Object> var4_4) {
        block31: {
            block30: {
                block34: {
                    block32: {
                        block33: {
                            var7_5 = var1_1.f;
                            var5_6 = var7_5.p();
                            if (var5_6 == 8 || var5_6 == 4 && var7_5.K().length() == 0) break block31;
                            var12_7 = new ArrayList<T>();
                            var11_8 = var1_1.f();
                            var1_1.z(var11_8, var2_2, this.a.a);
                            var10_9 = this.c;
                            var7_5 = this.e;
                            if (!(var3_3 instanceof ParameterizedType)) break block32;
                            if (!(var10_9 instanceof TypeVariable)) break block33;
                            var8_10 /* !! */  = (TypeVariable)var10_9;
                            var9_11 = (ParameterizedType)var3_3;
                            if ((var3_3 = var9_11.getRawType() instanceof Class != false ? (Class)var9_11.getRawType() : null) != null) {
                                var6_12 = var3_3.getTypeParameters().length;
                                for (var5_6 = 0; var5_6 < var6_12; ++var5_6) {
                                    if (!var3_3.getTypeParameters()[var5_6].getName().equals(var8_10 /* !! */ .getName())) {
                                        continue;
                                    }
                                    break;
                                }
                            } else {
                                var5_6 = -1;
                            }
                            if (var5_6 == -1) ** GOTO lbl-1000
                            var8_10 /* !! */  = var9_11.getActualTypeArguments()[var5_6];
                            if (!var8_10 /* !! */ .equals(this.c)) {
                                var7_5 = var1_1.e().f(var8_10 /* !! */ );
                            }
                            break block34;
                        }
                        if (var10_9 instanceof ParameterizedType && ((Type[])(var9_11 = (var13_13 = (ParameterizedType)var10_9).getActualTypeArguments())).length == 1 && var9_11[0] instanceof TypeVariable) {
                            var15_14 = (TypeVariable)var9_11[0];
                            var14_15 = (ParameterizedType)var3_3;
                            var8_10 /* !! */  = var14_15.getRawType() instanceof Class != false ? (Class)var14_15.getRawType() : null;
                            var3_3 = var7_5;
                            if (var8_10 /* !! */  != null) {
                                var6_12 = var8_10 /* !! */ .getTypeParameters().length;
                                var5_6 = 0;
                                while (true) {
                                    var3_3 = var7_5;
                                    if (var5_6 >= var6_12) break;
                                    var16_16 = var8_10 /* !! */ .getTypeParameters()[var5_6].getName();
                                    var3_3 = var7_5;
                                    if (!var16_16.equals(var15_14.getName())) {
                                        ++var5_6;
                                        var7_5 = var3_3;
                                        continue;
                                    }
                                    break;
                                }
                            } else {
                                var5_6 = -1;
                            }
                            var8_10 /* !! */  = var10_9;
                            var7_5 = var3_3;
                            if (var5_6 != -1) {
                                var9_11[0] = var14_15.getActualTypeArguments()[var5_6];
                                var8_10 /* !! */  = X.a(new com.github.catvod.spider.merge.H.n((Type[])var9_11, var13_13.getOwnerType(), var13_13.getRawType()));
                                var7_5 = var3_3;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            var8_10 /* !! */  = var10_9;
                        }
                        break block34;
                    }
                    var9_11 = var7_5;
                    var8_10 /* !! */  = var10_9;
                    var7_5 = var9_11;
                    if (var10_9 instanceof TypeVariable) {
                        var8_10 /* !! */  = var10_9;
                        var7_5 = var9_11;
                        if (var3_3 instanceof Class) {
                            var13_13 = (Class)var3_3;
                            var3_3 = (TypeVariable)var10_9;
                            var13_13.getTypeParameters();
                            var6_12 = var13_13.getTypeParameters().length;
                            var5_6 = 0;
                            while (true) {
                                var8_10 /* !! */  = var10_9;
                                var7_5 = var9_11;
                                if (var5_6 >= var6_12) break;
                                var7_5 = var13_13.getTypeParameters()[var5_6];
                                if (var7_5.getName().equals(var3_3.getName())) {
                                    var3_3 = var7_5.getBounds();
                                    var8_10 /* !! */  = var10_9;
                                    var7_5 = var9_11;
                                    if (((Object)var3_3).length != 1) break;
                                    var8_10 /* !! */  = var3_3[0];
                                    var7_5 = var9_11;
                                    break;
                                }
                                ++var5_6;
                            }
                        }
                    }
                }
                var9_11 = var1_1.f;
                var5_6 = var9_11.p();
                if (var5_6 == 14) {
                    var3_3 = var7_5;
                    if (var7_5 == null) {
                        var3_3 = var1_1.e().f(var8_10 /* !! */ );
                        this.e = var3_3;
                        this.d = var3_3.e();
                    }
                    var9_11.o(this.d);
                    var5_6 = 0;
                    while (true) {
                        if (var9_11.l(com.github.catvod.spider.merge.B.c.g)) {
                            while (var9_11.p() == 16) {
                                var9_11.nextToken();
                            }
                        }
                        if (var9_11.p() == 15) {
                            var9_11.o(16);
                            break block30;
                        }
                        var12_7.add(var3_3.c(var1_1, var8_10 /* !! */ , var5_6));
                        var1_1.c(var12_7);
                        if (var9_11.p() == 16) {
                            var9_11.o(this.d);
                        }
                        ++var5_6;
                    }
                }
                if (var5_6 == 4 && this.a.r) {
                    var3_3 = var9_11.K();
                    var9_11.nextToken();
                    new b((String)var3_3, o.v, com.github.catvod.spider.merge.y.a.f).q(var12_7, null);
                } else {
                    var3_3 = var7_5;
                    if (var7_5 == null) {
                        this.e = var3_3 = var1_1.e().f(var8_10 /* !! */ );
                    }
                    var12_7.add(var3_3.c(var1_1, var8_10 /* !! */ , 0));
                    var1_1.c(var12_7);
                }
            }
            var1_1.B(var11_8);
            if (var2_2 == null) {
                var4_4.put(this.a.a, var12_7);
            } else {
                this.e(var2_2, var12_7);
            }
            return;
        }
        if (var2_2 == null) {
            var4_4.put(this.a.a, null);
        } else {
            this.e(var2_2, null);
        }
    }
}

