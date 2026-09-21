/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Bk.c;
import com.github.catvod.spider.merge.Bk.j;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.Bk.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public abstract class n {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, Object object) {
        IllegalAccessException illegalAccessException2;
        block5: {
            InstantiationException instantiationException2;
            block4: {
                try {
                    m.n(constructor.newInstance(object));
                    return;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block4;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block5;
                }
                throw new RuntimeException(invocationTargetException);
            }
            throw new RuntimeException(instantiationException2);
        }
        throw new RuntimeException(illegalAccessException2);
    }

    public static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.replace(".", "_"));
        stringBuilder.append("_LifecycleAdapter");
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int c(Class var0) {
        block27: {
            block26: {
                block23: {
                    block25: {
                        var3_4 = 1;
                        var9_5 = n.a;
                        var6_6 = (Integer)var9_5.get(var0);
                        if (var6_6 != null) {
                            return var6_6.intValue();
                        }
                        if (var0.getCanonicalName() != null) break block25;
                        var1_8 = var3_4;
                        ** GOTO lbl95
                    }
                    var8_9 = null;
                    try {
                        var6_6 = var0.getPackage();
                        var7_10 = var0.getCanonicalName();
                        var6_6 = var6_6 != null ? var6_6.getName() : "";
                    }
                    catch (NoSuchMethodException var0_1) {
                        throw new RuntimeException(var0_1);
                    }
                    catch (ClassNotFoundException var6_7) {
                        break block23;
                    }
                    if (!var6_6.isEmpty()) {
                        var7_10 = var7_10.substring(var6_6.length() + 1);
                    }
                    var7_10 = n.b((String)var7_10);
                    if (var6_6.isEmpty()) {
                        var6_6 = var7_10;
                    } else {
                        var10_11 = new StringBuilder();
                        var10_11.append((String)var6_6);
                        var10_11.append(".");
                        var10_11.append((String)var7_10);
                        var6_6 = var10_11.toString();
                    }
                    var7_10 = Class.forName((String)var6_6).getDeclaredConstructor(new Class[]{var0});
                    var6_6 = var7_10;
                    if (!var7_10.isAccessible()) {
                        var7_10.setAccessible(true);
                        var6_6 = var7_10;
                    }
                    break block26;
                }
                var6_6 = null;
            }
            var10_11 = n.b;
            if (var6_6 == null) break block27;
            var10_11.put(var0, Collections.singletonList(var6_6));
lbl46:
            // 2 sources

            while (true) {
                var1_8 = 2;
                ** GOTO lbl95
                break;
            }
        }
        var6_6 = c.c;
        var7_10 = var6_6.b;
        var11_12 /* !! */  = (Method[])var7_10.get(var0);
        if (var11_12 /* !! */  != null) {
            var5_13 = var11_12 /* !! */ .booleanValue();
        } else {
            var11_12 /* !! */  = var0.getDeclaredMethods();
        }
lbl59:
        // 3 sources

        while (true) {
            block24: {
                block28: {
                    if (!var5_13) break block28;
                    var1_8 = var3_4;
                    break block24;
                }
                var6_6 = var0.getSuperclass();
                var1_8 = var6_6 != null && j.class.isAssignableFrom(var6_6) != false ? 1 : 0;
                var7_10 = var8_9;
                if (var1_8 == 0) ** GOTO lbl72
                if (n.c(var6_6) == 1) {
                    var1_8 = var3_4;
                } else {
                    var7_10 = new ArrayList<E>((Collection)var10_11.get(var6_6));
lbl72:
                    // 2 sources

                    var8_9 = var0.getInterfaces();
                    var4_15 = var8_9.length;
                    for (var1_8 = 0; var1_8 < var4_15; ++var1_8) {
                        var11_12 /* !! */  = var8_9[var1_8];
                        var2_14 = var11_12 /* !! */  != null && j.class.isAssignableFrom((Class<?>)var11_12 /* !! */ ) != false ? 1 : 0;
                        if (var2_14 == 0) {
                            var6_6 = var7_10;
                        } else {
                            if (n.c((Class)var11_12 /* !! */ ) == 1) {
                                var1_8 = var3_4;
                                break block24;
                            }
                            var6_6 = var7_10;
                            if (var7_10 == null) {
                                var6_6 = new ArrayList<E>();
                            }
                            var6_6.addAll((Collection)var10_11.get(var11_12 /* !! */ ));
                        }
                        var7_10 = var6_6;
                    }
                    var1_8 = var3_4;
                    if (var7_10 != null) {
                        var10_11.put(var0, var7_10);
                        ** continue;
                    }
                }
            }
            var9_5.put(var0, var1_8);
            return var1_8;
        }
        catch (NoClassDefFoundError var0_2) {
            var0_3 = new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", var0_2);
            throw var0_3;
        }
        var2_14 = var11_12 /* !! */ .length;
        for (var1_8 = 0; var1_8 < var2_14; ++var1_8) {
            if (var11_12 /* !! */ [var1_8].getAnnotation(o.class) == null) continue;
            var6_6.a(var0, var11_12 /* !! */ );
            var5_13 = true;
            ** GOTO lbl59
        }
        var7_10.put(var0, Boolean.FALSE);
        var5_13 = false;
        ** while (true)
    }
}

