/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.L1.e;

final class d {
    private final e[] a = new e[3];

    d() {
    }

    final e a() {
        return this.a[0];
    }

    final boolean b() {
        boolean bl;
        e[] eArray = this.a;
        boolean bl2 = bl = false;
        if (eArray[0] != null) {
            bl2 = bl;
            if (eArray[0].a == 72) {
                bl2 = true;
            }
        }
        return bl2;
    }

    final void c(e e2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            e[] eArray = this.a;
            e e3 = eArray[i2];
            eArray[i2] = e2;
            e2 = e3;
        }
    }

    final e d() {
        return this.a[2];
    }

    final e e() {
        return this.a[1];
    }

    final boolean f() {
        e[] eArray = this.a;
        boolean bl = true;
        if (eArray[1] == null || eArray[1].a != 72) {
            bl = false;
        }
        return bl;
    }
}

