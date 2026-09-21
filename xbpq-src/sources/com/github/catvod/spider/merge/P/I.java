package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class I implements H {
    private static final String[] d;
    public static final I e;
    private final String[] a;
    private final String[] b;
    private final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new I(strArr, strArr, strArr);
    }

    public I(String[] strArr, String[] strArr2, String[] strArr3) {
        this.a = strArr;
        this.b = strArr2;
        strArr3 = strArr3 == null ? d : strArr3;
        this.c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    public final String a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String b = b(i);
        if (b != null) {
            return b;
        }
        String c = c(i);
        return c != null ? c : Integer.toString(i);
    }

    public final String b(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final String c(int i) {
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return cYh.d("221F07");
        }
        return null;
    }
}
