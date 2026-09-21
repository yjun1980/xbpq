/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.w0.a;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.e;
import java.util.LinkedList;

public final class h
extends a {
    private final String c;
    private final int d;

    public h(e e2) {
        super(e2);
        int n2;
        this.c = e2.x("playlistId");
        b b2 = e2.t("thumbnails");
        this.b = new LinkedList<String>();
        for (n2 = 0; n2 < b2.size(); ++n2) {
            this.b.addAll(com.github.catvod.spider.merge.g.a.c(b2.p(n2)));
        }
        n2 = e2.containsKey("videoCount") ? Integer.parseInt(e2.x("videoCount")) : -1;
        this.d = n2;
    }

    @Override
    public final int d() {
        return 3;
    }

    public final String e() {
        return this.c;
    }

    @Override
    public final h g() {
        return this;
    }

    public final int h() {
        return this.d;
    }
}

