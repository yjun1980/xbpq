/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.cYh;

public final class I
implements H {
    private static final String[] d;
    public static final I e;
    private final String[] a;
    private final String[] b;
    private final String[] c;

    static {
        String[] stringArray = new String[]{};
        d = stringArray;
        e = new I(stringArray, stringArray, stringArray);
    }

    public I(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        this.a = stringArray;
        this.b = stringArray2;
        if (stringArray3 == null) {
            stringArray3 = d;
        }
        this.c = stringArray3;
        Math.max(stringArray3.length, Math.max(stringArray.length, stringArray2.length));
    }

    public final String a(int n2) {
        Object object;
        if (n2 >= 0 && n2 < ((String[])(object = this.c)).length && (object = object[n2]) != null) {
            return object;
        }
        object = this.b(n2);
        if (object != null) {
            return object;
        }
        object = this.c(n2);
        if (object != null) {
            return object;
        }
        return Integer.toString(n2);
    }

    public final String b(int n2) {
        String[] stringArray;
        if (n2 >= 0 && n2 < (stringArray = this.a).length) {
            return stringArray[n2];
        }
        return null;
    }

    public final String c(int n2) {
        String[] stringArray;
        if (n2 >= 0 && n2 < (stringArray = this.b).length) {
            return stringArray[n2];
        }
        if (n2 == -1) {
            return cYh.d("221F07");
        }
        return null;
    }
}

