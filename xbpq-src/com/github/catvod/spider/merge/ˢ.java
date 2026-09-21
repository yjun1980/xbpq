/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02e3;

public class \u02e2 {
    private static volatile \u02e3 \u037f = \u02e3.\u037f;
    private final StringBuffer \u0528;
    private final Object \u0529;
    private final \u02e3 \u052a;

    public \u02e2(Object object) {
        this(object, null, null);
    }

    public \u02e2(Object object, \u02e3 serializable, StringBuffer stringBuffer) {
        \u02e3 \u02e32 = serializable;
        if (serializable == null) {
            \u02e32 = \u02e2.\u0529();
        }
        serializable = stringBuffer;
        if (stringBuffer == null) {
            serializable = new StringBuffer(512);
        }
        this.\u0528 = serializable;
        this.\u052a = \u02e32;
        this.\u0529 = object;
        \u02e32.\u0797((StringBuffer)serializable, object);
    }

    public static \u02e3 \u0529() {
        return \u037f;
    }

    public String toString() {
        if (this.\u052a() == null) {
            this.\u052b().append(this.\u052c().\u0860());
        } else {
            this.\u052a.\u0790(this.\u052b(), this.\u052a());
        }
        return this.\u052b().toString();
    }

    public \u02e2 \u037f(String string, Object object) {
        this.\u052a.\u037f(this.\u0528, string, object, null);
        return this;
    }

    public \u02e2 \u0528(String string, boolean bl) {
        this.\u052a.\u0528(this.\u0528, string, bl);
        return this;
    }

    public Object \u052a() {
        return this.\u0529;
    }

    public StringBuffer \u052b() {
        return this.\u0528;
    }

    public \u02e3 \u052c() {
        return this.\u052a;
    }
}

