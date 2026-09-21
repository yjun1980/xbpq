/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.io.InputStream;
import java.security.PrivilegedAction;

final class h
implements PrivilegedAction<InputStream> {
    h() {
    }

    @Override
    public final Object run() {
        Object object = Thread.currentThread().getContextClassLoader();
        object = object != null ? ((ClassLoader)object).getResourceAsStream("fastjson.properties") : ClassLoader.getSystemResourceAsStream("fastjson.properties");
        return object;
    }
}

