/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.h;
import com.github.catvod.spider.merge.A.l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class b {
    public final byte[] a;
    private final int[] b;
    private final String[] c;
    private final int d;
    public final int e;
    private boolean f;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public b(InputStream var1_1, boolean var2_2) {
        super();
        this.f = var2_2;
        var12_3 = new ByteArrayOutputStream();
        var13_4 = new byte[1024];
        while (true) {
            var3_5 = var1_1.read(var13_4);
            var6_6 = 0;
            if (var3_5 == -1) break;
            if (var3_5 <= 0) continue;
            var12_3.write(var13_4, 0, var3_5);
        }
        var1_1.close();
        this.a = var12_3.toByteArray();
        var10_7 = this.d(8);
        this.b = new int[var10_7];
        this.c = new String[var10_7];
        var5_8 = 10;
        var4_9 = 1;
        while (true) {
            block6: {
                if (var4_9 >= var10_7) {
                    this.d = var6_6;
                    this.e = var5_8;
                    return;
                }
                var1_1 = this.b;
                var3_5 = var5_8 + 1;
                var1_1[var4_9] = var3_5;
                var11_13 = this.a[var5_8];
                var9_12 = 5;
                if (var11_13 == 1) ** GOTO lbl61
                if (var11_13 == 15) ** GOTO lbl57
                var8_11 = var4_9;
                var7_10 = var6_6;
                var3_5 = var9_12;
                if (var11_13 == 18) break block6;
                var8_11 = var4_9;
                var7_10 = var6_6;
                var3_5 = var9_12;
                if (var11_13 == 3) break block6;
                var8_11 = var4_9;
                var7_10 = var6_6;
                var3_5 = var9_12;
                if (var11_13 == 4) break block6;
                if (var11_13 == 5 || var11_13 == 6) ** GOTO lbl53
                var8_11 = var4_9;
                var7_10 = var6_6;
                var3_5 = var9_12;
                switch (var11_13) {
                    default: {
                        var3_5 = 3;
                        var8_11 = var4_9;
                        var7_10 = var6_6;
                        break;
                    }
lbl53:
                    // 1 sources

                    var3_5 = 9;
                    var8_11 = var4_9 + 1;
                    var7_10 = var6_6;
                    break;
lbl57:
                    // 1 sources

                    var3_5 = 4;
                    var8_11 = var4_9;
                    var7_10 = var6_6;
                    break;
lbl61:
                    // 1 sources

                    var9_12 = this.d(var3_5) + 3;
                    var8_11 = var4_9;
                    var7_10 = var6_6;
                    var3_5 = var9_12;
                    if (var9_12 <= var6_6) break;
                    var7_10 = var9_12;
                    var3_5 = var9_12;
                    var8_11 = var4_9;
                    break;
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                }
            }
            var5_8 += var3_5;
            var4_9 = var8_11 + 1;
            var6_6 = var7_10;
        }
    }

    private int b(int n2) {
        byte[] byArray = this.a;
        byte by = byArray[n2];
        byte by2 = byArray[n2 + 1];
        byte by3 = byArray[n2 + 2];
        return byArray[n2 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    private String c(int n2, char[] object) {
        String[] stringArray = this.c;
        int n3 = this.d(n2);
        Object object2 = stringArray[n3];
        if (object2 != null) {
            return object2;
        }
        n2 = this.b[n3];
        int n4 = n2 + 2;
        int n5 = this.d(n2);
        object2 = this.a;
        int n6 = 0;
        n2 = 0;
        int n7 = 0;
        for (int i2 = n4; i2 < n5 + n4; ++i2) {
            Object object3;
            block9: {
                block8: {
                    block6: {
                        block7: {
                            object3 = object2[i2];
                            if (n2 == 0) break block6;
                            if (n2 == 1) break block7;
                            if (n2 != 2) continue;
                            n2 = object3 & 0x3F | n7 << 6;
                            break block8;
                        }
                        object[n6] = (char)(object3 & 0x3F | n7 << 6);
                        ++n6;
                        n2 = 0;
                        continue;
                    }
                    if ((object3 = (Object)(object3 & 0xFF)) < 128) {
                        object[n6] = (char)object3;
                        ++n6;
                        continue;
                    }
                    if (object3 >= 224 || object3 <= 191) break block9;
                    n2 = object3 & 0x1F;
                }
                n7 = (char)n2;
                n2 = 1;
                continue;
            }
            n7 = (char)(object3 & 0xF);
            n2 = 2;
        }
        object = new String((char[])object, 0, n6);
        stringArray[n3] = object;
        return object;
    }

    private int d(int n2) {
        byte[] byArray = this.a;
        byte by = byArray[n2];
        return byArray[n2 + 1] & 0xFF | (by & 0xFF) << 8;
    }

    public final void a(l l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        char[] cArray;
        block30: {
            cArray = new char[this.d];
            if (this.f) {
                n6 = this.e;
                n6 = this.d(n6 + 6) * 2 + (n6 + 8);
                for (n5 = this.d(n6); n5 > 0; --n5) {
                    for (n4 = this.d(n6 + 8); n4 > 0; --n4) {
                        n6 += this.b(n6 + 12) + 6;
                    }
                    n6 += 8;
                }
                for (n5 = this.d(n6 += 2); n5 > 0; --n5) {
                    for (n4 = this.d(n6 + 8); n4 > 0; --n4) {
                        n6 += this.b(n6 + 12) + 6;
                    }
                    n6 += 8;
                }
                n5 = n6 + 2;
                for (n6 = this.d(n5); n6 > 0; --n6) {
                    if ("RuntimeVisibleAnnotations".equals(this.c(n5 + 2, cArray))) {
                        n5 += 8;
                        break block30;
                    }
                    n5 += this.b(n5 + 4) + 6;
                }
            }
            n5 = 0;
        }
        n6 = this.e;
        int n7 = this.d(n6 + 6);
        n4 = n6 + 8;
        for (n6 = 0; n6 < n7; ++n6) {
            n4 += 2;
        }
        n6 = n7 = n4 + 2;
        for (n3 = this.d(n4); n3 > 0; --n3) {
            n2 = this.d(n6 + 6);
            n6 += 8;
            while (n2 > 0) {
                n6 += this.b(n6 + 2) + 6;
                --n2;
            }
        }
        n3 = this.d(n6);
        n6 += 2;
        while (n3 > 0) {
            n2 = this.d(n6 + 6);
            n6 += 8;
            while (n2 > 0) {
                n6 += this.b(n6 + 2) + 6;
                --n2;
            }
            --n3;
        }
        n2 = this.d(n6);
        n3 = n6 + 2;
        for (n6 = n2; n6 > 0; --n6) {
            n3 += this.b(n3 + 2) + 6;
        }
        if (n5 != 0) {
            for (n6 = this.d(n5); n6 > 0; --n6) {
                l2.c(this.c(n5 + 2, cArray));
            }
        }
        n6 = n7;
        for (n5 = this.d(n4); n5 > 0; --n5) {
            n4 = this.d(n6 + 6);
            n6 += 8;
            while (n4 > 0) {
                n6 += this.b(n6 + 2) + 6;
                --n4;
            }
        }
        n5 = this.d(n6);
        n6 += 2;
        while (n5 > 0) {
            Object object;
            n3 = this.d(n6);
            Object object2 = this.c(n6 + 2, cArray);
            String string = this.c(n6 + 4, cArray);
            n4 = this.d(n6 + 6);
            n6 += 8;
            n7 = 0;
            while (n4 > 0) {
                object = this.c(n6, cArray);
                n2 = this.b(n6 + 2);
                n6 += 6;
                if (((String)object).equals("Code")) {
                    n7 = n6;
                }
                n6 += n2;
                --n4;
            }
            if ((object2 = l2.d(n3, (String)object2, string)) != null && n7 != 0) {
                n4 = n7 + 8 + this.b(n7 + 4);
                n7 = this.d(n4);
                n4 += 2;
                while (n7 > 0) {
                    n4 += 8;
                    --n7;
                }
                n2 = this.d(n4);
                n7 = n4 + 2;
                n4 = 0;
                n3 = 0;
                while (n2 > 0) {
                    int n8;
                    object = this.c(n7, cArray);
                    if (((String)object).equals("LocalVariableTable")) {
                        n8 = n7 + 6;
                    } else {
                        n8 = n4;
                        if (((String)object).equals("LocalVariableTypeTable")) {
                            n3 = n7 + 6;
                            n8 = n4;
                        }
                    }
                    n7 += this.b(n7 + 2) + 6;
                    --n2;
                    n4 = n8;
                }
                if (n4 != 0) {
                    if (n3 != 0) {
                        n2 = this.d(n3) * 3;
                        n7 = n3 + 2;
                        object = new int[n2];
                        n3 = n2;
                        while (n3 > 0) {
                            object[--n3] = n7 + 6;
                            object[--n3] = this.d(n7 + 8);
                            object[--n3] = this.d(n7);
                            n7 += 10;
                        }
                    }
                    n7 = this.d(n4);
                    n4 += 2;
                    while (n7 > 0) {
                        n3 = this.d(n4 + 8);
                        ((h)object2).b(this.c(n4 + 4, cArray), n3);
                        n4 += 10;
                        --n7;
                    }
                }
            }
            --n5;
        }
    }
}

