/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.n;
import com.github.catvod.spider.merge.y.X;
import com.github.catvod.spider.merge.z.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public final class e
implements Comparable<e> {
    public final String a;
    public final Method b;
    public final Field c;
    private int d;
    public final Class<?> e;
    public final Type f;
    public final Class<?> g;
    public final boolean h;
    public final int i;
    public final int j;
    public final String k;
    private final b l;
    private final b m;
    public final boolean n;
    public final char[] o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final String[] t;
    public final long u;

    public e(String string, Class<?> object, Class<?> clazz, Type type, Field field, int n2, int n3, int n4) {
        this.d = 0;
        int n5 = n2;
        if (n2 < 0) {
            n5 = 0;
        }
        this.a = string;
        this.g = object;
        this.e = clazz;
        this.f = type;
        this.b = null;
        this.c = field;
        this.d = n5;
        this.i = n3;
        this.j = n4;
        this.p = clazz.isEnum();
        if (field != null) {
            n2 = field.getModifiers();
            this.n = Modifier.isTransient(n2);
        } else {
            this.n = false;
        }
        this.o = this.e();
        if (field != null) {
            A.s0(field);
        }
        this.k = "";
        object = field == null ? null : A.E(field, b.class);
        this.l = object;
        this.m = null;
        this.h = false;
        this.q = false;
        this.r = false;
        this.s = null;
        this.t = new String[0];
        this.u = this.m(string, (b)object);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public e(String string, Method method, Field field, Class clazz, int n2, int n3, int n4, b b2, b b3, String string2) {
        this(string, method, field, clazz, null, n2, n3, n4, b2, b3, string2, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public e(String var1_1, Method var2_2, Field var3_3, Class<?> var4_4, Type var5_5, int var6_6, int var7_7, int var8_8, b var9_9, b var10_10, String var11_11, Map<TypeVariable, Type> var12_12) {
        var17_13 = var11_11;
        super();
        var13_14 = 0;
        this.d = 0;
        if (var3_3 != null && (var18_15 = var3_3.getName()).equals(var1_1)) {
            var1_1 = var18_15;
        }
        if (var6_6 < 0) {
            var6_6 = 0;
        }
        this.a = var1_1;
        this.b = var2_2;
        this.c = var3_3;
        this.d = var6_6;
        this.i = var7_7;
        this.j = var8_8;
        this.l = var9_9 /* !! */ ;
        this.m = var10_10;
        var16_16 = true;
        var14_17 = var3_3 != null ? Modifier.isTransient(var6_6 = var3_3.getModifiers()) || A.j0((Method)var2_2) : A.j0((Method)var2_2);
        this.n = var14_17;
        if (var17_13 == null || var11_11.length() <= 0) {
            var17_13 = "";
        }
        this.k = var17_13;
        var10_10 = this.h();
        this.u = this.m((String)var1_1, (b)var10_10);
        var17_13 = null;
        if (var10_10 != null) {
            var9_9 /* !! */  = var10_10.format();
            var1_1 = var9_9 /* !! */ ;
            if (var9_9 /* !! */ .trim().length() == 0) {
                var1_1 = null;
            }
            var15_18 = var10_10.jsonDirect();
            this.r = var10_10.unwrapped();
            this.t = var10_10.alternateNames();
        } else {
            this.r = false;
            this.t = new String[0];
            var1_1 = null;
            var15_18 = false;
        }
        this.s = var1_1;
        this.o = this.e();
        if (var2_2 != null) {
            A.s0((AccessibleObject)var2_2);
        }
        if (var3_3 != null) {
            A.s0((AccessibleObject)var3_3);
        }
        if (var2_2 != null) {
            var1_1 = var2_2.getParameterTypes();
            if (((Class<?>[])var1_1).length == 1) {
                var1_1 = var1_1[0];
                var3_3 = var2_2.getGenericParameterTypes()[0];
lbl50:
                // 2 sources

                while (true) {
                    var14_17 = false;
                    break;
                }
            } else {
                if (((Class<?>[])var1_1).length == 2 && var1_1[0] == String.class && var1_1[1] == Object.class) {
                    var3_3 = var1_1 = var1_1[0];
                    ** continue;
                }
                var1_1 = var2_2.getReturnType();
                var3_3 = var2_2.getGenericReturnType();
                var14_17 = true;
            }
            this.g = var2_2.getDeclaringClass();
            var2_2 = var3_3;
        } else {
            var1_1 = var3_3.getType();
            var2_2 = var3_3.getGenericType();
            this.g = var3_3.getDeclaringClass();
            var14_17 = Modifier.isFinal(var3_3.getModifiers());
        }
        this.h = var14_17;
        var14_17 = var15_18 != false && var1_1 == String.class ? var16_16 : false;
        this.q = var14_17;
        if (var4_4 != null && var1_1 == Object.class && var2_2 instanceof TypeVariable) {
            var18_15 = (TypeVariable)var2_2;
            var9_9 /* !! */  = var18_15.getGenericDeclaration() instanceof Class != false ? (Class)var18_15.getGenericDeclaration() : null;
            if (var9_9 /* !! */  == var4_4) {
                var3_3 = var5_5 instanceof ParameterizedType ? ((ParameterizedType)var5_5).getActualTypeArguments() : null;
            } else {
                var3_3 = null;
                for (var10_10 = var4_4; var10_10 != null && var10_10 != Object.class && var10_10 != var9_9 /* !! */ ; var10_10 = var10_10.getSuperclass()) {
                    var19_19 = var10_10.getGenericSuperclass();
                    var11_11 = var3_3;
                    if (var19_19 instanceof ParameterizedType) {
                        var11_11 = ((ParameterizedType)var19_19).getActualTypeArguments();
                        com.github.catvod.spider.merge.H.e.j(var11_11, var10_10.getTypeParameters(), (Type[])var3_3);
                    }
                    var3_3 = var11_11;
                }
            }
            var10_10 = var17_13;
            if (var3_3 != null) {
                if (var9_9 /* !! */  == null) {
                    var10_10 = var17_13;
                } else {
                    var9_9 /* !! */  = var9_9 /* !! */ .getTypeParameters();
                    var6_6 = var13_14;
                    while (true) {
                        var10_10 = var17_13;
                        if (var6_6 >= var9_9 /* !! */ .length) break;
                        if (var18_15.equals(var9_9 /* !! */ [var6_6])) {
                            var10_10 = var3_3[var6_6];
                            break;
                        }
                        ++var6_6;
                    }
                }
            }
            if (var10_10 != null) {
                this.e = A.G((Type)var10_10);
                this.f = var10_10;
lbl103:
                // 2 sources

                while (true) {
                    this.p = var1_1.isEnum();
                    return;
                }
            }
        }
        var3_3 = var1_1;
        var9_9 /* !! */  = var2_2;
        if (!(var2_2 instanceof Class)) {
            if (var5_5 == null) {
                var5_5 = var4_4;
            }
            var9_9 /* !! */  = com.github.catvod.spider.merge.H.e.k(var4_4, var5_5, (Type)var2_2, var12_12);
            var3_3 = var1_1;
            if (var9_9 /* !! */  != var2_2) {
                if (var9_9 /* !! */  instanceof ParameterizedType) {
                    while (true) {
                        var3_3 = A.G((Type)var9_9 /* !! */ );
                        break;
                    }
                } else {
                    var3_3 = var1_1;
                    if (var9_9 /* !! */  instanceof Class) ** continue;
                }
            }
        }
        this.f = var9_9 /* !! */ ;
        this.e = var3_3;
        var1_1 = var3_3;
        ** while (true)
    }

    private static boolean i(Type[] typeArray, Map<TypeVariable, Type> map) {
        block3: {
            if (map == null || map.size() == 0) break block3;
            boolean bl = false;
            for (int i2 = 0; i2 < typeArray.length; ++i2) {
                boolean bl2;
                block5: {
                    block6: {
                        Type[] typeArray2;
                        block4: {
                            typeArray2 = typeArray[i2];
                            if (!(typeArray2 instanceof ParameterizedType)) break block4;
                            ParameterizedType parameterizedType = (ParameterizedType)typeArray2;
                            typeArray2 = parameterizedType.getActualTypeArguments();
                            bl2 = bl;
                            if (!com.github.catvod.spider.merge.H.e.i(typeArray2, map)) break block5;
                            typeArray[i2] = X.a(new n(typeArray2, parameterizedType.getOwnerType(), parameterizedType.getRawType()));
                            break block6;
                        }
                        bl2 = bl;
                        if (!(typeArray2 instanceof TypeVariable)) break block5;
                        bl2 = bl;
                        if (!map.containsKey(typeArray2)) break block5;
                        typeArray[i2] = map.get(typeArray2);
                    }
                    bl2 = true;
                }
                bl = bl2;
            }
            return bl;
        }
        return false;
    }

    private static boolean j(Type[] typeArray, TypeVariable[] typeVariableArray, Type[] typeArray2) {
        if (typeArray2 != null && typeVariableArray.length != 0) {
            boolean bl = false;
            for (int i2 = 0; i2 < typeArray.length; ++i2) {
                boolean bl2;
                Type[] typeArray3 = typeArray[i2];
                if (typeArray3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType)typeArray3;
                    typeArray3 = parameterizedType.getActualTypeArguments();
                    bl2 = bl;
                    if (com.github.catvod.spider.merge.H.e.j(typeArray3, typeVariableArray, typeArray2)) {
                        typeArray[i2] = X.a(new n(typeArray3, parameterizedType.getOwnerType(), parameterizedType.getRawType()));
                        bl2 = true;
                    }
                } else {
                    bl2 = bl;
                    if (typeArray3 instanceof TypeVariable) {
                        int n2 = 0;
                        while (true) {
                            bl2 = bl;
                            if (n2 >= typeVariableArray.length) break;
                            if (typeArray3.equals(typeVariableArray[n2])) {
                                typeArray[i2] = typeArray2[n2];
                                bl = true;
                            }
                            ++n2;
                        }
                    }
                }
                bl = bl2;
            }
            return bl;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Type k(Class<?> var0, Type var1_1, Type var2_2, Map<TypeVariable, Type> var3_3) {
        block8: {
            block9: {
                block10: {
                    if (var0 == null || var1_1 == null) break block8;
                    var5_4 = var2_2 instanceof GenericArrayType;
                    if (var5_4) {
                        var7_6 = ((GenericArrayType)var2_2).getGenericComponentType();
                        if (var7_6 != (var0 = com.github.catvod.spider.merge.H.e.k(var0, (Type)var1_1, var7_6, var3_3))) {
                            return Array.newInstance(A.G(var0), 0).getClass();
                        }
                        return var2_2;
                    }
                    if (!A.c0((Type)var1_1)) {
                        return var2_2;
                    }
                    if (var2_2 instanceof TypeVariable) {
                        var7_7 /* !! */  = var1_1 instanceof ParameterizedType == false && var1_1 instanceof Class != false ? A.P(((Class)var1_1).getGenericSuperclass()) : var1_1;
                        var8_8 = var7_7 /* !! */ ;
                        var9_9 = A.G((Type)var8_8);
                        var7_7 /* !! */  = (TypeVariable)var2_2;
                        var9_9 = var9_9.getTypeParameters();
                        for (var4_5 = 0; var4_5 < var9_9.length; ++var4_5) {
                            if (!var9_9[var4_5].getName().equals(var7_7 /* !! */ .getName())) continue;
                            return var8_8.getActualTypeArguments()[var4_5];
                        }
                    }
                    if (!(var2_2 instanceof ParameterizedType)) break block8;
                    var7_7 /* !! */  = (ParameterizedType)var2_2;
                    var8_8 = var7_7 /* !! */ .getActualTypeArguments();
                    var5_4 = var6_10 = com.github.catvod.spider.merge.H.e.i(var8_8, var3_3);
                    if (var6_10) break block9;
                    if (!(var1_1 instanceof ParameterizedType)) break block10;
                    var3_3 = (ParameterizedType)var1_1;
                    var1_1 = var0;
                    var0 = var3_3;
                    ** GOTO lbl34
                }
                if (var0.getGenericSuperclass() instanceof ParameterizedType) {
                    var3_3 = (ParameterizedType)var0.getGenericSuperclass();
                    var1_1 = var0.getSuperclass();
                    var0 = var3_3;
lbl34:
                    // 2 sources

                    var1_1 = var1_1.getTypeParameters();
                } else {
                    var1_1 = var1_1.getClass().getTypeParameters();
                    var0 = var7_7 /* !! */ ;
                }
                var5_4 = com.github.catvod.spider.merge.H.e.j(var8_8, var1_1, var0.getActualTypeArguments());
            }
            if (var5_4) {
                return X.a(new n(var8_8, var7_7 /* !! */ .getOwnerType(), var7_7 /* !! */ .getRawType()));
            }
        }
        return var2_2;
    }

    private long m(String string, b b2) {
        if (b2 != null && b2.name().length() != 0) {
            return A.B(string);
        }
        return A.A(string);
    }

    public final int b(e e2) {
        AnnotatedElement annotatedElement = e2.b;
        if (annotatedElement != null && this.b != null && ((Method)annotatedElement).isBridge() && !this.b.isBridge() && e2.b.getName().equals(this.b.getName())) {
            return 1;
        }
        int n2 = this.d;
        int n3 = e2.d;
        if (n2 < n3) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        n2 = this.a.compareTo(e2.a);
        if (n2 != 0) {
            return n2;
        }
        annotatedElement = this.b;
        Class<?> clazz = null;
        annotatedElement = annotatedElement != null ? ((Method)annotatedElement).getDeclaringClass() : ((annotatedElement = this.c) != null ? ((Field)annotatedElement).getDeclaringClass() : null);
        AccessibleObject accessibleObject = e2.b;
        if (accessibleObject != null) {
            clazz = ((Method)accessibleObject).getDeclaringClass();
        } else {
            accessibleObject = e2.c;
            if (accessibleObject != null) {
                clazz = ((Field)accessibleObject).getDeclaringClass();
            }
        }
        if (annotatedElement != null && clazz != null && annotatedElement != clazz) {
            if (((Class)annotatedElement).isAssignableFrom(clazz)) {
                return -1;
            }
            if (clazz.isAssignableFrom((Class<?>)annotatedElement)) {
                return 1;
            }
        }
        annotatedElement = this.c;
        int n4 = 0;
        n2 = annotatedElement != null && ((Field)annotatedElement).getType() == this.e ? 1 : 0;
        annotatedElement = e2.c;
        n3 = n4;
        if (annotatedElement != null) {
            n3 = n4;
            if (((Field)annotatedElement).getType() == e2.e) {
                n3 = 1;
            }
        }
        if (n2 != 0 && n3 == 0) {
            return 1;
        }
        if (n3 != 0 && n2 == 0) {
            return -1;
        }
        if (e2.e.isPrimitive() && !this.e.isPrimitive()) {
            return 1;
        }
        if (this.e.isPrimitive() && !e2.e.isPrimitive()) {
            return -1;
        }
        if (e2.e.getName().startsWith("java.") && !this.e.getName().startsWith("java.")) {
            return 1;
        }
        if (this.e.getName().startsWith("java.") && !e2.e.getName().startsWith("java.")) {
            return -1;
        }
        return this.e.getName().compareTo(e2.e.getName());
    }

    protected final char[] e() {
        int n2 = this.a.length();
        char[] cArray = new char[n2 + 3];
        String string = this.a;
        string.getChars(0, string.length(), cArray, 1);
        cArray[0] = 34;
        cArray[n2 + 1] = 34;
        cArray[n2 + 2] = 58;
        return cArray;
    }

    public final b h() {
        b b2 = this.l;
        if (b2 != null) {
            return b2;
        }
        return this.m;
    }

    public final Member l() {
        Method method = this.b;
        if (method != null) {
            return method;
        }
        return this.c;
    }

    public final void n(Object object, Object object2) {
        Method method = this.b;
        if (method != null) {
            method.invoke(object, object2);
            return;
        }
        this.c.set(object, object2);
    }

    public final void o() {
        Method method = this.b;
        if (method != null) {
            A.s0(method);
            return;
        }
        A.s0(this.c);
    }

    public final String toString() {
        return this.a;
    }
}

