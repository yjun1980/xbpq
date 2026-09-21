/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.U;
import com.github.catvod.spider.merge.E0.V;
import com.github.catvod.spider.merge.E0.d;

final class W {
    private static final U a;
    private static final V b;

    static {
        U u2;
        int n2 = d.c;
        try {
            u2 = (U)Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            u2 = null;
        }
        a = u2;
        b = new V();
    }

    static U a() {
        return a;
    }

    static U b() {
        return b;
    }
}

