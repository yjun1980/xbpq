/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

final class f {
    int a;
    int b;
    int c;
    long d;
    String e;
    String f;
    String g;
    int h;
    f i;

    f() {
    }

    f(int n2, f f2) {
        this.a = n2;
        this.b = f2.b;
        this.c = f2.c;
        this.d = f2.d;
        this.e = f2.e;
        this.f = f2.f;
        this.g = f2.g;
        this.h = f2.h;
    }

    /*
     * Unable to fully structure code
     */
    final void a(int var1_1, String var2_2, String var3_3, String var4_4) {
        this.b = var1_1;
        this.e = var2_2;
        this.f = var3_3;
        this.g = var4_4;
        if (var1_1 != 1 && var1_1 != 7 && var1_1 != 8) {
            if (var1_1 != 12) {
                if (var1_1 != 13) {
                    var5_5 = var2_2.hashCode();
                    var6_7 = var3_3.hashCode();
                    var5_5 = var4_4.hashCode() * (var6_7 * var5_5);
lbl11:
                    // 2 sources

                    while (true) {
                        var1_1 = var5_5 + var1_1 & 0x7FFFFFFF;
lbl13:
                        // 2 sources

                        while (true) {
                            this.h = var1_1;
                            return;
                        }
                        break;
                    }
                }
            } else {
                var5_6 = var2_2.hashCode();
                var1_1 = var3_3.hashCode() * var5_6 + var1_1 & 0x7FFFFFFF;
                ** continue;
            }
        }
        var5_5 = var2_2.hashCode();
        ** while (true)
    }
}

