/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.z0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.z0.b;
import com.github.catvod.spider.merge.xc.z0.c;
import java.nio.charset.Charset;

public final class a
extends c {
    public static final byte[] j = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] k = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;

    public a(int n2, byte[] object) {
        byte[] byArray = j;
        super(n2, ((byte[])object).length);
        if (byArray.length == 64) {
            this.g = k;
            this.f = byArray;
            object = (byte[])object.clone();
            int n3 = ((byte[])object).length;
            for (int i2 = 0; i2 < n3; ++i2) {
                byte by = object[i2];
                if (this.a != by && (by < 0 || by >= (byArray = this.g).length || byArray[by] == -1)) {
                    continue;
                }
                throw new IllegalArgumentException(m.r("lineSeparator must not contain base64 characters: [", new String((byte[])object, com.github.catvod.spider.merge.UY.m.m()), "]"));
            }
            if (n2 > 0) {
                this.i = ((byte[])object).length + 4;
                this.h = object;
            } else {
                this.i = 4;
                this.h = null;
            }
            return;
        }
        object = new IllegalArgumentException("encodeTable must have exactly 64 entries.");
        throw object;
    }

    public static byte[] d(String object) {
        a a2 = new a(0, com.github.catvod.spider.merge.xc.z0.c.e);
        Object object2 = com.github.catvod.spider.merge.UY.m.m();
        object = object == null ? null : (Object)((String)object).getBytes((Charset)object2);
        object2 = object;
        if (object != null) {
            if (((Object)object).length == 0) {
                object2 = object;
            } else {
                b b2 = new b();
                a2.c((byte[])object, ((Object)object).length, b2);
                a2.c((byte[])object, -1, b2);
                int n2 = b2.c;
                object2 = new byte[n2];
                com.github.catvod.spider.merge.xc.z0.c.b((byte[])object2, n2, b2);
            }
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(byte[] object, int n2, b b2) {
        int n3;
        if (b2.e) {
            return;
        }
        if (n2 < 0) {
            b2.e = true;
        }
        int n4 = this.i - 1;
        int n5 = 0;
        for (n3 = 0; n3 < n2; ++n3, ++n5) {
            int n6;
            byte[] byArray;
            byte[] byArray2 = com.github.catvod.spider.merge.xc.z0.c.a(n4, b2);
            Object object2 = object[n5];
            if (object2 == this.a) {
                b2.e = true;
                break;
            }
            if (object2 < 0 || object2 >= (byArray = this.g).length || (n6 = byArray[object2]) < 0) continue;
            object2 = (b2.g + 1) % 4;
            b2.g = (int)object2;
            b2.a = n6 = (b2.a << 6) + n6;
            if (object2 != false) continue;
            object2 = b2.c;
            byArray2[object2] = (byte)(n6 >> 16 & 0xFF);
            byArray2[object2 + true] = (byte)(n6 >> 8 & 0xFF);
            b2.c = (int)(object2 + 3);
            byArray2[object2 + 2] = (byte)(n6 & 0xFF);
        }
        if (!b2.e) return;
        if (b2.g == 0) return;
        object = com.github.catvod.spider.merge.xc.z0.c.a(n4, b2);
        n5 = b2.g;
        n2 = this.d;
        if (n5 == 1) {
            if (n2 == 1) throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
            return;
        }
        if (n5 != 2) {
            if (n5 != 3) {
                object = new StringBuilder("Impossible modulus ");
                ((StringBuilder)object).append(b2.g);
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            if (n2 == 1) {
                if ((b2.a & 3) != 0) throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            }
            n5 = b2.a;
            b2.a = n3 = n5 >> 2;
            n2 = b2.c;
            object[n2] = (byte)(n5 >> 10 & 0xFF);
            b2.c = n2 + 2;
            object[n2 + 1] = (byte)(n3 & 0xFF);
            return;
        }
        if (n2 == 1) {
            if ((b2.a & 0xF) != 0) throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
        b2.a = n5 = b2.a >> 4;
        n2 = b2.c;
        b2.c = n2 + 1;
        object[n2] = (byte)(n5 & 0xFF);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(byte[] object, int n2, b b2) {
        if (b2.e) {
            return;
        }
        int n3 = this.i;
        byte[] byArray = this.f;
        int n4 = this.b;
        byte[] byArray2 = this.h;
        if (n2 < 0) {
            int n5;
            b2.e = true;
            if (b2.g == 0 && n4 == 0) {
                return;
            }
            object = com.github.catvod.spider.merge.xc.z0.c.a(n3, b2);
            n2 = b2.c;
            int n6 = b2.g;
            if (n6 != 0) {
                byte[] byArray3 = j;
                byte by = this.a;
                if (n6 != 1) {
                    if (n6 != 2) {
                        object = new StringBuilder("Impossible modulus ");
                        ((StringBuilder)object).append(b2.g);
                        throw new IllegalStateException(((StringBuilder)object).toString());
                    }
                    n5 = b2.a;
                    object[n2] = byArray[n5 >> 10 & 0x3F];
                    object[n2 + 1] = byArray[n5 >> 4 & 0x3F];
                    b2.c = n6 = n2 + 3;
                    object[n2 + 2] = byArray[n5 << 2 & 0x3F];
                    if (byArray == byArray3) {
                        b2.c = n2 + 4;
                        object[n6] = by;
                    }
                } else {
                    n6 = b2.a;
                    object[n2] = byArray[n6 >> 2 & 0x3F];
                    b2.c = n5 = n2 + 2;
                    object[n2 + 1] = byArray[n6 << 4 & 0x3F];
                    if (byArray == byArray3) {
                        object[n5] = by;
                        b2.c = n2 + 4;
                        object[n2 + 3] = by;
                    }
                }
            }
            n5 = b2.f;
            n6 = b2.c;
            b2.f = n2 = n6 - n2 + n5;
            if (n4 <= 0) return;
            if (n2 <= 0) return;
            System.arraycopy(byArray2, 0, object, n6, byArray2.length);
            b2.c += byArray2.length;
            return;
        }
        int n7 = 0;
        int n8 = 0;
        while (n7 < n2) {
            int n9;
            int n10;
            byte[] byArray4 = com.github.catvod.spider.merge.xc.z0.c.a(n3, b2);
            b2.g = n10 = (b2.g + 1) % 3;
            int n11 = n9 = object[n8];
            if (n9 < 0) {
                n11 = n9 + 256;
            }
            b2.a = n9 = (b2.a << 8) + n11;
            if (n10 == 0) {
                n10 = b2.c;
                byArray4[n10] = byArray[n9 >> 18 & 0x3F];
                byArray4[n10 + 1] = byArray[n9 >> 12 & 0x3F];
                byArray4[n10 + 2] = byArray[n9 >> 6 & 0x3F];
                b2.c = n11 = n10 + 4;
                byArray4[n10 + 3] = byArray[n9 & 0x3F];
                b2.f = n9 = b2.f + 4;
                if (n4 > 0 && n4 <= n9) {
                    System.arraycopy(byArray2, 0, byArray4, n11, byArray2.length);
                    b2.c += byArray2.length;
                    b2.f = 0;
                }
            }
            ++n7;
            ++n8;
        }
    }
}

