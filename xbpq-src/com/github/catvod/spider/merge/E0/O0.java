/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.L0;
import com.github.catvod.spider.merge.E0.M0;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.P0;
import java.nio.charset.Charset;
import java.util.Arrays;

final class O0
extends M0 {
    O0() {
    }

    private static int c(byte[] byArray, int n2, long l2, int n3) {
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 == 2) {
                    return P0.b(n2, L0.m(byArray, l2), L0.m(byArray, l2 + 1L));
                }
                throw new AssertionError();
            }
            return P0.a(n2, L0.m(byArray, l2));
        }
        n3 = P0.b;
        n3 = n2;
        if (n2 > -12) {
            n3 = -1;
        }
        return n3;
    }

    @Override
    final String a(byte[] byArray, int n2, int n3) {
        Charset charset = N.a;
        String string = new String(byArray, n2, n3, charset);
        if (string.indexOf(65533) < 0) {
            return string;
        }
        if (Arrays.equals(string.getBytes(charset), Arrays.copyOfRange(byArray, n2, n3 + n2))) {
            return string;
        }
        throw O.b();
    }

    @Override
    final int b(byte[] byArray, int n2, int n3) {
        block17: {
            block16: {
                long l2;
                long l3;
                int n4;
                long l4;
                block15: {
                    if ((n2 | n3 | byArray.length - n3) < 0) break block17;
                    l4 = n2;
                    n4 = (int)((long)n3 - l4);
                    if (n4 < 16) {
                        n2 = 0;
                    } else {
                        int n5 = (int)l4;
                        l3 = l4;
                        n2 = 0;
                        while (true) {
                            l2 = ++l3;
                            n3 = ++n2;
                            if (n2 >= 8 - (n5 & 7)) break;
                            if (L0.m(byArray, l3) >= 0) {
                                continue;
                            }
                            break block15;
                            break;
                        }
                        while ((n2 = n3 + 8) <= n4 && (L0.q(byArray, L0.f + l2) & 0x8080808080808080L) == 0L) {
                            l2 += 8L;
                            n3 = n2;
                        }
                        n2 = n3;
                        while (n2 < n4) {
                            if (L0.m(byArray, l2) >= 0) {
                                ++n2;
                                ++l2;
                                continue;
                            }
                            break block15;
                        }
                        n2 = n4;
                    }
                }
                n3 = n4 - n2;
                l3 = l4 + (long)n2;
                n2 = n3;
                while (true) {
                    block20: {
                        block19: {
                            block18: {
                                n4 = 0;
                                n3 = n2;
                                n2 = n4;
                                while (true) {
                                    l2 = l3;
                                    if (n3 <= 0) break;
                                    l2 = l3 + 1L;
                                    n2 = L0.m(byArray, l3);
                                    if (n2 < 0) break;
                                    --n3;
                                    l3 = l2;
                                }
                                if (n3 == 0) {
                                    n2 = 0;
                                    break block16;
                                }
                                --n3;
                                if (n2 < -32) {
                                    if (n3 != 0) {
                                        --n3;
                                        if (n2 < -62 || L0.m(byArray, l2) > -65) break;
                                        l3 = l2 + 1L;
                                        n2 = n3;
                                        continue;
                                    }
                                    break block16;
                                }
                                if (n2 >= -16) break block18;
                                if (n3 >= 2) {
                                    n3 -= 2;
                                    l4 = l2 + 1L;
                                    n4 = L0.m(byArray, l2);
                                    if (n4 > -65 || n2 == -32 && n4 < -96 || n2 == -19 && n4 >= -96) break;
                                    l3 = l4 + 1L;
                                    n2 = n3;
                                    if (L0.m(byArray, l4) <= -65) continue;
                                    break;
                                }
                                break block19;
                            }
                            if (n3 >= 3) break block20;
                        }
                        n2 = O0.c(byArray, n2, l2, n3);
                        break block16;
                    }
                    n3 -= 3;
                    l3 = l2 + 1L;
                    n4 = L0.m(byArray, l2);
                    if (n4 > -65 || n4 + 112 + (n2 << 28) >> 30 != 0) break;
                    l2 = l3 + 1L;
                    if (L0.m(byArray, l3) > -65 || L0.m(byArray, l2) > -65) break;
                    l3 = l2 + 1L;
                    n2 = n3;
                }
                n2 = -1;
            }
            return n2;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", byArray.length, n2, n3));
    }
}

