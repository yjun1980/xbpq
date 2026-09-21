/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public final class W
implements X,
v {
    public static final W a = new W();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private <T> T f(com.github.catvod.spider.merge.B.b var1_1, Class<?> var2_2, b var3_3) {
        if (var3_3 == null) {
            return null;
        }
        var7_4 = var3_3.size();
        var12_5 = Array.newInstance(var2_2, var7_4);
        for (var4_6 = 0; var4_6 < var7_4; ++var4_6) {
            var11_12 = var3_3.get(var4_6);
            if (var11_12 == var3_3) {
                Array.set(var12_5, var4_6, var12_5);
                continue;
            }
            if (var2_2.isArray()) {
                var9_10 /* !! */  = var2_2.isInstance(var11_12) != false ? var11_12 : this.f(var1_1, var2_2, (b)var11_12);
                Array.set(var12_5, var4_6, var9_10 /* !! */ );
                continue;
            }
            if (!(var11_12 instanceof b)) ** GOTO lbl-1000
            var9_10 /* !! */  = (b)var11_12;
            var8_9 = var9_10 /* !! */ .size();
            var6_8 = false;
            for (var5_7 = 0; var5_7 < var8_9; ++var5_7) {
                if (var9_10 /* !! */ .get(var5_7) != var3_3) continue;
                var9_10 /* !! */ .set(var4_6, var12_5);
                var6_8 = true;
            }
            if (var6_8) {
                var9_10 /* !! */  = var9_10 /* !! */ .toArray();
            } else lbl-1000:
            // 2 sources

            {
                var9_10 /* !! */  = null;
            }
            var10_11 = var9_10 /* !! */ ;
            if (var9_10 /* !! */  == null) {
                var10_11 = A.d(var11_12, var2_2, var1_1.e());
            }
            Array.set(var12_5, var4_6, var10_11);
        }
        var3_3.s(var12_5);
        var3_3.r(var2_2);
        return (T)var12_5;
    }

    @Override
    public final <T> T c(com.github.catvod.spider.merge.B.b object, Type object2, Object object3) {
        Object object4 = ((com.github.catvod.spider.merge.B.b)object).f;
        int n2 = object4.p();
        Object object5 = null;
        Object var8_7 = null;
        if (n2 == 8) {
            object4.o(16);
            return null;
        }
        if (n2 != 4 && n2 != 26) {
            if (object2 instanceof GenericArrayType) {
                object4 = ((GenericArrayType)object2).getGenericComponentType();
                if (object4 instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable)object4;
                    object2 = ((com.github.catvod.spider.merge.B.b)object).f().e;
                    boolean bl = object2 instanceof ParameterizedType;
                    n2 = 0;
                    if (bl) {
                        ParameterizedType parameterizedType = (ParameterizedType)object2;
                        if ((object2 = parameterizedType.getRawType()) instanceof Class) {
                            TypeVariable<Class<T>>[] typeVariableArray = ((Class)object2).getTypeParameters();
                            object2 = var8_7;
                            while (true) {
                                object5 = object2;
                                if (n2 >= typeVariableArray.length) break;
                                if (typeVariableArray[n2].getName().equals(typeVariable.getName())) {
                                    object2 = parameterizedType.getActualTypeArguments()[n2];
                                }
                                ++n2;
                            }
                        }
                        if (object5 instanceof Class) {
                            object2 = (Class)object5;
                            object5 = object4;
                        } else {
                            object2 = Object.class;
                            object5 = object4;
                        }
                    } else {
                        object2 = A.G(typeVariable.getBounds()[0]);
                        object5 = object4;
                    }
                } else {
                    object2 = A.G((Type)object4);
                    object5 = object4;
                }
            } else {
                object2 = object5 = ((Class)object2).getComponentType();
            }
            object4 = new b();
            ((com.github.catvod.spider.merge.B.b)object).p((Type)object5, (Collection)object4, object3);
            return this.f((com.github.catvod.spider.merge.B.b)object, (Class<?>)object2, (b)object4);
        }
        object = object4.A();
        object4.o(16);
        if (((Object)object).length == 0 && object2 != byte[].class) {
            return null;
        }
        return (T)object;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(L var1_1, Object var2_2, Object var3_4, Type var4_5, int var5_6) {
        block17: {
            var10_7 = var1_1.j;
            var11_8 = (Object[])var2_2;
            if (var2_2 == null) {
                var10_7.u(i0.h);
                return;
            }
            var7_9 = var11_8.length;
            var6_10 = var7_9 - 1;
            if (var6_10 == -1) {
                var10_7.b("[]");
                return;
            }
            var9_11 = var1_1.p;
            var1_1.s(var9_11, var2_2, var3_4);
            var10_7.write(91);
            var8_12 = var10_7.g(i0.n);
            if (!var8_12) break block17;
            var1_1.o();
            var1_1.r();
            for (var5_6 = 0; var5_6 < var7_9; ++var5_6) {
                if (var5_6 == 0) ** GOTO lbl26
                var10_7.write(44);
                var1_1.r();
lbl26:
                // 2 sources

                var1_1.y(var11_8[var5_6], var5_6);
                continue;
            }
            var1_1.j();
            var1_1.r();
            var10_7.write(93);
            return;
        }
        var3_4 = null;
        var2_2 = null;
        for (var5_6 = 0; var5_6 < var6_10; ++var5_6) {
            block18: {
                var12_13 = var11_8[var5_6];
                if (var12_13 != null) ** GOTO lbl43
                var10_7.b("null,");
                continue;
lbl43:
                // 1 sources

                if (var1_1.i(var12_13)) {
                    var1_1.x(var12_13);
                    break block18;
                }
                var4_5 = var12_13.getClass();
                if (var4_5 != var3_4) ** GOTO lbl51
                var2_2.d(var1_1, var12_13, var5_6, null, 0);
                break block18;
lbl51:
                // 1 sources

                var2_2 = var1_1.n(var4_5);
                var2_2.d(var1_1, var12_13, var5_6, null, 0);
                var3_4 = var4_5;
            }
            var10_7.write(44);
        }
        var2_2 = var11_8[var6_10];
        if (var2_2 != null) ** GOTO lbl64
        try {
            block19: {
                var10_7.b("null]");
                break block19;
lbl64:
                // 1 sources

                if (var1_1.i(var2_2)) {
                    var1_1.x(var2_2);
                } else {
                    var1_1.y(var2_2, var6_10);
                }
                var10_7.write(93);
            }
            var1_1.p = var9_11;
            return;
        }
        catch (Throwable var2_3) {
            throw var2_3;
        }
        finally {
            var1_1.p = var9_11;
        }
    }

    @Override
    public final int e() {
        return 14;
    }
}

