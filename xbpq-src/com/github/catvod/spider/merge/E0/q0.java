/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.o0;
import com.github.catvod.spider.merge.E0.p0;

final class q0 {
    private static final o0 a;
    private static final p0 b;

    static {
        o0 o02;
        int n2 = d.c;
        try {
            o02 = (o0)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            o02 = null;
        }
        a = o02;
        b = new p0();
    }

    static o0 a() {
        return a;
    }

    static o0 b() {
        return b;
    }
}

