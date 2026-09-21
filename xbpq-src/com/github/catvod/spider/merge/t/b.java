/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.t.a;

final class b {
    private final a a;
    private final int[] b;

    b(a object, int[] nArray) {
        if (nArray.length != 0) {
            this.a = object;
            int n2 = nArray.length;
            if (n2 > 1 && nArray[0] == 0) {
                int n3;
                for (n3 = 1; n3 < n2 && nArray[n3] == 0; ++n3) {
                }
                if (n3 == n2) {
                    this.b = new int[]{0};
                    return;
                }
                object = new int[n2 -= n3];
                this.b = (int[])object;
                System.arraycopy(nArray, n3, object, 0, n2);
                return;
            }
            this.b = nArray;
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    final b a(b object) {
        if (this.a.equals(((b)object).a)) {
            Object object2;
            if (this.e()) {
                return object;
            }
            if (((b)object).e()) {
                return this;
            }
            int[] nArray = this.b;
            object = ((b)object).b;
            if (nArray.length > ((Object)object).length) {
                object2 = nArray;
            } else {
                object2 = object;
                object = nArray;
            }
            nArray = new int[((int[])object2).length];
            int n2 = ((int[])object2).length - ((Object)object).length;
            System.arraycopy(object2, 0, nArray, 0, n2);
            for (int i2 = n2; i2 < ((int[])object2).length; ++i2) {
                nArray[i2] = object[i2 - n2] ^ object2[i2];
            }
            return new b(this.a, nArray);
        }
        object = new IllegalArgumentException(cYh.d("20352F3425330417070138361E236135387A093F35713F3B11356122363702700634393F15392216117A0139243D33"));
        throw object;
    }

    final b[] b(b object) {
        if (this.a.equals(((b)object).a)) {
            if (!((b)object).e()) {
                b b2 = this.a.d();
                int n2 = ((b)object).c(((b)object).b.length - 1);
                n2 = this.a.e(n2);
                b b3 = this;
                while (b3.b.length - 1 >= ((b)object).b.length - 1 && !b3.e()) {
                    Object object2 = b3.b;
                    int n3 = ((int[])object2).length - 1 - (((b)object).b.length - 1);
                    int n4 = this.a.g(b3.c(((int[])object2).length - 1), n2);
                    object2 = ((b)object).g(n3, n4);
                    b2 = b2.a(this.a.a(n3, n4));
                    b3 = b3.a((b)object2);
                }
                return new b[]{b2, b3};
            }
            throw new IllegalArgumentException(cYh.d("23393738333F4732387167"));
        }
        object = new IllegalArgumentException(cYh.d("20352F3425330417070138361E236135387A093F35713F3B11356122363702700634393F15392216117A0139243D33"));
        throw object;
    }

    final int c(int n2) {
        int[] nArray = this.b;
        return nArray[nArray.length - 1 - n2];
    }

    final int[] d() {
        return this.b;
    }

    final boolean e() {
        return this.b[0] == 0;
    }

    final b f(b object) {
        if (this.a.equals(((b)object).a)) {
            if (!this.e() && !((b)object).e()) {
                int[] nArray = this.b;
                int n2 = nArray.length;
                int[] nArray2 = ((b)object).b;
                int n3 = nArray2.length;
                object = new int[n2 + n3 - 1];
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n4 = nArray[i2];
                    for (int i3 = 0; i3 < n3; ++i3) {
                        int n5 = i2 + i3;
                        object[n5] = object[n5] ^ this.a.g(n4, nArray2[i3]);
                    }
                }
                return new b(this.a, (int[])object);
            }
            return this.a.d();
        }
        object = new IllegalArgumentException(cYh.d("20352F3425330417070138361E236135387A093F35713F3B11356122363702700634393F15392216117A0139243D33"));
        throw object;
    }

    final b g(int n2, int n3) {
        if (n2 >= 0) {
            if (n3 == 0) {
                return this.a.d();
            }
            int n4 = this.b.length;
            int[] nArray = new int[n2 + n4];
            for (n2 = 0; n2 < n4; ++n2) {
                nArray[n2] = this.a.g(this.b[n2], n3);
            }
            return new b(this.a, nArray);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    public final String toString() {
        var5_1 = new StringBuilder((this.b.length - 1) * 8);
        var2_2 = this.b.length;
        ** GOTO lbl44
        while (var3_4 >= 0) {
            var4_5 = this.c(var3_4);
            var2_2 = var3_4;
            if (var4_5 != 0) {
                if (var4_5 < 0) {
                    var5_1.append(cYh.d("477D61"));
                    var2_2 = -var4_5;
                } else {
                    var2_2 = var4_5;
                    if (var5_1.length() > 0) {
                        var5_1.append(cYh.d("477B61"));
                        var2_2 = var4_5;
                    }
                }
                if (var3_4 == 0 || var2_2 != 1) {
                    if ((var2_2 = this.a.f(var2_2)) == 0) {
                        var1_3 = 49;
lbl21:
                        // 2 sources

                        while (true) {
                            var5_1.append((char)var1_3);
                            break;
                        }
                    } else {
                        if (var2_2 == 1) {
                            var1_3 = 97;
                            ** continue;
                        }
                        var5_1.append(cYh.d("060E"));
                        var5_1.append(var2_2);
                    }
                }
                var2_2 = var3_4;
                if (var3_4 != 0) {
                    if (var3_4 == 1) {
                        var5_1.append('x');
                        var2_2 = var3_4;
                    } else {
                        var5_1.append(cYh.d("1F0E"));
                        var5_1.append(var3_4);
                        var2_2 = var3_4;
                    }
                }
            }
lbl44:
            // 7 sources

            var3_4 = var2_2 - 1;
        }
        return var5_1.toString();
    }
}

