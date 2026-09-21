/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y0;

import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.y.e;
import com.github.catvod.spider.merge.y0.b;
import com.github.catvod.spider.merge.y0.c;
import com.github.catvod.spider.merge.y0.g;

public final class f
extends g
implements b {
    public f(e e2) {
        super(e2);
        a.b(e2.u("didYouMean"));
    }

    @Override
    protected final String b(e e2) {
        return a.b(e2.u("correctedQuery"));
    }

    @Override
    protected final String e(e e2) {
        return e2.u("correctedQueryEndpoint").u("commandMetadata").u("webCommandMetadata").x("url");
    }

    @Override
    public final c type() {
        return c.a;
    }
}

