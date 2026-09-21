package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.r.C0230d;
import com.github.catvod.spider.merge.s.C0231a;
import com.github.catvod.spider.merge.v.C0241e;
import com.github.catvod.spider.merge.v.EnumC0238b;

/* loaded from: classes.dex */
public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(EnumC0238b enumC0238b, C0231a c0231a, C0231a c0231a2, C0241e c0241e) {
        return c0231a2.f() + enumC0238b.b(c0241e) + c0231a.f();
    }

    private static C0241e b(int i, int i2) {
        for (int i3 = 1; i3 <= 40; i3++) {
            C0241e e = C0241e.e(i3);
            if (e(i, e, i2)) {
                return e;
            }
        }
        throw new C0230d(cYh.d("23313530772E083F61333E3D"));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map<Lcom/github/catvod/spider/merge/r/b;*>;)Lcom/github/catvod/spider/merge/w/f; */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[LOOP:1: B:41:0x00cf->B:49:0x00fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.github.catvod.spider.merge.w.f c(java.lang.String r23, int r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.w.c.c(java.lang.String, int, java.util.Map):com.github.catvod.spider.merge.w.f");
    }

    static int d(int i) {
        int[] iArr = a;
        if (i < 96) {
            return iArr[i];
        }
        return -1;
    }

    private static boolean e(int i, C0241e c0241e, int i2) {
        return c0241e.d() - c0241e.c(i2).d() >= (i + 7) / 8;
    }
}
