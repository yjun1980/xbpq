/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.i;
import java.io.Serializable;

public final class j
implements i,
Serializable {
    public static final j a = new j();

    @Override
    public final g b(h h2) {
        com.github.catvod.spider.merge.mI.i.e(h2, "key");
        return null;
    }

    @Override
    public final Object c(Object object, p p2) {
        return object;
    }

    @Override
    public final i e(h h2) {
        com.github.catvod.spider.merge.mI.i.e(h2, "key");
        return this;
    }

    @Override
    public final i f(i i2) {
        com.github.catvod.spider.merge.mI.i.e(i2, "context");
        return i2;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

