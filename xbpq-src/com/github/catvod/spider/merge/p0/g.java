/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.p0.d;

final class g
implements d {
    g() {
    }

    @Override
    public final char[] a(char[] cArray, String charSequence) {
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(cArray);
        return ((StringBuilder)charSequence).reverse().toString().toCharArray();
    }
}

