/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0845;
import java.util.ArrayList;

public class \u0457
extends ArrayList<\u0845> {
    private final int \u037f;
    private final int \u0528;

    \u0457(int n2, int n3) {
        super(n2);
        this.\u037f = n2;
        this.\u0528 = n3;
    }

    public static \u0457 \u0528() {
        return new \u0457(0, 0);
    }

    boolean \u037f() {
        boolean bl = this.size() < this.\u0528;
        return bl;
    }
}

