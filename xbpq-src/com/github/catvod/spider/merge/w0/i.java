/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.w0.e;
import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.w0.h;
import com.github.catvod.spider.merge.w0.j;
import com.github.catvod.spider.merge.y.b;
import java.util.ArrayList;
import java.util.List;

public final class i
implements g {
    private final String a;
    private final List<j> b;

    public i(com.github.catvod.spider.merge.y.e a2) {
        this.a = ((com.github.catvod.spider.merge.y.e)a2).u("title").x("simpleText");
        a2 = ((com.github.catvod.spider.merge.y.e)a2).u("content");
        Object object = ((com.github.catvod.spider.merge.y.e)a2).keySet().iterator().next();
        boolean bl = ((String)object).contains("Movie");
        a2 = ((com.github.catvod.spider.merge.y.e)a2).u((String)object).t("items");
        this.b = new ArrayList<j>(((b)a2).size());
        for (int i2 = 0; i2 < ((b)a2).size(); ++i2) {
            object = ((b)a2).p(i2);
            String string = ((com.github.catvod.spider.merge.y.e)object).keySet().iterator().next();
            ((ArrayList)this.b).add(new j(((com.github.catvod.spider.merge.y.e)object).u(string), bl));
        }
    }

    @Override
    public final j a() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String c() {
        return this.a;
    }

    @Override
    public final int d() {
        return 4;
    }

    @Override
    public final e f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final h g() {
        throw new UnsupportedOperationException();
    }
}

