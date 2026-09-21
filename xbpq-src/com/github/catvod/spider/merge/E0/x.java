/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.E0.w;

final class x {
    private static final v<?> a;
    private static final v<?> b;

    static {
        v v2;
        a = new w();
        int n2 = d.c;
        try {
            v2 = (v)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            v2 = null;
        }
        b = v2;
    }

    static v<?> a() {
        v<?> v2 = b;
        if (v2 != null) {
            return v2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static v<?> b() {
        return a;
    }
}

