/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.w0.e;
import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.w0.h;
import com.github.catvod.spider.merge.w0.j;
import java.util.List;

public abstract class a
implements g {
    private String a;
    protected List<String> b;

    public a(com.github.catvod.spider.merge.y.e e2) {
        this.a = e2.u("title").x("simpleText");
        com.github.catvod.spider.merge.g.a.b(e2.u("shortBylineText"));
    }

    @Override
    public final j a() {
        throw new UnsupportedOperationException();
    }

    public final List<String> b() {
        return this.b;
    }

    @Override
    public final String c() {
        return this.a;
    }

    @Override
    public e f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public h g() {
        throw new UnsupportedOperationException();
    }
}

