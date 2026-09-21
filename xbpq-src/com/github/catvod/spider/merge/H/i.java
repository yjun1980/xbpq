/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Properties;

public final class i {
    public static final Properties a;
    public static final char[] b;
    public static final boolean[] c;
    public static final boolean[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final boolean[] g;
    public static final boolean[] h;
    public static final char[] i;
    public static final char[] j;
    static final char[] k;
    static final char[] l;
    static final char[] m;
    static final int[] n;
    public static final char[] o;
    public static final int[] p;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n2;
        block15: {
            boolean[] blArray;
            boolean[] blArray2;
            a = new Properties();
            Charset.forName("UTF-8");
            b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            c = new boolean[256];
            d = new boolean[256];
            for (n2 = 0; n2 < (blArray2 = c).length; n2 = (int)((char)(n2 + 1))) {
                if (n2 >= 65 && n2 <= 90) {
                    blArray2[n2] = true;
                    continue;
                }
                if (n2 >= 97 && n2 <= 122) {
                    blArray2[n2] = true;
                    continue;
                }
                if (n2 != 95 && n2 != 36) continue;
                blArray2[n2] = true;
            }
            for (n2 = 0; n2 < (blArray = d).length; n2 = (int)((char)(n2 + 1))) {
                if (n2 >= 65 && n2 <= 90) {
                    blArray[n2] = true;
                    continue;
                }
                if (n2 >= 97 && n2 <= 122) {
                    blArray[n2] = true;
                    continue;
                }
                if (n2 == 95) {
                    blArray[n2] = true;
                    continue;
                }
                if (n2 < 48 || n2 > 57) continue;
                blArray[n2] = true;
            }
            try {
                h h2 = new h();
                InputStream inputStream = AccessController.doPrivileged(h2);
                if (inputStream == null) break block15;
                a.load(inputStream);
                inputStream.close();
            }
            catch (IOException | Throwable throwable) {}
        }
        byte[] byArray = new byte[161];
        e = byArray;
        byte[] byArray2 = new byte[161];
        f = byArray2;
        g = new boolean[161];
        h = new boolean[161];
        i = new char[93];
        byArray[0] = 4;
        byArray[1] = 4;
        byArray[2] = 4;
        byArray[3] = 4;
        byArray[4] = 4;
        byArray[5] = 4;
        byArray[6] = 4;
        byArray[7] = 4;
        byArray[8] = 1;
        byArray[9] = 1;
        byArray[10] = 1;
        byArray[11] = 4;
        byArray[12] = 1;
        byArray[13] = 1;
        byArray[34] = 1;
        byArray[92] = 1;
        byArray2[0] = 4;
        byArray2[1] = 4;
        byArray2[2] = 4;
        byArray2[3] = 4;
        byArray2[4] = 4;
        byArray2[5] = 4;
        byArray2[6] = 4;
        byArray2[7] = 4;
        byArray2[8] = 1;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 4;
        byArray2[12] = 1;
        byArray2[13] = 1;
        byArray2[92] = 1;
        byArray2[39] = 1;
        for (n2 = 14; n2 <= 31; ++n2) {
            com.github.catvod.spider.merge.H.i.e[n2] = 4;
            com.github.catvod.spider.merge.H.i.f[n2] = 4;
        }
        for (n2 = 127; n2 < 160; ++n2) {
            com.github.catvod.spider.merge.H.i.e[n2] = 4;
            com.github.catvod.spider.merge.H.i.f[n2] = 4;
        }
        for (n2 = 0; n2 < 161; ++n2) {
            boolean[] blArray = g;
            boolean bl = e[n2] != 0;
            blArray[n2] = bl;
            boolean[] blArray3 = h;
            bl = f[n2] != 0;
            blArray3[n2] = bl;
        }
        char[] cArray = i;
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 98;
        cArray[9] = 116;
        cArray[10] = 110;
        cArray[11] = 118;
        cArray[12] = 102;
        cArray[13] = 114;
        cArray[34] = 34;
        cArray[39] = 39;
        cArray[47] = 47;
        cArray[92] = 92;
        j = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        l = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        n = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        char[] cArray2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        o = cArray2;
        int[] nArray = new int[256];
        p = nArray;
        Arrays.fill(nArray, -1);
        int n3 = cArray2.length;
        n2 = 0;
        while (true) {
            if (n2 >= n3) {
                com.github.catvod.spider.merge.H.i.p[61] = 0;
                return;
            }
            com.github.catvod.spider.merge.H.i.p[com.github.catvod.spider.merge.H.i.o[n2]] = n2;
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] b(String var0) {
        var2_1 = var0.length();
        var7_2 = 0;
        if (var2_1 == 0) {
            return new byte[0];
        }
        var1_3 = var2_1 - 1;
        var3_4 = 0;
        while (true) {
            var5_5 = var1_3;
            if (var3_4 >= var1_3) break;
            var5_5 = var1_3;
            if (com.github.catvod.spider.merge.H.i.p[var0.charAt(var3_4) & 255] >= 0) break;
            ++var3_4;
        }
        while (var5_5 > 0 && com.github.catvod.spider.merge.H.i.p[var0.charAt(var5_5) & 255] < 0) {
            --var5_5;
        }
        var1_3 = var0.charAt(var5_5) == '=' ? (var0.charAt(var5_5 - 1) == '=' ? 2 : 1) : 0;
        var4_6 = var5_5 - var3_4 + 1;
        if (var2_1 > 76) {
            var2_1 = var0.charAt(76) == '\r' ? var4_6 / 78 : 0;
            var6_7 = var2_1 << 1;
        } else {
            var6_7 = 0;
        }
        var8_8 = ((var4_6 - var6_7) * 6 >> 3) - var1_3;
        var15_9 = new byte[var8_8];
        var9_10 = var8_8 / 3;
        var2_1 = 0;
        var4_6 = 0;
        while (var2_1 < var9_10 * 3) {
            var14_15 = com.github.catvod.spider.merge.H.i.p;
            var11_12 = var3_4 + 1;
            var10_11 = var14_15[var0.charAt(var3_4)];
            var3_4 = var11_12 + 1;
            var12_13 = var14_15[var0.charAt(var11_12)];
            var11_12 = var3_4 + 1;
            var13_14 = var14_15[var0.charAt(var3_4)];
            var3_4 = var11_12 + 1;
            var11_12 = var10_11 << 18 | var12_13 << 12 | var13_14 << 6 | var14_15[var0.charAt(var11_12)];
            var12_13 = var2_1 + 1;
            var15_9[var2_1] = (byte)(var11_12 >> 16);
            var10_11 = var12_13 + 1;
            var15_9[var12_13] = (byte)(var11_12 >> 8);
            var15_9[var10_11] = (byte)var11_12;
            var2_1 = var4_6++;
            if (var6_7 <= 0) ** GOTO lbl-1000
            var2_1 = var4_6;
            if (var4_6 == 19) {
                var3_4 += 2;
                var4_6 = 0;
            } else lbl-1000:
            // 2 sources

            {
                var4_6 = var2_1;
            }
            var2_1 = var10_11 + 1;
        }
        if (var2_1 < var8_8) {
            var6_7 = 0;
            var4_6 = var3_4;
            var3_4 = var7_2;
            while (var4_6 <= var5_5 - var1_3) {
                var3_4 |= com.github.catvod.spider.merge.H.i.p[var0.charAt(var4_6)] << 18 - var6_7 * 6;
                ++var6_7;
                ++var4_6;
            }
            var1_3 = 16;
            while (var2_1 < var8_8) {
                var15_9[var2_1] = (byte)(var3_4 >> var1_3);
                var1_3 -= 8;
                ++var2_1;
            }
        }
        return var15_9;
    }

    public static void c(int n2, int n3, char[] cArray) {
        int n4;
        int n5;
        if (n2 < 0) {
            n5 = 45;
            n2 = -n2;
        } else {
            n5 = 0;
        }
        while (true) {
            n4 = n2;
            int n6 = n3--;
            if (n2 < 65536) break;
            n4 = n2 / 100;
            cArray[n3] = m[n2 -= (n4 << 6) + (n4 << 5) + (n4 << 2)];
            cArray[--n3] = l[n2];
            n2 = n4;
        }
        while (true) {
            n2 = 52429 * n4 >>> 19;
            cArray[--n6] = k[n4 - ((n2 << 3) + (n2 << 1))];
            if (n2 == 0) {
                if (n5 != 0) {
                    cArray[n6 - 1] = n5;
                }
                return;
            }
            n4 = n2;
        }
    }

    public static void d(long l2, int n2, char[] cArray) {
        int n3;
        int n4;
        int n5;
        if (l2 < 0L) {
            n5 = 45;
            l2 = -l2;
        } else {
            n5 = 0;
        }
        while (l2 > Integer.MAX_VALUE) {
            long l3 = l2 / 100L;
            n4 = (int)(l2 - ((l3 << 6) + (l3 << 5) + (l3 << 2)));
            cArray[--n2] = m[n4];
            cArray[--n2] = l[n4];
            l2 = l3;
        }
        n4 = (int)l2;
        while (true) {
            n3 = n4;
            int n6 = n2--;
            if (n4 < 65536) break;
            n3 = n4 / 100;
            cArray[n2] = m[n4 -= (n3 << 6) + (n3 << 5) + (n3 << 2)];
            cArray[--n2] = l[n4];
            n4 = n3;
        }
        while (true) {
            n2 = 52429 * n3 >>> 19;
            cArray[--n6] = k[n3 - ((n2 << 3) + (n2 << 1))];
            if (n2 == 0) {
                if (n5 != 0) {
                    cArray[n6 - 1] = n5;
                }
                return;
            }
            n3 = n2;
        }
    }

    public static String e(String string) {
        String string2;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            string2 = null;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = a.getProperty(string);
        }
        return string3;
    }

    public static int f(int n2) {
        int n3;
        int n4;
        int n5 = 0;
        do {
            n4 = n[n5];
            n5 = n3 = n5 + 1;
        } while (n2 > n4);
        return n3;
    }

    public static int g(long l2) {
        long l3 = 10L;
        for (int i2 = 1; i2 < 19; ++i2) {
            if (l2 < l3) {
                return i2;
            }
            l3 *= 10L;
        }
        return 19;
    }
}

