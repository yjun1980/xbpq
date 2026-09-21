/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.M0;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.P0;
import com.github.catvod.spider.merge.E0.i;

final class N0
extends M0 {
    N0() {
    }

    @Override
    final String a(byte[] byArray, int n2, int n3) {
        if ((n2 | n3 | byArray.length - n2 - n3) >= 0) {
            byte by;
            int n4;
            int n5 = n2 + n3;
            char[] cArray = new char[n3];
            n3 = 0;
            while (n2 < n5 && (n4 = (by = byArray[n2]) >= 0 ? 1 : 0) != 0) {
                ++n2;
                cArray[n3] = (char)by;
                ++n3;
            }
            n4 = n3;
            n3 = n2;
            n2 = n4;
            while (n3 < n5) {
                n4 = n3 + 1;
                byte by2 = byArray[n3];
                if ((n3 = by2 >= 0 ? 1 : 0) != 0) {
                    n3 = n2 + 1;
                    cArray[n2] = (char)by2;
                    n2 = n3;
                    n3 = n4;
                    while (n3 < n5 && (n4 = (by = byArray[n3]) >= 0 ? 1 : 0) != 0) {
                        ++n3;
                        cArray[n2] = (char)by;
                        ++n2;
                    }
                    continue;
                }
                n3 = by2 < -32 ? 1 : 0;
                if (n3 != 0) {
                    if (n4 < n5) {
                        i.c(by2, byArray[n4], cArray, n2);
                        n3 = n4 + 1;
                        ++n2;
                        continue;
                    }
                    throw O.b();
                }
                n3 = by2 < -16 ? 1 : 0;
                if (n3 != 0) {
                    if (n4 < n5 - 1) {
                        n3 = n4 + 1;
                        i.d(by2, byArray[n4], byArray[n3], cArray, n2);
                        ++n3;
                        ++n2;
                        continue;
                    }
                    throw O.b();
                }
                if (n4 < n5 - 2) {
                    n3 = n4 + 1;
                    byte by3 = byArray[n4];
                    n4 = n3 + 1;
                    i.b(by2, by3, byArray[n3], byArray[n4], cArray, n2);
                    n3 = n4 + 1;
                    n2 = n2 + 1 + 1;
                    continue;
                }
                throw O.b();
            }
            return new String(cArray, 0, n2);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", byArray.length, n2, n3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final int b(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 < n3 && byArray[n4] >= 0; ++n4) {
        }
        n2 = n4;
        if (n4 >= n3) return 0;
        while (n2 < n3) {
            n4 = n2 + 1;
            int n5 = byArray[n2];
            n2 = n4;
            if (n5 >= 0) continue;
            if (n5 < -32) {
                if (n4 >= n3) {
                    return n5;
                }
                if (n5 < -62) return -1;
                n2 = n4 + 1;
                if (byArray[n4] <= -65) continue;
                return -1;
            }
            if (n5 < -16) {
                if (n4 >= n3 - 1) return P0.c(byArray, n4, n3);
                int n6 = n4 + 1;
                n2 = byArray[n4];
                if (n2 > -65) return -1;
                if (n5 == -32) {
                    if (n2 < -96) return -1;
                }
                if (n5 == -19) {
                    if (n2 >= -96) return -1;
                }
                n2 = n6 + 1;
                if (byArray[n6] <= -65) continue;
                return -1;
            }
            if (n4 >= n3 - 2) {
                return P0.c(byArray, n4, n3);
            }
            n2 = n4 + 1;
            if ((n4 = byArray[n4]) > -65) return -1;
            if (n4 + 112 + (n5 << 28) >> 30 != 0) return -1;
            n4 = n2 + 1;
            if (byArray[n2] > -65) return -1;
            n2 = n4 + 1;
            if (byArray[n4] > -65) return -1;
        }
        return 0;
    }
}

