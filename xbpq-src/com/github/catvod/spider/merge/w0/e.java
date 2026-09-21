/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.w0.a;
import java.util.AbstractList;

public final class e
extends a {
    private final String c;
    private final String d;

    public e(com.github.catvod.spider.merge.y.e e2) {
        super(e2);
        this.c = e2.x("channelId");
        this.d = com.github.catvod.spider.merge.g.a.b(e2.u("videoCountText"));
        if (e2.containsKey("subscriberCountText")) {
            e2.u("subscriberCountText").x("simpleText");
        }
        com.github.catvod.spider.merge.g.a.b(e2.u("descriptionSnippet"));
        this.b = (AbstractList)com.github.catvod.spider.merge.g.a.c(e2.u("thumbnail"));
    }

    @Override
    public final int d() {
        return 2;
    }

    public final String e() {
        return this.c;
    }

    @Override
    public final e f() {
        return this;
    }

    public final String h() {
        return this.d;
    }
}

