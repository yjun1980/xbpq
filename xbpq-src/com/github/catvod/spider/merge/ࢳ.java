/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u107d;

public final class \u08b3
extends \u107d {
    public final int \u052a;
    public final int \u052b;
    public final boolean \u052c;

    public \u08b3(\u08b0 \u08b02, int n2, int n3, boolean bl) {
        super(\u08b02);
        this.\u052a = n2;
        this.\u052b = n3;
        this.\u052c = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("1B31251F1B1925"));
        stringBuilder.append(this.\u052a);
        stringBuilder.append(SOY.d("40"));
        stringBuilder.append(this.\u052b);
        return stringBuilder.toString();
    }

    @Override
    public int \u037f() {
        return 6;
    }

    @Override
    public boolean \u0528() {
        return true;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        return false;
    }
}

