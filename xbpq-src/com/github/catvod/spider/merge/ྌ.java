/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u1077;

public final class \u0f8c
extends \u1077 {
    public \u0f8c(\u08b0 \u08b02, \u0674 \u06742) {
        super(\u08b02, \u06742);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('~');
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    @Override
    public int \u037f() {
        return 8;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        boolean bl = n2 >= n3 && n2 <= n4 && !super.\u052a(n2, n3, n4);
        return bl;
    }
}

