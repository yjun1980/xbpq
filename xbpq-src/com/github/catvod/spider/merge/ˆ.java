/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

public final class \u02c6 {
    public static int \u037f(int n2, int n3) {
        n2 ^= n3 * 4;
        n2 = (n2 ^ n2 >>> 16) * -2048144789;
        n2 = (n2 ^ n2 >>> 13) * -1028477387;
        return n2 ^ n2 >>> 16;
    }

    public static <T> int \u0528(T[] TArray, int n2) {
        int n3 = \u02c6.\u052a(n2);
        int n4 = TArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            n3 = \u02c6.\u052c(n3, TArray[n2]);
        }
        return \u02c6.\u037f(n3, TArray.length);
    }

    public static int \u0529() {
        return \u02c6.\u052a(0);
    }

    public static int \u052a(int n2) {
        return n2;
    }

    public static int \u052b(int n2, int n3) {
        return ((n2 ^= ((n3 *= -862048943) >>> 17 | n3 << 15) * 461845907) >>> 19 | n2 << 13) * 5 - 430675100;
    }

    public static int \u052c(int n2, Object object) {
        int n3 = object != null ? object.hashCode() : 0;
        return \u02c6.\u052b(n2, n3);
    }
}

