/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.a1.c;
import com.github.catvod.spider.merge.a1.j;
import java.io.IOException;
import java.io.InputStream;

final class a {
    private final byte[] a = new byte[4160];
    private final int[] b = new int[1040];
    private final j c = new j();
    private InputStream d;
    private boolean e;
    long f;
    int g;
    private int h;
    private int i = 0;

    a() {
    }

    static void a(a a2, boolean bl) {
        if (!a2.e) {
            return;
        }
        int n2 = (a2.h << 2) + (a2.g + 7 >> 3) - 8;
        int n3 = a2.i;
        if (n2 <= n3) {
            if (bl && n2 != n3) {
                throw new c("Unused bytes after end");
            }
            return;
        }
        throw new c("Read after end");
    }

    static void b(a a2) {
        InputStream inputStream = a2.d;
        a2.d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a object, byte[] byArray, int n2, int n3) {
        if ((((a)object).g & 7) == 0) {
            int n4 = n3;
            int n5 = n2;
            while ((n2 = ((a)object).g) != 64 && n4 != 0) {
                byArray[n5] = (byte)(((a)object).f >>> n2);
                ((a)object).g = n2 + 8;
                --n4;
                ++n5;
            }
            if (n4 == 0) {
                return;
            }
            int n6 = Math.min(com.github.catvod.spider.merge.a1.a.f((a)object), n4 >> 2);
            n2 = n5;
            n3 = n4;
            if (n6 > 0) {
                n2 = ((a)object).h;
                byte[] byArray2 = ((a)object).a;
                n3 = n6 << 2;
                System.arraycopy(byArray2, n2 << 2, byArray, n5, n3);
                n2 = n5 + n3;
                n3 = n4 - n3;
                ((a)object).h += n6;
            }
            if (n3 == 0) {
                return;
            }
            n4 = n2;
            if (com.github.catvod.spider.merge.a1.a.f((a)object) > 0) {
                com.github.catvod.spider.merge.a1.a.d((a)object);
                while (n3 != 0) {
                    long l2 = ((a)object).f;
                    n4 = ((a)object).g;
                    byArray[n2] = (byte)(l2 >>> n4);
                    ((a)object).g = n4 + 8;
                    --n3;
                    ++n2;
                }
                com.github.catvod.spider.merge.a1.a.a((a)object, false);
                return;
            }
            for (n5 = n3; n5 > 0; n5 -= n2) {
                block11: {
                    try {
                        n2 = ((a)object).d.read(byArray, n4, n5);
                        if (n2 == -1) break block11;
                        n4 += n2;
                        continue;
                    }
                    catch (IOException iOException) {
                        throw new c(iOException);
                    }
                }
                object = new c("Unexpected end of input");
                throw object;
            }
            return;
        }
        throw new c("Unaligned copyBytes");
    }

    static void d(a a2) {
        int n2 = a2.g;
        if (n2 >= 32) {
            int[] nArray = a2.b;
            int n3 = a2.h;
            a2.h = n3 + 1;
            a2.f = (long)nArray[n3] << 32 | a2.f >>> 32;
            a2.g = n2 - 32;
        }
    }

    static void e(a a2, InputStream inputStream) {
        if (a2.d == null) {
            j.b(a2.c, a2.a, a2.b);
            a2.d = inputStream;
            a2.f = 0L;
            a2.g = 64;
            a2.h = 1024;
            a2.e = false;
            com.github.catvod.spider.merge.a1.a.i(a2);
            com.github.catvod.spider.merge.a1.a.a(a2, false);
            com.github.catvod.spider.merge.a1.a.d(a2);
            com.github.catvod.spider.merge.a1.a.d(a2);
            return;
        }
        throw new IllegalStateException("Bit reader already has associated input stream");
    }

    static int f(a a2) {
        int n2 = a2.e ? a2.i + 3 >> 2 : 1024;
        return n2 - a2.h;
    }

    static void g(a a2) {
        int n2 = 64 - a2.g & 7;
        if (n2 != 0 && com.github.catvod.spider.merge.a1.a.h(a2, n2) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    static int h(a a2, int n2) {
        com.github.catvod.spider.merge.a1.a.d(a2);
        long l2 = a2.f;
        int n3 = a2.g;
        int n4 = (int)(l2 >>> n3);
        a2.g = n3 + n2;
        return n4 & (1 << n2) - 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void i(a a2) {
        int n2 = a2.h;
        if (n2 <= 1015) {
            return;
        }
        if (a2.e) {
            if (com.github.catvod.spider.merge.a1.a.f(a2) >= -2) {
                return;
            }
            throw new c("No more input");
        }
        int n3 = n2 << 2;
        n2 = 4096 - n3;
        byte[] byArray = a2.a;
        System.arraycopy(byArray, n3, byArray, 0, n2);
        a2.h = 0;
        while (true) {
            n3 = n2;
            if (n2 >= 4096) break;
            try {
                n3 = a2.d.read(a2.a, n2, 4096 - n2);
                if (n3 <= 0) {
                    a2.e = true;
                    a2.i = n2;
                    n3 = n2 + 3;
                    break;
                }
                n2 += n3;
            }
            catch (IOException iOException) {
                throw new c(iOException);
            }
        }
        j.a(a2.c, n3 >> 2);
    }
}

