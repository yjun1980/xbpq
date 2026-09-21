/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b2;
import com.github.catvod.spider.merge.\u1076;

public final class \u105d
extends \u08b2 {
    public final int \u052a;
    public final int \u052b;
    public final boolean \u052c;

    public \u105d(\u08b0 \u08b02, int n2, int n3, boolean bl) {
        super(\u08b02);
        this.\u052a = n2;
        this.\u052b = n3;
        this.\u052c = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("0A2034122B"));
        stringBuilder.append(this.\u052a);
        stringBuilder.append(SOY.d("40"));
        stringBuilder.append(this.\u052b);
        return stringBuilder.toString();
    }

    @Override
    public int \u037f() {
        return 4;
    }

    @Override
    public boolean \u0528() {
        return true;
    }

    @Override
    public boolean \u052a(int n2, int n3, int n4) {
        return false;
    }

    public \u1076.\u052e \u052b() {
        return new \u1076.\u052e(this.\u052a, this.\u052b, this.\u052c);
    }
}

