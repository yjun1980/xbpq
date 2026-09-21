/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.lang.reflect.Method;
import java.util.Comparator;

public final class z
implements Comparator<Method> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int compare(Object genericDeclaration, Object genericDeclaration2) {
        genericDeclaration = (Method)genericDeclaration;
        genericDeclaration2 = (Method)genericDeclaration2;
        int n2 = ((Method)genericDeclaration).getName().compareTo(((Method)genericDeclaration2).getName());
        if (n2 != 0) return n2;
        if ((genericDeclaration = ((Method)genericDeclaration).getReturnType()).equals(genericDeclaration2 = ((Method)genericDeclaration2).getReturnType())) {
            return 0;
        }
        if (((Class)genericDeclaration).isAssignableFrom((Class<?>)genericDeclaration2)) {
            return -1;
        }
        if (!((Class)genericDeclaration2).isAssignableFrom((Class<?>)genericDeclaration)) return 0;
        return 1;
    }
}

