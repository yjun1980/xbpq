/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b2;
import com.github.catvod.spider.merge.\u1076;

public final class \u105c
extends \u08b2 {
    public final int \u052a;

    public \u105c(\u08b0 \u08b02, int n2) {
        super(\u08b02);
        this.\u052a = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052a);
        stringBuilder.append(SOY.d("5A6C6C562B07"));
        return stringBuilder.toString();
    }

    @Override
    public int \u037f() {
        return 10;
    }

    @Override
    public boolean \u0528() {
        return true;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        return false;
    }

    public \u1076.\u052c \u052b() {
        return new \u1076.\u052c(this.\u052a);
    }
}

