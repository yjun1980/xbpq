/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.a;
import com.github.catvod.spider.merge.D1.b;

public final class c {
    public a a;
    public b b;

    private c(a a2, b b2) {
        this.a = a2;
        this.b = b2;
    }

    public static c a() {
        return new c(new a("VISIONOS", "1.04"), new b("MOBILE", "Apple", "RealityDevice17,1", "visionOS", "26.6.0.23O770"));
    }

    public static c b() {
        return new c(new a("WEB", "2.20260805.01.00"), new b("DESKTOP", null, null, null, null));
    }
}

