/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

final class d {
    private static final Class<?> a;
    private static final boolean b;
    public static final int c = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Class<?> clazz;
        Object var2 = null;
        try {
            clazz = Class.forName("libcore.io.Memory");
        }
        catch (Throwable throwable) {
            clazz = null;
        }
        a = clazz;
        try {
            clazz = Class.forName("org.robolectric.Robolectric");
        }
        catch (Throwable throwable) {
            clazz = var2;
        }
        boolean bl = clazz != null;
        b = bl;
    }

    static Class<?> a() {
        return a;
    }

    static boolean b() {
        boolean bl = a != null && !b;
        return bl;
    }
}

