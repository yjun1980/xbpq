/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y0;

import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.y.e;
import com.github.catvod.spider.merge.y0.g;
import java.util.ArrayList;
import java.util.List;

public final class d
extends g {
    private final List<String> a;

    public d(e e2) {
        super(e2);
        this.a = (ArrayList)com.github.catvod.spider.merge.g.a.c(e2.u("thumbnail"));
    }

    @Override
    protected final String b(e e2) {
        return com.github.catvod.spider.merge.g.a.b(e2.u("query"));
    }

    @Override
    protected final String e(e e2) {
        return e2.u("searchEndpoint").u("commandMetadata").u("webCommandMetadata").x("url");
    }
}

