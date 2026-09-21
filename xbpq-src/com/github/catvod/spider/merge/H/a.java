/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.b;
import java.security.PrivilegedAction;

final class a
implements PrivilegedAction<Object> {
    a() {
    }

    @Override
    public final Object run() {
        return b.class.getProtectionDomain();
    }
}

