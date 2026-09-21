/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.d0;
import com.github.catvod.spider.merge.E0.e0;

final class f0 {
    private static final d0 a;
    private static final e0 b;

    static {
        d0 d02;
        int n2 = d.c;
        try {
            d02 = (d0)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            d02 = null;
        }
        a = d02;
        b = new e0();
    }

    static d0 a() {
        return a;
    }

    static d0 b() {
        return b;
    }
}

