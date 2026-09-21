/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.c;
import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.g;
import com.github.catvod.spider.merge.P1.h;
import com.github.catvod.spider.merge.P1.k;
import com.github.catvod.spider.merge.P1.l;
import com.github.catvod.spider.merge.P1.m;
import com.github.catvod.spider.merge.P1.o;
import com.github.catvod.spider.merge.P1.r;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

final class d
extends InputStream {
    private final DataInputStream a;
    private final g b;
    private InputStream c;
    private final com.github.catvod.spider.merge.Q1.c d;
    private final boolean e;
    private long f;
    private long g;
    private long h;
    private final int i;
    private long j;
    private boolean k;
    private final byte[] l;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public d(InputStream var1_1, com.github.catvod.spider.merge.Q1.c var2_3, boolean var3_4, int var4_5, a var5_6) {
        block29: {
            block30: {
                block31: {
                    block32: {
                        super();
                        this.f = -1L;
                        this.g = -1L;
                        this.j = 0L;
                        this.k = false;
                        this.l = new byte[1];
                        this.d = var2_3;
                        this.e = var3_4;
                        var12_7 = new DataInputStream((InputStream)var1_1);
                        this.a = var12_7;
                        var7_8 = var12_7.readUnsignedByte();
                        if (var7_8 == 0) break block29;
                        this.i = var6_9 = (var7_8 + 1) * 4;
                        var14_10 = new byte[var6_9];
                        var14_10[0] = (byte)var7_8;
                        var12_7.readFully(var14_10, 1, var6_9 - 1);
                        var7_8 = var6_9 - 4;
                        if (!com.github.catvod.spider.merge.R1.a.f(var14_10, 0, var7_8, var7_8)) break block30;
                        if ((var14_10[1] & 60) != 0) break block31;
                        var9_11 = (var14_10[1] & 3) + 1;
                        var12_7 = new long[var9_11];
                        var13_12 = new byte[var9_11][];
                        var15_13 = new ByteArrayInputStream(var14_10, 2, var6_9 - 6);
                        var10_14 /* !! */  = var6_9;
                        this.h = 0x7FFFFFFFFFFFFFFCL - var10_14 /* !! */  - (long)var2_3.c();
                        if ((var14_10[1] & 64) == 0) break block32;
                        this.g = var10_14 /* !! */  = com.github.catvod.spider.merge.R1.a.d(var15_13);
                        if (var10_14 /* !! */  == 0L) ** GOTO lbl33
                        try {
                            block33: {
                                if (var10_14 /* !! */  <= this.h) break block33;
lbl33:
                                // 2 sources

                                var1_1 = new f();
                                throw var1_1;
                            }
                            this.h = var10_14 /* !! */ ;
                        }
                        catch (IOException var1_2) {
                            throw new f("XZ Block Header is corrupt");
                        }
                    }
                    if ((var14_10[1] & 128) != 0) {
                        this.f = com.github.catvod.spider.merge.R1.a.d(var15_13);
                    }
                    for (var6_9 = 0; var6_9 < var9_11; ++var6_9) {
                        block28: {
                            var12_7[var6_9] = com.github.catvod.spider.merge.R1.a.d(var15_13);
                            var10_14 /* !! */  = com.github.catvod.spider.merge.R1.a.d(var15_13);
                            if (var10_14 /* !! */  > (long)var15_13.available()) break block28;
                            var13_12[var6_9] = new byte[(int)var10_14 /* !! */ ];
                            var15_13.read(var13_12[var6_9]);
                            continue;
                        }
                        var1_1 = new f();
                        throw var1_1;
                    }
                    for (var6_9 = var15_13.available(); var6_9 > 0; --var6_9) {
                        if (var15_13.read() == 0) {
                            continue;
                        }
                        throw new r("Unsupported options in XZ Block Header");
                    }
                    var2_3 = new k[var9_11];
                    for (var6_9 = 0; var6_9 < var9_11; ++var6_9) {
                        if (var12_7[var6_9] == 33L) {
                            var2_3[var6_9] = new m(var13_12[var6_9]);
                            continue;
                        }
                        if (var12_7[var6_9] == 3L) {
                            var2_3[var6_9] = new h(var13_12[var6_9]);
                            continue;
                        }
                        var10_14 /* !! */  = (long)var12_7[var6_9];
                        var7_8 = var10_14 /* !! */  >= 4L && var10_14 /* !! */  <= 9L ? 1 : 0;
                        if (var7_8 != 0) {
                            var2_3[var6_9] = new c((long)var12_7[var6_9], var13_12[var6_9]);
                            continue;
                        }
                        var1_1 = com.github.catvod.spider.merge.C.a.c("Unknown Filter ID ");
                        var1_1.append((long)var12_7[var6_9]);
                        throw new r(var1_1.toString());
                    }
                    for (var6_9 = 0; var6_9 < (var7_8 = var9_11 - 1); ++var6_9) {
                        if (var2_3[var6_9].a()) {
                            continue;
                        }
                        throw new r("Unsupported XZ filter chain");
                    }
                    if (var2_3[var7_8].c()) {
                        var7_8 = 0;
                        for (var8_15 = 0; var8_15 < var9_11; ++var8_15) {
                            var6_9 = var7_8;
                            if (var2_3[var8_15].d()) {
                                var6_9 = var7_8 + 1;
                            }
                            var7_8 = var6_9;
                        }
                        if (var7_8 <= 3) {
                            if (var4_5 >= 0) {
                                var7_8 = 0;
                                for (var6_9 = 0; var6_9 < var9_11; ++var6_9) {
                                    var7_8 += var2_3[var6_9].e();
                                }
                                if (var7_8 > var4_5) {
                                    throw new o(var7_8, var4_5);
                                }
                            }
                            this.b = var1_1 = new g((InputStream)var1_1);
                            this.c = var1_1;
                            for (var4_5 = var9_11 - 1; var4_5 >= 0; --var4_5) {
                                this.c = var2_3[var4_5].b(this.c, var5_6);
                            }
                            return;
                        }
                        throw new r("Unsupported XZ filter chain");
                    }
                    throw new r("Unsupported XZ filter chain");
                }
                throw new r("Unsupported options in XZ Block Header");
            }
            throw new f("XZ Block Header is corrupt");
        }
        throw new l();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() {
        long l2 = this.b.a();
        long l3 = this.g;
        if (l3 != -1L && l3 != l2) throw new f();
        long l4 = this.f;
        l3 = l2;
        if (l4 != -1L) {
            if (l4 != this.j) throw new f();
            l3 = l2;
        }
        while ((l3 & 3L) != 0L) {
            if (this.a.readUnsignedByte() != 0) throw new f();
            l3 = 1L + l3;
        }
        Object object = new byte[this.d.c()];
        this.a.readFully((byte[])object);
        if (!this.e || Arrays.equals(this.d.a(), (byte[])object)) return;
        object = com.github.catvod.spider.merge.C.a.c("Integrity check (");
        ((StringBuilder)object).append(this.d.b());
        ((StringBuilder)object).append(") does not match");
        throw new f(((StringBuilder)object).toString());
    }

    public final long a() {
        return this.j;
    }

    @Override
    public final int available() {
        return this.c.available();
    }

    public final long b() {
        return (long)this.i + this.b.a() + (long)this.d.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        try {
            this.c.close();
        }
        catch (IOException iOException) {}
        this.c = null;
    }

    @Override
    public final int read() {
        int n2 = this.read(this.l, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.l[0] & 0xFF;
        }
        return n3;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        block9: {
            block10: {
                block7: {
                    block8: {
                        long l2;
                        if (this.k) {
                            return -1;
                        }
                        n4 = this.c.read(byArray, n2, n3);
                        if (n4 <= 0) break block7;
                        if (this.e) {
                            this.d.d(byArray, n2, n4);
                        }
                        this.j += (long)n4;
                        long l3 = this.b.a();
                        if (l3 < 0L || l3 > this.h || (l3 = this.j) < 0L || (l2 = this.f) != -1L && l3 > l2) break block8;
                        if (n4 >= n3 && l3 != l2) break block9;
                        if (this.c.read() != -1) {
                            throw new f();
                        }
                        break block10;
                    }
                    throw new f();
                }
                if (n4 != -1) break block9;
            }
            this.c();
            this.k = true;
        }
        return n4;
    }
}

