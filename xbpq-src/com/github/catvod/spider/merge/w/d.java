/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.w.b;

final class d {
    static int a(b b2) {
        return d.b(b2, true) + d.b(b2, false);
    }

    private static int b(b object, boolean bl) {
        int n2 = bl ? ((b)object).d() : ((b)object).e();
        int n3 = bl ? ((b)object).e() : ((b)object).d();
        object = ((b)object).c();
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = -1;
            Object object2 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object3 = bl ? object[i2][i3] : object[i3][i2];
                if (object3 == n5) {
                    object3 = object2 + 1;
                    object2 = n5;
                } else {
                    n5 = n4;
                    if (object2 >= 5) {
                        n5 = n4 + (object2 - 5 + 3);
                    }
                    object2 = object3;
                    object3 = true;
                    n4 = n5;
                }
                n5 = object2;
                object2 = object3;
            }
            n5 = n4;
            if (object2 >= 5) {
                n5 = object2 - 5 + 3 + n4;
            }
            n4 = n5;
        }
        return n4;
    }

    static int c(b object) {
        byte[][] byArray = ((b)object).c();
        int n2 = ((b)object).e();
        int n3 = ((b)object).d();
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                int n5;
                int n6;
                block6: {
                    block7: {
                        object = byArray[i2];
                        n6 = i3 + 6;
                        n5 = n4;
                        if (n6 >= n2) break block6;
                        n5 = n4;
                        if (object[i3] != true) break block6;
                        n5 = n4;
                        if (object[i3 + 1] != false) break block6;
                        n5 = n4;
                        if (object[i3 + 2] != true) break block6;
                        n5 = n4;
                        if (object[i3 + 3] != true) break block6;
                        n5 = n4;
                        if (object[i3 + 4] != true) break block6;
                        n5 = n4;
                        if (object[i3 + 5] != false) break block6;
                        n5 = n4;
                        if (object[n6] != true) break block6;
                        if (d.d((byte[])object, i3 - 4, i3)) break block7;
                        n5 = n4;
                        if (!d.d((byte[])object, i3 + 7, i3 + 11)) break block6;
                    }
                    n5 = n4 + 1;
                }
                n6 = i2 + 6;
                n4 = n5;
                if (n6 >= n3) continue;
                n4 = n5;
                if (byArray[i2][i3] != 1) continue;
                n4 = n5;
                if (byArray[i2 + 1][i3] != 0) continue;
                n4 = n5;
                if (byArray[i2 + 2][i3] != 1) continue;
                n4 = n5;
                if (byArray[i2 + 3][i3] != 1) continue;
                n4 = n5;
                if (byArray[i2 + 4][i3] != 1) continue;
                n4 = n5;
                if (byArray[i2 + 5][i3] != 0) continue;
                n4 = n5;
                if (byArray[n6][i3] != 1) continue;
                if (!d.e(byArray, i3, i2 - 4, i2)) {
                    n4 = n5;
                    if (!d.e(byArray, i3, i2 + 7, i2 + 11)) continue;
                }
                n4 = n5 + 1;
            }
        }
        return n4 * 40;
    }

    private static boolean d(byte[] byArray, int n2, int n3) {
        n3 = Math.min(n3, byArray.length);
        for (n2 = Math.max(n2, 0); n2 < n3; ++n2) {
            if (byArray[n2] != 1) continue;
            return false;
        }
        return true;
    }

    private static boolean e(byte[][] byArray, int n2, int n3, int n4) {
        n4 = Math.min(n4, byArray.length);
        for (n3 = Math.max(n3, 0); n3 < n4; ++n3) {
            if (byArray[n3][n2] != 1) continue;
            return false;
        }
        return true;
    }
}

