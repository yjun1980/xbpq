/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.j;

final class i
implements j {
    i() {
    }

    @Override
    public final int a(char[] cArray, int n2) {
        char c2 = cArray[n2];
        return cArray[n2 + 1] << 16 | c2;
    }

    @Override
    public final int size() {
        return 2;
    }
}

