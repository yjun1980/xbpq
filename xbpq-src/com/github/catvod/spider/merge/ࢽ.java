/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u107d;

public final class \u08bd
extends \u107d {
    private final int \u052a;

    public \u08bd(\u08b0 \u08b02) {
        this(\u08b02, -1);
    }

    public \u08bd(\u08b0 \u08b02, int n2) {
        super(\u08b02);
        this.\u052a = n2;
    }

    public String toString() {
        return SOY.d("1F22221F181814");
    }

    @Override
    public int \u037f() {
        return 1;
    }

    @Override
    public boolean \u0528() {
        return true;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        return false;
    }

    public int \u052b() {
        return this.\u052a;
    }
}

