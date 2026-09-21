package com.github.catvod.spider.merge.N;

/* loaded from: classes.dex */
public final class h {
    public static final int a() {
        return i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        if (r9 == '+') goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.h.b(java.lang.String, long, long, long):long");
    }

    public static final String c(String str) {
        int i = i.b;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int d(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) b(str, i, i2, i3);
    }
}
