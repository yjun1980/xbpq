/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.h0;

import com.github.catvod.spider.merge.mI.i;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public abstract class a {
    public static final Method a;

    static {
        GenericDeclaration genericDeclaration;
        Method[] methodArray = Throwable.class.getMethods();
        i.b(methodArray);
        int n2 = methodArray.length;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            genericDeclaration = null;
            Class<?> clazz = null;
            if (n4 >= n2) break;
            Method method = methodArray[n4];
            if (i.a(method.getName(), "addSuppressed")) {
                Class<?>[] classArray = method.getParameterTypes();
                i.d(classArray, "getParameterTypes(...)");
                genericDeclaration = clazz;
                if (classArray.length == 1) {
                    genericDeclaration = classArray[0];
                }
                if (i.a(genericDeclaration, Throwable.class)) {
                    genericDeclaration = method;
                    break;
                }
            }
            ++n4;
        }
        a = genericDeclaration;
        n2 = methodArray.length;
        for (n4 = n3; n4 < n2 && !i.a(methodArray[n4].getName(), "getSuppressed"); ++n4) {
        }
    }
}

