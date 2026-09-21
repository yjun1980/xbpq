/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.mI.n;

public abstract class m {
    public static final n a;

    static {
        n n2 = null;
        try {
            n n3;
            n2 = n3 = (n)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException exception) {
            // empty catch block
        }
        if (n2 == null) {
            n2 = new n();
        }
        a = n2;
    }
}

