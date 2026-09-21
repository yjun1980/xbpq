/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c
extends e {
    public static byte[] b(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        f.e(byArray, cYh.d("5B2429382464"));
        f.e(byArray2, cYh.d("033532253E340624283E39"));
        System.arraycopy(byArray, n3, byArray2, n2, n4 - n3);
        return byArray2;
    }

    public static byte[] c(byte[] byArray, int n2, int n3) {
        f.e(byArray, cYh.d("5B2429382464"));
        d.a(n3, byArray.length);
        byArray = Arrays.copyOfRange(byArray, n2, n3);
        f.d(byArray, cYh.d("043F3128183C35312F363272133828227B7A01222E3C1E340335397D772E08192F3532224E"));
        return byArray;
    }

    public static Object[] d(Object[] objectArray, int n2, int n3) {
        f.e(objectArray, cYh.d("5B2429382464"));
        d.a(n3, objectArray.length);
        objectArray = Arrays.copyOfRange(objectArray, n2, n3);
        f.d(objectArray, cYh.d("043F3128183C35312F363272133828227B7A01222E3C1E340335397D772E08192F3532224E"));
        return objectArray;
    }

    public static List e(Object[] objectArray) {
        f.e(objectArray, cYh.d("5B2429382464"));
        return new ArrayList<Object>(new b<Object>(objectArray, false));
    }
}

