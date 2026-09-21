/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.V.i;

public final class a {
    private static volatile i d = i.s;
    private final StringBuffer a;
    private final Object b;
    private final i c;

    public a(Object object) {
        StringBuffer stringBuffer;
        i i2 = d;
        this.a = stringBuffer = new StringBuffer(512);
        this.c = i2;
        this.b = object;
        i2.m(stringBuffer, object);
    }

    public final a a(Object object) {
        this.c.a(this.a, object);
        return this;
    }

    public final a b(String string, boolean bl) {
        this.c.b(this.a, string, bl);
        return this;
    }

    public final String toString() {
        Object object = this.b;
        if (object == null) {
            this.a.append(this.c.s());
        } else {
            this.c.h(this.a, object);
        }
        return this.a.toString();
    }
}

