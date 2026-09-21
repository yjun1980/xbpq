/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.p0.d;

final class j
implements d {
    j() {
    }

    @Override
    public final char[] a(char[] cArray, String string) {
        int n2 = Integer.parseInt(string);
        char c2 = cArray[0];
        cArray[0] = cArray[n2 % cArray.length];
        cArray[n2 % cArray.length] = c2;
        return cArray;
    }
}

