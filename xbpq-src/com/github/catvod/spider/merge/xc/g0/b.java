/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.i;

public final class b
implements d {
    public static final b a = new b();

    @Override
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override
    public final void resumeWith(Object object) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

