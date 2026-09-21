/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.g0;
import com.github.catvod.spider.merge.E0.j0;

final class t0
implements g0 {
    private final j0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    t0(j0 j02, String string, Object[] objectArray) {
        this.a = j02;
        this.b = string;
        this.c = objectArray;
        int n2 = string.charAt(0);
        if (n2 >= 55296) {
            char c2;
            int n3 = n2 & 0x1FFF;
            n2 = 1;
            int n4 = 13;
            while ((c2 = string.charAt(n2)) >= '\ud800') {
                n3 |= (c2 & 0x1FFF) << n4;
                n4 += 13;
                ++n2;
            }
            n2 = n3 | c2 << n4;
        }
        this.d = n2;
    }

    @Override
    public final int a() {
        int n2 = this.d;
        if ((n2 & 1) != 0) {
            return 1;
        }
        if ((n2 & 4) == 4) {
            return 3;
        }
        return 2;
    }

    @Override
    public final j0 b() {
        return this.a;
    }

    @Override
    public final boolean c() {
        boolean bl = (this.d & 2) == 2;
        return bl;
    }

    final Object[] d() {
        return this.c;
    }

    final String e() {
        return this.b;
    }
}

