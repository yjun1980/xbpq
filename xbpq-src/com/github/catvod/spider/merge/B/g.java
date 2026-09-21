/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.y.d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;

public final class g
extends f {
    private static final ThreadLocal<char[]> r = new ThreadLocal();
    private char[] q;

    /*
     * Unable to fully structure code
     */
    @Override
    public final byte[] A() {
        block10: {
            block12: {
                block11: {
                    if (this.a == 26) break block10;
                    var15_1 = this.q;
                    var3_2 = this.h + 1;
                    var2_3 = this.g;
                    var14_4 = com.github.catvod.spider.merge.H.i.a;
                    var7_5 = 0;
                    if (var2_3 != 0) break block11;
                    var14_4 = new byte[0];
                    break block12;
                }
                var1_6 = var3_2 + var2_3 - 1;
                while (true) {
                    var5_7 = var1_6;
                    if (var3_2 >= var1_6) break;
                    var5_7 = var1_6;
                    if (com.github.catvod.spider.merge.H.i.p[var15_1[var3_2]] >= 0) break;
                    ++var3_2;
                }
                while (var5_7 > 0 && com.github.catvod.spider.merge.H.i.p[var15_1[var5_7]] < 0) {
                    --var5_7;
                }
                var1_6 = var15_1[var5_7] == '=' ? (var15_1[var5_7 - 1] == '=' ? 2 : 1) : 0;
                var4_8 = var5_7 - var3_2 + 1;
                if (var2_3 > 76) {
                    var2_3 = var15_1[76] == '\r' ? var4_8 / 78 : 0;
                    var6_9 = var2_3 << 1;
                } else {
                    var6_9 = 0;
                }
                var8_10 = ((var4_8 - var6_9) * 6 >> 3) - var1_6;
                var14_4 = new byte[var8_10];
                var9_11 = var8_10 / 3;
                var2_3 = 0;
                var4_8 = 0;
                while (var2_3 < var9_11 * 3) {
                    var16_16 = com.github.catvod.spider.merge.H.i.p;
                    var11_13 = var3_2 + 1;
                    var10_12 = var16_16[var15_1[var3_2]];
                    var3_2 = var11_13 + 1;
                    var11_13 = var16_16[var15_1[var11_13]];
                    var12_14 = var3_2 + 1;
                    var13_15 = var16_16[var15_1[var3_2]];
                    var3_2 = var12_14 + 1;
                    var12_14 = var10_12 << 18 | var11_13 << 12 | var13_15 << 6 | var16_16[var15_1[var12_14]];
                    var11_13 = var2_3 + 1;
                    var14_4[var2_3] = (byte)(var12_14 >> 16);
                    var10_12 = var11_13 + 1;
                    var14_4[var11_13] = (byte)(var12_14 >> 8);
                    var14_4[var10_12] = (byte)var12_14;
                    var2_3 = var4_8++;
                    if (var6_9 <= 0) ** GOTO lbl-1000
                    var2_3 = var4_8;
                    if (var4_8 == 19) {
                        var3_2 += 2;
                        var4_8 = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_8 = var2_3;
                    }
                    var2_3 = var10_12 + 1;
                }
                if (var2_3 < var8_10) {
                    var4_8 = 0;
                    var6_9 = var7_5;
                    while (var3_2 <= var5_7 - var1_6) {
                        var4_8 |= com.github.catvod.spider.merge.H.i.p[var15_1[var3_2]] << 18 - var6_9 * 6;
                        ++var6_9;
                        ++var3_2;
                    }
                    var1_6 = 16;
                    while (var2_3 < var8_10) {
                        var14_4[var2_3] = (byte)(var4_8 >> var1_6);
                        var1_6 -= 8;
                        ++var2_3;
                    }
                }
            }
            return var14_4;
        }
        throw new d("TODO");
    }

    @Override
    public final String J() {
        int n2;
        int n3;
        block5: {
            int n4;
            block4: {
                n2 = n3 = this.h;
                if (n3 == -1) {
                    n2 = 0;
                }
                char c2 = this.Q(this.g + n2 - 1);
                n4 = this.g;
                if (c2 == 'L' || c2 == 'S' || c2 == 'B' || c2 == 'F') break block4;
                n3 = n4;
                if (c2 != 'D') break block5;
            }
            n3 = n4 - 1;
        }
        return new String(this.q, n2, n3);
    }

    @Override
    public final String K() {
        if (!this.i) {
            int n2 = this.h + 1;
            if (n2 >= 0) {
                char[] cArray = this.q;
                int n3 = cArray.length;
                int n4 = this.g;
                if (n2 <= n3 - n4) {
                    return new String(cArray, n2, n4);
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        return new String(this.f, 0, this.g);
    }

    @Override
    public final String N(int n2, int n3, int n4, p p2) {
        return p2.b(this.q, n2, n3, n4);
    }

    @Override
    protected final void O(int n2, char[] cArray, int n3) {
        System.arraycopy(this.q, n2, cArray, 0, n3);
    }

    @Override
    public final boolean P(char[] cArray) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            if (this.Q(this.e + i2) == cArray[i2]) continue;
            return false;
        }
        return true;
    }

    @Override
    public final char Q(int n2) {
        if (n2 >= 0) {
            n2 = this.e;
            if (n2 != 0) {
                int n3 = 0 - n2;
                if (n3 > 0) {
                    char[] cArray = this.q;
                    System.arraycopy(cArray, n2, cArray, 0, n3);
                }
                try {
                    n2 = this.q.length;
                }
                catch (IOException iOException) {
                    throw new d(iOException.getMessage(), iOException);
                }
                throw null;
            }
            char[] cArray = this.q;
            System.arraycopy(cArray, n2, new char[cArray.length * 3 / 2], 0, 0);
            throw null;
        }
        return this.q[n2];
    }

    @Override
    protected final void R(int n2, int n3, char[] cArray) {
        System.arraycopy(this.q, n2, cArray, 0, n3);
    }

    @Override
    public final int T(int n2) {
        n2 -= this.e;
        char c2;
        while ('\"' != (c2 = this.Q(this.e + n2))) {
            if (c2 == '\u001a') {
                return -1;
            }
            ++n2;
        }
        return n2 + this.e;
    }

    @Override
    public final boolean U() {
        boolean bl;
        int n2 = this.e;
        char[] cArray = this.q;
        int n3 = cArray.length;
        boolean bl2 = bl = true;
        if (n2 != n3) {
            bl2 = this.d == '\u001a' && n2 + 1 >= cArray.length ? bl : false;
        }
        return bl2;
    }

    @Override
    public final void close() {
        super.close();
        Object object = this.q;
        if (((char[])object).length <= 65536) {
            r.set((char[])object);
        }
        this.q = null;
        object = com.github.catvod.spider.merge.H.i.a;
    }

    @Override
    public final boolean m() {
        int n2 = 0;
        while (true) {
            char c2;
            if ((c2 = this.q[n2]) == '\u001a') {
                this.a = 20;
                return true;
            }
            if (!com.github.catvod.spider.merge.B.f.V(c2)) {
                return false;
            }
            ++n2;
        }
    }

    @Override
    public final char next() {
        char c2;
        int n2;
        this.e = n2 = this.e + 1;
        if (n2 >= 0) {
            block6: {
                char[] cArray;
                int n3 = this.g;
                if (n3 > 0) {
                    int n4;
                    n2 = n4 = 0 - n3;
                    if (this.d == '\"') {
                        n2 = n4;
                        if (n4 > 0) {
                            n2 = n4 - 1;
                        }
                    }
                    cArray = this.q;
                    System.arraycopy(cArray, n2, cArray, 0, n3);
                }
                this.h = -1;
                this.e = n2 = this.g;
                try {
                    cArray = this.q;
                    if (cArray.length - n2 != 0) break block6;
                    char[] cArray2 = new char[cArray.length * 2];
                    System.arraycopy(cArray, 0, cArray2, 0, cArray.length);
                    this.q = cArray2;
                }
                catch (IOException iOException) {
                    throw new d(iOException.getMessage(), iOException);
                }
            }
            throw null;
        }
        this.d = c2 = this.q[n2];
        return c2;
    }

    @Override
    public final String r0(int n2, int n3) {
        if (n3 >= 0) {
            return new String(this.q, n2, n3);
        }
        throw new StringIndexOutOfBoundsException(n3);
    }

    @Override
    public final BigDecimal s() {
        int n2;
        int n3;
        block6: {
            int n4;
            block5: {
                n2 = n3 = this.h;
                if (n3 == -1) {
                    n2 = 0;
                }
                char c2 = this.Q(this.g + n2 - 1);
                n4 = this.g;
                if (c2 == 'L' || c2 == 'S' || c2 == 'B' || c2 == 'F') break block5;
                n3 = n4;
                if (c2 != 'D') break block6;
            }
            n3 = n4 - 1;
        }
        if (n3 <= 65535) {
            return new BigDecimal(this.q, n2, n3, MathContext.UNLIMITED);
        }
        throw new d("decimal overflow");
    }

    @Override
    public final char[] s0(int n2, int n3) {
        if (n3 >= 0) {
            if (n2 == 0) {
                return this.q;
            }
            char[] cArray = new char[n3];
            System.arraycopy(this.q, n2, cArray, 0, n3);
            return cArray;
        }
        throw new StringIndexOutOfBoundsException(n3);
    }
}

