/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

final class a {
    public static final Method a;

    static {
        int n2;
        GenericDeclaration genericDeclaration;
        Method[] methodArray = Throwable.class.getMethods();
        f.d(methodArray, cYh.d("1338333E203B053C241C322E0F3F2522"));
        int n3 = methodArray.length;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            Method method;
            block8: {
                block7: {
                    genericDeclaration = null;
                    Object var7_8 = null;
                    if (n5 >= n3) break;
                    method = methodArray[n5];
                    boolean bl = f.a(method.getName(), cYh.d("06342502222A17222422243F03"));
                    n2 = 1;
                    if (!bl) break block7;
                    Class<?>[] classArray = method.getParameterTypes();
                    f.d(classArray, cYh.d("0E246F213628063D242532283329313424"));
                    genericDeclaration = var7_8;
                    if (classArray.length == 1) {
                        genericDeclaration = classArray[0];
                    }
                    if (f.a(genericDeclaration, Throwable.class)) break block8;
                }
                n2 = 0;
            }
            if (n2 != 0) {
                genericDeclaration = method;
                break;
            }
            ++n5;
        }
        a = genericDeclaration;
        n2 = methodArray.length;
        for (n5 = n4; n5 < n2 && !f.a(methodArray[n5].getName(), cYh.d("00353502222A17222422243F03")); ++n5) {
        }
    }
}

