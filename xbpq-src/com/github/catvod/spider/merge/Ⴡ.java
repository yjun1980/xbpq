/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;

public final class \u10c1
extends Enum<\u10c1> {
    public static final /* enum */ \u10c1 \u037f;
    public static final /* enum */ \u10c1 \u0528;
    public static final /* enum */ \u10c1 \u0529;
    public static final /* enum */ \u10c1 \u052a;
    public static final /* enum */ \u10c1 \u052b;
    private static final \u10c1[] \u052c;
    private int \u052d;
    private String \u052e;

    static {
        Object object = SOY.d("3F00033926");
        object = new \u10c1(40, (String)object);
        \u037f = object;
        Object object2 = SOY.d("2D130338");
        object2 = new \u10c1(30, (String)object2);
        \u0528 = object2;
        Object object3 = SOY.d("331C1739");
        object3 = new \u10c1(20, (String)object3);
        \u0529 = object3;
        Object object4 = SOY.d("3E17132333");
        object4 = new \u10c1(10, (String)object4);
        \u052a = object4;
        Object object5 = SOY.d("2E00103531");
        object5 = new \u10c1(0, (String)object5);
        \u052b = object5;
        \u052c = new \u10c1[]{object, object2, object3, object4, object5};
    }

    private \u10c1(int n3, String string2) {
        this.\u052d = n3;
        this.\u052e = string2;
    }

    public String toString() {
        return this.\u052e;
    }
}

