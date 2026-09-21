/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.JavaMembers$MethodSignature;
import org.mozilla.javascript.Scriptable;

class JavaMembers_jdk11
extends JavaMembers {
    JavaMembers_jdk11(Scriptable scriptable, Class<?> clazz, boolean bl) {
        super(scriptable, clazz, bl);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static Method findAccessibleMethod(Method var0) {
        var3_1 /* !! */  = var0.getDeclaringClass();
        var5_3 = var0.getName();
        var6_4 = var0.getParameterTypes();
        while (true) {
            block7: {
                for (GenericDeclaration var4_7 : var3_1 /* !! */ .getInterfaces()) {
                    try {
                        var4_7 = var4_7.getMethod(var5_3, var6_4);
                        var0 = var4_7;
                        break block7;
                    }
                    catch (NoSuchMethodException var4_8) {
                    }
                }
                var4_7 = var3_1 /* !! */ .getSuperclass();
                if (var4_7 != null) {
                    var3_1 /* !! */  = var4_7;
                    if (!JavaMembers_jdk11.isExportedClass(var4_7)) ** continue;
                    var3_1 /* !! */  = var4_7.getMethod(var5_3, var6_4);
                    var0 = var3_1 /* !! */ ;
                }
            }
            return var0;
            catch (NoSuchMethodException var3_2) {
                var3_1 /* !! */  = var4_7;
                continue;
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean isExportedClass(Class<?> clazz) {
        Object object = clazz.getPackage();
        boolean bl = false;
        if (object == null) {
            if (!Proxy.isProxyClass(clazz)) {
                return true;
            }
            object = clazz.getName();
            object = ((String)object).substring(0, ((String)object).lastIndexOf(46));
        } else {
            object = ((Package)object).getName();
        }
        Object object2 = clazz.getClass();
        try {
            object2 = ((Class)object2).getMethod("getModule", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return true;
        }
        object2 = ((Method)object2).invoke(clazz, new Object[0]);
        clazz = object2.getClass();
        try {
            boolean bl2 = (Boolean)clazz.getMethod("isExported", String.class).invoke(object2, object);
            return bl2;
        }
        catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException exception) {
            return bl;
        }
    }

    @Override
    void discoverPublicMethods(Class<?> methodArray, Map<JavaMembers$MethodSignature, Method> map) {
        if (JavaMembers_jdk11.isExportedClass(methodArray)) {
            super.discoverPublicMethods((Class<?>)methodArray, map);
        } else {
            methodArray = methodArray.getMethods();
            int n2 = methodArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                JavaMembers.registerMethod(map, JavaMembers_jdk11.findAccessibleMethod(methodArray[i2]));
            }
        }
    }
}

