/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class c {
    private static final Object[] a = new Object[0];

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] a(Collection<?> objectArray) {
        f.e(objectArray, cYh.d("043F2D3D323913392E3F"));
        int n2 = objectArray.size();
        if (n2 == 0) return a;
        Iterator iterator = objectArray.iterator();
        if (!iterator.hasNext()) {
            return a;
        }
        objectArray = new Object[n2];
        n2 = 0;
        while (true) {
            Object[] objectArray2;
            int n3 = n2 + 1;
            objectArray[n2] = iterator.next();
            if (n3 >= objectArray.length) {
                int n4;
                if (!iterator.hasNext()) {
                    return objectArray;
                }
                n2 = n4 = n3 * 3 + 1 >>> 1;
                if (n4 <= n3) {
                    if (n3 >= 0x7FFFFFFD) throw new OutOfMemoryError();
                    n2 = 0x7FFFFFFD;
                }
                objectArray2 = Arrays.copyOf(objectArray, n2);
                f.d(objectArray2, cYh.d("043F3128183C4F2224222236137C613F322D34393B347E"));
            } else {
                objectArray2 = objectArray;
                if (!iterator.hasNext()) {
                    objectArray = Arrays.copyOf(objectArray, n3);
                    f.d(objectArray, cYh.d("043F3128183C4F2224222236137C61223E200279"));
                    return objectArray;
                }
            }
            n2 = n3;
            objectArray = objectArray2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object[] b(Collection<?> object, Object[] objectArray) {
        void var0_11;
        void var1_13;
        f.e(object, cYh.d("043F2D3D323913392E3F"));
        var1_13.getClass();
        int n2 = object.size();
        int n3 = 0;
        if (n2 == 0) {
            void var0_1 = var1_13;
            if (((void)var1_13).length <= 0) return var0_11;
            var1_13[0] = null;
            void var0_2 = var1_13;
            return var0_11;
        }
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            void var0_3 = var1_13;
            if (((void)var1_13).length <= 0) return var0_11;
            var1_13[0] = null;
            void var0_4 = var1_13;
            return var0_11;
        }
        if (n2 <= ((void)var1_13).length) {
            void var0_5 = var1_13;
        } else {
            Object object2 = Array.newInstance(var1_13.getClass().getComponentType(), n2);
            f.c(object2, cYh.d("09252D3D7739063E2F3E237A0535613236291370353E7734083E6C3F22360B703528273F473B2E253B33097E0023253B1E6C2A3E23360E3E6F103923586E"));
            Object[] objectArray2 = (Object[])object2;
        }
        while (true) {
            void var5_18;
            void var0_8;
            n2 = n3 + 1;
            var0_8[n3] = iterator.next();
            if (n2 >= ((void)var0_8).length) {
                int n4;
                if (!iterator.hasNext()) return var0_11;
                n3 = n4 = n2 * 3 + 1 >>> 1;
                if (n4 <= n2) {
                    if (n2 >= 0x7FFFFFFD) throw new OutOfMemoryError();
                    n3 = 0x7FFFFFFD;
                }
                T[] TArray = Arrays.copyOf(var0_8, n3);
                f.d(TArray, cYh.d("043F3128183C4F2224222236137C613F322D34393B347E"));
            } else {
                void var5_20 = var0_8;
                if (!iterator.hasNext()) {
                    if (var0_8 == var1_13) {
                        var1_13[n2] = null;
                        void var0_9 = var1_13;
                        return var0_11;
                    } else {
                        T[] TArray = Arrays.copyOf(var0_8, n2);
                        f.d(TArray, cYh.d("043F3128183C4F2224222236137C61223E200279"));
                    }
                    return var0_11;
                }
            }
            n3 = n2;
            void var0_12 = var5_18;
        }
    }
}

