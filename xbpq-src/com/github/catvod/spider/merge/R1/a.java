/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R1;

import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.r;
import com.github.catvod.spider.merge.P1.s;
import com.github.catvod.spider.merge.P1.t;
import com.github.catvod.spider.merge.R1.b;
import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.CRC32;

public final class a {
    private static b a(byte[] byArray, int n2) {
        if (byArray[n2] == 0 && (byArray[++n2] & 0xFF) < 16) {
            b b2 = new b();
            b2.a = byArray[n2];
            return b2;
        }
        throw new r();
    }

    public static b b(byte[] byArray) {
        byte by = byArray[10];
        Object object = s.b;
        if (by == object[0] && byArray[11] == object[1]) {
            if (a.f(byArray, 4, 6, 0)) {
                try {
                    object = a.a(byArray, 8);
                    object.b = 0L;
                }
                catch (r r2) {
                    throw new r("Unsupported options in XZ Stream Footer");
                }
                for (int i2 = 0; i2 < 4; ++i2) {
                    object.b |= (long)((byArray[i2 + 4] & 0xFF) << i2 * 8);
                }
                object.b = (object.b + 1L) * 4L;
                return object;
            }
            throw new f("XZ Stream Footer is corrupt");
        }
        throw new f("XZ Stream Footer is corrupt");
    }

    public static b c(byte[] object) {
        block4: {
            int n2 = 0;
            while (true) {
                byte[] byArray = s.a;
                if (n2 >= 6) break block4;
                if (object[n2] != byArray[n2]) break;
                ++n2;
            }
            throw new t();
        }
        if (a.f(object, 6, 2, 8)) {
            try {
                object = a.a(object, 6);
                return object;
            }
            catch (r r2) {
                throw new r("Unsupported options in XZ Stream Header");
            }
        }
        throw new f("XZ Stream Header is corrupt");
    }

    public static long d(InputStream inputStream) {
        int n2 = inputStream.read();
        if (n2 != -1) {
            long l2 = n2 & 0x7F;
            int n3 = 0;
            while ((n2 & 0x80) != 0) {
                if (++n3 < 9) {
                    n2 = inputStream.read();
                    if (n2 != -1) {
                        if (n2 != 0) {
                            l2 |= (long)(n2 & 0x7F) << n3 * 7;
                            continue;
                        }
                        throw new f();
                    }
                    throw new EOFException();
                }
                throw new f();
            }
            return l2;
        }
        throw new EOFException();
    }

    public static int e(long l2) {
        int n2;
        long l3;
        int n3 = 0;
        do {
            n2 = n3 + 1;
            l3 = l2 >> 7;
            n3 = n2;
            l2 = l3;
        } while (l3 != 0L);
        return n2;
    }

    public static boolean f(byte[] byArray, int n2, int n3, int n4) {
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray, n2, n3);
        long l2 = cRC32.getValue();
        for (n2 = 0; n2 < 4; ++n2) {
            if ((byte)(l2 >>> n2 * 8) == byArray[n4 + n2]) continue;
            return false;
        }
        return true;
    }
}

