/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class \u0374 {
    public static final boolean[] \u037f = new boolean[0];
    public static final Boolean[] \u0528 = new Boolean[0];
    public static final byte[] \u0529 = new byte[0];
    public static final Byte[] \u052a = new Byte[0];
    public static final char[] \u052b = new char[0];
    public static final Character[] \u052c = new Character[0];
    public static final Class<?>[] \u052d = new Class[0];
    public static final double[] \u052e = new double[0];
    public static final Double[] \u052f = new Double[0];
    public static final Field[] \u058f = new Field[0];
    public static final float[] \u0620 = new float[0];
    public static final Float[] \u0780 = new Float[0];
    public static final int[] \u0781 = new int[0];
    public static final Integer[] \u0782 = new Integer[0];
    public static final long[] \u0783 = new long[0];
    public static final Long[] \u0784 = new Long[0];
    public static final Method[] \u0785 = new Method[0];
    public static final Object[] \u0786 = new Object[0];
    public static final short[] \u0787 = new short[0];
    public static final Short[] \u0788 = new Short[0];
    public static final String[] \u0789 = new String[0];
    public static final Throwable[] \u078a = new Throwable[0];
    public static final Type[] \u078b = new Type[0];

    public static <T> T[] \u037f(T[] TArray) {
        if (TArray == null) {
            return null;
        }
        return (Object[])TArray.clone();
    }

    public static int \u0528(Object object) {
        if (object == null) {
            return 0;
        }
        return Array.getLength(object);
    }

    public static boolean \u0529(char[] cArray) {
        boolean bl = \u0374.\u0528(cArray) == 0;
        return bl;
    }
}

