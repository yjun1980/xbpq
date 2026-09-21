/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.H.o;
import com.github.catvod.spider.merge.H.p;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.io.IOException;
import java.io.Writer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h0
extends Writer {
    private static final ThreadLocal<char[]> q = new ThreadLocal();
    private static int r;
    static final int s;
    protected char[] a;
    protected int b;
    protected int c;
    private final Writer d = null;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected char m;
    protected int n = -1;
    protected boolean o;
    protected long p;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        new ThreadLocal();
        ":true".toCharArray();
        ":false".toCharArray();
        r = 131072;
        try {
            int n2;
            String string = com.github.catvod.spider.merge.H.i.e("fastjson.serializer_buffer_threshold");
            if (string != null && string.length() > 0 && (n2 = Integer.parseInt(string)) >= 64 && n2 <= 65536) {
                r = n2 * 1024;
            }
        }
        catch (Throwable throwable) {}
        s = i0.c.a | 0 | i0.r.a | i0.n.a | i0.e.a | i0.z.a | i0.q.a | i0.A.a | i0.o.a | i0.w.a;
    }

    public h0() {
        this(com.github.catvod.spider.merge.y.a.g, i0.D);
    }

    public h0(int n2, i0 ... i0Array) {
        ThreadLocal<char[]> threadLocal = q;
        char[] cArray = threadLocal.get();
        this.a = cArray;
        if (cArray != null) {
            threadLocal.set(null);
        } else {
            this.a = new char[2048];
        }
        int n3 = i0Array.length;
        int n4 = 0;
        int n5 = n2;
        for (n2 = n4; n2 < n3; ++n2) {
            n5 |= i0Array[n2].a;
        }
        this.c = n5;
        this.d();
    }

    public final h0 a(char c2) {
        this.write(c2);
        return this;
    }

    @Override
    public final Writer append(char c2) {
        this.write(c2);
        return this;
    }

    @Override
    public final Appendable append(char c2) {
        this.write(c2);
        return this;
    }

    public final h0 b(CharSequence charSequence) {
        charSequence = charSequence == null ? "null" : charSequence.toString();
        this.write((String)charSequence, 0, ((String)charSequence).length());
        return this;
    }

    public final h0 c(CharSequence charSequence, int n2, int n3) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "null";
        }
        charSequence = charSequence2.subSequence(n2, n3).toString();
        this.write((String)charSequence, 0, ((String)charSequence).length());
        return this;
    }

    @Override
    public final void close() {
        char[] cArray;
        if (this.d != null && this.b > 0) {
            this.flush();
        }
        if ((cArray = this.a).length <= r) {
            q.set(cArray);
        }
        this.a = null;
    }

    protected final void d() {
        int n2 = this.c;
        int n3 = i0.b.a;
        boolean bl = true;
        boolean bl2 = (n3 & n2) != 0;
        this.f = bl2;
        boolean bl3 = (i0.c.a & n2) != 0;
        this.e = bl3;
        boolean bl4 = (i0.m.a & n2) != 0;
        this.g = bl4;
        bl4 = (i0.p.a & n2) != 0;
        this.h = bl4;
        bl4 = (i0.u.a & n2) != 0;
        this.i = bl4;
        n3 = i0.z.a;
        bl4 = (i0.w.a & n2) != 0;
        this.j = bl4;
        bl4 = (i0.f.a & n2) != 0;
        this.k = bl4;
        bl4 = (i0.e.a & n2) != 0;
        this.l = bl4;
        if (bl2) {
            n3 = s;
        }
        int n4 = bl3 ? 39 : 34;
        this.m = (char)n4;
        bl2 = (i0.x.a & n2) != 0 ? bl : false;
        this.o = bl2;
        long l2 = bl2 ? 5764610843043954687L : ((n2 & i0.q.a) != 0 ? 140758963191807L : 0x4FFFFFFFFL);
        this.p = l2;
    }

    public final void e(int n2) {
        char[] cArray;
        int n3 = this.n;
        if (n3 != -1 && n2 >= n3) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("serialize exceeded MAX_OUTPUT_LENGTH=");
            stringBuilder.append(this.n);
            stringBuilder.append(", minimumCapacity=");
            stringBuilder.append(n2);
            throw new d(stringBuilder.toString());
        }
        Object object = this.a;
        n3 = ((char[])object).length + (((char[])object).length >> 1) + 1;
        if (n3 >= n2) {
            n2 = n3;
        }
        char[] cArray2 = new char[n2];
        System.arraycopy(object, 0, cArray2, 0, this.b);
        if (this.a.length < r && ((cArray = (char[])(object = (Object)q).get()) == null || cArray.length < this.a.length)) {
            object.set(this.a);
        }
        this.a = cArray2;
    }

    public final boolean f(int n2) {
        boolean bl = (n2 & this.c) != 0;
        return bl;
    }

    @Override
    public final void flush() {
        Writer writer = this.d;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.a, 0, this.b);
            this.d.flush();
            this.b = 0;
            return;
        }
        catch (IOException iOException) {
            throw new d(iOException.getMessage(), iOException);
        }
    }

    public final boolean g(i0 i02) {
        int n2 = this.c;
        boolean bl = (i02.a & n2) != 0;
        return bl;
    }

    public final void h(byte[] object) {
        if (this.f(i0.o.a)) {
            this.p((byte[])object);
            return;
        }
        int n2 = ((byte[])object).length;
        boolean bl = this.e;
        int n3 = bl ? 39 : 34;
        if (n2 == 0) {
            object = bl ? (Object)"''" : (Object)"\"\"";
            this.write((String)object);
            return;
        }
        char[] cArray = com.github.catvod.spider.merge.H.i.o;
        int n4 = n2 / 3 * 3;
        int n5 = n2 - 1;
        int n6 = n5 / 3;
        int n7 = this.b;
        int n8 = (n6 + 1 << 2) + n7 + 2;
        n6 = this.a.length;
        int n9 = 0;
        int n10 = 0;
        if (n8 > n6) {
            if (this.d != null) {
                this.write(n3);
                for (n6 = 0; n6 < n4; ++n6) {
                    n9 = n6 + 1;
                    n8 = object[n6];
                    n6 = n9 + 1;
                    n9 = (n8 & 0xFF) << 16 | (object[n9] & 0xFF) << 8 | object[n6] & 0xFF;
                    this.write(cArray[n9 >>> 18 & 0x3F]);
                    this.write(cArray[n9 >>> 12 & 0x3F]);
                    this.write(cArray[n9 >>> 6 & 0x3F]);
                    this.write(cArray[n9 & 0x3F]);
                }
                n9 = n2 - n4;
                if (n9 > 0) {
                    n4 = object[n4];
                    n6 = n10;
                    if (n9 == 2) {
                        n6 = (object[n5] & 0xFF) << 2;
                    }
                    n6 = (n4 & 0xFF) << 10 | n6;
                    this.write(cArray[n6 >> 12]);
                    this.write(cArray[n6 >>> 6 & 0x3F]);
                    n6 = n9 == 2 ? cArray[n6 & 0x3F] : 61;
                    this.write(n6);
                    this.write(61);
                }
                this.write(n3);
                return;
            }
            this.e(n8);
        }
        this.b = n8;
        char[] cArray2 = this.a;
        n6 = n7 + 1;
        cArray2[n7] = n3;
        for (n10 = 0; n10 < n4; ++n10) {
            n7 = n10 + 1;
            int n11 = object[n10];
            n10 = n7 + 1;
            n7 = (n11 & 0xFF) << 16 | (object[n7] & 0xFF) << 8 | object[n10] & 0xFF;
            cArray2 = this.a;
            n11 = n6 + 1;
            cArray2[n6] = cArray[n7 >>> 18 & 0x3F];
            n6 = n11 + 1;
            cArray2[n11] = cArray[n7 >>> 12 & 0x3F];
            n11 = n6 + 1;
            cArray2[n6] = cArray[n7 >>> 6 & 0x3F];
            n6 = n11 + 1;
            cArray2[n11] = cArray[n7 & 0x3F];
        }
        n10 = n2 - n4;
        if (n10 > 0) {
            n4 = object[n4];
            n6 = n9;
            if (n10 == 2) {
                n6 = (object[n5] & 0xFF) << 2;
            }
            n6 = (n4 & 0xFF) << 10 | n6;
            object = this.a;
            object[n8 - 5] = cArray[n6 >> 12];
            object[n8 - 4] = cArray[n6 >>> 6 & 0x3F];
            int n12 = n10 == 2 ? cArray[n6 & 0x3F] : 61;
            object[n8 - 3] = n12;
            object[n8 - 2] = 61;
        }
        this.a[n8 - 1] = n3;
    }

    public final void i(double d2, boolean bl) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            int n2 = this.b + 24;
            if (n2 > this.a.length) {
                if (this.d == null) {
                    this.e(n2);
                } else {
                    Object object = new char[24];
                    object = new String((char[])object, 0, com.github.catvod.spider.merge.H.o.a(d2, (char[])object, 0));
                    this.write((String)object, 0, ((String)object).length());
                    if (bl && this.g(i0.o)) {
                        this.write(68);
                    }
                    return;
                }
            }
            n2 = com.github.catvod.spider.merge.H.o.a(d2, this.a, this.b);
            this.b += n2;
            if (bl && this.g(i0.o)) {
                this.write(68);
            }
            return;
        }
        this.s();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(String object) {
        block28: {
            block37: {
                block34: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    block35: {
                        int n6;
                        int n7;
                        byte[] byArray;
                        block33: {
                            block36: {
                                block32: {
                                    int n8;
                                    block25: {
                                        block31: {
                                            block26: {
                                                block29: {
                                                    block30: {
                                                        block27: {
                                                            if (object == null) {
                                                                this.write("null:");
                                                                return;
                                                            }
                                                            boolean bl = this.e;
                                                            n5 = 0;
                                                            n4 = 1;
                                                            n3 = 1;
                                                            if (!bl) break block26;
                                                            if (!this.f) break block27;
                                                            this.y((String)object);
                                                            break block28;
                                                        }
                                                        byArray = com.github.catvod.spider.merge.H.i.f;
                                                        n7 = ((String)object).length();
                                                        n6 = this.b + n7 + 1;
                                                        if (n6 <= this.a.length) break block29;
                                                        if (this.d == null) break block30;
                                                        if (n7 != 0) break block31;
                                                        this.write(39);
                                                        break block32;
                                                    }
                                                    this.e(n6);
                                                }
                                                if (n7 == 0) {
                                                    int n9 = this.b + 3;
                                                    if (n9 > this.a.length) {
                                                        this.e(n9);
                                                    }
                                                    object = this.a;
                                                    n3 = this.b;
                                                    this.b = n9 = n3 + 1;
                                                    object[n3] = 39;
                                                    this.b = n3 = n9 + 1;
                                                    object[n9] = 39;
                                                    this.b = n3 + 1;
                                                    object[n3] = 58;
                                                    return;
                                                }
                                                break block33;
                                            }
                                            if (this.f) break block34;
                                            n2 = ((String)object).length() == 0 ? 1 : 0;
                                            break block35;
                                        }
                                        for (n8 = 0; n8 < n7; ++n8) {
                                            n4 = ((String)object).charAt(n8);
                                            if (n4 >= byArray.length || byArray[n4] == 0) continue;
                                            n8 = n3;
                                            break block25;
                                        }
                                        n8 = 0;
                                    }
                                    n3 = n5;
                                    if (n8 != 0) {
                                        this.write(39);
                                        n3 = n5;
                                    }
                                    while (n3 < n7) {
                                        n5 = n4 = ((String)object).charAt(n3);
                                        if (n4 < byArray.length) {
                                            n5 = n4;
                                            if (byArray[n4] != 0) {
                                                this.write(92);
                                                n5 = com.github.catvod.spider.merge.H.i.i[n4];
                                            }
                                        }
                                        this.write(n5);
                                        ++n3;
                                    }
                                    if (n8 == 0) break block36;
                                }
                                this.write(39);
                            }
                            this.write(58);
                            return;
                        }
                        int n10 = this.b;
                        int n11 = n10 + n7;
                        ((String)object).getChars(0, n7, this.a, n10);
                        this.b = n6;
                        int n12 = n10;
                        n7 = 0;
                        while (true) {
                            if (n12 >= n11) {
                                this.a[n6 - 1] = 58;
                                return;
                            }
                            object = this.a;
                            Object object2 = object[n12];
                            n5 = n12;
                            int n13 = n7;
                            n4 = n6;
                            n3 = n11;
                            if (object2 < byArray.length) {
                                n5 = n12;
                                n13 = n7;
                                n4 = n6;
                                n3 = n11;
                                if (byArray[object2] != 0) {
                                    if (n7 == 0) {
                                        n4 = n6 + 3;
                                        if (n4 > ((Object)object).length) {
                                            this.e(n4);
                                        }
                                        this.b = n4;
                                        object = this.a;
                                        n3 = n12 + 1;
                                        System.arraycopy(object, n3, object, n12 + 3, n11 - n12 - 1);
                                        object = this.a;
                                        System.arraycopy(object, 0, object, 1, n12);
                                        object = this.a;
                                        object[n10] = 39;
                                        object[n3] = 92;
                                        n5 = n3 + 1;
                                        object[n5] = com.github.catvod.spider.merge.H.i.i[object2];
                                        n3 = n11 + 2;
                                        object[this.b - 2] = 39;
                                        n13 = 1;
                                    } else {
                                        n4 = n6 + 1;
                                        if (n4 > ((Object)object).length) {
                                            this.e(n4);
                                        }
                                        this.b = n4;
                                        object = this.a;
                                        n5 = n12 + 1;
                                        System.arraycopy(object, n5, object, n12 + 2, n11 - n12);
                                        object = this.a;
                                        object[n12] = 92;
                                        object[n5] = com.github.catvod.spider.merge.H.i.i[object2];
                                        n3 = n11 + 1;
                                        n13 = n7;
                                    }
                                }
                            }
                            n12 = n5 + 1;
                            n7 = n13;
                            n6 = n4;
                            n11 = n3;
                        }
                    }
                    for (n3 = 0; n3 < ((String)object).length(); ++n3) {
                        n5 = ((String)object).charAt(n3);
                        n5 = n5 < 64 && (this.p & 1L << n5) != 0L || n5 == 92 ? 1 : 0;
                        if (n5 == 0) continue;
                        n2 = n4;
                        break;
                    }
                    if (n2 == 0) break block37;
                }
                this.x((String)object, ':');
                return;
            }
            this.write((String)object);
        }
        this.write(58);
    }

    public final void k(char c2, String object, int n2) {
        if (n2 != Integer.MIN_VALUE && this.f) {
            int n3 = n2 < 0 ? com.github.catvod.spider.merge.H.i.f(-n2) + 1 : com.github.catvod.spider.merge.H.i.f(n2);
            int n4 = ((String)object).length();
            int n5 = this.b + n4 + 4 + n3;
            if (n5 > this.a.length) {
                if (this.d != null) {
                    this.write(c2);
                    this.j((String)object);
                    this.q(n2);
                    return;
                }
                this.e(n5);
            }
            n3 = this.b;
            this.b = n5;
            char[] cArray = this.a;
            cArray[n3] = c2;
            n5 = n3 + n4 + 1;
            cArray[n3 + 1] = this.m;
            ((String)object).getChars(0, n4, cArray, n3 + 2);
            object = this.a;
            object[n5 + 1] = this.m;
            object[n5 + 2] = 58;
            com.github.catvod.spider.merge.H.i.c(n2, this.b, (char[])object);
            return;
        }
        this.write(c2);
        this.j((String)object);
        this.q(n2);
    }

    public final void l(char c2, String object, long l2) {
        if (l2 != Long.MIN_VALUE && this.f && !this.f(i0.r.a)) {
            int n2 = l2 < 0L ? com.github.catvod.spider.merge.H.i.g(-l2) + 1 : com.github.catvod.spider.merge.H.i.g(l2);
            int n3 = ((String)object).length();
            int n4 = this.b + n3 + 4 + n2;
            if (n4 > this.a.length) {
                if (this.d != null) {
                    this.write(c2);
                    this.j((String)object);
                    this.r(l2);
                    return;
                }
                this.e(n4);
            }
            n2 = this.b;
            this.b = n4;
            char[] cArray = this.a;
            cArray[n2] = c2;
            n4 = n2 + n3 + 1;
            cArray[n2 + 1] = this.m;
            ((String)object).getChars(0, n3, cArray, n2 + 2);
            object = this.a;
            object[n4 + 1] = this.m;
            object[n4 + 2] = 58;
            com.github.catvod.spider.merge.H.i.d(l2, this.b, (char[])object);
            return;
        }
        this.write(c2);
        this.j((String)object);
        this.r(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m(char c2, String string, String string2) {
        block6: {
            block7: {
                block4: {
                    block5: {
                        if (!this.f) break block4;
                        if (!this.e) break block5;
                        this.write(c2);
                        this.j(string);
                        if (string2 != null) break block6;
                        break block7;
                    }
                    if (this.g(i0.r)) {
                        this.write(c2);
                        this.x(string, ':');
                        this.x(string2, '\u0000');
                        return;
                    }
                    this.n(c2, string, string2);
                    return;
                }
                this.write(c2);
                this.j(string);
                if (string2 != null) break block6;
            }
            this.s();
            return;
        }
        this.v(string2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void n(char var1_1, String var2_2, String var3_3) {
        var5_4 = var2_2.length();
        var6_5 = this.b;
        if (var3_3 == null) {
            var7_6 = var5_4 + 8 + var6_5;
            var4_7 = 4;
        } else {
            var4_7 = var3_3.length();
            var7_6 = var6_5 + (var5_4 + var4_7 + 6);
        }
        if (var7_6 > this.a.length) {
            if (this.d != null) {
                this.write(var1_1);
                this.x((String)var2_2, ':');
                this.x((String)var3_3, '\u0000');
                return;
            }
            this.e(var7_6);
        }
        var20_8 /* !! */  = this.a;
        var6_5 = this.b;
        var20_8 /* !! */ [var6_5] = var1_1;
        var8_9 = var6_5 + 2;
        var9_10 = var8_9 + var5_4;
        var20_8 /* !! */ [var6_5 + 1] = 34;
        var2_2.getChars(0, var5_4, var20_8 /* !! */ , var8_9);
        this.b = var7_6;
        var2_2 = this.a;
        var2_2[var9_10] = 34;
        var6_5 = var9_10 + 1;
        var5_4 = var6_5 + 1;
        var2_2[var6_5] = 58;
        if (var3_3 == null) {
            var4_7 = var5_4 + 1;
            var2_2[var5_4] = 110;
            var5_4 = var4_7 + 1;
            var2_2[var4_7] = 117;
            var2_2[var5_4] = 108;
            var2_2[var5_4 + 1] = 108;
            return;
        }
        var17_11 = var5_4 + 1;
        var2_2[var5_4] = 34;
        var19_12 = var17_11 + var4_7;
        var3_3.getChars(0, var4_7, (char[])var2_2, var17_11);
        var6_5 = -1;
        var11_13 = 0;
        var9_10 = 0;
        var5_4 = -1;
        var10_14 = -1;
        for (var4_7 = var17_11; var4_7 < var19_12; ++var4_7) {
            block33: {
                block36: {
                    block38: {
                        block37: {
                            block34: {
                                block35: {
                                    var18_20 = this.a[var4_7];
                                    if (var18_20 < 93) break block34;
                                    var8_9 = var6_5;
                                    var12_15 = var7_6;
                                    var13_16 = var11_13;
                                    var14_17 = var9_10;
                                    var15_18 = var5_4;
                                    var16_19 = var10_14;
                                    if (var18_20 < 127) break block33;
                                    if (var18_20 == 8232 || var18_20 == 8233) break block35;
                                    var8_9 = var6_5;
                                    var12_15 = var7_6;
                                    var13_16 = var11_13;
                                    var14_17 = var9_10;
                                    var15_18 = var5_4;
                                    var16_19 = var10_14;
                                    if (var18_20 >= 160) break block33;
                                }
                                var9_10 = var5_4;
                                if (var5_4 == var6_5) {
                                    var9_10 = var4_7;
                                }
                                var8_9 = var11_13 + 1;
                                var10_14 = var7_6 + 4;
                                var7_6 = var6_5;
                                while (true) {
                                    var5_4 = var9_10;
                                    var6_5 = var8_9;
lbl74:
                                    // 2 sources

                                    while (true) {
                                        var16_19 = var4_7;
                                        var14_17 = var18_20;
                                        var8_9 = var7_6;
                                        var12_15 = var10_14;
                                        var13_16 = var6_5;
                                        var15_18 = var5_4;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
                                break block33;
                            }
                            var6_5 = var18_20 < 64 && (this.p & 1L << var18_20) != 0L || var18_20 == 92 ? 1 : 0;
                            if (var6_5 == 0) break block36;
                            ++var11_13;
                            if (var18_20 == 40 || var18_20 == 41 || var18_20 == 60 || var18_20 == 62) break block37;
                            var2_2 = com.github.catvod.spider.merge.H.i.e;
                            var6_5 = var7_6;
                            if (var18_20 >= ((Object)var2_2).length) break block38;
                            var6_5 = var7_6;
                            if (var2_2[var18_20] != 4) break block38;
                        }
                        var6_5 = var7_6 + 4;
                    }
                    var7_6 = var12_15 = -1;
                    var10_14 = var6_5;
                    var8_9 = var11_13;
                    var9_10 = var5_4;
                    if (var5_4 != -1) ** continue;
                    var5_4 = var4_7;
                    var7_6 = var12_15;
                    var10_14 = var6_5;
                    var6_5 = var11_13;
                    ** continue;
                }
                var8_9 = -1;
                var16_19 = var10_14;
                var15_18 = var5_4;
                var14_17 = var9_10;
                var13_16 = var11_13;
                var12_15 = var7_6;
            }
            var6_5 = var8_9;
            var7_6 = var12_15;
            var11_13 = var13_16;
            var9_10 = var14_17;
            var5_4 = var15_18;
            var10_14 = var16_19;
        }
        if (var11_13 > 0) {
            var4_7 = var7_6 + var11_13;
            if (var4_7 > this.a.length) {
                this.e(var4_7);
            }
            this.b = var4_7;
            if (var11_13 == 1) {
                if (var9_10 == 8232) {
                    var4_7 = var10_14 + 1;
                    var2_2 = this.a;
                    System.arraycopy(var2_2, var4_7, var2_2, var10_14 + 6, var19_12 - var10_14 - 1);
                    var2_2 = this.a;
                    var2_2[var10_14] = 92;
                    var2_2[var4_7] = 117;
                    var2_2[++var4_7] = 50;
                    var2_2[++var4_7] = 48;
                    var2_2[++var4_7] = 50;
                    var2_2[var4_7 + 1] = 56;
                } else if (var9_10 == 8233) {
                    var4_7 = var10_14 + 1;
                    var2_2 = this.a;
                    System.arraycopy(var2_2, var4_7, var2_2, var10_14 + 6, var19_12 - var10_14 - 1);
                    var2_2 = this.a;
                    var2_2[var10_14] = 92;
                    var2_2[var4_7] = 117;
                    var2_2[++var4_7] = 50;
                    var2_2[++var4_7] = 48;
                    var2_2[++var4_7] = 50;
                    var2_2[var4_7 + 1] = 57;
                } else if (var9_10 != 40 && var9_10 != 41 && var9_10 != 60 && var9_10 != 62) {
                    var2_2 = com.github.catvod.spider.merge.H.i.e;
                    if (var9_10 < ((Object)var2_2).length && var2_2[var9_10] == 4) {
                        var4_7 = var10_14 + 1;
                        var2_2 = this.a;
                        System.arraycopy(var2_2, var4_7, var2_2, var10_14 + 6, var19_12 - var10_14 - 1);
                        var3_3 = this.a;
                        var3_3[var10_14] = 92;
                        var5_4 = var4_7 + 1;
                        var3_3[var4_7] = 117;
                        var4_7 = var5_4 + 1;
                        var2_2 = com.github.catvod.spider.merge.H.i.b;
                        var3_3[var5_4] = var2_2[var9_10 >>> 12 & 15];
                        var5_4 = var4_7 + 1;
                        var3_3[var4_7] = var2_2[var9_10 >>> 8 & 15];
                        var3_3[var5_4] = var2_2[var9_10 >>> 4 & 15];
                        var3_3[var5_4 + 1] = var2_2[var9_10 & 15];
                    } else {
                        var4_7 = var10_14 + 1;
                        var2_2 = this.a;
                        System.arraycopy(var2_2, var4_7, var2_2, var10_14 + 2, var19_12 - var10_14 - 1);
                        var2_2 = this.a;
                        var2_2[var10_14] = 92;
                        var2_2[var4_7] = com.github.catvod.spider.merge.H.i.i[var9_10];
                    }
                } else {
                    var4_7 = var10_14 + 1;
                    var2_2 = this.a;
                    System.arraycopy(var2_2, var4_7, var2_2, var10_14 + 6, var19_12 - var10_14 - 1);
                    var3_3 = this.a;
                    var3_3[var10_14] = 92;
                    var5_4 = var4_7 + 1;
                    var3_3[var4_7] = 117;
                    var4_7 = var5_4 + 1;
                    var2_2 = com.github.catvod.spider.merge.H.i.b;
                    var3_3[var5_4] = var2_2[var9_10 >>> 12 & 15];
                    var5_4 = var4_7 + 1;
                    var3_3[var4_7] = var2_2[var9_10 >>> 8 & 15];
                    var3_3[var5_4] = var2_2[var9_10 >>> 4 & 15];
                    var3_3[var5_4 + 1] = var2_2[var9_10 & 15];
                }
            } else if (var11_13 > 1) {
                var6_5 = var5_4 - var17_11;
                var4_7 = var5_4;
                for (var5_4 = var6_5; var5_4 < var3_3.length(); ++var5_4) {
                    var1_1 = var3_3.charAt(var5_4);
                    if (this.o && (var1_1 == '(' || var1_1 == ')' || var1_1 == '<' || var1_1 == '>')) {
                        var20_8 /* !! */  = this.a;
                        var6_5 = var4_7 + 1;
                        var20_8 /* !! */ [var4_7] = 92;
                        var4_7 = var6_5 + 1;
                        var20_8 /* !! */ [var6_5] = 117;
                        var6_5 = var4_7 + 1;
                        var2_2 = com.github.catvod.spider.merge.H.i.b;
                        var20_8 /* !! */ [var4_7] = (char)var2_2[var1_1 >>> 12 & 15];
                        var4_7 = var6_5 + 1;
                        var20_8 /* !! */ [var6_5] = (char)var2_2[var1_1 >>> 8 & 15];
                        var6_5 = var4_7 + 1;
                        var20_8 /* !! */ [var4_7] = (char)var2_2[var1_1 >>> 4 & 15];
                        var4_7 = var6_5 + 1;
                        var20_8 /* !! */ [var6_5] = (char)var2_2[var1_1 & 15];
                        continue;
                    }
                    var20_8 /* !! */  = (char[])com.github.catvod.spider.merge.H.i.e;
                    if (var1_1 < var20_8 /* !! */ .length && var20_8 /* !! */ [var1_1] != '\u0000' || var1_1 == '/' && this.g(i0.q)) {
                        var2_2 = this.a;
                        var6_5 = var4_7 + 1;
                        var2_2[var4_7] = 92;
                        if (var20_8 /* !! */ [var1_1] == '\u0004') {
                            var4_7 = var6_5 + 1;
                            var2_2[var6_5] = 117;
                            var6_5 = var4_7 + 1;
                            var20_8 /* !! */  = com.github.catvod.spider.merge.H.i.b;
                            var2_2[var4_7] = var20_8 /* !! */ [var1_1 >>> 12 & 15];
                            var4_7 = var6_5 + 1;
                            var2_2[var6_5] = var20_8 /* !! */ [var1_1 >>> 8 & 15];
                            var6_5 = var4_7 + 1;
                            var2_2[var4_7] = var20_8 /* !! */ [var1_1 >>> 4 & 15];
                            var4_7 = var6_5 + 1;
                            var2_2[var6_5] = var20_8 /* !! */ [var1_1 & 15];
                            continue;
                        }
                        var4_7 = var6_5 + 1;
                        var2_2[var6_5] = com.github.catvod.spider.merge.H.i.i[var1_1];
                        continue;
                    }
                    if (var1_1 != '\u2028' && var1_1 != '\u2029') {
                        this.a[var4_7] = var1_1;
                        ++var4_7;
                        continue;
                    }
                    var20_8 /* !! */  = this.a;
                    var6_5 = var4_7 + 1;
                    var20_8 /* !! */ [var4_7] = 92;
                    var4_7 = var6_5 + 1;
                    var20_8 /* !! */ [var6_5] = 117;
                    var6_5 = var4_7 + 1;
                    var2_2 = com.github.catvod.spider.merge.H.i.b;
                    var20_8 /* !! */ [var4_7] = (char)var2_2[var1_1 >>> 12 & 15];
                    var4_7 = var6_5 + 1;
                    var20_8 /* !! */ [var6_5] = (char)var2_2[var1_1 >>> 8 & 15];
                    var6_5 = var4_7 + 1;
                    var20_8 /* !! */ [var4_7] = (char)var2_2[var1_1 >>> 4 & 15];
                    var4_7 = var6_5 + 1;
                    var20_8 /* !! */ [var6_5] = (char)var2_2[var1_1 & 15];
                }
            }
        }
        this.a[this.b - 1] = 34;
    }

    public final void o(float f2) {
        if (f2 == f2 && f2 != Float.POSITIVE_INFINITY && f2 != Float.NEGATIVE_INFINITY) {
            int n2 = this.b + 15;
            if (n2 > this.a.length) {
                if (this.d == null) {
                    this.e(n2);
                } else {
                    Object object = new char[15];
                    object = new String((char[])object, 0, com.github.catvod.spider.merge.H.p.a(f2, (char[])object, 0));
                    this.write((String)object, 0, ((String)object).length());
                    if (this.g(i0.o)) {
                        this.write(70);
                    }
                    return;
                }
            }
            n2 = com.github.catvod.spider.merge.H.p.a(f2, this.a, this.b);
            this.b += n2;
            if (this.g(i0.o)) {
                this.write(70);
            }
        } else {
            this.s();
        }
    }

    public final void p(byte[] objectArray) {
        int n2;
        int n3 = this.b;
        if ((n3 = objectArray.length * 2 + n3 + 3) > this.a.length) {
            this.e(n3);
        }
        char[] cArray = this.a;
        n3 = this.b;
        this.b = n2 = n3 + 1;
        cArray[n3] = 120;
        this.b = n2 + 1;
        cArray[n2] = 39;
        for (n3 = 0; n3 < objectArray.length; ++n3) {
            int n4;
            n2 = objectArray[n3] & 0xFF;
            int n5 = n2 >> 4;
            int n6 = n2 & 0xF;
            cArray = this.a;
            int n7 = this.b;
            this.b = n4 = n7 + 1;
            int n8 = 48;
            n2 = n5 < 10 ? 48 : 55;
            cArray[n7] = (char)(n5 + n2);
            this.b = n4 + 1;
            n2 = n6 < 10 ? n8 : 55;
            cArray[n4] = (char)(n6 + n2);
        }
        objectArray = this.a;
        n3 = this.b;
        this.b = n3 + 1;
        objectArray[n3] = 39;
    }

    public final void q(int n2) {
        if (n2 == Integer.MIN_VALUE) {
            this.write("-2147483648");
            return;
        }
        int n3 = n2 < 0 ? com.github.catvod.spider.merge.H.i.f(-n2) + 1 : com.github.catvod.spider.merge.H.i.f(n2);
        int n4 = this.b + n3;
        if (n4 > this.a.length) {
            if (this.d == null) {
                this.e(n4);
            } else {
                char[] cArray = new char[n3];
                com.github.catvod.spider.merge.H.i.c(n2, n3, cArray);
                this.write(cArray, 0, n3);
                return;
            }
        }
        com.github.catvod.spider.merge.H.i.c(n2, n4, this.a);
        this.b = n4;
    }

    public final void r(long l2) {
        int n2;
        int n3 = this.g(i0.r) && !this.g(i0.o) && (l2 > 0x1FFFFFFFFFFFFFL || l2 < -9007199254740991L) ? 1 : 0;
        if (l2 == Long.MIN_VALUE) {
            String string = n3 != 0 ? "\"-9223372036854775808\"" : "-9223372036854775808";
            this.write(string);
            return;
        }
        int n4 = l2 < 0L ? com.github.catvod.spider.merge.H.i.g(-l2) + 1 : com.github.catvod.spider.merge.H.i.g(l2);
        int n5 = n2 = this.b + n4;
        if (n3 != 0) {
            n5 = n2 + 2;
        }
        if (n5 > this.a.length) {
            if (this.d == null) {
                this.e(n5);
            } else {
                char[] cArray = new char[n4];
                com.github.catvod.spider.merge.H.i.d(l2, n4, cArray);
                if (n3 != 0) {
                    this.write(34);
                    this.write(cArray, 0, n4);
                    this.write(34);
                } else {
                    this.write(cArray, 0, n4);
                }
                return;
            }
        }
        if (n3 != 0) {
            char[] cArray = this.a;
            cArray[this.b] = 34;
            n3 = n5 - 1;
            com.github.catvod.spider.merge.H.i.d(l2, n3, cArray);
            this.a[n3] = 34;
        } else {
            com.github.catvod.spider.merge.H.i.d(l2, n5, this.a);
        }
        this.b = n5;
    }

    public final void s() {
        this.write("null");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void t(int n2, int n3) {
        block9: {
            String string;
            block8: {
                block7: {
                    if ((n2 & n3) == 0 && (this.c & n3) == 0) {
                        this.s();
                        return;
                    }
                    int n4 = i0.d.a;
                    if ((n2 & n4) != 0 && (n2 & ~n4 & i0.E) == 0) {
                        this.s();
                        return;
                    }
                    if (n3 != i0.h.a) break block7;
                    string = "[]";
                    break block8;
                }
                if (n3 == i0.i.a) {
                    this.v("");
                    return;
                }
                if (n3 != i0.k.a) break block9;
                string = "false";
            }
            this.write(string);
            return;
        }
        if (n3 == i0.j.a) {
            this.write(48);
            return;
        }
        this.s();
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }

    public final void u(i0 i02) {
        this.t(0, i02.a);
    }

    public final void v(String string) {
        if (this.e) {
            this.y(string);
        } else {
            this.x(string, '\u0000');
        }
    }

    public final void w(char[] cArray) {
        block16: {
            block14: {
                block24: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    block23: {
                        int n9;
                        block17: {
                            block18: {
                                block15: {
                                    boolean bl = this.e;
                                    n8 = 0;
                                    if (!bl) break block14;
                                    if (cArray != null) break block15;
                                    n7 = this.b + 4;
                                    if (n7 > this.a.length) {
                                        this.e(n7);
                                    }
                                    "null".getChars(0, 4, this.a, this.b);
                                    this.b = n7;
                                    break block16;
                                }
                                n6 = cArray.length;
                                n9 = this.b + n6 + 2;
                                if (n9 <= this.a.length) break block17;
                                if (this.d == null) break block18;
                                this.write(39);
                                for (n7 = 0; n7 < cArray.length; ++n7) {
                                    block20: {
                                        int n10;
                                        block19: {
                                            n10 = cArray[n7];
                                            if (n10 <= 13 || n10 == 92 || n10 == 39) break block19;
                                            n6 = n10;
                                            if (n10 != 47) break block20;
                                            n6 = n10;
                                            if (!this.g(i0.q)) break block20;
                                        }
                                        this.write(92);
                                        n6 = com.github.catvod.spider.merge.H.i.i[n10];
                                    }
                                    this.write(n6);
                                }
                                this.write(39);
                                break block16;
                            }
                            this.e(n9);
                        }
                        n7 = this.b;
                        n5 = n7 + 1;
                        n4 = n6 + n5;
                        char[] cArray2 = this.a;
                        cArray2[n7] = 39;
                        System.arraycopy(cArray, 0, cArray2, n5, cArray.length);
                        this.b = n9;
                        n6 = -1;
                        n3 = 0;
                        for (n7 = n5; n7 < n4; ++n7) {
                            int n11;
                            int n12;
                            block22: {
                                int n13;
                                block21: {
                                    n13 = this.a[n7];
                                    if (n13 <= 13 || n13 == 92 || n13 == 39) break block21;
                                    n12 = n8;
                                    n11 = n3;
                                    n2 = n6;
                                    if (n13 != 47) break block22;
                                    n12 = n8;
                                    n11 = n3;
                                    n2 = n6;
                                    if (!this.g(i0.q)) break block22;
                                }
                                n12 = n8 + 1;
                                n2 = n7;
                                n11 = n13;
                            }
                            n8 = n12;
                            n3 = n11;
                            n6 = n2;
                        }
                        n7 = n9 + n8;
                        if (n7 > this.a.length) {
                            this.e(n7);
                        }
                        this.b = n7;
                        if (n8 != 1) break block23;
                        cArray = this.a;
                        n7 = n6 + 1;
                        System.arraycopy(cArray, n7, cArray, n6 + 2, n4 - n6 - 1);
                        cArray = this.a;
                        cArray[n6] = 92;
                        cArray[n7] = com.github.catvod.spider.merge.H.i.i[n3];
                        break block24;
                    }
                    if (n8 <= 1) break block24;
                    cArray = this.a;
                    n7 = n6 + 1;
                    System.arraycopy(cArray, n7, cArray, n6 + 2, n4 - n6 - 1);
                    cArray = this.a;
                    cArray[n6] = 92;
                    cArray[n7] = com.github.catvod.spider.merge.H.i.i[n3];
                    n6 = n4 + 1;
                    n7 -= 2;
                    while (n7 >= n5) {
                        block26: {
                            block25: {
                                n2 = this.a[n7];
                                if (n2 <= 13 || n2 == 92 || n2 == 39) break block25;
                                n3 = n6;
                                if (n2 != 47) break block26;
                                n3 = n6;
                                if (!this.g(i0.q)) break block26;
                            }
                            cArray = this.a;
                            n3 = n7 + 1;
                            System.arraycopy(cArray, n3, cArray, n7 + 2, n6 - n7 - 1);
                            cArray = this.a;
                            cArray[n7] = 92;
                            cArray[n3] = com.github.catvod.spider.merge.H.i.i[n2];
                            n3 = n6 + 1;
                        }
                        --n7;
                        n6 = n3;
                    }
                }
                this.a[this.b - 1] = 39;
                break block16;
            }
            this.x(new String(cArray), '\u0000');
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void write(int var1_1) {
        var3_2 = this.b;
        var2_3 = 1;
        if (++var3_2 <= this.a.length) ** GOTO lbl8
        if (this.d != null) {
            this.flush();
        } else {
            this.e(var3_2);
lbl8:
            // 2 sources

            var2_3 = var3_2;
        }
        this.a[this.b] = (char)var1_1;
        this.b = var2_3;
    }

    @Override
    public final void write(String string) {
        if (string == null) {
            this.s();
            return;
        }
        this.write(string, 0, string.length());
    }

    @Override
    public final void write(String string, int n2, int n3) {
        int n4;
        int n5 = n4 = this.b + n3;
        int n6 = n2;
        int n7 = n3;
        if (n4 > this.a.length) {
            n5 = n2;
            n6 = n3;
            if (this.d == null) {
                this.e(n4);
                n5 = n4;
                n6 = n2;
                n7 = n3;
            } else {
                while (true) {
                    char[] cArray = this.a;
                    n3 = cArray.length;
                    n2 = this.b;
                    n7 = n3 - n2;
                    n3 = n5 + n7;
                    string.getChars(n5, n3, cArray, n2);
                    this.b = this.a.length;
                    this.flush();
                    n2 = n6 - n7;
                    if (n2 <= this.a.length) {
                        n5 = n2;
                        n6 = n3;
                        n7 = n2;
                        break;
                    }
                    n5 = n3;
                    n6 = n2;
                }
            }
        }
        string.getChars(n6, n7 + n6, this.a, this.b);
        this.b = n5;
    }

    @Override
    public final void write(char[] cArray, int n2, int n3) {
        int n4;
        if (n2 >= 0 && n2 <= cArray.length && n3 >= 0 && (n4 = n2 + n3) <= cArray.length && n4 >= 0) {
            int n5;
            if (n3 == 0) {
                return;
            }
            int n6 = n5 = this.b + n3;
            int n7 = n2;
            n4 = n3;
            if (n5 > this.a.length) {
                n7 = n2;
                n4 = n3;
                if (this.d == null) {
                    this.e(n5);
                    n6 = n5;
                    n7 = n2;
                    n4 = n3;
                } else {
                    do {
                        char[] cArray2 = this.a;
                        n3 = cArray2.length;
                        n2 = this.b;
                        System.arraycopy(cArray, n7, cArray2, n2, n3 -= n2);
                        this.b = this.a.length;
                        this.flush();
                        n2 = n4 - n3;
                        n7 = n3 = n7 + n3;
                        n4 = n2;
                    } while (n2 > this.a.length);
                    n6 = n2;
                    n4 = n2;
                    n7 = n3;
                }
            }
            System.arraycopy(cArray, n7, this.a, this.b, n4);
            this.b = n6;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(String var1_1, char var2_2) {
        block71: {
            block72: {
                block61: {
                    block54: {
                        block55: {
                            if (var1_1 == null) {
                                this.s();
                                if (var2_2 != '\u0000') {
                                    this.write(var2_2);
                                }
                                return;
                            }
                            var6_3 = var1_1.length();
                            var4_5 /* !! */  = var5_4 = this.b + var6_3 + 2;
                            if (var2_2 != '\u0000') {
                                var4_5 /* !! */  = var5_4 + 1;
                            }
                            if (var4_5 /* !! */  <= this.a.length) break block54;
                            if (this.d == null) break block55;
                            this.write(34);
                            for (var5_4 = 0; var5_4 < var1_1.length(); ++var5_4) {
                                block60: {
                                    block59: {
                                        block56: {
                                            block57: {
                                                block58: {
                                                    var6_3 = var1_1.charAt(var5_4);
                                                    if (this.g(i0.x) && (var6_3 == 40 || var6_3 == 41 || var6_3 == 60 || var6_3 == 62)) {
                                                        this.write(92);
                                                        this.write(117);
                                                        var21_6 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.b;
                                                        this.write(var21_6 /* !! */ [var6_3 >>> 12 & 15]);
                                                        this.write(var21_6 /* !! */ [var6_3 >>> 8 & 15]);
                                                        this.write(var21_6 /* !! */ [var6_3 >>> 4 & 15]);
                                                        var4_5 /* !! */  = var21_6 /* !! */ [var6_3 & 15];
lbl23:
                                                        // 9 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    if (!this.g(i0.r)) break block56;
                                                    if (var6_3 == 8 || var6_3 == 12 || var6_3 == 10 || var6_3 == 13 || var6_3 == 9 || var6_3 == 34 || var6_3 == 47 || var6_3 == 92) break block57;
                                                    if (var6_3 >= 32) break block58;
                                                    this.write(92);
                                                    this.write(117);
                                                    this.write(48);
                                                    this.write(48);
                                                    var21_6 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.j;
                                                    var4_5 /* !! */  = var6_3 * 2;
                                                    this.write(var21_6 /* !! */ [var4_5 /* !! */ ]);
                                                    var4_5 /* !! */  = var21_6 /* !! */ [var4_5 /* !! */  + 1];
                                                    ** GOTO lbl23
                                                }
                                                var4_5 /* !! */  = var6_3;
                                                if (var6_3 < 127) ** GOTO lbl23
                                                this.write(92);
                                                this.write(117);
                                                var21_6 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.b;
                                                this.write(var21_6 /* !! */ [var6_3 >>> 12 & 15]);
                                                this.write(var21_6 /* !! */ [var6_3 >>> 8 & 15]);
                                                this.write(var21_6 /* !! */ [var6_3 >>> 4 & 15]);
                                                var4_5 /* !! */  = var21_6 /* !! */ [var6_3 & 15];
                                                ** GOTO lbl23
                                            }
                                            this.write(92);
                                            var4_5 /* !! */  = com.github.catvod.spider.merge.H.i.i[var6_3];
                                            ** GOTO lbl23
                                        }
                                        var21_6 /* !! */  = com.github.catvod.spider.merge.H.i.e;
                                        if (var6_3 < var21_6 /* !! */ .length && var21_6 /* !! */ [var6_3] != 0) break block59;
                                        var4_5 /* !! */  = var6_3;
                                        if (var6_3 != 47) ** GOTO lbl23
                                        var4_5 /* !! */  = var6_3;
                                        if (!this.g(i0.q)) ** GOTO lbl23
                                    }
                                    this.write(92);
                                    if (var21_6 /* !! */ [var6_3] != 4) break block60;
                                    this.write(117);
                                    var21_6 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.b;
                                    this.write(var21_6 /* !! */ [var6_3 >>> 12 & 15]);
                                    this.write(var21_6 /* !! */ [var6_3 >>> 8 & 15]);
                                    this.write(var21_6 /* !! */ [var6_3 >>> 4 & 15]);
                                    var4_5 /* !! */  = var21_6 /* !! */ [var6_3 & 15];
                                    ** GOTO lbl23
                                }
                                var4_5 /* !! */  = com.github.catvod.spider.merge.H.i.i[var6_3];
                                ** continue;
                                this.write(var4_5 /* !! */ );
                            }
                            this.write(34);
                            if (var2_2 != '\u0000') {
                                this.write(var2_2);
                            }
                            return;
                        }
                        this.e(var4_5 /* !! */ );
                    }
                    var5_4 = this.b;
                    var11_8 = var5_4 + 1;
                    var18_9 = var11_8 + var6_3;
                    var21_7 /* !! */  = this.a;
                    var21_7 /* !! */ [var5_4] = 34;
                    var1_1.getChars(0, var6_3, var21_7 /* !! */ , var11_8);
                    this.b = var4_5 /* !! */ ;
                    var20_10 = this.g(i0.r);
                    var5_4 = -1;
                    if (!var20_10) break block61;
                    var6_3 = var11_8;
                    var8_11 = var4_5 /* !! */ ;
                    for (var4_5 /* !! */  = var6_3; var4_5 /* !! */  < var18_9; ++var4_5 /* !! */ ) {
                        var9_15 = this.a[var4_5 /* !! */ ];
                        if (var9_15 != '\"' && var9_15 != '/' && var9_15 != '\\' && var9_15 != '\b' && var9_15 != '\f' && var9_15 != '\n' && var9_15 != '\r' && var9_15 != '\t') {
                            if (var9_15 < ' ') lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var5_4 = var8_11 + 5;
                                    break block52;
                                    break;
                                }
                            }
                            var6_3 = var8_11;
                            var7_13 = var5_4;
                            if (var9_15 >= '\u007f') {
                                ** continue;
                            }
                        } else {
                            block52: {
                                var5_4 = var8_11 + 1;
                            }
                            var7_13 = var4_5 /* !! */ ;
                            var6_3 = var5_4;
                        }
                        var8_11 = var6_3;
                        var5_4 = var7_13;
                    }
                    if (var8_11 > this.a.length) {
                        this.e(var8_11);
                    }
                    this.b = var8_11;
                    var6_3 = var18_9;
                    while (true) {
                        block64: {
                            block65: {
                                block62: {
                                    block63: {
                                        var1_1 = this.a;
                                        if (var5_4 < var11_8) break;
                                        var3_17 = var1_1[var5_4];
                                        if (var3_17 == 8 || var3_17 == 12 || var3_17 == 10 || var3_17 == 13 || var3_17 == 9) break block62;
                                        if (var3_17 == 34 || var3_17 == 47 || var3_17 == 92) break block63;
                                        if (var3_17 < 32) {
                                            var4_5 /* !! */  = var5_4 + 1;
                                            System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var5_4 + 6, var6_3 - var5_4 - 1);
                                            var21_7 /* !! */  = this.a;
                                            var21_7 /* !! */ [var5_4] = 92;
                                            var21_7 /* !! */ [var4_5 /* !! */ ] = 117;
                                            var21_7 /* !! */ [var5_4 + 2] = 48;
                                            var21_7 /* !! */ [var5_4 + 3] = 48;
                                            var1_1 = com.github.catvod.spider.merge.H.i.j;
                                            var4_5 /* !! */  = (int)(var3_17 * 2);
                                            var21_7 /* !! */ [var5_4 + 4] = (char)var1_1[var4_5 /* !! */ ];
                                            var21_7 /* !! */ [var5_4 + 5] = (char)var1_1[var4_5 /* !! */  + 1];
lbl134:
                                            // 2 sources

                                            while (true) {
                                                var4_5 /* !! */  = var6_3 + 5;
                                                ** GOTO lbl166
                                                break;
                                            }
                                        } else {
                                            var4_5 /* !! */  = var6_3;
                                            if (var3_17 >= 127) {
                                                var4_5 /* !! */  = var5_4 + 1;
                                                System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var5_4 + 6, var6_3 - var5_4 - 1);
                                                var1_1 = this.a;
                                                var1_1[var5_4] = 92;
                                                var1_1[var4_5 /* !! */ ] = 117;
                                                var21_7 /* !! */  = com.github.catvod.spider.merge.H.i.b;
                                                var1_1[var5_4 + 2] = var21_7 /* !! */ [var3_17 >>> 12 & 15];
                                                var1_1[var5_4 + 3] = var21_7 /* !! */ [var3_17 >>> 8 & 15];
                                                var1_1[var5_4 + 4] = var21_7 /* !! */ [var3_17 >>> 4 & 15];
                                                var1_1[var5_4 + 5] = var21_7 /* !! */ [var3_17 & 15];
                                                ** continue;
                                            }
                                        }
                                        break block64;
                                    }
                                    var4_5 /* !! */  = var5_4 + 1;
                                    System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var5_4 + 2, var6_3 - var5_4 - 1);
                                    var1_1 = this.a;
                                    var1_1[var5_4] = 92;
                                    var1_1[var4_5 /* !! */ ] = var3_17;
                                    break block65;
                                }
                                var4_5 /* !! */  = var5_4 + 1;
                                System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var5_4 + 2, var6_3 - var5_4 - 1);
                                var1_1 = this.a;
                                var1_1[var5_4] = 92;
                                var1_1[var4_5 /* !! */ ] = com.github.catvod.spider.merge.H.i.i[var3_17];
                            }
                            var4_5 /* !! */  = var6_3 + 1;
                        }
                        --var5_4;
                        var6_3 = var4_5 /* !! */ ;
                    }
                    if (var2_2 != '\u0000') {
                        var4_5 /* !! */  = this.b;
                        var1_1[var4_5 /* !! */  - 2] = 34;
                        var1_1[var4_5 /* !! */  - 1] = var2_2;
                    } else {
                        var1_1[this.b - 1] = 34;
                    }
                    return;
                }
                var8_12 = var11_8;
                var7_14 = -1;
                var12_19 = 0;
                var9_16 = 0;
                var10_20 = -1;
                var6_3 = var5_4;
                var5_4 = var7_14;
                var7_14 = var4_5 /* !! */ ;
                for (var4_5 /* !! */  = var8_12; var4_5 /* !! */  < var18_9; ++var4_5 /* !! */ ) {
                    block53: {
                        block68: {
                            block70: {
                                block69: {
                                    block66: {
                                        block67: {
                                            var19_26 = this.a[var4_5 /* !! */ ];
                                            if (var19_26 < 93) break block66;
                                            var13_21 = var7_14;
                                            var14_22 = var5_4;
                                            var8_12 = var6_3;
                                            var15_23 = var12_19;
                                            var16_24 = var9_16;
                                            var17_25 = var10_20;
                                            if (var19_26 < 127) break block53;
                                            if (var19_26 == 8232 || var19_26 == 8233) break block67;
                                            var13_21 = var7_14;
                                            var14_22 = var5_4;
                                            var8_12 = var6_3;
                                            var15_23 = var12_19;
                                            var16_24 = var9_16;
                                            var17_25 = var10_20;
                                            if (var19_26 >= 160) break block53;
                                        }
                                        var9_16 = var5_4;
                                        if (var5_4 == var6_3) {
                                            var9_16 = var4_5 /* !! */ ;
                                        }
                                        var8_12 = var12_19 + 1;
                                        var10_20 = var7_14 + 4;
                                        var7_14 = var6_3;
                                        while (true) {
                                            var5_4 = var8_12;
                                            var6_3 = var10_20;
lbl214:
                                            // 2 sources

                                            while (true) {
                                                var17_25 = var4_5 /* !! */ ;
                                                var16_24 = var19_26;
                                                var13_21 = var6_3;
                                                var14_22 = var9_16;
                                                var8_12 = var7_14;
                                                var15_23 = var5_4;
                                                break block53;
                                                break;
                                            }
                                            break;
                                        }
                                        break block53;
                                    }
                                    var6_3 = var19_26 < 64 && (this.p & 1L << var19_26) != 0L || var19_26 == 92 ? 1 : 0;
                                    if (var6_3 == 0) break block68;
                                    ++var12_19;
                                    if (var19_26 == 40 || var19_26 == 41 || var19_26 == 60 || var19_26 == 62) break block69;
                                    var21_7 /* !! */  = (char[])com.github.catvod.spider.merge.H.i.e;
                                    var6_3 = var7_14;
                                    if (var19_26 >= var21_7 /* !! */ .length) break block70;
                                    var6_3 = var7_14;
                                    if (var21_7 /* !! */ [var19_26] != '\u0004') break block70;
                                }
                                var6_3 = var7_14 + 4;
                            }
                            var13_21 = -1;
                            var10_20 = var6_3;
                            var9_16 = var5_4;
                            var7_14 = var13_21;
                            var8_12 = var12_19;
                            if (var5_4 != -1) ** continue;
                            var9_16 = var4_5 /* !! */ ;
                            var7_14 = var13_21;
                            var5_4 = var12_19;
                            ** continue;
                        }
                        var8_12 = -1;
                        var17_25 = var10_20;
                        var16_24 = var9_16;
                        var15_23 = var12_19;
                        var14_22 = var5_4;
                        var13_21 = var7_14;
                    }
                    var7_14 = var13_21;
                    var5_4 = var14_22;
                    var6_3 = var8_12;
                    var12_19 = var15_23;
                    var9_16 = var16_24;
                    var10_20 = var17_25;
                }
                if (var12_19 <= 0) break block71;
                var4_5 /* !! */  = var7_14 + var12_19;
                if (var4_5 /* !! */  > this.a.length) {
                    this.e(var4_5 /* !! */ );
                }
                this.b = var4_5 /* !! */ ;
                if (var12_19 != 1) break block72;
                if (var9_16 == 8232) {
                    var4_5 /* !! */  = var10_20 + 1;
                    var1_1 = this.a;
                    System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var10_20 + 6, var18_9 - var10_20 - 1);
                    var1_1 = this.a;
                    var1_1[var10_20] = 92;
                    var1_1[var4_5 /* !! */ ] = 117;
                    var1_1[++var4_5 /* !! */ ] = 50;
                    var1_1[++var4_5 /* !! */ ] = 48;
                    var1_1[++var4_5 /* !! */ ] = 50;
                    var1_1[var4_5 /* !! */  + 1] = 56;
                } else if (var9_16 == 8233) {
                    var4_5 /* !! */  = var10_20 + 1;
                    var1_1 = this.a;
                    System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var10_20 + 6, var18_9 - var10_20 - 1);
                    var1_1 = this.a;
                    var1_1[var10_20] = 92;
                    var1_1[var4_5 /* !! */ ] = 117;
                    var1_1[++var4_5 /* !! */ ] = 50;
                    var1_1[++var4_5 /* !! */ ] = 48;
                    var1_1[++var4_5 /* !! */ ] = 50;
                    var1_1[var4_5 /* !! */  + 1] = 57;
                } else if (var9_16 != 40 && var9_16 != 41 && var9_16 != 60 && var9_16 != 62) {
                    var1_1 = com.github.catvod.spider.merge.H.i.e;
                    if (var9_16 < ((Object)var1_1).length && var1_1[var9_16] == 4) {
                        var4_5 /* !! */  = var10_20 + 1;
                        var1_1 = this.a;
                        System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var10_20 + 6, var18_9 - var10_20 - 1);
                        var21_7 /* !! */  = this.a;
                        var21_7 /* !! */ [var10_20] = 92;
                        var5_4 = var4_5 /* !! */  + 1;
                        var21_7 /* !! */ [var4_5 /* !! */ ] = 117;
                        var4_5 /* !! */  = var5_4 + 1;
                        var1_1 = com.github.catvod.spider.merge.H.i.b;
                        var21_7 /* !! */ [var5_4] = (char)var1_1[var9_16 >>> 12 & 15];
                        var5_4 = var4_5 /* !! */  + 1;
                        var21_7 /* !! */ [var4_5 /* !! */ ] = (char)var1_1[var9_16 >>> 8 & 15];
                        var21_7 /* !! */ [var5_4] = (char)var1_1[var9_16 >>> 4 & 15];
                        var21_7 /* !! */ [var5_4 + 1] = (char)var1_1[var9_16 & 15];
                    } else {
                        var4_5 /* !! */  = var10_20 + 1;
                        var1_1 = this.a;
                        System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var10_20 + 2, var18_9 - var10_20 - 1);
                        var1_1 = this.a;
                        var1_1[var10_20] = 92;
                        var1_1[var4_5 /* !! */ ] = com.github.catvod.spider.merge.H.i.i[var9_16];
                    }
                } else {
                    var4_5 /* !! */  = var10_20 + 1;
                    var1_1 = this.a;
                    System.arraycopy(var1_1, var4_5 /* !! */ , var1_1, var10_20 + 6, var18_9 - var10_20 - 1);
                    var1_1 = this.a;
                    var1_1[var10_20] = 92;
                    var1_1[var4_5 /* !! */ ] = 117;
                    var21_7 /* !! */  = com.github.catvod.spider.merge.H.i.b;
                    var1_1[++var4_5 /* !! */ ] = var21_7 /* !! */ [var9_16 >>> 12 & 15];
                    var1_1[++var4_5 /* !! */ ] = var21_7 /* !! */ [var9_16 >>> 8 & 15];
                    var1_1[++var4_5 /* !! */ ] = var21_7 /* !! */ [var9_16 >>> 4 & 15];
                    var1_1[var4_5 /* !! */  + 1] = var21_7 /* !! */ [var9_16 & 15];
                }
                break block71;
            }
            if (var12_19 <= 1) break block71;
            var6_3 = var5_4 - var11_8;
            var4_5 /* !! */  = var5_4;
            for (var5_4 = var6_3; var5_4 < var1_1.length(); ++var5_4) {
                block74: {
                    block73: {
                        var3_18 = var1_1.charAt(var5_4);
                        if (this.o && (var3_18 == '(' || var3_18 == ')' || var3_18 == '<' || var3_18 == '>')) {
                            var21_7 /* !! */  = this.a;
                            var6_3 = var4_5 /* !! */  + 1;
                            var21_7 /* !! */ [var4_5 /* !! */ ] = 92;
                            var7_14 = var6_3 + 1;
                            var21_7 /* !! */ [var6_3] = 117;
                            var4_5 /* !! */  = var7_14 + 1;
                            var22_27 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.b;
                            var21_7 /* !! */ [var7_14] = var22_27 /* !! */ [var3_18 >>> 12 & 15];
                            var7_14 = var4_5 /* !! */  + 1;
                            var21_7 /* !! */ [var4_5 /* !! */ ] = var22_27 /* !! */ [var3_18 >>> 8 & 15];
                            var6_3 = var7_14 + 1;
                            var21_7 /* !! */ [var7_14] = var22_27 /* !! */ [var3_18 >>> 4 & 15];
                            var4_5 /* !! */  = var6_3 + 1;
                            var21_7 /* !! */ [var6_3] = var22_27 /* !! */ [var3_18 & 15];
                            continue;
                        }
                        var22_27 /* !! */  = com.github.catvod.spider.merge.H.i.e;
                        if (var3_18 < var22_27 /* !! */ .length && var22_27 /* !! */ [var3_18] != 0) break block73;
                        if (var3_18 != '/' || !this.g(i0.q)) break block74;
                    }
                    var21_7 /* !! */  = this.a;
                    var6_3 = var4_5 /* !! */  + 1;
                    var21_7 /* !! */ [var4_5 /* !! */ ] = 92;
                    if (var22_27 /* !! */ [var3_18] == 4) {
                        var7_14 = var6_3 + 1;
                        var21_7 /* !! */ [var6_3] = 117;
                        var4_5 /* !! */  = var7_14 + 1;
                        var22_27 /* !! */  = (byte[])com.github.catvod.spider.merge.H.i.b;
                        var21_7 /* !! */ [var7_14] = var22_27 /* !! */ [var3_18 >>> 12 & 15];
                        var7_14 = var4_5 /* !! */  + 1;
                        var21_7 /* !! */ [var4_5 /* !! */ ] = var22_27 /* !! */ [var3_18 >>> 8 & 15];
                        var6_3 = var7_14 + 1;
                        var21_7 /* !! */ [var7_14] = var22_27 /* !! */ [var3_18 >>> 4 & 15];
                        var4_5 /* !! */  = var6_3 + 1;
                        var21_7 /* !! */ [var6_3] = var22_27 /* !! */ [var3_18 & 15];
                        continue;
                    }
                    var4_5 /* !! */  = var6_3 + 1;
                    var21_7 /* !! */ [var6_3] = com.github.catvod.spider.merge.H.i.i[var3_18];
                    continue;
                }
                if (var3_18 != '\u2028' && var3_18 != '\u2029') {
                    this.a[var4_5 /* !! */ ] = var3_18;
                    ++var4_5 /* !! */ ;
                    continue;
                }
                var22_27 /* !! */  = (byte[])this.a;
                var7_14 = var4_5 /* !! */  + 1;
                var22_27 /* !! */ [var4_5 /* !! */ ] = 92;
                var6_3 = var7_14 + 1;
                var22_27 /* !! */ [var7_14] = 117;
                var4_5 /* !! */  = var6_3 + 1;
                var21_7 /* !! */  = com.github.catvod.spider.merge.H.i.b;
                var22_27 /* !! */ [var6_3] = var21_7 /* !! */ [var3_18 >>> 12 & 15];
                var6_3 = var4_5 /* !! */  + 1;
                var22_27 /* !! */ [var4_5 /* !! */ ] = var21_7 /* !! */ [var3_18 >>> 8 & 15];
                var7_14 = var6_3 + 1;
                var22_27 /* !! */ [var6_3] = var21_7 /* !! */ [var3_18 >>> 4 & 15];
                var4_5 /* !! */  = var7_14 + 1;
                var22_27 /* !! */ [var7_14] = var21_7 /* !! */ [var3_18 & 15];
            }
        }
        if (var2_2 != '\u0000') {
            var1_1 = this.a;
            var4_5 /* !! */  = this.b;
            var1_1[var4_5 /* !! */  - 2] = 34;
            var1_1[var4_5 /* !! */  - 1] = var2_2;
        } else {
            this.a[this.b - 1] = 34;
        }
    }

    protected final void y(String object) {
        block22: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            block21: {
                int n9;
                block15: {
                    block16: {
                        n8 = 0;
                        if (object == null) {
                            n7 = this.b + 4;
                            if (n7 > this.a.length) {
                                this.e(n7);
                            }
                            "null".getChars(0, 4, this.a, this.b);
                            this.b = n7;
                            return;
                        }
                        n6 = ((String)object).length();
                        n9 = this.b + n6 + 2;
                        if (n9 <= this.a.length) break block15;
                        if (this.d == null) break block16;
                        this.write(39);
                        for (n7 = 0; n7 < ((String)object).length(); ++n7) {
                            block18: {
                                char c2;
                                block17: {
                                    c2 = ((String)object).charAt(n7);
                                    if (c2 <= '\r' || c2 == '\\' || c2 == '\'') break block17;
                                    n6 = c2;
                                    if (c2 != '/') break block18;
                                    n6 = c2;
                                    if (!this.g(i0.q)) break block18;
                                }
                                this.write(92);
                                n6 = com.github.catvod.spider.merge.H.i.i[c2];
                            }
                            this.write(n6);
                        }
                        this.write(39);
                        return;
                    }
                    this.e(n9);
                }
                n7 = this.b;
                n5 = n7 + 1;
                n4 = n5 + n6;
                char[] cArray = this.a;
                cArray[n7] = 39;
                ((String)object).getChars(0, n6, cArray, n5);
                this.b = n9;
                n6 = -1;
                n3 = 0;
                for (n7 = n5; n7 < n4; ++n7) {
                    int n10;
                    int n11;
                    block20: {
                        int n12;
                        block19: {
                            n12 = this.a[n7];
                            if (n12 <= 13 || n12 == 92 || n12 == 39) break block19;
                            n11 = n8;
                            n10 = n3;
                            n2 = n6;
                            if (n12 != 47) break block20;
                            n11 = n8;
                            n10 = n3;
                            n2 = n6;
                            if (!this.g(i0.q)) break block20;
                        }
                        n11 = n8 + 1;
                        n2 = n7;
                        n10 = n12;
                    }
                    n8 = n11;
                    n3 = n10;
                    n6 = n2;
                }
                n7 = n9 + n8;
                if (n7 > this.a.length) {
                    this.e(n7);
                }
                this.b = n7;
                if (n8 != 1) break block21;
                object = this.a;
                n7 = n6 + 1;
                System.arraycopy(object, n7, object, n6 + 2, n4 - n6 - 1);
                object = this.a;
                object[n6] = 92;
                object[n7] = com.github.catvod.spider.merge.H.i.i[n3];
                break block22;
            }
            if (n8 <= 1) break block22;
            object = this.a;
            n2 = n6 + 1;
            System.arraycopy(object, n2, object, n6 + 2, n4 - n6 - 1);
            object = this.a;
            object[n6] = 92;
            object[n2] = com.github.catvod.spider.merge.H.i.i[n3];
            n7 = n4 + 1;
            for (n6 = n2 - 2; n6 >= n5; --n6) {
                block24: {
                    block23: {
                        n2 = this.a[n6];
                        if (n2 <= 13 || n2 == 92 || n2 == 39) break block23;
                        n3 = n7;
                        if (n2 != 47) break block24;
                        n3 = n7;
                        if (!this.g(i0.q)) break block24;
                    }
                    object = this.a;
                    n3 = n6 + 1;
                    System.arraycopy(object, n3, object, n6 + 2, n7 - n6 - 1);
                    object = this.a;
                    object[n6] = 92;
                    object[n3] = com.github.catvod.spider.merge.H.i.i[n2];
                    n3 = n7 + 1;
                }
                n7 = n3;
            }
        }
        this.a[this.b - 1] = 39;
    }
}

