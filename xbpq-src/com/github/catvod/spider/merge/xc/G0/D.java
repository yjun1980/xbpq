/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.c;

public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    public final boolean a;
    public final boolean b;

    public D(boolean bl, boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    public final void a(c c2) {
        if (c2 != null && !this.b) {
            for (int i2 = 0; i2 < c2.a; ++i2) {
                String[] stringArray = c2.b;
                stringArray[i2] = com.github.catvod.spider.merge.xc.D0.b.u(stringArray[i2]);
            }
        }
    }
}

