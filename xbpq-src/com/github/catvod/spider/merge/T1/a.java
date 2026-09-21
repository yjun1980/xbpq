/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T1;

import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.u;
import com.github.catvod.spider.merge.Q1.c;
import com.github.catvod.spider.merge.Q1.e;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public final class a {
    private final u a;
    long b;
    long c;
    long d;
    long e;
    private c f;

    public a() {
        Object object = new f();
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.a = object;
        try {
            this.f = object = new e();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            this.f = new com.github.catvod.spider.merge.Q1.a();
        }
    }

    public final void a(long l2, long l3) {
        this.b += 3L + l2 & 0xFFFFFFFFFFFFFFFCL;
        this.c += l3;
        long l4 = this.d;
        int n2 = com.github.catvod.spider.merge.R1.a.e(l2);
        this.d = l4 + (long)(com.github.catvod.spider.merge.R1.a.e(l3) + n2);
        ++this.e;
        if (this.b >= 0L && this.c >= 0L && this.b() <= 0x400000000L) {
            l4 = this.b;
            if (this.b() + (l4 + 12L) + 12L >= 0L) {
                Object object = ByteBuffer.allocate(16);
                ((ByteBuffer)object).putLong(l2);
                ((ByteBuffer)object).putLong(l3);
                c c2 = this.f;
                object = ((ByteBuffer)object).array();
                Objects.requireNonNull(c2);
                c2.d((byte[])object, 0, ((Object)object).length);
                return;
            }
        }
        throw this.a;
    }

    public final long b() {
        return (long)(com.github.catvod.spider.merge.R1.a.e(this.e) + 1) + this.d + 4L + 3L & 0xFFFFFFFFFFFFFFFCL;
    }

    public final void c(InputStream inputStream) {
        CRC32 cRC32 = new CRC32();
        int n2 = 0;
        cRC32.update(0);
        inputStream = new CheckedInputStream(inputStream, cRC32);
        if (com.github.catvod.spider.merge.R1.a.d(inputStream) == this.e) {
            long l2;
            a a2 = new a();
            for (l2 = 0L; l2 < this.e; ++l2) {
                block9: {
                    long l3 = com.github.catvod.spider.merge.R1.a.d(inputStream);
                    long l4 = com.github.catvod.spider.merge.R1.a.d(inputStream);
                    try {
                        a2.a(l3, l4);
                        if (a2.b > this.b || a2.c > this.c || a2.d > this.d) break block9;
                        continue;
                    }
                    catch (u u2) {
                        throw new f("XZ Index is corrupt");
                    }
                }
                throw new f("XZ Index is corrupt");
            }
            if (a2.b == this.b && a2.c == this.c && a2.d == this.d && Arrays.equals(a2.f.a(), this.f.a())) {
                int n3;
                inputStream = new DataInputStream(inputStream);
                for (n3 = (int)(3L & 4L - ((long)(com.github.catvod.spider.merge.R1.a.e(this.e) + 1) + this.d + 4L)); n3 > 0; --n3) {
                    if (((DataInputStream)inputStream).readUnsignedByte() == 0) {
                        continue;
                    }
                    throw new f("XZ Index is corrupt");
                }
                l2 = cRC32.getValue();
                for (n3 = n2; n3 < 4; ++n3) {
                    if ((l2 >>> n3 * 8 & 0xFFL) == (long)((DataInputStream)inputStream).readUnsignedByte()) {
                        continue;
                    }
                    throw new f("XZ Index is corrupt");
                }
                return;
            }
            throw new f("XZ Index is corrupt");
        }
        throw new f("XZ Block Header or the start of XZ Index is corrupt");
    }
}

