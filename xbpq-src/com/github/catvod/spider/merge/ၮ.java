/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u107d;

public final class \u106e
extends \u107d {
    public final int \u052a;
    public final int \u052b;

    public \u106e(\u08b0 \u08b02, int n2, int n3) {
        super(\u08b02);
        this.\u052a = n2;
        this.\u052b = n3;
    }

    public String toString() {
        String string = SOY.d("5D");
        StringBuilder stringBuilder = new StringBuilder(string).appendCodePoint(this.\u052a);
        stringBuilder.append(SOY.d("5D7C7F51"));
        stringBuilder = stringBuilder.appendCodePoint(this.\u052b);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    @Override
    public int \u037f() {
        return 2;
    }

    @Override
    public \u0674 \u0529() {
        return \u0674.\u0780(this.\u052a, this.\u052b);
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        boolean bl = n2 >= this.\u052a && n2 <= this.\u052b;
        return bl;
    }
}

