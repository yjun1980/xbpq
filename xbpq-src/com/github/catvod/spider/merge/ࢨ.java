/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08a7;

public class \u08a8
implements \u08a7 {
    private static final String[] \u037f;
    public static final \u08a8 \u0528;
    private final String[] \u0529;
    private final String[] \u052a;
    private final String[] \u052b;
    private final int \u052c;

    static {
        String[] stringArray = new String[]{};
        \u037f = stringArray;
        \u0528 = new \u08a8(stringArray, stringArray, stringArray);
    }

    public \u08a8(String[] stringArray, String[] stringArray2) {
        this(stringArray, stringArray2, null);
    }

    public \u08a8(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        if (stringArray == null) {
            stringArray = \u037f;
        }
        this.\u0529 = stringArray;
        if (stringArray2 == null) {
            stringArray2 = \u037f;
        }
        this.\u052a = stringArray2;
        if (stringArray3 == null) {
            stringArray3 = \u037f;
        }
        this.\u052b = stringArray3;
        this.\u052c = Math.max(stringArray3.length, Math.max(stringArray.length, stringArray2.length)) - 1;
    }

    @Override
    public String \u037f(int n2) {
        String[] stringArray;
        if (n2 >= 0 && n2 < (stringArray = this.\u052a).length) {
            return stringArray[n2];
        }
        if (n2 == -1) {
            return SOY.d("3F1D17");
        }
        return null;
    }

    @Override
    public String \u0528(int n2) {
        String[] stringArray;
        if (n2 >= 0 && n2 < (stringArray = this.\u0529).length) {
            return stringArray[n2];
        }
        return null;
    }

    @Override
    public String \u0529(int n2) {
        Object object;
        if (n2 >= 0 && n2 < ((String[])(object = this.\u052b)).length && (object = object[n2]) != null) {
            return object;
        }
        object = this.\u0528(n2);
        if (object != null) {
            return object;
        }
        object = this.\u037f(n2);
        if (object != null) {
            return object;
        }
        return Integer.toString(n2);
    }
}

