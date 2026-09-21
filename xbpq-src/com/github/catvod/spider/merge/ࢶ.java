/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u107d;

public final class \u08b6
extends \u107d {
    public final int \u052a;

    public \u08b6(\u08b0 \u08b02, int n2) {
        super(\u08b02);
        this.\u052a = n2;
    }

    public String toString() {
        return String.valueOf(this.\u052a);
    }

    @Override
    public int \u037f() {
        return 5;
    }

    @Override
    public \u0674 \u0529() {
        return \u0674.\u0620(this.\u052a);
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        boolean bl = this.\u052a == n2;
        return bl;
    }
}

