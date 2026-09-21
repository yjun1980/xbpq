/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.k;
import java.util.Arrays;

final class i
implements k {
    static void b(byte by, byte by2, byte by3, byte by4, char[] cArray, int n2) {
        if (!(i.e(by2) || by2 + 112 + (by << 28) >> 30 != 0 || i.e(by3) || i.e(by4))) {
            by = (byte)((by & 7) << 18 | (by2 & 0x3F) << 12 | (by3 & 0x3F) << 6 | by4 & 0x3F);
            cArray[n2] = (char)((by >>> 10) + 55232);
            cArray[n2 + 1] = (char)((by & 0x3FF) + 56320);
            return;
        }
        throw O.b();
    }

    static void c(byte by, byte by2, char[] cArray, int n2) {
        if (by >= -62 && !i.e(by2)) {
            cArray[n2] = (char)((by & 0x1F) << 6 | by2 & 0x3F);
            return;
        }
        throw O.b();
    }

    static void d(byte by, byte by2, byte by3, char[] cArray, int n2) {
        if (!(i.e(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || i.e(by3))) {
            cArray[n2] = (char)((by & 0xF) << 12 | (by2 & 0x3F) << 6 | by3 & 0x3F);
            return;
        }
        throw O.b();
    }

    private static boolean e(byte by) {
        boolean bl = by > -65;
        return bl;
    }

    @Override
    public byte[] a(byte[] byArray, int n2, int n3) {
        return Arrays.copyOfRange(byArray, n2, n3 + n2);
    }
}

